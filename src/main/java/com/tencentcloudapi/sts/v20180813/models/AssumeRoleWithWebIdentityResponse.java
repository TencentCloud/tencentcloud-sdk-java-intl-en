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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleWithWebIdentityResponse extends AbstractModel {

    /**
    * Expiration time of the temporary credential (timestamp)
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * Expiration time of the temporary credential
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * Temporary credential
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Expiration time of the temporary credential (timestamp) 
     * @return ExpiredTime Expiration time of the temporary credential (timestamp)
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time of the temporary credential (timestamp)
     * @param ExpiredTime Expiration time of the temporary credential (timestamp)
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Expiration time of the temporary credential 
     * @return Expiration Expiration time of the temporary credential
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Expiration time of the temporary credential
     * @param Expiration Expiration time of the temporary credential
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get Temporary credential 
     * @return Credentials Temporary credential
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set Temporary credential
     * @param Credentials Temporary credential
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
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

    public AssumeRoleWithWebIdentityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleWithWebIdentityResponse(AssumeRoleWithWebIdentityResponse source) {
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
        if (source.Credentials != null) {
            this.Credentials = new Credentials(source.Credentials);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

