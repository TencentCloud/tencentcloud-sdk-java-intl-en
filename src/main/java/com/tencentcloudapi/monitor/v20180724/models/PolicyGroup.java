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

public class PolicyGroup extends AbstractModel{

    /**
    * Whether the alarm policy can be set to default.
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * Alarm policy group ID.
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * Alarm policy group name.
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
    * Whether the alarm policy is set to default.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Whether the alarm policy is enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * UIN of the last modifier.
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * Number of unshielded instances.
    */
    @SerializedName("NoShieldedInstanceCount")
    @Expose
    private Long NoShieldedInstanceCount;

    /**
    * Parent policy group ID.
    */
    @SerializedName("ParentGroupID")
    @Expose
    private Long ParentGroupID;

    /**
    * Project ID.
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Alarm recipient information.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private PolicyGroupReceiverInfo [] ReceiverInfos;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * The total number of associated instances.
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

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
     * Get Whether the alarm policy can be set to default. 
     * @return CanSetDefault Whether the alarm policy can be set to default.
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set Whether the alarm policy can be set to default.
     * @param CanSetDefault Whether the alarm policy can be set to default.
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get Alarm policy group ID. 
     * @return GroupID Alarm policy group ID.
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Alarm policy group ID.
     * @param GroupID Alarm policy group ID.
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get Alarm policy group name. 
     * @return GroupName Alarm policy group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Alarm policy group name.
     * @param GroupName Alarm policy group name.
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
     * Get Whether the alarm policy is set to default. 
     * @return IsDefault Whether the alarm policy is set to default.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the alarm policy is set to default.
     * @param IsDefault Whether the alarm policy is set to default.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the alarm policy is enabled. 
     * @return Enable Whether the alarm policy is enabled.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the alarm policy is enabled.
     * @param Enable Whether the alarm policy is enabled.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
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
     * Get Number of unshielded instances. 
     * @return NoShieldedInstanceCount Number of unshielded instances.
     */
    public Long getNoShieldedInstanceCount() {
        return this.NoShieldedInstanceCount;
    }

    /**
     * Set Number of unshielded instances.
     * @param NoShieldedInstanceCount Number of unshielded instances.
     */
    public void setNoShieldedInstanceCount(Long NoShieldedInstanceCount) {
        this.NoShieldedInstanceCount = NoShieldedInstanceCount;
    }

    /**
     * Get Parent policy group ID. 
     * @return ParentGroupID Parent policy group ID.
     */
    public Long getParentGroupID() {
        return this.ParentGroupID;
    }

    /**
     * Set Parent policy group ID.
     * @param ParentGroupID Parent policy group ID.
     */
    public void setParentGroupID(Long ParentGroupID) {
        this.ParentGroupID = ParentGroupID;
    }

    /**
     * Get Project ID. 
     * @return ProjectID Project ID.
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID.
     * @param ProjectID Project ID.
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Alarm recipient information.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ReceiverInfos Alarm recipient information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public PolicyGroupReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set Alarm recipient information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ReceiverInfos Alarm recipient information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReceiverInfos(PolicyGroupReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
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
     * Get Modification time. 
     * @return UpdateTime Modification time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.
     * @param UpdateTime Modification time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The total number of associated instances. 
     * @return TotalInstanceCount The total number of associated instances.
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set The total number of associated instances.
     * @param TotalInstanceCount The total number of associated instances.
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
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

    public PolicyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyGroup(PolicyGroup source) {
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
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
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new Long(source.LastEditUin);
        }
        if (source.NoShieldedInstanceCount != null) {
            this.NoShieldedInstanceCount = new Long(source.NoShieldedInstanceCount);
        }
        if (source.ParentGroupID != null) {
            this.ParentGroupID = new Long(source.ParentGroupID);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new PolicyGroupReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new PolicyGroupReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.TotalInstanceCount != null) {
            this.TotalInstanceCount = new Long(source.TotalInstanceCount);
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
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "NoShieldedInstanceCount", this.NoShieldedInstanceCount);
        this.setParamSimple(map, prefix + "ParentGroupID", this.ParentGroupID);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TotalInstanceCount", this.TotalInstanceCount);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

