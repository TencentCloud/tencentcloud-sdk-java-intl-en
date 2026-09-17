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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewayFlowMonitorDetailRequest extends AbstractModel {

    /**
    * Point in time. It indicates the moment to query. When the aggregation granularity is 60 or 300, the system queries the aggregation cycle starting from the latest whole minute. When the aggregation granularity is 3600, the system queries the aggregation cycle starting from the latest hour. When the aggregation granularity is 86400, the system queries the aggregation cycle starting from the latest whole day. Example: `2019-03-24T10:51:23+08:00`.
    */
    @SerializedName("TimePoint")
    @Expose
    private String TimePoint;

    /**
    * NAT gateway ID, for example: `nat-ig8xpno8`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Displays top-ranked data. Default value: 10, indicating that the top 10 ranked data is displayed by default. Maximum value: 100.
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * Sorting field. Valid values: `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. Standard NAT gateways additionally support `ConcurrentConnectionCount` and `NewConnectionRate`. Default value: `OutTraffic`.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Aggregation time granularity. Valid values: 60, 300, 3600, and 86400, corresponding to aggregation queries by 1 minute, 5 minutes, 1 hour, and 1 day.
    */
    @SerializedName("AggregationTimeRange")
    @Expose
    private Long AggregationTimeRange;

    /**
    * Specifies whether to query all metrics. Default value: True, which indicates that all metrics are queried.
    */
    @SerializedName("AllMetricMode")
    @Expose
    private Boolean AllMetricMode;

    /**
     * Get Point in time. It indicates the moment to query. When the aggregation granularity is 60 or 300, the system queries the aggregation cycle starting from the latest whole minute. When the aggregation granularity is 3600, the system queries the aggregation cycle starting from the latest hour. When the aggregation granularity is 86400, the system queries the aggregation cycle starting from the latest whole day. Example: `2019-03-24T10:51:23+08:00`. 
     * @return TimePoint Point in time. It indicates the moment to query. When the aggregation granularity is 60 or 300, the system queries the aggregation cycle starting from the latest whole minute. When the aggregation granularity is 3600, the system queries the aggregation cycle starting from the latest hour. When the aggregation granularity is 86400, the system queries the aggregation cycle starting from the latest whole day. Example: `2019-03-24T10:51:23+08:00`.
     */
    public String getTimePoint() {
        return this.TimePoint;
    }

    /**
     * Set Point in time. It indicates the moment to query. When the aggregation granularity is 60 or 300, the system queries the aggregation cycle starting from the latest whole minute. When the aggregation granularity is 3600, the system queries the aggregation cycle starting from the latest hour. When the aggregation granularity is 86400, the system queries the aggregation cycle starting from the latest whole day. Example: `2019-03-24T10:51:23+08:00`.
     * @param TimePoint Point in time. It indicates the moment to query. When the aggregation granularity is 60 or 300, the system queries the aggregation cycle starting from the latest whole minute. When the aggregation granularity is 3600, the system queries the aggregation cycle starting from the latest hour. When the aggregation granularity is 86400, the system queries the aggregation cycle starting from the latest whole day. Example: `2019-03-24T10:51:23+08:00`.
     */
    public void setTimePoint(String TimePoint) {
        this.TimePoint = TimePoint;
    }

    /**
     * Get NAT gateway ID, for example: `nat-ig8xpno8`. 
     * @return NatGatewayId NAT gateway ID, for example: `nat-ig8xpno8`.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT gateway ID, for example: `nat-ig8xpno8`.
     * @param NatGatewayId NAT gateway ID, for example: `nat-ig8xpno8`.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Displays top-ranked data. Default value: 10, indicating that the top 10 ranked data is displayed by default. Maximum value: 100. 
     * @return TopN Displays top-ranked data. Default value: 10, indicating that the top 10 ranked data is displayed by default. Maximum value: 100.
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set Displays top-ranked data. Default value: 10, indicating that the top 10 ranked data is displayed by default. Maximum value: 100.
     * @param TopN Displays top-ranked data. Default value: 10, indicating that the top 10 ranked data is displayed by default. Maximum value: 100.
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get Sorting field. Valid values: `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. Standard NAT gateways additionally support `ConcurrentConnectionCount` and `NewConnectionRate`. Default value: `OutTraffic`. 
     * @return OrderField Sorting field. Valid values: `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. Standard NAT gateways additionally support `ConcurrentConnectionCount` and `NewConnectionRate`. Default value: `OutTraffic`.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values: `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. Standard NAT gateways additionally support `ConcurrentConnectionCount` and `NewConnectionRate`. Default value: `OutTraffic`.
     * @param OrderField Sorting field. Valid values: `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. Standard NAT gateways additionally support `ConcurrentConnectionCount` and `NewConnectionRate`. Default value: `OutTraffic`.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Aggregation time granularity. Valid values: 60, 300, 3600, and 86400, corresponding to aggregation queries by 1 minute, 5 minutes, 1 hour, and 1 day. 
     * @return AggregationTimeRange Aggregation time granularity. Valid values: 60, 300, 3600, and 86400, corresponding to aggregation queries by 1 minute, 5 minutes, 1 hour, and 1 day.
     */
    public Long getAggregationTimeRange() {
        return this.AggregationTimeRange;
    }

    /**
     * Set Aggregation time granularity. Valid values: 60, 300, 3600, and 86400, corresponding to aggregation queries by 1 minute, 5 minutes, 1 hour, and 1 day.
     * @param AggregationTimeRange Aggregation time granularity. Valid values: 60, 300, 3600, and 86400, corresponding to aggregation queries by 1 minute, 5 minutes, 1 hour, and 1 day.
     */
    public void setAggregationTimeRange(Long AggregationTimeRange) {
        this.AggregationTimeRange = AggregationTimeRange;
    }

    /**
     * Get Specifies whether to query all metrics. Default value: True, which indicates that all metrics are queried. 
     * @return AllMetricMode Specifies whether to query all metrics. Default value: True, which indicates that all metrics are queried.
     */
    public Boolean getAllMetricMode() {
        return this.AllMetricMode;
    }

    /**
     * Set Specifies whether to query all metrics. Default value: True, which indicates that all metrics are queried.
     * @param AllMetricMode Specifies whether to query all metrics. Default value: True, which indicates that all metrics are queried.
     */
    public void setAllMetricMode(Boolean AllMetricMode) {
        this.AllMetricMode = AllMetricMode;
    }

    public DescribeNatGatewayFlowMonitorDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayFlowMonitorDetailRequest(DescribeNatGatewayFlowMonitorDetailRequest source) {
        if (source.TimePoint != null) {
            this.TimePoint = new String(source.TimePoint);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.AggregationTimeRange != null) {
            this.AggregationTimeRange = new Long(source.AggregationTimeRange);
        }
        if (source.AllMetricMode != null) {
            this.AllMetricMode = new Boolean(source.AllMetricMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimePoint", this.TimePoint);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "AggregationTimeRange", this.AggregationTimeRange);
        this.setParamSimple(map, prefix + "AllMetricMode", this.AllMetricMode);

    }
}

