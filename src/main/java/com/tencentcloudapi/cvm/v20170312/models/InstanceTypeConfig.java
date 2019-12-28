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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel{

    /**
    * Availability zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance model family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Number of GPU cores.
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * Number of CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Memory capacity; unit: `GB`.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get Availability zone. 
     * @return Zone Availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
     * @param Zone Availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance model. 
     * @return InstanceType Instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model.
     * @param InstanceType Instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance model family. 
     * @return InstanceFamily Instance model family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance model family.
     * @param InstanceFamily Instance model family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Number of GPU cores. 
     * @return GPU Number of GPU cores.
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set Number of GPU cores.
     * @param GPU Number of GPU cores.
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get Number of CPU cores. 
     * @return CPU Number of CPU cores.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores.
     * @param CPU Number of CPU cores.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Memory capacity; unit: `GB`. 
     * @return Memory Memory capacity; unit: `GB`.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity; unit: `GB`.
     * @param Memory Memory capacity; unit: `GB`.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

