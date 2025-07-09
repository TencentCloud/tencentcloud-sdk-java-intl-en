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

public class DescribeDDosAttackTopDataRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filter metric
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Number of the top data entries to query. 0: queries all data entries.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Site set
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Set of DDoS policy group IDs
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * Port number
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Protocol type. Valid values: tcp, udp, all
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * Attack type. Valid values: flood, icmpFlood..., all
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter metric 
     * @return MetricName Filter metric
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Filter metric
     * @param MetricName Filter metric
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Number of the top data entries to query. 0: queries all data entries. 
     * @return Limit Number of the top data entries to query. 0: queries all data entries.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of the top data entries to query. 0: queries all data entries.
     * @param Limit Number of the top data entries to query. 0: queries all data entries.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Site set 
     * @return ZoneIds Site set
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site set
     * @param ZoneIds Site set
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Set of DDoS policy group IDs 
     * @return PolicyIds Set of DDoS policy group IDs
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Set of DDoS policy group IDs
     * @param PolicyIds Set of DDoS policy group IDs
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Port number 
     * @return Port Port number
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number
     * @param Port Port number
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol type. Valid values: tcp, udp, all 
     * @return ProtocolType Protocol type. Valid values: tcp, udp, all
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set Protocol type. Valid values: tcp, udp, all
     * @param ProtocolType Protocol type. Valid values: tcp, udp, all
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get Attack type. Valid values: flood, icmpFlood..., all 
     * @return AttackType Attack type. Valid values: flood, icmpFlood..., all
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type. Valid values: flood, icmpFlood..., all
     * @param AttackType Attack type. Valid values: flood, icmpFlood..., all
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    public DescribeDDosAttackTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDosAttackTopDataRequest(DescribeDDosAttackTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);

    }
}

