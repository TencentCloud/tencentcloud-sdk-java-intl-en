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

public class AttachCBSSpec extends AbstractModel {

    /**
    * Node disk type, such as CLOUD_SSD"\"CLOUD_PREMIUM
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk capacity, in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Total number of disks
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Description
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
     * Get Node disk type, such as CLOUD_SSD"\"CLOUD_PREMIUM 
     * @return DiskType Node disk type, such as CLOUD_SSD"\"CLOUD_PREMIUM
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Node disk type, such as CLOUD_SSD"\"CLOUD_PREMIUM
     * @param DiskType Node disk type, such as CLOUD_SSD"\"CLOUD_PREMIUM
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk capacity, in GB 
     * @return DiskSize Disk capacity, in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk capacity, in GB
     * @param DiskSize Disk capacity, in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Total number of disks 
     * @return DiskCount Total number of disks
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Total number of disks
     * @param DiskCount Total number of disks
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Description 
     * @return DiskDesc Description
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set Description
     * @param DiskDesc Description
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    public AttachCBSSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachCBSSpec(AttachCBSSpec source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);

    }
}

