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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeConfig extends AbstractModel{

    /**
    * Model family configuration information
    */
    @SerializedName("InstanceFamilyConfig")
    @Expose
    private InstanceFamilyConfig InstanceFamilyConfig;

    /**
    * Model
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of CPU cores
    */
    @SerializedName("Vcpu")
    @Expose
    private Long Vcpu;

    /**
    * Memory size
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Clock rate
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * CPU model
    */
    @SerializedName("CpuModelName")
    @Expose
    private String CpuModelName;

    /**
    * Instance family type configuration information
    */
    @SerializedName("InstanceFamilyTypeConfig")
    @Expose
    private InstanceFamilyTypeConfig InstanceFamilyTypeConfig;

    /**
    * Extra model information, which is a JSON string in the format of `{"dataDiskSize":3200,"systemDiskSize":60, "systemDiskSizeShow":"default system disk size:60 GB","dataDiskSizeShow":"local NVMe SSD: 3200 GB"}`. It indicates a special model if it exists
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * Number of GPU cards
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vgpu")
    @Expose
    private Float Vgpu;

    /**
    * GPU model
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GpuModelName")
    @Expose
    private String GpuModelName;

    /**
     * Get Model family configuration information 
     * @return InstanceFamilyConfig Model family configuration information
     */
    public InstanceFamilyConfig getInstanceFamilyConfig() {
        return this.InstanceFamilyConfig;
    }

    /**
     * Set Model family configuration information
     * @param InstanceFamilyConfig Model family configuration information
     */
    public void setInstanceFamilyConfig(InstanceFamilyConfig InstanceFamilyConfig) {
        this.InstanceFamilyConfig = InstanceFamilyConfig;
    }

    /**
     * Get Model 
     * @return InstanceType Model
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model
     * @param InstanceType Model
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of CPU cores 
     * @return Vcpu Number of CPU cores
     */
    public Long getVcpu() {
        return this.Vcpu;
    }

    /**
     * Set Number of CPU cores
     * @param Vcpu Number of CPU cores
     */
    public void setVcpu(Long Vcpu) {
        this.Vcpu = Vcpu;
    }

    /**
     * Get Memory size 
     * @return Memory Memory size
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size
     * @param Memory Memory size
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Clock rate 
     * @return Frequency Clock rate
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Clock rate
     * @param Frequency Clock rate
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get CPU model 
     * @return CpuModelName CPU model
     */
    public String getCpuModelName() {
        return this.CpuModelName;
    }

    /**
     * Set CPU model
     * @param CpuModelName CPU model
     */
    public void setCpuModelName(String CpuModelName) {
        this.CpuModelName = CpuModelName;
    }

    /**
     * Get Instance family type configuration information 
     * @return InstanceFamilyTypeConfig Instance family type configuration information
     */
    public InstanceFamilyTypeConfig getInstanceFamilyTypeConfig() {
        return this.InstanceFamilyTypeConfig;
    }

    /**
     * Set Instance family type configuration information
     * @param InstanceFamilyTypeConfig Instance family type configuration information
     */
    public void setInstanceFamilyTypeConfig(InstanceFamilyTypeConfig InstanceFamilyTypeConfig) {
        this.InstanceFamilyTypeConfig = InstanceFamilyTypeConfig;
    }

    /**
     * Get Extra model information, which is a JSON string in the format of `{"dataDiskSize":3200,"systemDiskSize":60, "systemDiskSizeShow":"default system disk size:60 GB","dataDiskSizeShow":"local NVMe SSD: 3200 GB"}`. It indicates a special model if it exists
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExtInfo Extra model information, which is a JSON string in the format of `{"dataDiskSize":3200,"systemDiskSize":60, "systemDiskSizeShow":"default system disk size:60 GB","dataDiskSizeShow":"local NVMe SSD: 3200 GB"}`. It indicates a special model if it exists
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Extra model information, which is a JSON string in the format of `{"dataDiskSize":3200,"systemDiskSize":60, "systemDiskSizeShow":"default system disk size:60 GB","dataDiskSizeShow":"local NVMe SSD: 3200 GB"}`. It indicates a special model if it exists
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExtInfo Extra model information, which is a JSON string in the format of `{"dataDiskSize":3200,"systemDiskSize":60, "systemDiskSizeShow":"default system disk size:60 GB","dataDiskSizeShow":"local NVMe SSD: 3200 GB"}`. It indicates a special model if it exists
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get Number of GPU cards
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Vgpu Number of GPU cards
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getVgpu() {
        return this.Vgpu;
    }

    /**
     * Set Number of GPU cards
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Vgpu Number of GPU cards
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVgpu(Float Vgpu) {
        this.Vgpu = Vgpu;
    }

    /**
     * Get GPU model
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GpuModelName GPU model
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGpuModelName() {
        return this.GpuModelName;
    }

    /**
     * Set GPU model
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GpuModelName GPU model
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGpuModelName(String GpuModelName) {
        this.GpuModelName = GpuModelName;
    }

    public InstanceTypeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeConfig(InstanceTypeConfig source) {
        if (source.InstanceFamilyConfig != null) {
            this.InstanceFamilyConfig = new InstanceFamilyConfig(source.InstanceFamilyConfig);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Vcpu != null) {
            this.Vcpu = new Long(source.Vcpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.CpuModelName != null) {
            this.CpuModelName = new String(source.CpuModelName);
        }
        if (source.InstanceFamilyTypeConfig != null) {
            this.InstanceFamilyTypeConfig = new InstanceFamilyTypeConfig(source.InstanceFamilyTypeConfig);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.Vgpu != null) {
            this.Vgpu = new Float(source.Vgpu);
        }
        if (source.GpuModelName != null) {
            this.GpuModelName = new String(source.GpuModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceFamilyConfig.", this.InstanceFamilyConfig);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Vcpu", this.Vcpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CpuModelName", this.CpuModelName);
        this.setParamObj(map, prefix + "InstanceFamilyTypeConfig.", this.InstanceFamilyTypeConfig);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "Vgpu", this.Vgpu);
        this.setParamSimple(map, prefix + "GpuModelName", this.GpuModelName);

    }
}

