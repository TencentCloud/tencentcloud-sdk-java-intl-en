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

public class CancelOrganizationPolicySubAccountRequest extends AbstractModel {

    /**
    * Policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * List of sub-account UINs of the organization administrator. A maximum of 5 UINs is supported.
    */
    @SerializedName("OrgSubAccountUins")
    @Expose
    private Long [] OrgSubAccountUins;

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

    /**
     * Get List of sub-account UINs of the organization administrator. A maximum of 5 UINs is supported. 
     * @return OrgSubAccountUins List of sub-account UINs of the organization administrator. A maximum of 5 UINs is supported.
     */
    public Long [] getOrgSubAccountUins() {
        return this.OrgSubAccountUins;
    }

    /**
     * Set List of sub-account UINs of the organization administrator. A maximum of 5 UINs is supported.
     * @param OrgSubAccountUins List of sub-account UINs of the organization administrator. A maximum of 5 UINs is supported.
     */
    public void setOrgSubAccountUins(Long [] OrgSubAccountUins) {
        this.OrgSubAccountUins = OrgSubAccountUins;
    }

    public CancelOrganizationPolicySubAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelOrganizationPolicySubAccountRequest(CancelOrganizationPolicySubAccountRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.OrgSubAccountUins != null) {
            this.OrgSubAccountUins = new Long[source.OrgSubAccountUins.length];
            for (int i = 0; i < source.OrgSubAccountUins.length; i++) {
                this.OrgSubAccountUins[i] = new Long(source.OrgSubAccountUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "OrgSubAccountUins.", this.OrgSubAccountUins);

    }
}

