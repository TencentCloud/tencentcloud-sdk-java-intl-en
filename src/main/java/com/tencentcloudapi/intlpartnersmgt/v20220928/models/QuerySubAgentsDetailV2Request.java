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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuerySubAgentsDetailV2Request extends AbstractModel {

    /**
    * Page number. starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of items per page. supports up to 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter criteria, support the following filter parameters.
Note: Email, SubAgentUin, and ClientUin only support exact search. other conditions support fuzzy retrieval.The following are the definitions of filtering  items:

Name: specifies second-level reseller name.
SubAgentUin: specifies the uin of the second-level reseller.
Remark: specifies remark.
Mobile: specifies the mobile number.
Email: specifies email address.
ClientUin: specifies the Indirect customer uin.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Filter value
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * Sorting method. sorts by binding time in ascending or descending order. defaults to descending order if not specified.
Desc: descending order.
acs: ascending.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Page number. starts from 1. 
     * @return Page Page number. starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number. starts from 1.
     * @param Page Page number. starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of items per page. supports up to 100. 
     * @return PageSize Number of items per page. supports up to 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. supports up to 100.
     * @param PageSize Number of items per page. supports up to 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter criteria, support the following filter parameters.
Note: Email, SubAgentUin, and ClientUin only support exact search. other conditions support fuzzy retrieval.The following are the definitions of filtering  items:

Name: specifies second-level reseller name.
SubAgentUin: specifies the uin of the second-level reseller.
Remark: specifies remark.
Mobile: specifies the mobile number.
Email: specifies email address.
ClientUin: specifies the Indirect customer uin. 
     * @return FilterType Filter criteria, support the following filter parameters.
Note: Email, SubAgentUin, and ClientUin only support exact search. other conditions support fuzzy retrieval.The following are the definitions of filtering  items:

Name: specifies second-level reseller name.
SubAgentUin: specifies the uin of the second-level reseller.
Remark: specifies remark.
Mobile: specifies the mobile number.
Email: specifies email address.
ClientUin: specifies the Indirect customer uin.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Filter criteria, support the following filter parameters.
Note: Email, SubAgentUin, and ClientUin only support exact search. other conditions support fuzzy retrieval.The following are the definitions of filtering  items:

Name: specifies second-level reseller name.
SubAgentUin: specifies the uin of the second-level reseller.
Remark: specifies remark.
Mobile: specifies the mobile number.
Email: specifies email address.
ClientUin: specifies the Indirect customer uin.
     * @param FilterType Filter criteria, support the following filter parameters.
Note: Email, SubAgentUin, and ClientUin only support exact search. other conditions support fuzzy retrieval.The following are the definitions of filtering  items:

Name: specifies second-level reseller name.
SubAgentUin: specifies the uin of the second-level reseller.
Remark: specifies remark.
Mobile: specifies the mobile number.
Email: specifies email address.
ClientUin: specifies the Indirect customer uin.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Filter value 
     * @return Filter Filter value
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter value
     * @param Filter Filter value
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Sorting method. sorts by binding time in ascending or descending order. defaults to descending order if not specified.
Desc: descending order.
acs: ascending. 
     * @return Order Sorting method. sorts by binding time in ascending or descending order. defaults to descending order if not specified.
Desc: descending order.
acs: ascending.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method. sorts by binding time in ascending or descending order. defaults to descending order if not specified.
Desc: descending order.
acs: ascending.
     * @param Order Sorting method. sorts by binding time in ascending or descending order. defaults to descending order if not specified.
Desc: descending order.
acs: ascending.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public QuerySubAgentsDetailV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySubAgentsDetailV2Request(QuerySubAgentsDetailV2Request source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

