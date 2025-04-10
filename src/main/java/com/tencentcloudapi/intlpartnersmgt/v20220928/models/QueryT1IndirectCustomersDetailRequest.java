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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryT1IndirectCustomersDetailRequest extends AbstractModel {

    /**
    * Second-level reseller UIN.
    */
    @SerializedName("SubAgentUin")
    @Expose
    private Long SubAgentUin;

    /**
    * Pagination parameter: current page number. it starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Pagination parameter, indicates the number of entries per page. supports [1, 100] data entries per request.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Second-level reseller UIN. 
     * @return SubAgentUin Second-level reseller UIN.
     */
    public Long getSubAgentUin() {
        return this.SubAgentUin;
    }

    /**
     * Set Second-level reseller UIN.
     * @param SubAgentUin Second-level reseller UIN.
     */
    public void setSubAgentUin(Long SubAgentUin) {
        this.SubAgentUin = SubAgentUin;
    }

    /**
     * Get Pagination parameter: current page number. it starts from 1. 
     * @return Page Pagination parameter: current page number. it starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Pagination parameter: current page number. it starts from 1.
     * @param Page Pagination parameter: current page number. it starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Pagination parameter, indicates the number of entries per page. supports [1, 100] data entries per request. 
     * @return PageSize Pagination parameter, indicates the number of entries per page. supports [1, 100] data entries per request.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination parameter, indicates the number of entries per page. supports [1, 100] data entries per request.
     * @param PageSize Pagination parameter, indicates the number of entries per page. supports [1, 100] data entries per request.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public QueryT1IndirectCustomersDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryT1IndirectCustomersDetailRequest(QueryT1IndirectCustomersDetailRequest source) {
        if (source.SubAgentUin != null) {
            this.SubAgentUin = new Long(source.SubAgentUin);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAgentUin", this.SubAgentUin);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

