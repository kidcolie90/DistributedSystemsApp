package com.kidcolie90.github.bankgrpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class WelcomeServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hi, Welcome to the gRPC Bank");

        Server server = ServerBuilder.forPort(50051)
                .addService(new GreetServiceImpl())
                .build(); //builing server on port 50051

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            System.out.println("ShutDown Req Noted");
                    server.shutdown(); //shuts down the server and allows triggers "server.awaittermination to run"
                    System.out.println("server shutdown");

        }));

        server.awaitTermination(); //ensures application does not terminate on run after server shutdown request received and prog has completed


    }
}
