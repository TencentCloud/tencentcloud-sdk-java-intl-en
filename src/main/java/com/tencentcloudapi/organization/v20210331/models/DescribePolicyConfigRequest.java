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

public class DescribePolicyConfigRequest extends AbstractModel {

    /**
    * Organization Id. call the api [DescribeOrganization](https://www.tencentcloud.com/document/product/850/67059?from_cn_redirect=1) to obtain it.
    */
    @SerializedName("OrganizationId")
    @Expose
    private Long OrganizationId;

    /**
    * Policy type. Default value: 0; valid values: 0 (service control policy) and 1 (Tag policy).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Organization Id. call the api [DescribeOrganization](https://www.tencentcloud.com/document/product/850/67059?from_cn_redirect=1) to obtain it. 
     * @return OrganizationId Organization Id. call the api [DescribeOrganization](https://www.tencentcloud.com/document/product/850/67059?from_cn_redirect=1) to obtain it.
     */
    public Long getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Organization Id. call the api [DescribeOrganization](https://www.tencentcloud.com/document/product/850/67059?from_cn_redirect=1) to obtain it.
     * @param OrganizationId Organization Id. call the api [DescribeOrganization](https://www.tencentcloud.com/document/product/850/67059?from_cn_redirect=1) to obtain it.
     */
    public void setOrganizationId(Long OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get Policy type. Default value: 0; valid values: 0 (service control policy) and 1 (Tag policy). 
     * @return Type Policy type. Default value: 0; valid values: 0 (service control policy) and 1 (Tag policy).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Policy type. Default value: 0; valid values: 0 (service control policy) and 1 (Tag policy).
     * @param Type Policy type. Default value: 0; valid values: 0 (service control policy) and 1 (Tag policy).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribePolicyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConfigRequest(DescribePolicyConfigRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new Long(source.OrganizationId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

