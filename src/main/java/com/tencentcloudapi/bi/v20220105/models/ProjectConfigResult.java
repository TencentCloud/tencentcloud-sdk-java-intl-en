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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectConfigResult extends AbstractModel {

    /**
    * Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Configuration mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncludeType")
    @Expose
    private String IncludeType;

    /**
    * Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get Configuration name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModuleId Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModuleId Configuration name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Configuration mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncludeType Configuration mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncludeType() {
        return this.IncludeType;
    }

    /**
     * Set Configuration mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncludeType Configuration mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncludeType(String IncludeType) {
        this.IncludeType = IncludeType;
    }

    /**
     * Get Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public ProjectConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectConfigResult(ProjectConfigResult source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.IncludeType != null) {
            this.IncludeType = new String(source.IncludeType);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "IncludeType", this.IncludeType);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

