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

public class DDoSAttackEvent extends AbstractModel {

    /**
    * <p>Event ID.</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>Attack type.</p>
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * <p>Attack status.</p><p>Enumeration values:</p><ul><li>0: Observing</li><li>1: Attacking</li><li>2: Attack ended</li></ul>
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * <p>Maximum attack bandwidth, in bps.</p>
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * <p>Peak attack packet rate, unit: pps.</p>
    */
    @SerializedName("AttackPacketMaxRate")
    @Expose
    private Long AttackPacketMaxRate;

    /**
    * <p>Attack start timestamp.</p><p>Unit: second</p>
    */
    @SerializedName("AttackStartTime")
    @Expose
    private Long AttackStartTime;

    /**
    * <p>Attack end timestamp.</p><p>Unit: second</p>
    */
    @SerializedName("AttackEndTime")
    @Expose
    private Long AttackEndTime;

    /**
    * <p>DDoS policy group ID.</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>Zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Region of the attack event.</p><p>Enumeration values:</p><ul><li>overseas: global (excluding the Chinese mainland) data;</li><li>mainland: Chinese mainland data.</li></ul>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Block and unblock info.</p>
    */
    @SerializedName("DDoSBlockData")
    @Expose
    private DDoSBlockData [] DDoSBlockData;

    /**
    * <p>List of target IPs under DDoS attack.</p>
    */
    @SerializedName("DDoSAttackDips")
    @Expose
    private String [] DDoSAttackDips;

    /**
     * Get <p>Event ID.</p> 
     * @return EventId <p>Event ID.</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>Event ID.</p>
     * @param EventId <p>Event ID.</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>Attack type.</p> 
     * @return AttackType <p>Attack type.</p>
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set <p>Attack type.</p>
     * @param AttackType <p>Attack type.</p>
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get <p>Attack status.</p><p>Enumeration values:</p><ul><li>0: Observing</li><li>1: Attacking</li><li>2: Attack ended</li></ul> 
     * @return AttackStatus <p>Attack status.</p><p>Enumeration values:</p><ul><li>0: Observing</li><li>1: Attacking</li><li>2: Attack ended</li></ul>
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set <p>Attack status.</p><p>Enumeration values:</p><ul><li>0: Observing</li><li>1: Attacking</li><li>2: Attack ended</li></ul>
     * @param AttackStatus <p>Attack status.</p><p>Enumeration values:</p><ul><li>0: Observing</li><li>1: Attacking</li><li>2: Attack ended</li></ul>
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get <p>Maximum attack bandwidth, in bps.</p> 
     * @return AttackMaxBandWidth <p>Maximum attack bandwidth, in bps.</p>
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set <p>Maximum attack bandwidth, in bps.</p>
     * @param AttackMaxBandWidth <p>Maximum attack bandwidth, in bps.</p>
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get <p>Peak attack packet rate, unit: pps.</p> 
     * @return AttackPacketMaxRate <p>Peak attack packet rate, unit: pps.</p>
     */
    public Long getAttackPacketMaxRate() {
        return this.AttackPacketMaxRate;
    }

    /**
     * Set <p>Peak attack packet rate, unit: pps.</p>
     * @param AttackPacketMaxRate <p>Peak attack packet rate, unit: pps.</p>
     */
    public void setAttackPacketMaxRate(Long AttackPacketMaxRate) {
        this.AttackPacketMaxRate = AttackPacketMaxRate;
    }

    /**
     * Get <p>Attack start timestamp.</p><p>Unit: second</p> 
     * @return AttackStartTime <p>Attack start timestamp.</p><p>Unit: second</p>
     */
    public Long getAttackStartTime() {
        return this.AttackStartTime;
    }

    /**
     * Set <p>Attack start timestamp.</p><p>Unit: second</p>
     * @param AttackStartTime <p>Attack start timestamp.</p><p>Unit: second</p>
     */
    public void setAttackStartTime(Long AttackStartTime) {
        this.AttackStartTime = AttackStartTime;
    }

    /**
     * Get <p>Attack end timestamp.</p><p>Unit: second</p> 
     * @return AttackEndTime <p>Attack end timestamp.</p><p>Unit: second</p>
     */
    public Long getAttackEndTime() {
        return this.AttackEndTime;
    }

