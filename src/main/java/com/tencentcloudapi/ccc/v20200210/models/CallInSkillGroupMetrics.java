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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInSkillGroupMetrics extends AbstractModel {

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Data metrics.
    */
    @SerializedName("Metrics")
    @Expose
    private CallInMetrics Metrics;

    /**
    * Skill group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Skill group id. 
     * @return SkillGroupId Skill group id.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupId Skill group id.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Data metrics. 
     * @return Metrics Data metrics.
     */
    public CallInMetrics getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Data metrics.
     * @param Metrics Data metrics.
     */
    public void setMetrics(CallInMetrics Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Skill group name. 
     * @return Name Skill group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Skill group name.
     * @param Name Skill group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CallInSkillGroupMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInSkillGroupMetrics(CallInSkillGroupMetrics source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Metrics != null) {
            this.Metrics = new CallInMetrics(source.Metrics);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

