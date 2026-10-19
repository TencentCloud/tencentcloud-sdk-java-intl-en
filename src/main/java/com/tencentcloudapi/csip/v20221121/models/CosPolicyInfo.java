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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPolicyInfo extends AbstractModel {

    /**
    * Policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy type
PolicyType: 1 alarm policy 2 risk policy 3 allowlist policy 4 ip hiding policy
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * system: system built-in user: user-customized
    */
    @SerializedName("PolicySource")
    @Expose
    private Long PolicySource;

    /**
    * Policy content
    */
    @SerializedName("PolicyContent")
    @Expose
    private String PolicyContent;

    /**
    * 0: disabled
1: enabled.
    */
    @SerializedName("PolicyStatus")
    @Expose
    private Long PolicyStatus;

    /**
    * Policy classification
    */
    @SerializedName("PolicyAbnormalType")
    @Expose
    private Long PolicyAbnormalType;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Creation time.
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private Long PolicyCreateTime;

    /**
    * Update time.
    */
    @SerializedName("PolicyUpdateTime")
    @Expose
    private Long PolicyUpdateTime;

    /**
    * Number of policy hits in the last 7 days
    */
    @SerializedName("PolicyHitCount")
    @Expose
    private Long PolicyHitCount;

    /**
    * Alarm content hash
    */
    @SerializedName("PolicyContentHash")
    @Expose
    private String PolicyContentHash;

    /**
    * Number of associated accounts.
    */
    @SerializedName("RelAccountCount")
    @Expose
    private Long RelAccountCount;

    /**
    * Associated account UIN
    */
    @SerializedName("RelAccountUin")
    @Expose
    private String RelAccountUin;

    /**
    * Name of the associated account
    */
    @SerializedName("RelAccountName")
    @Expose
    private String RelAccountName;

    /**
    * Description information
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * Remarks
    */
    @SerializedName("PolicyMarker")
    @Expose
    private String PolicyMarker;

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * id set in a multi-account scenario
    */
    @SerializedName("PolicyIdSet")
    @Expose
    private Long [] PolicyIdSet;

    /**
    * Whether to dispose of historical data status. 0: no disposal required. 1: disposal required. 2: processed
    */
    @SerializedName("PolicyHistoryHandleStatus")
    @Expose
    private Long PolicyHistoryHandleStatus;

    /**
    * System policy edit status
    */
    @SerializedName("SystemPolicyEditStatus")
    @Expose
    private Long SystemPolicyEditStatus;

    /**
     * Get Policy name. 
     * @return PolicyName Policy name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name.
     * @param PolicyName Policy name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy type
PolicyType: 1 alarm policy 2 risk policy 3 allowlist policy 4 ip hiding policy 
     * @return PolicyType Policy type
PolicyType: 1 alarm policy 2 risk policy 3 allowlist policy 4 ip hiding policy
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type
PolicyType: 1 alarm policy 2 risk policy 3 allowlist policy 4 ip hiding policy
     * @param PolicyType Policy type
PolicyType: 1 alarm policy 2 risk policy 3 allowlist policy 4 ip hiding policy
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get system: system built-in user: user-customized 
     * @return PolicySource system: system built-in user: user-customized
     */
    public Long getPolicySource() {
        return this.PolicySource;
    }

    /**
     * Set system: system built-in user: user-customized
     * @param PolicySource system: system built-in user: user-customized
     */
    public void setPolicySource(Long PolicySource) {
        this.PolicySource = PolicySource;
    }

    /**
     * Get Policy content 
     * @return PolicyContent Policy content
     */
    public String getPolicyContent() {
        return this.PolicyContent;
    }

    /**
     * Set Policy content
     * @param PolicyContent Policy content
     */
    public void setPolicyContent(String PolicyContent) {
        this.PolicyContent = PolicyContent;
    }

    /**
     * Get 0: disabled
1: enabled. 
     * @return PolicyStatus 0: disabled
1: enabled.
     */
    public Long getPolicyStatus() {
        return this.PolicyStatus;
    }

    /**
     * Set 0: disabled
1: enabled.
     * @param PolicyStatus 0: disabled
1: enabled.
     */
    public void setPolicyStatus(Long PolicyStatus) {
        this.PolicyStatus = PolicyStatus;
    }

    /**
     * Get Policy classification 
     * @return PolicyAbnormalType Policy classification
     */
    public Long getPolicyAbnormalType() {
        return this.PolicyAbnormalType;
    }

    /**
     * Set Policy classification
     * @param PolicyAbnormalType Policy classification
     */
    public void setPolicyAbnormalType(Long PolicyAbnormalType) {
        this.PolicyAbnormalType = PolicyAbnormalType;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Creation time. 
     * @return PolicyCreateTime Creation time.
     */
    public Long getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set Creation time.
     * @param PolicyCreateTime Creation time.
     */
    public void setPolicyCreateTime(Long PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get Update time. 
     * @return PolicyUpdateTime Update time.
     */
    public Long getPolicyUpdateTime() {
        return this.PolicyUpdateTime;
    }

    /**
     * Set Update time.
     * @param PolicyUpdateTime Update time.
     */
    public void setPolicyUpdateTime(Long PolicyUpdateTime) {
        this.PolicyUpdateTime = PolicyUpdateTime;
    }

    /**
     * Get Number of policy hits in the last 7 days 
     * @return PolicyHitCount Number of policy hits in the last 7 days
     */
    public Long getPolicyHitCount() {
        return this.PolicyHitCount;
    }

    /**
     * Set Number of policy hits in the last 7 days
     * @param PolicyHitCount Number of policy hits in the last 7 days
     */
    public void setPolicyHitCount(Long PolicyHitCount) {
        this.PolicyHitCount = PolicyHitCount;
    }

    /**
     * Get Alarm content hash 
     * @return PolicyContentHash Alarm content hash
     */
    public String getPolicyContentHash() {
        return this.PolicyContentHash;
    }

    /**
     * Set Alarm content hash
     * @param PolicyContentHash Alarm content hash
     */
    public void setPolicyContentHash(String PolicyContentHash) {
        this.PolicyContentHash = PolicyContentHash;
    }

    /**
     * Get Number of associated accounts. 
     * @return RelAccountCount Number of associated accounts.
     */
    public Long getRelAccountCount() {
        return this.RelAccountCount;
    }

    /**
     * Set Number of associated accounts.
     * @param RelAccountCount Number of associated accounts.
     */
    public void setRelAccountCount(Long RelAccountCount) {
        this.RelAccountCount = RelAccountCount;
    }

    /**
     * Get Associated account UIN 
     * @return RelAccountUin Associated account UIN
     */
    public String getRelAccountUin() {
        return this.RelAccountUin;
    }

    /**
     * Set Associated account UIN
     * @param RelAccountUin Associated account UIN
     */
    public void setRelAccountUin(String RelAccountUin) {
        this.RelAccountUin = RelAccountUin;
    }

    /**
     * Get Name of the associated account 
     * @return RelAccountName Name of the associated account
     */
    public String getRelAccountName() {
        return this.RelAccountName;
    }

    /**
     * Set Name of the associated account
     * @param RelAccountName Name of the associated account
     */
    public void setRelAccountName(String RelAccountName) {
        this.RelAccountName = RelAccountName;
    }

    /**
     * Get Description information 
     * @return PolicyDescription Description information
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set Description information
     * @param PolicyDescription Description information
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get Remarks 
     * @return PolicyMarker Remarks
     */
    public String getPolicyMarker() {
        return this.PolicyMarker;
    }

    /**
     * Set Remarks
     * @param PolicyMarker Remarks
     */
    public void setPolicyMarker(String PolicyMarker) {
        this.PolicyMarker = PolicyMarker;
    }

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get id set in a multi-account scenario 
     * @return PolicyIdSet id set in a multi-account scenario
     */
    public Long [] getPolicyIdSet() {
        return this.PolicyIdSet;
    }

    /**
     * Set id set in a multi-account scenario
     * @param PolicyIdSet id set in a multi-account scenario
     */
    public void setPolicyIdSet(Long [] PolicyIdSet) {
        this.PolicyIdSet = PolicyIdSet;
    }

    /**
     * Get Whether to dispose of historical data status. 0: no disposal required. 1: disposal required. 2: processed 
     * @return PolicyHistoryHandleStatus Whether to dispose of historical data status. 0: no disposal required. 1: disposal required. 2: processed
     */
    public Long getPolicyHistoryHandleStatus() {
        return this.PolicyHistoryHandleStatus;
    }

    /**
     * Set Whether to dispose of historical data status. 0: no disposal required. 1: disposal required. 2: processed
     * @param PolicyHistoryHandleStatus Whether to dispose of historical data status. 0: no disposal required. 1: disposal required. 2: processed
     */
    public void setPolicyHistoryHandleStatus(Long PolicyHistoryHandleStatus) {
        this.PolicyHistoryHandleStatus = PolicyHistoryHandleStatus;
    }

    /**
     * Get System policy edit status 
     * @return SystemPolicyEditStatus System policy edit status
     */
    public Long getSystemPolicyEditStatus() {
        return this.SystemPolicyEditStatus;
    }

    /**
     * Set System policy edit status
     * @param SystemPolicyEditStatus System policy edit status
     */
    public void setSystemPolicyEditStatus(Long SystemPolicyEditStatus) {
        this.SystemPolicyEditStatus = SystemPolicyEditStatus;
    }

    public CosPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPolicyInfo(CosPolicyInfo source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicySource != null) {
            this.PolicySource = new Long(source.PolicySource);
        }
        if (source.PolicyContent != null) {
            this.PolicyContent = new String(source.PolicyContent);
        }
        if (source.PolicyStatus != null) {
            this.PolicyStatus = new Long(source.PolicyStatus);
        }
        if (source.PolicyAbnormalType != null) {
            this.PolicyAbnormalType = new Long(source.PolicyAbnormalType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new Long(source.PolicyCreateTime);
        }
        if (source.PolicyUpdateTime != null) {
            this.PolicyUpdateTime = new Long(source.PolicyUpdateTime);
        }
        if (source.PolicyHitCount != null) {
            this.PolicyHitCount = new Long(source.PolicyHitCount);
        }
        if (source.PolicyContentHash != null) {
            this.PolicyContentHash = new String(source.PolicyContentHash);
        }
        if (source.RelAccountCount != null) {
            this.RelAccountCount = new Long(source.RelAccountCount);
        }
        if (source.RelAccountUin != null) {
            this.RelAccountUin = new String(source.RelAccountUin);
        }
        if (source.RelAccountName != null) {
            this.RelAccountName = new String(source.RelAccountName);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.PolicyMarker != null) {
            this.PolicyMarker = new String(source.PolicyMarker);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyIdSet != null) {
            this.PolicyIdSet = new Long[source.PolicyIdSet.length];
            for (int i = 0; i < source.PolicyIdSet.length; i++) {
                this.PolicyIdSet[i] = new Long(source.PolicyIdSet[i]);
            }
        }
        if (source.PolicyHistoryHandleStatus != null) {
            this.PolicyHistoryHandleStatus = new Long(source.PolicyHistoryHandleStatus);
        }
        if (source.SystemPolicyEditStatus != null) {
            this.SystemPolicyEditStatus = new Long(source.SystemPolicyEditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicySource", this.PolicySource);
        this.setParamSimple(map, prefix + "PolicyContent", this.PolicyContent);
        this.setParamSimple(map, prefix + "PolicyStatus", this.PolicyStatus);
        this.setParamSimple(map, prefix + "PolicyAbnormalType", this.PolicyAbnormalType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "PolicyUpdateTime", this.PolicyUpdateTime);
        this.setParamSimple(map, prefix + "PolicyHitCount", this.PolicyHitCount);
        this.setParamSimple(map, prefix + "PolicyContentHash", this.PolicyContentHash);
        this.setParamSimple(map, prefix + "RelAccountCount", this.RelAccountCount);
        this.setParamSimple(map, prefix + "RelAccountUin", this.RelAccountUin);
        this.setParamSimple(map, prefix + "RelAccountName", this.RelAccountName);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "PolicyMarker", this.PolicyMarker);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "PolicyIdSet.", this.PolicyIdSet);
        this.setParamSimple(map, prefix + "PolicyHistoryHandleStatus", this.PolicyHistoryHandleStatus);
        this.setParamSimple(map, prefix + "SystemPolicyEditStatus", this.SystemPolicyEditStatus);

    }
}

