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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileTamperRulesRequest extends AbstractModel {

    /**
    * Filtering criteria
<li>RuleCategory - string - rule category: 0: system rule; 1: user rule</li><li>Name - String - rule name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order: ASC, DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: CreateTime, ModifyTime, HostCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria
<li>RuleCategory - string - rule category: 0: system rule; 1: user rule</li><li>Name - String - rule name</li> 
     * @return Filters Filtering criteria
<li>RuleCategory - string - rule category: 0: system rule; 1: user rule</li><li>Name - String - rule name</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>RuleCategory - string - rule category: 0: system rule; 1: user rule</li><li>Name - String - rule name</li>
     * @param Filters Filtering criteria
<li>RuleCategory - string - rule category: 0: system rule; 1: user rule</li><li>Name - String - rule name</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting order: ASC, DESC 
     * @return Order Sorting order: ASC, DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: ASC, DESC
     * @param Order Sorting order: ASC, DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: CreateTime, ModifyTime, HostCount 
     * @return By Sorting field: CreateTime, ModifyTime, HostCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: CreateTime, ModifyTime, HostCount
     * @param By Sorting field: CreateTime, ModifyTime, HostCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeFileTamperRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileTamperRulesRequest(DescribeFileTamperRulesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

