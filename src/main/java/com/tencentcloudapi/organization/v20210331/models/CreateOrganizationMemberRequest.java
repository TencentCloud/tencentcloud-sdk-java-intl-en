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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMemberRequest extends AbstractModel {

    /**
    * Member name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
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
    * Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1, 2 and 7 are required.
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
    * Account name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Member creation record ID, which is required during retry upon creation exception.
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * Payer UIN, which is required during paying for a member.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * List of member access identity IDs, which can be obtained through the `ListOrganizationIdentity` API. `1` indicates supported, which is the default value.
    */
    @SerializedName("IdentityRoleID")
    @Expose
    private Long [] IdentityRoleID;

    /**
    * Verified entity relationship ID, which is required during creating members for different entities.
    */
    @SerializedName("AuthRelationId")
    @Expose
    private Long AuthRelationId;

    /**
    * Member tag list, with a maximum of 10.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Member name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`. 
     * @return Name Member name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Member name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
     * @param Name Member name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
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
     * Get Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1, 2 and 7 are required. 
     * @return PermissionIds Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1, 2 and 7 are required.
     */
    public Long [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1, 2 and 7 are required.
     * @param PermissionIds Member Finanace Authorization. Valid values: 1: View Bills. 2: View Balance.  4: Consolidate Bills. 5: Invoice. 6: Inherit Offer. 7: Pay On Behalf. 8: Cost Explorer. 9: Budget Management.  1, 2 and 7 are required.
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
     * Get Account name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`. 
     * @return AccountName Account name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
     * @param AccountName Account name, which can contain up to 25 letters, digits, and symbols `+@&._[]-:,`.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
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
     * Get Member creation record ID, which is required during retry upon creation exception. 
     * @return RecordId Member creation record ID, which is required during retry upon creation exception.
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Member creation record ID, which is required during retry upon creation exception.
     * @param RecordId Member creation record ID, which is required during retry upon creation exception.
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Payer UIN, which is required during paying for a member. 
     * @return PayUin Payer UIN, which is required during paying for a member.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Payer UIN, which is required during paying for a member.
     * @param PayUin Payer UIN, which is required during paying for a member.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get List of member access identity IDs, which can be obtained through the `ListOrganizationIdentity` API. `1` indicates supported, which is the default value. 
     * @return IdentityRoleID List of member access identity IDs, which can be obtained through the `ListOrganizationIdentity` API. `1` indicates supported, which is the default value.
     */
    public Long [] getIdentityRoleID() {
        return this.IdentityRoleID;
    }

    /**
     * Set List of member access identity IDs, which can be obtained through the `ListOrganizationIdentity` API. `1` indicates supported, which is the default value.
     * @param IdentityRoleID List of member access identity IDs, which can be obtained through the `ListOrganizationIdentity` API. `1` indicates supported, which is the default value.
     */
    public void setIdentityRoleID(Long [] IdentityRoleID) {
        this.IdentityRoleID = IdentityRoleID;
    }

    /**
     * Get Verified entity relationship ID, which is required during creating members for different entities. 
     * @return AuthRelationId Verified entity relationship ID, which is required during creating members for different entities.
     */
    public Long getAuthRelationId() {
        return this.AuthRelationId;
    }

    /**
     * Set Verified entity relationship ID, which is required during creating members for different entities.
     * @param AuthRelationId Verified entity relationship ID, which is required during creating members for different entities.
     */
    public void setAuthRelationId(Long AuthRelationId) {
        this.AuthRelationId = AuthRelationId;
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

    public CreateOrganizationMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberRequest(CreateOrganizationMemberRequest source) {
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
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.IdentityRoleID != null) {
            this.IdentityRoleID = new Long[source.IdentityRoleID.length];
            for (int i = 0; i < source.IdentityRoleID.length; i++) {
                this.IdentityRoleID[i] = new Long(source.IdentityRoleID[i]);
            }
        }
        if (source.AuthRelationId != null) {
            this.AuthRelationId = new Long(source.AuthRelationId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamArraySimple(map, prefix + "IdentityRoleID.", this.IdentityRoleID);
        this.setParamSimple(map, prefix + "AuthRelationId", this.AuthRelationId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

