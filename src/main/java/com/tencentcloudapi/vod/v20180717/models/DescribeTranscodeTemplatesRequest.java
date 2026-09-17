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

public class DescribeTranscodeTemplatesRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * 
    */
    @SerializedName("TEHDType")
    @Expose
    private String TEHDType;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("EnhanceType")
    @Expose
    private String EnhanceType;

    /**
    * 
    */
    @SerializedName("EnhanceScenarioType")
    @Expose
    private String EnhanceScenarioType;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Definitions 
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set 
     * @param Definitions 
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return ContainerType 
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set 
     * @param ContainerType 
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get  
     * @return TEHDType 
     */
    public String getTEHDType() {
        return this.TEHDType;
    }

    /**
     * Set 
     * @param TEHDType 
     */
    public void setTEHDType(String TEHDType) {
        this.TEHDType = TEHDType;
    }

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return EnhanceType 
     */
    public String getEnhanceType() {
        return this.EnhanceType;
    }

    /**
     * Set 
     * @param EnhanceType 
     */
    public void setEnhanceType(String EnhanceType) {
        this.EnhanceType = EnhanceType;
    }

    /**
     * Get  
     * @return EnhanceScenarioType 
     */
    public String getEnhanceScenarioType() {
        return this.EnhanceScenarioType;
    }

    /**
     * Set 
     * @param EnhanceScenarioType 
     */
    public void setEnhanceScenarioType(String EnhanceScenarioType) {
        this.EnhanceScenarioType = EnhanceScenarioType;
    }

    public DescribeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeTemplatesRequest(DescribeTranscodeTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.TEHDType != null) {
            this.TEHDType = new String(source.TEHDType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EnhanceType != null) {
            this.EnhanceType = new String(source.EnhanceType);
        }
        if (source.EnhanceScenarioType != null) {
            this.EnhanceScenarioType = new String(source.EnhanceScenarioType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "TEHDType", this.TEHDType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EnhanceType", this.EnhanceType);
        this.setParamSimple(map, prefix + "EnhanceScenarioType", this.EnhanceScenarioType);

    }
}

