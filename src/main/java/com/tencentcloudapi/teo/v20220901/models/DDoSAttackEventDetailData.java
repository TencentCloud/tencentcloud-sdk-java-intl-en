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

public class DDoSAttackEventDetailData extends AbstractModel{

    /**
    * The attack status. Values:
<li>`1`: The attack is being observed;</li>
<li>`2`: The attack started;</li>
<li>`3`: The attack ended.</li>
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * The attack type.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * The end time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The maximum bandwidth.
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * The maximum packet rate.
    */
    @SerializedName("PacketMaxRate")
    @Expose
    private Long PacketMaxRate;

    /**
    * The event ID.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * The DDoS policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get The attack status. Values:
<li>`1`: The attack is being observed;</li>
<li>`2`: The attack started;</li>
<li>`3`: The attack ended.</li> 
     * @return AttackStatus The attack status. Values:
<li>`1`: The attack is being observed;</li>
<li>`2`: The attack started;</li>
<li>`3`: The attack ended.</li>
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set The attack status. Values:
<li>`1`: The attack is being observed;</li>
<li>`2`: The attack started;</li>
<li>`3`: The attack ended.</li>
     * @param AttackStatus The attack status. Values:
<li>`1`: The attack is being observed;</li>
<li>`2`: The attack started;</li>
<li>`3`: The attack ended.</li>
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
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
     * Get The end time. 
     * @return EndTime The end time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time.
     * @param EndTime The end time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The maximum bandwidth. 
     * @return MaxBandWidth The maximum bandwidth.
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set The maximum bandwidth.
     * @param MaxBandWidth The maximum bandwidth.
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get The maximum packet rate. 
     * @return PacketMaxRate The maximum packet rate.
     */
    public Long getPacketMaxRate() {
        return this.PacketMaxRate;
    }

    /**
     * Set The maximum packet rate.
     * @param PacketMaxRate The maximum packet rate.
     */
    public void setPacketMaxRate(Long PacketMaxRate) {
        this.PacketMaxRate = PacketMaxRate;
    }

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
     * Get The DDoS policy ID. 
     * @return PolicyId The DDoS policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The DDoS policy ID.
     * @param PolicyId The DDoS policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DDoSAttackEventDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackEventDetailData(DDoSAttackEventDetailData source) {
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

