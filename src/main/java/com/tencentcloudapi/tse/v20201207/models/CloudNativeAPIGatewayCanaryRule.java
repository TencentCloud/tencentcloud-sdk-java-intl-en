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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayCanaryRule extends AbstractModel {

    /**
    * Priority, with a range of 0 to 100. A larger value indicates a higher priority. Priorities must be unique across different rules.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Whether the rule is enabled.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Match condition parameter
    */
    @SerializedName("ConditionList")
    @Expose
    private CloudNativeAPIGatewayCanaryRuleCondition [] ConditionList;

    /**
    * Traffic percentage configuration of the service
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BalancedServiceList")
    @Expose
    private CloudNativeAPIGatewayBalancedService [] BalancedServiceList;

    /**
    * service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Grayscale rule type
Standard｜Lane
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Full-link grayscale policy match mode between multiple conditions: AND, OR
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Lane group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Lane group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Lane ID
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * swimlane name
    */
    @SerializedName("LaneName")
    @Expose
    private String LaneName;

    /**
    * Lane match rule: STRICT | PERMISSIVE
    */
    @SerializedName("MatchMode")
    @Expose
    private String MatchMode;

    /**
    * Lane tag
    */
    @SerializedName("LaneTag")
    @Expose
    private String LaneTag;

    /**
     * Get Priority, with a range of 0 to 100. A larger value indicates a higher priority. Priorities must be unique across different rules. 
     * @return Priority Priority, with a range of 0 to 100. A larger value indicates a higher priority. Priorities must be unique across different rules.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority, with a range of 0 to 100. A larger value indicates a higher priority. Priorities must be unique across different rules.
     * @param Priority Priority, with a range of 0 to 100. A larger value indicates a higher priority. Priorities must be unique across different rules.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Whether the rule is enabled. 
     * @return Enabled Whether the rule is enabled.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the rule is enabled.
     * @param Enabled Whether the rule is enabled.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Match condition parameter 
     * @return ConditionList Match condition parameter
     */
    public CloudNativeAPIGatewayCanaryRuleCondition [] getConditionList() {
        return this.ConditionList;
    }

    /**
     * Set Match condition parameter
     * @param ConditionList Match condition parameter
     */
    public void setConditionList(CloudNativeAPIGatewayCanaryRuleCondition [] ConditionList) {
        this.ConditionList = ConditionList;
    }

    /**
     * Get Traffic percentage configuration of the service
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BalancedServiceList Traffic percentage configuration of the service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CloudNativeAPIGatewayBalancedService [] getBalancedServiceList() {
        return this.BalancedServiceList;
    }

    /**
     * Set Traffic percentage configuration of the service
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BalancedServiceList Traffic percentage configuration of the service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBalancedServiceList(CloudNativeAPIGatewayBalancedService [] BalancedServiceList) {
        this.BalancedServiceList = BalancedServiceList;
    }

    /**
     * Get service ID 
     * @return ServiceId service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set service ID
     * @param ServiceId service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Service name 
     * @return ServiceName Service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
     * @param ServiceName Service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Grayscale rule type
Standard｜Lane 
     * @return RuleType Grayscale rule type
Standard｜Lane
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Grayscale rule type
Standard｜Lane
     * @param RuleType Grayscale rule type
Standard｜Lane
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Full-link grayscale policy match mode between multiple conditions: AND, OR 
     * @return MatchType Full-link grayscale policy match mode between multiple conditions: AND, OR
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Full-link grayscale policy match mode between multiple conditions: AND, OR
     * @param MatchType Full-link grayscale policy match mode between multiple conditions: AND, OR
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Lane group ID 
     * @return GroupId Lane group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Lane group ID
     * @param GroupId Lane group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Lane group name 
     * @return GroupName Lane group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Lane group name
     * @param GroupName Lane group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Lane ID 
     * @return LaneId Lane ID
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set Lane ID
     * @param LaneId Lane ID
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get swimlane name 
     * @return LaneName swimlane name
     */
    public String getLaneName() {
        return this.LaneName;
    }

    /**
     * Set swimlane name
     * @param LaneName swimlane name
     */
    public void setLaneName(String LaneName) {
        this.LaneName = LaneName;
    }

    /**
     * Get Lane match rule: STRICT | PERMISSIVE 
     * @return MatchMode Lane match rule: STRICT | PERMISSIVE
     */
    public String getMatchMode() {
        return this.MatchMode;
    }

    /**
     * Set Lane match rule: STRICT | PERMISSIVE
     * @param MatchMode Lane match rule: STRICT | PERMISSIVE
     */
    public void setMatchMode(String MatchMode) {
        this.MatchMode = MatchMode;
    }

    /**
     * Get Lane tag 
     * @return LaneTag Lane tag
     */
    public String getLaneTag() {
        return this.LaneTag;
    }

    /**
     * Set Lane tag
     * @param LaneTag Lane tag
     */
    public void setLaneTag(String LaneTag) {
        this.LaneTag = LaneTag;
    }

    public CloudNativeAPIGatewayCanaryRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayCanaryRule(CloudNativeAPIGatewayCanaryRule source) {
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ConditionList != null) {
            this.ConditionList = new CloudNativeAPIGatewayCanaryRuleCondition[source.ConditionList.length];
            for (int i = 0; i < source.ConditionList.length; i++) {
                this.ConditionList[i] = new CloudNativeAPIGatewayCanaryRuleCondition(source.ConditionList[i]);
            }
        }
        if (source.BalancedServiceList != null) {
            this.BalancedServiceList = new CloudNativeAPIGatewayBalancedService[source.BalancedServiceList.length];
            for (int i = 0; i < source.BalancedServiceList.length; i++) {
                this.BalancedServiceList[i] = new CloudNativeAPIGatewayBalancedService(source.BalancedServiceList[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
        if (source.LaneName != null) {
            this.LaneName = new String(source.LaneName);
        }
        if (source.MatchMode != null) {
            this.MatchMode = new String(source.MatchMode);
        }
        if (source.LaneTag != null) {
            this.LaneTag = new String(source.LaneTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "ConditionList.", this.ConditionList);
        this.setParamArrayObj(map, prefix + "BalancedServiceList.", this.BalancedServiceList);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "LaneName", this.LaneName);
        this.setParamSimple(map, prefix + "MatchMode", this.MatchMode);
        this.setParamSimple(map, prefix + "LaneTag", this.LaneTag);

    }
}

