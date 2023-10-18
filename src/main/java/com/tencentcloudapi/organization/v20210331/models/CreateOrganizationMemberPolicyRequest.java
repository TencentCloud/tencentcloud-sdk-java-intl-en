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

public class CreateOrganizationMemberPolicyRequest extends AbstractModel {

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Policy name, which can contain up to 128 letters, digits, and symbols `+=,.@_-`.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Member access identity ID, which can be obtained through the `DescribeOrganizationMemberAuthIdentities` API.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Policy name, which can contain up to 128 letters, digits, and symbols `+=,.@_-`. 
     * @return PolicyName Policy name, which can contain up to 128 letters, digits, and symbols `+=,.@_-`.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name, which can contain up to 128 letters, digits, and symbols `+=,.@_-`.
     * @param PolicyName Policy name, which can contain up to 128 letters, digits, and symbols `+=,.@_-`.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Member access identity ID, which can be obtained through the `DescribeOrganizationMemberAuthIdentities` API. 
     * @return IdentityId Member access identity ID, which can be obtained through the `DescribeOrganizationMemberAuthIdentities` API.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Member access identity ID, which can be obtained through the `DescribeOrganizationMemberAuthIdentities` API.
     * @param IdentityId Member access identity ID, which can be obtained through the `DescribeOrganizationMemberAuthIdentities` API.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOrganizationMemberPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberPolicyRequest(CreateOrganizationMemberPolicyRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
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
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

