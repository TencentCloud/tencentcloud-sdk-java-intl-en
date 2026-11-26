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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackDataRequest extends AbstractModel {

    /**
    * <p>Start time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time. The time is in Coordinated Universal Time (UTC), following the ISO 8601 standard date and time format. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>List of statistical metrics. Fill in at least 1, and duplication is not allowed.</p><p>Enumeration values:</p><ul><li>ddos_attackMaxBandwidth: Peak attack bandwidth, in bps;</li><li>ddos_attackMaxPackageRate: Peak attack packet rate, in pps;</li><li>ddos_attackBandwidth: Attack bandwidth curve, in bps;</li><li>ddos_attackPackageRate: Attack packet rate curve, in pps.</li></ul>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use <code>*</code> instead. To query account-level data, you must have permission for all site resources of this interface.</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>List of DDoS policy group IDs. If not specified, all policy IDs are selected by default.</p>
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * <p>Query time granularity. If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.</p><p>Enumeration values:</p><ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>Data ownership region.</p><p>Enumeration values:</p><ul><li>overseas: global data (excluding the Chinese mainland);</li><li>mainland: data in the Chinese mainland;</li><li>global: global data.</li></ul><p>Default value: global</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Filter conditions. The maximum number of QueryCondition.Value collections is 20. The detailed filter conditions for QueryCondition.Key values are as follows:</p><li>ddos-attack-dip: filter by DDoS attack destination IP. QueryCondition.Operator only supports equals.</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
     * Get <p>Start time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p> 
     * @return StartTime <p>Start time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     * @param StartTime <p>Start time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time. The time is in Coordinated Universal Time (UTC), following the ISO 8601 standard date and time format. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p> 
     * @return EndTime <p>End time. The time is in Coordinated Universal Time (UTC), following the ISO 8601 standard date and time format. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time. The time is in Coordinated Universal Time (UTC), following the ISO 8601 standard date and time format. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     * @param EndTime <p>End time. The time is in Coordinated Universal Time (UTC), following the ISO 8601 standard date and time format. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>List of statistical metrics. Fill in at least 1, and duplication is not allowed.</p><p>Enumeration values:</p><ul><li>ddos_attackMaxBandwidth: Peak attack bandwidth, in bps;</li><li>ddos_attackMaxPackageRate: Peak attack packet rate, in pps;</li><li>ddos_attackBandwidth: Attack bandwidth curve, in bps;</li><li>ddos_attackPackageRate: Attack packet rate curve, in pps.</li></ul> 
     * @return MetricNames <p>List of statistical metrics. Fill in at least 1, and duplication is not allowed.</p><p>Enumeration values:</p><ul><li>ddos_attackMaxBandwidth: Peak attack bandwidth, in bps;</li><li>ddos_attackMaxPackageRate: Peak attack packet rate, in pps;</li><li>ddos_attackBandwidth: Attack bandwidth curve, in bps;</li><li>ddos_attackPackageRate: Attack packet rate curve, in pps.</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>List of statistical metrics. Fill in at least 1, and duplication is not allowed.</p><p>Enumeration values:</p><ul><li>ddos_attackMaxBandwidth: Peak attack bandwidth, in bps;</li><li>ddos_attackMaxPackageRate: Peak attack packet rate, in pps;</li><li>ddos_attackBandwidth: Attack bandwidth curve, in bps;</li><li>ddos_attackPackageRate: Attack packet rate curve, in pps.</li></ul>
     * @param MetricNames <p>List of statistical metrics. Fill in at least 1, and duplication is not allowed.</p><p>Enumeration values:</p><ul><li>ddos_attackMaxBandwidth: Peak attack bandwidth, in bps;</li><li>ddos_attackMaxPackageRate: Peak attack packet rate, in pps;</li><li>ddos_attackBandwidth: Attack bandwidth curve, in bps;</li><li>ddos_attackPackageRate: Attack packet rate curve, in pps.</li></ul>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use <code>*</code> instead. To query account-level data, you must have permission for all site resources of this interface.</p> 
     * @return ZoneIds <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use <code>*</code> instead. To query account-level data, you must have permission for all site resources of this interface.</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use <code>*</code> instead. To query account-level data, you must have permission for all site resources of this interface.</p>
     * @param ZoneIds <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use <code>*</code> instead. To query account-level data, you must have permission for all site resources of this interface.</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>List of DDoS policy group IDs. If not specified, all policy IDs are selected by default.</p> 
     * @return PolicyIds <p>List of DDoS policy group IDs. If not specified, all policy IDs are selected by default.</p>
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>List of DDoS policy group IDs. If not specified, all policy IDs are selected by default.</p>
     * @param PolicyIds <p>List of DDoS policy group IDs. If not specified, all policy IDs are selected by default.</p>
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get <p>Query time granularity. If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.</p><p>Enumeration values:</p><ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul> 
     * @return Interval <p>Query time granularity. If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.</p><p>Enumeration values:</p><ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Query time granularity. If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.</p><p>Enumeration values:</p><ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>
     * @param Interval <p>Query time granularity. If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.</p><p>Enumeration values:</p><ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Data ownership region.</p><p>Enumeration values:</p><ul><li>overseas: global data (excluding the Chinese mainland);</li><li>mainland: data in the Chinese mainland;</li><li>global: global data.</li></ul><p>Default value: global</p> 
     * @return Area <p>Data ownership region.</p><p>Enumeration values:</p><ul><li>overseas: global data (excluding the Chinese mainland);</li><li>mainland: data in the Chinese mainland;</li><li>global: global data.</li></ul><p>Default value: global</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data ownership region.</p><p>Enumeration values:</p><ul><li>overseas: global data (excluding the Chinese mainland);</li><li>mainland: data in the Chinese mainland;</li><li>global: global data.</li></ul><p>Default value: global</p>
     * @param Area <p>Data ownership region.</p><p>Enumeration values:</p><ul><li>overseas: global data (excluding the Chinese mainland);</li><li>mainland: data in the Chinese mainland;</li><li>global: global data.</li></ul><p>Default value: global</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Filter conditions. The maximum number of QueryCondition.Value collections is 20. The detailed filter conditions for QueryCondition.Key values are as follows:</p><li>ddos-attack-dip: filter by DDoS attack destination IP. QueryCondition.Operator only supports equals.</li> 
     * @return Filters <p>Filter conditions. The maximum number of QueryCondition.Value collections is 20. The detailed filter conditions for QueryCondition.Key values are as follows:</p><li>ddos-attack-dip: filter by DDoS attack destination IP. QueryCondition.Operator only supports equals.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions. The maximum number of QueryCondition.Value collections is 20. The detailed filter conditions for QueryCondition.Key values are as follows:</p><li>ddos-attack-dip: filter by DDoS attack destination IP. QueryCondition.Operator only supports equals.</li>
     * @param Filters <p>Filter conditions. The maximum number of QueryCondition.Value collections is 20. The detailed filter conditions for QueryCondition.Key values are as follows:</p><li>ddos-attack-dip: filter by DDoS attack destination IP. QueryCondition.Operator only supports equals.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDDoSAttackDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackDataRequest(DescribeDDoSAttackDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

