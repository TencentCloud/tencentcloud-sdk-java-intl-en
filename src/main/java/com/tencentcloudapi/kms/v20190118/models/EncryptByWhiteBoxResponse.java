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

public class EncryptByWhiteBoxResponse extends AbstractModel{

    /**
    * Base64-encoded initialization vector, which will be used by the encryption algorithm. If this parameter is passed in by the caller, it will be returned as-is; otherwise, the backend service will generate a random one and return it.
    */
    @SerializedName("InitializationVector")
    @Expose
    private String InitializationVector;

    /**
    * Base64-encoded ciphertext after encryption
    */
    @SerializedName("CipherText")
    @Expose
    private String CipherText;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Base64-encoded initialization vector, which will be used by the encryption algorithm. If this parameter is passed in by the caller, it will be returned as-is; otherwise, the backend service will generate a random one and return it. 
     * @return InitializationVector Base64-encoded initialization vector, which will be used by the encryption algorithm. If this parameter is passed in by the caller, it will be returned as-is; otherwise, the backend service will generate a random one and return it.
     */
    public String getInitializationVector() {
        return this.InitializationVector;
    }

    /**
     * Set Base64-encoded initialization vector, which will be used by the encryption algorithm. If this parameter is passed in by the caller, it will be returned as-is; otherwise, the backend service will generate a random one and return it.
     * @param InitializationVector Base64-encoded initialization vector, which will be used by the encryption algorithm. If this parameter is passed in by the caller, it will be returned as-is; otherwise, the backend service will generate a random one and return it.
     */
    public void setInitializationVector(String InitializationVector) {
        this.InitializationVector = InitializationVector;
    }

    /**
     * Get Base64-encoded ciphertext after encryption 
     * @return CipherText Base64-encoded ciphertext after encryption
     */
    public String getCipherText() {
        return this.CipherText;
    }

    /**
     * Set Base64-encoded ciphertext after encryption
     * @param CipherText Base64-encoded ciphertext after encryption
     */
    public void setCipherText(String CipherText) {
        this.CipherText = CipherText;
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

    public EncryptByWhiteBoxResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptByWhiteBoxResponse(EncryptByWhiteBoxResponse source) {
        if (source.InitializationVector != null) {
            this.InitializationVector = new String(source.InitializationVector);
        }
        if (source.CipherText != null) {
            this.CipherText = new String(source.CipherText);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitializationVector", this.InitializationVector);
        this.setParamSimple(map, prefix + "CipherText", this.CipherText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

