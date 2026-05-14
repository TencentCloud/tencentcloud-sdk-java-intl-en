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

public class UpdateDeviceRequest extends AbstractModel {

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * device Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Update device network info
    */
    @SerializedName("UpdateNetInfo")
    @Expose
    private UpdateNetInfo [] UpdateNetInfo;

    /**
    * No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get device Remarks 
     * @return Remark device Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set device Remarks
     * @param Remark device Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Update device network info 
     * @return UpdateNetInfo Update device network info
     */
    public UpdateNetInfo [] getUpdateNetInfo() {
        return this.UpdateNetInfo;
    }

    /**
     * Set Update device network info
     * @param UpdateNetInfo Update device network info
     */
    public void setUpdateNetInfo(UpdateNetInfo [] UpdateNetInfo) {
        this.UpdateNetInfo = UpdateNetInfo;
    }

    /**
     * Get No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate 
     * @return FlowTrunc No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate
     */
    public Long getFlowTrunc() {
        return this.FlowTrunc;
    }

    /**
     * Set No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate
     * @param FlowTrunc No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate
     */
    public void setFlowTrunc(Long FlowTrunc) {
        this.FlowTrunc = FlowTrunc;
    }

    public UpdateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceRequest(UpdateDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateNetInfo != null) {
            this.UpdateNetInfo = new UpdateNetInfo[source.UpdateNetInfo.length];
            for (int i = 0; i < source.UpdateNetInfo.length; i++) {
                this.UpdateNetInfo[i] = new UpdateNetInfo(source.UpdateNetInfo[i]);
            }
        }
        if (source.FlowTrunc != null) {
            this.FlowTrunc = new Long(source.FlowTrunc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "UpdateNetInfo.", this.UpdateNetInfo);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);

    }
}

