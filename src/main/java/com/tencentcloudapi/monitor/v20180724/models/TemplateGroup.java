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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateGroup extends AbstractModel{

    /**
    * Metric alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Conditions")
    @Expose
    private Condition [] Conditions;

    /**
    * Event alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EventConditions")
    @Expose
    private EventCondition [] EventConditions;

    /**
    * The associated alarm policy groups.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyGroups")
    @Expose
    private PolicyGroup [] PolicyGroups;

    /**
    * Template-based policy group ID.
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * Template-based policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Creation time.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * UIN of the last modifier.
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * View.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Whether the logical relationship between rules is AND.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get Metric alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Conditions Metric alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Condition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Metric alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Conditions Metric alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConditions(Condition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Event alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EventConditions Event alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set Event alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EventConditions Event alarm rules.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEventConditions(EventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    /**
     * Get The associated alarm policy groups.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PolicyGroups The associated alarm policy groups.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public PolicyGroup [] getPolicyGroups() {
        return this.PolicyGroups;
    }

    /**
     * Set The associated alarm policy groups.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PolicyGroups The associated alarm policy groups.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPolicyGroups(PolicyGroup [] PolicyGroups) {
        this.PolicyGroups = PolicyGroups;
    }

    /**
     * Get Template-based policy group ID. 
     * @return GroupID Template-based policy group ID.
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Template-based policy group ID.
     * @param GroupID Template-based policy group ID.
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get Template-based policy group name. 
     * @return GroupName Template-based policy group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Template-based policy group name.
     * @param GroupName Template-based policy group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Creation time. 
     * @return InsertTime Creation time.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
     * @param InsertTime Creation time.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get UIN of the last modifier. 
     * @return LastEditUin UIN of the last modifier.
     */
    public Long getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set UIN of the last modifier.
     * @param LastEditUin UIN of the last modifier.
     */
    public void setLastEditUin(Long LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get View. 
     * @return ViewName View.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set View.
     * @param ViewName View.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Whether the logical relationship between rules is AND. 
     * @return IsUnionRule Whether the logical relationship between rules is AND.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set Whether the logical relationship between rules is AND.
     * @param IsUnionRule Whether the logical relationship between rules is AND.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    public TemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroup(TemplateGroup source) {
        if (source.Conditions != null) {
            this.Conditions = new Condition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new Condition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new EventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new EventCondition(source.EventConditions[i]);
            }
        }
        if (source.PolicyGroups != null) {
            this.PolicyGroups = new PolicyGroup[source.PolicyGroups.length];
            for (int i = 0; i < source.PolicyGroups.length; i++) {
                this.PolicyGroups[i] = new PolicyGroup(source.PolicyGroups[i]);
            }
        }
        if (source.GroupID != null) {
            this.GroupID = new Long(source.GroupID);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new Long(source.LastEditUin);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);
        this.setParamArrayObj(map, prefix + "PolicyGroups.", this.PolicyGroups);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

