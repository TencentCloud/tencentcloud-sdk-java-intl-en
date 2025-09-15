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

public class MultiDiskMC extends AbstractModel {

    /**
    * Number of cloud disks of this type.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Disk type.
1: Local Disk.
2: Cloud Disk.
3: Local SSD.
4: Cloud SSD.
5: Premium Cloud Disk.
6: Enhanced SSD.
11: Throughput HDD.
12: Tremendous SSD.
13: Balanced SSD.
14: Big Data Cloud Disk.
15: High IO Cloud Disk.
16: Remote SSD.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Disk size.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Cloud disk size (bytes).
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

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

    /**
     * Get Disk type.
1: Local Disk.
2: Cloud Disk.
3: Local SSD.
4: Cloud SSD.
5: Premium Cloud Disk.
6: Enhanced SSD.
11: Throughput HDD.
12: Tremendous SSD.
13: Balanced SSD.
14: Big Data Cloud Disk.
15: High IO Cloud Disk.
16: Remote SSD. 
     * @return Type Disk type.
1: Local Disk.
2: Cloud Disk.
3: Local SSD.
4: Cloud SSD.
5: Premium Cloud Disk.
6: Enhanced SSD.
11: Throughput HDD.
12: Tremendous SSD.
13: Balanced SSD.
14: Big Data Cloud Disk.
15: High IO Cloud Disk.
16: Remote SSD.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Disk type.
1: Local Disk.
2: Cloud Disk.
3: Local SSD.
4: Cloud SSD.
5: Premium Cloud Disk.
6: Enhanced SSD.
11: Throughput HDD.
12: Tremendous SSD.
13: Balanced SSD.
14: Big Data Cloud Disk.
15: High IO Cloud Disk.
16: Remote SSD.
     * @param Type Disk type.
1: Local Disk.
2: Cloud Disk.
3: Local SSD.
4: Cloud SSD.
5: Premium Cloud Disk.
6: Enhanced SSD.
11: Throughput HDD.
12: Tremendous SSD.
13: Balanced SSD.
14: Big Data Cloud Disk.
15: High IO Cloud Disk.
16: Remote SSD.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Disk size. 
     * @return Size Disk size.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Disk size.
     * @param Size Disk size.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Cloud disk size (bytes). 
     * @return Volume Cloud disk size (bytes).
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Cloud disk size (bytes).
     * @param Volume Cloud disk size (bytes).
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public MultiDiskMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiDiskMC(MultiDiskMC source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

