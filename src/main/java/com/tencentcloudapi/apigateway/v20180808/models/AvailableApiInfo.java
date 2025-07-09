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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableApiInfo extends AbstractModel {

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API type
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API method
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Whether the API is bound with another plugin
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachedOtherPlugin")
    @Expose
    private Boolean AttachedOtherPlugin;

    /**
    * Whether the API is bound with the current plugin
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAttached")
    @Expose
    private Boolean IsAttached;

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name 
     * @return ApiName API name
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
     * @param ApiName API name
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API type 
     * @return ApiType API type
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type
     * @param ApiType API type
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API path 
     * @return Path API path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path
     * @param Path API path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API method 
     * @return Method API method
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API method
     * @param Method API method
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Whether the API is bound with another plugin
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttachedOtherPlugin Whether the API is bound with another plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAttachedOtherPlugin() {
        return this.AttachedOtherPlugin;
    }

    /**
     * Set Whether the API is bound with another plugin
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttachedOtherPlugin Whether the API is bound with another plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachedOtherPlugin(Boolean AttachedOtherPlugin) {
        this.AttachedOtherPlugin = AttachedOtherPlugin;
    }

    /**
     * Get Whether the API is bound with the current plugin
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsAttached Whether the API is bound with the current plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set Whether the API is bound with the current plugin
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsAttached Whether the API is bound with the current plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAttached(Boolean IsAttached) {
        this.IsAttached = IsAttached;
    }

    public AvailableApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableApiInfo(AvailableApiInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.AttachedOtherPlugin != null) {
            this.AttachedOtherPlugin = new Boolean(source.AttachedOtherPlugin);
        }
        if (source.IsAttached != null) {
            this.IsAttached = new Boolean(source.IsAttached);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttachedOtherPlugin", this.AttachedOtherPlugin);
        this.setParamSimple(map, prefix + "IsAttached", this.IsAttached);

    }
}

