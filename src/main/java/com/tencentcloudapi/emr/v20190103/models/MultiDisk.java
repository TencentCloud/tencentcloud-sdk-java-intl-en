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

public class MultiDisk extends AbstractModel {

    /**
    * Cloud disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk size.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Number of cloud disks of this type.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Cloud disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li> 
     * @return DiskType Cloud disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
     * @param DiskType Cloud disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk size. 
     * @return Volume Cloud disk size.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Cloud disk size.
     * @param Volume Cloud disk size.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Number of cloud disks of this type. 
     * @return Count Number of cloud disks of this type.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of cloud disks of this type.
     * @param Count Number of cloud disks of this type.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public MultiDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiDisk(MultiDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

