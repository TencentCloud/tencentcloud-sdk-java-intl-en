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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoAuthorizedRuleHostRequest extends AbstractModel{

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Number of results to be returned. Default value: `all`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting order. Valid values: `asc`, `desc`.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Number of results to be returned. Default value: `all`. 
     * @return Limit Number of results to be returned. Default value: `all`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `all`.
     * @param Limit Number of results to be returned. Default value: `all`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field 
     * @return Order Sorting field
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting field
     * @param Order Sorting field
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting order. Valid values: `asc`, `desc`. 
     * @return By Sorting order. Valid values: `asc`, `desc`.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting order. Valid values: `asc`, `desc`.
     * @param By Sorting order. Valid values: `asc`, `desc`.
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAutoAuthorizedRuleHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoAuthorizedRuleHostRequest(DescribeAutoAuthorizedRuleHostRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

