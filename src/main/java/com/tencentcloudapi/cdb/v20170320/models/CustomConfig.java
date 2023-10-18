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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomConfig extends AbstractModel {

    /**
    * Device
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * Type
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Device type
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Memory
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of CPU cores
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Device
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Device Device
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set Device
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Device Device
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get Type
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Type Type
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Type Type
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Device type
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return DeviceType Device type
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type
Note: this field may return `null`, indicating that no valid value can be found.
     * @param DeviceType Device type
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Memory
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Memory Memory
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Memory Memory
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of CPU cores
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Cpu Number of CPU cores
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Cpu Number of CPU cores
Note: this field may return `null`, indicating that no valid value can be found.
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

