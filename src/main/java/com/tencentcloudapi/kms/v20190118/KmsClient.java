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
package com.tencentcloudapi.kms.v20190118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.kms.v20190118.models.*;

public class KmsClient extends AbstractClient{
    private static String endpoint = "kms.tencentcloudapi.com";
    private static String version = "2019-01-18";

    public KmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public KmsClient(Credential credential, String region, ClientProfile profile) {
        super(KmsClient.endpoint, KmsClient.version, credential, region, profile);
    }

    /**
     *取消CMK的计划删除操作
     * @param req CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyDeletionResponse CancelKeyDeletion(CancelKeyDeletionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelKeyDeletionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKeyDeletionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelKeyDeletion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户管理数据密钥的主密钥CMK（Custom Master Key）。
     * @param req CreateKeyRequest
     * @return CreateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyResponse CreateKey(CreateKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于解密密文，得到明文数据。
     * @param req DecryptRequest
     * @return DecryptResponse
     * @throws TencentCloudSDKException
     */
    public DecryptResponse Decrypt(DecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Decrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the imported key material. It is only valid for EXTERNAL CMKs. Specifically, it puts a CMK into `PendingImport` status instead of deleting the CMK, so that the CMK can be used again after key material is reimported. To delete the CMK completely, please call the `ScheduleKeyDeletion` API.
     * @param req DeleteImportedKeyMaterialRequest
     * @return DeleteImportedKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImportedKeyMaterialResponse DeleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImportedKeyMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImportedKeyMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImportedKeyMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于禁用一个主密钥，处于禁用状态的Key无法用于加密、解密操作。
     * @param req DisableKeyRequest
     * @return DisableKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyResponse DisableKey(DisableKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对指定的CMK禁止密钥轮换功能。
     * @param req DisableKeyRotationRequest
     * @return DisableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyRotationResponse DisableKeyRotation(DisableKeyRotationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeyRotationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyRotationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKeyRotation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量禁止CMK的使用。
     * @param req DisableKeysRequest
     * @return DisableKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeysResponse DisableKeys(DisableKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于启用一个指定的CMK。
     * @param req EnableKeyRequest
     * @return EnableKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyResponse EnableKey(EnableKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对指定的CMK开启密钥轮换功能。
     * @param req EnableKeyRotationRequest
     * @return EnableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyRotationResponse EnableKeyRotation(EnableKeyRotationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeyRotationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyRotationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKeyRotation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量启用CMK。
     * @param req EnableKeysRequest
     * @return EnableKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeysResponse EnableKeys(EnableKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于加密最多为4KB任意数据，可用于加密数据库密码，RSA Key，或其它较小的敏感信息。对于应用的数据加密，使用GenerateDataKey生成的DataKey进行本地数据的加解密操作
     * @param req EncryptRequest
     * @return EncryptResponse
     * @throws TencentCloudSDKException
     */
    public EncryptResponse Encrypt(EncryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EncryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Encrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口生成一个数据密钥，您可以用这个密钥进行本地数据的加密。
     * @param req GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDataKeyResponse GenerateDataKey(GenerateDataKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateDataKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateDataKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateDataKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate a random number.
     * @param req GenerateRandomRequest
     * @return GenerateRandomResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRandomResponse GenerateRandom(GenerateRandomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateRandomResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateRandomResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateRandom"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定的CMK是否开启了密钥轮换功能。
     * @param req GetKeyRotationStatusRequest
     * @return GetKeyRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetKeyRotationStatusResponse GetKeyRotationStatus(GetKeyRotationStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetKeyRotationStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetKeyRotationStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetKeyRotationStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the parameters of the material to be imported into a CMK. The returned `Token` is used as one of the parameters to execute `ImportKeyMaterial`, and the returned `PublicKey` is used to encrypt the key material. The `Token` and `PublicKey` are valid for 24 hours. If they are expired, you will need to call the API again to get a new `Token` and `PublicKey`.
     * @param req GetParametersForImportRequest
     * @return GetParametersForImportResponse
     * @throws TencentCloudSDKException
     */
    public GetParametersForImportResponse GetParametersForImport(GetParametersForImportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetParametersForImportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetParametersForImportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetParametersForImport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询该用户是否已开通KMS服务
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetServiceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetServiceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to import key material into an EXTERNAL CMK. The key obtained through the `GetParametersForImport` API is used to encrypt the key material. You can only reimport the same key material into the specified CMK and set a new expiration time. After the CMK key material is imported, it cannot be replaced. After the key material is expired or deleted, the CMK will remain unavailable until the same key material is reimported. CMKs are independent, which means that the same key material can be imported into different CMKs, but data encrypted by one CMK cannot be decrypted by another one.
Key material can only be imported into CMKs in `Enabled` and `PendingImport` status.
     * @param req ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyMaterialResponse ImportKeyMaterial(ImportKeyMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportKeyMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportKeyMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据指定Offset和Limit获取主密钥列表详情。
     * @param req ListKeyDetailRequest
     * @return ListKeyDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyDetailResponse ListKeyDetail(ListKeyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListKeyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListKeyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list the KeyIds of CMKs in `Enabled`, `Disabled`, and `PendingImport` status under the account.
     * @param req ListKeysRequest
     * @return ListKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListKeysResponse ListKeys(ListKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用指定CMK对密文重新加密。
     * @param req ReEncryptRequest
     * @return ReEncryptResponse
     * @throws TencentCloudSDKException
     */
    public ReEncryptResponse ReEncrypt(ReEncryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReEncryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReEncryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReEncrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CMK计划删除接口，用于指定CMK删除的时间，可选时间区间为[7,30]天
     * @param req ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public ScheduleKeyDeletionResponse ScheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScheduleKeyDeletionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ScheduleKeyDeletionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ScheduleKeyDeletion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the alias of a CMK. CMKs in `PendingDelete` status cannot be modified.
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the description of the specified CMK. CMKs in `PendingDelete` status cannot be modified.
     * @param req UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateKeyDescriptionResponse UpdateKeyDescription(UpdateKeyDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateKeyDescriptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateKeyDescriptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateKeyDescription"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
