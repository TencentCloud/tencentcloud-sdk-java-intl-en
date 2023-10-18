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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatAcRuleRequest extends AbstractModel {

    /**
    * Number of entries per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Index to be queried. This parameter is optional, and is used only in specific cases.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Filter condition combination.
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * Start time for search. This parameter is optional.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time for search. This parameter is optional.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Valid values: desc: descending; asc: ascending. The returned results are sorted by the value of By. If this parameter is specified, By is also required.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Field by which the returned results are sorted.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Number of entries per page. 
     * @return Limit Number of entries per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
     * @param Limit Number of entries per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page offset. 
     * @return Offset Page offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset.
     * @param Offset Page offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Index to be queried. This parameter is optional, and is used only in specific cases. 
     * @return Index Index to be queried. This parameter is optional, and is used only in specific cases.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Index to be queried. This parameter is optional, and is used only in specific cases.
     * @param Index Index to be queried. This parameter is optional, and is used only in specific cases.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Filter condition combination. 
     * @return Filters Filter condition combination.
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition combination.
     * @param Filters Filter condition combination.
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Start time for search. This parameter is optional. 
     * @return StartTime Start time for search. This parameter is optional.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for search. This parameter is optional.
     * @param StartTime Start time for search. This parameter is optional.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for search. This parameter is optional. 
     * @return EndTime End time for search. This parameter is optional.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for search. This parameter is optional.
     * @param EndTime End time for search. This parameter is optional.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Valid values: desc: descending; asc: ascending. The returned results are sorted by the value of By. If this parameter is specified, By is also required. 
     * @return Order Valid values: desc: descending; asc: ascending. The returned results are sorted by the value of By. If this parameter is specified, By is also required.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Valid values: desc: descending; asc: ascending. The returned results are sorted by the value of By. If this parameter is specified, By is also required.
     * @param Order Valid values: desc: descending; asc: ascending. The returned results are sorted by the value of By. If this parameter is specified, By is also required.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Field by which the returned results are sorted. 
     * @return By Field by which the returned results are sorted.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Field by which the returned results are sorted.
     * @param By Field by which the returned results are sorted.
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatAcRuleRequest(DescribeNatAcRuleRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

