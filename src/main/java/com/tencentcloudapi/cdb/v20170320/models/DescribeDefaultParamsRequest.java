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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDefaultParamsRequest extends AbstractModel{

    /**
    * MySQL version. Currently, the supported versions are ["5.1", "5.5", "5.6", "5.7"].
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
     * Get MySQL version. Currently, the supported versions are ["5.1", "5.5", "5.6", "5.7"]. 
     * @return EngineVersion MySQL version. Currently, the supported versions are ["5.1", "5.5", "5.6", "5.7"].
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL version. Currently, the supported versions are ["5.1", "5.5", "5.6", "5.7"].
     * @param EngineVersion MySQL version. Currently, the supported versions are ["5.1", "5.5", "5.6", "5.7"].
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template). 
     * @return TemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     * @param TemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    public DescribeDefaultParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultParamsRequest(DescribeDefaultParamsRequest source) {
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);

    }
}

