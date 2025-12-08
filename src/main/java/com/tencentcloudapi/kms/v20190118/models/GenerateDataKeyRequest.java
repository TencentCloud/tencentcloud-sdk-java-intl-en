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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDataKeyRequest extends AbstractModel {

    /**
    * Globally unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
    */
    @SerializedName("KeySpec")
    @Expose
    private String KeySpec;

    /**
    * Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
    * JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
    */
    @SerializedName("EncryptionContext")
    @Expose
    private String EncryptionContext;

    /**
    * PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted.
    */
    @SerializedName("EncryptionPublicKey")
    @Expose
    private String EncryptionPublicKey;

    /**
    * Asymmetric encryption algorithm. Valid values: `SM2` (C1C3C2 ciphertext is returned)`, `SM2_C1C3C2_ASN1` (C1C3C2 ASN1 ciphertext is returned), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256`. This field is used in combination with `EncryptionPublicKey` for encryption. If it is left empty, an SM2 public key will be used by default.
    */
    @SerializedName("EncryptionAlgorithm")
    @Expose
    private String EncryptionAlgorithm;

    /**
    * Indicates whether the data generated key is managed by KMS. 1 means the key is managed and saved by KMS. 0 means the key is not managed by KMS.
    */
    @SerializedName("IsHostedByKms")
    @Expose
    private Long IsHostedByKms;

    /**
    * Name of the data key. required when IsHostedByKms is 1. optional when IsHostedByKms is 0 as KMS does not manage it.
    */
    @SerializedName("DataKeyName")
    @Expose
    private String DataKeyName;

    /**
    * Describes the data key. maximum 100 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * HSM cluster ID corresponding to the KMS exclusive edition. if HsmClusterId is specified, it indicates the root key is in this cluster and verifies whether KeyId corresponds to HsmClusterId.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * Tag list. valid at that time when parameter IsHostedByKms=1 and the data key is hosted by kms.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Globally unique CMK ID 
     * @return KeyId Globally unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique CMK ID
     * @param KeyId Globally unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified. 
     * @return KeySpec Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public String getKeySpec() {
        return this.KeySpec;
    }

    /**
     * Set Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     * @param KeySpec Specifies the encryption algorithm and size of the `DataKey`. Valid values: AES_128, AES_256. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public void setKeySpec(String KeySpec) {
        this.KeySpec = KeySpec;
    }

    /**
     * Get Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified. 
     * @return NumberOfBytes Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * Set Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     * @param NumberOfBytes Length of the `DataKey`. If both `NumberOfBytes` and `KeySpec` are specified, `NumberOfBytes` will prevail. Minimum value: 1; maximum value: 1024. Either `KeySpec` or `NumberOfBytes` must be specified.
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * Get JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted. 
     * @return EncryptionContext JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     */
    public String getEncryptionContext() {
        return this.EncryptionContext;
    }

    /**
     * Set JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     * @param EncryptionContext JSON string of key-value pair. If this field is used, the same string should be entered when the returned `DataKey` is decrypted.
     */
    public void setEncryptionContext(String EncryptionContext) {
        this.EncryptionContext = EncryptionContext;
    }

    /**
     * Get PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted. 
     * @return EncryptionPublicKey PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted.
     */
    public String getEncryptionPublicKey() {
        return this.EncryptionPublicKey;
    }

    /**
     * Set PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted.
     * @param EncryptionPublicKey PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted.
     */
    public void setEncryptionPublicKey(String EncryptionPublicKey) {
        this.EncryptionPublicKey = EncryptionPublicKey;
    }

    /**
     * Get Asymmetric encryption algorithm. Valid values: `SM2` (C1C3C2 ciphertext is returned)`, `SM2_C1C3C2_ASN1` (C1C3C2 ASN1 ciphertext is returned), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256`. This field is used in combination with `EncryptionPublicKey` for encryption. If it is left empty, an SM2 public key will be used by default. 
     * @return EncryptionAlgorithm Asymmetric encryption algorithm. Valid values: `SM2` (C1C3C2 ciphertext is returned)`, `SM2_C1C3C2_ASN1` (C1C3C2 ASN1 ciphertext is returned), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256`. This field is used in combination with `EncryptionPublicKey` for encryption. If it is left empty, an SM2 public key will be used by default.
     */
    public String getEncryptionAlgorithm() {
        return this.EncryptionAlgorithm;
    }

    /**
     * Set Asymmetric encryption algorithm. Valid values: `SM2` (C1C3C2 ciphertext is returned)`, `SM2_C1C3C2_ASN1` (C1C3C2 ASN1 ciphertext is returned), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256`. This field is used in combination with `EncryptionPublicKey` for encryption. If it is left empty, an SM2 public key will be used by default.
     * @param EncryptionAlgorithm Asymmetric encryption algorithm. Valid values: `SM2` (C1C3C2 ciphertext is returned)`, `SM2_C1C3C2_ASN1` (C1C3C2 ASN1 ciphertext is returned), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, and `RSAES_OAEP_SHA_256`. This field is used in combination with `EncryptionPublicKey` for encryption. If it is left empty, an SM2 public key will be used by default.
     */
    public void setEncryptionAlgorithm(String EncryptionAlgorithm) {
        this.EncryptionAlgorithm = EncryptionAlgorithm;
    }

    /**
     * Get Indicates whether the data generated key is managed by KMS. 1 means the key is managed and saved by KMS. 0 means the key is not managed by KMS. 
     * @return IsHostedByKms Indicates whether the data generated key is managed by KMS. 1 means the key is managed and saved by KMS. 0 means the key is not managed by KMS.
     */
    public Long getIsHostedByKms() {
        return this.IsHostedByKms;
    }

    /**
     * Set Indicates whether the data generated key is managed by KMS. 1 means the key is managed and saved by KMS. 0 means the key is not managed by KMS.
     * @param IsHostedByKms Indicates whether the data generated key is managed by KMS. 1 means the key is managed and saved by KMS. 0 means the key is not managed by KMS.
     */
    public void setIsHostedByKms(Long IsHostedByKms) {
        this.IsHostedByKms = IsHostedByKms;
    }

    /**
     * Get Name of the data key. required when IsHostedByKms is 1. optional when IsHostedByKms is 0 as KMS does not manage it. 
     * @return DataKeyName Name of the data key. required when IsHostedByKms is 1. optional when IsHostedByKms is 0 as KMS does not manage it.
     */
    public String getDataKeyName() {
        return this.DataKeyName;
    }

    /**
     * Set Name of the data key. required when IsHostedByKms is 1. optional when IsHostedByKms is 0 as KMS does not manage it.
     * @param DataKeyName Name of the data key. required when IsHostedByKms is 1. optional when IsHostedByKms is 0 as KMS does not manage it.
     */
    public void setDataKeyName(String DataKeyName) {
        this.DataKeyName = DataKeyName;
    }

    /**
     * Get Describes the data key. maximum 100 bytes. 
     * @return Description Describes the data key. maximum 100 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the data key. maximum 100 bytes.
     * @param Description Describes the data key. maximum 100 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get HSM cluster ID corresponding to the KMS exclusive edition. if HsmClusterId is specified, it indicates the root key is in this cluster and verifies whether KeyId corresponds to HsmClusterId. 
     * @return HsmClusterId HSM cluster ID corresponding to the KMS exclusive edition. if HsmClusterId is specified, it indicates the root key is in this cluster and verifies whether KeyId corresponds to HsmClusterId.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM cluster ID corresponding to the KMS exclusive edition. if HsmClusterId is specified, it indicates the root key is in this cluster and verifies whether KeyId corresponds to HsmClusterId.
     * @param HsmClusterId HSM cluster ID corresponding to the KMS exclusive edition. if HsmClusterId is specified, it indicates the root key is in this cluster and verifies whether KeyId corresponds to HsmClusterId.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get Tag list. valid at that time when parameter IsHostedByKms=1 and the data key is hosted by kms. 
     * @return Tags Tag list. valid at that time when parameter IsHostedByKms=1 and the data key is hosted by kms.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. valid at that time when parameter IsHostedByKms=1 and the data key is hosted by kms.
     * @param Tags Tag list. valid at that time when parameter IsHostedByKms=1 and the data key is hosted by kms.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public GenerateDataKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateDataKeyRequest(GenerateDataKeyRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeySpec != null) {
            this.KeySpec = new String(source.KeySpec);
        }
        if (source.NumberOfBytes != null) {
            this.NumberOfBytes = new Long(source.NumberOfBytes);
        }
        if (source.EncryptionContext != null) {
            this.EncryptionContext = new String(source.EncryptionContext);
        }
        if (source.EncryptionPublicKey != null) {
            this.EncryptionPublicKey = new String(source.EncryptionPublicKey);
        }
        if (source.EncryptionAlgorithm != null) {
            this.EncryptionAlgorithm = new String(source.EncryptionAlgorithm);
        }
        if (source.IsHostedByKms != null) {
            this.IsHostedByKms = new Long(source.IsHostedByKms);
        }
        if (source.DataKeyName != null) {
            this.DataKeyName = new String(source.DataKeyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeySpec", this.KeySpec);
        this.setParamSimple(map, prefix + "NumberOfBytes", this.NumberOfBytes);
        this.setParamSimple(map, prefix + "EncryptionContext", this.EncryptionContext);
        this.setParamSimple(map, prefix + "EncryptionPublicKey", this.EncryptionPublicKey);
        this.setParamSimple(map, prefix + "EncryptionAlgorithm", this.EncryptionAlgorithm);
        this.setParamSimple(map, prefix + "IsHostedByKms", this.IsHostedByKms);
        this.setParamSimple(map, prefix + "DataKeyName", this.DataKeyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

