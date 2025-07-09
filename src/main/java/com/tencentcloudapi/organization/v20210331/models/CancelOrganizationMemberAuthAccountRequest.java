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

public class CancelOrganizationMemberAuthAccountRequest extends AbstractModel {

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Policy ID, which can be obtained through [DescribeOrganizationMemberPolicies](https://intl.cloud.tencent.com/document/product/850/82935?from_cn_redirect=1).
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Organization sub-account UIN.
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

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
     * Get Policy ID, which can be obtained through [DescribeOrganizationMemberPolicies](https://intl.cloud.tencent.com/document/product/850/82935?from_cn_redirect=1). 
     * @return PolicyId Policy ID, which can be obtained through [DescribeOrganizationMemberPolicies](https://intl.cloud.tencent.com/document/product/850/82935?from_cn_redirect=1).
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID, which can be obtained through [DescribeOrganizationMemberPolicies](https://intl.cloud.tencent.com/document/product/850/82935?from_cn_redirect=1).
     * @param PolicyId Policy ID, which can be obtained through [DescribeOrganizationMemberPolicies](https://intl.cloud.tencent.com/document/product/850/82935?from_cn_redirect=1).
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Organization sub-account UIN. 
     * @return OrgSubAccountUin Organization sub-account UIN.
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set Organization sub-account UIN.
     * @param OrgSubAccountUin Organization sub-account UIN.
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
    }

    public CancelOrganizationMemberAuthAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelOrganizationMemberAuthAccountRequest(CancelOrganizationMemberAuthAccountRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);

    }
}

