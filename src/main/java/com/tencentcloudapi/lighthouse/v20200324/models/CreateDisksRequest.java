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

public class CreateDisksRequest extends AbstractModel {

    /**
    * Availability zone. You can call [DescribeZones](https://intl.cloud.tencent.com/document/product/1207/57513?from_cn_redirect=1) and get the information in the `Zone` parameter re 
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cloud disk size in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud disk), "CLOUD_SSD" (SSD cloud disk).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Parameters of monthly subscribed cloud disks
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * Image name, which can contain up to 60 characters.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Number of cloud disks. Range: [1, 30]. Default value: 1.
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
    * Whether to use the vouchers automatically. It defaults to No.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * Automatically mount and initialize the data disk.
    */
    @SerializedName("AutoMountConfiguration")
    @Expose
    private AutoMountConfiguration AutoMountConfiguration;

    /**
     * Get Availability zone. You can call [DescribeZones](https://intl.cloud.tencent.com/document/product/1207/57513?from_cn_redirect=1) and get the information in the `Zone` parameter re  
     * @return Zone Availability zone. You can call [DescribeZones](https://intl.cloud.tencent.com/document/product/1207/57513?from_cn_redirect=1) and get the information in the `Zone` parameter re 
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone. You can call [DescribeZones](https://intl.cloud.tencent.com/document/product/1207/57513?from_cn_redirect=1) and get the information in the `Zone` parameter re 
     * @param Zone Availability zone. You can call [DescribeZones](https://intl.cloud.tencent.com/document/product/1207/57513?from_cn_redirect=1) and get the information in the `Zone` parameter re 
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

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
     * Get Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud disk), "CLOUD_SSD" (SSD cloud disk). 
     * @return DiskType Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud disk), "CLOUD_SSD" (SSD cloud disk).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud disk), "CLOUD_SSD" (SSD cloud disk).
     * @param DiskType Cloud disk media type. Valid values: "CLOUD_PREMIUM" (premium cloud disk), "CLOUD_SSD" (SSD cloud disk).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Parameters of monthly subscribed cloud disks 
     * @return DiskChargePrepaid Parameters of monthly subscribed cloud disks
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set Parameters of monthly subscribed cloud disks
     * @param DiskChargePrepaid Parameters of monthly subscribed cloud disks
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get Image name, which can contain up to 60 characters. 
     * @return DiskName Image name, which can contain up to 60 characters.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Image name, which can contain up to 60 characters.
     * @param DiskName Image name, which can contain up to 60 characters.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Number of cloud disks. Range: [1, 30]. Default value: 1. 
     * @return DiskCount Number of cloud disks. Range: [1, 30]. Default value: 1.
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Number of cloud disks. Range: [1, 30]. Default value: 1.
     * @param DiskCount Number of cloud disks. Range: [1, 30]. Default value: 1.
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

    /**
     * Get Whether to use the vouchers automatically. It defaults to No. 
     * @return AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use the vouchers automatically. It defaults to No.
     * @param AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Automatically mount and initialize the data disk. 
     * @return AutoMountConfiguration Automatically mount and initialize the data disk.
     */
    public AutoMountConfiguration getAutoMountConfiguration() {
        return this.AutoMountConfiguration;
    }

    /**
     * Set Automatically mount and initialize the data disk.
     * @param AutoMountConfiguration Automatically mount and initialize the data disk.
     */
    public void setAutoMountConfiguration(AutoMountConfiguration AutoMountConfiguration) {
        this.AutoMountConfiguration = AutoMountConfiguration;
    }

    public CreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisksRequest(CreateDisksRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.AutoMountConfiguration != null) {
            this.AutoMountConfiguration = new AutoMountConfiguration(source.AutoMountConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamObj(map, prefix + "AutoMountConfiguration.", this.AutoMountConfiguration);

    }
}

