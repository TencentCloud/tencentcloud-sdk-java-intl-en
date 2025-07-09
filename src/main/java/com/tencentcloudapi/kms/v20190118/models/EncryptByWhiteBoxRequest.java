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

public class EncryptByWhiteBoxRequest extends AbstractModel {

    /**
    * Globally unique white-box key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Base64-encoded text to be encrypted. The size of the original text cannot exceed 4 KB.
    */
    @SerializedName("PlainText")
    @Expose
    private String PlainText;

    /**
    * Base64-encoded initialization vector of 16 bytes, which will be used by the encryption algorithm. If this parameter is not passed in, the backend service will generate a random one. You should save this value as a parameter for decryption.
    */
    @SerializedName("InitializationVector")
    @Expose
    private String InitializationVector;

    /**
     * Get Globally unique white-box key ID 
     * @return KeyId Globally unique white-box key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique white-box key ID
     * @param KeyId Globally unique white-box key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Base64-encoded text to be encrypted. The size of the original text cannot exceed 4 KB. 
     * @return PlainText Base64-encoded text to be encrypted. The size of the original text cannot exceed 4 KB.
     */
    public String getPlainText() {
        return this.PlainText;
    }

    /**
     * Set Base64-encoded text to be encrypted. The size of the original text cannot exceed 4 KB.
     * @param PlainText Base64-encoded text to be encrypted. The size of the original text cannot exceed 4 KB.
     */
    public void setPlainText(String PlainText) {
        this.PlainText = PlainText;
    }

    /**
     * Get Base64-encoded initialization vector of 16 bytes, which will be used by the encryption algorithm. If this parameter is not passed in, the backend service will generate a random one. You should save this value as a parameter for decryption. 
     * @return InitializationVector Base64-encoded initialization vector of 16 bytes, which will be used by the encryption algorithm. If this parameter is not passed in, the backend service will generate a random one. You should save this value as a parameter for decryption.
     */
    public String getInitializationVector() {
        return this.InitializationVector;
    }

    /**
     * Set Base64-encoded initialization vector of 16 bytes, which will be used by the encryption algorithm. If this parameter is not passed in, the backend service will generate a random one. You should save this value as a parameter for decryption.
     * @param InitializationVector Base64-encoded initialization vector of 16 bytes, which will be used by the encryption algorithm. If this parameter is not passed in, the backend service will generate a random one. You should save this value as a parameter for decryption.
     */
    public void setInitializationVector(String InitializationVector) {
        this.InitializationVector = InitializationVector;
    }

    public EncryptByWhiteBoxRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptByWhiteBoxRequest(EncryptByWhiteBoxRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PlainText != null) {
            this.PlainText = new String(source.PlainText);
        }
        if (source.InitializationVector != null) {
            this.InitializationVector = new String(source.InitializationVector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlainText", this.PlainText);
        this.setParamSimple(map, prefix + "InitializationVector", this.InitializationVector);

    }
}

