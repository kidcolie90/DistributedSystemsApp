package com.kidcolie90.github.bankgrpc.server;

import com.proto.account.*;
import io.grpc.stub.StreamObserver;

public class OpenAccountImpl extends OpenAccountGrpc.OpenAccountImplBase {
    @Override

    //stream observer to handle multiple requests and return them to server 1x1 (asynchronus)
    public StreamObserver<MultiAccountRequest> multiAccount(StreamObserver<MultiAccountResponse> responseObserver) {

        StreamObserver<MultiAccountRequest> streamObserverOfRequest = new StreamObserver<MultiAccountRequest>(){


            String result = "";


            @Override
            public void onNext(MultiAccountRequest value) { //Client sends a message, incrementing name and acc type to the result string each time
            result = "Thank you for your request to open a new account of type " +value.getAccountInfo().getType()
            + value.getAccountInfo().getName();
            }

            @Override
            public void onError(Throwable t) { //client sends an error

            }

            @Override
            public void onCompleted() { //client is done sending messages

                responseObserver.onNext(
                        MultiAccountResponse.newBuilder()
                        .setResult(result)
                        .build()


                );

            }
        };


        return streamObserverOfRequest; //returning the stream observer we declared above
    }

    /*@Override
    public void account(AccountRequest request, StreamObserver<AccountResponse> responseObserver) {

        AccountInfo accountRequest = request.getAccountInfo();
        String name = request.getAccountInfo().getName();
        String type = request.getAccountInfo().getType();
        String address = request.getAccountInfo().getAddress();
        int age = request.getAccountInfo().getAge();


        String result = "you have opend an account of " + Type;

        AccountResponse response = AccountResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }*/



}
