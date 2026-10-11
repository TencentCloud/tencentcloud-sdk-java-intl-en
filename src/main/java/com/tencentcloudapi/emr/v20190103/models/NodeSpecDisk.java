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

public class NodeSpecDisk extends AbstractModel {

    /**
    * Number.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Disk type.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specified disk size.
    */
    @SerializedName("DefaultDiskSize")
    @Expose
    private Long DefaultDiskSize;

    /**
    * Whether it is a special data disk, for example, a single-replica disk.
    */
    @SerializedName("IsSpecialDisk")
    @Expose
    private Boolean IsSpecialDisk;

    /**
     * Get Number. 
     * @return Count Number.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number.
     * @param Count Number.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Disk type. 
     * @return DiskType Disk type.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type.
     * @param DiskType Disk type.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specified disk size. 
     * @return DefaultDiskSize Specified disk size.
     */
    public Long getDefaultDiskSize() {
        return this.DefaultDiskSize;
    }

    /**
     * Set Specified disk size.
     * @param DefaultDiskSize Specified disk size.
     */
    public void setDefaultDiskSize(Long DefaultDiskSize) {
        this.DefaultDiskSize = DefaultDiskSize;
    }

    /**
     * Get Whether it is a special data disk, for example, a single-replica disk. 
     * @return IsSpecialDisk Whether it is a special data disk, for example, a single-replica disk.
     */
    public Boolean getIsSpecialDisk() {
        return this.IsSpecialDisk;
    }

    /**
     * Set Whether it is a special data disk, for example, a single-replica disk.
     * @param IsSpecialDisk Whether it is a special data disk, for example, a single-replica disk.
     */
    public void setIsSpecialDisk(Boolean IsSpecialDisk) {
        this.IsSpecialDisk = IsSpecialDisk;
    }

    public NodeSpecDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecDisk(NodeSpecDisk source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DefaultDiskSize != null) {
            this.DefaultDiskSize = new Long(source.DefaultDiskSize);
        }
        if (source.IsSpecialDisk != null) {
            this.IsSpecialDisk = new Boolean(source.IsSpecialDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DefaultDiskSize", this.DefaultDiskSize);
        this.setParamSimple(map, prefix + "IsSpecialDisk", this.IsSpecialDisk);

    }
}

