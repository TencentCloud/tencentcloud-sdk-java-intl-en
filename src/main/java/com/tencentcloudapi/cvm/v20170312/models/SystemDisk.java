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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel{

    /**
    * System disk type. For more information on limits of system disk types, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Valid values:<br><li>LOCAL_BASIC: local disk<br><li>LOCAL_SSD: local SSD disk<br><li>CLOUD_BASIC: HDD cloud disk<br><li>CLOUD_SSD: SSD<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>The disk type currently in stock will be used by default. 
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter currently.
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
     * Get System disk type. For more information on limits of system disk types, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Valid values:<br><li>LOCAL_BASIC: local disk<br><li>LOCAL_SSD: local SSD disk<br><li>CLOUD_BASIC: HDD cloud disk<br><li>CLOUD_SSD: SSD<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>The disk type currently in stock will be used by default.  
     * @return DiskType System disk type. For more information on limits of system disk types, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Valid values:<br><li>LOCAL_BASIC: local disk<br><li>LOCAL_SSD: local SSD disk<br><li>CLOUD_BASIC: HDD cloud disk<br><li>CLOUD_SSD: SSD<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>The disk type currently in stock will be used by default. 
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set System disk type. For more information on limits of system disk types, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Valid values:<br><li>LOCAL_BASIC: local disk<br><li>LOCAL_SSD: local SSD disk<br><li>CLOUD_BASIC: HDD cloud disk<br><li>CLOUD_SSD: SSD<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>The disk type currently in stock will be used by default. 
     * @param DiskType System disk type. For more information on limits of system disk types, see [Storage Overview](https://intl.cloud.tencent.com/document/product/213/4952?from_cn_redirect=1). Valid values:<br><li>LOCAL_BASIC: local disk<br><li>LOCAL_SSD: local SSD disk<br><li>CLOUD_BASIC: HDD cloud disk<br><li>CLOUD_SSD: SSD<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>The disk type currently in stock will be used by default. 
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter currently. 
     * @return DiskId System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter currently.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter currently.
     * @param DiskId System disk ID. System disks whose type is `LOCAL_BASIC` or `LOCAL_SSD` do not have an ID and do not support this parameter currently.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

