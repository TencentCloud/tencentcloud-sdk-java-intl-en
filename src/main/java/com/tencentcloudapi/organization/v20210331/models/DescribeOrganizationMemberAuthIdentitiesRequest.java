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

public class DescribeOrganizationMemberAuthIdentitiesRequest extends AbstractModel {

    /**
    * Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit, which defaults to `10`. Value range: 1-50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Uin of the organization member. At least one of the input parameters MemberUin and IdentityId must be entered.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Identity ID. At least one of the input parameters MemberUin and IdentityId must be provided. It can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
     * Get Offset, which is an integer multiple of the value of `Limit`. Default value: `0`. 
     * @return Offset Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     * @param Offset Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit, which defaults to `10`. Value range: 1-50. 
     * @return Limit Limit, which defaults to `10`. Value range: 1-50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit, which defaults to `10`. Value range: 1-50.
     * @param Limit Limit, which defaults to `10`. Value range: 1-50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Uin of the organization member. At least one of the input parameters MemberUin and IdentityId must be entered. 
     * @return MemberUin Uin of the organization member. At least one of the input parameters MemberUin and IdentityId must be entered.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Uin of the organization member. At least one of the input parameters MemberUin and IdentityId must be entered.
     * @param MemberUin Uin of the organization member. At least one of the input parameters MemberUin and IdentityId must be entered.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Identity ID. At least one of the input parameters MemberUin and IdentityId must be provided. It can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1). 
     * @return IdentityId Identity ID. At least one of the input parameters MemberUin and IdentityId must be provided. It can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID. At least one of the input parameters MemberUin and IdentityId must be provided. It can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     * @param IdentityId Identity ID. At least one of the input parameters MemberUin and IdentityId must be provided. It can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    public DescribeOrganizationMemberAuthIdentitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMemberAuthIdentitiesRequest(DescribeOrganizationMemberAuthIdentitiesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);

    }
}

