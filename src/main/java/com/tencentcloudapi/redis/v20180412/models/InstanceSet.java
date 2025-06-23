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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSet extends AbstractModel {

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * App ID of a user, which is an application ID that uniquely corresponds to the account ID. Some Tencent Cloud products use this app ID.

    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region ID. <ul><li>1: Guangzhou;</li> <li>4: Shanghai;</li> <li>5: Hong Kong (China);</li> <li>7: Shanghai Finance;</li> <li>8: Beijing;</li> <li>9: Singapore;</li> <li>11: Shenzhen Finance;</li> <li>15: Western United States (Silicon Valley);</li> <li>16: Chengdu;</li> <li>17: Frankfurt;</li> <li>18: Seoul;</li> <li>19: Chongqing;</li> <li>21: Mumbai;</li> <li>22: Eastern United States (Virginia);</li> <li>23: Bangkok;</li> <li>25: Tokyo.</li></ul>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC ID, for example, 75101.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * ID of the subnet under VPC, for example, 46315.
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance VIP.
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Instance port number.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance creation time, for example, in the format of 2020-01-15 10:20:00.
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * Instance memory capacity. Unit: MB (1 MB = 1024 KB).
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * This parameter has been deprecated. Obtain the memory capacity used by the instance through the TCOP API [GetMonitorData](https://intl.cloud.tencent.com/document/product/248/31014?from_cn_redirect=1).
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * Instance type.
- 2: Redis 2.8 Memory Edition (standard architecture).
- 3: CKV 3.2 Memory Edition (standard architecture).
- 4: CKV 3.2 Memory Edition (cluster architecture).
- 5: Redis 2.8 Memory Edition (stand-alone).
- 6: Redis 4.0 Memory Edition (standard architecture).
- 7: Redis 4.0 Memory Edition (cluster architecture).
- 8: Redis 5.0 Memory Edition (standard architecture).
- 9: Redis 5.0 Memory Edition (cluster architecture).
- 15: Redis 6.2 Memory Edition (standard architecture).
- 16: Redis 6.2 Memory Edition (cluster architecture).
- 17: Redis 7.0 Memory Edition (standard architecture).
- 18: Redis 7.0 Memory Edition (cluster architecture).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether the automatic renewal flag is set for an instance. <ul><li>1: set;</li> <li>0: not set.</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Expiration time of a monthly subscription instance.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Product type. <ul><li>standalone: Standard Edition;</li> <li>cluster: Cluster Edition.</li></ul>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * VPC ID, for example, vpc-fk33jsf43kgv.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * ID of the subnet under VPC, for example, subnet-fd3j6l35mm0.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Billing mode. Only pay-as-you-go billing is supported.
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Description of the instance running status, for example, running.
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * Default termination time of isolated instances, for example, in the format of 2020-02-15 10:20:00. By default, a pay-as-you-go instance will be terminated after 2 hours of isolation, and a monthly subscription instance will be terminated after 7 days.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Sub-status returned for an instance in process.
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * Anti-affinity tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Instance node information.
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * Shard size.
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * Number of shards.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Billing ID.
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * Time when an instance starts to be isolated.
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * Read weight of a secondary node.
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * Tag information associated with an instance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * Project name

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * Number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * DTS status (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * Upper limit of the shard bandwidth. Unit: MB.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * Password-free instance flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * Instance read-only flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * For Redis instances, ignore this parameter.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Monitoring version. <ul><li>1m: 1-minute granularity monitoring. This monitoring granularity has been deprecated. For details, see [1-Minute Granularity Will Be Disused](https://www.tencentcloud.com/document/product/239/50440).</li> <li>5s: 5-second granularity monitoring.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * Minimum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * Maximum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * Detailed node information of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * Region information of an instance, for example, ap-guangzhou.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Public network address.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
    * Polaris service address, which is for internal use.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PolarisServer")
    @Expose
    private String PolarisServer;

    /**
    * CDC Redis cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * CDC cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * Current Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * Upgradable Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * Upgradable Cache minor version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

    /**
    * Backup mode. SecondLevelBackup: second-level backup; NormalLevelBackup: normal backup.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get App ID of a user, which is an application ID that uniquely corresponds to the account ID. Some Tencent Cloud products use this app ID.
 
     * @return Appid App ID of a user, which is an application ID that uniquely corresponds to the account ID. Some Tencent Cloud products use this app ID.

     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set App ID of a user, which is an application ID that uniquely corresponds to the account ID. Some Tencent Cloud products use this app ID.

     * @param Appid App ID of a user, which is an application ID that uniquely corresponds to the account ID. Some Tencent Cloud products use this app ID.

     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region ID. <ul><li>1: Guangzhou;</li> <li>4: Shanghai;</li> <li>5: Hong Kong (China);</li> <li>7: Shanghai Finance;</li> <li>8: Beijing;</li> <li>9: Singapore;</li> <li>11: Shenzhen Finance;</li> <li>15: Western United States (Silicon Valley);</li> <li>16: Chengdu;</li> <li>17: Frankfurt;</li> <li>18: Seoul;</li> <li>19: Chongqing;</li> <li>21: Mumbai;</li> <li>22: Eastern United States (Virginia);</li> <li>23: Bangkok;</li> <li>25: Tokyo.</li></ul> 
     * @return RegionId Region ID. <ul><li>1: Guangzhou;</li> <li>4: Shanghai;</li> <li>5: Hong Kong (China);</li> <li>7: Shanghai Finance;</li> <li>8: Beijing;</li> <li>9: Singapore;</li> <li>11: Shenzhen Finance;</li> <li>15: Western United States (Silicon Valley);</li> <li>16: Chengdu;</li> <li>17: Frankfurt;</li> <li>18: Seoul;</li> <li>19: Chongqing;</li> <li>21: Mumbai;</li> <li>22: Eastern United States (Virginia);</li> <li>23: Bangkok;</li> <li>25: Tokyo.</li></ul>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. <ul><li>1: Guangzhou;</li> <li>4: Shanghai;</li> <li>5: Hong Kong (China);</li> <li>7: Shanghai Finance;</li> <li>8: Beijing;</li> <li>9: Singapore;</li> <li>11: Shenzhen Finance;</li> <li>15: Western United States (Silicon Valley);</li> <li>16: Chengdu;</li> <li>17: Frankfurt;</li> <li>18: Seoul;</li> <li>19: Chongqing;</li> <li>21: Mumbai;</li> <li>22: Eastern United States (Virginia);</li> <li>23: Bangkok;</li> <li>25: Tokyo.</li></ul>
     * @param RegionId Region ID. <ul><li>1: Guangzhou;</li> <li>4: Shanghai;</li> <li>5: Hong Kong (China);</li> <li>7: Shanghai Finance;</li> <li>8: Beijing;</li> <li>9: Singapore;</li> <li>11: Shenzhen Finance;</li> <li>15: Western United States (Silicon Valley);</li> <li>16: Chengdu;</li> <li>17: Frankfurt;</li> <li>18: Seoul;</li> <li>19: Chongqing;</li> <li>21: Mumbai;</li> <li>22: Eastern United States (Virginia);</li> <li>23: Bangkok;</li> <li>25: Tokyo.</li></ul>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC ID, for example, 75101. 
     * @return VpcId VPC ID, for example, 75101.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, for example, 75101.
     * @param VpcId VPC ID, for example, 75101.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet under VPC, for example, 46315. 
     * @return SubnetId ID of the subnet under VPC, for example, 46315.
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet under VPC, for example, 46315.
     * @param SubnetId ID of the subnet under VPC, for example, 46315.
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul> 
     * @return Status Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul>
     * @param Status Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance VIP. 
     * @return WanIp Instance VIP.
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Instance VIP.
     * @param WanIp Instance VIP.
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Instance port number. 
     * @return Port Instance port number.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance port number.
     * @param Port Instance port number.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance creation time, for example, in the format of 2020-01-15 10:20:00. 
     * @return Createtime Instance creation time, for example, in the format of 2020-01-15 10:20:00.
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set Instance creation time, for example, in the format of 2020-01-15 10:20:00.
     * @param Createtime Instance creation time, for example, in the format of 2020-01-15 10:20:00.
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get Instance memory capacity. Unit: MB (1 MB = 1024 KB). 
     * @return Size Instance memory capacity. Unit: MB (1 MB = 1024 KB).
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set Instance memory capacity. Unit: MB (1 MB = 1024 KB).
     * @param Size Instance memory capacity. Unit: MB (1 MB = 1024 KB).
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get This parameter has been deprecated. Obtain the memory capacity used by the instance through the TCOP API [GetMonitorData](https://intl.cloud.tencent.com/document/product/248/31014?from_cn_redirect=1). 
     * @return SizeUsed This parameter has been deprecated. Obtain the memory capacity used by the instance through the TCOP API [GetMonitorData](https://intl.cloud.tencent.com/document/product/248/31014?from_cn_redirect=1).
     * @deprecated
     */
    @Deprecated
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set This parameter has been deprecated. Obtain the memory capacity used by the instance through the TCOP API [GetMonitorData](https://intl.cloud.tencent.com/document/product/248/31014?from_cn_redirect=1).
     * @param SizeUsed This parameter has been deprecated. Obtain the memory capacity used by the instance through the TCOP API [GetMonitorData](https://intl.cloud.tencent.com/document/product/248/31014?from_cn_redirect=1).
     * @deprecated
     */
    @Deprecated
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get Instance type.
- 2: Redis 2.8 Memory Edition (standard architecture).
- 3: CKV 3.2 Memory Edition (standard architecture).
- 4: CKV 3.2 Memory Edition (cluster architecture).
- 5: Redis 2.8 Memory Edition (stand-alone).
- 6: Redis 4.0 Memory Edition (standard architecture).
- 7: Redis 4.0 Memory Edition (cluster architecture).
- 8: Redis 5.0 Memory Edition (standard architecture).
- 9: Redis 5.0 Memory Edition (cluster architecture).
- 15: Redis 6.2 Memory Edition (standard architecture).
- 16: Redis 6.2 Memory Edition (cluster architecture).
- 17: Redis 7.0 Memory Edition (standard architecture).
- 18: Redis 7.0 Memory Edition (cluster architecture). 
     * @return Type Instance type.
- 2: Redis 2.8 Memory Edition (standard architecture).
- 3: CKV 3.2 Memory Edition (standard architecture).
- 4: CKV 3.2 Memory Edition (cluster architecture).
- 5: Redis 2.8 Memory Edition (stand-alone).
- 6: Redis 4.0 Memory Edition (standard architecture).
- 7: Redis 4.0 Memory Edition (cluster architecture).
- 8: Redis 5.0 Memory Edition (standard architecture).
- 9: Redis 5.0 Memory Edition (cluster architecture).
- 15: Redis 6.2 Memory Edition (standard architecture).
- 16: Redis 6.2 Memory Edition (cluster architecture).
- 17: Redis 7.0 Memory Edition (standard architecture).
- 18: Redis 7.0 Memory Edition (cluster architecture).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type.
- 2: Redis 2.8 Memory Edition (standard architecture).
- 3: CKV 3.2 Memory Edition (standard architecture).
- 4: CKV 3.2 Memory Edition (cluster architecture).
- 5: Redis 2.8 Memory Edition (stand-alone).
- 6: Redis 4.0 Memory Edition (standard architecture).
- 7: Redis 4.0 Memory Edition (cluster architecture).
- 8: Redis 5.0 Memory Edition (standard architecture).
- 9: Redis 5.0 Memory Edition (cluster architecture).
- 15: Redis 6.2 Memory Edition (standard architecture).
- 16: Redis 6.2 Memory Edition (cluster architecture).
- 17: Redis 7.0 Memory Edition (standard architecture).
- 18: Redis 7.0 Memory Edition (cluster architecture).
     * @param Type Instance type.
- 2: Redis 2.8 Memory Edition (standard architecture).
- 3: CKV 3.2 Memory Edition (standard architecture).
- 4: CKV 3.2 Memory Edition (cluster architecture).
- 5: Redis 2.8 Memory Edition (stand-alone).
- 6: Redis 4.0 Memory Edition (standard architecture).
- 7: Redis 4.0 Memory Edition (cluster architecture).
- 8: Redis 5.0 Memory Edition (standard architecture).
- 9: Redis 5.0 Memory Edition (cluster architecture).
- 15: Redis 6.2 Memory Edition (standard architecture).
- 16: Redis 6.2 Memory Edition (cluster architecture).
- 17: Redis 7.0 Memory Edition (standard architecture).
- 18: Redis 7.0 Memory Edition (cluster architecture).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the automatic renewal flag is set for an instance. <ul><li>1: set;</li> <li>0: not set.</li></ul> 
     * @return AutoRenewFlag Whether the automatic renewal flag is set for an instance. <ul><li>1: set;</li> <li>0: not set.</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether the automatic renewal flag is set for an instance. <ul><li>1: set;</li> <li>0: not set.</li></ul>
     * @param AutoRenewFlag Whether the automatic renewal flag is set for an instance. <ul><li>1: set;</li> <li>0: not set.</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Expiration time of a monthly subscription instance. 
     * @return DeadlineTime Expiration time of a monthly subscription instance.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Expiration time of a monthly subscription instance.
     * @param DeadlineTime Expiration time of a monthly subscription instance.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Engine. Valid values: Redis Community Edition and Tencent Cloud CKV. 
     * @return Engine Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.
     * @param Engine Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Product type. <ul><li>standalone: Standard Edition;</li> <li>cluster: Cluster Edition.</li></ul> 
     * @return ProductType Product type. <ul><li>standalone: Standard Edition;</li> <li>cluster: Cluster Edition.</li></ul>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set Product type. <ul><li>standalone: Standard Edition;</li> <li>cluster: Cluster Edition.</li></ul>
     * @param ProductType Product type. <ul><li>standalone: Standard Edition;</li> <li>cluster: Cluster Edition.</li></ul>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get VPC ID, for example, vpc-fk33jsf43kgv. 
     * @return UniqVpcId VPC ID, for example, vpc-fk33jsf43kgv.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID, for example, vpc-fk33jsf43kgv.
     * @param UniqVpcId VPC ID, for example, vpc-fk33jsf43kgv.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get ID of the subnet under VPC, for example, subnet-fd3j6l35mm0. 
     * @return UniqSubnetId ID of the subnet under VPC, for example, subnet-fd3j6l35mm0.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set ID of the subnet under VPC, for example, subnet-fd3j6l35mm0.
     * @param UniqSubnetId ID of the subnet under VPC, for example, subnet-fd3j6l35mm0.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Billing mode. Only pay-as-you-go billing is supported. 
     * @return BillingMode Billing mode. Only pay-as-you-go billing is supported.
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode. Only pay-as-you-go billing is supported.
     * @param BillingMode Billing mode. Only pay-as-you-go billing is supported.
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Description of the instance running status, for example, running. 
     * @return InstanceTitle Description of the instance running status, for example, running.
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set Description of the instance running status, for example, running.
     * @param InstanceTitle Description of the instance running status, for example, running.
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get Default termination time of isolated instances, for example, in the format of 2020-02-15 10:20:00. By default, a pay-as-you-go instance will be terminated after 2 hours of isolation, and a monthly subscription instance will be terminated after 7 days. 
     * @return OfflineTime Default termination time of isolated instances, for example, in the format of 2020-02-15 10:20:00. By default, a pay-as-you-go instance will be terminated after 2 hours of isolation, and a monthly subscription instance will be terminated after 7 days.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Default termination time of isolated instances, for example, in the format of 2020-02-15 10:20:00. By default, a pay-as-you-go instance will be terminated after 2 hours of isolation, and a monthly subscription instance will be terminated after 7 days.
     * @param OfflineTime Default termination time of isolated instances, for example, in the format of 2020-02-15 10:20:00. By default, a pay-as-you-go instance will be terminated after 2 hours of isolation, and a monthly subscription instance will be terminated after 7 days.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Sub-status returned for an instance in process. 
     * @return SubStatus Sub-status returned for an instance in process.
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Sub-status returned for an instance in process.
     * @param SubStatus Sub-status returned for an instance in process.
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get Anti-affinity tag. 
     * @return Tags Anti-affinity tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Anti-affinity tag.
     * @param Tags Anti-affinity tag.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance node information. 
     * @return InstanceNode Instance node information.
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set Instance node information.
     * @param InstanceNode Instance node information.
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get Shard size. 
     * @return RedisShardSize Shard size.
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set Shard size.
     * @param RedisShardSize Shard size.
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get Number of shards. 
     * @return RedisShardNum Number of shards.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards.
     * @param RedisShardNum Number of shards.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas. 
     * @return RedisReplicasNum Number of replicas.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas.
     * @param RedisReplicasNum Number of replicas.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Billing ID. 
     * @return PriceId Billing ID.
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set Billing ID.
     * @param PriceId Billing ID.
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get Time when an instance starts to be isolated. 
     * @return CloseTime Time when an instance starts to be isolated.
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set Time when an instance starts to be isolated.
     * @param CloseTime Time when an instance starts to be isolated.
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get Read weight of a secondary node. 
     * @return SlaveReadWeight Read weight of a secondary node.
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set Read weight of a secondary node.
     * @param SlaveReadWeight Read weight of a secondary node.
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get Tag information associated with an instance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceTags Tag information associated with an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set Tag information associated with an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceTags Tag information associated with an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get Project name

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project name

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name

Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project name

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NoAuth Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NoAuth Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get Number of client connections.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClientLimit Number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set Number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClientLimit Number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get DTS status (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DtsStatus DTS status (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set DTS status (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DtsStatus DTS status (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get Upper limit of the shard bandwidth. Unit: MB.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NetLimit Upper limit of the shard bandwidth. Unit: MB.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set Upper limit of the shard bandwidth. Unit: MB.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NetLimit Upper limit of the shard bandwidth. Unit: MB.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get Password-free instance flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PasswordFree Password-free instance flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set Password-free instance flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PasswordFree Password-free instance flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Vip6 Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Vip6 Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IPv6 Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IPv6 Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get Instance read-only flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReadOnly Instance read-only flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Instance read-only flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReadOnly Instance read-only flag (internal parameter, which can be ignored).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemainBandwidthDuration Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemainBandwidthDuration Internal parameter, which can be ignored.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get For Redis instances, ignore this parameter.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DiskSize For Redis instances, ignore this parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set For Redis instances, ignore this parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DiskSize For Redis instances, ignore this parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Monitoring version. <ul><li>1m: 1-minute granularity monitoring. This monitoring granularity has been deprecated. For details, see [1-Minute Granularity Will Be Disused](https://www.tencentcloud.com/document/product/239/50440).</li> <li>5s: 5-second granularity monitoring.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorVersion Monitoring version. <ul><li>1m: 1-minute granularity monitoring. This monitoring granularity has been deprecated. For details, see [1-Minute Granularity Will Be Disused](https://www.tencentcloud.com/document/product/239/50440).</li> <li>5s: 5-second granularity monitoring.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set Monitoring version. <ul><li>1m: 1-minute granularity monitoring. This monitoring granularity has been deprecated. For details, see [1-Minute Granularity Will Be Disused](https://www.tencentcloud.com/document/product/239/50440).</li> <li>5s: 5-second granularity monitoring.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorVersion Monitoring version. <ul><li>1m: 1-minute granularity monitoring. This monitoring granularity has been deprecated. For details, see [1-Minute Granularity Will Be Disused](https://www.tencentcloud.com/document/product/239/50440).</li> <li>5s: 5-second granularity monitoring.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get Minimum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClientLimitMin Minimum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set Minimum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClientLimitMin Minimum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get Maximum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClientLimitMax Maximum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set Maximum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClientLimitMax Maximum value that can be set for the maximum number of client connections.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get Detailed node information of an instance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeSet Detailed node information of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set Detailed node information of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeSet Detailed node information of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get Region information of an instance, for example, ap-guangzhou.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Region information of an instance, for example, ap-guangzhou.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information of an instance, for example, ap-guangzhou.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Region information of an instance, for example, ap-guangzhou.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Public network address.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WanAddress Public network address.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set Public network address.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WanAddress Public network address.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    /**
     * Get Polaris service address, which is for internal use.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PolarisServer Polaris service address, which is for internal use.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPolarisServer() {
        return this.PolarisServer;
    }

    /**
     * Set Polaris service address, which is for internal use.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PolarisServer Polaris service address, which is for internal use.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPolarisServer(String PolarisServer) {
        this.PolarisServer = PolarisServer;
    }

    /**
     * Get CDC Redis cluster ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RedisClusterId CDC Redis cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set CDC Redis cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RedisClusterId CDC Redis cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get CDC cluster ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DedicatedClusterId CDC cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DedicatedClusterId CDC cluster ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProductVersion Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProductVersion Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster.</li></ul>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get Current Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurrentProxyVersion Current Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set Current Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurrentProxyVersion Current Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CurrentRedisVersion Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CurrentRedisVersion Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get Upgradable Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpgradeProxyVersion Upgradable Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set Upgradable Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpgradeProxyVersion Upgradable Proxy version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get Upgradable Cache minor version of an instance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpgradeRedisVersion Upgradable Cache minor version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set Upgradable Cache minor version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpgradeRedisVersion Upgradable Cache minor version of an instance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
    }

    /**
     * Get Backup mode. SecondLevelBackup: second-level backup; NormalLevelBackup: normal backup.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BackupMode Backup mode. SecondLevelBackup: second-level backup; NormalLevelBackup: normal backup.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set Backup mode. SecondLevelBackup: second-level backup; NormalLevelBackup: normal backup.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BackupMode Backup mode. SecondLevelBackup: second-level backup; NormalLevelBackup: normal backup.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    public InstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSet(InstanceSet source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.SizeUsed != null) {
            this.SizeUsed = new Float(source.SizeUsed);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.InstanceTitle != null) {
            this.InstanceTitle = new String(source.InstanceTitle);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.InstanceNode != null) {
            this.InstanceNode = new InstanceNode[source.InstanceNode.length];
            for (int i = 0; i < source.InstanceNode.length; i++) {
                this.InstanceNode[i] = new InstanceNode(source.InstanceNode[i]);
            }
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
        if (source.CloseTime != null) {
            this.CloseTime = new String(source.CloseTime);
        }
        if (source.SlaveReadWeight != null) {
            this.SlaveReadWeight = new Long(source.SlaveReadWeight);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
        if (source.DtsStatus != null) {
            this.DtsStatus = new Long(source.DtsStatus);
        }
        if (source.NetLimit != null) {
            this.NetLimit = new Long(source.NetLimit);
        }
        if (source.PasswordFree != null) {
            this.PasswordFree = new Long(source.PasswordFree);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new String(source.IPv6);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.RemainBandwidthDuration != null) {
            this.RemainBandwidthDuration = new String(source.RemainBandwidthDuration);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.ClientLimitMin != null) {
            this.ClientLimitMin = new Long(source.ClientLimitMin);
        }
        if (source.ClientLimitMax != null) {
            this.ClientLimitMax = new Long(source.ClientLimitMax);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.WanAddress != null) {
            this.WanAddress = new String(source.WanAddress);
        }
        if (source.PolarisServer != null) {
            this.PolarisServer = new String(source.PolarisServer);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.CurrentRedisVersion != null) {
            this.CurrentRedisVersion = new String(source.CurrentRedisVersion);
        }
        if (source.UpgradeProxyVersion != null) {
            this.UpgradeProxyVersion = new String(source.UpgradeProxyVersion);
        }
        if (source.UpgradeRedisVersion != null) {
            this.UpgradeRedisVersion = new String(source.UpgradeRedisVersion);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeUsed", this.SizeUsed);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "InstanceTitle", this.InstanceTitle);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "InstanceNode.", this.InstanceNode);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "CloseTime", this.CloseTime);
        this.setParamSimple(map, prefix + "SlaveReadWeight", this.SlaveReadWeight);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);
        this.setParamSimple(map, prefix + "DtsStatus", this.DtsStatus);
        this.setParamSimple(map, prefix + "NetLimit", this.NetLimit);
        this.setParamSimple(map, prefix + "PasswordFree", this.PasswordFree);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "IPv6", this.IPv6);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "RemainBandwidthDuration", this.RemainBandwidthDuration);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamSimple(map, prefix + "ClientLimitMin", this.ClientLimitMin);
        this.setParamSimple(map, prefix + "ClientLimitMax", this.ClientLimitMax);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "WanAddress", this.WanAddress);
        this.setParamSimple(map, prefix + "PolarisServer", this.PolarisServer);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "CurrentRedisVersion", this.CurrentRedisVersion);
        this.setParamSimple(map, prefix + "UpgradeProxyVersion", this.UpgradeProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeRedisVersion", this.UpgradeRedisVersion);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);

    }
}

