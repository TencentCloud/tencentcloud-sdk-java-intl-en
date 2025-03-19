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

public class DescribeVpcAcRuleRequest extends AbstractModel {

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Index to be queried, used in specific scenarios, can be left blank
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Filter combinations
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * Search start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Search end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Order Type:desc,asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Order By FileName
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Index to be queried, used in specific scenarios, can be left blank 
     * @return Index Index to be queried, used in specific scenarios, can be left blank
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Index to be queried, used in specific scenarios, can be left blank
     * @param Index Index to be queried, used in specific scenarios, can be left blank
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Filter combinations 
     * @return Filters Filter combinations
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter combinations
     * @param Filters Filter combinations
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Search start time 
     * @return StartTime Search start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Search start time
     * @param StartTime Search start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Search end time 
     * @return EndTime Search end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Search end time
     * @param EndTime Search end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Order Type:desc,asc 
     * @return Order Order Type:desc,asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Order Type:desc,asc
     * @param Order Order Type:desc,asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Order By FileName 
     * @return By Order By FileName
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Order By FileName
     * @param By Order By FileName
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcAcRuleRequest(DescribeVpcAcRuleRequest source) {
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

