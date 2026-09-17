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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TempCertificate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get  
     * @return SecretId 
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 
     * @param SecretId 
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get  
     * @return SecretKey 
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 
     * @param SecretKey 
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get  
     * @return Token 
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 
     * @param Token 
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get  
     * @return ExpiredTime 
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 
     * @param ExpiredTime 
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public TempCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TempCertificate(TempCertificate source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

