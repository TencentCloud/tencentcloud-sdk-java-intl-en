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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrateInstanceInfo extends AbstractModel {

    /**
    * Specifies the cpu of the instance.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Specifies the instance memory.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance type (rw/ro).
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of instances. value range: [1,15].
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Instance machine type. valid values: universal type (common), exclusive type.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get Specifies the cpu of the instance. 
     * @return Cpu Specifies the cpu of the instance.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Specifies the cpu of the instance.
     * @param Cpu Specifies the cpu of the instance.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Specifies the instance memory. 
     * @return Memory Specifies the instance memory.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Specifies the instance memory.
     * @param Memory Specifies the instance memory.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance type (rw/ro). 
     * @return InstanceType Instance type (rw/ro).
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type (rw/ro).
     * @param InstanceType Instance type (rw/ro).
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of instances. value range: [1,15]. 
     * @return InstanceCount Number of instances. value range: [1,15].
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances. value range: [1,15].
     * @param InstanceCount Number of instances. value range: [1,15].
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Instance machine type. valid values: universal type (common), exclusive type. 
     * @return DeviceType Instance machine type. valid values: universal type (common), exclusive type.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance machine type. valid values: universal type (common), exclusive type.
     * @param DeviceType Instance machine type. valid values: universal type (common), exclusive type.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public IntegrateInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrateInstanceInfo(IntegrateInstanceInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

