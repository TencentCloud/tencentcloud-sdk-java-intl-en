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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSEventRecord extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Attack start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Attack end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Maximum attack bandwidth
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * Maximum attack packet rate
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * Attack type
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Whether the IP is blocked. Valid values: [1 (yes), 0 (no), 2 (invalid value)]
    */
    @SerializedName("BlockFlag")
    @Expose
    private Long BlockFlag;

    /**
    * Whether the elastic protection bandwidth is exceeded. Valid values: [yes (yes), no (no), empty string (unknown value)]
    */
    @SerializedName("OverLoad")
    @Expose
    private String OverLoad;

    /**
    * Attack status. Valid values: [0 (ongoing), 1 (ended)]
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * Resource name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Attack event ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource IP 
     * @return Vip Resource IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Resource IP
     * @param Vip Resource IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Attack start time 
     * @return StartTime Attack start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Attack start time
     * @param StartTime Attack start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Attack end time 
     * @return EndTime Attack end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Attack end time
     * @param EndTime Attack end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Maximum attack bandwidth 
     * @return Mbps Maximum attack bandwidth
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * Set Maximum attack bandwidth
     * @param Mbps Maximum attack bandwidth
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * Get Maximum attack packet rate 
     * @return Pps Maximum attack packet rate
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set Maximum attack packet rate
     * @param Pps Maximum attack packet rate
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
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
     * Get Whether the IP is blocked. Valid values: [1 (yes), 0 (no), 2 (invalid value)] 
     * @return BlockFlag Whether the IP is blocked. Valid values: [1 (yes), 0 (no), 2 (invalid value)]
     */
    public Long getBlockFlag() {
        return this.BlockFlag;
    }

    /**
     * Set Whether the IP is blocked. Valid values: [1 (yes), 0 (no), 2 (invalid value)]
     * @param BlockFlag Whether the IP is blocked. Valid values: [1 (yes), 0 (no), 2 (invalid value)]
     */
    public void setBlockFlag(Long BlockFlag) {
        this.BlockFlag = BlockFlag;
    }

    /**
     * Get Whether the elastic protection bandwidth is exceeded. Valid values: [yes (yes), no (no), empty string (unknown value)] 
     * @return OverLoad Whether the elastic protection bandwidth is exceeded. Valid values: [yes (yes), no (no), empty string (unknown value)]
     */
    public String getOverLoad() {
        return this.OverLoad;
    }

    /**
     * Set Whether the elastic protection bandwidth is exceeded. Valid values: [yes (yes), no (no), empty string (unknown value)]
     * @param OverLoad Whether the elastic protection bandwidth is exceeded. Valid values: [yes (yes), no (no), empty string (unknown value)]
     */
    public void setOverLoad(String OverLoad) {
        this.OverLoad = OverLoad;
    }

    /**
     * Get Attack status. Valid values: [0 (ongoing), 1 (ended)] 
     * @return AttackStatus Attack status. Valid values: [0 (ongoing), 1 (ended)]
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Attack status. Valid values: [0 (ongoing), 1 (ended)]
     * @param AttackStatus Attack status. Valid values: [0 (ongoing), 1 (ended)]
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get Resource name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Attack event ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EventId Attack event ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Attack event ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EventId Attack event ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "BlockFlag", this.BlockFlag);
        this.setParamSimple(map, prefix + "OverLoad", this.OverLoad);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

