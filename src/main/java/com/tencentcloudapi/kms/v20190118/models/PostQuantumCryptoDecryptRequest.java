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

public class PostQuantumCryptoDecryptRequest extends AbstractModel {

    /**
    * The ciphertext data to be decrypted.
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * PEM-encoded public key (2048-bit RSA/SM2 key), which can be used to encrypt the `Plaintext` returned. If this field is left empty, the `Plaintext` will not be encrypted.
    */
    @SerializedName("EncryptionPublicKey")
    @Expose
    private String EncryptionPublicKey;

    /**
    * Asymmetric encryption algorithm. It is used in combination with `EncryptionPublicKey` to encrypt the returned data. Values: `SM2`(Return the ciphertext in the format of "C1C3C2"), `SM2_C1C3C2_ASN1` (Return the ciphertext in the format of "C1C3C2 ASN1"), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`. It defaults to `SM2` if it's not specified. 
    */
    @SerializedName("EncryptionAlgorithm")
    @Expose
    private String EncryptionAlgorithm;

    /**
     * Get The ciphertext data to be decrypted. 
     * @return CiphertextBlob The ciphertext data to be decrypted.
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set The ciphertext data to be decrypted.
     * @param CiphertextBlob The ciphertext data to be decrypted.
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
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
     * Get Asymmetric encryption algorithm. It is used in combination with `EncryptionPublicKey` to encrypt the returned data. Values: `SM2`(Return the ciphertext in the format of "C1C3C2"), `SM2_C1C3C2_ASN1` (Return the ciphertext in the format of "C1C3C2 ASN1"), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`. It defaults to `SM2` if it's not specified.  
     * @return EncryptionAlgorithm Asymmetric encryption algorithm. It is used in combination with `EncryptionPublicKey` to encrypt the returned data. Values: `SM2`(Return the ciphertext in the format of "C1C3C2"), `SM2_C1C3C2_ASN1` (Return the ciphertext in the format of "C1C3C2 ASN1"), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`. It defaults to `SM2` if it's not specified. 
     */
    public String getEncryptionAlgorithm() {
        return this.EncryptionAlgorithm;
    }

    /**
     * Set Asymmetric encryption algorithm. It is used in combination with `EncryptionPublicKey` to encrypt the returned data. Values: `SM2`(Return the ciphertext in the format of "C1C3C2"), `SM2_C1C3C2_ASN1` (Return the ciphertext in the format of "C1C3C2 ASN1"), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`. It defaults to `SM2` if it's not specified. 
     * @param EncryptionAlgorithm Asymmetric encryption algorithm. It is used in combination with `EncryptionPublicKey` to encrypt the returned data. Values: `SM2`(Return the ciphertext in the format of "C1C3C2"), `SM2_C1C3C2_ASN1` (Return the ciphertext in the format of "C1C3C2 ASN1"), `RSAES_PKCS1_V1_5`, `RSAES_OAEP_SHA_1`, `RSAES_OAEP_SHA_256`. It defaults to `SM2` if it's not specified. 
     */
    public void setEncryptionAlgorithm(String EncryptionAlgorithm) {
        this.EncryptionAlgorithm = EncryptionAlgorithm;
    }

    public PostQuantumCryptoDecryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostQuantumCryptoDecryptRequest(PostQuantumCryptoDecryptRequest source) {
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
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
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "EncryptionPublicKey", this.EncryptionPublicKey);
        this.setParamSimple(map, prefix + "EncryptionAlgorithm", this.EncryptionAlgorithm);

    }
}

