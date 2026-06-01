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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPriceRequest extends AbstractModel {

    /**
    * <p>Instance duration, in months, minimum value 1, maximum value 36. This field is invalid when querying the pay-as-you-go rate.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>AZ information, in the format of "ap-guangzhou-2". For available values, query the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">DescribeDBZoneConfig</a> api. This parameter is required when InstanceId is empty.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance count. Default value is 1, minimum value 1, maximum value 100. This parameter is required when InstanceId is empty.</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Instance memory size, measurement unit: MB. Required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain the saleable instance memory size range.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance disk size, unit: GB. This parameter is required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the saleable disk size range.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Instance type, defaults to master. Supported values include: master - primary instance, ro - read-only instance, dr - disaster recovery instance. Required when InstanceId is empty.</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Payment type. Supported values: PRE_PAID (yearly/monthly subscription) and HOUR_PAID (pay-as-you-go). This parameter is required when InstanceId is empty.</p>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>Instance isolation type.</p><p>Enumeration value:</p><ul><li>UNIVERSAL: General-purpose instance</li><li>EXCLUSIVE: Dedicated instance</li><li>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_ULTRA: Flagship type of cloud disk edition</li></ul><p>Default value: UNIVERSAL</p><p>If needed to query the price of a single-node instance of cloud disk edition, set up this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes as 1.</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Number of instance nodes.<br>1. When querying the price of a read-only instance or a single-node instance, the value of this field is 1.<br>2. When querying the price of a dual-node instance, the value of this field is 2.<br>3. When querying the price of a three-node instance, the value of this field is 3.<br>4. When querying the price of a cloud disk edition instance, the value range of this field can be 2 - 6. A value of 2 means the cloud disk edition instance has 1 read-write node + 1 read-only node. A value of 6 means the cloud disk edition instance has 1 read-write node + 5 read-only nodes. For other values (3 - 5), the rule is 1 read-write node + (value - 1) read-only nodes.</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>The number of CPU cores of the price-query instance, measurement unit: core. To ensure the validity of the input CPU value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API acquisition to get the saleable number of cores. When this value is not specified, a default value will be padded based on the Memory size.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Query the ID of the instance to be renewed. If needed, fill in InstanceId and Period to query instance renewal price.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Usage-based billing tier. Valid only when PayType=HOUR_PAID. Supported values include: 1, 2, 3. For step duration, see https://www.tencentcloud.com/document/product/236/18335.?from_cn_redirect=1</p>
    */
    @SerializedName("Ladder")
    @Expose
    private Long Ladder;

    /**
    * <p>Disk Type. Specify this parameter when querying the price of CLOUD disk edition or single-node instance of CLOUD disk edition. Default value: SSD CLOUD Block Storage.<br>Supported values include:<br>"CLOUD_SSD" - SSD CLOUD Block Storage.<br>"CLOUD_HSSD" - Enhanced SSD CLOUD Disk.<br>"CLOUD_PREMIUM" - High-performance CLOUD Block Storage.</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
     * Get <p>Instance duration, in months, minimum value 1, maximum value 36. This field is invalid when querying the pay-as-you-go rate.</p> 
     * @return Period <p>Instance duration, in months, minimum value 1, maximum value 36. This field is invalid when querying the pay-as-you-go rate.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Instance duration, in months, minimum value 1, maximum value 36. This field is invalid when querying the pay-as-you-go rate.</p>
     * @param Period <p>Instance duration, in months, minimum value 1, maximum value 36. This field is invalid when querying the pay-as-you-go rate.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>AZ information, in the format of "ap-guangzhou-2". For available values, query the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">DescribeDBZoneConfig</a> api. This parameter is required when InstanceId is empty.</p> 
     * @return Zone <p>AZ information, in the format of "ap-guangzhou-2". For available values, query the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">DescribeDBZoneConfig</a> api. This parameter is required when InstanceId is empty.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ information, in the format of "ap-guangzhou-2". For available values, query the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">DescribeDBZoneConfig</a> api. This parameter is required when InstanceId is empty.</p>
     * @param Zone <p>AZ information, in the format of "ap-guangzhou-2". For available values, query the <a href="https://www.tencentcloud.com/document/api/236/17229?from_cn_redirect=1">DescribeDBZoneConfig</a> api. This parameter is required when InstanceId is empty.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance count. Default value is 1, minimum value 1, maximum value 100. This parameter is required when InstanceId is empty.</p> 
     * @return GoodsNum <p>Instance count. Default value is 1, minimum value 1, maximum value 100. This parameter is required when InstanceId is empty.</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Instance count. Default value is 1, minimum value 1, maximum value 100. This parameter is required when InstanceId is empty.</p>
     * @param GoodsNum <p>Instance count. Default value is 1, minimum value 1, maximum value 100. This parameter is required when InstanceId is empty.</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Instance memory size, measurement unit: MB. Required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain the saleable instance memory size range.</p> 
     * @return Memory <p>Instance memory size, measurement unit: MB. Required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain the saleable instance memory size range.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory size, measurement unit: MB. Required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain the saleable instance memory size range.</p>
     * @param Memory <p>Instance memory size, measurement unit: MB. Required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to obtain the saleable instance memory size range.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance disk size, unit: GB. This parameter is required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the saleable disk size range.</p> 
     * @return Volume <p>Instance disk size, unit: GB. This parameter is required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the saleable disk size range.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Instance disk size, unit: GB. This parameter is required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the saleable disk size range.</p>
     * @param Volume <p>Instance disk size, unit: GB. This parameter is required when InstanceId is empty. To ensure the input value is valid, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the saleable disk size range.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Instance type, defaults to master. Supported values include: master - primary instance, ro - read-only instance, dr - disaster recovery instance. Required when InstanceId is empty.</p> 
     * @return InstanceRole <p>Instance type, defaults to master. Supported values include: master - primary instance, ro - read-only instance, dr - disaster recovery instance. Required when InstanceId is empty.</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance type, defaults to master. Supported values include: master - primary instance, ro - read-only instance, dr - disaster recovery instance. Required when InstanceId is empty.</p>
     * @param InstanceRole <p>Instance type, defaults to master. Supported values include: master - primary instance, ro - read-only instance, dr - disaster recovery instance. Required when InstanceId is empty.</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Payment type. Supported values: PRE_PAID (yearly/monthly subscription) and HOUR_PAID (pay-as-you-go). This parameter is required when InstanceId is empty.</p> 
     * @return PayType <p>Payment type. Supported values: PRE_PAID (yearly/monthly subscription) and HOUR_PAID (pay-as-you-go). This parameter is required when InstanceId is empty.</p>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>Payment type. Supported values: PRE_PAID (yearly/monthly subscription) and HOUR_PAID (pay-as-you-go). This parameter is required when InstanceId is empty.</p>
     * @param PayType <p>Payment type. Supported values: PRE_PAID (yearly/monthly subscription) and HOUR_PAID (pay-as-you-go). This parameter is required when InstanceId is empty.</p>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p> 
     * @return ProtectMode <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     * @param ProtectMode <p>Data replication method, defaults to 0. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>Instance isolation type.</p><p>Enumeration value:</p><ul><li>UNIVERSAL: General-purpose instance</li><li>EXCLUSIVE: Dedicated instance</li><li>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_ULTRA: Flagship type of cloud disk edition</li></ul><p>Default value: UNIVERSAL</p><p>If needed to query the price of a single-node instance of cloud disk edition, set up this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes as 1.</p> 
     * @return DeviceType <p>Instance isolation type.</p><p>Enumeration value:</p><ul><li>UNIVERSAL: General-purpose instance</li><li>EXCLUSIVE: Dedicated instance</li><li>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_ULTRA: Flagship type of cloud disk edition</li></ul><p>Default value: UNIVERSAL</p><p>If needed to query the price of a single-node instance of cloud disk edition, set up this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes as 1.</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance isolation type.</p><p>Enumeration value:</p><ul><li>UNIVERSAL: General-purpose instance</li><li>EXCLUSIVE: Dedicated instance</li><li>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_ULTRA: Flagship type of cloud disk edition</li></ul><p>Default value: UNIVERSAL</p><p>If needed to query the price of a single-node instance of cloud disk edition, set up this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes as 1.</p>
     * @param DeviceType <p>Instance isolation type.</p><p>Enumeration value:</p><ul><li>UNIVERSAL: General-purpose instance</li><li>EXCLUSIVE: Dedicated instance</li><li>CLOUD_NATIVE_CLUSTER: Standard type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE: Enhanced type of cloud disk edition</li><li>CLOUD_NATIVE_CLUSTER_ULTRA: Flagship type of cloud disk edition</li></ul><p>Default value: UNIVERSAL</p><p>If needed to query the price of a single-node instance of cloud disk edition, set up this parameter as CLOUD_NATIVE_CLUSTER and specify parameter InstanceNodes as 1.</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Number of instance nodes.<br>1. When querying the price of a read-only instance or a single-node instance, the value of this field is 1.<br>2. When querying the price of a dual-node instance, the value of this field is 2.<br>3. When querying the price of a three-node instance, the value of this field is 3.<br>4. When querying the price of a cloud disk edition instance, the value range of this field can be 2 - 6. A value of 2 means the cloud disk edition instance has 1 read-write node + 1 read-only node. A value of 6 means the cloud disk edition instance has 1 read-write node + 5 read-only nodes. For other values (3 - 5), the rule is 1 read-write node + (value - 1) read-only nodes.</p> 
     * @return InstanceNodes <p>Number of instance nodes.<br>1. When querying the price of a read-only instance or a single-node instance, the value of this field is 1.<br>2. When querying the price of a dual-node instance, the value of this field is 2.<br>3. When querying the price of a three-node instance, the value of this field is 3.<br>4. When querying the price of a cloud disk edition instance, the value range of this field can be 2 - 6. A value of 2 means the cloud disk edition instance has 1 read-write node + 1 read-only node. A value of 6 means the cloud disk edition instance has 1 read-write node + 5 read-only nodes. For other values (3 - 5), the rule is 1 read-write node + (value - 1) read-only nodes.</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>Number of instance nodes.<br>1. When querying the price of a read-only instance or a single-node instance, the value of this field is 1.<br>2. When querying the price of a dual-node instance, the value of this field is 2.<br>3. When querying the price of a three-node instance, the value of this field is 3.<br>4. When querying the price of a cloud disk edition instance, the value range of this field can be 2 - 6. A value of 2 means the cloud disk edition instance has 1 read-write node + 1 read-only node. A value of 6 means the cloud disk edition instance has 1 read-write node + 5 read-only nodes. For other values (3 - 5), the rule is 1 read-write node + (value - 1) read-only nodes.</p>
     * @param InstanceNodes <p>Number of instance nodes.<br>1. When querying the price of a read-only instance or a single-node instance, the value of this field is 1.<br>2. When querying the price of a dual-node instance, the value of this field is 2.<br>3. When querying the price of a three-node instance, the value of this field is 3.<br>4. When querying the price of a cloud disk edition instance, the value range of this field can be 2 - 6. A value of 2 means the cloud disk edition instance has 1 read-write node + 1 read-only node. A value of 6 means the cloud disk edition instance has 1 read-write node + 5 read-only nodes. For other values (3 - 5), the rule is 1 read-write node + (value - 1) read-only nodes.</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>The number of CPU cores of the price-query instance, measurement unit: core. To ensure the validity of the input CPU value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API acquisition to get the saleable number of cores. When this value is not specified, a default value will be padded based on the Memory size.</p> 
     * @return Cpu <p>The number of CPU cores of the price-query instance, measurement unit: core. To ensure the validity of the input CPU value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API acquisition to get the saleable number of cores. When this value is not specified, a default value will be padded based on the Memory size.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>The number of CPU cores of the price-query instance, measurement unit: core. To ensure the validity of the input CPU value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API acquisition to get the saleable number of cores. When this value is not specified, a default value will be padded based on the Memory size.</p>
     * @param Cpu <p>The number of CPU cores of the price-query instance, measurement unit: core. To ensure the validity of the input CPU value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API acquisition to get the saleable number of cores. When this value is not specified, a default value will be padded based on the Memory size.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Query the ID of the instance to be renewed. If needed, fill in InstanceId and Period to query instance renewal price.</p> 
     * @return InstanceId <p>Query the ID of the instance to be renewed. If needed, fill in InstanceId and Period to query instance renewal price.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Query the ID of the instance to be renewed. If needed, fill in InstanceId and Period to query instance renewal price.</p>
     * @param InstanceId <p>Query the ID of the instance to be renewed. If needed, fill in InstanceId and Period to query instance renewal price.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Usage-based billing tier. Valid only when PayType=HOUR_PAID. Supported values include: 1, 2, 3. For step duration, see https://www.tencentcloud.com/document/product/236/18335.?from_cn_redirect=1</p> 
     * @return Ladder <p>Usage-based billing tier. Valid only when PayType=HOUR_PAID. Supported values include: 1, 2, 3. For step duration, see https://www.tencentcloud.com/document/product/236/18335.?from_cn_redirect=1</p>
     */
    public Long getLadder() {
        return this.Ladder;
    }

    /**
     * Set <p>Usage-based billing tier. Valid only when PayType=HOUR_PAID. Supported values include: 1, 2, 3. For step duration, see https://www.tencentcloud.com/document/product/236/18335.?from_cn_redirect=1</p>
     * @param Ladder <p>Usage-based billing tier. Valid only when PayType=HOUR_PAID. Supported values include: 1, 2, 3. For step duration, see https://www.tencentcloud.com/document/product/236/18335.?from_cn_redirect=1</p>
     */
    public void setLadder(Long Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * Get <p>Disk Type. Specify this parameter when querying the price of CLOUD disk edition or single-node instance of CLOUD disk edition. Default value: SSD CLOUD Block Storage.<br>Supported values include:<br>"CLOUD_SSD" - SSD CLOUD Block Storage.<br>"CLOUD_HSSD" - Enhanced SSD CLOUD Disk.<br>"CLOUD_PREMIUM" - High-performance CLOUD Block Storage.</p> 
     * @return DiskType <p>Disk Type. Specify this parameter when querying the price of CLOUD disk edition or single-node instance of CLOUD disk edition. Default value: SSD CLOUD Block Storage.<br>Supported values include:<br>"CLOUD_SSD" - SSD CLOUD Block Storage.<br>"CLOUD_HSSD" - Enhanced SSD CLOUD Disk.<br>"CLOUD_PREMIUM" - High-performance CLOUD Block Storage.</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Disk Type. Specify this parameter when querying the price of CLOUD disk edition or single-node instance of CLOUD disk edition. Default value: SSD CLOUD Block Storage.<br>Supported values include:<br>"CLOUD_SSD" - SSD CLOUD Block Storage.<br>"CLOUD_HSSD" - Enhanced SSD CLOUD Disk.<br>"CLOUD_PREMIUM" - High-performance CLOUD Block Storage.</p>
     * @param DiskType <p>Disk Type. Specify this parameter when querying the price of CLOUD disk edition or single-node instance of CLOUD disk edition. Default value: SSD CLOUD Block Storage.<br>Supported values include:<br>"CLOUD_SSD" - SSD CLOUD Block Storage.<br>"CLOUD_HSSD" - Enhanced SSD CLOUD Disk.<br>"CLOUD_PREMIUM" - High-performance CLOUD Block Storage.</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    public DescribeDBPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBPriceRequest(DescribeDBPriceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ladder != null) {
            this.Ladder = new Long(source.Ladder);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);

    }
}

