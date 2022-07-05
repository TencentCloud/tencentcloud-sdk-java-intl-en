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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDataKeyRequest extends AbstractModel{

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

    }
}

