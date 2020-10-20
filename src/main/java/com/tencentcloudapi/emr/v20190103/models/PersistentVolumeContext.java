/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersistentVolumeContext extends AbstractModel{

    /**
    * Disk size in GB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk type. Valid values: CLOUD_PREMIUM, CLOUD_SSD
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Number of disks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
     * Get Disk size in GB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size in GB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size in GB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size in GB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk type. Valid values: CLOUD_PREMIUM, CLOUD_SSD
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Disk type. Valid values: CLOUD_PREMIUM, CLOUD_SSD
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type. Valid values: CLOUD_PREMIUM, CLOUD_SSD
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskType Disk type. Valid values: CLOUD_PREMIUM, CLOUD_SSD
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Number of disks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskNum Number of disks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set Number of disks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskNum Number of disks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);

    }
}

