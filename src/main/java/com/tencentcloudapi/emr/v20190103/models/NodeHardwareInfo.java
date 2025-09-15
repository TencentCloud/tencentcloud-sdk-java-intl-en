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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeHardwareInfo extends AbstractModel {

    /**
    * User AppID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Serial number.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * Machine instance ID.
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * Public network IP address bound for the Master node.
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Node type. 0: Common node; 1: Master node.
 2: Core node; 3: Task node.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Node specifications.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Number of node cores.
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Node memory (bytes).
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Node memory (GB).
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * The region where the node is located.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * The zone where the node is located.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Application time.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Release time.
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * Hard disk size.
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * Node description.
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * Node deployment service.
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * Disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput SSD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).

    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * System disk size (GB).
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * Payment type. Valid values: 0 (pay-as-you-go); 1 (yearly/monthly subscription).
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Database IP address.
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * Database port.
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * Hard disk capacity (bytes).
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * Hard disk capacity description.
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * Memory capacity (bytes).
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * Memory capacity description.
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * Expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Node resource ID.
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * Renewal flag.
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * Device identification.
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * Supporting resizing.
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
    * Private network IP address.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Whether this node can be terminated. 1: Yes, 0: No.
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
    * Whether it is an automatic scaling node. 0: common node, 1: automatic scaling node.
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * Resource type, with the valid values of "host" and "pod".
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * Whether it is a floating specification. 1: Yes, 0: No.
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * Floating specification value in the JSON string format.
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * Whether the billing type can be changed. 1: Yes, 0: No.
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * System disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput HDD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).
    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * Availability information.
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
    * Client.
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
    * Current system time.
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * Indicates whether it is for federation. 1: Yes, 0: No.
    */
    @SerializedName("IsFederation")
    @Expose
    private Long IsFederation;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Service.
    */
    @SerializedName("ServiceClient")
    @Expose
    private String ServiceClient;

    /**
    * Whether instance protection is enabled. True: enabled, false: disabled.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * 0: old billing, 1: new billing.
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * Component status. ZooKeeper: STARTED, ResourceManager: STARTED, STARTED: Component is running, STOPPED: Component is halted.
    */
    @SerializedName("ServicesStatus")
    @Expose
    private String ServicesStatus;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Shared cluster ID.
    */
    @SerializedName("SharedClusterId")
    @Expose
    private String SharedClusterId;

    /**
    * Shared cluster ID description.
    */
    @SerializedName("SharedClusterIdDesc")
    @Expose
    private String SharedClusterIdDesc;

    /**
    * Whether the resource is set for scheduled termination.
    */
    @SerializedName("TimingResource")
    @Expose
    private Boolean TimingResource;

    /**
    * Corresponding TKE cluster ID in the case that the resource type (HardwareResourceType) is pod.
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * Name list of services that can be configured when a new disk is mounted.
    */
    @SerializedName("ConfigurableServices")
    @Expose
    private String [] ConfigurableServices;

    /**
    * Node labeling information: currently used only in the Terraform.
    */
    @SerializedName("NodeMark")
    @Expose
    private String NodeMark;

    /**
    * Whether auto-renewal is available for committed use resources.
    */
    @SerializedName("UnderwriteSetAutoRenew")
    @Expose
    private Boolean UnderwriteSetAutoRenew;

    /**
    * GPU information.
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get User AppID. 
     * @return AppId User AppID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppID.
     * @param AppId User AppID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Serial number. 
     * @return SerialNo Serial number.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set Serial number.
     * @param SerialNo Serial number.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get Machine instance ID. 
     * @return OrderNo Machine instance ID.
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set Machine instance ID.
     * @param OrderNo Machine instance ID.
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get Public network IP address bound for the Master node. 
     * @return WanIp Public network IP address bound for the Master node.
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public network IP address bound for the Master node.
     * @param WanIp Public network IP address bound for the Master node.
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Node type. 0: Common node; 1: Master node.
 2: Core node; 3: Task node. 
     * @return Flag Node type. 0: Common node; 1: Master node.
 2: Core node; 3: Task node.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Node type. 0: Common node; 1: Master node.
 2: Core node; 3: Task node.
     * @param Flag Node type. 0: Common node; 1: Master node.
 2: Core node; 3: Task node.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Node specifications. 
     * @return Spec Node specifications.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Node specifications.
     * @param Spec Node specifications.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Number of node cores. 
     * @return CpuNum Number of node cores.
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of node cores.
     * @param CpuNum Number of node cores.
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Node memory (bytes). 
     * @return MemSize Node memory (bytes).
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory (bytes).
     * @param MemSize Node memory (bytes).
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Node memory (GB). 
     * @return MemDesc Node memory (GB).
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set Node memory (GB).
     * @param MemDesc Node memory (GB).
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get The region where the node is located. 
     * @return RegionId The region where the node is located.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set The region where the node is located.
     * @param RegionId The region where the node is located.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get The zone where the node is located. 
     * @return ZoneId The zone where the node is located.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The zone where the node is located.
     * @param ZoneId The zone where the node is located.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Application time. 
     * @return ApplyTime Application time.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time.
     * @param ApplyTime Application time.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Release time. 
     * @return FreeTime Release time.
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set Release time.
     * @param FreeTime Release time.
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get Hard disk size. 
     * @return DiskSize Hard disk size.
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk size.
     * @param DiskSize Hard disk size.
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Node description. 
     * @return NameTag Node description.
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set Node description.
     * @param NameTag Node description.
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get Node deployment service. 
     * @return Services Node deployment service.
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set Node deployment service.
     * @param Services Node deployment service.
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get Disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput SSD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).
 
     * @return StorageType Disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput SSD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).

     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput SSD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).

     * @param StorageType Disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput SSD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).

     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get System disk size (GB). 
     * @return RootSize System disk size (GB).
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set System disk size (GB).
     * @param RootSize System disk size (GB).
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get Payment type. Valid values: 0 (pay-as-you-go); 1 (yearly/monthly subscription). 
     * @return ChargeType Payment type. Valid values: 0 (pay-as-you-go); 1 (yearly/monthly subscription).
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Payment type. Valid values: 0 (pay-as-you-go); 1 (yearly/monthly subscription).
     * @param ChargeType Payment type. Valid values: 0 (pay-as-you-go); 1 (yearly/monthly subscription).
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Database IP address. 
     * @return CdbIp Database IP address.
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set Database IP address.
     * @param CdbIp Database IP address.
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get Database port. 
     * @return CdbPort Database port.
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set Database port.
     * @param CdbPort Database port.
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get Hard disk capacity (bytes). 
     * @return HwDiskSize Hard disk capacity (bytes).
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set Hard disk capacity (bytes).
     * @param HwDiskSize Hard disk capacity (bytes).
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get Hard disk capacity description. 
     * @return HwDiskSizeDesc Hard disk capacity description.
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set Hard disk capacity description.
     * @param HwDiskSizeDesc Hard disk capacity description.
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get Memory capacity (bytes). 
     * @return HwMemSize Memory capacity (bytes).
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set Memory capacity (bytes).
     * @param HwMemSize Memory capacity (bytes).
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get Memory capacity description. 
     * @return HwMemSizeDesc Memory capacity description.
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set Memory capacity description.
     * @param HwMemSizeDesc Memory capacity description.
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get Expiration time. 
     * @return ExpireTime Expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time.
     * @param ExpireTime Expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Node resource ID. 
     * @return EmrResourceId Node resource ID.
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set Node resource ID.
     * @param EmrResourceId Node resource ID.
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get Renewal flag. 
     * @return IsAutoRenew Renewal flag.
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set Renewal flag.
     * @param IsAutoRenew Renewal flag.
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get Device identification. 
     * @return DeviceClass Device identification.
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set Device identification.
     * @param DeviceClass Device identification.
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get Supporting resizing. 
     * @return Mutable Supporting resizing.
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set Supporting resizing.
     * @param Mutable Supporting resizing.
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
     * Get Private network IP address. 
     * @return Ip Private network IP address.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Private network IP address.
     * @param Ip Private network IP address.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Whether this node can be terminated. 1: Yes, 0: No. 
     * @return Destroyable Whether this node can be terminated. 1: Yes, 0: No.
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set Whether this node can be terminated. 1: Yes, 0: No.
     * @param Destroyable Whether this node can be terminated. 1: Yes, 0: No.
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
     * Get Whether it is an automatic scaling node. 0: common node, 1: automatic scaling node. 
     * @return AutoFlag Whether it is an automatic scaling node. 0: common node, 1: automatic scaling node.
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set Whether it is an automatic scaling node. 0: common node, 1: automatic scaling node.
     * @param AutoFlag Whether it is an automatic scaling node. 0: common node, 1: automatic scaling node.
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get Resource type, with the valid values of "host" and "pod". 
     * @return HardwareResourceType Resource type, with the valid values of "host" and "pod".
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set Resource type, with the valid values of "host" and "pod".
     * @param HardwareResourceType Resource type, with the valid values of "host" and "pod".
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get Whether it is a floating specification. 1: Yes, 0: No. 
     * @return IsDynamicSpec Whether it is a floating specification. 1: Yes, 0: No.
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set Whether it is a floating specification. 1: Yes, 0: No.
     * @param IsDynamicSpec Whether it is a floating specification. 1: Yes, 0: No.
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get Floating specification value in the JSON string format. 
     * @return DynamicPodSpec Floating specification value in the JSON string format.
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set Floating specification value in the JSON string format.
     * @param DynamicPodSpec Floating specification value in the JSON string format.
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get Whether the billing type can be changed. 1: Yes, 0: No. 
     * @return SupportModifyPayMode Whether the billing type can be changed. 1: Yes, 0: No.
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set Whether the billing type can be changed. 1: Yes, 0: No.
     * @param SupportModifyPayMode Whether the billing type can be changed. 1: Yes, 0: No.
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get System disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput HDD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD). 
     * @return RootStorageType System disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput HDD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).
     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set System disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput HDD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).
     * @param RootStorageType System disk type. Valid values: 1 (Local Disk), 2 (Cloud Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Cloud Disk), 6 (Enhanced SSD), 11 (Throughput HDD), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High IO Cloud Disk), and 16 (Remote SSD).
     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get Availability information. 
     * @return Zone Availability information.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability information.
     * @param Zone Availability information.
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
     * Get Client. 
     * @return Clients Client.
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set Client.
     * @param Clients Client.
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
    }

    /**
     * Get Current system time. 
     * @return CurrentTime Current system time.
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set Current system time.
     * @param CurrentTime Current system time.
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get Indicates whether it is for federation. 1: Yes, 0: No. 
     * @return IsFederation Indicates whether it is for federation. 1: Yes, 0: No.
     */
    public Long getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set Indicates whether it is for federation. 1: Yes, 0: No.
     * @param IsFederation Indicates whether it is for federation. 1: Yes, 0: No.
     */
    public void setIsFederation(Long IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Service. 
     * @return ServiceClient Service.
     */
    public String getServiceClient() {
        return this.ServiceClient;
    }

    /**
     * Set Service.
     * @param ServiceClient Service.
     */
    public void setServiceClient(String ServiceClient) {
        this.ServiceClient = ServiceClient;
    }

    /**
     * Get Whether instance protection is enabled. True: enabled, false: disabled. 
     * @return DisableApiTermination Whether instance protection is enabled. True: enabled, false: disabled.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Whether instance protection is enabled. True: enabled, false: disabled.
     * @param DisableApiTermination Whether instance protection is enabled. True: enabled, false: disabled.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get 0: old billing, 1: new billing. 
     * @return TradeVersion 0: old billing, 1: new billing.
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set 0: old billing, 1: new billing.
     * @param TradeVersion 0: old billing, 1: new billing.
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get Component status. ZooKeeper: STARTED, ResourceManager: STARTED, STARTED: Component is running, STOPPED: Component is halted. 
     * @return ServicesStatus Component status. ZooKeeper: STARTED, ResourceManager: STARTED, STARTED: Component is running, STOPPED: Component is halted.
     */
    public String getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set Component status. ZooKeeper: STARTED, ResourceManager: STARTED, STARTED: Component is running, STOPPED: Component is halted.
     * @param ServicesStatus Component status. ZooKeeper: STARTED, ResourceManager: STARTED, STARTED: Component is running, STOPPED: Component is halted.
     */
    public void setServicesStatus(String ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Shared cluster ID. 
     * @return SharedClusterId Shared cluster ID.
     */
    public String getSharedClusterId() {
        return this.SharedClusterId;
    }

    /**
     * Set Shared cluster ID.
     * @param SharedClusterId Shared cluster ID.
     */
    public void setSharedClusterId(String SharedClusterId) {
        this.SharedClusterId = SharedClusterId;
    }

    /**
     * Get Shared cluster ID description. 
     * @return SharedClusterIdDesc Shared cluster ID description.
     */
    public String getSharedClusterIdDesc() {
        return this.SharedClusterIdDesc;
    }

    /**
     * Set Shared cluster ID description.
     * @param SharedClusterIdDesc Shared cluster ID description.
     */
    public void setSharedClusterIdDesc(String SharedClusterIdDesc) {
        this.SharedClusterIdDesc = SharedClusterIdDesc;
    }

    /**
     * Get Whether the resource is set for scheduled termination. 
     * @return TimingResource Whether the resource is set for scheduled termination.
     */
    public Boolean getTimingResource() {
        return this.TimingResource;
    }

    /**
     * Set Whether the resource is set for scheduled termination.
     * @param TimingResource Whether the resource is set for scheduled termination.
     */
    public void setTimingResource(Boolean TimingResource) {
        this.TimingResource = TimingResource;
    }

    /**
     * Get Corresponding TKE cluster ID in the case that the resource type (HardwareResourceType) is pod. 
     * @return TkeClusterId Corresponding TKE cluster ID in the case that the resource type (HardwareResourceType) is pod.
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set Corresponding TKE cluster ID in the case that the resource type (HardwareResourceType) is pod.
     * @param TkeClusterId Corresponding TKE cluster ID in the case that the resource type (HardwareResourceType) is pod.
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get Name list of services that can be configured when a new disk is mounted. 
     * @return ConfigurableServices Name list of services that can be configured when a new disk is mounted.
     */
    public String [] getConfigurableServices() {
        return this.ConfigurableServices;
    }

    /**
     * Set Name list of services that can be configured when a new disk is mounted.
     * @param ConfigurableServices Name list of services that can be configured when a new disk is mounted.
     */
    public void setConfigurableServices(String [] ConfigurableServices) {
        this.ConfigurableServices = ConfigurableServices;
    }

    /**
     * Get Node labeling information: currently used only in the Terraform. 
     * @return NodeMark Node labeling information: currently used only in the Terraform.
     */
    public String getNodeMark() {
        return this.NodeMark;
    }

    /**
     * Set Node labeling information: currently used only in the Terraform.
     * @param NodeMark Node labeling information: currently used only in the Terraform.
     */
    public void setNodeMark(String NodeMark) {
        this.NodeMark = NodeMark;
    }

    /**
     * Get Whether auto-renewal is available for committed use resources. 
     * @return UnderwriteSetAutoRenew Whether auto-renewal is available for committed use resources.
     */
    public Boolean getUnderwriteSetAutoRenew() {
        return this.UnderwriteSetAutoRenew;
    }

    /**
     * Set Whether auto-renewal is available for committed use resources.
     * @param UnderwriteSetAutoRenew Whether auto-renewal is available for committed use resources.
     */
    public void setUnderwriteSetAutoRenew(Boolean UnderwriteSetAutoRenew) {
        this.UnderwriteSetAutoRenew = UnderwriteSetAutoRenew;
    }

    /**
     * Get GPU information. 
     * @return GpuDesc GPU information.
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set GPU information.
     * @param GpuDesc GPU information.
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
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
        if (source.ServicesStatus != null) {
            this.ServicesStatus = new String(source.ServicesStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SharedClusterId != null) {
            this.SharedClusterId = new String(source.SharedClusterId);
        }
        if (source.SharedClusterIdDesc != null) {
            this.SharedClusterIdDesc = new String(source.SharedClusterIdDesc);
        }
        if (source.TimingResource != null) {
            this.TimingResource = new Boolean(source.TimingResource);
        }
        if (source.TkeClusterId != null) {
            this.TkeClusterId = new String(source.TkeClusterId);
        }
        if (source.ConfigurableServices != null) {
            this.ConfigurableServices = new String[source.ConfigurableServices.length];
            for (int i = 0; i < source.ConfigurableServices.length; i++) {
                this.ConfigurableServices[i] = new String(source.ConfigurableServices[i]);
            }
        }
        if (source.NodeMark != null) {
            this.NodeMark = new String(source.NodeMark);
        }
        if (source.UnderwriteSetAutoRenew != null) {
            this.UnderwriteSetAutoRenew = new Boolean(source.UnderwriteSetAutoRenew);
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
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
        this.setParamSimple(map, prefix + "ServicesStatus", this.ServicesStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SharedClusterId", this.SharedClusterId);
        this.setParamSimple(map, prefix + "SharedClusterIdDesc", this.SharedClusterIdDesc);
        this.setParamSimple(map, prefix + "TimingResource", this.TimingResource);
        this.setParamSimple(map, prefix + "TkeClusterId", this.TkeClusterId);
        this.setParamArraySimple(map, prefix + "ConfigurableServices.", this.ConfigurableServices);
        this.setParamSimple(map, prefix + "NodeMark", this.NodeMark);
        this.setParamSimple(map, prefix + "UnderwriteSetAutoRenew", this.UnderwriteSetAutoRenew);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);

    }
}

