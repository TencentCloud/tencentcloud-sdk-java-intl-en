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
     *This API is used to create a Tencent Cloud service credential.
     * @param req CreateProductSecretRequest
     * @return CreateProductSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductSecretResponse CreateProductSecret(CreateProductSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProductSecret", CreateProductSecretResponse.class);
    }

    /**
     *This API is used to create a secret that hosts SSH keys.
     * @param req CreateSSHKeyPairSecretRequest
     * @return CreateSSHKeyPairSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSHKeyPairSecretResponse CreateSSHKeyPairSecret(CreateSSHKeyPairSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSSHKeyPairSecret", CreateSSHKeyPairSecretResponse.class);
    }

    /**
     *This API is used to create a KMS-encrypted Secret. You can create and store up to 1,000 Secrets in each region.
     * @param req CreateSecretRequest
     * @return CreateSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecretResponse CreateSecret(CreateSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecret", CreateSecretResponse.class);
    }

    /**
     *This API is used to delete a Secret. You can set whether to delete the Secret immediately or on schedule using the `RecoveryWindowInDays` parameter. For a Secret to be deleted on schedule, its status will be `PendingDelete` before the scheduled deletion time. You can use `RestoreSecret` to restore a deleted Secret during this time. A deleted Secret will not be restorable after the scheduled deletion time. A Secret can only be deleted after being disabled using `DisableSecret`.
     * @param req DeleteSecretRequest
     * @return DeleteSecretResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretResponse DeleteSecret(DeleteSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecret", DeleteSecretResponse.class);
    }

    /**
     *This API is used to directly delete a single credential version under the specified credential. The deletion takes effect immediately, and the credential version in all status can be deleted.
This API is only applicable to user-defined credentials but not Tencent Cloud service credentials.
     * @param req DeleteSecretVersionRequest
     * @return DeleteSecretVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretVersionResponse DeleteSecretVersion(DeleteSecretVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecretVersion", DeleteSecretVersionResponse.class);
    }

    /**
     *This API is used to query the execution result of an async task.
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *This API is used to query the details of a credential rotation policy.
This API is only applicable to Tencent Cloud service credentials.
     * @param req DescribeRotationDetailRequest
     * @return DescribeRotationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRotationDetailResponse DescribeRotationDetail(DescribeRotationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRotationDetail", DescribeRotationDetailResponse.class);
    }

    /**
     *This API is used to query the historical versions of a rotated credential.
This API is only applicable to Tencent Cloud service credentials.
     * @param req DescribeRotationHistoryRequest
     * @return DescribeRotationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRotationHistoryResponse DescribeRotationHistory(DescribeRotationHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRotationHistory", DescribeRotationHistoryResponse.class);
    }

    /**
     *This API is used to obtain the detailed attribute information of a Secret.
     * @param req DescribeSecretRequest
     * @return DescribeSecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretResponse DescribeSecret(DescribeSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecret", DescribeSecretResponse.class);
    }

    /**
     *This API is used to query the list of supported Tencent Cloud services.
     * @param req DescribeSupportedProductsRequest
     * @return DescribeSupportedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedProductsResponse DescribeSupportedProducts(DescribeSupportedProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedProducts", DescribeSupportedProductsResponse.class);
    }

    /**
     *This API is used to disable a Secret and will change its status to `Disabled`. The plaintext of a disabled Secret cannot be obtained through APIs.
     * @param req DisableSecretRequest
     * @return DisableSecretResponse
     * @throws TencentCloudSDKException
     */
    public DisableSecretResponse DisableSecret(DisableSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableSecret", DisableSecretResponse.class);
    }

    /**
     *This API is used to enable a Secret and will change its status to `Enabled`. You can call the `GetSecretValue` API to obtain the plaintext of this Secret. Secrets in `PendingDelete` status can only be enabled after being restored by using `RestoreSecret`.
     * @param req EnableSecretRequest
     * @return EnableSecretResponse
     * @throws TencentCloudSDKException
     */
    public EnableSecretResponse EnableSecret(EnableSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSecret", EnableSecretResponse.class);
    }

    /**
     *This API is used to obtain the list of regions displayed on Console.
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRegions", GetRegionsResponse.class);
    }

    /**
     *This API is used to obtain the plaintext value of the SSH key secret.
     * @param req GetSSHKeyPairValueRequest
     * @return GetSSHKeyPairValueResponse
     * @throws TencentCloudSDKException
     */
    public GetSSHKeyPairValueResponse GetSSHKeyPairValue(GetSSHKeyPairValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSSHKeyPairValue", GetSSHKeyPairValueResponse.class);
    }

    /**
     *For user-defined credentials, this API is used to get the plaintext information of a credential by specifying the credential name and version.
For Tencent Cloud service credentials such as MySQL credentials, this API is used to get the plaintext information of a previously rotated credential by specifying the credential name and historical version number. If you want to get the plaintext of the credential version currently in use, you need to specify the version number as `SSM_Current`.
     * @param req GetSecretValueRequest
     * @return GetSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public GetSecretValueResponse GetSecretValue(GetSecretValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSecretValue", GetSecretValueResponse.class);
    }

    /**
     *This API is used to obtain the SecretsManager service status of a user.
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetServiceStatus", GetServiceStatusResponse.class);
    }

    /**
     *This API is used to obtain list of versions of a Secret.
     * @param req ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretVersionIdsResponse ListSecretVersionIds(ListSecretVersionIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSecretVersionIds", ListSecretVersionIdsResponse.class);
    }

    /**
     *This API is used to obtain the detailed information list of all Secrets. You can specify the filter fields and sorting order as needed.
     * @param req ListSecretsRequest
     * @return ListSecretsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretsResponse ListSecrets(ListSecretsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSecrets", ListSecretsResponse.class);
    }

    /**
     *This API adds the new version of the credential content under the specified credential. One credential can have up to 10 versions. New versions can be added to credentials only in `Enabled` or `Disabled` status.
This API is only applicable to user-defined credentials but not Tencent Cloud service credentials.
     * @param req PutSecretValueRequest
     * @return PutSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public PutSecretValueResponse PutSecretValue(PutSecretValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutSecretValue", PutSecretValueResponse.class);
    }

    /**
     *This API is used to restore a `PendingDelete` Secret, canceling its scheduled deletion. The restored Secret will be in `Disabled` status. You can call the `EnableSecret` API to enable this Secret again.
     * @param req RestoreSecretRequest
     * @return RestoreSecretResponse
     * @throws TencentCloudSDKException
     */
    public RestoreSecretResponse RestoreSecret(RestoreSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreSecret", RestoreSecretResponse.class);
    }

    /**
     *This API is used to rotate secrets for Tencent Cloud services or Tencent Cloud API key pairs.
Note that only the secrets with the "Enabled" status can be rotated.
     * @param req RotateProductSecretRequest
     * @return RotateProductSecretResponse
     * @throws TencentCloudSDKException
     */
    public RotateProductSecretResponse RotateProductSecret(RotateProductSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RotateProductSecret", RotateProductSecretResponse.class);
    }

    /**
     *This API is used to update the description of a Secret. This API can only update Secrets in `Enabled` or `Disabled` status.
     * @param req UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDescriptionResponse UpdateDescription(UpdateDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDescription", UpdateDescriptionResponse.class);
    }

    /**
     *This API is used to set a Tencent Cloud service credential rotation policy, including the following parameters:
Specifies whether to enable rotation
Rotation frequency
Rotation start time
     * @param req UpdateRotationStatusRequest
     * @return UpdateRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRotationStatusResponse UpdateRotationStatus(UpdateRotationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRotationStatus", UpdateRotationStatusResponse.class);
    }

    /**
     *This API is used to update the credential content of the specified credential name and version number. Calling this API will encrypt the content of the new credential and overwrite the old content. Only credentials in `Enabled` or `Disabled` status can be updated.
This API is only applicable to user-defined credentials but not Tencent Cloud service credentials.
     * @param req UpdateSecretRequest
     * @return UpdateSecretResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSecretResponse UpdateSecret(UpdateSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSecret", UpdateSecretResponse.class);
    }

}
