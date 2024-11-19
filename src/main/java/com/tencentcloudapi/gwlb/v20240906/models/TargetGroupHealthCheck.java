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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupHealthCheck extends AbstractModel {

    /**
    * Whether to enable the health check.
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * Protocol used for health checks. ICMP and TCP are supported, and the default is ICMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Health check port, which is required when the probe protocol is TCP.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Health detection threshold. The default is 3 times. Value range: 2-10 times.
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
     * Get Whether to enable the health check. 
     * @return HealthSwitch Whether to enable the health check.
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether to enable the health check.
     * @param HealthSwitch Whether to enable the health check.
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Protocol used for health checks. ICMP and TCP are supported, and the default is ICMP. 
     * @return Protocol Protocol used for health checks. ICMP and TCP are supported, and the default is ICMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol used for health checks. ICMP and TCP are supported, and the default is ICMP.
     * @param Protocol Protocol used for health checks. ICMP and TCP are supported, and the default is ICMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Health check port, which is required when the probe protocol is TCP. 
     * @return Port Health check port, which is required when the probe protocol is TCP.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Health check port, which is required when the probe protocol is TCP.
     * @param Port Health check port, which is required when the probe protocol is TCP.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Health check timeout. The default is 2 seconds. Value range: 2-30 seconds. 
     * @return Timeout Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     * @param Timeout Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Detection interval time. The default is 5 seconds. Value range: 2-300 seconds. 
     * @return IntervalTime Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     * @param IntervalTime Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Health detection threshold. The default is 3 times. Value range: 2-10 times. 
     * @return HealthNum Health detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set Health detection threshold. The default is 3 times. Value range: 2-10 times.
     * @param HealthNum Health detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get Unhealth detection threshold. The default is 3 times. Value range: 2-10 times. 
     * @return UnHealthNum Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     * @param UnHealthNum Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    public TargetGroupHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthCheck(TargetGroupHealthCheck source) {
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Boolean(source.HealthSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.HealthNum != null) {
            this.HealthNum = new Long(source.HealthNum);
        }
        if (source.UnHealthNum != null) {
            this.UnHealthNum = new Long(source.UnHealthNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthNum", this.UnHealthNum);

    }
}

