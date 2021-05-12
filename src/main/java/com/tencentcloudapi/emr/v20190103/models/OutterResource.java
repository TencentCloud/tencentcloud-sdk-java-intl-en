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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutterResource extends AbstractModel{

    /**
    * Specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Specification name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Disk type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * Disk type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * Memory size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of CPUs
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Disk size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get Specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Spec Specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Spec Specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Specification name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Specification name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specification name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SpecName Specification name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Disk type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StorageType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Disk type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RootSize System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RootSize System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get Memory size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MemSize Memory size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MemSize Memory size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of CPUs
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPUs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPUs
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPUs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Disk size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public OutterResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutterResource(OutterResource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

