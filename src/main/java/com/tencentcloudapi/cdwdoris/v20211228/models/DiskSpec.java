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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSpec extends AbstractModel {

    /**
    * Disk type, such as CLOUD_SSD and LOCAL_SSD
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk type description, such as cloud SSD and local SSD
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * Minimum disk size, in GB
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * Maximum disk size, in GB
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * Number of disks
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get Disk type, such as CLOUD_SSD and LOCAL_SSD 
     * @return DiskType Disk type, such as CLOUD_SSD and LOCAL_SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type, such as CLOUD_SSD and LOCAL_SSD
     * @param DiskType Disk type, such as CLOUD_SSD and LOCAL_SSD
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk type description, such as cloud SSD and local SSD 
     * @return DiskDesc Disk type description, such as cloud SSD and local SSD
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set Disk type description, such as cloud SSD and local SSD
     * @param DiskDesc Disk type description, such as cloud SSD and local SSD
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get Minimum disk size, in GB 
     * @return MinDiskSize Minimum disk size, in GB
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set Minimum disk size, in GB
     * @param MinDiskSize Minimum disk size, in GB
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get Maximum disk size, in GB 
     * @return MaxDiskSize Maximum disk size, in GB
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Maximum disk size, in GB
     * @param MaxDiskSize Maximum disk size, in GB
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get Number of disks 
     * @return DiskCount Number of disks
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Number of disks
     * @param DiskCount Number of disks
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public DiskSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpec(DiskSpec source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

