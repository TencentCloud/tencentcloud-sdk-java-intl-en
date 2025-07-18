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

public class QueryPendingClientsV2Request extends AbstractModel {

    /**
    * Page number, starting from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Quantity. page size [1-100].
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Page number, starting from 1. 
     * @return Page Page number, starting from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, starting from 1.
     * @param Page Page number, starting from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Quantity. page size [1-100]. 
     * @return PageSize Quantity. page size [1-100].
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Quantity. page size [1-100].
     * @param PageSize Quantity. page size [1-100].
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public QueryPendingClientsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPendingClientsV2Request(QueryPendingClientsV2Request source) {
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

