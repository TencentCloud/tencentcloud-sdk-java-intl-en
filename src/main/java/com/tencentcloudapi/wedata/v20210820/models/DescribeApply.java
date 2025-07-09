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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApply extends AbstractModel {

    /**
    * Application List Details
    */
    @SerializedName("Rows")
    @Expose
    private Apply [] Rows;

    /**
    * Total Pagination Pages
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Total Count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Application List Details 
     * @return Rows Application List Details
     */
    public Apply [] getRows() {
        return this.Rows;
    }

    /**
     * Set Application List Details
     * @param Rows Application List Details
     */
    public void setRows(Apply [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Total Pagination Pages 
     * @return TotalPageNumber Total Pagination Pages
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total Pagination Pages
     * @param TotalPageNumber Total Pagination Pages
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Total Count 
     * @return TotalCount Total Count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total Count
     * @param TotalCount Total Count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeApply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApply(DescribeApply source) {
        if (source.Rows != null) {
            this.Rows = new Apply[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new Apply(source.Rows[i]);
            }
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

