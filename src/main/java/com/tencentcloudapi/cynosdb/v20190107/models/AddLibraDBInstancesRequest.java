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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLibraDBInstancesRequest extends AbstractModel {

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory in GB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Disk size.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Sync object list
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * Port used when adding new RO groups, value range [0,65535)
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Number of newly-added read-only instances, value range (0,15]
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Instance name, string length range [0,64), value range uppercase and lowercase letters, digits 0-9, '_', '-', '.'
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of replicas
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * Value is 'Exclusive' when ReplicasNum>1 or ReplicasNum=1 and Cpu>=32 cores, and 'Common' in other scenarios.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Disk type.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Order source, string length range [0,64)
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Transaction mode 0-Place order and pay 1-Place order
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * ID of the associated VPC network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. If VpcId is set up, SubnetId is required.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Security group ID. You can specify security groups when creating a read-only instance.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Analysis engine version
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * Purchase period, combined with TimeUnit for the changes to take effect
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Duration unit, takes effect when combined with TimeSpan. Options: day:d, month:m
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Source instance id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CPU cores 
     * @return Cpu CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU cores
     * @param Cpu CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory in GB 
     * @return Mem Memory in GB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory in GB
     * @param Mem Memory in GB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Disk size. 
     * @return StorageSize Disk size.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Disk size.
     * @param StorageSize Disk size.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Sync object list 
     * @return Objects Sync object list
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set Sync object list
     * @param Objects Sync object list
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Port used when adding new RO groups, value range [0,65535) 
     * @return Port Port used when adding new RO groups, value range [0,65535)
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port used when adding new RO groups, value range [0,65535)
     * @param Port Port used when adding new RO groups, value range [0,65535)
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Number of newly-added read-only instances, value range (0,15] 
     * @return GoodsNum Number of newly-added read-only instances, value range (0,15]
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of newly-added read-only instances, value range (0,15]
     * @param GoodsNum Number of newly-added read-only instances, value range (0,15]
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Instance name, string length range [0,64), value range uppercase and lowercase letters, digits 0-9, '_', '-', '.' 
     * @return InstanceName Instance name, string length range [0,64), value range uppercase and lowercase letters, digits 0-9, '_', '-', '.'
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, string length range [0,64), value range uppercase and lowercase letters, digits 0-9, '_', '-', '.'
     * @param InstanceName Instance name, string length range [0,64), value range uppercase and lowercase letters, digits 0-9, '_', '-', '.'
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Number of replicas 
     * @return ReplicasNum Number of replicas
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set Number of replicas
     * @param ReplicasNum Number of replicas
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get Value is 'Exclusive' when ReplicasNum>1 or ReplicasNum=1 and Cpu>=32 cores, and 'Common' in other scenarios. 
     * @return InstanceType Value is 'Exclusive' when ReplicasNum>1 or ReplicasNum=1 and Cpu>=32 cores, and 'Common' in other scenarios.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Value is 'Exclusive' when ReplicasNum>1 or ReplicasNum=1 and Cpu>=32 cores, and 'Common' in other scenarios.
     * @param InstanceType Value is 'Exclusive' when ReplicasNum>1 or ReplicasNum=1 and Cpu>=32 cores, and 'Common' in other scenarios.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Disk type. 
     * @return StorageType Disk type.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Disk type.
     * @param StorageType Disk type.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0. 
     * @return AutoVoucher Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     * @param AutoVoucher Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Order source, string length range [0,64) 
     * @return OrderSource Order source, string length range [0,64)
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order source, string length range [0,64)
     * @param OrderSource Order source, string length range [0,64)
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Transaction mode 0-Place order and pay 1-Place order 
     * @return DealMode Transaction mode 0-Place order and pay 1-Place order
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode 0-Place order and pay 1-Place order
     * @param DealMode Transaction mode 0-Place order and pay 1-Place order
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get ID of the associated VPC network. 
     * @return VpcId ID of the associated VPC network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the associated VPC network.
     * @param VpcId ID of the associated VPC network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. If VpcId is set up, SubnetId is required. 
     * @return SubnetId Subnet ID. If VpcId is set up, SubnetId is required.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. If VpcId is set up, SubnetId is required.
     * @param SubnetId Subnet ID. If VpcId is set up, SubnetId is required.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Security group ID. You can specify security groups when creating a read-only instance. 
     * @return SecurityGroupIds Security group ID. You can specify security groups when creating a read-only instance.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID. You can specify security groups when creating a read-only instance.
     * @param SecurityGroupIds Security group ID. You can specify security groups when creating a read-only instance.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Analysis engine version 
     * @return LibraDBVersion Analysis engine version
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set Analysis engine version
     * @param LibraDBVersion Analysis engine version
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get Purchase period, combined with TimeUnit for the changes to take effect 
     * @return TimeSpan Purchase period, combined with TimeUnit for the changes to take effect
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase period, combined with TimeUnit for the changes to take effect
     * @param TimeSpan Purchase period, combined with TimeUnit for the changes to take effect
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit, takes effect when combined with TimeSpan. Options: day:d, month:m 
     * @return TimeUnit Duration unit, takes effect when combined with TimeSpan. Options: day:d, month:m
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit, takes effect when combined with TimeSpan. Options: day:d, month:m
     * @param TimeUnit Duration unit, takes effect when combined with TimeSpan. Options: day:d, month:m
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Source instance id 
     * @return SrcInstanceId Source instance id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance id
     * @param SrcInstanceId Source instance id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    public AddLibraDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLibraDBInstancesRequest(AddLibraDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);

    }
}

