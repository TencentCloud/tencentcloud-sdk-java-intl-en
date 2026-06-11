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

public class BaselineInfo extends AbstractModel {

    /**
    * Baseline name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Number of check items
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * Number of affected servers
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Pass status: 0: Failed, 1: Approved
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Baseline ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * Last detection time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 5: detecting
    */
    @SerializedName("MaxStatus")
    @Expose
    private Long MaxStatus;

    /**
    * Baseline risk items
    */
    @SerializedName("BaselineFailCount")
    @Expose
    private Long BaselineFailCount;

    /**
     * Get Baseline name 
     * @return Name Baseline name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Baseline name
     * @param Name Baseline name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical 
     * @return Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     * @param Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Number of check items 
     * @return RuleCount Number of check items
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set Number of check items
     * @param RuleCount Number of check items
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get Number of affected servers 
     * @return HostCount Number of affected servers
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected servers
     * @param HostCount Number of affected servers
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Pass status: 0: Failed, 1: Approved 
     * @return Status Pass status: 0: Failed, 1: Approved
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Pass status: 0: Failed, 1: Approved
     * @param Status Pass status: 0: Failed, 1: Approved
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Baseline ID 
     * @return CategoryId Baseline ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Baseline ID
     * @param CategoryId Baseline ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Last detection time 
     * @return LastScanTime Last detection time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last detection time
     * @param LastScanTime Last detection time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 5: detecting 
     * @return MaxStatus 5: detecting
     */
    public Long getMaxStatus() {
        return this.MaxStatus;
    }

    /**
     * Set 5: detecting
     * @param MaxStatus 5: detecting
     */
    public void setMaxStatus(Long MaxStatus) {
        this.MaxStatus = MaxStatus;
    }

    /**
     * Get Baseline risk items 
     * @return BaselineFailCount Baseline risk items
     */
    public Long getBaselineFailCount() {
        return this.BaselineFailCount;
    }

    /**
     * Set Baseline risk items
     * @param BaselineFailCount Baseline risk items
     */
    public void setBaselineFailCount(Long BaselineFailCount) {
        this.BaselineFailCount = BaselineFailCount;
    }

    public BaselineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineInfo(BaselineInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.MaxStatus != null) {
            this.MaxStatus = new Long(source.MaxStatus);
        }
        if (source.BaselineFailCount != null) {
            this.BaselineFailCount = new Long(source.BaselineFailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "MaxStatus", this.MaxStatus);
        this.setParamSimple(map, prefix + "BaselineFailCount", this.BaselineFailCount);

    }
}

