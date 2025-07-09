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
package com.tencentcloudapi.vod.v20240718;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vod.v20240718.models.*;

public class VodClient extends AbstractClient{
    private static String endpoint = "vod.intl.tencentcloudapi.com";
    private static String service = "vod";
    private static String version = "2024-07-18";

    public VodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VodClient(Credential credential, String region, ClientProfile profile) {
        super(VodClient.endpoint, VodClient.version, credential, region, profile);
    }

    /**
     *Create an incremental migration strategy for the storage of the professional application.
     * @param req CreateIncrementalMigrationStrategyRequest
     * @return CreateIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncrementalMigrationStrategyResponse CreateIncrementalMigrationStrategy(CreateIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncrementalMigrationStrategy", CreateIncrementalMigrationStrategyResponse.class);
    }

    /**
     *This API is used to create storage for professional applications.

Note:
- This API is exclusively for professional applications.
- When a customer creates a VOD professional application, the system automatically enables storage in certain regions by default. If the customer needs to enable storage in other regions, they can do so using this API.
- All storage regions and the regions where storage have already been enabled can be queried using the [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) API.
     * @param req CreateStorageRequest
     * @return CreateStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageResponse CreateStorage(CreateStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorage", CreateStorageResponse.class);
    }

    /**
     *The API is used to generate access credentials for VOD professional applications, such as generating credentials for client uploads.
     * @param req CreateStorageCredentialsRequest
     * @return CreateStorageCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageCredentialsResponse CreateStorageCredentials(CreateStorageCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorageCredentials", CreateStorageCredentialsResponse.class);
    }

    /**
     *Delete the incremental migration strategy.
     * @param req DeleteIncrementalMigrationStrategyRequest
     * @return DeleteIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIncrementalMigrationStrategyResponse DeleteIncrementalMigrationStrategy(DeleteIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIncrementalMigrationStrategy", DeleteIncrementalMigrationStrategyResponse.class);
    }

    /**
     *Describe the information of the incremental migration strategy.
     * @param req DescribeIncrementalMigrationStrategyInfosRequest
     * @return DescribeIncrementalMigrationStrategyInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementalMigrationStrategyInfosResponse DescribeIncrementalMigrationStrategyInfos(DescribeIncrementalMigrationStrategyInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementalMigrationStrategyInfos", DescribeIncrementalMigrationStrategyInfosResponse.class);
    }

    /**
     *This API is used to query bucket information in the professional application, and it also supports paginated queries.
Note:
- This API is exclusively for use in the professional application.
     * @param req DescribeStorageRequest
     * @return DescribeStorageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageResponse DescribeStorage(DescribeStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorage", DescribeStorageResponse.class);
    }

    /**
     *Modify the information of incremental migration strategy.
     * @param req ModifyIncrementalMigrationStrategyRequest
     * @return ModifyIncrementalMigrationStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIncrementalMigrationStrategyResponse ModifyIncrementalMigrationStrategy(ModifyIncrementalMigrationStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIncrementalMigrationStrategy", ModifyIncrementalMigrationStrategyResponse.class);
    }

}
