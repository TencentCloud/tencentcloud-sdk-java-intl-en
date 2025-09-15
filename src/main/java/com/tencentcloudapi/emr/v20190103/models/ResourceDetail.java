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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDetail extends AbstractModel {

    /**
    * Specifications.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Specifications name.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Hard disk type.
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * Hard disk type.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk size.
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * Memory size.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of CPUs.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Hard disk size.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get Specifications. 
     * @return Spec Specifications.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Specifications.
     * @param Spec Specifications.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Specifications name. 
     * @return SpecName Specifications name.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specifications name.
     * @param SpecName Specifications name.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Hard disk type. 
     * @return StorageType Hard disk type.
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Hard disk type.
     * @param StorageType Hard disk type.
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Hard disk type. 
     * @return DiskType Hard disk type.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Hard disk type.
     * @param DiskType Hard disk type.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk size. 
     * @return RootSize System disk size.
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk size.
     * @param RootSize System disk size.
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get Memory size. 
     * @return MemSize Memory size.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory size.
     * @param MemSize Memory size.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of CPUs. 
     * @return Cpu Number of CPUs.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPUs.
     * @param Cpu Number of CPUs.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Hard disk size. 
     * @return DiskSize Hard disk size.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk size.
     * @param DiskSize Hard disk size.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Specifications. 
     * @return InstanceType Specifications.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifications.
     * @param InstanceType Specifications.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public ResourceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDetail(ResourceDetail source) {
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

