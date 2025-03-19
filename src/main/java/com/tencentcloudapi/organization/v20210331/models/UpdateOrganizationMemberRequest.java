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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrganizationMemberRequest extends AbstractModel {

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name, which contains up to 25 characters, including English letters, digits, and symbols `+@&._[]-:,`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks, which contain up to 40 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Relationship policy type. When PolicyType is not empty, PermissionIds cannot be empty. Value: Financial.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * List of member financial permission IDs. When PermissionIds is not empty, PolicyType cannot be empty.
Valid values: 1: View bills. 2: View balance. 3: Allocate funds. 4: Consolidate bills. 5: Issue invoices. 6: Inherit discounts. 7: Pay on behalf. 8: Analyze costs. 1 and 2 are required by default.
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * Whether to allow members to exit an organization. Valid values: Allow: permitted, Denied: not permitted.
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * Payer UIN, which is required when pay-on-behalf mode is used in member financial permission. The value is the principal administrator UIN of the corresponding member.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
     * Get Member UIN. 
     * @return MemberUin Member UIN.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN.
     * @param MemberUin Member UIN.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name, which contains up to 25 characters, including English letters, digits, and symbols `+@&._[]-:,`. 
     * @return Name Member name, which contains up to 25 characters, including English letters, digits, and symbols `+@&._[]-:,`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Member name, which contains up to 25 characters, including English letters, digits, and symbols `+@&._[]-:,`.
     * @param Name Member name, which contains up to 25 characters, including English letters, digits, and symbols `+@&._[]-:,`.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Remarks, which contain up to 40 characters. 
     * @return Remark Remarks, which contain up to 40 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks, which contain up to 40 characters.
     * @param Remark Remarks, which contain up to 40 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Relationship policy type. When PolicyType is not empty, PermissionIds cannot be empty. Value: Financial. 
     * @return PolicyType Relationship policy type. When PolicyType is not empty, PermissionIds cannot be empty. Value: Financial.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Relationship policy type. When PolicyType is not empty, PermissionIds cannot be empty. Value: Financial.
     * @param PolicyType Relationship policy type. When PolicyType is not empty, PermissionIds cannot be empty. Value: Financial.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get List of member financial permission IDs. When PermissionIds is not empty, PolicyType cannot be empty.
Valid values: 1: View bills. 2: View balance. 3: Allocate funds. 4: Consolidate bills. 5: Issue invoices. 6: Inherit discounts. 7: Pay on behalf. 8: Analyze costs. 1 and 2 are required by default. 
     * @return PermissionIds List of member financial permission IDs. When PermissionIds is not empty, PolicyType cannot be empty.
Valid values: 1: View bills. 2: View balance. 3: Allocate funds. 4: Consolidate bills. 5: Issue invoices. 6: Inherit discounts. 7: Pay on behalf. 8: Analyze costs. 1 and 2 are required by default.
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set List of member financial permission IDs. When PermissionIds is not empty, PolicyType cannot be empty.
Valid values: 1: View bills. 2: View balance. 3: Allocate funds. 4: Consolidate bills. 5: Issue invoices. 6: Inherit discounts. 7: Pay on behalf. 8: Analyze costs. 1 and 2 are required by default.
     * @param PermissionIds List of member financial permission IDs. When PermissionIds is not empty, PolicyType cannot be empty.
Valid values: 1: View bills. 2: View balance. 3: Allocate funds. 4: Consolidate bills. 5: Issue invoices. 6: Inherit discounts. 7: Pay on behalf. 8: Analyze costs. 1 and 2 are required by default.
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get Whether to allow members to exit an organization. Valid values: Allow: permitted, Denied: not permitted. 
     * @return IsAllowQuit Whether to allow members to exit an organization. Valid values: Allow: permitted, Denied: not permitted.
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set Whether to allow members to exit an organization. Valid values: Allow: permitted, Denied: not permitted.
     * @param IsAllowQuit Whether to allow members to exit an organization. Valid values: Allow: permitted, Denied: not permitted.
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get Payer UIN, which is required when pay-on-behalf mode is used in member financial permission. The value is the principal administrator UIN of the corresponding member. 
     * @return PayUin Payer UIN, which is required when pay-on-behalf mode is used in member financial permission. The value is the principal administrator UIN of the corresponding member.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Payer UIN, which is required when pay-on-behalf mode is used in member financial permission. The value is the principal administrator UIN of the corresponding member.
     * @param PayUin Payer UIN, which is required when pay-on-behalf mode is used in member financial permission. The value is the principal administrator UIN of the corresponding member.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    public UpdateOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationMemberRequest(UpdateOrganizationMemberRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PermissionIds != null) {
            this.PermissionIds = new Long[source.PermissionIds.length];
            for (int i = 0; i < source.PermissionIds.length; i++) {
                this.PermissionIds[i] = new Long(source.PermissionIds[i]);
            }
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);

    }
}

