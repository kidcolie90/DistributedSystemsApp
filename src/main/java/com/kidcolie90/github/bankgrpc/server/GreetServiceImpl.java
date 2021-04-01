package com.kidcolie90.github.bankgrpc.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override //over riding greet method
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {


        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName(); //getting user first name for greeting
        String result = "Welcome to the Ebank Experience "+firstName; // will be used for returning welcome message and users first name

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result) //building response and using response string in result var w users name

                .build();

        responseObserver.onNext(response); //server is asychronos so using response observe to return "response" to the client
        responseObserver.onCompleted(); //completed the response
    }

    //server streaming the banks promo messages
    @Override
    public void promoStream(PromoStreamRequest request, StreamObserver<PromoStreamResponse> responseObserver) {
        //super.promoStream(request, responseObserver);

            String promo  = request.getPromo1(); String promo2 = request.getPromo2(); String promo3 = request.getPromo3();

            try{

                for (int i = 0; i < 3; i++){ //loop so we can show each promo 3 times on the promo stream request from the client side




                    PromoStreamResponse response = PromoStreamResponse.newBuilder()
                            .setPromo1("10% Cash Back on Ebank Mortages")
                            .setPromo2("Open an account today and get FREE AMAZON PRIME")
                            .setPromo3("Missed a repayment? Download our Ebook on being newly homeless")
                            .setPromo4("Ebank - No Card Charges!")
                            .setPromo5("Now accepting crypto")
                            .setPromo6("BitCoin!")
                            .setPromo7("Ebank - We'll take your money with a smile")
                            .build();

                    responseObserver.onNext(response);
                    Thread.sleep(1000);

                }


            }
            catch (InterruptedException e){ //try and catch error
                e.printStackTrace();
            }




           finally{ responseObserver.onCompleted();} //



    }
}
