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

public class DDoSAttackEvent extends AbstractModel {

    /**
    * The event ID.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * The attack type.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * The attack status.
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * The maximum attack bandwidth.
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * The peak attack packet rate.
    */
    @SerializedName("AttackPacketMaxRate")
    @Expose
    private Long AttackPacketMaxRate;

    /**
    * The attack start time recorded in seconds.
    */
    @SerializedName("AttackStartTime")
    @Expose
    private Long AttackStartTime;

    /**
    * The attack end time recorded in seconds.
    */
    @SerializedName("AttackEndTime")
    @Expose
    private Long AttackEndTime;

    /**
    * The DDoS policy ID. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * The site ID. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The blocking time of a DDoS attack. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DDoSBlockData")
    @Expose
    private DDoSBlockData [] DDoSBlockData;

    /**
     * Get The event ID. 
     * @return EventId The event ID.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set The event ID.
     * @param EventId The event ID.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get The attack type. 
     * @return AttackType The attack type.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set The attack type.
     * @param AttackType The attack type.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get The attack status. 
     * @return AttackStatus The attack status.
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set The attack status.
     * @param AttackStatus The attack status.
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get The maximum attack bandwidth. 
     * @return AttackMaxBandWidth The maximum attack bandwidth.
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set The maximum attack bandwidth.
     * @param AttackMaxBandWidth The maximum attack bandwidth.
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get The peak attack packet rate. 
     * @return AttackPacketMaxRate The peak attack packet rate.
     */
    public Long getAttackPacketMaxRate() {
        return this.AttackPacketMaxRate;
    }

    /**
     * Set The peak attack packet rate.
     * @param AttackPacketMaxRate The peak attack packet rate.
     */
    public void setAttackPacketMaxRate(Long AttackPacketMaxRate) {
        this.AttackPacketMaxRate = AttackPacketMaxRate;
    }

    /**
     * Get The attack start time recorded in seconds. 
     * @return AttackStartTime The attack start time recorded in seconds.
     */
    public Long getAttackStartTime() {
        return this.AttackStartTime;
    }

    /**
     * Set The attack start time recorded in seconds.
     * @param AttackStartTime The attack start time recorded in seconds.
     */
    public void setAttackStartTime(Long AttackStartTime) {
        this.AttackStartTime = AttackStartTime;
    }

    /**
     * Get The attack end time recorded in seconds. 
     * @return AttackEndTime The attack end time recorded in seconds.
     */
    public Long getAttackEndTime() {
        return this.AttackEndTime;
    }

    /**
     * Set The attack end time recorded in seconds.
     * @param AttackEndTime The attack end time recorded in seconds.
     */
    public void setAttackEndTime(Long AttackEndTime) {
        this.AttackEndTime = AttackEndTime;
    }

    /**
     * Get The DDoS policy ID. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PolicyId The DDoS policy ID. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The DDoS policy ID. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param PolicyId The DDoS policy ID. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The site ID. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ZoneId The site ID. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param ZoneId The site ID. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Area Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
Note: This field may return `null`, indicating that no valid value was found.
     * @param Area Geolocation scope. Values: 
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The blocking time of a DDoS attack. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DDoSBlockData The blocking time of a DDoS attack. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DDoSBlockData [] getDDoSBlockData() {
        return this.DDoSBlockData;
    }

    /**
     * Set The blocking time of a DDoS attack. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param DDoSBlockData The blocking time of a DDoS attack. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDDoSBlockData(DDoSBlockData [] DDoSBlockData) {
        this.DDoSBlockData = DDoSBlockData;
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

    }
}

