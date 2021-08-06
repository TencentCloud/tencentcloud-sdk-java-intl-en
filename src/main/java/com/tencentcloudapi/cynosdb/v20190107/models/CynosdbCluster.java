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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbCluster extends AbstractModel{

    /**
    * Cluster status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Database version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of instances
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * User `uin`
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Engine type
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * User `appid`
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Cluster creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Billing mode. 0: pay-as-you-go; 1: monthly subscription
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * End time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Cluster read-write VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Cluster read-write vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * TDSQL-C kernel version
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Storage capacity
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Task in progress
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * Array of tasks in cluster
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Array of tags bound to cluster
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Database type (`NORMAL` or `SERVERLESS`)
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
pause
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * Prepaid cluster storage
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Cluster storage ID used in prepaid storage modification
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Billing mode of cluster storage. Valid values: `0` (postpaid), `1` (prepaid)
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * The minimum storage corresponding to the compute specifications of the cluster
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * The maximum storage corresponding to the compute specifications of the cluster
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
     * Get Cluster status 
     * @return Status Cluster status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status
     * @param Status Cluster status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Database version 
     * @return DbVersion Database version
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version
     * @param DbVersion Database version
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
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
     * Get Number of instances 
     * @return InstanceNum Number of instances
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of instances
     * @param InstanceNum Number of instances
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get User `uin` 
     * @return Uin User `uin`
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User `uin`
     * @param Uin User `uin`
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Engine type 
     * @return DbType Engine type
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type
     * @param DbType Engine type
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get User `appid` 
     * @return AppId User `appid`
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `appid`
     * @param AppId User `appid`
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster status description 
     * @return StatusDesc Cluster status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Cluster status description
     * @param StatusDesc Cluster status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Cluster creation time 
     * @return CreateTime Cluster creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Cluster creation time
     * @param CreateTime Cluster creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Billing mode. 0: pay-as-you-go; 1: monthly subscription 
     * @return PayMode Billing mode. 0: pay-as-you-go; 1: monthly subscription
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 0: pay-as-you-go; 1: monthly subscription
     * @param PayMode Billing mode. 0: pay-as-you-go; 1: monthly subscription
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get End time 
     * @return PeriodEndTime End time
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set End time
     * @param PeriodEndTime End time
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Cluster read-write VIP 
     * @return Vip Cluster read-write VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Cluster read-write VIP
     * @param Vip Cluster read-write VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Cluster read-write vport 
     * @return Vport Cluster read-write vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Cluster read-write vport
     * @param Vport Cluster read-write vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Project ID 
     * @return ProjectID Project ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID
     * @param ProjectID Project ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get TDSQL-C kernel version 
     * @return CynosVersion TDSQL-C kernel version
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set TDSQL-C kernel version
     * @param CynosVersion TDSQL-C kernel version
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get Storage capacity 
     * @return StorageLimit Storage capacity
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage capacity
     * @param StorageLimit Storage capacity
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Renewal flag 
     * @return RenewFlag Renewal flag
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag
     * @param RenewFlag Renewal flag
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Task in progress 
     * @return ProcessingTask Task in progress
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set Task in progress
     * @param ProcessingTask Task in progress
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get Array of tasks in cluster 
     * @return Tasks Array of tasks in cluster
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Array of tasks in cluster
     * @param Tasks Array of tasks in cluster
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Array of tags bound to cluster 
     * @return ResourceTags Array of tags bound to cluster
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tags bound to cluster
     * @param ResourceTags Array of tags bound to cluster
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database type (`NORMAL` or `SERVERLESS`) 
     * @return DbMode Database type (`NORMAL` or `SERVERLESS`)
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type (`NORMAL` or `SERVERLESS`)
     * @param DbMode Database type (`NORMAL` or `SERVERLESS`)
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
pause 
     * @return ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
pause
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
pause
     * @param ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
pause
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get Prepaid cluster storage 
     * @return Storage Prepaid cluster storage
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Prepaid cluster storage
     * @param Storage Prepaid cluster storage
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Cluster storage ID used in prepaid storage modification 
     * @return StorageId Cluster storage ID used in prepaid storage modification
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Cluster storage ID used in prepaid storage modification
     * @param StorageId Cluster storage ID used in prepaid storage modification
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Billing mode of cluster storage. Valid values: `0` (postpaid), `1` (prepaid) 
     * @return StoragePayMode Billing mode of cluster storage. Valid values: `0` (postpaid), `1` (prepaid)
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Billing mode of cluster storage. Valid values: `0` (postpaid), `1` (prepaid)
     * @param StoragePayMode Billing mode of cluster storage. Valid values: `0` (postpaid), `1` (prepaid)
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get The minimum storage corresponding to the compute specifications of the cluster 
     * @return MinStorageSize The minimum storage corresponding to the compute specifications of the cluster
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set The minimum storage corresponding to the compute specifications of the cluster
     * @param MinStorageSize The minimum storage corresponding to the compute specifications of the cluster
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get The maximum storage corresponding to the compute specifications of the cluster 
     * @return MaxStorageSize The maximum storage corresponding to the compute specifications of the cluster
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set The maximum storage corresponding to the compute specifications of the cluster
     * @param MaxStorageSize The maximum storage corresponding to the compute specifications of the cluster
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    public CynosdbCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbCluster(CynosdbCluster source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
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
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);

    }
}

