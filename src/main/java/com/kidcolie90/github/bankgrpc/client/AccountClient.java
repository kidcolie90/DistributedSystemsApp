package com.kidcolie90.github.bankgrpc.client;

import com.proto.account.AccountInfo;
import com.proto.account.AccountRequest;
import com.proto.account.AccountResponse;
import com.proto.account.OpenAccountGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AccountClient {

    private static Object AccountRequest;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localHost",50052)
                .usePlaintext()
                .build();


        OpenAccountGrpc.OpenAccountBlockingStub accountClient = OpenAccountGrpc.newBlockingStub(channel);

        AccountInfo accountInfo = AccountInfo.newBuilder()
                .setName("joe")
                .setAddress("41 fake street")
                .setAge(41)
                .setType("saver")
                .build();

        AccountRequest request = com.proto.account.AccountRequest.newBuilder()

                .setAddress("41 fake street")
                .setAge(41)
                .setType("saver")
                .build();


     AccountResponse accountResponse =  accountClient.account((com.proto.account.AccountRequest) AccountRequest);
        
             System.out.println(accountResponse.getResult());

    }



}
