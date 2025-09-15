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

public class PriceResource extends AbstractModel {

    /**
    * Required specifications.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

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
    * Number of cores.
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
    * List of cloud disks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * Number of disks.
    */
    @SerializedName("DiskCnt")
    @Expose
    private Long DiskCnt;

    /**
    * Specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Number of disks.
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * Number of local disks.
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * GPU information.
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get Required specifications. 
     * @return Spec Required specifications.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Required specifications.
     * @param Spec Required specifications.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
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
     * Get Number of cores. 
     * @return Cpu Number of cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of cores.
     * @param Cpu Number of cores.
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
     * Get List of cloud disks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MultiDisks List of cloud disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set List of cloud disks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MultiDisks List of cloud disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get Number of disks. 
     * @return DiskCnt Number of disks.
     */
    public Long getDiskCnt() {
        return this.DiskCnt;
    }

    /**
     * Set Number of disks.
     * @param DiskCnt Number of disks.
     */
    public void setDiskCnt(Long DiskCnt) {
        this.DiskCnt = DiskCnt;
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

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Number of disks. 
     * @return DiskNum Number of disks.
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set Number of disks.
     * @param DiskNum Number of disks.
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get Number of local disks. 
     * @return LocalDiskNum Number of local disks.
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set Number of local disks.
     * @param LocalDiskNum Number of local disks.
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
    }

    /**
     * Get GPU information. 
     * @return GpuDesc GPU information.
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set GPU information.
     * @param GpuDesc GPU information.
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    public PriceResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceResource(PriceResource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
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
        if (source.MultiDisks != null) {
            this.MultiDisks = new MultiDisk[source.MultiDisks.length];
            for (int i = 0; i < source.MultiDisks.length; i++) {
                this.MultiDisks[i] = new MultiDisk(source.MultiDisks[i]);
            }
        }
        if (source.DiskCnt != null) {
            this.DiskCnt = new Long(source.DiskCnt);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
        }
        if (source.LocalDiskNum != null) {
            this.LocalDiskNum = new Long(source.LocalDiskNum);
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArrayObj(map, prefix + "MultiDisks.", this.MultiDisks);
        this.setParamSimple(map, prefix + "DiskCnt", this.DiskCnt);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "LocalDiskNum", this.LocalDiskNum);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

