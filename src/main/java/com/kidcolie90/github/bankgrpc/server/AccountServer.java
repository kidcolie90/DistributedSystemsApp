package com.kidcolie90.github.bankgrpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AccountServer {


    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("i am gRPC account server - send me your info to open an account");

        Server server = ServerBuilder.forPort(50052)
                .addService(new OpenAccountImpl())
                .build();

        server.start();

        server.awaitTermination();

        Runtime.getRuntime().addShutdownHook(new Thread(  () -> {
                System.out.println("received shut down rec");

                server.shutdown();

        } ));





    }



}
