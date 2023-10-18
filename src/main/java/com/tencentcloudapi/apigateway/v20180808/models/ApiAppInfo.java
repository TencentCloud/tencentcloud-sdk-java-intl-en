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

public class ApiAppInfo extends AbstractModel {

    /**
    * Application name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppName")
    @Expose
    private String ApiAppName;

    /**
    * Application ID
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * Application SECRET
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppSecret")
    @Expose
    private String ApiAppSecret;

    /**
    * Application description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppDesc")
    @Expose
    private String ApiAppDesc;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Application KEY
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAppKey")
    @Expose
    private String ApiAppKey;

    /**
     * Get Application name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppName Application name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAppName() {
        return this.ApiAppName;
    }

    /**
     * Set Application name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppName Application name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppName(String ApiAppName) {
        this.ApiAppName = ApiAppName;
    }

    /**
     * Get Application ID 
     * @return ApiAppId Application ID
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set Application ID
     * @param ApiAppId Application ID
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get Application SECRET
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppSecret Application SECRET
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAppSecret() {
        return this.ApiAppSecret;
    }

    /**
     * Set Application SECRET
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppSecret Application SECRET
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppSecret(String ApiAppSecret) {
        this.ApiAppSecret = ApiAppSecret;
    }

    /**
     * Get Application description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppDesc Application description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAppDesc() {
        return this.ApiAppDesc;
    }

    /**
     * Set Application description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppDesc Application description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppDesc(String ApiAppDesc) {
        this.ApiAppDesc = ApiAppDesc;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Application KEY
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAppKey Application KEY
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAppKey() {
        return this.ApiAppKey;
    }

    /**
     * Set Application KEY
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAppKey Application KEY
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAppKey(String ApiAppKey) {
        this.ApiAppKey = ApiAppKey;
    }

    public ApiAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppInfo(ApiAppInfo source) {
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiAppSecret != null) {
            this.ApiAppSecret = new String(source.ApiAppSecret);
        }
        if (source.ApiAppDesc != null) {
            this.ApiAppDesc = new String(source.ApiAppDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiAppKey != null) {
            this.ApiAppKey = new String(source.ApiAppKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiAppSecret", this.ApiAppSecret);
        this.setParamSimple(map, prefix + "ApiAppDesc", this.ApiAppDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiAppKey", this.ApiAppKey);

    }
}

