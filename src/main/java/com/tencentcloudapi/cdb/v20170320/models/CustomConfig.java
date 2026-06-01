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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomConfig extends AbstractModel {

    /**
    * device
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Device type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Memory, measured in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get device 
     * @return Device device
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set device
     * @param Device device
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get Type. 
     * @return Type Type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Device type 
     * @return DeviceType Device type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type
     * @param DeviceType Device type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Memory, measured in MB 
     * @return Memory Memory, measured in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory, measured in MB
     * @param Memory Memory, measured in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of cores 
     * @return Cpu Number of cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of cores
     * @param Cpu Number of cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public CustomConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomConfig(CustomConfig source) {
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

