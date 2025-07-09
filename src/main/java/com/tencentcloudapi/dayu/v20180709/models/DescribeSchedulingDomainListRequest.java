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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulingDomainListRequest extends AbstractModel {

    /**
    * Number of items in a page. Returned results are not paged if you enter '0'.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset of the page. Value: (number of pages - 1) * items per page
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * (Optional) Filter by specific domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Number of items in a page. Returned results are not paged if you enter '0'. 
     * @return Limit Number of items in a page. Returned results are not paged if you enter '0'.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items in a page. Returned results are not paged if you enter '0'.
     * @param Limit Number of items in a page. Returned results are not paged if you enter '0'.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting offset of the page. Value: (number of pages - 1) * items per page 
     * @return Offset Starting offset of the page. Value: (number of pages - 1) * items per page
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages - 1) * items per page
     * @param Offset Starting offset of the page. Value: (number of pages - 1) * items per page
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get (Optional) Filter by specific domain name 
     * @return Domain (Optional) Filter by specific domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set (Optional) Filter by specific domain name
     * @param Domain (Optional) Filter by specific domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeSchedulingDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulingDomainListRequest(DescribeSchedulingDomainListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

