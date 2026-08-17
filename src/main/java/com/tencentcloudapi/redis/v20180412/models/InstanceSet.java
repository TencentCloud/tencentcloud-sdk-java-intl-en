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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSet extends AbstractModel {

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>User AppId. AppId is an application ID with a one-to-one correspondence to the account ID. Some Tencent Cloud products use this AppId.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Region ID.<ul><li>1: Guangzhou.</li><li>4: Shanghai.</li><li>5: Hong Kong (China).</li><li>7: Shanghai Finance.</li><li>8: Beijing.</li><li>9: Singapore.</li><li>11: Shenzhen Finance.</li><li>15: Western US (Silicon Valley).</li><li>16: Chengdu.</li><li>17: Frankfurt.</li><li>18: Seoul.</li><li>19: Chongqing.</li><li>22: Eastern US (Virginia).</li><li>23: Bangkok.</li><li>25: Tokyo.</li></ul></p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>vpc network ID, such as 75101.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>Subnet ID under vpc, for example: 46315.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Instance VIP.</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>Instance port number.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Instance creation time, for example, in the format of 2020-01-15 10:20:00.</p>
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * <p>Instance memory capacity. Unit: MB (1 MB = 1024 KB).</p>
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * <p>This field is deprecated. Please use the Tencent Cloud observability platform API interface <a href="https://www.tencentcloud.com/document/product/248/31014?from_cn_redirect=1">GetMonitorData</a> to obtain the memory capacity used by the instance.</p>
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * <p>Instance type.</p><p>Enumeration value:</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 8.0 memory edition (standard architecture).</li><li>22: Valkey 8.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Whether the automatic renewal flag is set for an instance.</p><ul><li>1: set auto-renewal.</li><li>0: automatic renewal flag not set.</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Expiration time of a monthly subscription instance.</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>Product type.<ul><li>standalone: standard version.</li><li>cluster: cluster version.</li></ul></p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>vpc Network id, such as vpc-fk33jsf43kgv.</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>subnet id under vpc, for example: subnet-fd3j6l35mm0.</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Billing mode.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>Description of instance running status: for example "instance running".</p>
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * <p>Default termination time of isolated instances. Pay-as-you-go instance offline after isolation. Monthly Subscription instance offline after 7 days. In the format of: 2020-02-15 10:20:00.</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>Substatus of the instance in process returned.</p><ul><li>0: Read and write status of the disk.</li><li>1: Read-only status of the disk due to exceeding limit.</li></ul>
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * <p>Anti-affinity tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Instance node information.</p>
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * <p>Shard size.</p>
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * <p>Number of shards.</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>Number of replicas.</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>Billing ID.</p>
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * <p>Time when an instance starts to be isolated.</p>
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * <p>Read weight of the secondary node.</p><ul><li>0: means disable read-only replica.</li><li>100: means enable read-only replica.</li></ul>
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * <p>Tag information associated with an instance.</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>Number of client connections.</p>
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * <p>DTS status (internal parameter, can be ignored by users).</p>
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * <p>Upper limit of the shard bandwidth. Unit: MB.</p>
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * <p>Password-free instance flag (internal parameter, which can be ignored).</p>
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * <p>Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.</p>
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * <p>Internal parameter, which can be ignored.</p>
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * <p>Instance read-only flag (internal parameter, which can be ignored).</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * <p>Internal parameter, which can be ignored.</p>
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * <p>For Redis instances, ignore this parameter.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Monitoring version.<ul><li>1m: 1-minute granularity monitoring. This monitoring granularity is deprecated. For details, please see <a href="https://www.tencentcloud.com/document/product/239/80653?from_cn_redirect=1">TencentDB for Redis 1-minute granularity deprecation notice</a>.</li><li>5s: 5-second granularity monitoring.</li></ul></p>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * <p>Minimum value that can be set for the maximum number of client connections.</p>
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * <p>Maximum value that can be set for the maximum number of client connections.</p>
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * <p>Detailed node information of the instance.<br>Only multi-AZ instances will be returned.</p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>Region information of an instance, for example, ap-guangzhou.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Public network address.</p>
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
    * <p>Polaris service address for internal use.</p>
    */
    @SerializedName("PolarisServer")
    @Expose
    private String PolarisServer;

    /**
    * <p>CDC Redis cluster ID.</p>
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * <p>CDC cluster ID.</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster edition.</li></ul></p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>Current Proxy version of the instance.</p>
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * <p>Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.</p>
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * <p>Upgradable Proxy version of an instance.</p>
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * <p>Upgradable Cache minor version of an instance.</p>
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

    /**
    * <p>Backup mode.</p><ul><li>SecondLevelBackup: second-level backup.</li><li>NormalLevelBackup: normal backup.</li></ul>
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
    * <p>Instance destruction protection switch.</p><ul><li>0: disabled.</li><li>1: enabled.</li></ul>
    */
    @SerializedName("DeleteProtectionSwitch")
    @Expose
    private Long DeleteProtectionSwitch;

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>User AppId. AppId is an application ID with a one-to-one correspondence to the account ID. Some Tencent Cloud products use this AppId.</p> 
     * @return Appid <p>User AppId. AppId is an application ID with a one-to-one correspondence to the account ID. Some Tencent Cloud products use this AppId.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>User AppId. AppId is an application ID with a one-to-one correspondence to the account ID. Some Tencent Cloud products use this AppId.</p>
     * @param Appid <p>User AppId. AppId is an application ID with a one-to-one correspondence to the account ID. Some Tencent Cloud products use this AppId.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Region ID.<ul><li>1: Guangzhou.</li><li>4: Shanghai.</li><li>5: Hong Kong (China).</li><li>7: Shanghai Finance.</li><li>8: Beijing.</li><li>9: Singapore.</li><li>11: Shenzhen Finance.</li><li>15: Western US (Silicon Valley).</li><li>16: Chengdu.</li><li>17: Frankfurt.</li><li>18: Seoul.</li><li>19: Chongqing.</li><li>22: Eastern US (Virginia).</li><li>23: Bangkok.</li><li>25: Tokyo.</li></ul></p> 
     * @return RegionId <p>Region ID.<ul><li>1: Guangzhou.</li><li>4: Shanghai.</li><li>5: Hong Kong (China).</li><li>7: Shanghai Finance.</li><li>8: Beijing.</li><li>9: Singapore.</li><li>11: Shenzhen Finance.</li><li>15: Western US (Silicon Valley).</li><li>16: Chengdu.</li><li>17: Frankfurt.</li><li>18: Seoul.</li><li>19: Chongqing.</li><li>22: Eastern US (Virginia).</li><li>23: Bangkok.</li><li>25: Tokyo.</li></ul></p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region ID.<ul><li>1: Guangzhou.</li><li>4: Shanghai.</li><li>5: Hong Kong (China).</li><li>7: Shanghai Finance.</li><li>8: Beijing.</li><li>9: Singapore.</li><li>11: Shenzhen Finance.</li><li>15: Western US (Silicon Valley).</li><li>16: Chengdu.</li><li>17: Frankfurt.</li><li>18: Seoul.</li><li>19: Chongqing.</li><li>22: Eastern US (Virginia).</li><li>23: Bangkok.</li><li>25: Tokyo.</li></ul></p>
     * @param RegionId <p>Region ID.<ul><li>1: Guangzhou.</li><li>4: Shanghai.</li><li>5: Hong Kong (China).</li><li>7: Shanghai Finance.</li><li>8: Beijing.</li><li>9: Singapore.</li><li>11: Shenzhen Finance.</li><li>15: Western US (Silicon Valley).</li><li>16: Chengdu.</li><li>17: Frankfurt.</li><li>18: Seoul.</li><li>19: Chongqing.</li><li>22: Eastern US (Virginia).</li><li>23: Bangkok.</li><li>25: Tokyo.</li></ul></p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return ZoneId <p>Region ID.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Region ID.</p>
     * @param ZoneId <p>Region ID.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>vpc network ID, such as 75101.</p> 
     * @return VpcId <p>vpc network ID, such as 75101.</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc network ID, such as 75101.</p>
     * @param VpcId <p>vpc network ID, such as 75101.</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID under vpc, for example: 46315.</p> 
     * @return SubnetId <p>Subnet ID under vpc, for example: 46315.</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID under vpc, for example: 46315.</p>
     * @param SubnetId <p>Subnet ID under vpc, for example: 46315.</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul></p> 
     * @return Status <p>Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul></p>
     * @param Status <p>Current instance status. <ul><li>0: to be initialized;</li> <li>1: in process;</li> <li>2: running;</li> <li>-2: isolated;</li> <li>-3: to be deleted.</li></ul></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance VIP.</p> 
     * @return WanIp <p>Instance VIP.</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>Instance VIP.</p>
     * @param WanIp <p>Instance VIP.</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>Instance port number.</p> 
     * @return Port <p>Instance port number.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Instance port number.</p>
     * @param Port <p>Instance port number.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Instance creation time, for example, in the format of 2020-01-15 10:20:00.</p> 
     * @return Createtime <p>Instance creation time, for example, in the format of 2020-01-15 10:20:00.</p>
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set <p>Instance creation time, for example, in the format of 2020-01-15 10:20:00.</p>
     * @param Createtime <p>Instance creation time, for example, in the format of 2020-01-15 10:20:00.</p>
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get <p>Instance memory capacity. Unit: MB (1 MB = 1024 KB).</p> 
     * @return Size <p>Instance memory capacity. Unit: MB (1 MB = 1024 KB).</p>
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set <p>Instance memory capacity. Unit: MB (1 MB = 1024 KB).</p>
     * @param Size <p>Instance memory capacity. Unit: MB (1 MB = 1024 KB).</p>
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get <p>This field is deprecated. Please use the Tencent Cloud observability platform API interface <a href="https://www.tencentcloud.com/document/product/248/31014?from_cn_redirect=1">GetMonitorData</a> to obtain the memory capacity used by the instance.</p> 
     * @return SizeUsed <p>This field is deprecated. Please use the Tencent Cloud observability platform API interface <a href="https://www.tencentcloud.com/document/product/248/31014?from_cn_redirect=1">GetMonitorData</a> to obtain the memory capacity used by the instance.</p>
     * @deprecated
     */
    @Deprecated
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set <p>This field is deprecated. Please use the Tencent Cloud observability platform API interface <a href="https://www.tencentcloud.com/document/product/248/31014?from_cn_redirect=1">GetMonitorData</a> to obtain the memory capacity used by the instance.</p>
     * @param SizeUsed <p>This field is deprecated. Please use the Tencent Cloud observability platform API interface <a href="https://www.tencentcloud.com/document/product/248/31014?from_cn_redirect=1">GetMonitorData</a> to obtain the memory capacity used by the instance.</p>
     * @deprecated
     */
    @Deprecated
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get <p>Instance type.</p><p>Enumeration value:</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 8.0 memory edition (standard architecture).</li><li>22: Valkey 8.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul> 
     * @return Type <p>Instance type.</p><p>Enumeration value:</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 8.0 memory edition (standard architecture).</li><li>22: Valkey 8.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type.</p><p>Enumeration value:</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 8.0 memory edition (standard architecture).</li><li>22: Valkey 8.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     * @param Type <p>Instance type.</p><p>Enumeration value:</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>19: Valkey 8.0 memory edition (standard architecture).</li><li>20: Valkey 8.0 memory edition (cluster architecture).</li><li>21: Valkey 8.0 memory edition (standard architecture).</li><li>22: Valkey 8.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Whether the automatic renewal flag is set for an instance.</p><ul><li>1: set auto-renewal.</li><li>0: automatic renewal flag not set.</li></ul> 
     * @return AutoRenewFlag <p>Whether the automatic renewal flag is set for an instance.</p><ul><li>1: set auto-renewal.</li><li>0: automatic renewal flag not set.</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Whether the automatic renewal flag is set for an instance.</p><ul><li>1: set auto-renewal.</li><li>0: automatic renewal flag not set.</li></ul>
     * @param AutoRenewFlag <p>Whether the automatic renewal flag is set for an instance.</p><ul><li>1: set auto-renewal.</li><li>0: automatic renewal flag not set.</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Expiration time of a monthly subscription instance.</p> 
     * @return DeadlineTime <p>Expiration time of a monthly subscription instance.</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>Expiration time of a monthly subscription instance.</p>
     * @param DeadlineTime <p>Expiration time of a monthly subscription instance.</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.</p> 
     * @return Engine <p>Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.</p>
     * @param Engine <p>Engine. Valid values: Redis Community Edition and Tencent Cloud CKV.</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>Product type.<ul><li>standalone: standard version.</li><li>cluster: cluster version.</li></ul></p> 
     * @return ProductType <p>Product type.<ul><li>standalone: standard version.</li><li>cluster: cluster version.</li></ul></p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>Product type.<ul><li>standalone: standard version.</li><li>cluster: cluster version.</li></ul></p>
     * @param ProductType <p>Product type.<ul><li>standalone: standard version.</li><li>cluster: cluster version.</li></ul></p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>vpc Network id, such as vpc-fk33jsf43kgv.</p> 
     * @return UniqVpcId <p>vpc Network id, such as vpc-fk33jsf43kgv.</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>vpc Network id, such as vpc-fk33jsf43kgv.</p>
     * @param UniqVpcId <p>vpc Network id, such as vpc-fk33jsf43kgv.</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>subnet id under vpc, for example: subnet-fd3j6l35mm0.</p> 
     * @return UniqSubnetId <p>subnet id under vpc, for example: subnet-fd3j6l35mm0.</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>subnet id under vpc, for example: subnet-fd3j6l35mm0.</p>
     * @param UniqSubnetId <p>subnet id under vpc, for example: subnet-fd3j6l35mm0.</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Billing mode.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p> 
     * @return BillingMode <p>Billing mode.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     * @param BillingMode <p>Billing mode.<ul><li>0: Pay-As-You-Go.</li><li>1: Monthly Subscription.</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>Description of instance running status: for example "instance running".</p> 
     * @return InstanceTitle <p>Description of instance running status: for example "instance running".</p>
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set <p>Description of instance running status: for example "instance running".</p>
     * @param InstanceTitle <p>Description of instance running status: for example "instance running".</p>
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get <p>Default termination time of isolated instances. Pay-as-you-go instance offline after isolation. Monthly Subscription instance offline after 7 days. In the format of: 2020-02-15 10:20:00.</p> 
     * @return OfflineTime <p>Default termination time of isolated instances. Pay-as-you-go instance offline after isolation. Monthly Subscription instance offline after 7 days. In the format of: 2020-02-15 10:20:00.</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>Default termination time of isolated instances. Pay-as-you-go instance offline after isolation. Monthly Subscription instance offline after 7 days. In the format of: 2020-02-15 10:20:00.</p>
     * @param OfflineTime <p>Default termination time of isolated instances. Pay-as-you-go instance offline after isolation. Monthly Subscription instance offline after 7 days. In the format of: 2020-02-15 10:20:00.</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>Substatus of the instance in process returned.</p><ul><li>0: Read and write status of the disk.</li><li>1: Read-only status of the disk due to exceeding limit.</li></ul> 
     * @return SubStatus <p>Substatus of the instance in process returned.</p><ul><li>0: Read and write status of the disk.</li><li>1: Read-only status of the disk due to exceeding limit.</li></ul>
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>Substatus of the instance in process returned.</p><ul><li>0: Read and write status of the disk.</li><li>1: Read-only status of the disk due to exceeding limit.</li></ul>
     * @param SubStatus <p>Substatus of the instance in process returned.</p><ul><li>0: Read and write status of the disk.</li><li>1: Read-only status of the disk due to exceeding limit.</li></ul>
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>Anti-affinity tag.</p> 
     * @return Tags <p>Anti-affinity tag.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Anti-affinity tag.</p>
     * @param Tags <p>Anti-affinity tag.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Instance node information.</p> 
     * @return InstanceNode <p>Instance node information.</p>
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set <p>Instance node information.</p>
     * @param InstanceNode <p>Instance node information.</p>
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get <p>Shard size.</p> 
     * @return RedisShardSize <p>Shard size.</p>
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set <p>Shard size.</p>
     * @param RedisShardSize <p>Shard size.</p>
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get <p>Number of shards.</p> 
     * @return RedisShardNum <p>Number of shards.</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>Number of shards.</p>
     * @param RedisShardNum <p>Number of shards.</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>Number of replicas.</p> 
     * @return RedisReplicasNum <p>Number of replicas.</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>Number of replicas.</p>
     * @param RedisReplicasNum <p>Number of replicas.</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>Billing ID.</p> 
     * @return PriceId <p>Billing ID.</p>
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set <p>Billing ID.</p>
     * @param PriceId <p>Billing ID.</p>
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get <p>Time when an instance starts to be isolated.</p> 
     * @return CloseTime <p>Time when an instance starts to be isolated.</p>
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set <p>Time when an instance starts to be isolated.</p>
     * @param CloseTime <p>Time when an instance starts to be isolated.</p>
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get <p>Read weight of the secondary node.</p><ul><li>0: means disable read-only replica.</li><li>100: means enable read-only replica.</li></ul> 
     * @return SlaveReadWeight <p>Read weight of the secondary node.</p><ul><li>0: means disable read-only replica.</li><li>100: means enable read-only replica.</li></ul>
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set <p>Read weight of the secondary node.</p><ul><li>0: means disable read-only replica.</li><li>100: means enable read-only replica.</li></ul>
     * @param SlaveReadWeight <p>Read weight of the secondary node.</p><ul><li>0: means disable read-only replica.</li><li>100: means enable read-only replica.</li></ul>
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get <p>Tag information associated with an instance.</p> 
     * @return InstanceTags <p>Tag information associated with an instance.</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Tag information associated with an instance.</p>
     * @param InstanceTags <p>Tag information associated with an instance.</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Project name.</p> 
     * @return ProjectName <p>Project name.</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>Project name.</p>
     * @param ProjectName <p>Project name.</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul></p> 
     * @return NoAuth <p>Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul></p>
     * @param NoAuth <p>Whether an instance is a password-free instance. <ul><li>true: yes;</li> <li>false: no.</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>Number of client connections.</p> 
     * @return ClientLimit <p>Number of client connections.</p>
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set <p>Number of client connections.</p>
     * @param ClientLimit <p>Number of client connections.</p>
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get <p>DTS status (internal parameter, can be ignored by users).</p> 
     * @return DtsStatus <p>DTS status (internal parameter, can be ignored by users).</p>
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set <p>DTS status (internal parameter, can be ignored by users).</p>
     * @param DtsStatus <p>DTS status (internal parameter, can be ignored by users).</p>
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get <p>Upper limit of the shard bandwidth. Unit: MB.</p> 
     * @return NetLimit <p>Upper limit of the shard bandwidth. Unit: MB.</p>
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set <p>Upper limit of the shard bandwidth. Unit: MB.</p>
     * @param NetLimit <p>Upper limit of the shard bandwidth. Unit: MB.</p>
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get <p>Password-free instance flag (internal parameter, which can be ignored).</p> 
     * @return PasswordFree <p>Password-free instance flag (internal parameter, which can be ignored).</p>
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set <p>Password-free instance flag (internal parameter, which can be ignored).</p>
     * @param PasswordFree <p>Password-free instance flag (internal parameter, which can be ignored).</p>
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get <p>Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.</p> 
     * @return Vip6 <p>Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.</p>
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set <p>Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.</p>
     * @param Vip6 <p>Internal parameter, which can be ignored. This parameter is not properly named. It is recommended to use the IPv6 parameter to replace it.</p>
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get <p>Internal parameter, which can be ignored.</p> 
     * @return IPv6 <p>Internal parameter, which can be ignored.</p>
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set <p>Internal parameter, which can be ignored.</p>
     * @param IPv6 <p>Internal parameter, which can be ignored.</p>
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get <p>Instance read-only flag (internal parameter, which can be ignored).</p> 
     * @return ReadOnly <p>Instance read-only flag (internal parameter, which can be ignored).</p>
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>Instance read-only flag (internal parameter, which can be ignored).</p>
     * @param ReadOnly <p>Instance read-only flag (internal parameter, which can be ignored).</p>
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>Internal parameter, which can be ignored.</p> 
     * @return RemainBandwidthDuration <p>Internal parameter, which can be ignored.</p>
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set <p>Internal parameter, which can be ignored.</p>
     * @param RemainBandwidthDuration <p>Internal parameter, which can be ignored.</p>
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get <p>For Redis instances, ignore this parameter.</p> 
     * @return DiskSize <p>For Redis instances, ignore this parameter.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>For Redis instances, ignore this parameter.</p>
     * @param DiskSize <p>For Redis instances, ignore this parameter.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Monitoring version.<ul><li>1m: 1-minute granularity monitoring. This monitoring granularity is deprecated. For details, please see <a href="https://www.tencentcloud.com/document/product/239/80653?from_cn_redirect=1">TencentDB for Redis 1-minute granularity deprecation notice</a>.</li><li>5s: 5-second granularity monitoring.</li></ul></p> 
     * @return MonitorVersion <p>Monitoring version.<ul><li>1m: 1-minute granularity monitoring. This monitoring granularity is deprecated. For details, please see <a href="https://www.tencentcloud.com/document/product/239/80653?from_cn_redirect=1">TencentDB for Redis 1-minute granularity deprecation notice</a>.</li><li>5s: 5-second granularity monitoring.</li></ul></p>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set <p>Monitoring version.<ul><li>1m: 1-minute granularity monitoring. This monitoring granularity is deprecated. For details, please see <a href="https://www.tencentcloud.com/document/product/239/80653?from_cn_redirect=1">TencentDB for Redis 1-minute granularity deprecation notice</a>.</li><li>5s: 5-second granularity monitoring.</li></ul></p>
     * @param MonitorVersion <p>Monitoring version.<ul><li>1m: 1-minute granularity monitoring. This monitoring granularity is deprecated. For details, please see <a href="https://www.tencentcloud.com/document/product/239/80653?from_cn_redirect=1">TencentDB for Redis 1-minute granularity deprecation notice</a>.</li><li>5s: 5-second granularity monitoring.</li></ul></p>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get <p>Minimum value that can be set for the maximum number of client connections.</p> 
     * @return ClientLimitMin <p>Minimum value that can be set for the maximum number of client connections.</p>
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set <p>Minimum value that can be set for the maximum number of client connections.</p>
     * @param ClientLimitMin <p>Minimum value that can be set for the maximum number of client connections.</p>
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get <p>Maximum value that can be set for the maximum number of client connections.</p> 
     * @return ClientLimitMax <p>Maximum value that can be set for the maximum number of client connections.</p>
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set <p>Maximum value that can be set for the maximum number of client connections.</p>
     * @param ClientLimitMax <p>Maximum value that can be set for the maximum number of client connections.</p>
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get <p>Detailed node information of the instance.<br>Only multi-AZ instances will be returned.</p> 
     * @return NodeSet <p>Detailed node information of the instance.<br>Only multi-AZ instances will be returned.</p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>Detailed node information of the instance.<br>Only multi-AZ instances will be returned.</p>
     * @param NodeSet <p>Detailed node information of the instance.<br>Only multi-AZ instances will be returned.</p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>Region information of an instance, for example, ap-guangzhou.</p> 
     * @return Region <p>Region information of an instance, for example, ap-guangzhou.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region information of an instance, for example, ap-guangzhou.</p>
     * @param Region <p>Region information of an instance, for example, ap-guangzhou.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Public network address.</p> 
     * @return WanAddress <p>Public network address.</p>
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set <p>Public network address.</p>
     * @param WanAddress <p>Public network address.</p>
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    /**
     * Get <p>Polaris service address for internal use.</p> 
     * @return PolarisServer <p>Polaris service address for internal use.</p>
     */
    public String getPolarisServer() {
        return this.PolarisServer;
    }

    /**
     * Set <p>Polaris service address for internal use.</p>
     * @param PolarisServer <p>Polaris service address for internal use.</p>
     */
    public void setPolarisServer(String PolarisServer) {
        this.PolarisServer = PolarisServer;
    }

    /**
     * Get <p>CDC Redis cluster ID.</p> 
     * @return RedisClusterId <p>CDC Redis cluster ID.</p>
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set <p>CDC Redis cluster ID.</p>
     * @param RedisClusterId <p>CDC Redis cluster ID.</p>
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get <p>CDC cluster ID.</p> 
     * @return DedicatedClusterId <p>CDC cluster ID.</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>CDC cluster ID.</p>
     * @param DedicatedClusterId <p>CDC cluster ID.</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster edition.</li></ul></p> 
     * @return ProductVersion <p>Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster edition.</li></ul></p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster edition.</li></ul></p>
     * @param ProductVersion <p>Product edition. <ul><li>local: local disk;</li> <li>cloud: cloud disk;</li> <li>cdc: CDC cluster edition.</li></ul></p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>Current Proxy version of the instance.</p> 
     * @return CurrentProxyVersion <p>Current Proxy version of the instance.</p>
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set <p>Current Proxy version of the instance.</p>
     * @param CurrentProxyVersion <p>Current Proxy version of the instance.</p>
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get <p>Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.</p> 
     * @return CurrentRedisVersion <p>Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.</p>
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set <p>Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.</p>
     * @param CurrentRedisVersion <p>Current Cache minor version of an instance. If the instance joins a global replication group, the kernel version of the global replication group will be displayed.</p>
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get <p>Upgradable Proxy version of an instance.</p> 
     * @return UpgradeProxyVersion <p>Upgradable Proxy version of an instance.</p>
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set <p>Upgradable Proxy version of an instance.</p>
     * @param UpgradeProxyVersion <p>Upgradable Proxy version of an instance.</p>
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get <p>Upgradable Cache minor version of an instance.</p> 
     * @return UpgradeRedisVersion <p>Upgradable Cache minor version of an instance.</p>
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set <p>Upgradable Cache minor version of an instance.</p>
     * @param UpgradeRedisVersion <p>Upgradable Cache minor version of an instance.</p>
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
    }

    /**
     * Get <p>Backup mode.</p><ul><li>SecondLevelBackup: second-level backup.</li><li>NormalLevelBackup: normal backup.</li></ul> 
     * @return BackupMode <p>Backup mode.</p><ul><li>SecondLevelBackup: second-level backup.</li><li>NormalLevelBackup: normal backup.</li></ul>
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set <p>Backup mode.</p><ul><li>SecondLevelBackup: second-level backup.</li><li>NormalLevelBackup: normal backup.</li></ul>
     * @param BackupMode <p>Backup mode.</p><ul><li>SecondLevelBackup: second-level backup.</li><li>NormalLevelBackup: normal backup.</li></ul>
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    /**
     * Get <p>Instance destruction protection switch.</p><ul><li>0: disabled.</li><li>1: enabled.</li></ul> 
     * @return DeleteProtectionSwitch <p>Instance destruction protection switch.</p><ul><li>0: disabled.</li><li>1: enabled.</li></ul>
     */
    public Long getDeleteProtectionSwitch() {
        return this.DeleteProtectionSwitch;
    }

    /**
     * Set <p>Instance destruction protection switch.</p><ul><li>0: disabled.</li><li>1: enabled.</li></ul>
     * @param DeleteProtectionSwitch <p>Instance destruction protection switch.</p><ul><li>0: disabled.</li><li>1: enabled.</li></ul>
     */
    public void setDeleteProtectionSwitch(Long DeleteProtectionSwitch) {
        this.DeleteProtectionSwitch = DeleteProtectionSwitch;
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
        if (source.DeleteProtectionSwitch != null) {
            this.DeleteProtectionSwitch = new Long(source.DeleteProtectionSwitch);
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
        this.setParamSimple(map, prefix + "DeleteProtectionSwitch", this.DeleteProtectionSwitch);

    }
}

