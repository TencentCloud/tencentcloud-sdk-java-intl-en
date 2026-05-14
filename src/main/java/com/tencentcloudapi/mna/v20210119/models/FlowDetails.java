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

public class FlowDetails extends AbstractModel {

    /**
    * Traffic data point
    */
    @SerializedName("NetDetails")
    @Expose
    private NetDetails [] NetDetails;

    /**
    * device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Maximum value of traffic (measurement unit: bytes)
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * Average traffic (unit: bytes)
    */
    @SerializedName("AvgValue")
    @Expose
    private Float AvgValue;

    /**
    * Total traffic (unit: bytes)
    */
    @SerializedName("TotalValue")
    @Expose
    private Float TotalValue;

    /**
     * Get Traffic data point 
     * @return NetDetails Traffic data point
     */
    public NetDetails [] getNetDetails() {
        return this.NetDetails;
    }

    /**
     * Set Traffic data point
     * @param NetDetails Traffic data point
     */
    public void setNetDetails(NetDetails [] NetDetails) {
        this.NetDetails = NetDetails;
    }

    /**
     * Get device ID 
     * @return DeviceId device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set device ID
     * @param DeviceId device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Maximum value of traffic (measurement unit: bytes) 
     * @return MaxValue Maximum value of traffic (measurement unit: bytes)
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set Maximum value of traffic (measurement unit: bytes)
     * @param MaxValue Maximum value of traffic (measurement unit: bytes)
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get Average traffic (unit: bytes) 
     * @return AvgValue Average traffic (unit: bytes)
     */
    public Float getAvgValue() {
        return this.AvgValue;
    }

    /**
     * Set Average traffic (unit: bytes)
     * @param AvgValue Average traffic (unit: bytes)
     */
    public void setAvgValue(Float AvgValue) {
        this.AvgValue = AvgValue;
    }

    /**
     * Get Total traffic (unit: bytes) 
     * @return TotalValue Total traffic (unit: bytes)
     */
    public Float getTotalValue() {
        return this.TotalValue;
    }

    /**
     * Set Total traffic (unit: bytes)
     * @param TotalValue Total traffic (unit: bytes)
     */
    public void setTotalValue(Float TotalValue) {
        this.TotalValue = TotalValue;
    }

    public FlowDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetails(FlowDetails source) {
        if (source.NetDetails != null) {
            this.NetDetails = new NetDetails[source.NetDetails.length];
            for (int i = 0; i < source.NetDetails.length; i++) {
                this.NetDetails[i] = new NetDetails(source.NetDetails[i]);
            }
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.AvgValue != null) {
            this.AvgValue = new Float(source.AvgValue);
        }
        if (source.TotalValue != null) {
            this.TotalValue = new Float(source.TotalValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NetDetails.", this.NetDetails);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "AvgValue", this.AvgValue);
        this.setParamSimple(map, prefix + "TotalValue", this.TotalValue);

    }
}

