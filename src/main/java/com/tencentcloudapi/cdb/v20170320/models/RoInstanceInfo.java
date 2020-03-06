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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoInstanceInfo extends AbstractModel{

    /**
    * Master instance ID corresponding to the RO group
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * RO instance status in the RO group. Value range: online, offline
    */
    @SerializedName("RoStatus")
    @Expose
    private String RoStatus;

    /**
    * Last deactivation time of a RO instance in the RO group
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * RO instance weight in the RO group
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * RO instance region name, such as ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Name of RO AZ, such as ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * RO instance ID in the format of cdbro-c1nl9rpv
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * RO instance status. Value range: 0 (creating), 1 (running), 4 (deleting)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance type. Value range: 1 (master), 2 (disaster recovery), 3 (read-only)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * RO instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Pay-as-you-go billing status. Value range: 1 (normal), 2 (in arrears)
    */
    @SerializedName("HourFeeStatus")
    @Expose
    private Long HourFeeStatus;

    /**
    * RO instance task status. Value range: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - activating slave <br>4 - public network access enabled <br>5 - batch operation in progress <br>6 - rolling back <br>7 - public network access not enabled <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built instance <br>13 - dropping table <br>14 - creating and syncing disaster recovery instance
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * RO instance memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * RO instance disk size in GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Queries per second
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Private IP address of the RO instance
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Access port of the RO instance
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * VPC ID of the RO instance
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * VPC subnet ID of the RO instance
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * RO instance specification description. Value range: CUSTOM
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Database engine version of the RO instance. Value range: 5.1, 5.5, 5.6, 5.7
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * RO instance expiration time in the format of yyyy-mm-dd hh:mm:ss. If it is a pay-as-you-go instance, the value of this field is 0000-00-00 00:00:00
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * RO instance billing method. Value range: 0 (monthly subscribed), 1 (pay-as-you-go), 2 (monthly postpaid)
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
     * Get Master instance ID corresponding to the RO group 
     * @return MasterInstanceId Master instance ID corresponding to the RO group
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set Master instance ID corresponding to the RO group
     * @param MasterInstanceId Master instance ID corresponding to the RO group
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get RO instance status in the RO group. Value range: online, offline 
     * @return RoStatus RO instance status in the RO group. Value range: online, offline
     */
    public String getRoStatus() {
        return this.RoStatus;
    }

    /**
     * Set RO instance status in the RO group. Value range: online, offline
     * @param RoStatus RO instance status in the RO group. Value range: online, offline
     */
    public void setRoStatus(String RoStatus) {
        this.RoStatus = RoStatus;
    }

    /**
     * Get Last deactivation time of a RO instance in the RO group 
     * @return OfflineTime Last deactivation time of a RO instance in the RO group
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Last deactivation time of a RO instance in the RO group
     * @param OfflineTime Last deactivation time of a RO instance in the RO group
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get RO instance weight in the RO group 
     * @return Weight RO instance weight in the RO group
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set RO instance weight in the RO group
     * @param Weight RO instance weight in the RO group
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get RO instance region name, such as ap-shanghai 
     * @return Region RO instance region name, such as ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set RO instance region name, such as ap-shanghai
     * @param Region RO instance region name, such as ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Name of RO AZ, such as ap-shanghai-1 
     * @return Zone Name of RO AZ, such as ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Name of RO AZ, such as ap-shanghai-1
     * @param Zone Name of RO AZ, such as ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get RO instance ID in the format of cdbro-c1nl9rpv 
     * @return InstanceId RO instance ID in the format of cdbro-c1nl9rpv
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set RO instance ID in the format of cdbro-c1nl9rpv
     * @param InstanceId RO instance ID in the format of cdbro-c1nl9rpv
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get RO instance status. Value range: 0 (creating), 1 (running), 4 (deleting) 
     * @return Status RO instance status. Value range: 0 (creating), 1 (running), 4 (deleting)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set RO instance status. Value range: 0 (creating), 1 (running), 4 (deleting)
     * @param Status RO instance status. Value range: 0 (creating), 1 (running), 4 (deleting)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance type. Value range: 1 (master), 2 (disaster recovery), 3 (read-only) 
     * @return InstanceType Instance type. Value range: 1 (master), 2 (disaster recovery), 3 (read-only)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Value range: 1 (master), 2 (disaster recovery), 3 (read-only)
     * @param InstanceType Instance type. Value range: 1 (master), 2 (disaster recovery), 3 (read-only)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get RO instance name 
     * @return InstanceName RO instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set RO instance name
     * @param InstanceName RO instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Pay-as-you-go billing status. Value range: 1 (normal), 2 (in arrears) 
     * @return HourFeeStatus Pay-as-you-go billing status. Value range: 1 (normal), 2 (in arrears)
     */
    public Long getHourFeeStatus() {
        return this.HourFeeStatus;
    }

    /**
     * Set Pay-as-you-go billing status. Value range: 1 (normal), 2 (in arrears)
     * @param HourFeeStatus Pay-as-you-go billing status. Value range: 1 (normal), 2 (in arrears)
     */
    public void setHourFeeStatus(Long HourFeeStatus) {
        this.HourFeeStatus = HourFeeStatus;
    }

    /**
     * Get RO instance task status. Value range: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - activating slave <br>4 - public network access enabled <br>5 - batch operation in progress <br>6 - rolling back <br>7 - public network access not enabled <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built instance <br>13 - dropping table <br>14 - creating and syncing disaster recovery instance 
     * @return TaskStatus RO instance task status. Value range: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - activating slave <br>4 - public network access enabled <br>5 - batch operation in progress <br>6 - rolling back <br>7 - public network access not enabled <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built instance <br>13 - dropping table <br>14 - creating and syncing disaster recovery instance
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set RO instance task status. Value range: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - activating slave <br>4 - public network access enabled <br>5 - batch operation in progress <br>6 - rolling back <br>7 - public network access not enabled <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built instance <br>13 - dropping table <br>14 - creating and syncing disaster recovery instance
     * @param TaskStatus RO instance task status. Value range: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - activating slave <br>4 - public network access enabled <br>5 - batch operation in progress <br>6 - rolling back <br>7 - public network access not enabled <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built instance <br>13 - dropping table <br>14 - creating and syncing disaster recovery instance
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get RO instance memory size in MB 
     * @return Memory RO instance memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set RO instance memory size in MB
     * @param Memory RO instance memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get RO instance disk size in GB 
     * @return Volume RO instance disk size in GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set RO instance disk size in GB
     * @param Volume RO instance disk size in GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Queries per second 
     * @return Qps Queries per second
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Queries per second
     * @param Qps Queries per second
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Private IP address of the RO instance 
     * @return Vip Private IP address of the RO instance
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP address of the RO instance
     * @param Vip Private IP address of the RO instance
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Access port of the RO instance 
     * @return Vport Access port of the RO instance
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Access port of the RO instance
     * @param Vport Access port of the RO instance
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get VPC ID of the RO instance 
     * @return VpcId VPC ID of the RO instance
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the RO instance
     * @param VpcId VPC ID of the RO instance
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID of the RO instance 
     * @return SubnetId VPC subnet ID of the RO instance
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID of the RO instance
     * @param SubnetId VPC subnet ID of the RO instance
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get RO instance specification description. Value range: CUSTOM 
     * @return DeviceType RO instance specification description. Value range: CUSTOM
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set RO instance specification description. Value range: CUSTOM
     * @param DeviceType RO instance specification description. Value range: CUSTOM
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Database engine version of the RO instance. Value range: 5.1, 5.5, 5.6, 5.7 
     * @return EngineVersion Database engine version of the RO instance. Value range: 5.1, 5.5, 5.6, 5.7
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Database engine version of the RO instance. Value range: 5.1, 5.5, 5.6, 5.7
     * @param EngineVersion Database engine version of the RO instance. Value range: 5.1, 5.5, 5.6, 5.7
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get RO instance expiration time in the format of yyyy-mm-dd hh:mm:ss. If it is a pay-as-you-go instance, the value of this field is 0000-00-00 00:00:00 
     * @return DeadlineTime RO instance expiration time in the format of yyyy-mm-dd hh:mm:ss. If it is a pay-as-you-go instance, the value of this field is 0000-00-00 00:00:00
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set RO instance expiration time in the format of yyyy-mm-dd hh:mm:ss. If it is a pay-as-you-go instance, the value of this field is 0000-00-00 00:00:00
     * @param DeadlineTime RO instance expiration time in the format of yyyy-mm-dd hh:mm:ss. If it is a pay-as-you-go instance, the value of this field is 0000-00-00 00:00:00
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get RO instance billing method. Value range: 0 (monthly subscribed), 1 (pay-as-you-go), 2 (monthly postpaid) 
     * @return PayType RO instance billing method. Value range: 0 (monthly subscribed), 1 (pay-as-you-go), 2 (monthly postpaid)
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set RO instance billing method. Value range: 0 (monthly subscribed), 1 (pay-as-you-go), 2 (monthly postpaid)
     * @param PayType RO instance billing method. Value range: 0 (monthly subscribed), 1 (pay-as-you-go), 2 (monthly postpaid)
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "RoStatus", this.RoStatus);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HourFeeStatus", this.HourFeeStatus);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);

    }
}

