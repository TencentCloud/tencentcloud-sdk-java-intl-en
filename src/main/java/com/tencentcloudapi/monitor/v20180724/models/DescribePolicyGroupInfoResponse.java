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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoResponse extends AbstractModel {

    /**
    * Policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * ID of the project to which the policy group belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Policy type.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Policy description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Policy type name.
    */
    @SerializedName("ShowName")
    @Expose
    private String ShowName;

    /**
    * Uin that was last edited.
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * Last edited time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Regions supported by this policy.
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * List of policy type dimensions.
    */
    @SerializedName("DimensionGroup")
    @Expose
    private String [] DimensionGroup;

    /**
    * Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ConditionsConfig")
    @Expose
    private DescribePolicyGroupInfoCondition [] ConditionsConfig;

    /**
    * Product event rule list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventConfig")
    @Expose
    private DescribePolicyGroupInfoEventCondition [] EventConfig;

    /**
    * Recipient list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos;

    /**
    * User callback information.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Callback")
    @Expose
    private DescribePolicyGroupInfoCallback Callback;

    /**
    * Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ConditionsTemp")
    @Expose
    private DescribePolicyGroupInfoConditionTpl ConditionsTemp;

    /**
    * Whether the policy can be configured as the default policy.
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Policy group name. 
     * @return GroupName Policy group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Policy group name.
     * @param GroupName Policy group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get ID of the project to which the policy group belongs. 
     * @return ProjectId ID of the project to which the policy group belongs.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the policy group belongs.
     * @param ProjectId ID of the project to which the policy group belongs.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy. 
     * @return IsDefault Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     * @param IsDefault Whether it is the default policy. The value 0 indicates that it is not the default policy. The value 1 indicates that it is the default policy.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Policy type. 
     * @return ViewName Policy type.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Policy type.
     * @param ViewName Policy type.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Policy description 
     * @return Remark Policy description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Policy description
     * @param Remark Policy description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Policy type name. 
     * @return ShowName Policy type name.
     */
    public String getShowName() {
        return this.ShowName;
    }

    /**
     * Set Policy type name.
     * @param ShowName Policy type name.
     */
    public void setShowName(String ShowName) {
        this.ShowName = ShowName;
    }

    /**
     * Get Uin that was last edited. 
     * @return LastEditUin Uin that was last edited.
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set Uin that was last edited.
     * @param LastEditUin Uin that was last edited.
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get Last edited time. 
     * @return UpdateTime Last edited time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last edited time.
     * @param UpdateTime Last edited time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Regions supported by this policy. 
     * @return Region Regions supported by this policy.
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set Regions supported by this policy.
     * @param Region Regions supported by this policy.
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get List of policy type dimensions. 
     * @return DimensionGroup List of policy type dimensions.
     */
    public String [] getDimensionGroup() {
        return this.DimensionGroup;
    }

    /**
     * Set List of policy type dimensions.
     * @param DimensionGroup List of policy type dimensions.
     */
    public void setDimensionGroup(String [] DimensionGroup) {
        this.DimensionGroup = DimensionGroup;
    }

    /**
     * Get Threshold rule list.
Note: This field may return null, indicating that no valid value was found. 
     * @return ConditionsConfig Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoCondition [] getConditionsConfig() {
        return this.ConditionsConfig;
    }

    /**
     * Set Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     * @param ConditionsConfig Threshold rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setConditionsConfig(DescribePolicyGroupInfoCondition [] ConditionsConfig) {
        this.ConditionsConfig = ConditionsConfig;
    }

    /**
     * Get Product event rule list.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventConfig Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoEventCondition [] getEventConfig() {
        return this.EventConfig;
    }

    /**
     * Set Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     * @param EventConfig Product event rule list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventConfig(DescribePolicyGroupInfoEventCondition [] EventConfig) {
        this.EventConfig = EventConfig;
    }

    /**
     * Get Recipient list.
Note: This field may return null, indicating that no valid value was found. 
     * @return ReceiverInfos Recipient list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set Recipient list.
Note: This field may return null, indicating that no valid value was found.
     * @param ReceiverInfos Recipient list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setReceiverInfos(DescribePolicyGroupInfoReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get User callback information.
Note: This field may return null, indicating that no valid value was found. 
     * @return Callback User callback information.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoCallback getCallback() {
        return this.Callback;
    }

    /**
     * Set User callback information.
Note: This field may return null, indicating that no valid value was found.
     * @param Callback User callback information.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCallback(DescribePolicyGroupInfoCallback Callback) {
        this.Callback = Callback;
    }

    /**
     * Get Template-based policy group.
Note: This field may return null, indicating that no valid value was found. 
     * @return ConditionsTemp Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupInfoConditionTpl getConditionsTemp() {
        return this.ConditionsTemp;
    }

    /**
     * Set Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     * @param ConditionsTemp Template-based policy group.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setConditionsTemp(DescribePolicyGroupInfoConditionTpl ConditionsTemp) {
        this.ConditionsTemp = ConditionsTemp;
    }

    /**
     * Get Whether the policy can be configured as the default policy. 
     * @return CanSetDefault Whether the policy can be configured as the default policy.
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set Whether the policy can be configured as the default policy.
     * @param CanSetDefault Whether the policy can be configured as the default policy.
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found. 
     * @return IsUnionRule Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found.
     * @param IsUnionRule Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePolicyGroupInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoResponse(DescribePolicyGroupInfoResponse source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ShowName != null) {
            this.ShowName = new String(source.ShowName);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.DimensionGroup != null) {
            this.DimensionGroup = new String[source.DimensionGroup.length];
            for (int i = 0; i < source.DimensionGroup.length; i++) {
                this.DimensionGroup[i] = new String(source.DimensionGroup[i]);
            }
        }
        if (source.ConditionsConfig != null) {
            this.ConditionsConfig = new DescribePolicyGroupInfoCondition[source.ConditionsConfig.length];
            for (int i = 0; i < source.ConditionsConfig.length; i++) {
                this.ConditionsConfig[i] = new DescribePolicyGroupInfoCondition(source.ConditionsConfig[i]);
            }
        }
        if (source.EventConfig != null) {
            this.EventConfig = new DescribePolicyGroupInfoEventCondition[source.EventConfig.length];
            for (int i = 0; i < source.EventConfig.length; i++) {
                this.EventConfig[i] = new DescribePolicyGroupInfoEventCondition(source.EventConfig[i]);
            }
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new DescribePolicyGroupInfoReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new DescribePolicyGroupInfoReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.Callback != null) {
            this.Callback = new DescribePolicyGroupInfoCallback(source.Callback);
        }
        if (source.ConditionsTemp != null) {
            this.ConditionsTemp = new DescribePolicyGroupInfoConditionTpl(source.ConditionsTemp);
        }
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ShowName", this.ShowName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamArraySimple(map, prefix + "DimensionGroup.", this.DimensionGroup);
        this.setParamArrayObj(map, prefix + "ConditionsConfig.", this.ConditionsConfig);
        this.setParamArrayObj(map, prefix + "EventConfig.", this.EventConfig);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamObj(map, prefix + "ConditionsTemp.", this.ConditionsTemp);
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

