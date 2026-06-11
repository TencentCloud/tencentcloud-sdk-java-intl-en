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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillInfo extends AbstractModel {

    /**
    * Skill name
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * Skill description
    */
    @SerializedName("SkillDesc")
    @Expose
    private String SkillDesc;

    /**
    * Skill source
    */
    @SerializedName("SkillSource")
    @Expose
    private String SkillSource;

    /**
    * Skill risk tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * skill risk description
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * evidence chain
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Skill name 
     * @return SkillName Skill name
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set Skill name
     * @param SkillName Skill name
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get Skill description 
     * @return SkillDesc Skill description
     */
    public String getSkillDesc() {
        return this.SkillDesc;
    }

    /**
     * Set Skill description
     * @param SkillDesc Skill description
     */
    public void setSkillDesc(String SkillDesc) {
        this.SkillDesc = SkillDesc;
    }

    /**
     * Get Skill source 
     * @return SkillSource Skill source
     */
    public String getSkillSource() {
        return this.SkillSource;
    }

    /**
     * Set Skill source
     * @param SkillSource Skill source
     */
    public void setSkillSource(String SkillSource) {
        this.SkillSource = SkillSource;
    }

    /**
     * Get Skill risk tag 
     * @return Tags Skill risk tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Skill risk tag
     * @param Tags Skill risk tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get skill risk description 
     * @return RiskDesc skill risk description
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set skill risk description
     * @param RiskDesc skill risk description
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get evidence chain 
     * @return Evidence evidence chain
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set evidence chain
     * @param Evidence evidence chain
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public SkillInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillInfo(SkillInfo source) {
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillDesc != null) {
            this.SkillDesc = new String(source.SkillDesc);
        }
        if (source.SkillSource != null) {
            this.SkillSource = new String(source.SkillSource);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillDesc", this.SkillDesc);
        this.setParamSimple(map, prefix + "SkillSource", this.SkillSource);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

