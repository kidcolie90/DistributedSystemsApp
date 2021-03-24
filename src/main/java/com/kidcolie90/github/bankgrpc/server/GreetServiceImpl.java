package com.kidcolie90.github.bankgrpc.server;

import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override //over riding greet method
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        super.greet(request, responseObserver);

        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName(); //getting user first name for greeting
        String result = "Welcome to the Ebank Experience "+firstName; // will be used for returning welcome message and users first name

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result) //building response and using response string in result var w users name
                .build();

        responseObserver.onNext(response); //server is asychronos so using response observe to return "response" to the client
        responseObserver.onCompleted(); //completed the response
    }
}
