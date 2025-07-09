/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tbaas.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tbaas.v20180416.models.*;

public class TbaasClient extends AbstractClient{
    private static String endpoint = "tbaas.intl.tencentcloudapi.com";
    private static String service = "tbaas";
    private static String version = "2018-04-16";

    public TbaasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TbaasClient(Credential credential, String region, ClientProfile profile) {
        super(TbaasClient.endpoint, TbaasClient.version, credential, region, profile);
    }

    /**
     *This API is used to retrieve the detailed information of a block in Fabric.
     * @param req DescribeFabricBlockRequest
     * @return DescribeFabricBlockResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFabricBlockResponse DescribeFabricBlock(DescribeFabricBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFabricBlock", DescribeFabricBlockResponse.class);
    }

    /**
     *This API is used to obtain detailed information of Fabric transactions.
     * @param req DescribeFabricTransactionRequest
     * @return DescribeFabricTransactionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFabricTransactionResponse DescribeFabricTransaction(DescribeFabricTransactionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFabricTransaction", DescribeFabricTransactionResponse.class);
    }

    /**
     *This API is used to call a Fabric user contract to execute a transaction.
     * @param req InvokeFabricChaincodeRequest
     * @return InvokeFabricChaincodeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeFabricChaincodeResponse InvokeFabricChaincode(InvokeFabricChaincodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeFabricChaincode", InvokeFabricChaincodeResponse.class);
    }

    /**
     *This API is used to make a user contract call in Fabric for querying.
     * @param req QueryFabricChaincodeRequest
     * @return QueryFabricChaincodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryFabricChaincodeResponse QueryFabricChaincode(QueryFabricChaincodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryFabricChaincode", QueryFabricChaincodeResponse.class);
    }

}
