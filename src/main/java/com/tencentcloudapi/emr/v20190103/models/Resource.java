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
    * <p>Node specification description, such as CVM.SA2.</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>Valid values:<br>&quot;LOCAL_SSD&quot;   3     // Local SSD<br>&quot;CLOUD_SSD&quot;   4     // Cloud SSD<br>&quot;CLOUD_PREMIUM&quot;  5  // Premium Disk<br>&quot;CLOUD_HSSD&quot;   6    // Enhanced SSD<br>&quot;CLOUD_THROUGHPUT&quot; 11// Throughput-Optimized Cloud Disk<br>&quot;CLOUD_TSSD&quot;  12     // Tremendous SSD<br>&quot;CLOUD_BSSD&quot;    13   // Balanced SSD<br>&quot;CLOUD_BIGDATA&quot; 14   // Big Data Cloud Disk<br>&quot;CLOUD_HIGHIO&quot;  15   // High-IO Cloud Disk </p><p>This field is invalid. The actual system disk type is determined based on the data disk type and node type. If the node supports the selected data disk type, the system disk type is consistent with the data disk. It is recommended to use the CreateCluster API.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>Data disk type. Valid values:</p><p>CLOUD_SSD: Cloud SSD</p><p>CLOUD_PREMIUM: Premium Disk</p><p>CLOUD_BASIC: Cloud Basic Disk</p><p>LOCAL_BASIC: Local Basic Disk</p><p>LOCAL_SSD: Local SSD</p><p>CLOUD_HSSD: Enhanced SSD</p><p>CLOUD_THROUGHPUT: Throughput-Optimized Cloud Disk</p><p>CLOUD_TSSD: Tremendous SSD</p><p>CLOUD_BIGDATA: Big Data Cloud Disk</p><p>CLOUD_HIGHIO: High-IO Cloud Disk</p><p>CLOUD_BSSD: Balanced SSD</p><p>REMOTE_SSD: Remote SSD Disk</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Memory capacity (MB).</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Number of CPU cores.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Data disk capacity.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>System disk capacity.</p>
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * <p>Cloud disk list. When the data disk is a single cloud disk, use the DiskType and DiskSize parameters directly. Use MultiDisks for extra disks.</p>
    */
    @SerializedName("MultiDisks")
    @Expose
    private MultiDisk [] MultiDisks;

    /**
    * <p>List of tags to be bound.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Specifications type, such as S2.MEDIUM8.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Number of local disks. This field has been deprecated.</p>
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
    * <p>Number of local disks, such as 2.</p>
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * <p>GPU information.</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>Number of partitions in a placement group.</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * <p>High-performance cluster ID.</p>
    */
    @SerializedName("HCCHpcClusterId")
    @Expose
    private String HCCHpcClusterId;

    /**
    * <p>Custom hostname.</p>
    */
    @SerializedName("CustomNodeName")
    @Expose
    private String CustomNodeName;

    /**
    * <p>GPU image driver configuration.</p>
    */
    @SerializedName("GpuImageDriver")
    @Expose
    private GpuImageDriverSpec GpuImageDriver;

    /**
     * Get <p>Node specification description, such as CVM.SA2.</p> 
     * @return Spec <p>Node specification description, such as CVM.SA2.</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>Node specification description, such as CVM.SA2.</p>
     * @param Spec <p>Node specification description, such as CVM.SA2.</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>Valid values:<br>&quot;LOCAL_SSD&quot;   3     // Local SSD<br>&quot;CLOUD_SSD&quot;   4     // Cloud SSD<br>&quot;CLOUD_PREMIUM&quot;  5  // Premium Disk<br>&quot;CLOUD_HSSD&quot;   6    // Enhanced SSD<br>&quot;CLOUD_THROUGHPUT&quot; 11// Throughput-Optimized Cloud Disk<br>&quot;CLOUD_TSSD&quot;  12     // Tremendous SSD<br>&quot;CLOUD_BSSD&quot;    13   // Balanced SSD<br>&quot;CLOUD_BIGDATA&quot; 14   // Big Data Cloud Disk<br>&quot;CLOUD_HIGHIO&quot;  15   // High-IO Cloud Disk </p><p>This field is invalid. The actual system disk type is determined based on the data disk type and node type. If the node supports the selected data disk type, the system disk type is consistent with the data disk. It is recommended to use the CreateCluster API.</p> 
     * @return StorageType <p>Valid values:<br>&quot;LOCAL_SSD&quot;   3     // Local SSD<br>&quot;CLOUD_SSD&quot;   4     // Cloud SSD<br>&quot;CLOUD_PREMIUM&quot;  5  // Premium Disk<br>&quot;CLOUD_HSSD&quot;   6    // Enhanced SSD<br>&quot;CLOUD_THROUGHPUT&quot; 11// Throughput-Optimized Cloud Disk<br>&quot;CLOUD_TSSD&quot;  12     // Tremendous SSD<br>&quot;CLOUD_BSSD&quot;    13   // Balanced SSD<br>&quot;CLOUD_BIGDATA&quot; 14   // Big Data Cloud Disk<br>&quot;CLOUD_HIGHIO&quot;  15   // High-IO Cloud Disk </p><p>This field is invalid. The actual system disk type is determined based on the data disk type and node type. If the node supports the selected data disk type, the system disk type is consistent with the data disk. It is recommended to use the CreateCluster API.</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Valid values:<br>&quot;LOCAL_SSD&quot;   3     // Local SSD<br>&quot;CLOUD_SSD&quot;   4     // Cloud SSD<br>&quot;CLOUD_PREMIUM&quot;  5  // Premium Disk<br>&quot;CLOUD_HSSD&quot;   6    // Enhanced SSD<br>&quot;CLOUD_THROUGHPUT&quot; 11// Throughput-Optimized Cloud Disk<br>&quot;CLOUD_TSSD&quot;  12     // Tremendous SSD<br>&quot;CLOUD_BSSD&quot;    13   // Balanced SSD<br>&quot;CLOUD_BIGDATA&quot; 14   // Big Data Cloud Disk<br>&quot;CLOUD_HIGHIO&quot;  15   // High-IO Cloud Disk </p><p>This field is invalid. The actual system disk type is determined based on the data disk type and node type. If the node supports the selected data disk type, the system disk type is consistent with the data disk. It is recommended to use the CreateCluster API.</p>
     * @param StorageType <p>Valid values:<br>&quot;LOCAL_SSD&quot;   3     // Local SSD<br>&quot;CLOUD_SSD&quot;   4     // Cloud SSD<br>&quot;CLOUD_PREMIUM&quot;  5  // Premium Disk<br>&quot;CLOUD_HSSD&quot;   6    // Enhanced SSD<br>&quot;CLOUD_THROUGHPUT&quot; 11// Throughput-Optimized Cloud Disk<br>&quot;CLOUD_TSSD&quot;  12     // Tremendous SSD<br>&quot;CLOUD_BSSD&quot;    13   // Balanced SSD<br>&quot;CLOUD_BIGDATA&quot; 14   // Big Data Cloud Disk<br>&quot;CLOUD_HIGHIO&quot;  15   // High-IO Cloud Disk </p><p>This field is invalid. The actual system disk type is determined based on the data disk type and node type. If the node supports the selected data disk type, the system disk type is consistent with the data disk. It is recommended to use the CreateCluster API.</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Data disk type. Valid values:</p><p>CLOUD_SSD: Cloud SSD</p><p>CLOUD_PREMIUM: Premium Disk</p><p>CLOUD_BASIC: Cloud Basic Disk</p><p>LOCAL_BASIC: Local Basic Disk</p><p>LOCAL_SSD: Local SSD</p><p>CLOUD_HSSD: Enhanced SSD</p><p>CLOUD_THROUGHPUT: Throughput-Optimized Cloud Disk</p><p>CLOUD_TSSD: Tremendous SSD</p><p>CLOUD_BIGDATA: Big Data Cloud Disk</p><p>CLOUD_HIGHIO: High-IO Cloud Disk</p><p>CLOUD_BSSD: Balanced SSD</p><p>REMOTE_SSD: Remote SSD Disk</p> 
     * @return DiskType <p>Data disk type. Valid values:</p><p>CLOUD_SSD: Cloud SSD</p><p>CLOUD_PREMIUM: Premium Disk</p><p>CLOUD_BASIC: Cloud Basic Disk</p><p>LOCAL_BASIC: Local Basic Disk</p><p>LOCAL_SSD: Local SSD</p><p>CLOUD_HSSD: Enhanced SSD</p><p>CLOUD_THROUGHPUT: Throughput-Optimized Cloud Disk</p><p>CLOUD_TSSD: Tremendous SSD</p><p>CLOUD_BIGDATA: Big Data Cloud Disk</p><p>CLOUD_HIGHIO: High-IO Cloud Disk</p><p>CLOUD_BSSD: Balanced SSD</p><p>REMOTE_SSD: Remote SSD Disk</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Data disk type. Valid values:</p><p>CLOUD_SSD: Cloud SSD</p><p>CLOUD_PREMIUM: Premium Disk</p><p>CLOUD_BASIC: Cloud Basic Disk</p><p>LOCAL_BASIC: Local Basic Disk</p><p>LOCAL_SSD: Local SSD</p><p>CLOUD_HSSD: Enhanced SSD</p><p>CLOUD_THROUGHPUT: Throughput-Optimized Cloud Disk</p><p>CLOUD_TSSD: Tremendous SSD</p><p>CLOUD_BIGDATA: Big Data Cloud Disk</p><p>CLOUD_HIGHIO: High-IO Cloud Disk</p><p>CLOUD_BSSD: Balanced SSD</p><p>REMOTE_SSD: Remote SSD Disk</p>
     * @param DiskType <p>Data disk type. Valid values:</p><p>CLOUD_SSD: Cloud SSD</p><p>CLOUD_PREMIUM: Premium Disk</p><p>CLOUD_BASIC: Cloud Basic Disk</p><p>LOCAL_BASIC: Local Basic Disk</p><p>LOCAL_SSD: Local SSD</p><p>CLOUD_HSSD: Enhanced SSD</p><p>CLOUD_THROUGHPUT: Throughput-Optimized Cloud Disk</p><p>CLOUD_TSSD: Tremendous SSD</p><p>CLOUD_BIGDATA: Big Data Cloud Disk</p><p>CLOUD_HIGHIO: High-IO Cloud Disk</p><p>CLOUD_BSSD: Balanced SSD</p><p>REMOTE_SSD: Remote SSD Disk</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Memory capacity (MB).</p> 
     * @return MemSize <p>Memory capacity (MB).</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory capacity (MB).</p>
     * @param MemSize <p>Memory capacity (MB).</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Number of CPU cores.</p> 
     * @return Cpu <p>Number of CPU cores.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of CPU cores.</p>
     * @param Cpu <p>Number of CPU cores.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Data disk capacity.</p> 
     * @return DiskSize <p>Data disk capacity.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Data disk capacity.</p>
     * @param DiskSize <p>Data disk capacity.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>System disk capacity.</p> 
     * @return RootSize <p>System disk capacity.</p>
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set <p>System disk capacity.</p>
     * @param RootSize <p>System disk capacity.</p>
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get <p>Cloud disk list. When the data disk is a single cloud disk, use the DiskType and DiskSize parameters directly. Use MultiDisks for extra disks.</p> 
     * @return MultiDisks <p>Cloud disk list. When the data disk is a single cloud disk, use the DiskType and DiskSize parameters directly. Use MultiDisks for extra disks.</p>
     */
    public MultiDisk [] getMultiDisks() {
        return this.MultiDisks;
    }

    /**
     * Set <p>Cloud disk list. When the data disk is a single cloud disk, use the DiskType and DiskSize parameters directly. Use MultiDisks for extra disks.</p>
     * @param MultiDisks <p>Cloud disk list. When the data disk is a single cloud disk, use the DiskType and DiskSize parameters directly. Use MultiDisks for extra disks.</p>
     */
    public void setMultiDisks(MultiDisk [] MultiDisks) {
        this.MultiDisks = MultiDisks;
    }

    /**
     * Get <p>List of tags to be bound.</p> 
     * @return Tags <p>List of tags to be bound.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tags to be bound.</p>
     * @param Tags <p>List of tags to be bound.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Specifications type, such as S2.MEDIUM8.</p> 
     * @return InstanceType <p>Specifications type, such as S2.MEDIUM8.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Specifications type, such as S2.MEDIUM8.</p>
     * @param InstanceType <p>Specifications type, such as S2.MEDIUM8.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Number of local disks. This field has been deprecated.</p> 
     * @return LocalDiskNum <p>Number of local disks. This field has been deprecated.</p>
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set <p>Number of local disks. This field has been deprecated.</p>
     * @param LocalDiskNum <p>Number of local disks. This field has been deprecated.</p>
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
    }

    /**
     * Get <p>Number of local disks, such as 2.</p> 
     * @return DiskNum <p>Number of local disks, such as 2.</p>
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set <p>Number of local disks, such as 2.</p>
     * @param DiskNum <p>Number of local disks, such as 2.</p>
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get <p>GPU information.</p> 
     * @return GpuDesc <p>GPU information.</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>GPU information.</p>
     * @param GpuDesc <p>GPU information.</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>Number of partitions in a placement group.</p> 
     * @return PartitionNumber <p>Number of partitions in a placement group.</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>Number of partitions in a placement group.</p>
     * @param PartitionNumber <p>Number of partitions in a placement group.</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get <p>High-performance cluster ID.</p> 
     * @return HCCHpcClusterId <p>High-performance cluster ID.</p>
     */
    public String getHCCHpcClusterId() {
        return this.HCCHpcClusterId;
    }

    /**
     * Set <p>High-performance cluster ID.</p>
     * @param HCCHpcClusterId <p>High-performance cluster ID.</p>
     */
    public void setHCCHpcClusterId(String HCCHpcClusterId) {
        this.HCCHpcClusterId = HCCHpcClusterId;
    }

    /**
     * Get <p>Custom hostname.</p> 
     * @return CustomNodeName <p>Custom hostname.</p>
     */
    public String getCustomNodeName() {
        return this.CustomNodeName;
    }

    /**
     * Set <p>Custom hostname.</p>
     * @param CustomNodeName <p>Custom hostname.</p>
     */
    public void setCustomNodeName(String CustomNodeName) {
        this.CustomNodeName = CustomNodeName;
    }

    /**
     * Get <p>GPU image driver configuration.</p> 
     * @return GpuImageDriver <p>GPU image driver configuration.</p>
     */
    public GpuImageDriverSpec getGpuImageDriver() {
        return this.GpuImageDriver;
    }

    /**
     * Set <p>GPU image driver configuration.</p>
     * @param GpuImageDriver <p>GPU image driver configuration.</p>
     */
    public void setGpuImageDriver(GpuImageDriverSpec GpuImageDriver) {
        this.GpuImageDriver = GpuImageDriver;
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
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
        if (source.HCCHpcClusterId != null) {
            this.HCCHpcClusterId = new String(source.HCCHpcClusterId);
        }
        if (source.CustomNodeName != null) {
            this.CustomNodeName = new String(source.CustomNodeName);
        }
        if (source.GpuImageDriver != null) {
            this.GpuImageDriver = new GpuImageDriverSpec(source.GpuImageDriver);
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
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);
        this.setParamSimple(map, prefix + "HCCHpcClusterId", this.HCCHpcClusterId);
        this.setParamSimple(map, prefix + "CustomNodeName", this.CustomNodeName);
        this.setParamObj(map, prefix + "GpuImageDriver.", this.GpuImageDriver);

    }
}

