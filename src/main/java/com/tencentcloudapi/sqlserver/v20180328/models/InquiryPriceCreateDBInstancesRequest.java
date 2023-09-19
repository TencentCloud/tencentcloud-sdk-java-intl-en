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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesRequest extends AbstractModel{

    /**
    * AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Billing type. Valid value: POSTPAID.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Length of purchase in months. Value range: 1-48. Default value: 1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of instances purchased at a time. Value range: 1-100. Default value: 1
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * SQL version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), `201402` (SQL Server 2014 Standard)`, `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The purchasable version varies by region. It can be queried by the `DescribeProductConfig` API.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * The number of CPU cores of the instance you want to purchase.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * The type of instance to be purchased. Valid values: `HA` (high-availability edition, including dual-server high-availability and AlwaysOn cluster u200deditionu200d), `RO` (read-only replica edition), `SI` (single-node edition), `cvmHA` (dual-server high-availability edition u200dfor CVM), `cvmRO` (read-only edition u200dfor CVM).
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The host type of the instance to be purchased. Valid values: `PM` (physical machine), `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD), 
`CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API 
     * @return Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API
     * @param Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance capacity in GB 
     * @return Storage Instance capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance capacity in GB
     * @param Storage Instance capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Billing type. Valid value: POSTPAID. 
     * @return InstanceChargeType Billing type. Valid value: POSTPAID.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Billing type. Valid value: POSTPAID.
     * @param InstanceChargeType Billing type. Valid value: POSTPAID.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Length of purchase in months. Value range: 1-48. Default value: 1 
     * @return Period Length of purchase in months. Value range: 1-48. Default value: 1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months. Value range: 1-48. Default value: 1
     * @param Period Length of purchase in months. Value range: 1-48. Default value: 1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of instances purchased at a time. Value range: 1-100. Default value: 1 
     * @return GoodsNum Number of instances purchased at a time. Value range: 1-100. Default value: 1
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances purchased at a time. Value range: 1-100. Default value: 1
     * @param GoodsNum Number of instances purchased at a time. Value range: 1-100. Default value: 1
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get SQL version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), `201402` (SQL Server 2014 Standard)`, `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The purchasable version varies by region. It can be queried by the `DescribeProductConfig` API. 
     * @return DBVersion SQL version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), `201402` (SQL Server 2014 Standard)`, `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The purchasable version varies by region. It can be queried by the `DescribeProductConfig` API.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set SQL version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), `201402` (SQL Server 2014 Standard)`, `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The purchasable version varies by region. It can be queried by the `DescribeProductConfig` API.
     * @param DBVersion SQL version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), `201402` (SQL Server 2014 Standard)`, `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The purchasable version varies by region. It can be queried by the `DescribeProductConfig` API.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get The number of CPU cores of the instance you want to purchase. 
     * @return Cpu The number of CPU cores of the instance you want to purchase.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CPU cores of the instance you want to purchase.
     * @param Cpu The number of CPU cores of the instance you want to purchase.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get The type of instance to be purchased. Valid values: `HA` (high-availability edition, including dual-server high-availability and AlwaysOn cluster u200deditionu200d), `RO` (read-only replica edition), `SI` (single-node edition), `cvmHA` (dual-server high-availability edition u200dfor CVM), `cvmRO` (read-only edition u200dfor CVM). 
     * @return InstanceType The type of instance to be purchased. Valid values: `HA` (high-availability edition, including dual-server high-availability and AlwaysOn cluster u200deditionu200d), `RO` (read-only replica edition), `SI` (single-node edition), `cvmHA` (dual-server high-availability edition u200dfor CVM), `cvmRO` (read-only edition u200dfor CVM).
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of instance to be purchased. Valid values: `HA` (high-availability edition, including dual-server high-availability and AlwaysOn cluster u200deditionu200d), `RO` (read-only replica edition), `SI` (single-node edition), `cvmHA` (dual-server high-availability edition u200dfor CVM), `cvmRO` (read-only edition u200dfor CVM).
     * @param InstanceType The type of instance to be purchased. Valid values: `HA` (high-availability edition, including dual-server high-availability and AlwaysOn cluster u200deditionu200d), `RO` (read-only replica edition), `SI` (single-node edition), `cvmHA` (dual-server high-availability edition u200dfor CVM), `cvmRO` (read-only edition u200dfor CVM).
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The host type of the instance to be purchased. Valid values: `PM` (physical machine), `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD), 
`CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD). 
     * @return MachineType The host type of the instance to be purchased. Valid values: `PM` (physical machine), `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD), 
`CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set The host type of the instance to be purchased. Valid values: `PM` (physical machine), `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD), 
`CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     * @param MachineType The host type of the instance to be purchased. Valid values: `PM` (physical machine), `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD), 
`CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public InquiryPriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDBInstancesRequest(InquiryPriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

