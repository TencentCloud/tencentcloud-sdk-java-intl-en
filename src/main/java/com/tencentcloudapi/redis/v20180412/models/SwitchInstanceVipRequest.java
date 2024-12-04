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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInstanceVipRequest extends AbstractModel {

    /**
    * Source instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Target instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * DTS disconnection time between the source instance and target instance. Unit: second. If the DTS disconnection time exceeds TimeDelay, the VIP will not be switched. It is recommended to set an acceptable value based on business needs.
    */
    @SerializedName("TimeDelay")
    @Expose
    private Long TimeDelay;

    /**
    * Whether to force a switch in the case of a DTS disconnection.
- 1: Force the switch.
- 0: Do not force the switch.
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Long ForceSwitch;

    /**
    * now: switch now; syncComplete: switch after sync is completed
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
     * Get Source instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return SrcInstanceId Source instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param SrcInstanceId Source instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Target instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return DstInstanceId Target instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set Target instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param DstInstanceId Target instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get DTS disconnection time between the source instance and target instance. Unit: second. If the DTS disconnection time exceeds TimeDelay, the VIP will not be switched. It is recommended to set an acceptable value based on business needs. 
     * @return TimeDelay DTS disconnection time between the source instance and target instance. Unit: second. If the DTS disconnection time exceeds TimeDelay, the VIP will not be switched. It is recommended to set an acceptable value based on business needs.
     */
    public Long getTimeDelay() {
        return this.TimeDelay;
    }

    /**
     * Set DTS disconnection time between the source instance and target instance. Unit: second. If the DTS disconnection time exceeds TimeDelay, the VIP will not be switched. It is recommended to set an acceptable value based on business needs.
     * @param TimeDelay DTS disconnection time between the source instance and target instance. Unit: second. If the DTS disconnection time exceeds TimeDelay, the VIP will not be switched. It is recommended to set an acceptable value based on business needs.
     */
    public void setTimeDelay(Long TimeDelay) {
        this.TimeDelay = TimeDelay;
    }

    /**
     * Get Whether to force a switch in the case of a DTS disconnection.
- 1: Force the switch.
- 0: Do not force the switch. 
     * @return ForceSwitch Whether to force a switch in the case of a DTS disconnection.
- 1: Force the switch.
- 0: Do not force the switch.
     */
    public Long getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set Whether to force a switch in the case of a DTS disconnection.
- 1: Force the switch.
- 0: Do not force the switch.
     * @param ForceSwitch Whether to force a switch in the case of a DTS disconnection.
- 1: Force the switch.
- 0: Do not force the switch.
     */
    public void setForceSwitch(Long ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    /**
     * Get now: switch now; syncComplete: switch after sync is completed 
     * @return SwitchTime now: switch now; syncComplete: switch after sync is completed
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set now: switch now; syncComplete: switch after sync is completed
     * @param SwitchTime now: switch now; syncComplete: switch after sync is completed
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

