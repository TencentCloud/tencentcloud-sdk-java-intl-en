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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusWhiteListRulesRequest extends AbstractModel {

    /**
    * <p>Page size. Default value: 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Page offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order. Valid values: ASC and DESC. Default value: DESC.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field. Valid values: InsertTime and UpdateTime.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Filter.</p>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
     * Get <p>Page size. Default value: 10.</p> 
     * @return Limit <p>Page size. Default value: 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Page size. Default value: 10.</p>
     * @param Limit <p>Page size. Default value: 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Page offset. Default value: 0.</p> 
     * @return Offset <p>Page offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Page offset. Default value: 0.</p>
     * @param Offset <p>Page offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order. Valid values: ASC and DESC. Default value: DESC.</p> 
     * @return Order <p>Sorting order. Valid values: ASC and DESC. Default value: DESC.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order. Valid values: ASC and DESC. Default value: DESC.</p>
     * @param Order <p>Sorting order. Valid values: ASC and DESC. Default value: DESC.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field. Valid values: InsertTime and UpdateTime.</p> 
     * @return By <p>Sorting field. Valid values: InsertTime and UpdateTime.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field. Valid values: InsertTime and UpdateTime.</p>
     * @param By <p>Sorting field. Valid values: InsertTime and UpdateTime.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>Filter.</p> 
     * @return Filters <p>Filter.</p>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter.</p>
     * @param Filters <p>Filter.</p>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVirusWhiteListRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusWhiteListRulesRequest(DescribeVirusWhiteListRulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

