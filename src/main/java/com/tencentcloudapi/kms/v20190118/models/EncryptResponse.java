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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncryptResponse extends AbstractModel {

    /**
    * Base64-encoded ciphertext, which is the encrypted information of the ciphertext and key. To get the plaintext, you need to pass in this field to the Decrypt API.
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * Globally unique ID of the CMK used for encryption
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Base64-encoded ciphertext, which is the encrypted information of the ciphertext and key. To get the plaintext, you need to pass in this field to the Decrypt API. 
     * @return CiphertextBlob Base64-encoded ciphertext, which is the encrypted information of the ciphertext and key. To get the plaintext, you need to pass in this field to the Decrypt API.
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set Base64-encoded ciphertext, which is the encrypted information of the ciphertext and key. To get the plaintext, you need to pass in this field to the Decrypt API.
     * @param CiphertextBlob Base64-encoded ciphertext, which is the encrypted information of the ciphertext and key. To get the plaintext, you need to pass in this field to the Decrypt API.
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get Globally unique ID of the CMK used for encryption 
     * @return KeyId Globally unique ID of the CMK used for encryption
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique ID of the CMK used for encryption
     * @param KeyId Globally unique ID of the CMK used for encryption
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public EncryptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptResponse(EncryptResponse source) {
        if (source.CiphertextBlob != null) {
            this.CiphertextBlob = new String(source.CiphertextBlob);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

