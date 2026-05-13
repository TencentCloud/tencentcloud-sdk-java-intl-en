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

public class DiskConfig extends AbstractModel {

    /**
    * Whether the configuration is available.
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><br><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * The [Availability Region](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) of the cloud drive.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance model series. For more information, please see [Instance Models](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Cloud disk media type. valid values: <br>.
CLOUD_BASIC: specifies the BASIC CLOUD disk.
CLOUD_PREMIUM: indicates high-performance CLOUD block storage.
CLOUD_BSSD: indicates a universal type SSD CLOUD disk.
CLOUD_SSD: indicates SSD CLOUD disk.
CLOUD_HSSD: indicates the enhanced SSD CLOUD disk.
CLOUD_TSSD: indicates ultra-fast ssd cbs.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specifies the minimum step size for disk size change in GiB.
    */
    @SerializedName("StepSize")
    @Expose
    private Long StepSize;

    /**
    * Additional performance range.
Note: This field might return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraPerformanceRange")
    @Expose
    private Long [] ExtraPerformanceRange;

    /**
    * Instance model.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><br><li>DATA_DISK: DATA DISK.</li>.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Specifies the minimum configurable cloud disk size in GiB.
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * Specifies the maximum configurable cloud disk size in GiB.
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * Price of a prepaid or postpaid cloud disk.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

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
     * Get Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><br><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>. 
     * @return DiskChargeType Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><br><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><br><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
     * @param DiskChargeType Payment mode. valid values: <br><li>PREPAID: PREPAID, i.e. monthly subscription</li><br><li>POSTPAID_BY_HOUR: POSTPAID, i.e. pay-as-you-go.</li>.
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get The [Availability Region](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) of the cloud drive. 
     * @return Zone The [Availability Region](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) of the cloud drive.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The [Availability Region](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) of the cloud drive.
     * @param Zone The [Availability Region](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) of the cloud drive.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance model series. For more information, please see [Instance Models](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceFamily Instance model series. For more information, please see [Instance Models](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance model series. For more information, please see [Instance Models](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceFamily Instance model series. For more information, please see [Instance Models](https://intl.cloud.tencent.com/document/product/213/11518?from_cn_redirect=1)
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Cloud disk media type. valid values: <br>.
CLOUD_BASIC: specifies the BASIC CLOUD disk.
CLOUD_PREMIUM: indicates high-performance CLOUD block storage.
CLOUD_BSSD: indicates a universal type SSD CLOUD disk.
CLOUD_SSD: indicates SSD CLOUD disk.
CLOUD_HSSD: indicates the enhanced SSD CLOUD disk.
CLOUD_TSSD: indicates ultra-fast ssd cbs. 
     * @return DiskType Cloud disk media type. valid values: <br>.
CLOUD_BASIC: specifies the BASIC CLOUD disk.
CLOUD_PREMIUM: indicates high-performance CLOUD block storage.
CLOUD_BSSD: indicates a universal type SSD CLOUD disk.
CLOUD_SSD: indicates SSD CLOUD disk.
CLOUD_HSSD: indicates the enhanced SSD CLOUD disk.
CLOUD_TSSD: indicates ultra-fast ssd cbs.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk media type. valid values: <br>.
CLOUD_BASIC: specifies the BASIC CLOUD disk.
CLOUD_PREMIUM: indicates high-performance CLOUD block storage.
CLOUD_BSSD: indicates a universal type SSD CLOUD disk.
CLOUD_SSD: indicates SSD CLOUD disk.
CLOUD_HSSD: indicates the enhanced SSD CLOUD disk.
CLOUD_TSSD: indicates ultra-fast ssd cbs.
     * @param DiskType Cloud disk media type. valid values: <br>.
CLOUD_BASIC: specifies the BASIC CLOUD disk.
CLOUD_PREMIUM: indicates high-performance CLOUD block storage.
CLOUD_BSSD: indicates a universal type SSD CLOUD disk.
CLOUD_SSD: indicates SSD CLOUD disk.
CLOUD_HSSD: indicates the enhanced SSD CLOUD disk.
CLOUD_TSSD: indicates ultra-fast ssd cbs.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specifies the minimum step size for disk size change in GiB. 
     * @return StepSize Specifies the minimum step size for disk size change in GiB.
     */
    public Long getStepSize() {
        return this.StepSize;
    }

    /**
     * Set Specifies the minimum step size for disk size change in GiB.
     * @param StepSize Specifies the minimum step size for disk size change in GiB.
     */
    public void setStepSize(Long StepSize) {
        this.StepSize = StepSize;
    }

    /**
     * Get Additional performance range.
Note: This field might return null, indicating that no valid values can be obtained. 
     * @return ExtraPerformanceRange Additional performance range.
Note: This field might return null, indicating that no valid values can be obtained.
     */
    public Long [] getExtraPerformanceRange() {
        return this.ExtraPerformanceRange;
    }

    /**
     * Set Additional performance range.
Note: This field might return null, indicating that no valid values can be obtained.
     * @param ExtraPerformanceRange Additional performance range.
Note: This field might return null, indicating that no valid values can be obtained.
     */
    public void setExtraPerformanceRange(Long [] ExtraPerformanceRange) {
        this.ExtraPerformanceRange = ExtraPerformanceRange;
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
     * Get Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><br><li>DATA_DISK: DATA DISK.</li>. 
     * @return DiskUsage Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><br><li>DATA_DISK: DATA DISK.</li>.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><br><li>DATA_DISK: DATA DISK.</li>.
     * @param DiskUsage Cloud DISK type. valid values:<br><li>SYSTEM_DISK: SYSTEM DISK</li><br><li>DATA_DISK: DATA DISK.</li>.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Specifies the minimum configurable cloud disk size in GiB. 
     * @return MinDiskSize Specifies the minimum configurable cloud disk size in GiB.
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set Specifies the minimum configurable cloud disk size in GiB.
     * @param MinDiskSize Specifies the minimum configurable cloud disk size in GiB.
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get Specifies the maximum configurable cloud disk size in GiB. 
     * @return MaxDiskSize Specifies the maximum configurable cloud disk size in GiB.
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Specifies the maximum configurable cloud disk size in GiB.
     * @param MaxDiskSize Specifies the maximum configurable cloud disk size in GiB.
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get Price of a prepaid or postpaid cloud disk. 
     * @return Price Price of a prepaid or postpaid cloud disk.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set Price of a prepaid or postpaid cloud disk.
     * @param Price Price of a prepaid or postpaid cloud disk.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    public DiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskConfig(DiskConfig source) {
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.StepSize != null) {
            this.StepSize = new Long(source.StepSize);
        }
        if (source.ExtraPerformanceRange != null) {
            this.ExtraPerformanceRange = new Long[source.ExtraPerformanceRange.length];
            for (int i = 0; i < source.ExtraPerformanceRange.length; i++) {
                this.ExtraPerformanceRange[i] = new Long(source.ExtraPerformanceRange[i]);
            }
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "StepSize", this.StepSize);
        this.setParamArraySimple(map, prefix + "ExtraPerformanceRange.", this.ExtraPerformanceRange);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

