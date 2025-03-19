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

public class InviteOrganizationMemberRequest extends AbstractModel {

    /**
    * UIN of an invited account.
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
    * Relationship policy. Valid value: `Financial`.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1 and 2 are required.
    */
    @SerializedName("PermissionIds")
    @Expose
    private Long [] PermissionIds;

    /**
    * Node ID of the member's department, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether to allow a member to exit. Valid values: Allow, Denied.
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * Payer UIN, which is required when pay-on-behalf mode is used.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * Name of a mutual trust real-name entity.
    */
    @SerializedName("RelationAuthName")
    @Expose
    private String RelationAuthName;

    /**
    * List of proof files of a mutual trust entity.
    */
    @SerializedName("AuthFile")
    @Expose
    private AuthRelationFile [] AuthFile;

    /**
    * Member tag list, with a maximum of 10.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get UIN of an invited account. 
     * @return MemberUin UIN of an invited account.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set UIN of an invited account.
     * @param MemberUin UIN of an invited account.
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
     * Get Relationship policy. Valid value: `Financial`. 
     * @return PolicyType Relationship policy. Valid value: `Financial`.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Relationship policy. Valid value: `Financial`.
     * @param PolicyType Relationship policy. Valid value: `Financial`.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1 and 2 are required. 
     * @return PermissionIds Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1 and 2 are required.
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1 and 2 are required.
     * @param PermissionIds Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1 and 2 are required.
     */
    public void setPermissionIds(Long [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get Node ID of the member's department, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1). 
     * @return NodeId Node ID of the member's department, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID of the member's department, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     * @param NodeId Node ID of the member's department, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
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
     * Get Whether to allow a member to exit. Valid values: Allow, Denied. 
     * @return IsAllowQuit Whether to allow a member to exit. Valid values: Allow, Denied.
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set Whether to allow a member to exit. Valid values: Allow, Denied.
     * @param IsAllowQuit Whether to allow a member to exit. Valid values: Allow, Denied.
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get Payer UIN, which is required when pay-on-behalf mode is used. 
     * @return PayUin Payer UIN, which is required when pay-on-behalf mode is used.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Payer UIN, which is required when pay-on-behalf mode is used.
     * @param PayUin Payer UIN, which is required when pay-on-behalf mode is used.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get Name of a mutual trust real-name entity. 
     * @return RelationAuthName Name of a mutual trust real-name entity.
     */
    public String getRelationAuthName() {
        return this.RelationAuthName;
    }

    /**
     * Set Name of a mutual trust real-name entity.
     * @param RelationAuthName Name of a mutual trust real-name entity.
     */
    public void setRelationAuthName(String RelationAuthName) {
        this.RelationAuthName = RelationAuthName;
    }

    /**
     * Get List of proof files of a mutual trust entity. 
     * @return AuthFile List of proof files of a mutual trust entity.
     */
    public AuthRelationFile [] getAuthFile() {
        return this.AuthFile;
    }

    /**
     * Set List of proof files of a mutual trust entity.
     * @param AuthFile List of proof files of a mutual trust entity.
     */
    public void setAuthFile(AuthRelationFile [] AuthFile) {
        this.AuthFile = AuthFile;
    }

    /**
     * Get Member tag list, with a maximum of 10. 
     * @return Tags Member tag list, with a maximum of 10.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Member tag list, with a maximum of 10.
     * @param Tags Member tag list, with a maximum of 10.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public InviteOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InviteOrganizationMemberRequest(InviteOrganizationMemberRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.RelationAuthName != null) {
            this.RelationAuthName = new String(source.RelationAuthName);
        }
        if (source.AuthFile != null) {
            this.AuthFile = new AuthRelationFile[source.AuthFile.length];
            for (int i = 0; i < source.AuthFile.length; i++) {
                this.AuthFile[i] = new AuthRelationFile(source.AuthFile[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "RelationAuthName", this.RelationAuthName);
        this.setParamArrayObj(map, prefix + "AuthFile.", this.AuthFile);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

