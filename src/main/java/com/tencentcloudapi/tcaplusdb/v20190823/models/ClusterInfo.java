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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel {

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * Network type
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * ID of the VPC instance with which a cluster is associated
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet instance with which a cluster is associated
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Cluster password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Password status
    */
    @SerializedName("PasswordStatus")
    @Expose
    private String PasswordStatus;

    /**
    * TcaplusDB SDK connection parameter: access ID
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * TcaplusDB SDK connection parameter: access address
    */
    @SerializedName("ApiAccessIp")
    @Expose
    private String ApiAccessIp;

    /**
    * TcaplusDB SDK connection parameter: access port
    */
    @SerializedName("ApiAccessPort")
    @Expose
    private Long ApiAccessPort;

    /**
    * If the value of PasswordStatus is unmodifiable, it indicates that the old password has not expired. This field will display the expiration time of the old password; otherwise, the value is null.
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * TencentDB for TcaplusDB (TcaplusDB) SDK connection parameters, which are used to access the IPv6 address.
    */
    @SerializedName("ApiAccessIpv6")
    @Expose
    private String ApiAccessIpv6;

    /**
    * Cluster type. 0,1: shared cluster; 2: independent cluster.
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Cluster status. 0: indicates normal operation; 1: indicates frozen isolation (usually due to arrears); 2: indicates to be recycled (usually when the user proactively triggers deletion); 3: pending release (indicating that resources occupied by this table can be released); 4: changing.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * Read CU.
    */
    @SerializedName("ReadCapacityUnit")
    @Expose
    private Long ReadCapacityUnit;

    /**
    * Write CU.
    */
    @SerializedName("WriteCapacityUnit")
    @Expose
    private Long WriteCapacityUnit;

    /**
    * Disk capacity.
    */
    @SerializedName("DiskVolume")
    @Expose
    private Long DiskVolume;

    /**
    * Information about the dedicated server.
    */
    @SerializedName("ServerList")
    @Expose
    private ServerDetailInfo [] ServerList;

    /**
    * Information about the dedicated proxy server.
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyDetailInfo [] ProxyList;

    /**
    * Whether the cluster operation approval feature is enabled. Valid values: `0` (disabled), `1` (enabled)
    */
    @SerializedName("Censorship")
    @Expose
    private Long Censorship;

    /**
    * Approver UIN list.
    */
    @SerializedName("DbaUins")
    @Expose
    private String [] DbaUins;

    /**
    * Whether data subscription is enabled.
    */
    @SerializedName("DataFlowStatus")
    @Expose
    private Long DataFlowStatus;

    /**
    * Kafka information for data subscription.
    */
    @SerializedName("KafkaInfo")
    @Expose
    private KafkaInfo KafkaInfo;

    /**
    * Retention period for the Txh backup file of the cluster before expiration and deletion.
    */
    @SerializedName("TxhBackupExpireDay")
    @Expose
    private Long TxhBackupExpireDay;

    /**
    * Retention period for the Ulog backup file of the cluster before expiration and deletion.
    */
    @SerializedName("UlogBackupExpireDay")
    @Expose
    private Long UlogBackupExpireDay;

    /**
    * Whether the expiration policy for the Ulog backup file of the cluster is read-only. 0: UlogBackupExpire is read-only and cannot be modified; 1: UlogBackupExpire can be modified.
    */
    @SerializedName("IsReadOnlyUlogBackupExpireDay")
    @Expose
    private Long IsReadOnlyUlogBackupExpireDay;

    /**
    * restproxy status.
    */
    @SerializedName("RestProxyStatus")
    @Expose
    private Long RestProxyStatus;

    /**
    * Total number of shards in the cluster.
    */
    @SerializedName("ShardTotalNum")
    @Expose
    private Long ShardTotalNum;

    /**
    * Total number of used shards.
    */
    @SerializedName("ShardUsedNum")
    @Expose
    private Long ShardUsedNum;

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
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Cluster data description language type, such as `PROTO`, `TDR`, or `MIX` 
     * @return IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     * @param IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get Network type 
     * @return NetworkType Network type
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type
     * @param NetworkType Network type
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get ID of the VPC instance with which a cluster is associated 
     * @return VpcId ID of the VPC instance with which a cluster is associated
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance with which a cluster is associated
     * @param VpcId ID of the VPC instance with which a cluster is associated
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet instance with which a cluster is associated 
     * @return SubnetId ID of the subnet instance with which a cluster is associated
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet instance with which a cluster is associated
     * @param SubnetId ID of the subnet instance with which a cluster is associated
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Cluster password 
     * @return Password Cluster password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster password
     * @param Password Cluster password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Password status 
     * @return PasswordStatus Password status
     */
    public String getPasswordStatus() {
        return this.PasswordStatus;
    }

    /**
     * Set Password status
     * @param PasswordStatus Password status
     */
    public void setPasswordStatus(String PasswordStatus) {
        this.PasswordStatus = PasswordStatus;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access ID 
     * @return ApiAccessId TcaplusDB SDK connection parameter: access ID
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access ID
     * @param ApiAccessId TcaplusDB SDK connection parameter: access ID
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access address 
     * @return ApiAccessIp TcaplusDB SDK connection parameter: access address
     */
    public String getApiAccessIp() {
        return this.ApiAccessIp;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access address
     * @param ApiAccessIp TcaplusDB SDK connection parameter: access address
     */
    public void setApiAccessIp(String ApiAccessIp) {
        this.ApiAccessIp = ApiAccessIp;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access port 
     * @return ApiAccessPort TcaplusDB SDK connection parameter: access port
     */
    public Long getApiAccessPort() {
        return this.ApiAccessPort;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access port
     * @param ApiAccessPort TcaplusDB SDK connection parameter: access port
     */
    public void setApiAccessPort(Long ApiAccessPort) {
        this.ApiAccessPort = ApiAccessPort;
    }

    /**
     * Get If the value of PasswordStatus is unmodifiable, it indicates that the old password has not expired. This field will display the expiration time of the old password; otherwise, the value is null. 
     * @return OldPasswordExpireTime If the value of PasswordStatus is unmodifiable, it indicates that the old password has not expired. This field will display the expiration time of the old password; otherwise, the value is null.
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * Set If the value of PasswordStatus is unmodifiable, it indicates that the old password has not expired. This field will display the expiration time of the old password; otherwise, the value is null.
     * @param OldPasswordExpireTime If the value of PasswordStatus is unmodifiable, it indicates that the old password has not expired. This field will display the expiration time of the old password; otherwise, the value is null.
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * Get TencentDB for TcaplusDB (TcaplusDB) SDK connection parameters, which are used to access the IPv6 address. 
     * @return ApiAccessIpv6 TencentDB for TcaplusDB (TcaplusDB) SDK connection parameters, which are used to access the IPv6 address.
     */
    public String getApiAccessIpv6() {
        return this.ApiAccessIpv6;
    }

    /**
     * Set TencentDB for TcaplusDB (TcaplusDB) SDK connection parameters, which are used to access the IPv6 address.
     * @param ApiAccessIpv6 TencentDB for TcaplusDB (TcaplusDB) SDK connection parameters, which are used to access the IPv6 address.
     */
    public void setApiAccessIpv6(String ApiAccessIpv6) {
        this.ApiAccessIpv6 = ApiAccessIpv6;
    }

    /**
     * Get Cluster type. 0,1: shared cluster; 2: independent cluster. 
     * @return ClusterType Cluster type. 0,1: shared cluster; 2: independent cluster.
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. 0,1: shared cluster; 2: independent cluster.
     * @param ClusterType Cluster type. 0,1: shared cluster; 2: independent cluster.
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster status. 0: indicates normal operation; 1: indicates frozen isolation (usually due to arrears); 2: indicates to be recycled (usually when the user proactively triggers deletion); 3: pending release (indicating that resources occupied by this table can be released); 4: changing. 
     * @return ClusterStatus Cluster status. 0: indicates normal operation; 1: indicates frozen isolation (usually due to arrears); 2: indicates to be recycled (usually when the user proactively triggers deletion); 3: pending release (indicating that resources occupied by this table can be released); 4: changing.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status. 0: indicates normal operation; 1: indicates frozen isolation (usually due to arrears); 2: indicates to be recycled (usually when the user proactively triggers deletion); 3: pending release (indicating that resources occupied by this table can be released); 4: changing.
     * @param ClusterStatus Cluster status. 0: indicates normal operation; 1: indicates frozen isolation (usually due to arrears); 2: indicates to be recycled (usually when the user proactively triggers deletion); 3: pending release (indicating that resources occupied by this table can be released); 4: changing.
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Read CU. 
     * @return ReadCapacityUnit Read CU.
     */
    public Long getReadCapacityUnit() {
        return this.ReadCapacityUnit;
    }

    /**
     * Set Read CU.
     * @param ReadCapacityUnit Read CU.
     */
    public void setReadCapacityUnit(Long ReadCapacityUnit) {
        this.ReadCapacityUnit = ReadCapacityUnit;
    }

    /**
     * Get Write CU. 
     * @return WriteCapacityUnit Write CU.
     */
    public Long getWriteCapacityUnit() {
        return this.WriteCapacityUnit;
    }

    /**
     * Set Write CU.
     * @param WriteCapacityUnit Write CU.
     */
    public void setWriteCapacityUnit(Long WriteCapacityUnit) {
        this.WriteCapacityUnit = WriteCapacityUnit;
    }

    /**
     * Get Disk capacity. 
     * @return DiskVolume Disk capacity.
     */
    public Long getDiskVolume() {
        return this.DiskVolume;
    }

    /**
     * Set Disk capacity.
     * @param DiskVolume Disk capacity.
     */
    public void setDiskVolume(Long DiskVolume) {
        this.DiskVolume = DiskVolume;
    }

    /**
     * Get Information about the dedicated server. 
     * @return ServerList Information about the dedicated server.
     */
    public ServerDetailInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set Information about the dedicated server.
     * @param ServerList Information about the dedicated server.
     */
    public void setServerList(ServerDetailInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get Information about the dedicated proxy server. 
     * @return ProxyList Information about the dedicated proxy server.
     */
    public ProxyDetailInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set Information about the dedicated proxy server.
     * @param ProxyList Information about the dedicated proxy server.
     */
    public void setProxyList(ProxyDetailInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get Whether the cluster operation approval feature is enabled. Valid values: `0` (disabled), `1` (enabled) 
     * @return Censorship Whether the cluster operation approval feature is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public Long getCensorship() {
        return this.Censorship;
    }

    /**
     * Set Whether the cluster operation approval feature is enabled. Valid values: `0` (disabled), `1` (enabled)
     * @param Censorship Whether the cluster operation approval feature is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public void setCensorship(Long Censorship) {
        this.Censorship = Censorship;
    }

    /**
     * Get Approver UIN list. 
     * @return DbaUins Approver UIN list.
     */
    public String [] getDbaUins() {
        return this.DbaUins;
    }

    /**
     * Set Approver UIN list.
     * @param DbaUins Approver UIN list.
     */
    public void setDbaUins(String [] DbaUins) {
        this.DbaUins = DbaUins;
    }

    /**
     * Get Whether data subscription is enabled. 
     * @return DataFlowStatus Whether data subscription is enabled.
     */
    public Long getDataFlowStatus() {
        return this.DataFlowStatus;
    }

    /**
     * Set Whether data subscription is enabled.
     * @param DataFlowStatus Whether data subscription is enabled.
     */
    public void setDataFlowStatus(Long DataFlowStatus) {
        this.DataFlowStatus = DataFlowStatus;
    }

    /**
     * Get Kafka information for data subscription. 
     * @return KafkaInfo Kafka information for data subscription.
     */
    public KafkaInfo getKafkaInfo() {
        return this.KafkaInfo;
    }

    /**
     * Set Kafka information for data subscription.
     * @param KafkaInfo Kafka information for data subscription.
     */
    public void setKafkaInfo(KafkaInfo KafkaInfo) {
        this.KafkaInfo = KafkaInfo;
    }

    /**
     * Get Retention period for the Txh backup file of the cluster before expiration and deletion. 
     * @return TxhBackupExpireDay Retention period for the Txh backup file of the cluster before expiration and deletion.
     */
    public Long getTxhBackupExpireDay() {
        return this.TxhBackupExpireDay;
    }

    /**
     * Set Retention period for the Txh backup file of the cluster before expiration and deletion.
     * @param TxhBackupExpireDay Retention period for the Txh backup file of the cluster before expiration and deletion.
     */
    public void setTxhBackupExpireDay(Long TxhBackupExpireDay) {
        this.TxhBackupExpireDay = TxhBackupExpireDay;
    }

    /**
     * Get Retention period for the Ulog backup file of the cluster before expiration and deletion. 
     * @return UlogBackupExpireDay Retention period for the Ulog backup file of the cluster before expiration and deletion.
     */
    public Long getUlogBackupExpireDay() {
        return this.UlogBackupExpireDay;
    }

    /**
     * Set Retention period for the Ulog backup file of the cluster before expiration and deletion.
     * @param UlogBackupExpireDay Retention period for the Ulog backup file of the cluster before expiration and deletion.
     */
    public void setUlogBackupExpireDay(Long UlogBackupExpireDay) {
        this.UlogBackupExpireDay = UlogBackupExpireDay;
    }

    /**
     * Get Whether the expiration policy for the Ulog backup file of the cluster is read-only. 0: UlogBackupExpire is read-only and cannot be modified; 1: UlogBackupExpire can be modified. 
     * @return IsReadOnlyUlogBackupExpireDay Whether the expiration policy for the Ulog backup file of the cluster is read-only. 0: UlogBackupExpire is read-only and cannot be modified; 1: UlogBackupExpire can be modified.
     */
    public Long getIsReadOnlyUlogBackupExpireDay() {
        return this.IsReadOnlyUlogBackupExpireDay;
    }

    /**
     * Set Whether the expiration policy for the Ulog backup file of the cluster is read-only. 0: UlogBackupExpire is read-only and cannot be modified; 1: UlogBackupExpire can be modified.
     * @param IsReadOnlyUlogBackupExpireDay Whether the expiration policy for the Ulog backup file of the cluster is read-only. 0: UlogBackupExpire is read-only and cannot be modified; 1: UlogBackupExpire can be modified.
     */
    public void setIsReadOnlyUlogBackupExpireDay(Long IsReadOnlyUlogBackupExpireDay) {
        this.IsReadOnlyUlogBackupExpireDay = IsReadOnlyUlogBackupExpireDay;
    }

    /**
     * Get restproxy status. 
     * @return RestProxyStatus restproxy status.
     */
    public Long getRestProxyStatus() {
        return this.RestProxyStatus;
    }

    /**
     * Set restproxy status.
     * @param RestProxyStatus restproxy status.
     */
    public void setRestProxyStatus(Long RestProxyStatus) {
        this.RestProxyStatus = RestProxyStatus;
    }

    /**
     * Get Total number of shards in the cluster. 
     * @return ShardTotalNum Total number of shards in the cluster.
     */
    public Long getShardTotalNum() {
        return this.ShardTotalNum;
    }

    /**
     * Set Total number of shards in the cluster.
     * @param ShardTotalNum Total number of shards in the cluster.
     */
    public void setShardTotalNum(Long ShardTotalNum) {
        this.ShardTotalNum = ShardTotalNum;
    }

    /**
     * Get Total number of used shards. 
     * @return ShardUsedNum Total number of used shards.
     */
    public Long getShardUsedNum() {
        return this.ShardUsedNum;
    }

    /**
     * Set Total number of used shards.
     * @param ShardUsedNum Total number of used shards.
     */
    public void setShardUsedNum(Long ShardUsedNum) {
        this.ShardUsedNum = ShardUsedNum;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IdlType != null) {
            this.IdlType = new String(source.IdlType);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordStatus != null) {
            this.PasswordStatus = new String(source.PasswordStatus);
        }
        if (source.ApiAccessId != null) {
            this.ApiAccessId = new String(source.ApiAccessId);
        }
        if (source.ApiAccessIp != null) {
            this.ApiAccessIp = new String(source.ApiAccessIp);
        }
        if (source.ApiAccessPort != null) {
            this.ApiAccessPort = new Long(source.ApiAccessPort);
        }
        if (source.OldPasswordExpireTime != null) {
            this.OldPasswordExpireTime = new String(source.OldPasswordExpireTime);
        }
        if (source.ApiAccessIpv6 != null) {
            this.ApiAccessIpv6 = new String(source.ApiAccessIpv6);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.ReadCapacityUnit != null) {
            this.ReadCapacityUnit = new Long(source.ReadCapacityUnit);
        }
        if (source.WriteCapacityUnit != null) {
            this.WriteCapacityUnit = new Long(source.WriteCapacityUnit);
        }
        if (source.DiskVolume != null) {
            this.DiskVolume = new Long(source.DiskVolume);
        }
        if (source.ServerList != null) {
            this.ServerList = new ServerDetailInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new ServerDetailInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new ProxyDetailInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new ProxyDetailInfo(source.ProxyList[i]);
            }
        }
        if (source.Censorship != null) {
            this.Censorship = new Long(source.Censorship);
        }
        if (source.DbaUins != null) {
            this.DbaUins = new String[source.DbaUins.length];
            for (int i = 0; i < source.DbaUins.length; i++) {
                this.DbaUins[i] = new String(source.DbaUins[i]);
            }
        }
        if (source.DataFlowStatus != null) {
            this.DataFlowStatus = new Long(source.DataFlowStatus);
        }
        if (source.KafkaInfo != null) {
            this.KafkaInfo = new KafkaInfo(source.KafkaInfo);
        }
        if (source.TxhBackupExpireDay != null) {
            this.TxhBackupExpireDay = new Long(source.TxhBackupExpireDay);
        }
        if (source.UlogBackupExpireDay != null) {
            this.UlogBackupExpireDay = new Long(source.UlogBackupExpireDay);
        }
        if (source.IsReadOnlyUlogBackupExpireDay != null) {
            this.IsReadOnlyUlogBackupExpireDay = new Long(source.IsReadOnlyUlogBackupExpireDay);
        }
        if (source.RestProxyStatus != null) {
            this.RestProxyStatus = new Long(source.RestProxyStatus);
        }
        if (source.ShardTotalNum != null) {
            this.ShardTotalNum = new Long(source.ShardTotalNum);
        }
        if (source.ShardUsedNum != null) {
            this.ShardUsedNum = new Long(source.ShardUsedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordStatus", this.PasswordStatus);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "ApiAccessIp", this.ApiAccessIp);
        this.setParamSimple(map, prefix + "ApiAccessPort", this.ApiAccessPort);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "ApiAccessIpv6", this.ApiAccessIpv6);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ReadCapacityUnit", this.ReadCapacityUnit);
        this.setParamSimple(map, prefix + "WriteCapacityUnit", this.WriteCapacityUnit);
        this.setParamSimple(map, prefix + "DiskVolume", this.DiskVolume);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "Censorship", this.Censorship);
        this.setParamArraySimple(map, prefix + "DbaUins.", this.DbaUins);
        this.setParamSimple(map, prefix + "DataFlowStatus", this.DataFlowStatus);
        this.setParamObj(map, prefix + "KafkaInfo.", this.KafkaInfo);
        this.setParamSimple(map, prefix + "TxhBackupExpireDay", this.TxhBackupExpireDay);
        this.setParamSimple(map, prefix + "UlogBackupExpireDay", this.UlogBackupExpireDay);
        this.setParamSimple(map, prefix + "IsReadOnlyUlogBackupExpireDay", this.IsReadOnlyUlogBackupExpireDay);
        this.setParamSimple(map, prefix + "RestProxyStatus", this.RestProxyStatus);
        this.setParamSimple(map, prefix + "ShardTotalNum", this.ShardTotalNum);
        this.setParamSimple(map, prefix + "ShardUsedNum", this.ShardUsedNum);

    }
}

