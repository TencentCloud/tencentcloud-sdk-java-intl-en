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

public class DescribeOrganizationMemberAuthAccountsRequest extends AbstractModel {

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of returned results.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of returned results. 
     * @return Limit Maximum number of returned results.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned results.
     * @param Limit Maximum number of returned results.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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
     * Get Policy ID. 
     * @return PolicyId Policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID.
     * @param PolicyId Policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DescribeOrganizationMemberAuthAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMemberAuthAccountsRequest(DescribeOrganizationMemberAuthAccountsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

