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

public class GetDataKeyPlaintextRequest extends AbstractModel {

    /**
    * Unique id of a data key.
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * PEM formatted public key string, supporting RSA2048 and SM2 public keys, and used to encrypt the plaintext value in the returned data. If it is empty, plaintext value will not be encrypted.
    */
    @SerializedName("EncryptionPublicKey")
    @Expose
    private String EncryptionPublicKey;

    /**
    * Asymmetric encryption algorithm, used in conjunction with EncryptionPublicKey to encrypt the returned data. It currently supports SM2 (returns ciphertext in C1C3C2 format), SM2_C1C3C2_ASN1 (returns ciphertext in C1C3C2 ASN1 format), RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, and RSAES_OAEP_SHA_256. If it is empty, the default value SM2 is used.
    */
    @SerializedName("EncryptionAlgorithm")
    @Expose
    private String EncryptionAlgorithm;

    /**
     * Get Unique id of a data key. 
     * @return DataKeyId Unique id of a data key.
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set Unique id of a data key.
     * @param DataKeyId Unique id of a data key.
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
    }

    /**
     * Get PEM formatted public key string, supporting RSA2048 and SM2 public keys, and used to encrypt the plaintext value in the returned data. If it is empty, plaintext value will not be encrypted. 
     * @return EncryptionPublicKey PEM formatted public key string, supporting RSA2048 and SM2 public keys, and used to encrypt the plaintext value in the returned data. If it is empty, plaintext value will not be encrypted.
     */
    public String getEncryptionPublicKey() {
        return this.EncryptionPublicKey;
    }

    /**
     * Set PEM formatted public key string, supporting RSA2048 and SM2 public keys, and used to encrypt the plaintext value in the returned data. If it is empty, plaintext value will not be encrypted.
     * @param EncryptionPublicKey PEM formatted public key string, supporting RSA2048 and SM2 public keys, and used to encrypt the plaintext value in the returned data. If it is empty, plaintext value will not be encrypted.
     */
    public void setEncryptionPublicKey(String EncryptionPublicKey) {
        this.EncryptionPublicKey = EncryptionPublicKey;
    }

    /**
     * Get Asymmetric encryption algorithm, used in conjunction with EncryptionPublicKey to encrypt the returned data. It currently supports SM2 (returns ciphertext in C1C3C2 format), SM2_C1C3C2_ASN1 (returns ciphertext in C1C3C2 ASN1 format), RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, and RSAES_OAEP_SHA_256. If it is empty, the default value SM2 is used. 
     * @return EncryptionAlgorithm Asymmetric encryption algorithm, used in conjunction with EncryptionPublicKey to encrypt the returned data. It currently supports SM2 (returns ciphertext in C1C3C2 format), SM2_C1C3C2_ASN1 (returns ciphertext in C1C3C2 ASN1 format), RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, and RSAES_OAEP_SHA_256. If it is empty, the default value SM2 is used.
     */
    public String getEncryptionAlgorithm() {
        return this.EncryptionAlgorithm;
    }

    /**
     * Set Asymmetric encryption algorithm, used in conjunction with EncryptionPublicKey to encrypt the returned data. It currently supports SM2 (returns ciphertext in C1C3C2 format), SM2_C1C3C2_ASN1 (returns ciphertext in C1C3C2 ASN1 format), RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, and RSAES_OAEP_SHA_256. If it is empty, the default value SM2 is used.
     * @param EncryptionAlgorithm Asymmetric encryption algorithm, used in conjunction with EncryptionPublicKey to encrypt the returned data. It currently supports SM2 (returns ciphertext in C1C3C2 format), SM2_C1C3C2_ASN1 (returns ciphertext in C1C3C2 ASN1 format), RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, and RSAES_OAEP_SHA_256. If it is empty, the default value SM2 is used.
     */
    public void setEncryptionAlgorithm(String EncryptionAlgorithm) {
        this.EncryptionAlgorithm = EncryptionAlgorithm;
    }

    public GetDataKeyPlaintextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataKeyPlaintextRequest(GetDataKeyPlaintextRequest source) {
        if (source.DataKeyId != null) {
            this.DataKeyId = new String(source.DataKeyId);
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
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamSimple(map, prefix + "EncryptionPublicKey", this.EncryptionPublicKey);
        this.setParamSimple(map, prefix + "EncryptionAlgorithm", this.EncryptionAlgorithm);

    }
}

