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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackTopDataRequest extends AbstractModel{

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The statistical metric. Values:
<li>`ddos_attackFlux_protocol`: Top-ranked protocols by DDoS attack traffic.</li>
<li>`ddos_attackPackageNum_protocol`: Top-ranked protocols by DDoS attack packets.</li>
<li>`ddos_attackNum_attackType`: Top-ranked attack types by DDoS attacks.</li>
<li>`ddos_attackNum_sregion`: Top-ranked attack source regions by DDoS attacks.</li>
<li>`ddos_attackFlux_sip`: Top-ranked attacker IPs by DDoS attack traffic.</li>
<li>`ddos_attackFlux_sregion`: Top-ranked attack source regions by DDoS attack traffic.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * List of site IDs to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * The list of DDoS policy IDs to be specified. All policies will be selected if this field is not specified.
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * The attack type. Values:
<li>`flood`: Flood;</li>
<li>`icmpFlood`: ICMP flood;</li>
<li>`all`: All attack types.</li>This field will be set to the default value `all` if not specified.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * The protocol type. Values:
<li>`tcp`: TCP protocol;</li>
<li>`udp`: UDP protocol;</li>
<li>`all`: All protocol types.</li>This field will be set to the default value `all` if not specified.
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * The port number.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. 
     * @return EndTime The end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time.
     * @param EndTime The end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The statistical metric. Values:
<li>`ddos_attackFlux_protocol`: Top-ranked protocols by DDoS attack traffic.</li>
<li>`ddos_attackPackageNum_protocol`: Top-ranked protocols by DDoS attack packets.</li>
<li>`ddos_attackNum_attackType`: Top-ranked attack types by DDoS attacks.</li>
<li>`ddos_attackNum_sregion`: Top-ranked attack source regions by DDoS attacks.</li>
<li>`ddos_attackFlux_sip`: Top-ranked attacker IPs by DDoS attack traffic.</li>
<li>`ddos_attackFlux_sregion`: Top-ranked attack source regions by DDoS attack traffic.</li> 
     * @return MetricName The statistical metric. Values:
<li>`ddos_attackFlux_protocol`: Top-ranked protocols by DDoS attack traffic.</li>
<li>`ddos_attackPackageNum_protocol`: Top-ranked protocols by DDoS attack packets.</li>
<li>`ddos_attackNum_attackType`: Top-ranked attack types by DDoS attacks.</li>
<li>`ddos_attackNum_sregion`: Top-ranked attack source regions by DDoS attacks.</li>
<li>`ddos_attackFlux_sip`: Top-ranked attacker IPs by DDoS attack traffic.</li>
<li>`ddos_attackFlux_sregion`: Top-ranked attack source regions by DDoS attack traffic.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set The statistical metric. Values:
<li>`ddos_attackFlux_protocol`: Top-ranked protocols by DDoS attack traffic.</li>
<li>`ddos_attackPackageNum_protocol`: Top-ranked protocols by DDoS attack packets.</li>
<li>`ddos_attackNum_attackType`: Top-ranked attack types by DDoS attacks.</li>
<li>`ddos_attackNum_sregion`: Top-ranked attack source regions by DDoS attacks.</li>
<li>`ddos_attackFlux_sip`: Top-ranked attacker IPs by DDoS attack traffic.</li>
<li>`ddos_attackFlux_sregion`: Top-ranked attack source regions by DDoS attack traffic.</li>
     * @param MetricName The statistical metric. Values:
<li>`ddos_attackFlux_protocol`: Top-ranked protocols by DDoS attack traffic.</li>
<li>`ddos_attackPackageNum_protocol`: Top-ranked protocols by DDoS attack packets.</li>
<li>`ddos_attackNum_attackType`: Top-ranked attack types by DDoS attacks.</li>
<li>`ddos_attackNum_sregion`: Top-ranked attack source regions by DDoS attacks.</li>
<li>`ddos_attackFlux_sip`: Top-ranked attacker IPs by DDoS attack traffic.</li>
<li>`ddos_attackFlux_sregion`: Top-ranked attack source regions by DDoS attack traffic.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get List of site IDs to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds List of site IDs to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of site IDs to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds List of site IDs to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get The list of DDoS policy IDs to be specified. All policies will be selected if this field is not specified. 
     * @return PolicyIds The list of DDoS policy IDs to be specified. All policies will be selected if this field is not specified.
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set The list of DDoS policy IDs to be specified. All policies will be selected if this field is not specified.
     * @param PolicyIds The list of DDoS policy IDs to be specified. All policies will be selected if this field is not specified.
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get The attack type. Values:
<li>`flood`: Flood;</li>
<li>`icmpFlood`: ICMP flood;</li>
<li>`all`: All attack types.</li>This field will be set to the default value `all` if not specified. 
     * @return AttackType The attack type. Values:
<li>`flood`: Flood;</li>
<li>`icmpFlood`: ICMP flood;</li>
<li>`all`: All attack types.</li>This field will be set to the default value `all` if not specified.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set The attack type. Values:
<li>`flood`: Flood;</li>
<li>`icmpFlood`: ICMP flood;</li>
<li>`all`: All attack types.</li>This field will be set to the default value `all` if not specified.
     * @param AttackType The attack type. Values:
<li>`flood`: Flood;</li>
<li>`icmpFlood`: ICMP flood;</li>
<li>`all`: All attack types.</li>This field will be set to the default value `all` if not specified.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get The protocol type. Values:
<li>`tcp`: TCP protocol;</li>
<li>`udp`: UDP protocol;</li>
<li>`all`: All protocol types.</li>This field will be set to the default value `all` if not specified. 
     * @return ProtocolType The protocol type. Values:
<li>`tcp`: TCP protocol;</li>
<li>`udp`: UDP protocol;</li>
<li>`all`: All protocol types.</li>This field will be set to the default value `all` if not specified.
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set The protocol type. Values:
<li>`tcp`: TCP protocol;</li>
<li>`udp`: UDP protocol;</li>
<li>`all`: All protocol types.</li>This field will be set to the default value `all` if not specified.
     * @param ProtocolType The protocol type. Values:
<li>`tcp`: TCP protocol;</li>
<li>`udp`: UDP protocol;</li>
<li>`all`: All protocol types.</li>This field will be set to the default value `all` if not specified.
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get The port number. 
     * @return Port The port number.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The port number.
     * @param Port The port number.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified. 
     * @return Limit Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     * @param Limit Queries the top n rows of data. Top 10 rows of data will be queried if this field is not specified.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location. 
     * @return Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     * @param Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
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

