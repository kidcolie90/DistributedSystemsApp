package com.kidcolie90.github.bankgrpc.server;

import com.proto.account.AccountRequest;
import com.proto.account.AccountResponse;
import com.proto.account.OpenAccountGrpc;
import com.proto.account.AccountInfo;
import io.grpc.stub.StreamObserver;

public class OpenAccountImpl extends OpenAccountGrpc.OpenAccountImplBase {

    @Override
    public void account(AccountRequest request, StreamObserver<AccountResponse> responseObserver) {

        AccountInfo accountRequest = request.getAccountInfo();
        String name = request.getAccountInfo().getName();
        String type = request.getAccountInfo().getType();
        String address = request.getAccountInfo().getAddress();
        int age = request.getAccountInfo().getAge();


        String result = "you have opend an account of " +name;

        AccountResponse response = AccountResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
