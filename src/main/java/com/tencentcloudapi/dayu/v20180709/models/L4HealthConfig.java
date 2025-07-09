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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4HealthConfig extends AbstractModel {

    /**
    * Forwarding protocol. Valid values: [TCP, UDP]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding port
    */
    @SerializedName("VirtualPort")
    @Expose
    private Long VirtualPort;

    /**
    * 1: enabled, 0: disabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Response timeout period in seconds
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Detection interval in seconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Unhealthy threshold in times.
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * Healthy threshold in times.
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * Session persistence duration in seconds
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
     * Get Forwarding protocol. Valid values: [TCP, UDP] 
     * @return Protocol Forwarding protocol. Valid values: [TCP, UDP]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values: [TCP, UDP]
     * @param Protocol Forwarding protocol. Valid values: [TCP, UDP]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding port 
     * @return VirtualPort Forwarding port
     */
    public Long getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set Forwarding port
     * @param VirtualPort Forwarding port
     */
    public void setVirtualPort(Long VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get 1: enabled, 0: disabled 
     * @return Enable 1: enabled, 0: disabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1: enabled, 0: disabled
     * @param Enable 1: enabled, 0: disabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Response timeout period in seconds 
     * @return TimeOut Response timeout period in seconds
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Response timeout period in seconds
     * @param TimeOut Response timeout period in seconds
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Detection interval in seconds 
     * @return Interval Detection interval in seconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Detection interval in seconds
     * @param Interval Detection interval in seconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Unhealthy threshold in times. 
     * @return KickNum Unhealthy threshold in times.
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set Unhealthy threshold in times.
     * @param KickNum Unhealthy threshold in times.
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get Healthy threshold in times. 
     * @return AliveNum Healthy threshold in times.
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set Healthy threshold in times.
     * @param AliveNum Healthy threshold in times.
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get Session persistence duration in seconds 
     * @return KeepTime Session persistence duration in seconds
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set Session persistence duration in seconds
     * @param KeepTime Session persistence duration in seconds
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    public L4HealthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4HealthConfig(L4HealthConfig source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new Long(source.VirtualPort);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.KickNum != null) {
            this.KickNum = new Long(source.KickNum);
        }
        if (source.AliveNum != null) {
            this.AliveNum = new Long(source.AliveNum);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);

    }
}

