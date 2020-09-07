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
     *This API is used to archive keys. The archived keys can only be used for decryption but not encryption.
     * @param req ArchiveKeyRequest
     * @return ArchiveKeyResponse
     * @throws TencentCloudSDKException
     */
    public ArchiveKeyResponse ArchiveKey(ArchiveKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ArchiveKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ArchiveKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ArchiveKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to decrypt data with the specified private key that is encrypted with RSA asymmetric cryptographic algorithm. The ciphertext must be encrypted with the corresponding public key. The asymmetric key must be in `Enabled` state for decryption.
     * @param req AsymmetricRsaDecryptRequest
     * @return AsymmetricRsaDecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricRsaDecryptResponse AsymmetricRsaDecrypt(AsymmetricRsaDecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsymmetricRsaDecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricRsaDecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AsymmetricRsaDecrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to decrypt data with the specified private key that is encrypted with SM2 asymmetric cryptographic algorithm. The ciphertext must be encrypted with the corresponding public key. The asymmetric key must be in `Enabled` state for decryption. The length of the ciphertext passed in cannot exceed 256 bytes.
     * @param req AsymmetricSm2DecryptRequest
     * @return AsymmetricSm2DecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricSm2DecryptResponse AsymmetricSm2Decrypt(AsymmetricSm2DecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsymmetricSm2DecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricSm2DecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AsymmetricSm2Decrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bind a key with a Tencent Cloud resource. If the key has been set to be expired automatically, the setting will be canceled to ensure that the key will not be invalid automatically. If the key and the resource has already been bound, the call will still be successful.
     * @param req BindCloudResourceRequest
     * @return BindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudResourceResponse BindCloudResource(BindCloudResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindCloudResourceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindCloudResourceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindCloudResource"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unarchive keys. If a key is unarchived, its status will be `Enabled`.
     * @param req CancelKeyArchiveRequest
     * @return CancelKeyArchiveResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyArchiveResponse CancelKeyArchive(CancelKeyArchiveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelKeyArchiveResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKeyArchiveResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelKeyArchive"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Cancel the scheduled deletion of CMK
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
     *Create a master key CMK (Custom Master Key) for user management data keys
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
     *This API is used to create a white-box key. Up to 50 ones can be created.
     * @param req CreateWhiteBoxKeyRequest
     * @return CreateWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteBoxKeyResponse CreateWhiteBoxKey(CreateWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to decrypt the ciphertext and obtain the plaintext data.
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
     *This API is used to delete a white-box key. Note: only disabled white-box keys can be deleted.
     * @param req DeleteWhiteBoxKeyRequest
     * @return DeleteWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhiteBoxKeyResponse DeleteWhiteBoxKey(DeleteWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the attribute details of the CMK with a specified `KeyId`.
     * @param req DescribeKeyRequest
     * @return DescribeKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyResponse DescribeKey(DescribeKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the attribute information of CMKs in batches.
     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a white-box decryption key.
     * @param req DescribeWhiteBoxDecryptKeyRequest
     * @return DescribeWhiteBoxDecryptKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDecryptKeyResponse DescribeWhiteBoxDecryptKey(DescribeWhiteBoxDecryptKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxDecryptKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxDecryptKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxDecryptKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the device fingerprint list of a specified key.
     * @param req DescribeWhiteBoxDeviceFingerprintsRequest
     * @return DescribeWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDeviceFingerprintsResponse DescribeWhiteBoxDeviceFingerprints(DescribeWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxDeviceFingerprintsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxDeviceFingerprintsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxDeviceFingerprints"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to display white-box key information.
     * @param req DescribeWhiteBoxKeyRequest
     * @return DescribeWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyResponse DescribeWhiteBoxKey(DescribeWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the white-box key list.
     * @param req DescribeWhiteBoxKeyDetailsRequest
     * @return DescribeWhiteBoxKeyDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyDetailsResponse DescribeWhiteBoxKeyDetails(DescribeWhiteBoxKeyDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxKeyDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxKeyDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the white-box key service status.
     * @param req DescribeWhiteBoxServiceStatusRequest
     * @return DescribeWhiteBoxServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxServiceStatusResponse DescribeWhiteBoxServiceStatus(DescribeWhiteBoxServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxServiceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxServiceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxServiceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable a master key. The disabled key cannot be used for encryption and decryption operations.
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
     *Disabled key rotation for the specified CMK.
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
     *This API is used to batch prohibit the use of CMK.
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
     *This API is used to disable a white-box key.
     * @param req DisableWhiteBoxKeyRequest
     * @return DisableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeyResponse DisableWhiteBoxKey(DisableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable white-box keys in batches.
     * @param req DisableWhiteBoxKeysRequest
     * @return DisableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeysResponse DisableWhiteBoxKeys(DisableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWhiteBoxKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWhiteBoxKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Enable a specified CMK.
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
     *Turn on the key rotation function for the specified CMK.
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
     *This API is used to enable CMK in batches.
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
     *This API is used to enable a white-box key.
     * @param req EnableWhiteBoxKeyRequest
     * @return EnableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeyResponse EnableWhiteBoxKey(EnableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable white-box keys in batches.
     * @param req EnableWhiteBoxKeysRequest
     * @return EnableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeysResponse EnableWhiteBoxKeys(EnableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWhiteBoxKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWhiteBoxKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to encrypt any data up to 4KB. It can be used to encrypt database passwords, RSA Key, or other small sensitive information. For application data encryption, use the DataKey generated by GenerateDataKey to perform local data encryption and decryption operations
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
     *This API is used to encrypt data with a white-box key.
     * @param req EncryptByWhiteBoxRequest
     * @return EncryptByWhiteBoxResponse
     * @throws TencentCloudSDKException
     */
    public EncryptByWhiteBoxResponse EncryptByWhiteBox(EncryptByWhiteBoxRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EncryptByWhiteBoxResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptByWhiteBoxResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EncryptByWhiteBox"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API generates a data key, which you can use to encrypt local data.
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
     *Query whether the specified CMK has the key rotation function.
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
     *This API is used to get the information of the public key that is encrypted with the asymmetric cryptographic algorithm and of which the `KeyUsage` is `ASYMMETRIC_DECRYPT_RSA_2048` or `ASYMMETRIC_DECRYPT_SM2`. This public key can be used to encrypt data locally, and the data encrypted with it can only be decrypted with the corresponding private key through KMS. The public key can only be obtained from the asymmetric key in `Enabled` state.
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPublicKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPublicKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPublicKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the list of supported regions.
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Used to query whether the user has activated the KMS service.
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
     *This API is used to list the encryption methods supported in the current region.
     * @param req ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     * @throws TencentCloudSDKException
     */
    public ListAlgorithmsResponse ListAlgorithms(ListAlgorithmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAlgorithmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAlgorithmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAlgorithms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Get the master key list details according to the specified Offset and Limit.
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
     *This API is used to overwrite the device fingerprint information of a specified key.
     * @param req OverwriteWhiteBoxDeviceFingerprintsRequest
     * @return OverwriteWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public OverwriteWhiteBoxDeviceFingerprintsResponse OverwriteWhiteBoxDeviceFingerprints(OverwriteWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OverwriteWhiteBoxDeviceFingerprintsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OverwriteWhiteBoxDeviceFingerprintsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OverwriteWhiteBoxDeviceFingerprints"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Re-encrypt the ciphertext using the specified CMK.
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
     *CMK planned deletion API, used to specify the time of CMK deletion, the optional time interval is [7,30] days
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
     *This API is used to unbind a key with a Tencent Cloud resource, indicating that the Tencent Cloud resource will not use the key any longer.
     * @param req UnbindCloudResourceRequest
     * @return UnbindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudResourceResponse UnbindCloudResource(UnbindCloudResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindCloudResourceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindCloudResourceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindCloudResource"), type);
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
