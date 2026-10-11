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

public class Disk extends AbstractModel {

    /**
    * Data disk type, which is available when an EMR container cluster is created. Valid values:
<li>CLOUD_SSD: SSD Cloud Disk</li>
<li>CLOUD_PREMIUM: Premium Disk</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Single block size (GB).
    */
    @SerializedName("DiskCapacity")
    @Expose
    private Long DiskCapacity;

    /**
    * Number of data disks.
    */
    @SerializedName("DiskNumber")
    @Expose
    private Long DiskNumber;

    /**
     * Get Data disk type, which is available when an EMR container cluster is created. Valid values:
<li>CLOUD_SSD: SSD Cloud Disk</li>
<li>CLOUD_PREMIUM: Premium Disk</li> 
     * @return DiskType Data disk type, which is available when an EMR container cluster is created. Valid values:
<li>CLOUD_SSD: SSD Cloud Disk</li>
<li>CLOUD_PREMIUM: Premium Disk</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Data disk type, which is available when an EMR container cluster is created. Valid values:
<li>CLOUD_SSD: SSD Cloud Disk</li>
<li>CLOUD_PREMIUM: Premium Disk</li>
     * @param DiskType Data disk type, which is available when an EMR container cluster is created. Valid values:
<li>CLOUD_SSD: SSD Cloud Disk</li>
<li>CLOUD_PREMIUM: Premium Disk</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Single block size (GB). 
     * @return DiskCapacity Single block size (GB).
     */
    public Long getDiskCapacity() {
        return this.DiskCapacity;
    }

    /**
     * Set Single block size (GB).
     * @param DiskCapacity Single block size (GB).
     */
    public void setDiskCapacity(Long DiskCapacity) {
        this.DiskCapacity = DiskCapacity;
    }

    /**
     * Get Number of data disks. 
     * @return DiskNumber Number of data disks.
     */
    public Long getDiskNumber() {
        return this.DiskNumber;
    }

    /**
     * Set Number of data disks.
     * @param DiskNumber Number of data disks.
     */
    public void setDiskNumber(Long DiskNumber) {
        this.DiskNumber = DiskNumber;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskCapacity != null) {
            this.DiskCapacity = new Long(source.DiskCapacity);
        }
        if (source.DiskNumber != null) {
            this.DiskNumber = new Long(source.DiskNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskCapacity", this.DiskCapacity);
        this.setParamSimple(map, prefix + "DiskNumber", this.DiskNumber);

    }
}

