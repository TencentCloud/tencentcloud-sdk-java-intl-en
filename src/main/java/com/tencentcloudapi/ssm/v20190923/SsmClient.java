/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ssm.v20190923;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssm.v20190923.models.*;

public class SsmClient extends AbstractClient{
    private static String endpoint = "ssm.tencentcloudapi.com";
    private static String service = "ssm";
    private static String version = "2019-09-23";

    public SsmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SsmClient(Credential credential, String region, ClientProfile profile) {
        super(SsmClient.endpoint, SsmClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a KMS-encrypted Secret. You can create and store up to 1,000 Secrets in each region.
     * @param req CreateSecretRequest
     * @return CreateSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecretResponse CreateSecret(CreateSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a Secret. You can set whether to delete the Secret immediately or on schedule using the `RecoveryWindowInDays` parameter. For a Secret to be deleted on schedule, its status will be `PendingDelete` before the scheduled deletion time. You can use `RestoreSecret` to restore a deleted Secret during this time. A deleted Secret will not be restorable after the scheduled deletion time. A Secret can only be deleted after being disabled using `DisableSecret`.
     * @param req DeleteSecretRequest
     * @return DeleteSecretResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretResponse DeleteSecret(DeleteSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a version of a Secret. The deletion takes effect immediately. Secret versions in any status can be deleted.
     * @param req DeleteSecretVersionRequest
     * @return DeleteSecretVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretVersionResponse DeleteSecretVersion(DeleteSecretVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecretVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecretVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecretVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the detailed attribute information of a Secret.
     * @param req DescribeSecretRequest
     * @return DescribeSecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretResponse DescribeSecret(DescribeSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a Secret and will change its status to `Disabled`. The plaintext of a disabled Secret cannot be obtained through APIs.
     * @param req DisableSecretRequest
     * @return DisableSecretResponse
     * @throws TencentCloudSDKException
     */
    public DisableSecretResponse DisableSecret(DisableSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable a Secret and will change its status to `Enabled`. You can call the `GetSecretValue` API to obtain the plaintext of this Secret. Secrets in `PendingDelete` status can only be enabled after being restored by using `RestoreSecret`.
     * @param req EnableSecretRequest
     * @return EnableSecretResponse
     * @throws TencentCloudSDKException
     */
    public EnableSecretResponse EnableSecret(EnableSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the list of regions displayed on Console.
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the plaintext of a specified Secret and version. Only plaintext of an enabled Secret can be obtained.
     * @param req GetSecretValueRequest
     * @return GetSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public GetSecretValueResponse GetSecretValue(GetSecretValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSecretValueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSecretValueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSecretValue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the SecretsManager service status of a user.
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetServiceStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetServiceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain list of versions of a Secret.
     * @param req ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretVersionIdsResponse ListSecretVersionIds(ListSecretVersionIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSecretVersionIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSecretVersionIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSecretVersionIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the detailed information list of all Secrets. You can specify the filter fields and sorting order as needed.
     * @param req ListSecretsRequest
     * @return ListSecretsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretsResponse ListSecrets(ListSecretsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSecretsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSecretsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSecrets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a new version to a specified Secret. Each Secret supports up to 10 versions. You can only add versions to Secrets in `Enabled` or `Disabled` status.
     * @param req PutSecretValueRequest
     * @return PutSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public PutSecretValueResponse PutSecretValue(PutSecretValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutSecretValueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutSecretValueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutSecretValue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restore a `PendingDelete` Secret, canceling its scheduled deletion. The restored Secret will be in `Disabled` status. You can call the `EnableSecret` API to enable this Secret again.
     * @param req RestoreSecretRequest
     * @return RestoreSecretResponse
     * @throws TencentCloudSDKException
     */
    public RestoreSecretResponse RestoreSecret(RestoreSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestoreSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestoreSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestoreSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the description of a Secret. This API can only update Secrets in `Enabled` or `Disabled` status.
     * @param req UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDescriptionResponse UpdateDescription(UpdateDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDescriptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the name and version ID of a Secret. Calling this API encrypts the new Secret content and overwrites the old content. This API can only update Secrets in `Enabled` or `Disabled` status.
     * @param req UpdateSecretRequest
     * @return UpdateSecretResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSecretResponse UpdateSecret(UpdateSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
