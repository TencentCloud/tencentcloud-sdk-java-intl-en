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

public class RiskDnsPolicy extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy type [0: system; 1: user]
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy action [0: alarm; 1: allow; 2:intercept + alarm]
    */
    @SerializedName("PolicyAction")
    @Expose
    private Long PolicyAction;

    /**
    * Host range [1: all Professional + Ultimate Editions|2: all Ultimate Editions|0: partial hosts]
    */
    @SerializedName("HostScope")
    @Expose
    private Long HostScope;

    /**
    * Host ID
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Domain name (when used as an input parameter, it needs base64 encode.)
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Whether effective [0: effective,1: not effective]
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy description
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * Whether to process previous events [0: no|1: yes]
    */
    @SerializedName("IsDealOldEvent")
    @Expose
    private Long IsDealOldEvent;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy type [0: system; 1: user] 
     * @return PolicyType Policy type [0: system; 1: user]
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type [0: system; 1: user]
     * @param PolicyType Policy type [0: system; 1: user]
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy action [0: alarm; 1: allow; 2:intercept + alarm] 
     * @return PolicyAction Policy action [0: alarm; 1: allow; 2:intercept + alarm]
     */
    public Long getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set Policy action [0: alarm; 1: allow; 2:intercept + alarm]
     * @param PolicyAction Policy action [0: alarm; 1: allow; 2:intercept + alarm]
     */
    public void setPolicyAction(Long PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get Host range [1: all Professional + Ultimate Editions|2: all Ultimate Editions|0: partial hosts] 
     * @return HostScope Host range [1: all Professional + Ultimate Editions|2: all Ultimate Editions|0: partial hosts]
     */
    public Long getHostScope() {
        return this.HostScope;
    }

    /**
     * Set Host range [1: all Professional + Ultimate Editions|2: all Ultimate Editions|0: partial hosts]
     * @param HostScope Host range [1: all Professional + Ultimate Editions|2: all Ultimate Editions|0: partial hosts]
     */
    public void setHostScope(Long HostScope) {
        this.HostScope = HostScope;
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
     * Get Domain name (when used as an input parameter, it needs base64 encode.) 
     * @return Domains Domain name (when used as an input parameter, it needs base64 encode.)
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Domain name (when used as an input parameter, it needs base64 encode.)
     * @param Domains Domain name (when used as an input parameter, it needs base64 encode.)
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Whether effective [0: effective,1: not effective] 
     * @return IsEnabled Whether effective [0: effective,1: not effective]
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether effective [0: effective,1: not effective]
     * @param IsEnabled Whether effective [0: effective,1: not effective]
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
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
     * Get Policy description 
     * @return PolicyDesc Policy description
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set Policy description
     * @param PolicyDesc Policy description
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get Whether to process previous events [0: no|1: yes] 
     * @return IsDealOldEvent Whether to process previous events [0: no|1: yes]
     */
    public Long getIsDealOldEvent() {
        return this.IsDealOldEvent;
    }

    /**
     * Set Whether to process previous events [0: no|1: yes]
     * @param IsDealOldEvent Whether to process previous events [0: no|1: yes]
     */
    public void setIsDealOldEvent(Long IsDealOldEvent) {
        this.IsDealOldEvent = IsDealOldEvent;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public RiskDnsPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsPolicy(RiskDnsPolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new Long(source.PolicyAction);
        }
        if (source.HostScope != null) {
            this.HostScope = new Long(source.HostScope);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.IsDealOldEvent != null) {
            this.IsDealOldEvent = new Long(source.IsDealOldEvent);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamSimple(map, prefix + "HostScope", this.HostScope);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "IsDealOldEvent", this.IsDealOldEvent);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

