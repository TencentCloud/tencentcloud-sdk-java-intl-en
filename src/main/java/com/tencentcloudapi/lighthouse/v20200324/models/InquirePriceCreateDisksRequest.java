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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDisksRequest extends AbstractModel {

    /**
    * Cloud disk size in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud storage), "CLOUD_SSD" (SSD cloud disk).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Parameter settings for purchasing the monthly subscribed cloud disk.
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * Number of cloud disks. Default value: 1.
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Specify the quota of disk backups. No quota if it’s left empty. Only one quota is allowed.
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get Cloud disk size in GB. 
     * @return DiskSize Cloud disk size in GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size in GB.
     * @param DiskSize Cloud disk size in GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud storage), "CLOUD_SSD" (SSD cloud disk). 
     * @return DiskType Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud storage), "CLOUD_SSD" (SSD cloud disk).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud storage), "CLOUD_SSD" (SSD cloud disk).
     * @param DiskType Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud storage), "CLOUD_SSD" (SSD cloud disk).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Parameter settings for purchasing the monthly subscribed cloud disk. 
     * @return DiskChargePrepaid Parameter settings for purchasing the monthly subscribed cloud disk.
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set Parameter settings for purchasing the monthly subscribed cloud disk.
     * @param DiskChargePrepaid Parameter settings for purchasing the monthly subscribed cloud disk.
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get Number of cloud disks. Default value: 1. 
     * @return DiskCount Number of cloud disks. Default value: 1.
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Number of cloud disks. Default value: 1.
     * @param DiskCount Number of cloud disks. Default value: 1.
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Specify the quota of disk backups. No quota if it’s left empty. Only one quota is allowed. 
     * @return DiskBackupQuota Specify the quota of disk backups. No quota if it’s left empty. Only one quota is allowed.
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set Specify the quota of disk backups. No quota if it’s left empty. Only one quota is allowed.
     * @param DiskBackupQuota Specify the quota of disk backups. No quota if it’s left empty. Only one quota is allowed.
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public InquirePriceCreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateDisksRequest(InquirePriceCreateDisksRequest source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

