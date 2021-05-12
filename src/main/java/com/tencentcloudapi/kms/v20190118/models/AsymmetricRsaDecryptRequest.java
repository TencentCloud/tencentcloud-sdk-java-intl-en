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

public class AsymmetricRsaDecryptRequest extends AbstractModel{

    /**
    * Unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Base64-encoded ciphertext encrypted with `PublicKey`
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * Corresponding algorithm when a public key is used for encryption. Valid values: RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
     * Get Unique CMK ID 
     * @return KeyId Unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique CMK ID
     * @param KeyId Unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Base64-encoded ciphertext encrypted with `PublicKey` 
     * @return Ciphertext Base64-encoded ciphertext encrypted with `PublicKey`
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set Base64-encoded ciphertext encrypted with `PublicKey`
     * @param Ciphertext Base64-encoded ciphertext encrypted with `PublicKey`
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
    }

    /**
     * Get Corresponding algorithm when a public key is used for encryption. Valid values: RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256 
     * @return Algorithm Corresponding algorithm when a public key is used for encryption. Valid values: RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Corresponding algorithm when a public key is used for encryption. Valid values: RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256
     * @param Algorithm Corresponding algorithm when a public key is used for encryption. Valid values: RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1, RSAES_OAEP_SHA_256
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    public AsymmetricRsaDecryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsymmetricRsaDecryptRequest(AsymmetricRsaDecryptRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);

    }
}

