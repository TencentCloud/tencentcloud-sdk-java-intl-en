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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisksRequest extends AbstractModel {

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
    * Hard disk media type. valid values:<br><li>CLOUD_PREMIUM: indicates high-performance CLOUD block storage</li><br><li>CLOUD_BSSD: indicates universal type SSD CLOUD disk</li><br><li>CLOUD_SSD: indicates SSD CLOUD disk</li><br><li>CLOUD_HSSD: indicates enhanced SSD CLOUD disk</li><br><li>CLOUD_TSSD: indicates ultra-fast SSD cbs.</li>ultra-fast SSD CBS (CLOUD_TSSD) is only supported when purchased with some instances and not currently supported for separate creation.
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
    * Use this parameter to purchase additional performance for CLOUD disk in MB/s.<br>currently, only extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) are supported.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Custom key for purchasing encrypted disks. when this parameter is input, the Encrypt parameter cannot be empty.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Cloud disk size in GiB. <li>if `SnapshotId` is input, `DiskSize` can be omitted. at this point, the new cloud disk size will be the snapshot size.</li> <li>if both `SnapshotId` and `DiskSize` are input, the cloud disk size must be greater than or equal to the snapshot size.</li> <li>for the cloud disk size range, please refer to the [product type](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1) of cloud block storage.</li>.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * When True is entered, the cloud disk will be created as a shared cloud disk. default is False. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Encrypt parameter.
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
    * This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Shareable parameter.
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * Delete associated non-permanently retained snapshots when destroying the cloud disk. 0 means non-permanent snapshots are not deleted with cloud disk destruction, 1 means non-permanent snapshots are deleted with cloud disk destruction. default value is 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the [DescribeSnapshots](https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1) api. True represents a permanent snapshot, False represents a non-permanent snapshot.
    */
    @SerializedName("DeleteSnapshot")
    @Expose
    private Long DeleteSnapshot;

    /**
    * Specifies auto mount and initialization of the data disk when creating a cloud disk. this parameter cannot be imported simultaneously with the Encrypt parameter because encrypted disks do not support auto mount or initialization.
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
    * Specifies whether to enable burst performance when creating a CLOUD disk. currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with CLOUD disk size greater than or equal to 460GiB.
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
    * Specifies the CBS encryption type. valid values are ENCRYPT_V1 and ENCRYPT_V2, representing first generation and second generation encryption technology respectively. the two encryption technologies are incompatible. it is recommended to prioritize using second generation encryption technology ENCRYPT_V2. first generation encryption is only supported on some outdated models. this parameter is valid only when creating an encrypted cloud disk.
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

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
     * Get Hard disk media type. valid values:<br><li>CLOUD_PREMIUM: indicates high-performance CLOUD block storage</li><br><li>CLOUD_BSSD: indicates universal type SSD CLOUD disk</li><br><li>CLOUD_SSD: indicates SSD CLOUD disk</li><br><li>CLOUD_HSSD: indicates enhanced SSD CLOUD disk</li><br><li>CLOUD_TSSD: indicates ultra-fast SSD cbs.</li>ultra-fast SSD CBS (CLOUD_TSSD) is only supported when purchased with some instances and not currently supported for separate creation. 
     * @return DiskType Hard disk media type. valid values:<br><li>CLOUD_PREMIUM: indicates high-performance CLOUD block storage</li><br><li>CLOUD_BSSD: indicates universal type SSD CLOUD disk</li><br><li>CLOUD_SSD: indicates SSD CLOUD disk</li><br><li>CLOUD_HSSD: indicates enhanced SSD CLOUD disk</li><br><li>CLOUD_TSSD: indicates ultra-fast SSD cbs.</li>ultra-fast SSD CBS (CLOUD_TSSD) is only supported when purchased with some instances and not currently supported for separate creation.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Hard disk media type. valid values:<br><li>CLOUD_PREMIUM: indicates high-performance CLOUD block storage</li><br><li>CLOUD_BSSD: indicates universal type SSD CLOUD disk</li><br><li>CLOUD_SSD: indicates SSD CLOUD disk</li><br><li>CLOUD_HSSD: indicates enhanced SSD CLOUD disk</li><br><li>CLOUD_TSSD: indicates ultra-fast SSD cbs.</li>ultra-fast SSD CBS (CLOUD_TSSD) is only supported when purchased with some instances and not currently supported for separate creation.
     * @param DiskType Hard disk media type. valid values:<br><li>CLOUD_PREMIUM: indicates high-performance CLOUD block storage</li><br><li>CLOUD_BSSD: indicates universal type SSD CLOUD disk</li><br><li>CLOUD_SSD: indicates SSD CLOUD disk</li><br><li>CLOUD_HSSD: indicates enhanced SSD CLOUD disk</li><br><li>CLOUD_TSSD: indicates ultra-fast SSD cbs.</li>ultra-fast SSD CBS (CLOUD_TSSD) is only supported when purchased with some instances and not currently supported for separate creation.
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
     * Get Use this parameter to purchase additional performance for CLOUD disk in MB/s.<br>currently, only extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) are supported. 
     * @return ThroughputPerformance Use this parameter to purchase additional performance for CLOUD disk in MB/s.<br>currently, only extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) are supported.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Use this parameter to purchase additional performance for CLOUD disk in MB/s.<br>currently, only extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) are supported.
     * @param ThroughputPerformance Use this parameter to purchase additional performance for CLOUD disk in MB/s.<br>currently, only extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) are supported.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Custom key for purchasing encrypted disks. when this parameter is input, the Encrypt parameter cannot be empty. 
     * @return KmsKeyId Custom key for purchasing encrypted disks. when this parameter is input, the Encrypt parameter cannot be empty.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Custom key for purchasing encrypted disks. when this parameter is input, the Encrypt parameter cannot be empty.
     * @param KmsKeyId Custom key for purchasing encrypted disks. when this parameter is input, the Encrypt parameter cannot be empty.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Cloud disk size in GiB. <li>if `SnapshotId` is input, `DiskSize` can be omitted. at this point, the new cloud disk size will be the snapshot size.</li> <li>if both `SnapshotId` and `DiskSize` are input, the cloud disk size must be greater than or equal to the snapshot size.</li> <li>for the cloud disk size range, please refer to the [product type](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1) of cloud block storage.</li>. 
     * @return DiskSize Cloud disk size in GiB. <li>if `SnapshotId` is input, `DiskSize` can be omitted. at this point, the new cloud disk size will be the snapshot size.</li> <li>if both `SnapshotId` and `DiskSize` are input, the cloud disk size must be greater than or equal to the snapshot size.</li> <li>for the cloud disk size range, please refer to the [product type](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1) of cloud block storage.</li>.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size in GiB. <li>if `SnapshotId` is input, `DiskSize` can be omitted. at this point, the new cloud disk size will be the snapshot size.</li> <li>if both `SnapshotId` and `DiskSize` are input, the cloud disk size must be greater than or equal to the snapshot size.</li> <li>for the cloud disk size range, please refer to the [product type](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1) of cloud block storage.</li>.
     * @param DiskSize Cloud disk size in GiB. <li>if `SnapshotId` is input, `DiskSize` can be omitted. at this point, the new cloud disk size will be the snapshot size.</li> <li>if both `SnapshotId` and `DiskSize` are input, the cloud disk size must be greater than or equal to the snapshot size.</li> <li>for the cloud disk size range, please refer to the [product type](https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1) of cloud block storage.</li>.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get When True is entered, the cloud disk will be created as a shared cloud disk. default is False. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Encrypt parameter. 
     * @return Shareable When True is entered, the cloud disk will be created as a shared cloud disk. default is False. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Encrypt parameter.
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set When True is entered, the cloud disk will be created as a shared cloud disk. default is False. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Encrypt parameter.
     * @param Shareable When True is entered, the cloud disk will be created as a shared cloud disk. default is False. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Encrypt parameter.
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
     * Get This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Shareable parameter. 
     * @return Encrypt This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Shareable parameter.
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Shareable parameter.
     * @param Encrypt This parameter is used to create an encrypted cloud disk, with the value fixed as ENCRYPT. since shared cloud disk does not support encryption, this parameter cannot be imported simultaneously with the Shareable parameter.
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk. 
     * @return DiskChargePrepaid Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     * @param DiskChargePrepaid Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get Delete associated non-permanently retained snapshots when destroying the cloud disk. 0 means non-permanent snapshots are not deleted with cloud disk destruction, 1 means non-permanent snapshots are deleted with cloud disk destruction. default value is 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the [DescribeSnapshots](https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1) api. True represents a permanent snapshot, False represents a non-permanent snapshot. 
     * @return DeleteSnapshot Delete associated non-permanently retained snapshots when destroying the cloud disk. 0 means non-permanent snapshots are not deleted with cloud disk destruction, 1 means non-permanent snapshots are deleted with cloud disk destruction. default value is 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the [DescribeSnapshots](https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1) api. True represents a permanent snapshot, False represents a non-permanent snapshot.
     */
    public Long getDeleteSnapshot() {
        return this.DeleteSnapshot;
    }

    /**
     * Set Delete associated non-permanently retained snapshots when destroying the cloud disk. 0 means non-permanent snapshots are not deleted with cloud disk destruction, 1 means non-permanent snapshots are deleted with cloud disk destruction. default value is 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the [DescribeSnapshots](https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1) api. True represents a permanent snapshot, False represents a non-permanent snapshot.
     * @param DeleteSnapshot Delete associated non-permanently retained snapshots when destroying the cloud disk. 0 means non-permanent snapshots are not deleted with cloud disk destruction, 1 means non-permanent snapshots are deleted with cloud disk destruction. default value is 0. whether a snapshot is permanently retained can be determined through the IsPermanent field in the snapshot description returned by the [DescribeSnapshots](https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1) api. True represents a permanent snapshot, False represents a non-permanent snapshot.
     */
    public void setDeleteSnapshot(Long DeleteSnapshot) {
        this.DeleteSnapshot = DeleteSnapshot;
    }

    /**
     * Get Specifies auto mount and initialization of the data disk when creating a cloud disk. this parameter cannot be imported simultaneously with the Encrypt parameter because encrypted disks do not support auto mount or initialization. 
     * @return AutoMountConfiguration Specifies auto mount and initialization of the data disk when creating a cloud disk. this parameter cannot be imported simultaneously with the Encrypt parameter because encrypted disks do not support auto mount or initialization.
     */
    public AutoMountConfiguration getAutoMountConfiguration() {
        return this.AutoMountConfiguration;
    }

    /**
     * Set Specifies auto mount and initialization of the data disk when creating a cloud disk. this parameter cannot be imported simultaneously with the Encrypt parameter because encrypted disks do not support auto mount or initialization.
     * @param AutoMountConfiguration Specifies auto mount and initialization of the data disk when creating a cloud disk. this parameter cannot be imported simultaneously with the Encrypt parameter because encrypted disks do not support auto mount or initialization.
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

    /**
     * Get Specifies whether to enable burst performance when creating a CLOUD disk. currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with CLOUD disk size greater than or equal to 460GiB. 
     * @return BurstPerformance Specifies whether to enable burst performance when creating a CLOUD disk. currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with CLOUD disk size greater than or equal to 460GiB.
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set Specifies whether to enable burst performance when creating a CLOUD disk. currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with CLOUD disk size greater than or equal to 460GiB.
     * @param BurstPerformance Specifies whether to enable burst performance when creating a CLOUD disk. currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with CLOUD disk size greater than or equal to 460GiB.
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    /**
     * Get Specifies the CBS encryption type. valid values are ENCRYPT_V1 and ENCRYPT_V2, representing first generation and second generation encryption technology respectively. the two encryption technologies are incompatible. it is recommended to prioritize using second generation encryption technology ENCRYPT_V2. first generation encryption is only supported on some outdated models. this parameter is valid only when creating an encrypted cloud disk. 
     * @return EncryptType Specifies the CBS encryption type. valid values are ENCRYPT_V1 and ENCRYPT_V2, representing first generation and second generation encryption technology respectively. the two encryption technologies are incompatible. it is recommended to prioritize using second generation encryption technology ENCRYPT_V2. first generation encryption is only supported on some outdated models. this parameter is valid only when creating an encrypted cloud disk.
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set Specifies the CBS encryption type. valid values are ENCRYPT_V1 and ENCRYPT_V2, representing first generation and second generation encryption technology respectively. the two encryption technologies are incompatible. it is recommended to prioritize using second generation encryption technology ENCRYPT_V2. first generation encryption is only supported on some outdated models. this parameter is valid only when creating an encrypted cloud disk.
     * @param EncryptType Specifies the CBS encryption type. valid values are ENCRYPT_V1 and ENCRYPT_V2, representing first generation and second generation encryption technology respectively. the two encryption technologies are incompatible. it is recommended to prioritize using second generation encryption technology ENCRYPT_V2. first generation encryption is only supported on some outdated models. this parameter is valid only when creating an encrypted cloud disk.
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
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
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
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
        if (source.BurstPerformance != null) {
            this.BurstPerformance = new Boolean(source.BurstPerformance);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
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
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DeleteSnapshot", this.DeleteSnapshot);
        this.setParamObj(map, prefix + "AutoMountConfiguration.", this.AutoMountConfiguration);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);
        this.setParamSimple(map, prefix + "BurstPerformance", this.BurstPerformance);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);

    }
}

