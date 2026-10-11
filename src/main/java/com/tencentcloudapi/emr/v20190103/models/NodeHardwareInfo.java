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
    * <p>User APPID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Serial number.</p>
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * <p>Machine instance ID.</p>
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * <p>Public IP address bound to the Master node.</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>Node type. Valid values: 0 (Common node), 1 (Master node)<br>2 (Core node) and 3 (Task node).</p>
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * <p>Node specifications.</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>Number of node cores.</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>Node memory (bytes).</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Node memory description (GB).</p>
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * <p>Region where the node is located.</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>Zone where the node is located.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Application time.</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * <p>Release time.</p>
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * <p>Hard disk size.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * <p>Node description.</p>
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * <p>Services deployed on the node.</p>
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * <p>Disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>System disk size (GB).</p>
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * <p>Payment type. Valid values: 0 (pay-as-you-go) and 1 (yearly/monthly subscription).</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * <p>Database IP address.</p>
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * <p>Database port.</p>
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * <p>Hard disk capacity (bytes).</p>
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * <p>Hard disk capacity description.</p>
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * <p>Memory capacity (bytes).</p>
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * <p>Memory capacity description.</p>
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * <p>Expiration time.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Node resource ID.</p>
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * <p>Renewal flag.</p>
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * <p>Device identifier.</p>
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * <p>Supports configuration change.</p>
    */
    @SerializedName("Mutable")
    @Expose
    private Long Mutable;

    /**
    * <p>Multi-cloud disk.</p>
    */
    @SerializedName("MCMultiDisk")
    @Expose
    private MultiDiskMC [] MCMultiDisk;

    /**
    * <p>Database information.</p>
    */
    @SerializedName("CdbNodeInfo")
    @Expose
    private CdbInfo CdbNodeInfo;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Whether this node can be terminated. Valid values: 1 (yes) and 0 (no).</p>
    */
    @SerializedName("Destroyable")
    @Expose
    private Long Destroyable;

    /**
    * <p>Tag bound to the node.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Whether it is an auto scaling node. Valid values: 0 (regular node) and 1 (auto scaling node).</p>
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * <p>Resource type. Valid values: host and pod.</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>Whether it is a floating specification. Valid values: 1 (yes) and 0 (no).</p>
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * <p>JSON string of the floating specification value.</p>
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * <p>Whether changing the billing mode is supported. Valid values: 1 (yes) and 0 (no).</p>
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * <p>System disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * <p>AZ information.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Subnet.</p>
    */
    @SerializedName("SubnetInfo")
    @Expose
    private SubnetInfo SubnetInfo;

    /**
    * <p>Client.</p>
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
    * <p>Current system time.</p>
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * <p>Whether it is used for federation. Valid values: 1 (yes) and 0 (no).</p>
    */
    @SerializedName("IsFederation")
    @Expose
    private Long IsFederation;

    /**
    * <p>Device name.</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>Service.</p>
    */
    @SerializedName("ServiceClient")
    @Expose
    private String ServiceClient;

    /**
    * <p>Whether instance protection is enabled for this instance. Valid values: true (enabled) and false (disabled).</p>
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * <p>0 indicates the old billing mode, and 1 indicates the new billing mode.</p>
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * <p>Status of each component. ZooKeeper: STARTED; ResourceManager: STARTED. STARTED means started, and STOPPED means stopped.</p>
    */
    @SerializedName("ServicesStatus")
    @Expose
    private String ServicesStatus;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Shared cluster ID.</p>
    */
    @SerializedName("SharedClusterId")
    @Expose
    private String SharedClusterId;

    /**
    * <p>Description of the shared cluster ID.</p>
    */
    @SerializedName("SharedClusterIdDesc")
    @Expose
    private String SharedClusterIdDesc;

    /**
    * <p>Whether it is a scheduled termination resource.</p>
    */
    @SerializedName("TimingResource")
    @Expose
    private Boolean TimingResource;

    /**
    * <p>TKE cluster ID when the resource type (HardwareResourceType) is pod.</p>
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * <p>Name list of services that can be configured when a new disk is mounted.</p>
    */
    @SerializedName("ConfigurableServices")
    @Expose
    private String [] ConfigurableServices;

    /**
    * <p>Node annotation information, which is currently only provided for the Terraform platform.</p>
    */
    @SerializedName("NodeMark")
    @Expose
    private String NodeMark;

    /**
    * <p>Whether the committed use resource supports setting auto-renewal.</p>
    */
    @SerializedName("UnderwriteSetAutoRenew")
    @Expose
    private Boolean UnderwriteSetAutoRenew;

    /**
    * <p>GPU information.</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>Disk issue description.</p>
    */
    @SerializedName("DiskHealthIssues")
    @Expose
    private DiskHealthIssue [] DiskHealthIssues;

    /**
    * <p>ID of the node group where the node resides.</p>
    */
    @SerializedName("NodeGroupId")
    @Expose
    private String NodeGroupId;

    /**
    * <p>Name of the node group where the node resides.</p>
    */
    @SerializedName("NodeGroupName")
    @Expose
    private String NodeGroupName;

    /**
     * Get <p>User APPID.</p> 
     * @return AppId <p>User APPID.</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User APPID.</p>
     * @param AppId <p>User APPID.</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Serial number.</p> 
     * @return SerialNo <p>Serial number.</p>
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set <p>Serial number.</p>
     * @param SerialNo <p>Serial number.</p>
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get <p>Machine instance ID.</p> 
     * @return OrderNo <p>Machine instance ID.</p>
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set <p>Machine instance ID.</p>
     * @param OrderNo <p>Machine instance ID.</p>
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get <p>Public IP address bound to the Master node.</p> 
     * @return WanIp <p>Public IP address bound to the Master node.</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>Public IP address bound to the Master node.</p>
     * @param WanIp <p>Public IP address bound to the Master node.</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>Node type. Valid values: 0 (Common node), 1 (Master node)<br>2 (Core node) and 3 (Task node).</p> 
     * @return Flag <p>Node type. Valid values: 0 (Common node), 1 (Master node)<br>2 (Core node) and 3 (Task node).</p>
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>Node type. Valid values: 0 (Common node), 1 (Master node)<br>2 (Core node) and 3 (Task node).</p>
     * @param Flag <p>Node type. Valid values: 0 (Common node), 1 (Master node)<br>2 (Core node) and 3 (Task node).</p>
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>Node specifications.</p> 
     * @return Spec <p>Node specifications.</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>Node specifications.</p>
     * @param Spec <p>Node specifications.</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>Number of node cores.</p> 
     * @return CpuNum <p>Number of node cores.</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>Number of node cores.</p>
     * @param CpuNum <p>Number of node cores.</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>Node memory (bytes).</p> 
     * @return MemSize <p>Node memory (bytes).</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Node memory (bytes).</p>
     * @param MemSize <p>Node memory (bytes).</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Node memory description (GB).</p> 
     * @return MemDesc <p>Node memory description (GB).</p>
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set <p>Node memory description (GB).</p>
     * @param MemDesc <p>Node memory description (GB).</p>
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get <p>Region where the node is located.</p> 
     * @return RegionId <p>Region where the node is located.</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region where the node is located.</p>
     * @param RegionId <p>Region where the node is located.</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Zone where the node is located.</p> 
     * @return ZoneId <p>Zone where the node is located.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone where the node is located.</p>
     * @param ZoneId <p>Zone where the node is located.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Application time.</p> 
     * @return ApplyTime <p>Application time.</p>
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>Application time.</p>
     * @param ApplyTime <p>Application time.</p>
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>Release time.</p> 
     * @return FreeTime <p>Release time.</p>
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set <p>Release time.</p>
     * @param FreeTime <p>Release time.</p>
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get <p>Hard disk size.</p> 
     * @return DiskSize <p>Hard disk size.</p>
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Hard disk size.</p>
     * @param DiskSize <p>Hard disk size.</p>
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Node description.</p> 
     * @return NameTag <p>Node description.</p>
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set <p>Node description.</p>
     * @param NameTag <p>Node description.</p>
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get <p>Services deployed on the node.</p> 
     * @return Services <p>Services deployed on the node.</p>
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set <p>Services deployed on the node.</p>
     * @param Services <p>Services deployed on the node.</p>
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get <p>Disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p> 
     * @return StorageType <p>Disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     * @param StorageType <p>Disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>System disk size (GB).</p> 
     * @return RootSize <p>System disk size (GB).</p>
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set <p>System disk size (GB).</p>
     * @param RootSize <p>System disk size (GB).</p>
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get <p>Payment type. Valid values: 0 (pay-as-you-go) and 1 (yearly/monthly subscription).</p> 
     * @return ChargeType <p>Payment type. Valid values: 0 (pay-as-you-go) and 1 (yearly/monthly subscription).</p>
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>Payment type. Valid values: 0 (pay-as-you-go) and 1 (yearly/monthly subscription).</p>
     * @param ChargeType <p>Payment type. Valid values: 0 (pay-as-you-go) and 1 (yearly/monthly subscription).</p>
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>Database IP address.</p> 
     * @return CdbIp <p>Database IP address.</p>
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set <p>Database IP address.</p>
     * @param CdbIp <p>Database IP address.</p>
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get <p>Database port.</p> 
     * @return CdbPort <p>Database port.</p>
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set <p>Database port.</p>
     * @param CdbPort <p>Database port.</p>
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get <p>Hard disk capacity (bytes).</p> 
     * @return HwDiskSize <p>Hard disk capacity (bytes).</p>
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set <p>Hard disk capacity (bytes).</p>
     * @param HwDiskSize <p>Hard disk capacity (bytes).</p>
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get <p>Hard disk capacity description.</p> 
     * @return HwDiskSizeDesc <p>Hard disk capacity description.</p>
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set <p>Hard disk capacity description.</p>
     * @param HwDiskSizeDesc <p>Hard disk capacity description.</p>
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get <p>Memory capacity (bytes).</p> 
     * @return HwMemSize <p>Memory capacity (bytes).</p>
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set <p>Memory capacity (bytes).</p>
     * @param HwMemSize <p>Memory capacity (bytes).</p>
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get <p>Memory capacity description.</p> 
     * @return HwMemSizeDesc <p>Memory capacity description.</p>
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set <p>Memory capacity description.</p>
     * @param HwMemSizeDesc <p>Memory capacity description.</p>
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get <p>Expiration time.</p> 
     * @return ExpireTime <p>Expiration time.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiration time.</p>
     * @param ExpireTime <p>Expiration time.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Node resource ID.</p> 
     * @return EmrResourceId <p>Node resource ID.</p>
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set <p>Node resource ID.</p>
     * @param EmrResourceId <p>Node resource ID.</p>
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get <p>Renewal flag.</p> 
     * @return IsAutoRenew <p>Renewal flag.</p>
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set <p>Renewal flag.</p>
     * @param IsAutoRenew <p>Renewal flag.</p>
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get <p>Device identifier.</p> 
     * @return DeviceClass <p>Device identifier.</p>
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set <p>Device identifier.</p>
     * @param DeviceClass <p>Device identifier.</p>
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get <p>Supports configuration change.</p> 
     * @return Mutable <p>Supports configuration change.</p>
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set <p>Supports configuration change.</p>
     * @param Mutable <p>Supports configuration change.</p>
     */
    public void setMutable(Long Mutable) {
        this.Mutable = Mutable;
    }

    /**
     * Get <p>Multi-cloud disk.</p> 
     * @return MCMultiDisk <p>Multi-cloud disk.</p>
     */
    public MultiDiskMC [] getMCMultiDisk() {
        return this.MCMultiDisk;
    }

    /**
     * Set <p>Multi-cloud disk.</p>
     * @param MCMultiDisk <p>Multi-cloud disk.</p>
     */
    public void setMCMultiDisk(MultiDiskMC [] MCMultiDisk) {
        this.MCMultiDisk = MCMultiDisk;
    }

    /**
     * Get <p>Database information.</p> 
     * @return CdbNodeInfo <p>Database information.</p>
     */
    public CdbInfo getCdbNodeInfo() {
        return this.CdbNodeInfo;
    }

    /**
     * Set <p>Database information.</p>
     * @param CdbNodeInfo <p>Database information.</p>
     */
    public void setCdbNodeInfo(CdbInfo CdbNodeInfo) {
        this.CdbNodeInfo = CdbNodeInfo;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return Ip <p>Private IP address.</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param Ip <p>Private IP address.</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Whether this node can be terminated. Valid values: 1 (yes) and 0 (no).</p> 
     * @return Destroyable <p>Whether this node can be terminated. Valid values: 1 (yes) and 0 (no).</p>
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set <p>Whether this node can be terminated. Valid values: 1 (yes) and 0 (no).</p>
     * @param Destroyable <p>Whether this node can be terminated. Valid values: 1 (yes) and 0 (no).</p>
     */
    public void setDestroyable(Long Destroyable) {
        this.Destroyable = Destroyable;
    }

    /**
     * Get <p>Tag bound to the node.</p> 
     * @return Tags <p>Tag bound to the node.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag bound to the node.</p>
     * @param Tags <p>Tag bound to the node.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Whether it is an auto scaling node. Valid values: 0 (regular node) and 1 (auto scaling node).</p> 
     * @return AutoFlag <p>Whether it is an auto scaling node. Valid values: 0 (regular node) and 1 (auto scaling node).</p>
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set <p>Whether it is an auto scaling node. Valid values: 0 (regular node) and 1 (auto scaling node).</p>
     * @param AutoFlag <p>Whether it is an auto scaling node. Valid values: 0 (regular node) and 1 (auto scaling node).</p>
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get <p>Resource type. Valid values: host and pod.</p> 
     * @return HardwareResourceType <p>Resource type. Valid values: host and pod.</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>Resource type. Valid values: host and pod.</p>
     * @param HardwareResourceType <p>Resource type. Valid values: host and pod.</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>Whether it is a floating specification. Valid values: 1 (yes) and 0 (no).</p> 
     * @return IsDynamicSpec <p>Whether it is a floating specification. Valid values: 1 (yes) and 0 (no).</p>
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set <p>Whether it is a floating specification. Valid values: 1 (yes) and 0 (no).</p>
     * @param IsDynamicSpec <p>Whether it is a floating specification. Valid values: 1 (yes) and 0 (no).</p>
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get <p>JSON string of the floating specification value.</p> 
     * @return DynamicPodSpec <p>JSON string of the floating specification value.</p>
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set <p>JSON string of the floating specification value.</p>
     * @param DynamicPodSpec <p>JSON string of the floating specification value.</p>
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get <p>Whether changing the billing mode is supported. Valid values: 1 (yes) and 0 (no).</p> 
     * @return SupportModifyPayMode <p>Whether changing the billing mode is supported. Valid values: 1 (yes) and 0 (no).</p>
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set <p>Whether changing the billing mode is supported. Valid values: 1 (yes) and 0 (no).</p>
     * @param SupportModifyPayMode <p>Whether changing the billing mode is supported. Valid values: 1 (yes) and 0 (no).</p>
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get <p>System disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p> 
     * @return RootStorageType <p>System disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set <p>System disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     * @param RootStorageType <p>System disk type. Valid values: 1 (Local Basic Disk), 2 (Cloud Basic Disk), 3 (Local SSD), 4 (Cloud SSD), 5 (Premium Disk), 6 (Enhanced SSD), 11 (Throughput-Optimized Cloud Disk), 12 (Tremendous SSD), 13 (Balanced SSD), 14 (Big Data Cloud Disk), 15 (High-IO Cloud Disk), and 16 (Remote SSD Disk).</p>
     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get <p>AZ information.</p> 
     * @return Zone <p>AZ information.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ information.</p>
     * @param Zone <p>AZ information.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Subnet.</p> 
     * @return SubnetInfo <p>Subnet.</p>
     */
    public SubnetInfo getSubnetInfo() {
        return this.SubnetInfo;
    }

    /**
     * Set <p>Subnet.</p>
     * @param SubnetInfo <p>Subnet.</p>
     */
    public void setSubnetInfo(SubnetInfo SubnetInfo) {
        this.SubnetInfo = SubnetInfo;
    }

    /**
     * Get <p>Client.</p> 
     * @return Clients <p>Client.</p>
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set <p>Client.</p>
     * @param Clients <p>Client.</p>
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
    }

    /**
     * Get <p>Current system time.</p> 
     * @return CurrentTime <p>Current system time.</p>
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set <p>Current system time.</p>
     * @param CurrentTime <p>Current system time.</p>
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get <p>Whether it is used for federation. Valid values: 1 (yes) and 0 (no).</p> 
     * @return IsFederation <p>Whether it is used for federation. Valid values: 1 (yes) and 0 (no).</p>
     */
    public Long getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set <p>Whether it is used for federation. Valid values: 1 (yes) and 0 (no).</p>
     * @param IsFederation <p>Whether it is used for federation. Valid values: 1 (yes) and 0 (no).</p>
     */
    public void setIsFederation(Long IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get <p>Device name.</p> 
     * @return DeviceName <p>Device name.</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>Device name.</p>
     * @param DeviceName <p>Device name.</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>Service.</p> 
     * @return ServiceClient <p>Service.</p>
     */
    public String getServiceClient() {
        return this.ServiceClient;
    }

    /**
     * Set <p>Service.</p>
     * @param ServiceClient <p>Service.</p>
     */
    public void setServiceClient(String ServiceClient) {
        this.ServiceClient = ServiceClient;
    }

    /**
     * Get <p>Whether instance protection is enabled for this instance. Valid values: true (enabled) and false (disabled).</p> 
     * @return DisableApiTermination <p>Whether instance protection is enabled for this instance. Valid values: true (enabled) and false (disabled).</p>
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set <p>Whether instance protection is enabled for this instance. Valid values: true (enabled) and false (disabled).</p>
     * @param DisableApiTermination <p>Whether instance protection is enabled for this instance. Valid values: true (enabled) and false (disabled).</p>
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get <p>0 indicates the old billing mode, and 1 indicates the new billing mode.</p> 
     * @return TradeVersion <p>0 indicates the old billing mode, and 1 indicates the new billing mode.</p>
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set <p>0 indicates the old billing mode, and 1 indicates the new billing mode.</p>
     * @param TradeVersion <p>0 indicates the old billing mode, and 1 indicates the new billing mode.</p>
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get <p>Status of each component. ZooKeeper: STARTED; ResourceManager: STARTED. STARTED means started, and STOPPED means stopped.</p> 
     * @return ServicesStatus <p>Status of each component. ZooKeeper: STARTED; ResourceManager: STARTED. STARTED means started, and STOPPED means stopped.</p>
     */
    public String getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set <p>Status of each component. ZooKeeper: STARTED; ResourceManager: STARTED. STARTED means started, and STOPPED means stopped.</p>
     * @param ServicesStatus <p>Status of each component. ZooKeeper: STARTED; ResourceManager: STARTED. STARTED means started, and STOPPED means stopped.</p>
     */
    public void setServicesStatus(String ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Shared cluster ID.</p> 
     * @return SharedClusterId <p>Shared cluster ID.</p>
     */
    public String getSharedClusterId() {
        return this.SharedClusterId;
    }

    /**
     * Set <p>Shared cluster ID.</p>
     * @param SharedClusterId <p>Shared cluster ID.</p>
     */
    public void setSharedClusterId(String SharedClusterId) {
        this.SharedClusterId = SharedClusterId;
    }

    /**
     * Get <p>Description of the shared cluster ID.</p> 
     * @return SharedClusterIdDesc <p>Description of the shared cluster ID.</p>
     */
    public String getSharedClusterIdDesc() {
        return this.SharedClusterIdDesc;
    }

    /**
     * Set <p>Description of the shared cluster ID.</p>
     * @param SharedClusterIdDesc <p>Description of the shared cluster ID.</p>
     */
    public void setSharedClusterIdDesc(String SharedClusterIdDesc) {
        this.SharedClusterIdDesc = SharedClusterIdDesc;
    }

    /**
     * Get <p>Whether it is a scheduled termination resource.</p> 
     * @return TimingResource <p>Whether it is a scheduled termination resource.</p>
     */
    public Boolean getTimingResource() {
        return this.TimingResource;
    }

    /**
     * Set <p>Whether it is a scheduled termination resource.</p>
     * @param TimingResource <p>Whether it is a scheduled termination resource.</p>
     */
    public void setTimingResource(Boolean TimingResource) {
        this.TimingResource = TimingResource;
    }

    /**
     * Get <p>TKE cluster ID when the resource type (HardwareResourceType) is pod.</p> 
     * @return TkeClusterId <p>TKE cluster ID when the resource type (HardwareResourceType) is pod.</p>
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set <p>TKE cluster ID when the resource type (HardwareResourceType) is pod.</p>
     * @param TkeClusterId <p>TKE cluster ID when the resource type (HardwareResourceType) is pod.</p>
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get <p>Name list of services that can be configured when a new disk is mounted.</p> 
     * @return ConfigurableServices <p>Name list of services that can be configured when a new disk is mounted.</p>
     */
    public String [] getConfigurableServices() {
        return this.ConfigurableServices;
    }

    /**
     * Set <p>Name list of services that can be configured when a new disk is mounted.</p>
     * @param ConfigurableServices <p>Name list of services that can be configured when a new disk is mounted.</p>
     */
    public void setConfigurableServices(String [] ConfigurableServices) {
        this.ConfigurableServices = ConfigurableServices;
    }

    /**
     * Get <p>Node annotation information, which is currently only provided for the Terraform platform.</p> 
     * @return NodeMark <p>Node annotation information, which is currently only provided for the Terraform platform.</p>
     */
    public String getNodeMark() {
        return this.NodeMark;
    }

    /**
     * Set <p>Node annotation information, which is currently only provided for the Terraform platform.</p>
     * @param NodeMark <p>Node annotation information, which is currently only provided for the Terraform platform.</p>
     */
    public void setNodeMark(String NodeMark) {
        this.NodeMark = NodeMark;
    }

    /**
     * Get <p>Whether the committed use resource supports setting auto-renewal.</p> 
     * @return UnderwriteSetAutoRenew <p>Whether the committed use resource supports setting auto-renewal.</p>
     */
    public Boolean getUnderwriteSetAutoRenew() {
        return this.UnderwriteSetAutoRenew;
    }

    /**
     * Set <p>Whether the committed use resource supports setting auto-renewal.</p>
     * @param UnderwriteSetAutoRenew <p>Whether the committed use resource supports setting auto-renewal.</p>
     */
    public void setUnderwriteSetAutoRenew(Boolean UnderwriteSetAutoRenew) {
        this.UnderwriteSetAutoRenew = UnderwriteSetAutoRenew;
    }

    /**
     * Get <p>GPU information.</p> 
     * @return GpuDesc <p>GPU information.</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>GPU information.</p>
     * @param GpuDesc <p>GPU information.</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>Disk issue description.</p> 
     * @return DiskHealthIssues <p>Disk issue description.</p>
     */
    public DiskHealthIssue [] getDiskHealthIssues() {
        return this.DiskHealthIssues;
    }

    /**
     * Set <p>Disk issue description.</p>
     * @param DiskHealthIssues <p>Disk issue description.</p>
     */
    public void setDiskHealthIssues(DiskHealthIssue [] DiskHealthIssues) {
        this.DiskHealthIssues = DiskHealthIssues;
    }

    /**
     * Get <p>ID of the node group where the node resides.</p> 
     * @return NodeGroupId <p>ID of the node group where the node resides.</p>
     */
    public String getNodeGroupId() {
        return this.NodeGroupId;
    }

    /**
     * Set <p>ID of the node group where the node resides.</p>
     * @param NodeGroupId <p>ID of the node group where the node resides.</p>
     */
    public void setNodeGroupId(String NodeGroupId) {
        this.NodeGroupId = NodeGroupId;
    }

    /**
     * Get <p>Name of the node group where the node resides.</p> 
     * @return NodeGroupName <p>Name of the node group where the node resides.</p>
     */
    public String getNodeGroupName() {
        return this.NodeGroupName;
    }

    /**
     * Set <p>Name of the node group where the node resides.</p>
     * @param NodeGroupName <p>Name of the node group where the node resides.</p>
     */
    public void setNodeGroupName(String NodeGroupName) {
        this.NodeGroupName = NodeGroupName;
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
        if (source.DiskHealthIssues != null) {
            this.DiskHealthIssues = new DiskHealthIssue[source.DiskHealthIssues.length];
            for (int i = 0; i < source.DiskHealthIssues.length; i++) {
                this.DiskHealthIssues[i] = new DiskHealthIssue(source.DiskHealthIssues[i]);
            }
        }
        if (source.NodeGroupId != null) {
            this.NodeGroupId = new String(source.NodeGroupId);
        }
        if (source.NodeGroupName != null) {
            this.NodeGroupName = new String(source.NodeGroupName);
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
        this.setParamArrayObj(map, prefix + "DiskHealthIssues.", this.DiskHealthIssues);
        this.setParamSimple(map, prefix + "NodeGroupId", this.NodeGroupId);
        this.setParamSimple(map, prefix + "NodeGroupName", this.NodeGroupName);

    }
}

