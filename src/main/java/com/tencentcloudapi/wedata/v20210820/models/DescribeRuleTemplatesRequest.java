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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleTemplatesRequest extends AbstractModel {

    /**
    * Template Type 1. System Template 2. Custom Definition Template
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1. Constant 2. Offline Table Level 2. Offline Field Level
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Corresponding Engine Type of the Source
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
     * Get Template Type 1. System Template 2. Custom Definition Template 
     * @return Type Template Type 1. System Template 2. Custom Definition Template
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Template Type 1. System Template 2. Custom Definition Template
     * @param Type Template Type 1. System Template 2. Custom Definition Template
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1. Constant 2. Offline Table Level 2. Offline Field Level 
     * @return SourceObjectType 1. Constant 2. Offline Table Level 2. Offline Field Level
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 1. Constant 2. Offline Table Level 2. Offline Field Level
     * @param SourceObjectType 1. Constant 2. Offline Table Level 2. Offline Field Level
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Corresponding Engine Type of the Source 
     * @return SourceEngineTypes Corresponding Engine Type of the Source
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Corresponding Engine Type of the Source
     * @param SourceEngineTypes Corresponding Engine Type of the Source
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    public DescribeRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleTemplatesRequest(DescribeRuleTemplatesRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);

    }
}

