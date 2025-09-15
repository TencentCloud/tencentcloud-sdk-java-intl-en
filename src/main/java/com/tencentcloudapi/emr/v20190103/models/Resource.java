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

public class Resource extends AbstractModel {

    /**
    * Node specifications description, such as CVM.SA2.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Storage type.
Valid values:
<li>4: Cloud SSD.</li>
<li>5: Premium Cloud Disk.</li>
<li>6: Enhanced SSD.</li>
<li>11: Throughput HDD.</li>
<li>12: Tremendous SSD.</li>: this type is invalid upon creation, and automatic judgment will be conducted based on data disk type and node type.
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * Disk type.
Valid values.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Memory capacity, in MB.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Data disk capacity.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * System disk capacity.
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * List of cloud disks. When the data disk is a cloud disk, `DiskType` and `DiskSize` are used directly; `MultiDisks` will be used for the excessive part
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * List of tags to be bound
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Specifications type, such as S2.MEDIUM8.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of local disks. This field is deprecated.
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * Number of local disks, such as 2.
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * GPU information.
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get Node specifications description, such as CVM.SA2. 
     * @return Spec Node specifications description, such as CVM.SA2.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Node specifications description, such as CVM.SA2.
     * @param Spec Node specifications description, such as CVM.SA2.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Storage type.
Valid values:
<li>4: Cloud SSD.</li>
<li>5: Premium Cloud Disk.</li>
<li>6: Enhanced SSD.</li>
<li>11: Throughput HDD.</li>
<li>12: Tremendous SSD.</li>: this type is invalid upon creation, and automatic judgment will be conducted based on data disk type and node type. 
     * @return StorageType Storage type.
Valid values:
<li>4: Cloud SSD.</li>
<li>5: Premium Cloud Disk.</li>
<li>6: Enhanced SSD.</li>
<li>11: Throughput HDD.</li>
<li>12: Tremendous SSD.</li>: this type is invalid upon creation, and automatic judgment will be conducted based on data disk type and node type.
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type.
Valid values:
<li>4: Cloud SSD.</li>
<li>5: Premium Cloud Disk.</li>
<li>6: Enhanced SSD.</li>
<li>11: Throughput HDD.</li>
<li>12: Tremendous SSD.</li>: this type is invalid upon creation, and automatic judgment will be conducted based on data disk type and node type.
     * @param StorageType Storage type.
Valid values:
<li>4: Cloud SSD.</li>
<li>5: Premium Cloud Disk.</li>
<li>6: Enhanced SSD.</li>
<li>11: Throughput HDD.</li>
<li>12: Tremendous SSD.</li>: this type is invalid upon creation, and automatic judgment will be conducted based on data disk type and node type.
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Disk type.
Valid values.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li> 
     * @return DiskType Disk type.
Valid values.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type.
Valid values.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
     * @param DiskType Disk type.
Valid values.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Memory capacity, in MB. 
     * @return MemSize Memory capacity, in MB.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory capacity, in MB.
     * @param MemSize Memory capacity, in MB.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Data disk capacity. 
     * @return DiskSize Data disk capacity.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data disk capacity.
     * @param DiskSize Data disk capacity.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get System disk capacity. 
     * @return RootSize System disk capacity.
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk capacity.
     * @param RootSize System disk capacity.
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get List of cloud disks. When the data disk is a cloud disk, `DiskType` and `DiskSize` are used directly; `MultiDisks` will be used for the excessive part
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MultiDisks List of cloud disks. When the data disk is a cloud disk, `DiskType` and `DiskSize` are used directly; `MultiDisks` will be used for the excessive part
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set List of cloud disks. When the data disk is a cloud disk, `DiskType` and `DiskSize` are used directly; `MultiDisks` will be used for the excessive part
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MultiDisks List of cloud disks. When the data disk is a cloud disk, `DiskType` and `DiskSize` are used directly; `MultiDisks` will be used for the excessive part
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get List of tags to be bound
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags List of tags to be bound
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags List of tags to be bound
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Specifications type, such as S2.MEDIUM8. 
     * @return InstanceType Specifications type, such as S2.MEDIUM8.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifications type, such as S2.MEDIUM8.
     * @param InstanceType Specifications type, such as S2.MEDIUM8.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of local disks. This field is deprecated. 
     * @return LocalDiskNum Number of local disks. This field is deprecated.
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set Number of local disks. This field is deprecated.
     * @param LocalDiskNum Number of local disks. This field is deprecated.
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
    }

    /**
     * Get Number of local disks, such as 2. 
     * @return DiskNum Number of local disks, such as 2.
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set Number of local disks, such as 2.
     * @param DiskNum Number of local disks, such as 2.
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
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

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
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
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
        }
        if (source.MultiDisks != null) {
            this.MultiDisks = new MultiDisk[source.MultiDisks.length];
            for (int i = 0; i < source.MultiDisks.length; i++) {
                this.MultiDisks[i] = new MultiDisk(source.MultiDisks[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.LocalDiskNum != null) {
            this.LocalDiskNum = new Long(source.LocalDiskNum);
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
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
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamArrayObj(map, prefix + "MultiDisks.", this.MultiDisks);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "LocalDiskNum", this.LocalDiskNum);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

