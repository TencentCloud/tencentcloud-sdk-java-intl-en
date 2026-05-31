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

public class CynosdbInstanceDetail extends AbstractModel {

    /**
    * <p>User Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>User AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance status<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: Recovering<br>offlining: Offline<br>offlined: Offline</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Status description in Chinese of the instance</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Status of the serverless instance. Possible value:<br>resume<br>pause</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>Database type.</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Database version</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Cpu, unit: cores</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory, unit: GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Stored amount, unit: GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Current instance role</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Payment mode</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Instance expiration time</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>Network type.</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance private IP address</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Instance Intranet Port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Instance public network domain name</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>Character set</p>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * <p>Cynos kernel version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>Renewal flag</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>serverless instance cpu minimum</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>cpu cap of the serverless instance</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>Db type:<li>NORMAL</li><li>SERVERLESS</li></p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Cluster read/write instance Availability Zone</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
     * Get <p>User Uin</p> 
     * @return Uin <p>User Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User Uin</p>
     * @param Uin <p>User Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>User AppId</p> 
     * @return AppId <p>User AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User AppId</p>
     * @param AppId <p>User AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Region</p> 
     * @return Region <p>Region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
     * @param Region <p>Region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance status<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: Recovering<br>offlining: Offline<br>offlined: Offline</p> 
     * @return Status <p>Instance status<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: Recovering<br>offlining: Offline<br>offlined: Offline</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: Recovering<br>offlining: Offline<br>offlined: Offline</p>
     * @param Status <p>Instance status<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: Recovering<br>offlining: Offline<br>offlined: Offline</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description in Chinese of the instance</p> 
     * @return StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description in Chinese of the instance</p>
     * @param StatusDesc <p>Status description in Chinese of the instance</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Status of the serverless instance. Possible value:<br>resume<br>pause</p> 
     * @return ServerlessStatus <p>Status of the serverless instance. Possible value:<br>resume<br>pause</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>Status of the serverless instance. Possible value:<br>resume<br>pause</p>
     * @param ServerlessStatus <p>Status of the serverless instance. Possible value:<br>resume<br>pause</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>Database type.</p> 
     * @return DbType <p>Database type.</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type.</p>
     * @param DbType <p>Database type.</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Database version</p> 
     * @return DbVersion <p>Database version</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>Database version</p>
     * @param DbVersion <p>Database version</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>Cpu, unit: cores</p> 
     * @return Cpu <p>Cpu, unit: cores</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu, unit: cores</p>
     * @param Cpu <p>Cpu, unit: cores</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory, unit: GB</p> 
     * @return Memory <p>Memory, unit: GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory, unit: GB</p>
     * @param Memory <p>Memory, unit: GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Stored amount, unit: GB</p> 
     * @return Storage <p>Stored amount, unit: GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Stored amount, unit: GB</p>
     * @param Storage <p>Stored amount, unit: GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Instance type</p> 
     * @return InstanceType <p>Instance type</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p>
     * @param InstanceType <p>Instance type</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Current instance role</p> 
     * @return InstanceRole <p>Current instance role</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Current instance role</p>
     * @param InstanceRole <p>Current instance role</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Payment mode</p> 
     * @return PayMode <p>Payment mode</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode</p>
     * @param PayMode <p>Payment mode</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Instance expiration time</p> 
     * @return PeriodEndTime <p>Instance expiration time</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>Instance expiration time</p>
     * @param PeriodEndTime <p>Instance expiration time</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>Network type.</p> 
     * @return NetType <p>Network type.</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type.</p>
     * @param NetType <p>Network type.</p>
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>VPC network ID</p> 
     * @return VpcId <p>VPC network ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC network ID</p>
     * @param VpcId <p>VPC network ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance private IP address</p> 
     * @return Vip <p>Instance private IP address</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Instance private IP address</p>
     * @param Vip <p>Instance private IP address</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Instance Intranet Port</p> 
     * @return Vport <p>Instance Intranet Port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Instance Intranet Port</p>
     * @param Vport <p>Instance Intranet Port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Instance public network domain name</p> 
     * @return WanDomain <p>Instance public network domain name</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>Instance public network domain name</p>
     * @param WanDomain <p>Instance public network domain name</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>Character set</p> 
     * @return Charset <p>Character set</p>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set <p>Character set</p>
     * @param Charset <p>Character set</p>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get <p>Cynos kernel version</p> 
     * @return CynosVersion <p>Cynos kernel version</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>Cynos kernel version</p>
     * @param CynosVersion <p>Cynos kernel version</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>Renewal flag</p> 
     * @return RenewFlag <p>Renewal flag</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag</p>
     * @param RenewFlag <p>Renewal flag</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>serverless instance cpu minimum</p> 
     * @return MinCpu <p>serverless instance cpu minimum</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>serverless instance cpu minimum</p>
     * @param MinCpu <p>serverless instance cpu minimum</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>cpu cap of the serverless instance</p> 
     * @return MaxCpu <p>cpu cap of the serverless instance</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>cpu cap of the serverless instance</p>
     * @param MaxCpu <p>cpu cap of the serverless instance</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>Db type:<li>NORMAL</li><li>SERVERLESS</li></p> 
     * @return DbMode <p>Db type:<li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db type:<li>NORMAL</li><li>SERVERLESS</li></p>
     * @param DbMode <p>Db type:<li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Cluster read/write instance Availability Zone</p> 
     * @return MasterZone <p>Cluster read/write instance Availability Zone</p>
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>Cluster read/write instance Availability Zone</p>
     * @param MasterZone <p>Cluster read/write instance Availability Zone</p>
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    public CynosdbInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceDetail(CynosdbInstanceDetail source) {
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
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
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
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
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
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
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
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);

    }
}

