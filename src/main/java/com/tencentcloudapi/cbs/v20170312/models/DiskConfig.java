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

public class DiskConfig extends AbstractModel{

    /**
    * Whether the configuration is available.
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk type. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * The maximum configurable cloud disk size (in GB).
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * The minimum configurable cloud disk size (in GB).
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * The [Availability Region](/document/product/213/15753#ZoneInfo) of the cloud drive.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance model.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * Instance model series. For more information, please see [Instance Models](https://cloud.tencent.com/document/product/213/11518)
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * Get Whether the configuration is available. 
     * @return Available Whether the configuration is available.
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set Whether the configuration is available.
     * @param Available Whether the configuration is available.
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk. 
     * @return DiskType Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     * @param DiskType Type of cloud disk medium. Value range: <br><li>CLOUD_BASIC: Ordinary cloud disk <br><li>CLOUD_PREMIUM: Premium cloud storage <br><li>CLOUD_SSD: SSD cloud disk.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk type. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk. 
     * @return DiskUsage Cloud disk type. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud disk type. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     * @param DiskUsage Cloud disk type. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go. 
     * @return DiskChargeType Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     * @param DiskChargeType Billing method. Value range: <br><li>PREPAID: Prepaid, that is, monthly subscription<br><li>POSTPAID_BY_HOUR: Postpaid, that is, pay as you go.
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get The maximum configurable cloud disk size (in GB). 
     * @return MaxDiskSize The maximum configurable cloud disk size (in GB).
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set The maximum configurable cloud disk size (in GB).
     * @param MaxDiskSize The maximum configurable cloud disk size (in GB).
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get The minimum configurable cloud disk size (in GB). 
     * @return MinDiskSize The minimum configurable cloud disk size (in GB).
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set The minimum configurable cloud disk size (in GB).
     * @param MinDiskSize The minimum configurable cloud disk size (in GB).
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get The [Availability Region](/document/product/213/15753#ZoneInfo) of the cloud drive. 
     * @return Zone The [Availability Region](/document/product/213/15753#ZoneInfo) of the cloud drive.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The [Availability Region](/document/product/213/15753#ZoneInfo) of the cloud drive.
     * @param Zone The [Availability Region](/document/product/213/15753#ZoneInfo) of the cloud drive.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance model.
Note: This field may return null, indicating that no valid value was found. 
     * @return DeviceClass Instance model.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set Instance model.
Note: This field may return null, indicating that no valid value was found.
     * @param DeviceClass Instance model.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get Instance model series. For more information, please see [Instance Models](https://cloud.tencent.com/document/product/213/11518)
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceFamily Instance model series. For more information, please see [Instance Models](https://cloud.tencent.com/document/product/213/11518)
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance model series. For more information, please see [Instance Models](https://cloud.tencent.com/document/product/213/11518)
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceFamily Instance model series. For more information, please see [Instance Models](https://cloud.tencent.com/document/product/213/11518)
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

