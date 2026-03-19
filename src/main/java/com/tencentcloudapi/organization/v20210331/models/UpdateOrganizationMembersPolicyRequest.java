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

public class UpdateOrganizationMembersPolicyRequest extends AbstractModel {

    /**
    * Member UIN list, including up to 10 items.
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * Member access policy ID, which can be obtained by calling DescribeOrganizationMemberPolicies.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Member access identity ID, which can be obtained by calling ListOrganizationIdentity.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Policy description, which contains up to 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Member UIN list, including up to 10 items. 
     * @return MemberUins Member UIN list, including up to 10 items.
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set Member UIN list, including up to 10 items.
     * @param MemberUins Member UIN list, including up to 10 items.
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get Member access policy ID, which can be obtained by calling DescribeOrganizationMemberPolicies. 
     * @return PolicyId Member access policy ID, which can be obtained by calling DescribeOrganizationMemberPolicies.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Member access policy ID, which can be obtained by calling DescribeOrganizationMemberPolicies.
     * @param PolicyId Member access policy ID, which can be obtained by calling DescribeOrganizationMemberPolicies.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Member access identity ID, which can be obtained by calling ListOrganizationIdentity. 
     * @return IdentityId Member access identity ID, which can be obtained by calling ListOrganizationIdentity.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Member access identity ID, which can be obtained by calling ListOrganizationIdentity.
     * @param IdentityId Member access identity ID, which can be obtained by calling ListOrganizationIdentity.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Policy description, which contains up to 128 characters. 
     * @return Description Policy description, which contains up to 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description, which contains up to 128 characters.
     * @param Description Policy description, which contains up to 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateOrganizationMembersPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationMembersPolicyRequest(UpdateOrganizationMembersPolicyRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

