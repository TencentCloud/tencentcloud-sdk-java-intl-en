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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosAttackEventDetailData extends AbstractModel{

    /**
    * Attack status
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * Attack type
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Maximum bandwidth
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Maximum packet rate
    */
    @SerializedName("PacketMaxRate")
    @Expose
    private Long PacketMaxRate;

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * DDoS policy group ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get Attack status 
     * @return AttackStatus Attack status
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Attack status
     * @param AttackStatus Attack status
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
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
     * Get End time 
     * @return EndTime End time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Maximum bandwidth 
     * @return MaxBandWidth Maximum bandwidth
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Maximum bandwidth
     * @param MaxBandWidth Maximum bandwidth
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Maximum packet rate 
     * @return PacketMaxRate Maximum packet rate
     */
    public Long getPacketMaxRate() {
        return this.PacketMaxRate;
    }

    /**
     * Set Maximum packet rate
     * @param PacketMaxRate Maximum packet rate
     */
    public void setPacketMaxRate(Long PacketMaxRate) {
        this.PacketMaxRate = PacketMaxRate;
    }

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get DDoS policy group ID 
     * @return PolicyId DDoS policy group ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set DDoS policy group ID
     * @param PolicyId DDoS policy group ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DDosAttackEventDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosAttackEventDetailData(DDosAttackEventDetailData source) {
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.PacketMaxRate != null) {
            this.PacketMaxRate = new Long(source.PacketMaxRate);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "PacketMaxRate", this.PacketMaxRate);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

