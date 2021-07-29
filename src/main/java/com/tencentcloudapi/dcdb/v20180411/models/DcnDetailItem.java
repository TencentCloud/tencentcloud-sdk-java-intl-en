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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DcnDetailItem extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Region where the instance resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone where the instance resides
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance IPv6 address
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * Instance port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * DCN flag. Valid values: `1` (primary), `2` (disaster recovery)
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN status. Valid values: `0` (none), `1` (creating), `2` (syncing), `3` (disconnected)
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * Number of CPU cores of the instance
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory capacity in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Billing mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Creation time of the instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time of the instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery instance), and `4` (dedicated disaster recovery instance).
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Region where the instance resides 
     * @return Region Region where the instance resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region where the instance resides
     * @param Region Region where the instance resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone where the instance resides 
     * @return Zone Availability zone where the instance resides
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone where the instance resides
     * @param Zone Availability zone where the instance resides
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance IP address 
     * @return Vip Instance IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance IP address
     * @param Vip Instance IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance IPv6 address 
     * @return Vipv6 Instance IPv6 address
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set Instance IPv6 address
     * @param Vipv6 Instance IPv6 address
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get Instance port 
     * @return Vport Instance port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance port
     * @param Vport Instance port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance status 
     * @return Status Instance status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance status description 
     * @return StatusDesc Instance status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Instance status description
     * @param StatusDesc Instance status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get DCN flag. Valid values: `1` (primary), `2` (disaster recovery) 
     * @return DcnFlag DCN flag. Valid values: `1` (primary), `2` (disaster recovery)
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN flag. Valid values: `1` (primary), `2` (disaster recovery)
     * @param DcnFlag DCN flag. Valid values: `1` (primary), `2` (disaster recovery)
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN status. Valid values: `0` (none), `1` (creating), `2` (syncing), `3` (disconnected) 
     * @return DcnStatus DCN status. Valid values: `0` (none), `1` (creating), `2` (syncing), `3` (disconnected)
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN status. Valid values: `0` (none), `1` (creating), `2` (syncing), `3` (disconnected)
     * @param DcnStatus DCN status. Valid values: `0` (none), `1` (creating), `2` (syncing), `3` (disconnected)
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get Number of CPU cores of the instance 
     * @return Cpu Number of CPU cores of the instance
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of the instance
     * @param Cpu Number of CPU cores of the instance
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory capacity in GB 
     * @return Memory Instance memory capacity in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory capacity in GB
     * @param Memory Instance memory capacity in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return Storage Instance storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB
     * @param Storage Instance storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Billing mode 
     * @return PayMode Billing mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
     * @param PayMode Billing mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Creation time of the instance in the format of 2006-01-02 15:04:05 
     * @return CreateTime Creation time of the instance in the format of 2006-01-02 15:04:05
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the instance in the format of 2006-01-02 15:04:05
     * @param CreateTime Creation time of the instance in the format of 2006-01-02 15:04:05
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time of the instance in the format of 2006-01-02 15:04:05 
     * @return PeriodEndTime Expiration time of the instance in the format of 2006-01-02 15:04:05
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time of the instance in the format of 2006-01-02 15:04:05
     * @param PeriodEndTime Expiration time of the instance in the format of 2006-01-02 15:04:05
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery instance), and `4` (dedicated disaster recovery instance). 
     * @return InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery instance), and `4` (dedicated disaster recovery instance).
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery instance), and `4` (dedicated disaster recovery instance).
     * @param InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (non-dedicated primary instance), `3` (non-dedicated disaster recovery instance), and `4` (dedicated disaster recovery instance).
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DcnDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DcnDetailItem(DcnDetailItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.DcnStatus != null) {
            this.DcnStatus = new Long(source.DcnStatus);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

