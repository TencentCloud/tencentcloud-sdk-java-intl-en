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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageNodeSpec extends AbstractModel {

    /**
    * <p>Specification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>CPU cores of the storage node</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>Storage node memory size</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>Maximum quantity of storage nodes</p>
    */
    @SerializedName("StorageNodeMaxNum")
    @Expose
    private Long StorageNodeMaxNum;

    /**
    * <p>Node disk size capacity limit</p>
    */
    @SerializedName("StorageNodeMaxDisk")
    @Expose
    private Long StorageNodeMaxDisk;

    /**
    * <p>Minimum number of storage nodes</p>
    */
    @SerializedName("StorageNodeMinNum")
    @Expose
    private Long StorageNodeMinNum;

    /**
    * <p>Node disk size minimum</p>
    */
    @SerializedName("StorageNodeMinDisk")
    @Expose
    private Long StorageNodeMinDisk;

    /**
    * <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Default disk size of storage node for frontend display</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageNodeDefaultDisk")
    @Expose
    private Long StorageNodeDefaultDisk;

    /**
    * <p>Specification support billing mode list</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String [] InstanceMode;

    /**
    * <p>Disk Type CLOUD_DISK: cloud disk LOCAL_DISK: local disk</p>
    */
    @SerializedName("DiskTypeCategory")
    @Expose
    private String DiskTypeCategory;

    /**
     * Get <p>Specification code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecCode <p>Specification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Specification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecCode <p>Specification code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>CPU cores of the storage node</p> 
     * @return StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>CPU cores of the storage node</p>
     * @param StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>Storage node memory size</p> 
     * @return StorageNodeMem <p>Storage node memory size</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>Storage node memory size</p>
     * @param StorageNodeMem <p>Storage node memory size</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>Maximum quantity of storage nodes</p> 
     * @return StorageNodeMaxNum <p>Maximum quantity of storage nodes</p>
     */
    public Long getStorageNodeMaxNum() {
        return this.StorageNodeMaxNum;
    }

    /**
     * Set <p>Maximum quantity of storage nodes</p>
     * @param StorageNodeMaxNum <p>Maximum quantity of storage nodes</p>
     */
    public void setStorageNodeMaxNum(Long StorageNodeMaxNum) {
        this.StorageNodeMaxNum = StorageNodeMaxNum;
    }

    /**
     * Get <p>Node disk size capacity limit</p> 
     * @return StorageNodeMaxDisk <p>Node disk size capacity limit</p>
     */
    public Long getStorageNodeMaxDisk() {
        return this.StorageNodeMaxDisk;
    }

    /**
     * Set <p>Node disk size capacity limit</p>
     * @param StorageNodeMaxDisk <p>Node disk size capacity limit</p>
     */
    public void setStorageNodeMaxDisk(Long StorageNodeMaxDisk) {
        this.StorageNodeMaxDisk = StorageNodeMaxDisk;
    }

    /**
     * Get <p>Minimum number of storage nodes</p> 
     * @return StorageNodeMinNum <p>Minimum number of storage nodes</p>
     */
    public Long getStorageNodeMinNum() {
        return this.StorageNodeMinNum;
    }

    /**
     * Set <p>Minimum number of storage nodes</p>
     * @param StorageNodeMinNum <p>Minimum number of storage nodes</p>
     */
    public void setStorageNodeMinNum(Long StorageNodeMinNum) {
        this.StorageNodeMinNum = StorageNodeMinNum;
    }

    /**
     * Get <p>Node disk size minimum</p> 
     * @return StorageNodeMinDisk <p>Node disk size minimum</p>
     */
    public Long getStorageNodeMinDisk() {
        return this.StorageNodeMinDisk;
    }

    /**
     * Set <p>Node disk size minimum</p>
     * @param StorageNodeMinDisk <p>Node disk size minimum</p>
     */
    public void setStorageNodeMinDisk(Long StorageNodeMinDisk) {
        this.StorageNodeMinDisk = StorageNodeMinDisk;
    }

    /**
     * Get <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Default disk size of storage node for frontend display</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageNodeDefaultDisk <p>Default disk size of storage node for frontend display</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageNodeDefaultDisk() {
        return this.StorageNodeDefaultDisk;
    }

    /**
     * Set <p>Default disk size of storage node for frontend display</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageNodeDefaultDisk <p>Default disk size of storage node for frontend display</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageNodeDefaultDisk(Long StorageNodeDefaultDisk) {
        this.StorageNodeDefaultDisk = StorageNodeDefaultDisk;
    }

    /**
     * Get <p>Specification support billing mode list</p> 
     * @return InstanceMode <p>Specification support billing mode list</p>
     */
    public String [] getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>Specification support billing mode list</p>
     * @param InstanceMode <p>Specification support billing mode list</p>
     */
    public void setInstanceMode(String [] InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>Disk Type CLOUD_DISK: cloud disk LOCAL_DISK: local disk</p> 
     * @return DiskTypeCategory <p>Disk Type CLOUD_DISK: cloud disk LOCAL_DISK: local disk</p>
     */
    public String getDiskTypeCategory() {
        return this.DiskTypeCategory;
    }

    /**
     * Set <p>Disk Type CLOUD_DISK: cloud disk LOCAL_DISK: local disk</p>
     * @param DiskTypeCategory <p>Disk Type CLOUD_DISK: cloud disk LOCAL_DISK: local disk</p>
     */
    public void setDiskTypeCategory(String DiskTypeCategory) {
        this.DiskTypeCategory = DiskTypeCategory;
    }

    public StorageNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageNodeSpec(StorageNodeSpec source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.StorageNodeMaxNum != null) {
            this.StorageNodeMaxNum = new Long(source.StorageNodeMaxNum);
        }
        if (source.StorageNodeMaxDisk != null) {
            this.StorageNodeMaxDisk = new Long(source.StorageNodeMaxDisk);
        }
        if (source.StorageNodeMinNum != null) {
            this.StorageNodeMinNum = new Long(source.StorageNodeMinNum);
        }
        if (source.StorageNodeMinDisk != null) {
            this.StorageNodeMinDisk = new Long(source.StorageNodeMinDisk);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageNodeDefaultDisk != null) {
            this.StorageNodeDefaultDisk = new Long(source.StorageNodeDefaultDisk);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String[source.InstanceMode.length];
            for (int i = 0; i < source.InstanceMode.length; i++) {
                this.InstanceMode[i] = new String(source.InstanceMode[i]);
            }
        }
        if (source.DiskTypeCategory != null) {
            this.DiskTypeCategory = new String(source.DiskTypeCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "StorageNodeMaxNum", this.StorageNodeMaxNum);
        this.setParamSimple(map, prefix + "StorageNodeMaxDisk", this.StorageNodeMaxDisk);
        this.setParamSimple(map, prefix + "StorageNodeMinNum", this.StorageNodeMinNum);
        this.setParamSimple(map, prefix + "StorageNodeMinDisk", this.StorageNodeMinDisk);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageNodeDefaultDisk", this.StorageNodeDefaultDisk);
        this.setParamArraySimple(map, prefix + "InstanceMode.", this.InstanceMode);
        this.setParamSimple(map, prefix + "DiskTypeCategory", this.DiskTypeCategory);

    }
}

