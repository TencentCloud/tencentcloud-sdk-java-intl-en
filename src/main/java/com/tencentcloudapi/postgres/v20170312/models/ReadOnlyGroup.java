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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyGroup extends AbstractModel {

    /**
    * RO group identifier.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Specifies the read-only group name.
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Primary instance id.
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * Specifies the minimum number of instances to retain.
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
    * Specifies the delay threshold for space size in MB.
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * Specifies the delay size switch. valid values: 0 - turn off; 1 - turn on.
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * Delay time size threshold, in seconds.
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Float MaxReplayLag;

    /**
    * Delay time switch. 0 - turn off. 1 - turn on.
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

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
    * Region ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone ID
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Status. valid values: creating, ok, modifying, deleting, deleted.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance details
    */
    @SerializedName("ReadOnlyDBInstanceList")
    @Expose
    private DBInstance [] ReadOnlyDBInstanceList;

    /**
    * Whether to enable automatic load balancing
    */
    @SerializedName("Rebalance")
    @Expose
    private Long Rebalance;

    /**
    * Network information
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * Network access list of the RO group (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
     * Get RO group identifier. 
     * @return ReadOnlyGroupId RO group identifier.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set RO group identifier.
     * @param ReadOnlyGroupId RO group identifier.
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Specifies the read-only group name. 
     * @return ReadOnlyGroupName Specifies the read-only group name.
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set Specifies the read-only group name.
     * @param ReadOnlyGroupName Specifies the read-only group name.
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
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
     * Get Primary instance id. 
     * @return MasterDBInstanceId Primary instance id.
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set Primary instance id.
     * @param MasterDBInstanceId Primary instance id.
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get Specifies the minimum number of instances to retain. 
     * @return MinDelayEliminateReserve Specifies the minimum number of instances to retain.
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set Specifies the minimum number of instances to retain.
     * @param MinDelayEliminateReserve Specifies the minimum number of instances to retain.
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    /**
     * Get Specifies the delay threshold for space size in MB. 
     * @return MaxReplayLatency Specifies the delay threshold for space size in MB.
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set Specifies the delay threshold for space size in MB.
     * @param MaxReplayLatency Specifies the delay threshold for space size in MB.
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get Specifies the delay size switch. valid values: 0 - turn off; 1 - turn on. 
     * @return ReplayLatencyEliminate Specifies the delay size switch. valid values: 0 - turn off; 1 - turn on.
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set Specifies the delay size switch. valid values: 0 - turn off; 1 - turn on.
     * @param ReplayLatencyEliminate Specifies the delay size switch. valid values: 0 - turn off; 1 - turn on.
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get Delay time size threshold, in seconds. 
     * @return MaxReplayLag Delay time size threshold, in seconds.
     */
    public Float getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set Delay time size threshold, in seconds.
     * @param MaxReplayLag Delay time size threshold, in seconds.
     */
    public void setMaxReplayLag(Float MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get Delay time switch. 0 - turn off. 1 - turn on. 
     * @return ReplayLagEliminate Delay time switch. 0 - turn off. 1 - turn on.
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set Delay time switch. 0 - turn off. 1 - turn on.
     * @param ReplayLagEliminate Delay time switch. 0 - turn off. 1 - turn on.
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
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
     * Get Region ID 
     * @return Region Region ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region ID
     * @param Region Region ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone ID 
     * @return Zone Availability zone ID
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone ID
     * @param Zone Availability zone ID
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Status. valid values: creating, ok, modifying, deleting, deleted. 
     * @return Status Status. valid values: creating, ok, modifying, deleting, deleted.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. valid values: creating, ok, modifying, deleting, deleted.
     * @param Status Status. valid values: creating, ok, modifying, deleting, deleted.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance details 
     * @return ReadOnlyDBInstanceList Instance details
     */
    public DBInstance [] getReadOnlyDBInstanceList() {
        return this.ReadOnlyDBInstanceList;
    }

    /**
     * Set Instance details
     * @param ReadOnlyDBInstanceList Instance details
     */
    public void setReadOnlyDBInstanceList(DBInstance [] ReadOnlyDBInstanceList) {
        this.ReadOnlyDBInstanceList = ReadOnlyDBInstanceList;
    }

    /**
     * Get Whether to enable automatic load balancing 
     * @return Rebalance Whether to enable automatic load balancing
     */
    public Long getRebalance() {
        return this.Rebalance;
    }

    /**
     * Set Whether to enable automatic load balancing
     * @param Rebalance Whether to enable automatic load balancing
     */
    public void setRebalance(Long Rebalance) {
        this.Rebalance = Rebalance;
    }

    /**
     * Get Network information 
     * @return DBInstanceNetInfo Network information
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set Network information
     * @param DBInstanceNetInfo Network information
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get Network access list of the RO group (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NetworkAccessList Network access list of the RO group (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set Network access list of the RO group (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NetworkAccessList Network access list of the RO group (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
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
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Float(source.MaxReplayLag);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        if (source.ReadOnlyDBInstanceList != null) {
            this.ReadOnlyDBInstanceList = new DBInstance[source.ReadOnlyDBInstanceList.length];
            for (int i = 0; i < source.ReadOnlyDBInstanceList.length; i++) {
                this.ReadOnlyDBInstanceList[i] = new DBInstance(source.ReadOnlyDBInstanceList[i]);
            }
        }
        if (source.Rebalance != null) {
            this.Rebalance = new Long(source.Rebalance);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new NetworkAccess[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new NetworkAccess(source.NetworkAccessList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ReadOnlyDBInstanceList.", this.ReadOnlyDBInstanceList);
        this.setParamSimple(map, prefix + "Rebalance", this.Rebalance);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);

    }
}

