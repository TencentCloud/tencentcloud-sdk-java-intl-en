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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedUserPolicy extends AbstractModel{

    /**
    * Policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy type (`1`: custom policy; `2`: preset policy).
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * Creation mode (`1`: create by product feature or project permission; other values: create by policy syntax).
    */
    @SerializedName("CreateMode")
    @Expose
    private String CreateMode;

    /**
    * Information on policies inherited from the user group.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Groups")
    @Expose
    private AttachedUserPolicyGroupInfo [] Groups;

    /**
    * Whether the product has been deprecated (`0`: no; `1`: yes).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * List of deprecated products.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
     * Get Policy ID. 
     * @return PolicyId Policy ID.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID.
     * @param PolicyId Policy ID.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

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
     * Get Policy description. 
     * @return Description Policy description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description.
     * @param Description Policy description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time. 
     * @return AddTime Creation time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time.
     * @param AddTime Creation time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy type (`1`: custom policy; `2`: preset policy). 
     * @return StrategyType Policy type (`1`: custom policy; `2`: preset policy).
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type (`1`: custom policy; `2`: preset policy).
     * @param StrategyType Policy type (`1`: custom policy; `2`: preset policy).
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Creation mode (`1`: create by product feature or project permission; other values: create by policy syntax). 
     * @return CreateMode Creation mode (`1`: create by product feature or project permission; other values: create by policy syntax).
     */
    public String getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set Creation mode (`1`: create by product feature or project permission; other values: create by policy syntax).
     * @param CreateMode Creation mode (`1`: create by product feature or project permission; other values: create by policy syntax).
     */
    public void setCreateMode(String CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Information on policies inherited from the user group.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Groups Information on policies inherited from the user group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AttachedUserPolicyGroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set Information on policies inherited from the user group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Groups Information on policies inherited from the user group.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setGroups(AttachedUserPolicyGroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get Whether the product has been deprecated (`0`: no; `1`: yes).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Deactived Whether the product has been deprecated (`0`: no; `1`: yes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set Whether the product has been deprecated (`0`: no; `1`: yes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Deactived Whether the product has been deprecated (`0`: no; `1`: yes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get List of deprecated products.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DeactivedDetail List of deprecated products.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set List of deprecated products.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DeactivedDetail List of deprecated products.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    public AttachedUserPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedUserPolicy(AttachedUserPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new String(source.CreateMode);
        }
        if (source.Groups != null) {
            this.Groups = new AttachedUserPolicyGroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new AttachedUserPolicyGroupInfo(source.Groups[i]);
            }
        }
        if (source.Deactived != null) {
            this.Deactived = new Long(source.Deactived);
        }
        if (source.DeactivedDetail != null) {
            this.DeactivedDetail = new String[source.DeactivedDetail.length];
            for (int i = 0; i < source.DeactivedDetail.length; i++) {
                this.DeactivedDetail[i] = new String(source.DeactivedDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);

    }
}

