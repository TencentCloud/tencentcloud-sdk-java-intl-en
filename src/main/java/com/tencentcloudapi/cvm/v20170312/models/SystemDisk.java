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

public class SystemDisk extends AbstractModel {

    /**
    * System disk type. For the restrictions on the system disk type, refer to [Storage Overview] (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Value range:<br>
<li>LOCAL_BASIC: Local Disk</li>
<li>LOCAL_SSD: Local SSD Disk</li>
<li>CLOUD_BASIC: HDD Cloud Disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: ulTra SSD</li><br>
Default value: Current disk types with inventory available.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * System disk size; unit: GB; default value: 50 GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ID of the dedicated cluster to which the instance belongs.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get System disk type. For the restrictions on the system disk type, refer to [Storage Overview] (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Value range:<br>
<li>LOCAL_BASIC: Local Disk</li>
<li>LOCAL_SSD: Local SSD Disk</li>
<li>CLOUD_BASIC: HDD Cloud Disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: ulTra SSD</li><br>
Default value: Current disk types with inventory available. 
     * @return DiskType System disk type. For the restrictions on the system disk type, refer to [Storage Overview] (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Value range:<br>
<li>LOCAL_BASIC: Local Disk</li>
<li>LOCAL_SSD: Local SSD Disk</li>
<li>CLOUD_BASIC: HDD Cloud Disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: ulTra SSD</li><br>
Default value: Current disk types with inventory available.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set System disk type. For the restrictions on the system disk type, refer to [Storage Overview] (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Value range:<br>
<li>LOCAL_BASIC: Local Disk</li>
<li>LOCAL_SSD: Local SSD Disk</li>
<li>CLOUD_BASIC: HDD Cloud Disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: ulTra SSD</li><br>
Default value: Current disk types with inventory available.
     * @param DiskType System disk type. For the restrictions on the system disk type, refer to [Storage Overview] (https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Value range:<br>
<li>LOCAL_BASIC: Local Disk</li>
<li>LOCAL_SSD: Local SSD Disk</li>
<li>CLOUD_BASIC: HDD Cloud Disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium Cloud Disk</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: ulTra SSD</li><br>
Default value: Current disk types with inventory available.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`. 
     * @return DiskId System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     * @param DiskId System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter.
It is only used as a response parameter for APIs such as `DescribeInstances`, and cannot be used as a request parameter for APIs such as `RunInstances`.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get System disk size; unit: GB; default value: 50 GB. 
     * @return DiskSize System disk size; unit: GB; default value: 50 GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set System disk size; unit: GB; default value: 50 GB.
     * @param DiskSize System disk size; unit: GB; default value: 50 GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ID of the dedicated cluster to which the instance belongs. 
     * @return CdcId ID of the dedicated cluster to which the instance belongs.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set ID of the dedicated cluster to which the instance belongs.
     * @param CdcId ID of the dedicated cluster to which the instance belongs.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
Note: This field may return null, indicating that no valid value is found. 
     * @return DiskName Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
Note: This field may return null, indicating that no valid value is found.
     * @param DiskName Disk name, with a length of not more than 128 characters.

This parameter is in invite-only testing and is not yet open for use.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    public SystemDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemDisk(SystemDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);

    }
}

