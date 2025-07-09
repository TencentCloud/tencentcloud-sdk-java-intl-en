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

public class AsymmetricSm2DecryptRequest extends AbstractModel {

    /**
    * Unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Specifies that the ciphertext encrypted with PublicKey is Base64 encoded. the original ciphertext format needs to be C1C3C2_ASN1. the length of the original ciphertext cannot exceed 256 bytes.
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

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
     * Get Specifies that the ciphertext encrypted with PublicKey is Base64 encoded. the original ciphertext format needs to be C1C3C2_ASN1. the length of the original ciphertext cannot exceed 256 bytes. 
     * @return Ciphertext Specifies that the ciphertext encrypted with PublicKey is Base64 encoded. the original ciphertext format needs to be C1C3C2_ASN1. the length of the original ciphertext cannot exceed 256 bytes.
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set Specifies that the ciphertext encrypted with PublicKey is Base64 encoded. the original ciphertext format needs to be C1C3C2_ASN1. the length of the original ciphertext cannot exceed 256 bytes.
     * @param Ciphertext Specifies that the ciphertext encrypted with PublicKey is Base64 encoded. the original ciphertext format needs to be C1C3C2_ASN1. the length of the original ciphertext cannot exceed 256 bytes.
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
    }

    public AsymmetricSm2DecryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsymmetricSm2DecryptRequest(AsymmetricSm2DecryptRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);

    }
}

