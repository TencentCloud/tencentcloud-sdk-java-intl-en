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

public class DeviceDetails extends AbstractModel {

    /**
    * Device basic info
    */
    @SerializedName("DeviceBaseInfo")
    @Expose
    private DeviceBaseInfo DeviceBaseInfo;

    /**
    * Device network info
    */
    @SerializedName("DeviceNetInfo")
    @Expose
    private DeviceNetInfo [] DeviceNetInfo;

    /**
    * Aggregate server address
    */
    @SerializedName("GatewaySite")
    @Expose
    private String GatewaySite;

    /**
    * Downlink Rate
    */
    @SerializedName("BusinessDownRate")
    @Expose
    private Float BusinessDownRate;

    /**
    * Business-wise uplink rate
    */
    @SerializedName("BusinessUpRate")
    @Expose
    private Float BusinessUpRate;

    /**
     * Get Device basic info 
     * @return DeviceBaseInfo Device basic info
     */
    public DeviceBaseInfo getDeviceBaseInfo() {
        return this.DeviceBaseInfo;
    }

    /**
     * Set Device basic info
     * @param DeviceBaseInfo Device basic info
     */
    public void setDeviceBaseInfo(DeviceBaseInfo DeviceBaseInfo) {
        this.DeviceBaseInfo = DeviceBaseInfo;
    }

    /**
     * Get Device network info 
     * @return DeviceNetInfo Device network info
     */
    public DeviceNetInfo [] getDeviceNetInfo() {
        return this.DeviceNetInfo;
    }

    /**
     * Set Device network info
     * @param DeviceNetInfo Device network info
     */
    public void setDeviceNetInfo(DeviceNetInfo [] DeviceNetInfo) {
        this.DeviceNetInfo = DeviceNetInfo;
    }

    /**
     * Get Aggregate server address 
     * @return GatewaySite Aggregate server address
     */
    public String getGatewaySite() {
        return this.GatewaySite;
    }

    /**
     * Set Aggregate server address
     * @param GatewaySite Aggregate server address
     */
    public void setGatewaySite(String GatewaySite) {
        this.GatewaySite = GatewaySite;
    }

    /**
     * Get Downlink Rate 
     * @return BusinessDownRate Downlink Rate
     */
    public Float getBusinessDownRate() {
        return this.BusinessDownRate;
    }

    /**
     * Set Downlink Rate
     * @param BusinessDownRate Downlink Rate
     */
    public void setBusinessDownRate(Float BusinessDownRate) {
        this.BusinessDownRate = BusinessDownRate;
    }

    /**
     * Get Business-wise uplink rate 
     * @return BusinessUpRate Business-wise uplink rate
     */
    public Float getBusinessUpRate() {
        return this.BusinessUpRate;
    }

    /**
     * Set Business-wise uplink rate
     * @param BusinessUpRate Business-wise uplink rate
     */
    public void setBusinessUpRate(Float BusinessUpRate) {
        this.BusinessUpRate = BusinessUpRate;
    }

    public DeviceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDetails(DeviceDetails source) {
        if (source.DeviceBaseInfo != null) {
            this.DeviceBaseInfo = new DeviceBaseInfo(source.DeviceBaseInfo);
        }
        if (source.DeviceNetInfo != null) {
            this.DeviceNetInfo = new DeviceNetInfo[source.DeviceNetInfo.length];
            for (int i = 0; i < source.DeviceNetInfo.length; i++) {
                this.DeviceNetInfo[i] = new DeviceNetInfo(source.DeviceNetInfo[i]);
            }
        }
        if (source.GatewaySite != null) {
            this.GatewaySite = new String(source.GatewaySite);
        }
        if (source.BusinessDownRate != null) {
            this.BusinessDownRate = new Float(source.BusinessDownRate);
        }
        if (source.BusinessUpRate != null) {
            this.BusinessUpRate = new Float(source.BusinessUpRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DeviceBaseInfo.", this.DeviceBaseInfo);
        this.setParamArrayObj(map, prefix + "DeviceNetInfo.", this.DeviceNetInfo);
        this.setParamSimple(map, prefix + "GatewaySite", this.GatewaySite);
        this.setParamSimple(map, prefix + "BusinessDownRate", this.BusinessDownRate);
        this.setParamSimple(map, prefix + "BusinessUpRate", this.BusinessUpRate);

    }
}

