package com.kidcolie90.github.bankgrpc.client;

import com.proto.account.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AccountClient {


    public static void main(String[] args) {
        AccountClient main = new AccountClient();
        main.run();
    }



    public void run() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localHost",50052) //setting up channel
                .usePlaintext()
                .build();

        doClientStreamingCall(channel);

        System.out.println("shutting down Multi Account process");
        channel.shutdown();

    }
  private void doClientStreamingCall(ManagedChannel channel){


        OpenAccountGrpc.OpenAccountStub aSyncClient = OpenAccountGrpc.newStub(channel);
        //below created obj called requestObserver to pass massages too - asyncClient then responds based on what is received


      CountDownLatch latch = new CountDownLatch(1); //creating a latch to allow blocking on async client

             StreamObserver<MultiAccountRequest> requestObserver =   aSyncClient.multiAccount(new StreamObserver<MultiAccountResponse>() {
                    @Override
                    public void onNext(MultiAccountResponse value) { //get a response from server (on next called only once)
                    System.out.println("Server Response Recieved");
                    System.out.println(value.getResult());
                    }

                    @Override
                    public void onError(Throwable t) { //get an error from server

                    }

                    @Override
                    public void onCompleted() { // no more messages from server (called after on next)
                        System.out.println("Server Completed Sending Message");
                        latch.countDown();
                    }
                });

            System.out.println("sending first bank account message");
             requestObserver.onNext(MultiAccountRequest.newBuilder() //Client Stream 1

                     .setAccountInfo(AccountInfo.newBuilder()
                     .setName("Jack")
                     .setAge(20)
                     .setAddress("1111 MoonRoad Dublin")
                     .setType("Crypto")
                     .build())
                     .build());

             System.out.println("sending second bank opening message");
      requestObserver.onNext(MultiAccountRequest.newBuilder() //Client Stream 2
              .setAccountInfo(AccountInfo.newBuilder()
                      .setName("Rick Grimes")
                      .setAge(50)
                      .setAddress("The Prison")
                      .setType("RainyDay Fund")
                      .build())
              .build());
      System.out.println("sending third bank opening message");
      requestObserver.onNext(MultiAccountRequest.newBuilder() //Client Stream 3
              .setAccountInfo(AccountInfo.newBuilder()
                      .setName("Odin")
                      .setAge(5000)
                      .setAddress("Valhalla")
                      .setType("Retirement Saver")
                      .build())
              .build());
      System.out.println("sending fourth bank opening message");
      requestObserver.onNext(MultiAccountRequest.newBuilder() //Client Stream 4
              .setAccountInfo(AccountInfo.newBuilder()
                      .setName("Tony Stark")
                      .setAge(43)
                      .setAddress("Avenger HQ")
                      .setType("Current Account")
                      .build())
              .build());

      requestObserver.onCompleted(); //tells server client is done sending messages so response can be sent, server only responds after onComplete

      try {
          latch.await(3L, TimeUnit.SECONDS); //latch timing out after three seconds
      } catch (InterruptedException e) {
          e.printStackTrace();
      }


  }


   /* public static void main(String[] args) { old code not used anymore, creating urany request/response messages



        OpenAccountGrpc.OpenAccountBlockingStub accountClient = OpenAccountGrpc.newBlockingStub(channel);

        AccountInfo accountInfo = AccountInfo.newBuilder()
                .setName("joe")
                .setAddress("41 fake street")
                .setAge(41)
                .setType("saver")
                .build();

        AccountRequest request = com.proto.account.AccountRequest.newBuilder()
                .setAccountInfo(accountInfo)
                .build();


        AccountResponse accountResponse =  accountClient.account( request);
        
             System.out.println(accountResponse.getResult());

    }*/



}
