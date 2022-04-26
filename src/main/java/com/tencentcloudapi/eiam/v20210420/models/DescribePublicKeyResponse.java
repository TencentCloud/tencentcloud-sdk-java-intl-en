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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicKeyResponse extends AbstractModel{

    /**
    * Public key information used for JWT signature verification.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * JWT key ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Public key information used for JWT signature verification.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicKey Public key information used for JWT signature verification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key information used for JWT signature verification.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicKey Public key information used for JWT signature verification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get JWT key ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyId JWT key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set JWT key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyId JWT key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
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

    public DescribePublicKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicKeyResponse(DescribePublicKeyResponse source) {
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

