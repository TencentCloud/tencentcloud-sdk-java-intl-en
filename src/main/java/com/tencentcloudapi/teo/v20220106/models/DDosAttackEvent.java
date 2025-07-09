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

public class DDosAttackEvent extends AbstractModel {

    /**
    * DDoS policy group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Attack type (corresponding to interaction event name)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Attack status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * Maximum attack bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * Peak attack packet rate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackPacketMaxRate")
    @Expose
    private Long AttackPacketMaxRate;

    /**
    * Attack start time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackStartTime")
    @Expose
    private Long AttackStartTime;

    /**
    * Attack end time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackEndTime")
    @Expose
    private Long AttackEndTime;

    /**
    * Event ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Site ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get DDoS policy group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyId DDoS policy group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set DDoS policy group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyId DDoS policy group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Attack type (corresponding to interaction event name)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackType Attack type (corresponding to interaction event name)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type (corresponding to interaction event name)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackType Attack type (corresponding to interaction event name)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Attack status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackStatus Attack status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Attack status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackStatus Attack status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get Maximum attack bandwidth
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackMaxBandWidth Maximum attack bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set Maximum attack bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackMaxBandWidth Maximum attack bandwidth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get Peak attack packet rate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackPacketMaxRate Peak attack packet rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackPacketMaxRate() {
        return this.AttackPacketMaxRate;
    }

    /**
     * Set Peak attack packet rate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackPacketMaxRate Peak attack packet rate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackPacketMaxRate(Long AttackPacketMaxRate) {
        this.AttackPacketMaxRate = AttackPacketMaxRate;
    }

    /**
     * Get Attack start time in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackStartTime Attack start time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackStartTime() {
        return this.AttackStartTime;
    }

    /**
     * Set Attack start time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackStartTime Attack start time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackStartTime(Long AttackStartTime) {
        this.AttackStartTime = AttackStartTime;
    }

    /**
     * Get Attack end time in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackEndTime Attack end time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackEndTime() {
        return this.AttackEndTime;
    }

    /**
     * Set Attack end time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackEndTime Attack end time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackEndTime(Long AttackEndTime) {
        this.AttackEndTime = AttackEndTime;
    }

    /**
     * Get Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Site ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Site ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Site ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DDosAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosAttackEvent(DDosAttackEvent source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
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
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "AttackMaxBandWidth", this.AttackMaxBandWidth);
        this.setParamSimple(map, prefix + "AttackPacketMaxRate", this.AttackPacketMaxRate);
        this.setParamSimple(map, prefix + "AttackStartTime", this.AttackStartTime);
        this.setParamSimple(map, prefix + "AttackEndTime", this.AttackEndTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

