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
    private static String service = "kms";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ArchiveKey", ArchiveKeyResponse.class);
    }

    /**
     *This API is used to decrypt data with the specified private key that is encrypted with RSA asymmetric cryptographic algorithm. The ciphertext must be encrypted with the corresponding public key. The asymmetric key must be in `Enabled` state for decryption.
     * @param req AsymmetricRsaDecryptRequest
     * @return AsymmetricRsaDecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricRsaDecryptResponse AsymmetricRsaDecrypt(AsymmetricRsaDecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AsymmetricRsaDecrypt", AsymmetricRsaDecryptResponse.class);
    }

    /**
     *This API is used to decrypt data with the specified private key that is encrypted with SM2 asymmetric cryptographic algorithm. The ciphertext must be encrypted with the corresponding public key. The asymmetric key must be in `Enabled` state for decryption. The length of the ciphertext passed in cannot exceed 256 bytes.
     * @param req AsymmetricSm2DecryptRequest
     * @return AsymmetricSm2DecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricSm2DecryptResponse AsymmetricSm2Decrypt(AsymmetricSm2DecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AsymmetricSm2Decrypt", AsymmetricSm2DecryptResponse.class);
    }

    /**
     *This API is used to bind a key with a Tencent Cloud resource. If the key has been set to be expired automatically, the setting will be canceled to ensure that the key will not be invalid automatically. If the key and the resource has already been bound, the call will still be successful.
     * @param req BindCloudResourceRequest
     * @return BindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudResourceResponse BindCloudResource(BindCloudResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudResource", BindCloudResourceResponse.class);
    }

    /**
     *This API is used to unarchive keys. If a key is unarchived, its status will be `Enabled`.
     * @param req CancelKeyArchiveRequest
     * @return CancelKeyArchiveResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyArchiveResponse CancelKeyArchive(CancelKeyArchiveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelKeyArchive", CancelKeyArchiveResponse.class);
    }

    /**
     *Cancel the scheduled deletion of CMK
     * @param req CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyDeletionResponse CancelKeyDeletion(CancelKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelKeyDeletion", CancelKeyDeletionResponse.class);
    }

    /**
     *Create a master key CMK (Custom Master Key) for user management data keys
     * @param req CreateKeyRequest
     * @return CreateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyResponse CreateKey(CreateKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKey", CreateKeyResponse.class);
    }

    /**
     *This API is used to create a white-box key. Up to 50 ones can be created.
     * @param req CreateWhiteBoxKeyRequest
     * @return CreateWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteBoxKeyResponse CreateWhiteBoxKey(CreateWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhiteBoxKey", CreateWhiteBoxKeyResponse.class);
    }

    /**
     *This API is used to decrypt the ciphertext and obtain the plaintext data.
     * @param req DecryptRequest
     * @return DecryptResponse
     * @throws TencentCloudSDKException
     */
    public DecryptResponse Decrypt(DecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Decrypt", DecryptResponse.class);
    }

    /**
     *This API is used to delete the imported key material. It is only valid for EXTERNAL CMKs. Specifically, it puts a CMK into `PendingImport` status instead of deleting the CMK, so that the CMK can be used again after key material is reimported. To delete the CMK completely, please call the `ScheduleKeyDeletion` API.
     * @param req DeleteImportedKeyMaterialRequest
     * @return DeleteImportedKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImportedKeyMaterialResponse DeleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImportedKeyMaterial", DeleteImportedKeyMaterialResponse.class);
    }

    /**
     *This API is used to delete a white-box key. Note: only disabled white-box keys can be deleted.
     * @param req DeleteWhiteBoxKeyRequest
     * @return DeleteWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhiteBoxKeyResponse DeleteWhiteBoxKey(DeleteWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWhiteBoxKey", DeleteWhiteBoxKeyResponse.class);
    }

    /**
     *This API is used to get the attribute details of the CMK with a specified `KeyId`.
     * @param req DescribeKeyRequest
     * @return DescribeKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyResponse DescribeKey(DescribeKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKey", DescribeKeyResponse.class);
    }

    /**
     *This API is used to get the attribute information of CMKs in batches.
     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeys", DescribeKeysResponse.class);
    }

    /**
     *This API is used to get a white-box decryption key.
     * @param req DescribeWhiteBoxDecryptKeyRequest
     * @return DescribeWhiteBoxDecryptKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDecryptKeyResponse DescribeWhiteBoxDecryptKey(DescribeWhiteBoxDecryptKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxDecryptKey", DescribeWhiteBoxDecryptKeyResponse.class);
    }

    /**
     *This API is used to get the device fingerprint list of a specified key.
     * @param req DescribeWhiteBoxDeviceFingerprintsRequest
     * @return DescribeWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDeviceFingerprintsResponse DescribeWhiteBoxDeviceFingerprints(DescribeWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxDeviceFingerprints", DescribeWhiteBoxDeviceFingerprintsResponse.class);
    }

    /**
     *This API is used to display white-box key information.
     * @param req DescribeWhiteBoxKeyRequest
     * @return DescribeWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyResponse DescribeWhiteBoxKey(DescribeWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxKey", DescribeWhiteBoxKeyResponse.class);
    }

    /**
     *This API is used to get the white-box key list.
     * @param req DescribeWhiteBoxKeyDetailsRequest
     * @return DescribeWhiteBoxKeyDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyDetailsResponse DescribeWhiteBoxKeyDetails(DescribeWhiteBoxKeyDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxKeyDetails", DescribeWhiteBoxKeyDetailsResponse.class);
    }

    /**
     *This API is used to get the white-box key service status.
     * @param req DescribeWhiteBoxServiceStatusRequest
     * @return DescribeWhiteBoxServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxServiceStatusResponse DescribeWhiteBoxServiceStatus(DescribeWhiteBoxServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxServiceStatus", DescribeWhiteBoxServiceStatusResponse.class);
    }

    /**
     *This API is used to disable a master key. The disabled key cannot be used for encryption and decryption operations.
     * @param req DisableKeyRequest
     * @return DisableKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyResponse DisableKey(DisableKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKey", DisableKeyResponse.class);
    }

    /**
     *Disabled key rotation for the specified CMK.
     * @param req DisableKeyRotationRequest
     * @return DisableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyRotationResponse DisableKeyRotation(DisableKeyRotationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKeyRotation", DisableKeyRotationResponse.class);
    }

    /**
     *This API is used to batch prohibit the use of CMK.
     * @param req DisableKeysRequest
     * @return DisableKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeysResponse DisableKeys(DisableKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKeys", DisableKeysResponse.class);
    }

    /**
     *This API is used to disable a white-box key.
     * @param req DisableWhiteBoxKeyRequest
     * @return DisableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeyResponse DisableWhiteBoxKey(DisableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableWhiteBoxKey", DisableWhiteBoxKeyResponse.class);
    }

    /**
     *This API is used to disable white-box keys in batches.
     * @param req DisableWhiteBoxKeysRequest
     * @return DisableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeysResponse DisableWhiteBoxKeys(DisableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableWhiteBoxKeys", DisableWhiteBoxKeysResponse.class);
    }

    /**
     *Enable a specified CMK.
     * @param req EnableKeyRequest
     * @return EnableKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyResponse EnableKey(EnableKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKey", EnableKeyResponse.class);
    }

    /**
     *Turn on the key rotation function for the specified CMK.
     * @param req EnableKeyRotationRequest
     * @return EnableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyRotationResponse EnableKeyRotation(EnableKeyRotationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKeyRotation", EnableKeyRotationResponse.class);
    }

    /**
     *This API is used to enable CMK in batches.
     * @param req EnableKeysRequest
     * @return EnableKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeysResponse EnableKeys(EnableKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKeys", EnableKeysResponse.class);
    }

    /**
     *This API is used to enable a white-box key.
     * @param req EnableWhiteBoxKeyRequest
     * @return EnableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeyResponse EnableWhiteBoxKey(EnableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableWhiteBoxKey", EnableWhiteBoxKeyResponse.class);
    }

    /**
     *This API is used to enable white-box keys in batches.
     * @param req EnableWhiteBoxKeysRequest
     * @return EnableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeysResponse EnableWhiteBoxKeys(EnableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableWhiteBoxKeys", EnableWhiteBoxKeysResponse.class);
    }

    /**
     *This API is used to encrypt any data up to 4KB. It can be used to encrypt database passwords, RSA Key, or other small sensitive information. For application data encryption, use the DataKey generated by GenerateDataKey to perform local data encryption and decryption operations
     * @param req EncryptRequest
     * @return EncryptResponse
     * @throws TencentCloudSDKException
     */
    public EncryptResponse Encrypt(EncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Encrypt", EncryptResponse.class);
    }

    /**
     *This API is used to encrypt data with a white-box key.
     * @param req EncryptByWhiteBoxRequest
     * @return EncryptByWhiteBoxResponse
     * @throws TencentCloudSDKException
     */
    public EncryptByWhiteBoxResponse EncryptByWhiteBox(EncryptByWhiteBoxRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EncryptByWhiteBox", EncryptByWhiteBoxResponse.class);
    }

    /**
     *This API generates a data key, which you can use to encrypt local data.
     * @param req GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDataKeyResponse GenerateDataKey(GenerateDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDataKey", GenerateDataKeyResponse.class);
    }

    /**
     *This API is used to generate a random number.
     * @param req GenerateRandomRequest
     * @return GenerateRandomResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRandomResponse GenerateRandom(GenerateRandomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateRandom", GenerateRandomResponse.class);
    }

    /**
     *Query whether the specified CMK has the key rotation function.
     * @param req GetKeyRotationStatusRequest
     * @return GetKeyRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetKeyRotationStatusResponse GetKeyRotationStatus(GetKeyRotationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetKeyRotationStatus", GetKeyRotationStatusResponse.class);
    }

    /**
     *This API is used to obtain the parameters of the material to be imported into a CMK. The returned `Token` is used as one of the parameters to execute `ImportKeyMaterial`, and the returned `PublicKey` is used to encrypt the key material. The `Token` and `PublicKey` are valid for 24 hours. If they are expired, you will need to call the API again to get a new `Token` and `PublicKey`.
     * @param req GetParametersForImportRequest
     * @return GetParametersForImportResponse
     * @throws TencentCloudSDKException
     */
    public GetParametersForImportResponse GetParametersForImport(GetParametersForImportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetParametersForImport", GetParametersForImportResponse.class);
    }

    /**
     *This API is used to get the public key of an asymmetric KMS key (which must be enabled). With the public key, you can encrypt messages and verify signatures.
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPublicKey", GetPublicKeyResponse.class);
    }

    /**
     *This API is used to return all regions support KMS service.
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRegions", GetRegionsResponse.class);
    }

    /**
     *Used to query whether the user has activated the KMS service.
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetServiceStatus", GetServiceStatusResponse.class);
    }

    /**
     *This API is used to import key material into an EXTERNAL CMK. The key obtained through the `GetParametersForImport` API is used to encrypt the key material. You can only reimport the same key material into the specified CMK and set a new expiration time. After the CMK key material is imported, it cannot be replaced. After the key material is expired or deleted, the CMK will remain unavailable until the same key material is reimported. CMKs are independent, which means that the same key material can be imported into different CMKs, but data encrypted by one CMK cannot be decrypted by another one.
Key material can only be imported into CMKs in `Enabled` and `PendingImport` status.
     * @param req ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyMaterialResponse ImportKeyMaterial(ImportKeyMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportKeyMaterial", ImportKeyMaterialResponse.class);
    }

    /**
     *This API is used to list the encryption methods supported in the current region.
     * @param req ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     * @throws TencentCloudSDKException
     */
    public ListAlgorithmsResponse ListAlgorithms(ListAlgorithmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlgorithms", ListAlgorithmsResponse.class);
    }

    /**
     *Get the master key list details according to the specified Offset and Limit.
     * @param req ListKeyDetailRequest
     * @return ListKeyDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyDetailResponse ListKeyDetail(ListKeyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListKeyDetail", ListKeyDetailResponse.class);
    }

    /**
     *This API is used to list the KeyIds of CMKs in `Enabled`, `Disabled`, and `PendingImport` status under the account.
     * @param req ListKeysRequest
     * @return ListKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListKeysResponse ListKeys(ListKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListKeys", ListKeysResponse.class);
    }

    /**
     *This API is used to overwrite the device fingerprint information of a specified key.
     * @param req OverwriteWhiteBoxDeviceFingerprintsRequest
     * @return OverwriteWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public OverwriteWhiteBoxDeviceFingerprintsResponse OverwriteWhiteBoxDeviceFingerprints(OverwriteWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OverwriteWhiteBoxDeviceFingerprints", OverwriteWhiteBoxDeviceFingerprintsResponse.class);
    }

    /**
     *This API is used to decrypt ciphertext using post-quantum cryptography (PQC) algorithm, and return the plaintext.
     * @param req PostQuantumCryptoDecryptRequest
     * @return PostQuantumCryptoDecryptResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoDecryptResponse PostQuantumCryptoDecrypt(PostQuantumCryptoDecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoDecrypt", PostQuantumCryptoDecryptResponse.class);
    }

    /**
     *This API is used to encrypt using PQC. It supports up to 4 KB of data. It is applicable for encryption of database passwords, RSA keys, or other sensitive information. You can also apply `DataKey` generated by API `GenerateDataKey` to encrypt or decrypt your local data.
     * @param req PostQuantumCryptoEncryptRequest
     * @return PostQuantumCryptoEncryptResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoEncryptResponse PostQuantumCryptoEncrypt(PostQuantumCryptoEncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoEncrypt", PostQuantumCryptoEncryptResponse.class);
    }

    /**
     *This API is used to sign using PQC.
     * @param req PostQuantumCryptoSignRequest
     * @return PostQuantumCryptoSignResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoSignResponse PostQuantumCryptoSign(PostQuantumCryptoSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoSign", PostQuantumCryptoSignResponse.class);
    }

    /**
     *This API is used to verify a signature using PQC.
     * @param req PostQuantumCryptoVerifyRequest
     * @return PostQuantumCryptoVerifyResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoVerifyResponse PostQuantumCryptoVerify(PostQuantumCryptoVerifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoVerify", PostQuantumCryptoVerifyResponse.class);
    }

    /**
     *Re-encrypt the ciphertext using the specified CMK.
     * @param req ReEncryptRequest
     * @return ReEncryptResponse
     * @throws TencentCloudSDKException
     */
    public ReEncryptResponse ReEncrypt(ReEncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReEncrypt", ReEncryptResponse.class);
    }

    /**
     *CMK planned deletion API, used to specify the time of CMK deletion, the optional time interval is [7,30] days
     * @param req ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public ScheduleKeyDeletionResponse ScheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScheduleKeyDeletion", ScheduleKeyDeletionResponse.class);
    }

    /**
     *This API is used to generate a signature with an asymmetric key.
Note that only when KeyUsage is `ASYMMETRIC_SIGN_VERIFY_${ALGORITHM}` (e.g., `ASYMMETRIC_SIGN_VERIFY_SM2` and `ASYMMETRIC_SIGN_VERIFY_ECC`), the key can be used for signing.
     * @param req SignByAsymmetricKeyRequest
     * @return SignByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public SignByAsymmetricKeyResponse SignByAsymmetricKey(SignByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SignByAsymmetricKey", SignByAsymmetricKeyResponse.class);
    }

    /**
     *This API is used to unbind a key with a Tencent Cloud resource, indicating that the Tencent Cloud resource will not use the key any longer.
     * @param req UnbindCloudResourceRequest
     * @return UnbindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudResourceResponse UnbindCloudResource(UnbindCloudResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCloudResource", UnbindCloudResourceResponse.class);
    }

    /**
     *This API is used to modify the alias of a CMK. CMKs in `PendingDelete` status cannot be modified.
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlias", UpdateAliasResponse.class);
    }

    /**
     *This API is used to modify the description of the specified CMK. CMKs in `PendingDelete` status cannot be modified.
     * @param req UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateKeyDescriptionResponse UpdateKeyDescription(UpdateKeyDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateKeyDescription", UpdateKeyDescriptionResponse.class);
    }

    /**
     *This API is used to verify a signature with an asymmetric key.
     * @param req VerifyByAsymmetricKeyRequest
     * @return VerifyByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public VerifyByAsymmetricKeyResponse VerifyByAsymmetricKey(VerifyByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyByAsymmetricKey", VerifyByAsymmetricKeyResponse.class);
    }

}
