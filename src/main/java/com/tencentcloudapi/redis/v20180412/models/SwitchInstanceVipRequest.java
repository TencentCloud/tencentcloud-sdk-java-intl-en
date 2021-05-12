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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInstanceVipRequest extends AbstractModel{

    /**
    * Source instance ID.
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Target instance ID.
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * The time that lapses in seconds since DTS is disconnected between the source instance and the target instance. If the DTS disconnection time period is greater than `TimeDelay`, the VIP will not be switched. We recommend setting an acceptable value based on the actual business conditions.
    */
    @SerializedName("TimeDelay")
    @Expose
    private Long TimeDelay;

    /**
    * Whether to force the switch when DTS is disconnected. Valid values: 1 (yes), 0 (no).
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Long ForceSwitch;

    /**
    * Valid values: now (switch now), syncComplete (switch after sync is completed).
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
     * Get Source instance ID. 
     * @return SrcInstanceId Source instance ID.
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID.
     * @param SrcInstanceId Source instance ID.
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Target instance ID. 
     * @return DstInstanceId Target instance ID.
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set Target instance ID.
     * @param DstInstanceId Target instance ID.
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get The time that lapses in seconds since DTS is disconnected between the source instance and the target instance. If the DTS disconnection time period is greater than `TimeDelay`, the VIP will not be switched. We recommend setting an acceptable value based on the actual business conditions. 
     * @return TimeDelay The time that lapses in seconds since DTS is disconnected between the source instance and the target instance. If the DTS disconnection time period is greater than `TimeDelay`, the VIP will not be switched. We recommend setting an acceptable value based on the actual business conditions.
     */
    public Long getTimeDelay() {
        return this.TimeDelay;
    }

    /**
     * Set The time that lapses in seconds since DTS is disconnected between the source instance and the target instance. If the DTS disconnection time period is greater than `TimeDelay`, the VIP will not be switched. We recommend setting an acceptable value based on the actual business conditions.
     * @param TimeDelay The time that lapses in seconds since DTS is disconnected between the source instance and the target instance. If the DTS disconnection time period is greater than `TimeDelay`, the VIP will not be switched. We recommend setting an acceptable value based on the actual business conditions.
     */
    public void setTimeDelay(Long TimeDelay) {
        this.TimeDelay = TimeDelay;
    }

    /**
     * Get Whether to force the switch when DTS is disconnected. Valid values: 1 (yes), 0 (no). 
     * @return ForceSwitch Whether to force the switch when DTS is disconnected. Valid values: 1 (yes), 0 (no).
     */
    public Long getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set Whether to force the switch when DTS is disconnected. Valid values: 1 (yes), 0 (no).
     * @param ForceSwitch Whether to force the switch when DTS is disconnected. Valid values: 1 (yes), 0 (no).
     */
    public void setForceSwitch(Long ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    /**
     * Get Valid values: now (switch now), syncComplete (switch after sync is completed). 
     * @return SwitchTime Valid values: now (switch now), syncComplete (switch after sync is completed).
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set Valid values: now (switch now), syncComplete (switch after sync is completed).
     * @param SwitchTime Valid values: now (switch now), syncComplete (switch after sync is completed).
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    public SwitchInstanceVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchInstanceVipRequest(SwitchInstanceVipRequest source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.DstInstanceId != null) {
            this.DstInstanceId = new String(source.DstInstanceId);
        }
        if (source.TimeDelay != null) {
            this.TimeDelay = new Long(source.TimeDelay);
        }
        if (source.ForceSwitch != null) {
            this.ForceSwitch = new Long(source.ForceSwitch);
        }
        if (source.SwitchTime != null) {
            this.SwitchTime = new String(source.SwitchTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "TimeDelay", this.TimeDelay);
        this.setParamSimple(map, prefix + "ForceSwitch", this.ForceSwitch);
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);

    }
}

