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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetNetMonitorByNameRequest extends AbstractModel {

    /**
    * Device name
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet loss: "Loss": %, Latency: "RTT": ms)
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
     * Get Device name 
     * @return DeviceName Device name
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name
     * @param DeviceName Device name
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Start time. 
     * @return BeginTime Start time.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time.
     * @param BeginTime Start time.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet loss: "Loss": %, Latency: "RTT": ms) 
     * @return Metrics Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet loss: "Loss": %, Latency: "RTT": ms)
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet loss: "Loss": %, Latency: "RTT": ms)
     * @param Metrics Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet loss: "Loss": %, Latency: "RTT": ms)
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified. 
     * @return GatewayType Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     * @param GatewayType Gateway type. 0: public cloud gateway; 1: private gateway. Default is 0 if not specified.
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    public GetNetMonitorByNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNetMonitorByNameRequest(GetNetMonitorByNameRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Metrics != null) {
            this.Metrics = new String(source.Metrics);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);

    }
}

