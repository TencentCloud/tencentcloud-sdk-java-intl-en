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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

    /**
    * Data disk size, unit: GiB. the minimum adjustment step size is 10 GiB. the value ranges of different data disk types vary. for specific limitations, see the storage overview (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). the default value is 0, which means no data disk purchase. for more restrictions, see the product document.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Specifies the data disk type. for restrictions on data disk types, refer to [storage overview](https://www.tencentcloud.com/document/product/213/4952?from_cn_redirect=1). valid values: <br /><li>LOCAL_BASIC: LOCAL disk</li> <li>LOCAL_SSD: LOCAL SSD</li><li>LOCAL_NVME: LOCAL NVME disk, which is closely related to InstanceType and cannot be specified</li><li>LOCAL_PRO: LOCAL HDD, which is closely related to InstanceType and cannot be specified</li><li>cloud_BASIC: BASIC cloud disk</li><li>cloud_PREMIUM: high-performance cloud block storage</li><li>cloud_SSD: SSD cloud disk</li><li>cloud_HSSD: enhanced SSD cloud disk</li> <li>cloud_TSSD: ultra-fast SSD cbs</li><li>cloud_BSSD: universal SSD cloud disk</li><br />default: LOCAL_BASIC.<br/><br />this parameter is invalid for the `ResizeInstanceDisk` api.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specifies the data disk ID.
This parameter currently only serves as a response parameter for query apis such as `DescribeInstances`, and cannot be used as an input parameter for write apis such as `RunInstances`.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Whether the data disk is terminated with the instance. value range: <li>true: when the instance is terminated, the data disk is also terminated. only hourly postpaid cloud disks are supported. <li>false: when the instance is terminated, the data disk is retained. <br>default value: true <br>currently, this parameter is only used for the API `RunInstances`.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Data disk snapshot ID. the size of the selected data disk snapshot must be less than the data disk size.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Specifies whether the data disk is encrypted. value range: <li>true: encrypted</li> <li>false: unencrypted</li><br/> default value: false<br/> this parameter is currently only used for the `RunInstances` api.
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * Custom CMK ID, value is UUID or similar to kms-abcd1234. used for encrypted cloud disk.

This parameter is currently only used for the `RunInstances` api.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Cloud disk performance (unit: MiB/s). specifies additional performance for cloud disks.
Currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD).
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Burstable performance.

<B>Note: this field is in beta test.</b>.
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
    * Disk name, with a length not exceeding 128 characters.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get Data disk size, unit: GiB. the minimum adjustment step size is 10 GiB. the value ranges of different data disk types vary. for specific limitations, see the storage overview (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). the default value is 0, which means no data disk purchase. for more restrictions, see the product document. 
     * @return DiskSize Data disk size, unit: GiB. the minimum adjustment step size is 10 GiB. the value ranges of different data disk types vary. for specific limitations, see the storage overview (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). the default value is 0, which means no data disk purchase. for more restrictions, see the product document.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data disk size, unit: GiB. the minimum adjustment step size is 10 GiB. the value ranges of different data disk types vary. for specific limitations, see the storage overview (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). the default value is 0, which means no data disk purchase. for more restrictions, see the product document.
     * @param DiskSize Data disk size, unit: GiB. the minimum adjustment step size is 10 GiB. the value ranges of different data disk types vary. for specific limitations, see the storage overview (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). the default value is 0, which means no data disk purchase. for more restrictions, see the product document.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Specifies the data disk type. for restrictions on data disk types, refer to [storage overview](https://www.tencentcloud.com/document/product/213/4952?from_cn_redirect=1). valid values: <br /><li>LOCAL_BASIC: LOCAL disk</li> <li>LOCAL_SSD: LOCAL SSD</li><li>LOCAL_NVME: LOCAL NVME disk, which is closely related to InstanceType and cannot be specified</li><li>LOCAL_PRO: LOCAL HDD, which is closely related to InstanceType and cannot be specified</li><li>cloud_BASIC: BASIC cloud disk</li><li>cloud_PREMIUM: high-performance cloud block storage</li><li>cloud_SSD: SSD cloud disk</li><li>cloud_HSSD: enhanced SSD cloud disk</li> <li>cloud_TSSD: ultra-fast SSD cbs</li><li>cloud_BSSD: universal SSD cloud disk</li><br />default: LOCAL_BASIC.<br/><br />this parameter is invalid for the `ResizeInstanceDisk` api. 
     * @return DiskType Specifies the data disk type. for restrictions on data disk types, refer to [storage overview](https://www.tencentcloud.com/document/product/213/4952?from_cn_redirect=1). valid values: <br /><li>LOCAL_BASIC: LOCAL disk</li> <li>LOCAL_SSD: LOCAL SSD</li><li>LOCAL_NVME: LOCAL NVME disk, which is closely related to InstanceType and cannot be specified</li><li>LOCAL_PRO: LOCAL HDD, which is closely related to InstanceType and cannot be specified</li><li>cloud_BASIC: BASIC cloud disk</li><li>cloud_PREMIUM: high-performance cloud block storage</li><li>cloud_SSD: SSD cloud disk</li><li>cloud_HSSD: enhanced SSD cloud disk</li> <li>cloud_TSSD: ultra-fast SSD cbs</li><li>cloud_BSSD: universal SSD cloud disk</li><br />default: LOCAL_BASIC.<br/><br />this parameter is invalid for the `ResizeInstanceDisk` api.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Specifies the data disk type. for restrictions on data disk types, refer to [storage overview](https://www.tencentcloud.com/document/product/213/4952?from_cn_redirect=1). valid values: <br /><li>LOCAL_BASIC: LOCAL disk</li> <li>LOCAL_SSD: LOCAL SSD</li><li>LOCAL_NVME: LOCAL NVME disk, which is closely related to InstanceType and cannot be specified</li><li>LOCAL_PRO: LOCAL HDD, which is closely related to InstanceType and cannot be specified</li><li>cloud_BASIC: BASIC cloud disk</li><li>cloud_PREMIUM: high-performance cloud block storage</li><li>cloud_SSD: SSD cloud disk</li><li>cloud_HSSD: enhanced SSD cloud disk</li> <li>cloud_TSSD: ultra-fast SSD cbs</li><li>cloud_BSSD: universal SSD cloud disk</li><br />default: LOCAL_BASIC.<br/><br />this parameter is invalid for the `ResizeInstanceDisk` api.
     * @param DiskType Specifies the data disk type. for restrictions on data disk types, refer to [storage overview](https://www.tencentcloud.com/document/product/213/4952?from_cn_redirect=1). valid values: <br /><li>LOCAL_BASIC: LOCAL disk</li> <li>LOCAL_SSD: LOCAL SSD</li><li>LOCAL_NVME: LOCAL NVME disk, which is closely related to InstanceType and cannot be specified</li><li>LOCAL_PRO: LOCAL HDD, which is closely related to InstanceType and cannot be specified</li><li>cloud_BASIC: BASIC cloud disk</li><li>cloud_PREMIUM: high-performance cloud block storage</li><li>cloud_SSD: SSD cloud disk</li><li>cloud_HSSD: enhanced SSD cloud disk</li> <li>cloud_TSSD: ultra-fast SSD cbs</li><li>cloud_BSSD: universal SSD cloud disk</li><br />default: LOCAL_BASIC.<br/><br />this parameter is invalid for the `ResizeInstanceDisk` api.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specifies the data disk ID.
This parameter currently only serves as a response parameter for query apis such as `DescribeInstances`, and cannot be used as an input parameter for write apis such as `RunInstances`. 
     * @return DiskId Specifies the data disk ID.
This parameter currently only serves as a response parameter for query apis such as `DescribeInstances`, and cannot be used as an input parameter for write apis such as `RunInstances`.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Specifies the data disk ID.
This parameter currently only serves as a response parameter for query apis such as `DescribeInstances`, and cannot be used as an input parameter for write apis such as `RunInstances`.
     * @param DiskId Specifies the data disk ID.
This parameter currently only serves as a response parameter for query apis such as `DescribeInstances`, and cannot be used as an input parameter for write apis such as `RunInstances`.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Whether the data disk is terminated with the instance. value range: <li>true: when the instance is terminated, the data disk is also terminated. only hourly postpaid cloud disks are supported. <li>false: when the instance is terminated, the data disk is retained. <br>default value: true <br>currently, this parameter is only used for the API `RunInstances`. 
     * @return DeleteWithInstance Whether the data disk is terminated with the instance. value range: <li>true: when the instance is terminated, the data disk is also terminated. only hourly postpaid cloud disks are supported. <li>false: when the instance is terminated, the data disk is retained. <br>default value: true <br>currently, this parameter is only used for the API `RunInstances`.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether the data disk is terminated with the instance. value range: <li>true: when the instance is terminated, the data disk is also terminated. only hourly postpaid cloud disks are supported. <li>false: when the instance is terminated, the data disk is retained. <br>default value: true <br>currently, this parameter is only used for the API `RunInstances`.
     * @param DeleteWithInstance Whether the data disk is terminated with the instance. value range: <li>true: when the instance is terminated, the data disk is also terminated. only hourly postpaid cloud disks are supported. <li>false: when the instance is terminated, the data disk is retained. <br>default value: true <br>currently, this parameter is only used for the API `RunInstances`.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Data disk snapshot ID. the size of the selected data disk snapshot must be less than the data disk size. 
     * @return SnapshotId Data disk snapshot ID. the size of the selected data disk snapshot must be less than the data disk size.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Data disk snapshot ID. the size of the selected data disk snapshot must be less than the data disk size.
     * @param SnapshotId Data disk snapshot ID. the size of the selected data disk snapshot must be less than the data disk size.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Specifies whether the data disk is encrypted. value range: <li>true: encrypted</li> <li>false: unencrypted</li><br/> default value: false<br/> this parameter is currently only used for the `RunInstances` api. 
     * @return Encrypt Specifies whether the data disk is encrypted. value range: <li>true: encrypted</li> <li>false: unencrypted</li><br/> default value: false<br/> this parameter is currently only used for the `RunInstances` api.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Specifies whether the data disk is encrypted. value range: <li>true: encrypted</li> <li>false: unencrypted</li><br/> default value: false<br/> this parameter is currently only used for the `RunInstances` api.
     * @param Encrypt Specifies whether the data disk is encrypted. value range: <li>true: encrypted</li> <li>false: unencrypted</li><br/> default value: false<br/> this parameter is currently only used for the `RunInstances` api.
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Custom CMK ID, value is UUID or similar to kms-abcd1234. used for encrypted cloud disk.

This parameter is currently only used for the `RunInstances` api.
Note: This field may return null, indicating that no valid value is found. 
     * @return KmsKeyId Custom CMK ID, value is UUID or similar to kms-abcd1234. used for encrypted cloud disk.

This parameter is currently only used for the `RunInstances` api.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set Custom CMK ID, value is UUID or similar to kms-abcd1234. used for encrypted cloud disk.

This parameter is currently only used for the `RunInstances` api.
Note: This field may return null, indicating that no valid value is found.
     * @param KmsKeyId Custom CMK ID, value is UUID or similar to kms-abcd1234. used for encrypted cloud disk.

This parameter is currently only used for the `RunInstances` api.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Cloud disk performance (unit: MiB/s). specifies additional performance for cloud disks.
Currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD).
Note: This field may return null, indicating that no valid value is found. 
     * @return ThroughputPerformance Cloud disk performance (unit: MiB/s). specifies additional performance for cloud disks.
Currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD).
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Cloud disk performance (unit: MiB/s). specifies additional performance for cloud disks.
Currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD).
Note: This field may return null, indicating that no valid value is found.
     * @param ThroughputPerformance Cloud disk performance (unit: MiB/s). specifies additional performance for cloud disks.
Currently only supports extreme cbs (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD).
Note: This field may return null, indicating that no valid value is found.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found. 
     * @return CdcId Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found.
     * @param CdcId Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Burstable performance.

<B>Note: this field is in beta test.</b>. 
     * @return BurstPerformance Burstable performance.

<B>Note: this field is in beta test.</b>.
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set Burstable performance.

<B>Note: this field is in beta test.</b>.
     * @param BurstPerformance Burstable performance.

<B>Note: this field is in beta test.</b>.
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    /**
     * Get Disk name, with a length not exceeding 128 characters. 
     * @return DiskName Disk name, with a length not exceeding 128 characters.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Disk name, with a length not exceeding 128 characters.
     * @param DiskName Disk name, with a length not exceeding 128 characters.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.BurstPerformance != null) {
            this.BurstPerformance = new Boolean(source.BurstPerformance);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "BurstPerformance", this.BurstPerformance);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);

    }
}

