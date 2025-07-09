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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCCCSkillGroupRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupID")
    @Expose
    private Long SkillGroupID;

    /**
    * Modified skill group name.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * Modified maximum concurrency, with the maximum synchronization being 2.
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * True for simultaneous ringing, false for sequential ringing.
    */
    @SerializedName("RingAll")
    @Expose
    private Boolean RingAll;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Skill group id. 
     * @return SkillGroupID Skill group id.
     */
    public Long getSkillGroupID() {
        return this.SkillGroupID;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupID Skill group id.
     */
    public void setSkillGroupID(Long SkillGroupID) {
        this.SkillGroupID = SkillGroupID;
    }

    /**
     * Get Modified skill group name. 
     * @return SkillGroupName Modified skill group name.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Modified skill group name.
     * @param SkillGroupName Modified skill group name.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get Modified maximum concurrency, with the maximum synchronization being 2. 
     * @return MaxConcurrency Modified maximum concurrency, with the maximum synchronization being 2.
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set Modified maximum concurrency, with the maximum synchronization being 2.
     * @param MaxConcurrency Modified maximum concurrency, with the maximum synchronization being 2.
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get True for simultaneous ringing, false for sequential ringing. 
     * @return RingAll True for simultaneous ringing, false for sequential ringing.
     */
    public Boolean getRingAll() {
        return this.RingAll;
    }

    /**
     * Set True for simultaneous ringing, false for sequential ringing.
     * @param RingAll True for simultaneous ringing, false for sequential ringing.
     */
    public void setRingAll(Boolean RingAll) {
        this.RingAll = RingAll;
    }

    public UpdateCCCSkillGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCCCSkillGroupRequest(UpdateCCCSkillGroupRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SkillGroupID != null) {
            this.SkillGroupID = new Long(source.SkillGroupID);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.RingAll != null) {
            this.RingAll = new Boolean(source.RingAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SkillGroupID", this.SkillGroupID);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "RingAll", this.RingAll);

    }
}

