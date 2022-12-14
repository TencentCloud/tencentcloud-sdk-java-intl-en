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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeHardwareInfo extends AbstractModel{

    /**
    * User `APPID`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Serial number
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * Machine instance ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * Public IP bound to master node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Node type. 0: common node; 1: master node;
2: core node; 3: task node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Node specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Number of node cores
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Node memory size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Node memory description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * Node region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Node AZ
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Application time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Release time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * Disk size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * Node description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * Services deployed on node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * Disk type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * System disk size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * Payment type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Database IP
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * Database port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * Disk capacity
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * Disk capacity description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * Memory capacity
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * Memory capacity description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Node resource ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * Device flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * Support for configuration adjustment
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mutable")
    @Expose
    private Long Mutable;

    /**
    * Multi-cloud disk
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MCMultiDisk")
    @Expose
    private MultiDiskMC [] MCMultiDisk;

    /**
    * Database information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdbNodeInfo")
    @Expose
    private CdbInfo CdbNodeInfo;

    /**
    * Private IP
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Whether this node can be terminated. 1: yes, 0: no
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Destroyable")
    @Expose
    private Long Destroyable;

    /**
    * Tags bound to node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Wether the node is auto-scaling. 0 means common node. 1 means auto-scaling node.
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * Resource type. Valid values: host, pod
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * Whether floating specification is used. `1`: yes; `0`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * Floating specification in JSON string
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * Whether to support billing mode change. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * System disk type
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * AZ information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Subnet
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetInfo")
    @Expose
    private SubnetInfo SubnetInfo;

    /**
    * Client
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
    * The current system time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * Whether it is used in a federation. Valid values: `0` (no), `1` (yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFederation")
    @Expose
    private Long IsFederation;

    /**
    * Device name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Service
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceClient")
    @Expose
    private String ServiceClient;

    /**
    * Enabling instance protection for this instance. Valid values: `true` (enable) and `false` (disable).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * The billing version. Valid values: `0` (original billing) and `1` (new billing)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
     * Get User `APPID`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppId User `APPID`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `APPID`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppId User `APPID`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Serial number
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SerialNo Serial number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set Serial number
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SerialNo Serial number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get Machine instance ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrderNo Machine instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set Machine instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrderNo Machine instance ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get Public IP bound to master node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanIp Public IP bound to master node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP bound to master node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanIp Public IP bound to master node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Node type. 0: common node; 1: master node;
2: core node; 3: task node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Flag Node type. 0: common node; 1: master node;
2: core node; 3: task node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Node type. 0: common node; 1: master node;
2: core node; 3: task node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Flag Node type. 0: common node; 1: master node;
2: core node; 3: task node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Node specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Spec Node specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Node specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Spec Node specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Number of node cores
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CpuNum Number of node cores
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of node cores
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CpuNum Number of node cores
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Node memory size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MemSize Node memory size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MemSize Node memory size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Node memory description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MemDesc Node memory description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set Node memory description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MemDesc Node memory description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get Node region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Node region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Node region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionId Node region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Node AZ
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Node AZ
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Node AZ
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Node AZ
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Application time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplyTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplyTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Release time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FreeTime Release time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set Release time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FreeTime Release time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get Disk size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskSize Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskSize Disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Node description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NameTag Node description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set Node description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NameTag Node description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get Services deployed on node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Services Services deployed on node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set Services deployed on node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Services Services deployed on node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get Disk type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StorageType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get System disk size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RootSize System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RootSize System disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get Payment type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Payment type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Database IP
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CdbIp Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CdbIp Database IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get Database port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CdbPort Database port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set Database port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CdbPort Database port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get Disk capacity
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HwDiskSize Disk capacity
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set Disk capacity
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HwDiskSize Disk capacity
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get Disk capacity description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HwDiskSizeDesc Disk capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set Disk capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HwDiskSizeDesc Disk capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get Memory capacity
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HwMemSize Memory capacity
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set Memory capacity
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HwMemSize Memory capacity
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get Memory capacity description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HwMemSizeDesc Memory capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set Memory capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HwMemSizeDesc Memory capacity description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get Expiration time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Node resource ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EmrResourceId Node resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set Node resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EmrResourceId Node resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get Renewal flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsAutoRenew Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsAutoRenew Renewal flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get Device flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeviceClass Device flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set Device flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeviceClass Device flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get Support for configuration adjustment
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Mutable Support for configuration adjustment
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set Support for configuration adjustment
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Mutable Support for configuration adjustment
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMutable(Long Mutable) {
        this.Mutable = Mutable;
    }

    /**
     * Get Multi-cloud disk
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MCMultiDisk Multi-cloud disk
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MultiDiskMC [] getMCMultiDisk() {
        return this.MCMultiDisk;
    }

    /**
     * Set Multi-cloud disk
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MCMultiDisk Multi-cloud disk
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMCMultiDisk(MultiDiskMC [] MCMultiDisk) {
        this.MCMultiDisk = MCMultiDisk;
    }

    /**
     * Get Database information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CdbNodeInfo Database information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CdbInfo getCdbNodeInfo() {
        return this.CdbNodeInfo;
    }

    /**
     * Set Database information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CdbNodeInfo Database information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCdbNodeInfo(CdbInfo CdbNodeInfo) {
        this.CdbNodeInfo = CdbNodeInfo;
    }

    /**
     * Get Private IP
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ip Private IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Private IP
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ip Private IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Whether this node can be terminated. 1: yes, 0: no
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Destroyable Whether this node can be terminated. 1: yes, 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set Whether this node can be terminated. 1: yes, 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Destroyable Whether this node can be terminated. 1: yes, 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDestroyable(Long Destroyable) {
        this.Destroyable = Destroyable;
    }

    /**
     * Get Tags bound to node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tags bound to node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tags bound to node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Wether the node is auto-scaling. 0 means common node. 1 means auto-scaling node. 
     * @return AutoFlag Wether the node is auto-scaling. 0 means common node. 1 means auto-scaling node.
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set Wether the node is auto-scaling. 0 means common node. 1 means auto-scaling node.
     * @param AutoFlag Wether the node is auto-scaling. 0 means common node. 1 means auto-scaling node.
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get Resource type. Valid values: host, pod
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HardwareResourceType Resource type. Valid values: host, pod
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set Resource type. Valid values: host, pod
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HardwareResourceType Resource type. Valid values: host, pod
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get Whether floating specification is used. `1`: yes; `0`: no
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return IsDynamicSpec Whether floating specification is used. `1`: yes; `0`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set Whether floating specification is used. `1`: yes; `0`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param IsDynamicSpec Whether floating specification is used. `1`: yes; `0`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get Floating specification in JSON string
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DynamicPodSpec Floating specification in JSON string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set Floating specification in JSON string
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DynamicPodSpec Floating specification in JSON string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get Whether to support billing mode change. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SupportModifyPayMode Whether to support billing mode change. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set Whether to support billing mode change. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SupportModifyPayMode Whether to support billing mode change. `0`: no; `1`: yes
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get System disk type
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RootStorageType System disk type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set System disk type
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RootStorageType System disk type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get AZ information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Zone AZ information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Zone AZ information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Subnet
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SubnetInfo Subnet
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SubnetInfo getSubnetInfo() {
        return this.SubnetInfo;
    }

    /**
     * Set Subnet
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SubnetInfo Subnet
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSubnetInfo(SubnetInfo SubnetInfo) {
        this.SubnetInfo = SubnetInfo;
    }

    /**
     * Get Client
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Clients Client
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set Client
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Clients Client
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
    }

    /**
     * Get The current system time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentTime The current system time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set The current system time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentTime The current system time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get Whether it is used in a federation. Valid values: `0` (no), `1` (yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsFederation Whether it is used in a federation. Valid values: `0` (no), `1` (yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set Whether it is used in a federation. Valid values: `0` (no), `1` (yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsFederation Whether it is used in a federation. Valid values: `0` (no), `1` (yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsFederation(Long IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get Device name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeviceName Device name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeviceName Device name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Service
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceClient Service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceClient() {
        return this.ServiceClient;
    }

    /**
     * Set Service
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceClient Service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceClient(String ServiceClient) {
        this.ServiceClient = ServiceClient;
    }

    /**
     * Get Enabling instance protection for this instance. Valid values: `true` (enable) and `false` (disable).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisableApiTermination Enabling instance protection for this instance. Valid values: `true` (enable) and `false` (disable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Enabling instance protection for this instance. Valid values: `true` (enable) and `false` (disable).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisableApiTermination Enabling instance protection for this instance. Valid values: `true` (enable) and `false` (disable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get The billing version. Valid values: `0` (original billing) and `1` (new billing)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TradeVersion The billing version. Valid values: `0` (original billing) and `1` (new billing)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set The billing version. Valid values: `0` (original billing) and `1` (new billing)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TradeVersion The billing version. Valid values: `0` (original billing) and `1` (new billing)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    public NodeHardwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeHardwareInfo(NodeHardwareInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemDesc != null) {
            this.MemDesc = new String(source.MemDesc);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.FreeTime != null) {
            this.FreeTime = new String(source.FreeTime);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new String(source.DiskSize);
        }
        if (source.NameTag != null) {
            this.NameTag = new String(source.NameTag);
        }
        if (source.Services != null) {
            this.Services = new String(source.Services);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.CdbIp != null) {
            this.CdbIp = new String(source.CdbIp);
        }
        if (source.CdbPort != null) {
            this.CdbPort = new Long(source.CdbPort);
        }
        if (source.HwDiskSize != null) {
            this.HwDiskSize = new Long(source.HwDiskSize);
        }
        if (source.HwDiskSizeDesc != null) {
            this.HwDiskSizeDesc = new String(source.HwDiskSizeDesc);
        }
        if (source.HwMemSize != null) {
            this.HwMemSize = new Long(source.HwMemSize);
        }
        if (source.HwMemSizeDesc != null) {
            this.HwMemSizeDesc = new String(source.HwMemSizeDesc);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Long(source.IsAutoRenew);
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.Mutable != null) {
            this.Mutable = new Long(source.Mutable);
        }
        if (source.MCMultiDisk != null) {
            this.MCMultiDisk = new MultiDiskMC[source.MCMultiDisk.length];
            for (int i = 0; i < source.MCMultiDisk.length; i++) {
                this.MCMultiDisk[i] = new MultiDiskMC(source.MCMultiDisk[i]);
            }
        }
        if (source.CdbNodeInfo != null) {
            this.CdbNodeInfo = new CdbInfo(source.CdbNodeInfo);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Destroyable != null) {
            this.Destroyable = new Long(source.Destroyable);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoFlag != null) {
            this.AutoFlag = new Long(source.AutoFlag);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.IsDynamicSpec != null) {
            this.IsDynamicSpec = new Long(source.IsDynamicSpec);
        }
        if (source.DynamicPodSpec != null) {
            this.DynamicPodSpec = new String(source.DynamicPodSpec);
        }
        if (source.SupportModifyPayMode != null) {
            this.SupportModifyPayMode = new Long(source.SupportModifyPayMode);
        }
        if (source.RootStorageType != null) {
            this.RootStorageType = new Long(source.RootStorageType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetInfo != null) {
            this.SubnetInfo = new SubnetInfo(source.SubnetInfo);
        }
        if (source.Clients != null) {
            this.Clients = new String(source.Clients);
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new String(source.CurrentTime);
        }
        if (source.IsFederation != null) {
            this.IsFederation = new Long(source.IsFederation);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceClient != null) {
            this.ServiceClient = new String(source.ServiceClient);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.TradeVersion != null) {
            this.TradeVersion = new Long(source.TradeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemDesc", this.MemDesc);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "FreeTime", this.FreeTime);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NameTag", this.NameTag);
        this.setParamSimple(map, prefix + "Services", this.Services);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "CdbIp", this.CdbIp);
        this.setParamSimple(map, prefix + "CdbPort", this.CdbPort);
        this.setParamSimple(map, prefix + "HwDiskSize", this.HwDiskSize);
        this.setParamSimple(map, prefix + "HwDiskSizeDesc", this.HwDiskSizeDesc);
        this.setParamSimple(map, prefix + "HwMemSize", this.HwMemSize);
        this.setParamSimple(map, prefix + "HwMemSizeDesc", this.HwMemSizeDesc);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "Mutable", this.Mutable);
        this.setParamArrayObj(map, prefix + "MCMultiDisk.", this.MCMultiDisk);
        this.setParamObj(map, prefix + "CdbNodeInfo.", this.CdbNodeInfo);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Destroyable", this.Destroyable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoFlag", this.AutoFlag);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamSimple(map, prefix + "IsDynamicSpec", this.IsDynamicSpec);
        this.setParamSimple(map, prefix + "DynamicPodSpec", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "SupportModifyPayMode", this.SupportModifyPayMode);
        this.setParamSimple(map, prefix + "RootStorageType", this.RootStorageType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SubnetInfo.", this.SubnetInfo);
        this.setParamSimple(map, prefix + "Clients", this.Clients);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamSimple(map, prefix + "IsFederation", this.IsFederation);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceClient", this.ServiceClient);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "TradeVersion", this.TradeVersion);

    }
}

