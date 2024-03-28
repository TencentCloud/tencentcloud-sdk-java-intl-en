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

public class CreateCCCSkillGroupRequest extends AbstractModel {

    /**
    * Application ID (required).
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Skill group name.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * Skill group type 0-Cell phone, 1-Online, 3-Audio, 4-Video.
    */
    @SerializedName("SkillGroupType")
    @Expose
    private Long SkillGroupType;

    /**
    * The maximum number of people received by the skill group (the maximum number of people that one seat in this skill group can receive) is set to 1 by default. 1. If the skill group type is online, the maximum could be set to one and above.
2. If the skill group type is phone, audio, or video, then the maximum must be 1
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
     * Get Application ID (required). 
     * @return SdkAppId Application ID (required).
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required).
     * @param SdkAppId Application ID (required).
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Skill group name. 
     * @return SkillGroupName Skill group name.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Skill group name.
     * @param SkillGroupName Skill group name.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get Skill group type 0-Cell phone, 1-Online, 3-Audio, 4-Video. 
     * @return SkillGroupType Skill group type 0-Cell phone, 1-Online, 3-Audio, 4-Video.
     */
    public Long getSkillGroupType() {
        return this.SkillGroupType;
    }

    /**
     * Set Skill group type 0-Cell phone, 1-Online, 3-Audio, 4-Video.
     * @param SkillGroupType Skill group type 0-Cell phone, 1-Online, 3-Audio, 4-Video.
     */
    public void setSkillGroupType(Long SkillGroupType) {
        this.SkillGroupType = SkillGroupType;
    }

    /**
     * Get The maximum number of people received by the skill group (the maximum number of people that one seat in this skill group can receive) is set to 1 by default. 1. If the skill group type is online, the maximum could be set to one and above.
2. If the skill group type is phone, audio, or video, then the maximum must be 1 
     * @return MaxConcurrency The maximum number of people received by the skill group (the maximum number of people that one seat in this skill group can receive) is set to 1 by default. 1. If the skill group type is online, the maximum could be set to one and above.
2. If the skill group type is phone, audio, or video, then the maximum must be 1
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set The maximum number of people received by the skill group (the maximum number of people that one seat in this skill group can receive) is set to 1 by default. 1. If the skill group type is online, the maximum could be set to one and above.
2. If the skill group type is phone, audio, or video, then the maximum must be 1
     * @param MaxConcurrency The maximum number of people received by the skill group (the maximum number of people that one seat in this skill group can receive) is set to 1 by default. 1. If the skill group type is online, the maximum could be set to one and above.
2. If the skill group type is phone, audio, or video, then the maximum must be 1
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    public CreateCCCSkillGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCCCSkillGroupRequest(CreateCCCSkillGroupRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.SkillGroupType != null) {
            this.SkillGroupType = new Long(source.SkillGroupType);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "SkillGroupType", this.SkillGroupType);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);

    }
}

