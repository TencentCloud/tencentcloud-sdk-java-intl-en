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

public class ShellPolicyList extends AbstractModel {

    /**
    * Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 0: system policy, 1: custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * Policy action [0: alarm; 1: allow; 2:intercept + alarm]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyAction")
    @Expose
    private Long PolicyAction;

    /**
    * 0: enabled, 1: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Host range. [0: a group of QUuids, 1: all Pro edition hosts, 2: Premium edition, 3: all hosts.]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostScope")
    @Expose
    private Long HostScope;

    /**
     * Get Policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 0: system policy, 1: custom policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyType 0: system policy, 1: custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 0: system policy, 1: custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyType 0: system policy, 1: custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyDesc Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyDesc Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get Policy action [0: alarm; 1: allow; 2:intercept + alarm]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyAction Policy action [0: alarm; 1: allow; 2:intercept + alarm]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set Policy action [0: alarm; 1: allow; 2:intercept + alarm]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyAction Policy action [0: alarm; 1: allow; 2:intercept + alarm]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyAction(Long PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get 0: enabled, 1: disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEnabled 0: enabled, 1: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 0: enabled, 1: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEnabled 0: enabled, 1: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Host range. [0: a group of QUuids, 1: all Pro edition hosts, 2: Premium edition, 3: all hosts.]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostScope Host range. [0: a group of QUuids, 1: all Pro edition hosts, 2: Premium edition, 3: all hosts.]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostScope() {
        return this.HostScope;
    }

    /**
     * Set Host range. [0: a group of QUuids, 1: all Pro edition hosts, 2: Premium edition, 3: all hosts.]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostScope Host range. [0: a group of QUuids, 1: all Pro edition hosts, 2: Premium edition, 3: all hosts.]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostScope(Long HostScope) {
        this.HostScope = HostScope;
    }

    public ShellPolicyList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShellPolicyList(ShellPolicyList source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new Long(source.PolicyAction);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostScope != null) {
            this.HostScope = new Long(source.HostScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostScope", this.HostScope);

    }
}

