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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewDDoSEvent extends AbstractModel{

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

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
    * Attack type
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Attack status. `0`: The attack is ongoing; `1`: The attack ends.
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * Attack traffic, in Mbps
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * Attack packets, in PPS
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * Anti-DDoS service type. `bgp-multip`: Anti-DDoS Pro; `bgpip`: Anti-DDoS Advanced; `basic`: Anti-DDoS Basic.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Anti-DDoS instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get IP 
     * @return Vip IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP
     * @param Vip IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

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
     * Get Attack type 
     * @return AttackType Attack type
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type
     * @param AttackType Attack type
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Attack status. `0`: The attack is ongoing; `1`: The attack ends. 
     * @return AttackStatus Attack status. `0`: The attack is ongoing; `1`: The attack ends.
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Attack status. `0`: The attack is ongoing; `1`: The attack ends.
     * @param AttackStatus Attack status. `0`: The attack is ongoing; `1`: The attack ends.
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get Attack traffic, in Mbps 
     * @return Mbps Attack traffic, in Mbps
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * Set Attack traffic, in Mbps
     * @param Mbps Attack traffic, in Mbps
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * Get Attack packets, in PPS 
     * @return Pps Attack packets, in PPS
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set Attack packets, in PPS
     * @param Pps Attack packets, in PPS
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * Get Anti-DDoS service type. `bgp-multip`: Anti-DDoS Pro; `bgpip`: Anti-DDoS Advanced; `basic`: Anti-DDoS Basic. 
     * @return Business Anti-DDoS service type. `bgp-multip`: Anti-DDoS Pro; `bgpip`: Anti-DDoS Advanced; `basic`: Anti-DDoS Basic.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgp-multip`: Anti-DDoS Pro; `bgpip`: Anti-DDoS Advanced; `basic`: Anti-DDoS Basic.
     * @param Business Anti-DDoS service type. `bgp-multip`: Anti-DDoS Pro; `bgpip`: Anti-DDoS Advanced; `basic`: Anti-DDoS Basic.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return InstanceId Anti-DDoS instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param InstanceId Anti-DDoS instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Anti-DDoS instance name 
     * @return InstanceName Anti-DDoS instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Anti-DDoS instance name
     * @param InstanceName Anti-DDoS instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public OverviewDDoSEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewDDoSEvent(OverviewDDoSEvent source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.Mbps != null) {
            this.Mbps = new Long(source.Mbps);
        }
        if (source.Pps != null) {
            this.Pps = new Long(source.Pps);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

