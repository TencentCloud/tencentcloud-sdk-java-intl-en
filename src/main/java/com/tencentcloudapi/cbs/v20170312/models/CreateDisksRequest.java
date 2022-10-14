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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisksRequest extends AbstractModel{

    /**
    * Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project. If no project is specified, the default project will be used.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Cloud disk billing mode. POSTPAID_BY_HOUR: Pay-as-you-go by hour<br><li>CDCPAID: Billed together with the bound dedicated cluster<br>For more information on the pricing in each mode, see [Pricing Overview](https://intl.cloud.tencent.com/document/product/362/2413?from_cn_redirect=1).
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Cloud disk media type. Valid values: <br><li>CLOUD_BASIC: HDD Cloud Storage<br><li>CLOUD_PREMIUM: Premium Cloud Disk<br><li>CLOUD_BSSD: Balanced SSD<br><li>CLOUD_SSD: SSD<br><li>CLOUD_HSSD: Enhanced SSD<br><li>CLOUD_TSSD: ulTra SSD.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk name. If it is not specified, "Unnamed" will be used by default. The maximum length is 60 bytes.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Tags bound to the cloud disk.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Snapshot ID. If this parameter is specified, the cloud disk will be created based on the snapshot. The snapshot must be a data disk snapshot. To query the type of a snapshot, call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and see the `DiskUsage` field in the response.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Number of cloud disks to be created. If it is not specified, `1` will be used by default. There is an upper limit on the maximum number of cloud disks that can be created in a single request. For more information, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1).
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Extra performance purchased for a cloud disk.<br>This optional parameter is only valid for ulTra SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD).
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Cloud disk size in GB. <br><li>`DiskSize` is not required if `SnapshotId` is specified. In this case, the size of the cloud disk will be equal to that of the snapshot. <br><li>If you specify both `SnapshotId` and `DiskSize`, the specified disk size cannot be smaller than the snapshot size. <br><li>For the value range of cloud disk size, see [Cloud Disk Types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1).
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Optional parameter. Default value: `False`. If `True` is specified, the new cloud disk will be shared.
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * This parameter is used to create encrypted cloud disks. It is fixed at `ENCRYPT`.
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase attributes such as usage period and whether or not auto-renewal is set up can be specified using this parameter. <br>This parameter is required when creating a prepaid cloud disk. This parameter is not required when creating an hourly postpaid cloud disk. 
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * Whether to delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default value). `1`: Yes. To check whether a snapshot is permanently reserved, see the `IsPermanent` field returned by the `DescribeSnapshots` API.
    */
    @SerializedName("DeleteSnapshot")
    @Expose
    private Long DeleteSnapshot;

    /**
    * Specifies whether to automatically attach and initialize the newly created data disk.
    */
    @SerializedName("AutoMountConfiguration")
    @Expose
    private AutoMountConfiguration AutoMountConfiguration;

    /**
    * Specifies the cloud disk backup point quota.
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project. If no project is specified, the default project will be used. 
     * @return Placement Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project. If no project is specified, the default project will be used.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project. If no project is specified, the default project will be used.
     * @param Placement Location of the instance. You can use this parameter to specify the attributes of the instance, such as its availability zone and project. If no project is specified, the default project will be used.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Cloud disk billing mode. POSTPAID_BY_HOUR: Pay-as-you-go by hour<br><li>CDCPAID: Billed together with the bound dedicated cluster<br>For more information on the pricing in each mode, see [Pricing Overview](https://intl.cloud.tencent.com/document/product/362/2413?from_cn_redirect=1). 
     * @return DiskChargeType Cloud disk billing mode. POSTPAID_BY_HOUR: Pay-as-you-go by hour<br><li>CDCPAID: Billed together with the bound dedicated cluster<br>For more information on the pricing in each mode, see [Pricing Overview](https://intl.cloud.tencent.com/document/product/362/2413?from_cn_redirect=1).
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Cloud disk billing mode. POSTPAID_BY_HOUR: Pay-as-you-go by hour<br><li>CDCPAID: Billed together with the bound dedicated cluster<br>For more information on the pricing in each mode, see [Pricing Overview](https://intl.cloud.tencent.com/document/product/362/2413?from_cn_redirect=1).
     * @param DiskChargeType Cloud disk billing mode. POSTPAID_BY_HOUR: Pay-as-you-go by hour<br><li>CDCPAID: Billed together with the bound dedicated cluster<br>For more information on the pricing in each mode, see [Pricing Overview](https://intl.cloud.tencent.com/document/product/362/2413?from_cn_redirect=1).
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Cloud disk media type. Valid values: <br><li>CLOUD_BASIC: HDD Cloud Storage<br><li>CLOUD_PREMIUM: Premium Cloud Disk<br><li>CLOUD_BSSD: Balanced SSD<br><li>CLOUD_SSD: SSD<br><li>CLOUD_HSSD: Enhanced SSD<br><li>CLOUD_TSSD: ulTra SSD. 
     * @return DiskType Cloud disk media type. Valid values: <br><li>CLOUD_BASIC: HDD Cloud Storage<br><li>CLOUD_PREMIUM: Premium Cloud Disk<br><li>CLOUD_BSSD: Balanced SSD<br><li>CLOUD_SSD: SSD<br><li>CLOUD_HSSD: Enhanced SSD<br><li>CLOUD_TSSD: ulTra SSD.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk media type. Valid values: <br><li>CLOUD_BASIC: HDD Cloud Storage<br><li>CLOUD_PREMIUM: Premium Cloud Disk<br><li>CLOUD_BSSD: Balanced SSD<br><li>CLOUD_SSD: SSD<br><li>CLOUD_HSSD: Enhanced SSD<br><li>CLOUD_TSSD: ulTra SSD.
     * @param DiskType Cloud disk media type. Valid values: <br><li>CLOUD_BASIC: HDD Cloud Storage<br><li>CLOUD_PREMIUM: Premium Cloud Disk<br><li>CLOUD_BSSD: Balanced SSD<br><li>CLOUD_SSD: SSD<br><li>CLOUD_HSSD: Enhanced SSD<br><li>CLOUD_TSSD: ulTra SSD.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk name. If it is not specified, "Unnamed" will be used by default. The maximum length is 60 bytes. 
     * @return DiskName Cloud disk name. If it is not specified, "Unnamed" will be used by default. The maximum length is 60 bytes.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Cloud disk name. If it is not specified, "Unnamed" will be used by default. The maximum length is 60 bytes.
     * @param DiskName Cloud disk name. If it is not specified, "Unnamed" will be used by default. The maximum length is 60 bytes.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Tags bound to the cloud disk. 
     * @return Tags Tags bound to the cloud disk.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to the cloud disk.
     * @param Tags Tags bound to the cloud disk.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Snapshot ID. If this parameter is specified, the cloud disk will be created based on the snapshot. The snapshot must be a data disk snapshot. To query the type of a snapshot, call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and see the `DiskUsage` field in the response. 
     * @return SnapshotId Snapshot ID. If this parameter is specified, the cloud disk will be created based on the snapshot. The snapshot must be a data disk snapshot. To query the type of a snapshot, call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and see the `DiskUsage` field in the response.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID. If this parameter is specified, the cloud disk will be created based on the snapshot. The snapshot must be a data disk snapshot. To query the type of a snapshot, call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and see the `DiskUsage` field in the response.
     * @param SnapshotId Snapshot ID. If this parameter is specified, the cloud disk will be created based on the snapshot. The snapshot must be a data disk snapshot. To query the type of a snapshot, call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and see the `DiskUsage` field in the response.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Number of cloud disks to be created. If it is not specified, `1` will be used by default. There is an upper limit on the maximum number of cloud disks that can be created in a single request. For more information, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1). 
     * @return DiskCount Number of cloud disks to be created. If it is not specified, `1` will be used by default. There is an upper limit on the maximum number of cloud disks that can be created in a single request. For more information, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1).
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Number of cloud disks to be created. If it is not specified, `1` will be used by default. There is an upper limit on the maximum number of cloud disks that can be created in a single request. For more information, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1).
     * @param DiskCount Number of cloud disks to be created. If it is not specified, `1` will be used by default. There is an upper limit on the maximum number of cloud disks that can be created in a single request. For more information, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1).
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Extra performance purchased for a cloud disk.<br>This optional parameter is only valid for ulTra SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD). 
     * @return ThroughputPerformance Extra performance purchased for a cloud disk.<br>This optional parameter is only valid for ulTra SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD).
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Extra performance purchased for a cloud disk.<br>This optional parameter is only valid for ulTra SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD).
     * @param ThroughputPerformance Extra performance purchased for a cloud disk.<br>This optional parameter is only valid for ulTra SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD).
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Cloud disk size in GB. <br><li>`DiskSize` is not required if `SnapshotId` is specified. In this case, the size of the cloud disk will be equal to that of the snapshot. <br><li>If you specify both `SnapshotId` and `DiskSize`, the specified disk size cannot be smaller than the snapshot size. <br><li>For the value range of cloud disk size, see [Cloud Disk Types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). 
     * @return DiskSize Cloud disk size in GB. <br><li>`DiskSize` is not required if `SnapshotId` is specified. In this case, the size of the cloud disk will be equal to that of the snapshot. <br><li>If you specify both `SnapshotId` and `DiskSize`, the specified disk size cannot be smaller than the snapshot size. <br><li>For the value range of cloud disk size, see [Cloud Disk Types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1).
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size in GB. <br><li>`DiskSize` is not required if `SnapshotId` is specified. In this case, the size of the cloud disk will be equal to that of the snapshot. <br><li>If you specify both `SnapshotId` and `DiskSize`, the specified disk size cannot be smaller than the snapshot size. <br><li>For the value range of cloud disk size, see [Cloud Disk Types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1).
     * @param DiskSize Cloud disk size in GB. <br><li>`DiskSize` is not required if `SnapshotId` is specified. In this case, the size of the cloud disk will be equal to that of the snapshot. <br><li>If you specify both `SnapshotId` and `DiskSize`, the specified disk size cannot be smaller than the snapshot size. <br><li>For the value range of cloud disk size, see [Cloud Disk Types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1).
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Optional parameter. Default value: `False`. If `True` is specified, the new cloud disk will be shared. 
     * @return Shareable Optional parameter. Default value: `False`. If `True` is specified, the new cloud disk will be shared.
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set Optional parameter. Default value: `False`. If `True` is specified, the new cloud disk will be shared.
     * @param Shareable Optional parameter. Default value: `False`. If `True` is specified, the new cloud disk will be shared.
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get This parameter is used to create encrypted cloud disks. It is fixed at `ENCRYPT`. 
     * @return Encrypt This parameter is used to create encrypted cloud disks. It is fixed at `ENCRYPT`.
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set This parameter is used to create encrypted cloud disks. It is fixed at `ENCRYPT`.
     * @param Encrypt This parameter is used to create encrypted cloud disks. It is fixed at `ENCRYPT`.
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase attributes such as usage period and whether or not auto-renewal is set up can be specified using this parameter. <br>This parameter is required when creating a prepaid cloud disk. This parameter is not required when creating an hourly postpaid cloud disk.  
     * @return DiskChargePrepaid Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase attributes such as usage period and whether or not auto-renewal is set up can be specified using this parameter. <br>This parameter is required when creating a prepaid cloud disk. This parameter is not required when creating an hourly postpaid cloud disk. 
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase attributes such as usage period and whether or not auto-renewal is set up can be specified using this parameter. <br>This parameter is required when creating a prepaid cloud disk. This parameter is not required when creating an hourly postpaid cloud disk. 
     * @param DiskChargePrepaid Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase attributes such as usage period and whether or not auto-renewal is set up can be specified using this parameter. <br>This parameter is required when creating a prepaid cloud disk. This parameter is not required when creating an hourly postpaid cloud disk. 
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get Whether to delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default value). `1`: Yes. To check whether a snapshot is permanently reserved, see the `IsPermanent` field returned by the `DescribeSnapshots` API. 
     * @return DeleteSnapshot Whether to delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default value). `1`: Yes. To check whether a snapshot is permanently reserved, see the `IsPermanent` field returned by the `DescribeSnapshots` API.
     */
    public Long getDeleteSnapshot() {
        return this.DeleteSnapshot;
    }

    /**
     * Set Whether to delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default value). `1`: Yes. To check whether a snapshot is permanently reserved, see the `IsPermanent` field returned by the `DescribeSnapshots` API.
     * @param DeleteSnapshot Whether to delete the associated non-permanently reserved snapshots upon deletion of the source cloud disk. `0`: No (default value). `1`: Yes. To check whether a snapshot is permanently reserved, see the `IsPermanent` field returned by the `DescribeSnapshots` API.
     */
    public void setDeleteSnapshot(Long DeleteSnapshot) {
        this.DeleteSnapshot = DeleteSnapshot;
    }

    /**
     * Get Specifies whether to automatically attach and initialize the newly created data disk. 
     * @return AutoMountConfiguration Specifies whether to automatically attach and initialize the newly created data disk.
     */
    public AutoMountConfiguration getAutoMountConfiguration() {
        return this.AutoMountConfiguration;
    }

    /**
     * Set Specifies whether to automatically attach and initialize the newly created data disk.
     * @param AutoMountConfiguration Specifies whether to automatically attach and initialize the newly created data disk.
     */
    public void setAutoMountConfiguration(AutoMountConfiguration AutoMountConfiguration) {
        this.AutoMountConfiguration = AutoMountConfiguration;
    }

    /**
     * Get Specifies the cloud disk backup point quota. 
     * @return DiskBackupQuota Specifies the cloud disk backup point quota.
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set Specifies the cloud disk backup point quota.
     * @param DiskBackupQuota Specifies the cloud disk backup point quota.
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public CreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisksRequest(CreateDisksRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Shareable != null) {
            this.Shareable = new Boolean(source.Shareable);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DeleteSnapshot != null) {
            this.DeleteSnapshot = new Long(source.DeleteSnapshot);
        }
        if (source.AutoMountConfiguration != null) {
            this.AutoMountConfiguration = new AutoMountConfiguration(source.AutoMountConfiguration);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DeleteSnapshot", this.DeleteSnapshot);
        this.setParamObj(map, prefix + "AutoMountConfiguration.", this.AutoMountConfiguration);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

