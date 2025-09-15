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

public class PersistentVolumeContext extends AbstractModel {

    /**
    * Disk size in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk type, CLOUD_PREMIUM or CLOUD_SSD.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Number of disks.
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
    * Additional performance of cloud disks.
    */
    @SerializedName("ExtraPerformance")
    @Expose
    private Long ExtraPerformance;

    /**
     * Get Disk size in GB. 
     * @return DiskSize Disk size in GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size in GB.
     * @param DiskSize Disk size in GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk type, CLOUD_PREMIUM or CLOUD_SSD. 
     * @return DiskType Disk type, CLOUD_PREMIUM or CLOUD_SSD.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type, CLOUD_PREMIUM or CLOUD_SSD.
     * @param DiskType Disk type, CLOUD_PREMIUM or CLOUD_SSD.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Number of disks. 
     * @return DiskNum Number of disks.
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set Number of disks.
     * @param DiskNum Number of disks.
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Get Additional performance of cloud disks. 
     * @return ExtraPerformance Additional performance of cloud disks.
     */
    public Long getExtraPerformance() {
        return this.ExtraPerformance;
    }

    /**
     * Set Additional performance of cloud disks.
     * @param ExtraPerformance Additional performance of cloud disks.
     */
    public void setExtraPerformance(Long ExtraPerformance) {
        this.ExtraPerformance = ExtraPerformance;
    }

    public PersistentVolumeContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistentVolumeContext(PersistentVolumeContext source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
        }
        if (source.ExtraPerformance != null) {
            this.ExtraPerformance = new Long(source.ExtraPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);
        this.setParamSimple(map, prefix + "ExtraPerformance", this.ExtraPerformance);

    }
}

