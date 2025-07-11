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
    * Target specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of CPUs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Disk size.
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskCnt")
    @Expose
    private Long DiskCnt;

    /**
    * Specification
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * Number of local disks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalDiskNum")
    @Expose
    private Long LocalDiskNum;

    /**
     * Get Target specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Spec Target specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Target specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Spec Target specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Disk type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Disk type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskType Disk type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RootSize System disk size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RootSize System disk size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get Memory size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemSize Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemSize Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of CPUs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPUs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPUs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPUs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Disk size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size.
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskCnt Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskCnt() {
        return this.DiskCnt;
    }

    /**
     * Set Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskCnt Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskCnt(Long DiskCnt) {
        this.DiskCnt = DiskCnt;
    }

    /**
     * Get Specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Specification
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskNum Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskNum Number of disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get Number of local disks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalDiskNum Number of local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLocalDiskNum() {
        return this.LocalDiskNum;
    }

    /**
     * Set Number of local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalDiskNum Number of local disks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalDiskNum(Long LocalDiskNum) {
        this.LocalDiskNum = LocalDiskNum;
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

    }
}

