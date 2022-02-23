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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseFileSignResponse extends AbstractModel{

    /**
    * Temporary key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Temporary key ID
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * Temporary key token
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * Start timestamp
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Expiration timestamp
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Temporary key 
     * @return SecretKey Temporary key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Temporary key
     * @param SecretKey Temporary key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Temporary key ID 
     * @return SecretID Temporary key ID
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set Temporary key ID
     * @param SecretID Temporary key ID
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get Temporary key token 
     * @return SessionToken Temporary key token
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set Temporary key token
     * @param SessionToken Temporary key token
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get Start timestamp 
     * @return StartTime Start timestamp
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp
     * @param StartTime Start timestamp
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Expiration timestamp 
     * @return ExpiredTime Expiration timestamp
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration timestamp
     * @param ExpiredTime Expiration timestamp
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    public DescribeReleaseFileSignResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseFileSignResponse(DescribeReleaseFileSignResponse source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