    /**
     * Set <p>Attack end timestamp.</p><p>Unit: second</p>
     * @param AttackEndTime <p>Attack end timestamp.</p><p>Unit: second</p>
     */
    public void setAttackEndTime(Long AttackEndTime) {
        this.AttackEndTime = AttackEndTime;
    }

    /**
     * Get <p>DDoS policy group ID.</p> 
     * @return PolicyId <p>DDoS policy group ID.</p>
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>DDoS policy group ID.</p>
     * @param PolicyId <p>DDoS policy group ID.</p>
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Region of the attack event.</p><p>Enumeration values:</p><ul><li>overseas: global (excluding the Chinese mainland) data;</li><li>mainland: Chinese mainland data.</li></ul> 
     * @return Area <p>Region of the attack event.</p><p>Enumeration values:</p><ul><li>overseas: global (excluding the Chinese mainland) data;</li><li>mainland: Chinese mainland data.</li></ul>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Region of the attack event.</p><p>Enumeration values:</p><ul><li>overseas: global (excluding the Chinese mainland) data;</li><li>mainland: Chinese mainland data.</li></ul>
     * @param Area <p>Region of the attack event.</p><p>Enumeration values:</p><ul><li>overseas: global (excluding the Chinese mainland) data;</li><li>mainland: Chinese mainland data.</li></ul>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Block and unblock info.</p> 
     * @return DDoSBlockData <p>Block and unblock info.</p>
     */
    public DDoSBlockData [] getDDoSBlockData() {
        return this.DDoSBlockData;
    }

    /**
     * Set <p>Block and unblock info.</p>
     * @param DDoSBlockData <p>Block and unblock info.</p>
     */
    public void setDDoSBlockData(DDoSBlockData [] DDoSBlockData) {
        this.DDoSBlockData = DDoSBlockData;
    }

    /**
     * Get <p>List of target IPs under DDoS attack.</p> 
     * @return DDoSAttackDips <p>List of target IPs under DDoS attack.</p>
     */
    public String [] getDDoSAttackDips() {
        return this.DDoSAttackDips;
    }

    /**
     * Set <p>List of target IPs under DDoS attack.</p>
     * @param DDoSAttackDips <p>List of target IPs under DDoS attack.</p>
     */
    public void setDDoSAttackDips(String [] DDoSAttackDips) {
        this.DDoSAttackDips = DDoSAttackDips;
    }

    public DDoSAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackEvent(DDoSAttackEvent source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.AttackMaxBandWidth != null) {
            this.AttackMaxBandWidth = new Long(source.AttackMaxBandWidth);
        }
        if (source.AttackPacketMaxRate != null) {
            this.AttackPacketMaxRate = new Long(source.AttackPacketMaxRate);
        }
        if (source.AttackStartTime != null) {
            this.AttackStartTime = new Long(source.AttackStartTime);
        }
        if (source.AttackEndTime != null) {
            this.AttackEndTime = new Long(source.AttackEndTime);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.DDoSBlockData != null) {
            this.DDoSBlockData = new DDoSBlockData[source.DDoSBlockData.length];
            for (int i = 0; i < source.DDoSBlockData.length; i++) {
                this.DDoSBlockData[i] = new DDoSBlockData(source.DDoSBlockData[i]);
            }
        }
        if (source.DDoSAttackDips != null) {
            this.DDoSAttackDips = new String[source.DDoSAttackDips.length];
            for (int i = 0; i < source.DDoSAttackDips.length; i++) {
                this.DDoSAttackDips[i] = new String(source.DDoSAttackDips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "AttackMaxBandWidth", this.AttackMaxBandWidth);
        this.setParamSimple(map, prefix + "AttackPacketMaxRate", this.AttackPacketMaxRate);
        this.setParamSimple(map, prefix + "AttackStartTime", this.AttackStartTime);
        this.setParamSimple(map, prefix + "AttackEndTime", this.AttackEndTime);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "DDoSBlockData.", this.DDoSBlockData);
        this.setParamArraySimple(map, prefix + "DDoSAttackDips.", this.DDoSAttackDips);

    }
}

