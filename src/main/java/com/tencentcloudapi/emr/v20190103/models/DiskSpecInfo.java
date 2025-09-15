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

public class DiskSpecInfo extends AbstractModel {

    /**
    * Number of disks.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Valid values of the system disk type:
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>

Valid values of the data disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
<li>CLOUD_THROUGHPUT: Throughput HDD.</li>
<li>CLOUD_TSSD: Tremendous SSD.</li>
<li>CLOUD_BIGDATA: Big Data Cloud Disk.</li>
<li>CLOUD_HIGHIO: High IO Cloud Disk.</li>
<li>CLOUD_BSSD: Balanced SSD.</li>
<li>REMOTE_SSD: Remote SSD.</li>

    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Data capacity in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Additional performance.
    */
    @SerializedName("ExtraPerformance")
    @Expose
    private Long ExtraPerformance;

    /**
     * Get Number of disks. 
     * @return Count Number of disks.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of disks.
     * @param Count Number of disks.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Valid values of the system disk type:
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>

Valid values of the data disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
<li>CLOUD_THROUGHPUT: Throughput HDD.</li>
<li>CLOUD_TSSD: Tremendous SSD.</li>
<li>CLOUD_BIGDATA: Big Data Cloud Disk.</li>
<li>CLOUD_HIGHIO: High IO Cloud Disk.</li>
<li>CLOUD_BSSD: Balanced SSD.</li>
<li>REMOTE_SSD: Remote SSD.</li>
 
     * @return DiskType Valid values of the system disk type:
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>

Valid values of the data disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
<li>CLOUD_THROUGHPUT: Throughput HDD.</li>
<li>CLOUD_TSSD: Tremendous SSD.</li>
<li>CLOUD_BIGDATA: Big Data Cloud Disk.</li>
<li>CLOUD_HIGHIO: High IO Cloud Disk.</li>
<li>CLOUD_BSSD: Balanced SSD.</li>
<li>REMOTE_SSD: Remote SSD.</li>

     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Valid values of the system disk type:
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>

Valid values of the data disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
<li>CLOUD_THROUGHPUT: Throughput HDD.</li>
<li>CLOUD_TSSD: Tremendous SSD.</li>
<li>CLOUD_BIGDATA: Big Data Cloud Disk.</li>
<li>CLOUD_HIGHIO: High IO Cloud Disk.</li>
<li>CLOUD_BSSD: Balanced SSD.</li>
<li>REMOTE_SSD: Remote SSD.</li>

     * @param DiskType Valid values of the system disk type:
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>

Valid values of the data disk type.
<li>CLOUD_SSD: Cloud SSD.</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk.</li>
<li>CLOUD_BASIC: Cloud Disk.</li>
<li>LOCAL_BASIC: Local Disk.</li>
<li>LOCAL_SSD: Local SSD.</li>
<li>CLOUD_HSSD: Enhanced SSD.</li>
<li>CLOUD_THROUGHPUT: Throughput HDD.</li>
<li>CLOUD_TSSD: Tremendous SSD.</li>
<li>CLOUD_BIGDATA: Big Data Cloud Disk.</li>
<li>CLOUD_HIGHIO: High IO Cloud Disk.</li>
<li>CLOUD_BSSD: Balanced SSD.</li>
<li>REMOTE_SSD: Remote SSD.</li>

     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Data capacity in GB. 
     * @return DiskSize Data capacity in GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data capacity in GB.
     * @param DiskSize Data capacity in GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Additional performance. 
     * @return ExtraPerformance Additional performance.
     */
    public Long getExtraPerformance() {
        return this.ExtraPerformance;
    }

    /**
     * Set Additional performance.
     * @param ExtraPerformance Additional performance.
     */
    public void setExtraPerformance(Long ExtraPerformance) {
        this.ExtraPerformance = ExtraPerformance;
    }

    public DiskSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpecInfo(DiskSpecInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ExtraPerformance != null) {
            this.ExtraPerformance = new Long(source.ExtraPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ExtraPerformance", this.ExtraPerformance);

    }
}

