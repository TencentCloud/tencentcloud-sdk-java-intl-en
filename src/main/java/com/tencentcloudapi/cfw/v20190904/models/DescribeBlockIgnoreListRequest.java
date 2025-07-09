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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockIgnoreListRequest extends AbstractModel {

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
    * Direction. Valid values: 1: inbound public access; 0: outbound public access; 3: private network access; empty string: all access.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Rule type. Valid values: 1: block; 2: allow.
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Column by which rules are sorted. Valid values: EndTime: end time; StartTime: start time; MatchTimes: number of matching times.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sort order. Valid values: desc: descending; asc: ascending.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Search keys, in a JSON string. Valid values: {}: empty; domain: domain name; level: threat level; ignore_reason: reason for allowing access; rule_source: source of a security event; address: geographical location; common: fuzzy search.
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

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
     * Get Direction. Valid values: 1: inbound public access; 0: outbound public access; 3: private network access; empty string: all access. 
     * @return Direction Direction. Valid values: 1: inbound public access; 0: outbound public access; 3: private network access; empty string: all access.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. Valid values: 1: inbound public access; 0: outbound public access; 3: private network access; empty string: all access.
     * @param Direction Direction. Valid values: 1: inbound public access; 0: outbound public access; 3: private network access; empty string: all access.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Rule type. Valid values: 1: block; 2: allow. 
     * @return RuleType Rule type. Valid values: 1: block; 2: allow.
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type. Valid values: 1: block; 2: allow.
     * @param RuleType Rule type. Valid values: 1: block; 2: allow.
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Column by which rules are sorted. Valid values: EndTime: end time; StartTime: start time; MatchTimes: number of matching times. 
     * @return Order Column by which rules are sorted. Valid values: EndTime: end time; StartTime: start time; MatchTimes: number of matching times.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Column by which rules are sorted. Valid values: EndTime: end time; StartTime: start time; MatchTimes: number of matching times.
     * @param Order Column by which rules are sorted. Valid values: EndTime: end time; StartTime: start time; MatchTimes: number of matching times.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sort order. Valid values: desc: descending; asc: ascending. 
     * @return By Sort order. Valid values: desc: descending; asc: ascending.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort order. Valid values: desc: descending; asc: ascending.
     * @param By Sort order. Valid values: desc: descending; asc: ascending.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Search keys, in a JSON string. Valid values: {}: empty; domain: domain name; level: threat level; ignore_reason: reason for allowing access; rule_source: source of a security event; address: geographical location; common: fuzzy search. 
     * @return SearchValue Search keys, in a JSON string. Valid values: {}: empty; domain: domain name; level: threat level; ignore_reason: reason for allowing access; rule_source: source of a security event; address: geographical location; common: fuzzy search.
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Search keys, in a JSON string. Valid values: {}: empty; domain: domain name; level: threat level; ignore_reason: reason for allowing access; rule_source: source of a security event; address: geographical location; common: fuzzy search.
     * @param SearchValue Search keys, in a JSON string. Valid values: {}: empty; domain: domain name; level: threat level; ignore_reason: reason for allowing access; rule_source: source of a security event; address: geographical location; common: fuzzy search.
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeBlockIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockIgnoreListRequest(DescribeBlockIgnoreListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

