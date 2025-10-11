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

public class SystemDisk extends AbstractModel {

    /**
    * Specifies the system disk type. for the restrictions on the system disk type, refer to [storage overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). value range:<br>
<li>LOCAL_BASIC: Local SATA disk</li>
<li>LOCAL_SSD: Local NVMe SSD</li>
<li>CLOUD_BASIC: Cloud SATA disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium SSD</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: Tremendous SSD</li>
Default value: Current disk types with inventory available.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk ID.
Currently, this parameter is only used for response parameters in query apis such as [DescribeInstances](https://www.tencentcloud.comom/document/product/213/15728?from_cn_redirect=1) and is not applicable to request parameters in write apis such as [RunInstances](https://www.tencentcloud.comom/document/product/213/15730?from_cn_redirect=1).
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * System disk size; unit: GiB; default value: 50 GiB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Specifies the dedicated cluster ID belonging to.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Disk name, which specifies a length not exceeding 128 characters.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get Specifies the system disk type. for the restrictions on the system disk type, refer to [storage overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). value range:<br>
<li>LOCAL_BASIC: Local SATA disk</li>
<li>LOCAL_SSD: Local NVMe SSD</li>
<li>CLOUD_BASIC: Cloud SATA disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium SSD</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: Tremendous SSD</li>
Default value: Current disk types with inventory available. 
     * @return DiskType Specifies the system disk type. for the restrictions on the system disk type, refer to [storage overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). value range:<br>
<li>LOCAL_BASIC: Local SATA disk</li>
<li>LOCAL_SSD: Local NVMe SSD</li>
<li>CLOUD_BASIC: Cloud SATA disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium SSD</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: Tremendous SSD</li>
Default value: Current disk types with inventory available.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Specifies the system disk type. for the restrictions on the system disk type, refer to [storage overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). value range:<br>
<li>LOCAL_BASIC: Local SATA disk</li>
<li>LOCAL_SSD: Local NVMe SSD</li>
<li>CLOUD_BASIC: Cloud SATA disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium SSD</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: Tremendous SSD</li>
Default value: Current disk types with inventory available.
     * @param DiskType Specifies the system disk type. for the restrictions on the system disk type, refer to [storage overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). value range:<br>
<li>LOCAL_BASIC: Local SATA disk</li>
<li>LOCAL_SSD: Local NVMe SSD</li>
<li>CLOUD_BASIC: Cloud SATA disk</li>
<li>CLOUD_SSD: Cloud SSD</li>
<li>CLOUD_PREMIUM: Premium SSD</li>
<li>CLOUD_BSSD: Balanced SSD</li>
<li>CLOUD_HSSD: Enhanced SSD</li>
<li>CLOUD_TSSD: Tremendous SSD</li>
Default value: Current disk types with inventory available.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk ID.
Currently, this parameter is only used for response parameters in query apis such as [DescribeInstances](https://www.tencentcloud.comom/document/product/213/15728?from_cn_redirect=1) and is not applicable to request parameters in write apis such as [RunInstances](https://www.tencentcloud.comom/document/product/213/15730?from_cn_redirect=1). 
     * @return DiskId System disk ID.
Currently, this parameter is only used for response parameters in query apis such as [DescribeInstances](https://www.tencentcloud.comom/document/product/213/15728?from_cn_redirect=1) and is not applicable to request parameters in write apis such as [RunInstances](https://www.tencentcloud.comom/document/product/213/15730?from_cn_redirect=1).
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set System disk ID.
Currently, this parameter is only used for response parameters in query apis such as [DescribeInstances](https://www.tencentcloud.comom/document/product/213/15728?from_cn_redirect=1) and is not applicable to request parameters in write apis such as [RunInstances](https://www.tencentcloud.comom/document/product/213/15730?from_cn_redirect=1).
     * @param DiskId System disk ID.
Currently, this parameter is only used for response parameters in query apis such as [DescribeInstances](https://www.tencentcloud.comom/document/product/213/15728?from_cn_redirect=1) and is not applicable to request parameters in write apis such as [RunInstances](https://www.tencentcloud.comom/document/product/213/15730?from_cn_redirect=1).
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get System disk size; unit: GiB; default value: 50 GiB. 
     * @return DiskSize System disk size; unit: GiB; default value: 50 GiB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set System disk size; unit: GiB; default value: 50 GiB.
     * @param DiskSize System disk size; unit: GiB; default value: 50 GiB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
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
     * Get Disk name, which specifies a length not exceeding 128 characters. 
     * @return DiskName Disk name, which specifies a length not exceeding 128 characters.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Disk name, which specifies a length not exceeding 128 characters.
     * @param DiskName Disk name, which specifies a length not exceeding 128 characters.
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

