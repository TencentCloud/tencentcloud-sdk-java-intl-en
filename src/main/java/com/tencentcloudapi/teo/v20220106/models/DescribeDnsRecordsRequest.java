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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnsRecordsRequest extends AbstractModel {

    /**
    * Query filter
    */
    @SerializedName("Filters")
    @Expose
    private DnsRecordFilter [] Filters;

    /**
    * Sorts the order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Valid values: `asc`, and `desc`.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Valid values: `all`, and `any`.
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
    * Limit on paginated queries. Default value: 100. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset for paginated queries. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get Query filter 
     * @return Filters Query filter
     */
    public DnsRecordFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter
     * @param Filters Query filter
     */
    public void setFilters(DnsRecordFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorts the order 
     * @return Order Sorts the order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorts the order
     * @param Order Sorts the order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Valid values: `asc`, and `desc`. 
     * @return Direction Valid values: `asc`, and `desc`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Valid values: `asc`, and `desc`.
     * @param Direction Valid values: `asc`, and `desc`.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Valid values: `all`, and `any`. 
     * @return Match Valid values: `all`, and `any`.
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set Valid values: `all`, and `any`.
     * @param Match Valid values: `all`, and `any`.
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    /**
     * Get Limit on paginated queries. Default value: 100. Maximum value: 1000. 
     * @return Limit Limit on paginated queries. Default value: 100. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 100. Maximum value: 1000.
     * @param Limit Limit on paginated queries. Default value: 100. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset for paginated queries. Default value: 0 
     * @return Offset Offset for paginated queries. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for paginated queries. Default value: 0
     * @param Offset Offset for paginated queries. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DescribeDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsRecordsRequest(DescribeDnsRecordsRequest source) {
        if (source.Filters != null) {
            this.Filters = new DnsRecordFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DnsRecordFilter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

