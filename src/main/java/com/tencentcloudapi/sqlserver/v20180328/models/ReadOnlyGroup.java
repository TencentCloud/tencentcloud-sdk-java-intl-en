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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyGroup extends AbstractModel {

    /**
    * Read-Only Group ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Read-Only Group Name
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * Region ID of the Read-Only Group, same as the Primary Instance
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Read-Only Group's AZ ID, same as the Primary Instance
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Whether to enable the timeout culling feature; 0 - disabled, 1 - enabled
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * Timeout threshold used after enabling the timeout culling feature
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * Minimum number of read-only replicas retained in the read-only group after enabling the timeout culling feature
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * Read-Only Group vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Read-Only Group vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Read-Only Group VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Read-Only Group VPC Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Read-Only Group Status: 1-Running, 5-Creating
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Primary instance ID, in the form of mssql-sgeshe3th
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * Read-Only Instance Replica Set
    */
    @SerializedName("ReadOnlyInstanceSet")
    @Expose
    private ReadOnlyInstance [] ReadOnlyInstanceSet;

    /**
    * RO group's public network address domain name
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * RO group's public network address port
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
     * Get Read-Only Group ID 
     * @return ReadOnlyGroupId Read-Only Group ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set Read-Only Group ID
     * @param ReadOnlyGroupId Read-Only Group ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Read-Only Group Name 
     * @return ReadOnlyGroupName Read-Only Group Name
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set Read-Only Group Name
     * @param ReadOnlyGroupName Read-Only Group Name
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get Region ID of the Read-Only Group, same as the Primary Instance 
     * @return RegionId Region ID of the Read-Only Group, same as the Primary Instance
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID of the Read-Only Group, same as the Primary Instance
     * @param RegionId Region ID of the Read-Only Group, same as the Primary Instance
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Read-Only Group's AZ ID, same as the Primary Instance 
     * @return ZoneId Read-Only Group's AZ ID, same as the Primary Instance
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Read-Only Group's AZ ID, same as the Primary Instance
     * @param ZoneId Read-Only Group's AZ ID, same as the Primary Instance
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Whether to enable the timeout culling feature; 0 - disabled, 1 - enabled 
     * @return IsOfflineDelay Whether to enable the timeout culling feature; 0 - disabled, 1 - enabled
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set Whether to enable the timeout culling feature; 0 - disabled, 1 - enabled
     * @param IsOfflineDelay Whether to enable the timeout culling feature; 0 - disabled, 1 - enabled
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get Timeout threshold used after enabling the timeout culling feature 
     * @return ReadOnlyMaxDelayTime Timeout threshold used after enabling the timeout culling feature
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set Timeout threshold used after enabling the timeout culling feature
     * @param ReadOnlyMaxDelayTime Timeout threshold used after enabling the timeout culling feature
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get Minimum number of read-only replicas retained in the read-only group after enabling the timeout culling feature 
     * @return MinReadOnlyInGroup Minimum number of read-only replicas retained in the read-only group after enabling the timeout culling feature
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set Minimum number of read-only replicas retained in the read-only group after enabling the timeout culling feature
     * @param MinReadOnlyInGroup Minimum number of read-only replicas retained in the read-only group after enabling the timeout culling feature
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get Read-Only Group vip 
     * @return Vip Read-Only Group vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Read-Only Group vip
     * @param Vip Read-Only Group vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Read-Only Group vport 
     * @return Vport Read-Only Group vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Read-Only Group vport
     * @param Vport Read-Only Group vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Read-Only Group VPC ID 
     * @return VpcId Read-Only Group VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Read-Only Group VPC ID
     * @param VpcId Read-Only Group VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Read-Only Group VPC Subnet ID 
     * @return SubnetId Read-Only Group VPC Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Read-Only Group VPC Subnet ID
     * @param SubnetId Read-Only Group VPC Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Read-Only Group Status: 1-Running, 5-Creating 
     * @return Status Read-Only Group Status: 1-Running, 5-Creating
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Read-Only Group Status: 1-Running, 5-Creating
     * @param Status Read-Only Group Status: 1-Running, 5-Creating
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Primary instance ID, in the form of mssql-sgeshe3th 
     * @return MasterInstanceId Primary instance ID, in the form of mssql-sgeshe3th
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set Primary instance ID, in the form of mssql-sgeshe3th
     * @param MasterInstanceId Primary instance ID, in the form of mssql-sgeshe3th
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get Read-Only Instance Replica Set 
     * @return ReadOnlyInstanceSet Read-Only Instance Replica Set
     */
    public ReadOnlyInstance [] getReadOnlyInstanceSet() {
        return this.ReadOnlyInstanceSet;
    }

    /**
     * Set Read-Only Instance Replica Set
     * @param ReadOnlyInstanceSet Read-Only Instance Replica Set
     */
    public void setReadOnlyInstanceSet(ReadOnlyInstance [] ReadOnlyInstanceSet) {
        this.ReadOnlyInstanceSet = ReadOnlyInstanceSet;
    }

    /**
     * Get RO group's public network address domain name 
     * @return DnsPodDomain RO group's public network address domain name
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set RO group's public network address domain name
     * @param DnsPodDomain RO group's public network address domain name
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get RO group's public network address port 
     * @return TgwWanVPort RO group's public network address port
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set RO group's public network address port
     * @param TgwWanVPort RO group's public network address port
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    public ReadOnlyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyGroup(ReadOnlyGroup source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsOfflineDelay != null) {
            this.IsOfflineDelay = new Long(source.IsOfflineDelay);
        }
        if (source.ReadOnlyMaxDelayTime != null) {
            this.ReadOnlyMaxDelayTime = new Long(source.ReadOnlyMaxDelayTime);
        }
        if (source.MinReadOnlyInGroup != null) {
            this.MinReadOnlyInGroup = new Long(source.MinReadOnlyInGroup);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.ReadOnlyInstanceSet != null) {
            this.ReadOnlyInstanceSet = new ReadOnlyInstance[source.ReadOnlyInstanceSet.length];
            for (int i = 0; i < source.ReadOnlyInstanceSet.length; i++) {
                this.ReadOnlyInstanceSet[i] = new ReadOnlyInstance(source.ReadOnlyInstanceSet[i]);
            }
        }
        if (source.DnsPodDomain != null) {
            this.DnsPodDomain = new String(source.DnsPodDomain);
        }
        if (source.TgwWanVPort != null) {
            this.TgwWanVPort = new Long(source.TgwWanVPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamArrayObj(map, prefix + "ReadOnlyInstanceSet.", this.ReadOnlyInstanceSet);
        this.setParamSimple(map, prefix + "DnsPodDomain", this.DnsPodDomain);
        this.setParamSimple(map, prefix + "TgwWanVPort", this.TgwWanVPort);

    }
}

