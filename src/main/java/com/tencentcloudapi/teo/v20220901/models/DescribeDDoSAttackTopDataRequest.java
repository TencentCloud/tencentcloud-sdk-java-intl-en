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

public class DescribeDDoSAttackTopDataRequest extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queried statistical metric. Valid values:
<li>ddos_attackFlux_protocol: ranking of attack traffic by protocol;</li>
<li>ddos_attackPackageNum_protocol: ranking by attack packet volume of each protocol;</li>
<li>ddos_attackNum_attackType: Ranking by number of attacks for each attack type;</li>
<li>ddos_attackNum_sregion: ranking by number of attacks by attack source region;</li>
<li>ddos_attackFlux_sip: ranking by number of attacks from attack source IPs;</li>
<li>ddos_attackFlux_sregion: ranking of attackNum by attack source region.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Set of DDoS policy group IDs. If not specified, all policy IDs are selected by default.
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * Attack type. Valid values:
<li>flood: flood attack;</li>
<li>icmpFlood: ICMP flood attack;</li>
<li>all: all attack types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all attack types.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Protocol type. Valid values:
<li>tcp: TCP protocol;</li>
<li>udp: UDP protocol;</li>
<li>all: all protocol types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all protocols.
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * Port number.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Indicates the top N data to be queried. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data.</li>If not specified, the region will be smart selected according to the user's location.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queried statistical metric. Valid values:
<li>ddos_attackFlux_protocol: ranking of attack traffic by protocol;</li>
<li>ddos_attackPackageNum_protocol: ranking by attack packet volume of each protocol;</li>
<li>ddos_attackNum_attackType: Ranking by number of attacks for each attack type;</li>
<li>ddos_attackNum_sregion: ranking by number of attacks by attack source region;</li>
<li>ddos_attackFlux_sip: ranking by number of attacks from attack source IPs;</li>
<li>ddos_attackFlux_sregion: ranking of attackNum by attack source region.</li> 
     * @return MetricName Queried statistical metric. Valid values:
<li>ddos_attackFlux_protocol: ranking of attack traffic by protocol;</li>
<li>ddos_attackPackageNum_protocol: ranking by attack packet volume of each protocol;</li>
<li>ddos_attackNum_attackType: Ranking by number of attacks for each attack type;</li>
<li>ddos_attackNum_sregion: ranking by number of attacks by attack source region;</li>
<li>ddos_attackFlux_sip: ranking by number of attacks from attack source IPs;</li>
<li>ddos_attackFlux_sregion: ranking of attackNum by attack source region.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Queried statistical metric. Valid values:
<li>ddos_attackFlux_protocol: ranking of attack traffic by protocol;</li>
<li>ddos_attackPackageNum_protocol: ranking by attack packet volume of each protocol;</li>
<li>ddos_attackNum_attackType: Ranking by number of attacks for each attack type;</li>
<li>ddos_attackNum_sregion: ranking by number of attacks by attack source region;</li>
<li>ddos_attackFlux_sip: ranking by number of attacks from attack source IPs;</li>
<li>ddos_attackFlux_sregion: ranking of attackNum by attack source region.</li>
     * @param MetricName Queried statistical metric. Valid values:
<li>ddos_attackFlux_protocol: ranking of attack traffic by protocol;</li>
<li>ddos_attackPackageNum_protocol: ranking by attack packet volume of each protocol;</li>
<li>ddos_attackNum_attackType: Ranking by number of attacks for each attack type;</li>
<li>ddos_attackNum_sregion: ranking by number of attacks by attack source region;</li>
<li>ddos_attackFlux_sip: ranking by number of attacks from attack source IPs;</li>
<li>ddos_attackFlux_sregion: ranking of attackNum by attack source region.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface. 
     * @return ZoneIds Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     * @param ZoneIds Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). Import up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Set of DDoS policy group IDs. If not specified, all policy IDs are selected by default. 
     * @return PolicyIds Set of DDoS policy group IDs. If not specified, all policy IDs are selected by default.
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Set of DDoS policy group IDs. If not specified, all policy IDs are selected by default.
     * @param PolicyIds Set of DDoS policy group IDs. If not specified, all policy IDs are selected by default.
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Attack type. Valid values:
<li>flood: flood attack;</li>
<li>icmpFlood: ICMP flood attack;</li>
<li>all: all attack types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all attack types. 
     * @return AttackType Attack type. Valid values:
<li>flood: flood attack;</li>
<li>icmpFlood: ICMP flood attack;</li>
<li>all: all attack types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all attack types.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type. Valid values:
<li>flood: flood attack;</li>
<li>icmpFlood: ICMP flood attack;</li>
<li>all: all attack types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all attack types.
     * @param AttackType Attack type. Valid values:
<li>flood: flood attack;</li>
<li>icmpFlood: ICMP flood attack;</li>
<li>all: all attack types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all attack types.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Protocol type. Valid values:
<li>tcp: TCP protocol;</li>
<li>udp: UDP protocol;</li>
<li>all: all protocol types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all protocols. 
     * @return ProtocolType Protocol type. Valid values:
<li>tcp: TCP protocol;</li>
<li>udp: UDP protocol;</li>
<li>all: all protocol types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all protocols.
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set Protocol type. Valid values:
<li>tcp: TCP protocol;</li>
<li>udp: UDP protocol;</li>
<li>all: all protocol types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all protocols.
     * @param ProtocolType Protocol type. Valid values:
<li>tcp: TCP protocol;</li>
<li>udp: UDP protocol;</li>
<li>all: all protocol types.</li>If this parameter is not input, the default value `all` is used, indicating a query for all protocols.
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get Port number. 
     * @return Port Port number.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number.
     * @param Port Port number.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Indicates the top N data to be queried. If this parameter is not input, the default value is 10, indicating querying the top 10 data. 
     * @return Limit Indicates the top N data to be queried. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Indicates the top N data to be queried. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     * @param Limit Indicates the top N data to be queried. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data.</li>If not specified, the region will be smart selected according to the user's location. 
     * @return Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data.</li>If not specified, the region will be smart selected according to the user's location.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data.</li>If not specified, the region will be smart selected according to the user's location.
     * @param Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data.</li>If not specified, the region will be smart selected according to the user's location.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeDDoSAttackTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackTopDataRequest(DescribeDDoSAttackTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
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
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

