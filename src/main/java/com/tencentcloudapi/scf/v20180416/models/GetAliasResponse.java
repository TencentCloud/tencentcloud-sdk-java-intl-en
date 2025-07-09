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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAliasResponse extends AbstractModel {

    /**
    * Master version pointed to by the alias
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * Alias name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Routing information of alias
    */
    @SerializedName("RoutingConfig")
    @Expose
    private RoutingConfig RoutingConfig;

    /**
    * Alias description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Update time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Master version pointed to by the alias 
     * @return FunctionVersion Master version pointed to by the alias
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set Master version pointed to by the alias
     * @param FunctionVersion Master version pointed to by the alias
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get Alias name 
     * @return Name Alias name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alias name
     * @param Name Alias name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Routing information of alias 
     * @return RoutingConfig Routing information of alias
     */
    public RoutingConfig getRoutingConfig() {
        return this.RoutingConfig;
    }

    /**
     * Set Routing information of alias
     * @param RoutingConfig Routing information of alias
     */
    public void setRoutingConfig(RoutingConfig RoutingConfig) {
        this.RoutingConfig = RoutingConfig;
    }

    /**
     * Get Alias description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Alias description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Alias description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Alias description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Update time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModTime Update time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Update time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModTime Update time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
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

    public GetAliasResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAliasResponse(GetAliasResponse source) {
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoutingConfig != null) {
            this.RoutingConfig = new RoutingConfig(source.RoutingConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "RoutingConfig.", this.RoutingConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

