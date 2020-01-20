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

public class GenerateDataKeyResponse extends AbstractModel{

    /**
    * 
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 
    */
    @SerializedName("Plaintext")
    @Expose
    private String Plaintext;

    /**
    * Base64-encoded ciphertext that is encrypted by `DataKey`. You should keep the ciphertext private.
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get  
     * @return KeyId 
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 
     * @param KeyId 
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get  
     * @return Plaintext 
     */
    public String getPlaintext() {
        return this.Plaintext;
    }

    /**
     * Set 
     * @param Plaintext 
     */
    public void setPlaintext(String Plaintext) {
        this.Plaintext = Plaintext;
    }

    /**
     * Get Base64-encoded ciphertext that is encrypted by `DataKey`. You should keep the ciphertext private. 
     * @return CiphertextBlob Base64-encoded ciphertext that is encrypted by `DataKey`. You should keep the ciphertext private.
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set Base64-encoded ciphertext that is encrypted by `DataKey`. You should keep the ciphertext private.
     * @param CiphertextBlob Base64-encoded ciphertext that is encrypted by `DataKey`. You should keep the ciphertext private.
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Plaintext", this.Plaintext);
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

