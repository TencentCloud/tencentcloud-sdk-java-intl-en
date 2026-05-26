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

public class GetNetMonitorRequest extends AbstractModel {

    /**
    * <p>device id</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet Loss: "Loss": %, Latency: "RTT": ms)</p>
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not specified.</p>
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
     * Get <p>device id</p> 
     * @return DeviceId <p>device id</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>device id</p>
     * @param DeviceId <p>device id</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>Start time.</p> 
     * @return BeginTime <p>Start time.</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param BeginTime <p>Start time.</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>End time.</p> 
     * @return EndTime <p>End time.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time.</p>
     * @param EndTime <p>End time.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet Loss: "Loss": %, Latency: "RTT": ms)</p> 
     * @return Metrics <p>Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet Loss: "Loss": %, Latency: "RTT": ms)</p>
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet Loss: "Loss": %, Latency: "RTT": ms)</p>
     * @param Metrics <p>Statistical metric (Uplink rate: "TxRate": bit/s, Downstream rate: "RxRate": bit/s, Packet Loss: "Loss": %, Latency: "RTT": ms)</p>
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not specified.</p> 
     * @return GatewayType <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not specified.</p>
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not specified.</p>
     * @param GatewayType <p>Gateway type. 0: public cloud gateway; 1: private gateway. Defaults to 0 if not specified.</p>
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    public GetNetMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNetMonitorRequest(GetNetMonitorRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
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
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);

    }
}

