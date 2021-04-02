package com.kidcolie90.github.bankgrpc.client;

import com.proto.greet.*;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.*;

public class GreetingClient {


    public static void main(String[] args) {
        System.out.println("Welcome to the GRPC Bank");
        GreetingClient main = new GreetingClient(); //creates a new greeting client
        main.run(); //runs the run function containing the other things we want to happen on greet

    }


            public void run(){

                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                        .usePlaintext() //forces ssl to be disabled for development
                        .build();

                UnaryCall(channel);
                PromoStreamCall(channel);

                channel.shutdown();


    }

    private void UnaryCall(ManagedChannel channel){

        //used to generate proto's and run intiial tests and as template to remeber how to do blocking stubs, no longer use
        // DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel); // created synchronos client using static method new blocking stub and passing in channel



        //Creation Gservice Client
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);



        //created protobuf greeting message

        Scanner myObj = new Scanner(System.in);

        // Greeting greeting = Greeting.newBuilder()
        System.out.println("Hi there, please give us the name on your account: ");
        String firstName = myObj.nextLine();
        System.out.println("please confirm your last name: ");
        String lastName = myObj.nextLine();
        //    .build();

        Greeting greeting = Greeting.newBuilder().setFirstName(firstName).setLastName(lastName).build();

        GreetRequest greetRequest = GreetRequest.newBuilder().setGreeting(greeting).build();

        //  GreetRequest greetRequest = GreetRequest.newBuilder()
        //        .setGreeting(greeting)
        //      .build();

        //calling RPC and getting GreetREsponse


        GreetResponse greetResponse;
        greetResponse = greetClient.greet(greetRequest);


        System.out.println (greetResponse.getResult());





    }

    private void PromoStreamCall(ManagedChannel channel){


        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);





        // server streaming


        PromoStreamRequest promoStreamRequest =
                PromoStreamRequest.newBuilder()
                        .setPromo1("promo1")
                        .setPromo2("promo2")
                        .setPromo3("promo3")
                        .setPromo4("")
                        .setPromo5("")
                        .setPromo6("")
                        .setPromo7("")
                        .build();


        greetClient.promoStream(promoStreamRequest)
                .forEachRemaining(PromoStreamResponse ->{
                    System.out.println(PromoStreamResponse.getPromo1());

                });
        greetClient.promoStream(promoStreamRequest)
                .forEachRemaining(PromoStreamResponse ->{

                    System.out.println(PromoStreamResponse.getPromo2());

                });

        greetClient.promoStream(promoStreamRequest)
                .forEachRemaining(PromoStreamResponse ->{

                    System.out.println(PromoStreamResponse.getPromo3());

                });

        greetClient.promoStream(promoStreamRequest)
                .forEachRemaining(PromoStreamResponse ->{

                    System.out.println(PromoStreamResponse.getPromo4());

                });

        greetClient.promoStream(promoStreamRequest)
                .forEachRemaining(PromoStreamResponse ->{

                    System.out.println(PromoStreamResponse.getPromo5());

                });









    }


}


