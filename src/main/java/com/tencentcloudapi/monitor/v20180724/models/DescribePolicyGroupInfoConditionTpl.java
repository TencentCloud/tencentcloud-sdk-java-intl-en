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

public class DescribePolicyGroupInfoConditionTpl extends AbstractModel {

    /**
    * Policy group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Policy group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Policy type.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Policy group remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Uin that was last edited.
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * Update time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * Whether the 'AND' rule is used.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get Policy group ID. 
     * @return GroupId Policy group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID.
     * @param GroupId Policy group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

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
     * Get Policy group remarks. 
     * @return Remark Policy group remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Policy group remarks.
     * @param Remark Policy group remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get Update time.
Note: This field may return null, indicating that no valid value was found. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid value was found.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid value was found. 
     * @return InsertTime Creation time.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid value was found.
     * @param InsertTime Creation time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
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

    public DescribePolicyGroupInfoConditionTpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoConditionTpl(DescribePolicyGroupInfoConditionTpl source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

