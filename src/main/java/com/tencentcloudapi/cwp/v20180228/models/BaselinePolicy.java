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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicy extends AbstractModel {

    /**
    * Policy name, which is no more than 128 English characters in length.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Detection interval [1: 1 day|3: 3 days|5: 5 days|7: 7 days]
    */
    @SerializedName("DetectInterval")
    @Expose
    private Long DetectInterval;

    /**
    * Detection time
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * Whether enabled [0: not enabled|1: enabled]
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Number of associated baseline items
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * Number of associated baseline items
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * Number of associated baseline hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Rule ID
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * Host ID
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Host IP
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * Whether the system default
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
     * Get Policy name, which is no more than 128 English characters in length. 
     * @return PolicyName Policy name, which is no more than 128 English characters in length.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name, which is no more than 128 English characters in length.
     * @param PolicyName Policy name, which is no more than 128 English characters in length.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Detection interval [1: 1 day|3: 3 days|5: 5 days|7: 7 days] 
     * @return DetectInterval Detection interval [1: 1 day|3: 3 days|5: 5 days|7: 7 days]
     */
    public Long getDetectInterval() {
        return this.DetectInterval;
    }

    /**
     * Set Detection interval [1: 1 day|3: 3 days|5: 5 days|7: 7 days]
     * @param DetectInterval Detection interval [1: 1 day|3: 3 days|5: 5 days|7: 7 days]
     */
    public void setDetectInterval(Long DetectInterval) {
        this.DetectInterval = DetectInterval;
    }

    /**
     * Get Detection time 
     * @return DetectTime Detection time
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set Detection time
     * @param DetectTime Detection time
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get Whether enabled [0: not enabled|1: enabled] 
     * @return IsEnabled Whether enabled [0: not enabled|1: enabled]
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether enabled [0: not enabled|1: enabled]
     * @param IsEnabled Whether enabled [0: not enabled|1: enabled]
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP] 
     * @return AssetType Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     * @param AssetType Asset type [0: all Professional and Ultimate editions|1: ID | 2: IP]
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Number of associated baseline items 
     * @return RuleCount Number of associated baseline items
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set Number of associated baseline items
     * @param RuleCount Number of associated baseline items
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get Number of associated baseline items 
     * @return ItemCount Number of associated baseline items
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set Number of associated baseline items
     * @param ItemCount Number of associated baseline items
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get Number of associated baseline hosts 
     * @return HostCount Number of associated baseline hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of associated baseline hosts
     * @param HostCount Number of associated baseline hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Rule ID 
     * @return RuleIds Rule ID
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set Rule ID
     * @param RuleIds Rule ID
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get Host ID 
     * @return HostIds Host ID
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set Host ID
     * @param HostIds Host ID
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get Host IP 
     * @return HostIps Host IP
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set Host IP
     * @param HostIps Host IP
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Get Whether the system default 
     * @return IsDefault Whether the system default
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the system default
     * @param IsDefault Whether the system default
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    public BaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicy(BaselinePolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DetectInterval != null) {
            this.DetectInterval = new Long(source.DetectInterval);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DetectInterval", this.DetectInterval);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

