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

public class DescribeLibraDBInstanceDetailResponse extends AbstractModel {

    /**
    * <p>root account</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Account unique ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Project ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance status.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Status description</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Libra analysis engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * <p>cpu cores</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Storage size</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Storage type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Instance type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance role</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Update time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Creation time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Selling mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodStartTime")
    @Expose
    private String PeriodStartTime;

    /**
    * <p>End time of sale</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Network type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>VPC ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Virtual IP</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Port</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Instance network information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo InstanceNetInfo;

    /**
    * <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Instance node information</p>
    */
    @SerializedName("NodeInfo")
    @Expose
    private LibraDBNodeInfo [] NodeInfo;

    /**
    * <p>Number of instance nodes</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Analyze the information after instance upgrade version</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>root account</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin <p>root account</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>root account</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin <p>root account</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Account unique ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId <p>Account unique ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account unique ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId <p>Account unique ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId <p>Cluster ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId <p>Cluster ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName <p>Cluster name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterName <p>Cluster name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName <p>Instance name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName <p>Instance name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Project ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId <p>Project ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId <p>Project ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance status.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status <p>Instance status.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status <p>Instance status.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc <p>Status description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc <p>Status description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Libra analysis engine version</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibraDBVersion <p>Libra analysis engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set <p>Libra analysis engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibraDBVersion <p>Libra analysis engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get <p>cpu cores</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu <p>cpu cores</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu cores</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu <p>cpu cores</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory size</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory <p>Memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory <p>Memory size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Storage size</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Storage <p>Storage size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Storage size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Storage <p>Storage size</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Storage type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType <p>Storage type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType <p>Storage type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Instance type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType <p>Instance type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType <p>Instance type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Instance role</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceRole <p>Instance role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceRole <p>Instance role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Update time.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime <p>Update time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime <p>Update time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Creation time.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime <p>Creation time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime <p>Creation time.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Selling mode</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode <p>Selling mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Selling mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode <p>Selling mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Start time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodStartTime <p>Start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeriodStartTime() {
        return this.PeriodStartTime;
    }

    /**
     * Set <p>Start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodStartTime <p>Start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodStartTime(String PeriodStartTime) {
        this.PeriodStartTime = PeriodStartTime;
    }

    /**
     * Get <p>End time of sale</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodEndTime <p>End time of sale</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>End time of sale</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodEndTime <p>End time of sale</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag <p>Renewal flag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Network type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetType <p>Network type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetType <p>Network type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>VPC ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId <p>VPC ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId <p>VPC ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId <p>Subnet ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId <p>Subnet ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Virtual IP</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip <p>Virtual IP</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Virtual IP</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip <p>Virtual IP</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Port</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vport <p>Port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vport <p>Port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Instance network information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceNetInfo <p>Instance network information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNetInfo getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>Instance network information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceNetInfo <p>Instance network information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceNetInfo(InstanceNetInfo InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTags <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTags <p>Instance tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Instance node information</p> 
     * @return NodeInfo <p>Instance node information</p>
     */
    public LibraDBNodeInfo [] getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set <p>Instance node information</p>
     * @param NodeInfo <p>Instance node information</p>
     */
    public void setNodeInfo(LibraDBNodeInfo [] NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    /**
     * Get <p>Number of instance nodes</p> 
     * @return NodeCount <p>Number of instance nodes</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>Number of instance nodes</p>
     * @param NodeCount <p>Number of instance nodes</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Analyze the information after instance upgrade version</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnalysisUpgradeVersionInfo <p>Analyze the information after instance upgrade version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>Analyze the information after instance upgrade version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnalysisUpgradeVersionInfo <p>Analyze the information after instance upgrade version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLibraDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBInstanceDetailResponse(DescribeLibraDBInstanceDetailResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
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
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodStartTime != null) {
            this.PeriodStartTime = new String(source.PeriodStartTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo(source.InstanceNetInfo);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.NodeInfo != null) {
            this.NodeInfo = new LibraDBNodeInfo[source.NodeInfo.length];
            for (int i = 0; i < source.NodeInfo.length; i++) {
                this.NodeInfo[i] = new LibraDBNodeInfo(source.NodeInfo[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodStartTime", this.PeriodStartTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamArrayObj(map, prefix + "NodeInfo.", this.NodeInfo);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

