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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackEventRequest extends AbstractModel {

    /**
    * Start time of the query period.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of DDoS policy IDs. All policies are selected if this field is not specified.
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * (Required) List of sites. No query results are returned if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Limit on paginated queries. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The page offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to display the details.
    */
    @SerializedName("ShowDetail")
    @Expose
    private Boolean ShowDetail;

    /**
    * Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The sorting field. Values: 
<li>`MaxBandWidth`: Peak bandwidth</li>
<li>`AttackStartTime` Start time of the attack</li>If this field is not specified, the default value `AttackStartTime` is used.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * The sorting method. Values: 
<Li>`asc`: Ascending</li>
<li>`desc`: Descending</li>If this field is not specified, the default value `desc` is used.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Start time of the query period. 
     * @return StartTime Start time of the query period.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query period.
     * @param StartTime Start time of the query period.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query period. 
     * @return EndTime End time of the query period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query period.
     * @param EndTime End time of the query period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of DDoS policy IDs. All policies are selected if this field is not specified. 
     * @return PolicyIds List of DDoS policy IDs. All policies are selected if this field is not specified.
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set List of DDoS policy IDs. All policies are selected if this field is not specified.
     * @param PolicyIds List of DDoS policy IDs. All policies are selected if this field is not specified.
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get (Required) List of sites. No query results are returned if this field is not specified. 
     * @return ZoneIds (Required) List of sites. No query results are returned if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set (Required) List of sites. No query results are returned if this field is not specified.
     * @param ZoneIds (Required) List of sites. No query results are returned if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Limit on paginated queries. Default value: 20. Maximum value: 1000. 
     * @return Limit Limit on paginated queries. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Default value: 20. Maximum value: 1000.
     * @param Limit Limit on paginated queries. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The page offset. Default value: 0. 
     * @return Offset The page offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page offset. Default value: 0.
     * @param Offset The page offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to display the details. 
     * @return ShowDetail Whether to display the details.
     */
    public Boolean getShowDetail() {
        return this.ShowDetail;
    }

    /**
     * Set Whether to display the details.
     * @param ShowDetail Whether to display the details.
     */
    public void setShowDetail(Boolean ShowDetail) {
        this.ShowDetail = ShowDetail;
    }

    /**
     * Get Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used. 
     * @return Area Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     * @param Area Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The sorting field. Values: 
<li>`MaxBandWidth`: Peak bandwidth</li>
<li>`AttackStartTime` Start time of the attack</li>If this field is not specified, the default value `AttackStartTime` is used. 
     * @return OrderBy The sorting field. Values: 
<li>`MaxBandWidth`: Peak bandwidth</li>
<li>`AttackStartTime` Start time of the attack</li>If this field is not specified, the default value `AttackStartTime` is used.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set The sorting field. Values: 
<li>`MaxBandWidth`: Peak bandwidth</li>
<li>`AttackStartTime` Start time of the attack</li>If this field is not specified, the default value `AttackStartTime` is used.
     * @param OrderBy The sorting field. Values: 
<li>`MaxBandWidth`: Peak bandwidth</li>
<li>`AttackStartTime` Start time of the attack</li>If this field is not specified, the default value `AttackStartTime` is used.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get The sorting method. Values: 
<Li>`asc`: Ascending</li>
<li>`desc`: Descending</li>If this field is not specified, the default value `desc` is used. 
     * @return OrderType The sorting method. Values: 
<Li>`asc`: Ascending</li>
<li>`desc`: Descending</li>If this field is not specified, the default value `desc` is used.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set The sorting method. Values: 
<Li>`asc`: Ascending</li>
<li>`desc`: Descending</li>If this field is not specified, the default value `desc` is used.
     * @param OrderType The sorting method. Values: 
<Li>`asc`: Ascending</li>
<li>`desc`: Descending</li>If this field is not specified, the default value `desc` is used.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeDDoSAttackEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackEventRequest(DescribeDDoSAttackEventRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ShowDetail != null) {
            this.ShowDetail = new Boolean(source.ShowDetail);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ShowDetail", this.ShowDetail);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

