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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

    /**
    * Data disk size (in GB). The minimum adjustment increment is 10 GB. The value range varies by data disk type. For more information on limits, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). The default value is 0, indicating that no data disk is purchased. For more information, see the product documentation.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Data disk type. For the detailed restrictions on the data disk type, refer to [Storage Overview](https://cloud.tencent.com/document/product/213/4952). Valid values: <br /><li>LOCAL_BASIC: Local Disk <br /><li>LOCAL_SSD: Local SSD <br /><li>LOCAL_NVME: Local NVMe Disk, which is strongly related with InstanceType and can not be specified <br /><li>LOCAL_PRO: Local HDD, which is strongly related with InstanceType and can not be specified <br /><li>CLOUD_BASIC: Basic Cloud Disk <br /><li>CLOUD_PREMIUM: Premium Disk <br /><li>CLOUD_SSD: Cloud SSD <br /><li>CLOUD_HSSD: Enhanced SSD <br /><li>CLOUD_TSSD: Tremendous SSD <br /><li>CLOUD_BSSD: Balanced SSD <br /><br />Default value: LOCAL_BASIC. <br /><br />This parameter is invalid for the `ResizeInstanceDisk` API.</li></li></li> </li> </li></li></li></li></li></li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Data disk ID. Note that it's not available for `LOCAL_BASIC` and `LOCAL_SSD` disks.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Whether the data disk is terminated with the Cloud Virtual Machine (CVM). Valid values:

<li>true: Terminate the data disk when the CVM is terminated. Only the pay-as-you-go cloud disk billed by hour is supported.</li>
<li>
  false: Retain the data disk when the CVM is terminated.<br />
  Default value: true.<br />
  This parameter is currently only used for the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Data disk snapshot ID. The size of the selected data disk snapshot must be smaller than that of the data disk.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Whether a data disk is encrypted. Valid values:
<li>true: encrypted.</li>
<li>
  false: not encrypted.<br/>
  Default value: false.<br/>
  This parameter is currently used only in the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * ID of the custom CMK in the format of UUID or "kms-abcd1234". This parameter is used to encrypt cloud disks.

Currently, this parameter is only used in the `RunInstances` API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Cloud disk performance, in MB/s
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * ID of the dedicated cluster to which the instance belongs.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Burst performance.

 <b>Note: This field is in beta test.</b>
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
    * Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get Data disk size (in GB). The minimum adjustment increment is 10 GB. The value range varies by data disk type. For more information on limits, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). The default value is 0, indicating that no data disk is purchased. For more information, see the product documentation. 
     * @return DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. The value range varies by data disk type. For more information on limits, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). The default value is 0, indicating that no data disk is purchased. For more information, see the product documentation.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data disk size (in GB). The minimum adjustment increment is 10 GB. The value range varies by data disk type. For more information on limits, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). The default value is 0, indicating that no data disk is purchased. For more information, see the product documentation.
     * @param DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. The value range varies by data disk type. For more information on limits, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). The default value is 0, indicating that no data disk is purchased. For more information, see the product documentation.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Data disk type. For the detailed restrictions on the data disk type, refer to [Storage Overview](https://cloud.tencent.com/document/product/213/4952). Valid values: <br /><li>LOCAL_BASIC: Local Disk <br /><li>LOCAL_SSD: Local SSD <br /><li>LOCAL_NVME: Local NVMe Disk, which is strongly related with InstanceType and can not be specified <br /><li>LOCAL_PRO: Local HDD, which is strongly related with InstanceType and can not be specified <br /><li>CLOUD_BASIC: Basic Cloud Disk <br /><li>CLOUD_PREMIUM: Premium Disk <br /><li>CLOUD_SSD: Cloud SSD <br /><li>CLOUD_HSSD: Enhanced SSD <br /><li>CLOUD_TSSD: Tremendous SSD <br /><li>CLOUD_BSSD: Balanced SSD <br /><br />Default value: LOCAL_BASIC. <br /><br />This parameter is invalid for the `ResizeInstanceDisk` API.</li></li></li> </li> </li></li></li></li></li></li> 
     * @return DiskType Data disk type. For the detailed restrictions on the data disk type, refer to [Storage Overview](https://cloud.tencent.com/document/product/213/4952). Valid values: <br /><li>LOCAL_BASIC: Local Disk <br /><li>LOCAL_SSD: Local SSD <br /><li>LOCAL_NVME: Local NVMe Disk, which is strongly related with InstanceType and can not be specified <br /><li>LOCAL_PRO: Local HDD, which is strongly related with InstanceType and can not be specified <br /><li>CLOUD_BASIC: Basic Cloud Disk <br /><li>CLOUD_PREMIUM: Premium Disk <br /><li>CLOUD_SSD: Cloud SSD <br /><li>CLOUD_HSSD: Enhanced SSD <br /><li>CLOUD_TSSD: Tremendous SSD <br /><li>CLOUD_BSSD: Balanced SSD <br /><br />Default value: LOCAL_BASIC. <br /><br />This parameter is invalid for the `ResizeInstanceDisk` API.</li></li></li> </li> </li></li></li></li></li></li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Data disk type. For the detailed restrictions on the data disk type, refer to [Storage Overview](https://cloud.tencent.com/document/product/213/4952). Valid values: <br /><li>LOCAL_BASIC: Local Disk <br /><li>LOCAL_SSD: Local SSD <br /><li>LOCAL_NVME: Local NVMe Disk, which is strongly related with InstanceType and can not be specified <br /><li>LOCAL_PRO: Local HDD, which is strongly related with InstanceType and can not be specified <br /><li>CLOUD_BASIC: Basic Cloud Disk <br /><li>CLOUD_PREMIUM: Premium Disk <br /><li>CLOUD_SSD: Cloud SSD <br /><li>CLOUD_HSSD: Enhanced SSD <br /><li>CLOUD_TSSD: Tremendous SSD <br /><li>CLOUD_BSSD: Balanced SSD <br /><br />Default value: LOCAL_BASIC. <br /><br />This parameter is invalid for the `ResizeInstanceDisk` API.</li></li></li> </li> </li></li></li></li></li></li>
     * @param DiskType Data disk type. For the detailed restrictions on the data disk type, refer to [Storage Overview](https://cloud.tencent.com/document/product/213/4952). Valid values: <br /><li>LOCAL_BASIC: Local Disk <br /><li>LOCAL_SSD: Local SSD <br /><li>LOCAL_NVME: Local NVMe Disk, which is strongly related with InstanceType and can not be specified <br /><li>LOCAL_PRO: Local HDD, which is strongly related with InstanceType and can not be specified <br /><li>CLOUD_BASIC: Basic Cloud Disk <br /><li>CLOUD_PREMIUM: Premium Disk <br /><li>CLOUD_SSD: Cloud SSD <br /><li>CLOUD_HSSD: Enhanced SSD <br /><li>CLOUD_TSSD: Tremendous SSD <br /><li>CLOUD_BSSD: Balanced SSD <br /><br />Default value: LOCAL_BASIC. <br /><br />This parameter is invalid for the `ResizeInstanceDisk` API.</li></li></li> </li> </li></li></li></li></li></li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Data disk ID. Note that it's not available for `LOCAL_BASIC` and `LOCAL_SSD` disks.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`. 
     * @return DiskId Data disk ID. Note that it's not available for `LOCAL_BASIC` and `LOCAL_SSD` disks.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Data disk ID. Note that it's not available for `LOCAL_BASIC` and `LOCAL_SSD` disks.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     * @param DiskId Data disk ID. Note that it's not available for `LOCAL_BASIC` and `LOCAL_SSD` disks.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Whether the data disk is terminated with the Cloud Virtual Machine (CVM). Valid values:

<li>true: Terminate the data disk when the CVM is terminated. Only the pay-as-you-go cloud disk billed by hour is supported.</li>
<li>
  false: Retain the data disk when the CVM is terminated.<br />
  Default value: true.<br />
  This parameter is currently only used for the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found. 
     * @return DeleteWithInstance Whether the data disk is terminated with the Cloud Virtual Machine (CVM). Valid values:

<li>true: Terminate the data disk when the CVM is terminated. Only the pay-as-you-go cloud disk billed by hour is supported.</li>
<li>
  false: Retain the data disk when the CVM is terminated.<br />
  Default value: true.<br />
  This parameter is currently only used for the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether the data disk is terminated with the Cloud Virtual Machine (CVM). Valid values:

<li>true: Terminate the data disk when the CVM is terminated. Only the pay-as-you-go cloud disk billed by hour is supported.</li>
<li>
  false: Retain the data disk when the CVM is terminated.<br />
  Default value: true.<br />
  This parameter is currently only used for the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     * @param DeleteWithInstance Whether the data disk is terminated with the Cloud Virtual Machine (CVM). Valid values:

<li>true: Terminate the data disk when the CVM is terminated. Only the pay-as-you-go cloud disk billed by hour is supported.</li>
<li>
  false: Retain the data disk when the CVM is terminated.<br />
  Default value: true.<br />
  This parameter is currently only used for the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Data disk snapshot ID. The size of the selected data disk snapshot must be smaller than that of the data disk.
Note: This field may return null, indicating that no valid value is found. 
     * @return SnapshotId Data disk snapshot ID. The size of the selected data disk snapshot must be smaller than that of the data disk.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Data disk snapshot ID. The size of the selected data disk snapshot must be smaller than that of the data disk.
Note: This field may return null, indicating that no valid value is found.
     * @param SnapshotId Data disk snapshot ID. The size of the selected data disk snapshot must be smaller than that of the data disk.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Whether a data disk is encrypted. Valid values:
<li>true: encrypted.</li>
<li>
  false: not encrypted.<br/>
  Default value: false.<br/>
  This parameter is currently used only in the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found. 
     * @return Encrypt Whether a data disk is encrypted. Valid values:
<li>true: encrypted.</li>
<li>
  false: not encrypted.<br/>
  Default value: false.<br/>
  This parameter is currently used only in the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether a data disk is encrypted. Valid values:
<li>true: encrypted.</li>
<li>
  false: not encrypted.<br/>
  Default value: false.<br/>
  This parameter is currently used only in the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     * @param Encrypt Whether a data disk is encrypted. Valid values:
<li>true: encrypted.</li>
<li>
  false: not encrypted.<br/>
  Default value: false.<br/>
  This parameter is currently used only in the `RunInstances` API.
</li>
Note: This field may return null, indicating that no valid value is found.
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get ID of the custom CMK in the format of UUID or "kms-abcd1234". This parameter is used to encrypt cloud disks.

Currently, this parameter is only used in the `RunInstances` API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KmsKeyId ID of the custom CMK in the format of UUID or "kms-abcd1234". This parameter is used to encrypt cloud disks.

Currently, this parameter is only used in the `RunInstances` API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set ID of the custom CMK in the format of UUID or "kms-abcd1234". This parameter is used to encrypt cloud disks.

Currently, this parameter is only used in the `RunInstances` API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KmsKeyId ID of the custom CMK in the format of UUID or "kms-abcd1234". This parameter is used to encrypt cloud disks.

Currently, this parameter is only used in the `RunInstances` API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Cloud disk performance, in MB/s
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ThroughputPerformance Cloud disk performance, in MB/s
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Cloud disk performance, in MB/s
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ThroughputPerformance Cloud disk performance, in MB/s
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get ID of the dedicated cluster to which the instance belongs.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CdcId ID of the dedicated cluster to which the instance belongs.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set ID of the dedicated cluster to which the instance belongs.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CdcId ID of the dedicated cluster to which the instance belongs.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Burst performance.

 <b>Note: This field is in beta test.</b>
Note: This field may return null, indicating that no valid value is found. 
     * @return BurstPerformance Burst performance.

 <b>Note: This field is in beta test.</b>
Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set Burst performance.

 <b>Note: This field is in beta test.</b>
Note: This field may return null, indicating that no valid value is found.
     * @param BurstPerformance Burst performance.

 <b>Note: This field is in beta test.</b>
Note: This field may return null, indicating that no valid value is found.
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    /**
     * Get Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use. 
     * @return DiskName Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
     * @param DiskName Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
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

