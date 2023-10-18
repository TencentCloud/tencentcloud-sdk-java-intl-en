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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKey extends AbstractModel {

    /**
    * Created API key ID.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Created API key.
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
    * Key type. Valid values: auto, manual.
    */
    @SerializedName("AccessKeyType")
    @Expose
    private String AccessKeyType;

    /**
    * Custom key name.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Key status. 0: disabled. 1: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Created API key ID. 
     * @return AccessKeyId Created API key ID.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set Created API key ID.
     * @param AccessKeyId Created API key ID.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Created API key. 
     * @return AccessKeySecret Created API key.
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set Created API key.
     * @param AccessKeySecret Created API key.
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    /**
     * Get Key type. Valid values: auto, manual. 
     * @return AccessKeyType Key type. Valid values: auto, manual.
     */
    public String getAccessKeyType() {
        return this.AccessKeyType;
    }

    /**
     * Set Key type. Valid values: auto, manual.
     * @param AccessKeyType Key type. Valid values: auto, manual.
     */
    public void setAccessKeyType(String AccessKeyType) {
        this.AccessKeyType = AccessKeyType;
    }

    /**
     * Get Custom key name. 
     * @return SecretName Custom key name.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Custom key name.
     * @param SecretName Custom key name.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used. 
     * @return ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     * @param ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Key status. 0: disabled. 1: enabled. 
     * @return Status Key status. 0: disabled. 1: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Key status. 0: disabled. 1: enabled.
     * @param Status Key status. 0: disabled. 1: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ApiKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKey(ApiKey source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.AccessKeySecret != null) {
            this.AccessKeySecret = new String(source.AccessKeySecret);
        }
        if (source.AccessKeyType != null) {
            this.AccessKeyType = new String(source.AccessKeyType);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);
        this.setParamSimple(map, prefix + "AccessKeyType", this.AccessKeyType);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

