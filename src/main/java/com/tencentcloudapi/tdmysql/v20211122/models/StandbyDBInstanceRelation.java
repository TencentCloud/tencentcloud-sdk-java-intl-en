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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandbyDBInstanceRelation extends AbstractModel {

    /**
    * Primary instance ID
    */
    @SerializedName("PrimaryInstanceId")
    @Expose
    private String PrimaryInstanceId;

    /**
    * Primary instance name
    */
    @SerializedName("PrimaryInstanceName")
    @Expose
    private String PrimaryInstanceName;

    /**
    * Region of the primary instance
    */
    @SerializedName("PrimaryRegion")
    @Expose
    private String PrimaryRegion;

    /**
    * Subnet IP of the primary instance
    */
    @SerializedName("PrimaryVip")
    @Expose
    private String PrimaryVip;

    /**
    * Port of the primary instance subnet
    */
    @SerializedName("PrimaryVport")
    @Expose
    private Long PrimaryVport;

    /**
    * Primary instance AZ
    */
    @SerializedName("PrimaryZones")
    @Expose
    private String [] PrimaryZones;

    /**
    * Primary instance running status
    */
    @SerializedName("PrimaryStatus")
    @Expose
    private String PrimaryStatus;

    /**
    * Disaster Recovery instance ID
    */
    @SerializedName("SecondaryInstanceId")
    @Expose
    private String SecondaryInstanceId;

    /**
    * Disaster Recovery instance name
    */
    @SerializedName("SecondaryInstanceName")
    @Expose
    private String SecondaryInstanceName;

    /**
    * Region of the standby instance
    */
    @SerializedName("SecondaryRegion")
    @Expose
    private String SecondaryRegion;

    /**
    * Subnet IP of the Disaster Recovery instance
    */
    @SerializedName("SecondaryVip")
    @Expose
    private String SecondaryVip;

    /**
    * Port of the Disaster Recovery instance subnet
    */
    @SerializedName("SecondaryVport")
    @Expose
    private Long SecondaryVport;

    /**
    * Disaster Recovery instance availability zone
    */
    @SerializedName("SecondaryZones")
    @Expose
    private String [] SecondaryZones;

    /**
    * Disaster Recovery instance running status
    */
    @SerializedName("SecondaryStatus")
    @Expose
    private String SecondaryStatus;

    /**
    * Connection type. Valid values: `log_service`, `raft`.
    */
    @SerializedName("ConnType")
    @Expose
    private String ConnType;

    /**
    * Synchronization type. Valid values: `sync` and `async`.
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * Synchronization status. 1: synchronizing; 2: sync exception
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * Synchronization status description. Error information when the synchronization status is abnormal.
    */
    @SerializedName("SyncStatusDesc")
    @Expose
    private String SyncStatusDesc;

    /**
    * Disaster recovery status description. Valid values: "creating", "running", "modifying". Empty if no disaster recovery relationship exists.
    */
    @SerializedName("StandbyStatus")
    @Expose
    private String StandbyStatus;

    /**
    * Primary instance version
    */
    @SerializedName("PrimaryCreateVersion")
    @Expose
    private String PrimaryCreateVersion;

    /**
    * Disaster Recovery instance version
    */
    @SerializedName("SecondaryCreateVersion")
    @Expose
    private String SecondaryCreateVersion;

    /**
    * Latency in seconds
    */
    @SerializedName("SyncDelay")
    @Expose
    private Long SyncDelay;

    /**
     * Get Primary instance ID 
     * @return PrimaryInstanceId Primary instance ID
     */
    public String getPrimaryInstanceId() {
        return this.PrimaryInstanceId;
    }

    /**
     * Set Primary instance ID
     * @param PrimaryInstanceId Primary instance ID
     */
    public void setPrimaryInstanceId(String PrimaryInstanceId) {
        this.PrimaryInstanceId = PrimaryInstanceId;
    }

    /**
     * Get Primary instance name 
     * @return PrimaryInstanceName Primary instance name
     */
    public String getPrimaryInstanceName() {
        return this.PrimaryInstanceName;
    }

    /**
     * Set Primary instance name
     * @param PrimaryInstanceName Primary instance name
     */
    public void setPrimaryInstanceName(String PrimaryInstanceName) {
        this.PrimaryInstanceName = PrimaryInstanceName;
    }

    /**
     * Get Region of the primary instance 
     * @return PrimaryRegion Region of the primary instance
     */
    public String getPrimaryRegion() {
        return this.PrimaryRegion;
    }

    /**
     * Set Region of the primary instance
     * @param PrimaryRegion Region of the primary instance
     */
    public void setPrimaryRegion(String PrimaryRegion) {
        this.PrimaryRegion = PrimaryRegion;
    }

    /**
     * Get Subnet IP of the primary instance 
     * @return PrimaryVip Subnet IP of the primary instance
     */
    public String getPrimaryVip() {
        return this.PrimaryVip;
    }

    /**
     * Set Subnet IP of the primary instance
     * @param PrimaryVip Subnet IP of the primary instance
     */
    public void setPrimaryVip(String PrimaryVip) {
        this.PrimaryVip = PrimaryVip;
    }

    /**
     * Get Port of the primary instance subnet 
     * @return PrimaryVport Port of the primary instance subnet
     */
    public Long getPrimaryVport() {
        return this.PrimaryVport;
    }

    /**
     * Set Port of the primary instance subnet
     * @param PrimaryVport Port of the primary instance subnet
     */
    public void setPrimaryVport(Long PrimaryVport) {
        this.PrimaryVport = PrimaryVport;
    }

    /**
     * Get Primary instance AZ 
     * @return PrimaryZones Primary instance AZ
     */
    public String [] getPrimaryZones() {
        return this.PrimaryZones;
    }

    /**
     * Set Primary instance AZ
     * @param PrimaryZones Primary instance AZ
     */
    public void setPrimaryZones(String [] PrimaryZones) {
        this.PrimaryZones = PrimaryZones;
    }

    /**
     * Get Primary instance running status 
     * @return PrimaryStatus Primary instance running status
     */
    public String getPrimaryStatus() {
        return this.PrimaryStatus;
    }

    /**
     * Set Primary instance running status
     * @param PrimaryStatus Primary instance running status
     */
    public void setPrimaryStatus(String PrimaryStatus) {
        this.PrimaryStatus = PrimaryStatus;
    }

    /**
     * Get Disaster Recovery instance ID 
     * @return SecondaryInstanceId Disaster Recovery instance ID
     */
    public String getSecondaryInstanceId() {
        return this.SecondaryInstanceId;
    }

    /**
     * Set Disaster Recovery instance ID
     * @param SecondaryInstanceId Disaster Recovery instance ID
     */
    public void setSecondaryInstanceId(String SecondaryInstanceId) {
        this.SecondaryInstanceId = SecondaryInstanceId;
    }

    /**
     * Get Disaster Recovery instance name 
     * @return SecondaryInstanceName Disaster Recovery instance name
     */
    public String getSecondaryInstanceName() {
        return this.SecondaryInstanceName;
    }

    /**
     * Set Disaster Recovery instance name
     * @param SecondaryInstanceName Disaster Recovery instance name
     */
    public void setSecondaryInstanceName(String SecondaryInstanceName) {
        this.SecondaryInstanceName = SecondaryInstanceName;
    }

    /**
     * Get Region of the standby instance 
     * @return SecondaryRegion Region of the standby instance
     */
    public String getSecondaryRegion() {
        return this.SecondaryRegion;
    }

    /**
     * Set Region of the standby instance
     * @param SecondaryRegion Region of the standby instance
     */
    public void setSecondaryRegion(String SecondaryRegion) {
        this.SecondaryRegion = SecondaryRegion;
    }

    /**
     * Get Subnet IP of the Disaster Recovery instance 
     * @return SecondaryVip Subnet IP of the Disaster Recovery instance
     */
    public String getSecondaryVip() {
        return this.SecondaryVip;
    }

    /**
     * Set Subnet IP of the Disaster Recovery instance
     * @param SecondaryVip Subnet IP of the Disaster Recovery instance
     */
    public void setSecondaryVip(String SecondaryVip) {
        this.SecondaryVip = SecondaryVip;
    }

    /**
     * Get Port of the Disaster Recovery instance subnet 
     * @return SecondaryVport Port of the Disaster Recovery instance subnet
     */
    public Long getSecondaryVport() {
        return this.SecondaryVport;
    }

    /**
     * Set Port of the Disaster Recovery instance subnet
     * @param SecondaryVport Port of the Disaster Recovery instance subnet
     */
    public void setSecondaryVport(Long SecondaryVport) {
        this.SecondaryVport = SecondaryVport;
    }

    /**
     * Get Disaster Recovery instance availability zone 
     * @return SecondaryZones Disaster Recovery instance availability zone
     */
    public String [] getSecondaryZones() {
        return this.SecondaryZones;
    }

    /**
     * Set Disaster Recovery instance availability zone
     * @param SecondaryZones Disaster Recovery instance availability zone
     */
    public void setSecondaryZones(String [] SecondaryZones) {
        this.SecondaryZones = SecondaryZones;
    }

    /**
     * Get Disaster Recovery instance running status 
     * @return SecondaryStatus Disaster Recovery instance running status
     */
    public String getSecondaryStatus() {
        return this.SecondaryStatus;
    }

    /**
     * Set Disaster Recovery instance running status
     * @param SecondaryStatus Disaster Recovery instance running status
     */
    public void setSecondaryStatus(String SecondaryStatus) {
        this.SecondaryStatus = SecondaryStatus;
    }

    /**
     * Get Connection type. Valid values: `log_service`, `raft`. 
     * @return ConnType Connection type. Valid values: `log_service`, `raft`.
     */
    public String getConnType() {
        return this.ConnType;
    }

    /**
     * Set Connection type. Valid values: `log_service`, `raft`.
     * @param ConnType Connection type. Valid values: `log_service`, `raft`.
     */
    public void setConnType(String ConnType) {
        this.ConnType = ConnType;
    }

    /**
     * Get Synchronization type. Valid values: `sync` and `async`. 
     * @return SyncMode Synchronization type. Valid values: `sync` and `async`.
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Synchronization type. Valid values: `sync` and `async`.
     * @param SyncMode Synchronization type. Valid values: `sync` and `async`.
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Synchronization status. 1: synchronizing; 2: sync exception 
     * @return SyncStatus Synchronization status. 1: synchronizing; 2: sync exception
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set Synchronization status. 1: synchronizing; 2: sync exception
     * @param SyncStatus Synchronization status. 1: synchronizing; 2: sync exception
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get Synchronization status description. Error information when the synchronization status is abnormal. 
     * @return SyncStatusDesc Synchronization status description. Error information when the synchronization status is abnormal.
     */
    public String getSyncStatusDesc() {
        return this.SyncStatusDesc;
    }

    /**
     * Set Synchronization status description. Error information when the synchronization status is abnormal.
     * @param SyncStatusDesc Synchronization status description. Error information when the synchronization status is abnormal.
     */
    public void setSyncStatusDesc(String SyncStatusDesc) {
        this.SyncStatusDesc = SyncStatusDesc;
    }

    /**
     * Get Disaster recovery status description. Valid values: "creating", "running", "modifying". Empty if no disaster recovery relationship exists. 
     * @return StandbyStatus Disaster recovery status description. Valid values: "creating", "running", "modifying". Empty if no disaster recovery relationship exists.
     */
    public String getStandbyStatus() {
        return this.StandbyStatus;
    }

    /**
     * Set Disaster recovery status description. Valid values: "creating", "running", "modifying". Empty if no disaster recovery relationship exists.
     * @param StandbyStatus Disaster recovery status description. Valid values: "creating", "running", "modifying". Empty if no disaster recovery relationship exists.
     */
    public void setStandbyStatus(String StandbyStatus) {
        this.StandbyStatus = StandbyStatus;
    }

    /**
     * Get Primary instance version 
     * @return PrimaryCreateVersion Primary instance version
     */
    public String getPrimaryCreateVersion() {
        return this.PrimaryCreateVersion;
    }

    /**
     * Set Primary instance version
     * @param PrimaryCreateVersion Primary instance version
     */
    public void setPrimaryCreateVersion(String PrimaryCreateVersion) {
        this.PrimaryCreateVersion = PrimaryCreateVersion;
    }

    /**
     * Get Disaster Recovery instance version 
     * @return SecondaryCreateVersion Disaster Recovery instance version
     */
    public String getSecondaryCreateVersion() {
        return this.SecondaryCreateVersion;
    }

    /**
     * Set Disaster Recovery instance version
     * @param SecondaryCreateVersion Disaster Recovery instance version
     */
    public void setSecondaryCreateVersion(String SecondaryCreateVersion) {
        this.SecondaryCreateVersion = SecondaryCreateVersion;
    }

    /**
     * Get Latency in seconds 
     * @return SyncDelay Latency in seconds
     */
    public Long getSyncDelay() {
        return this.SyncDelay;
    }

    /**
     * Set Latency in seconds
     * @param SyncDelay Latency in seconds
     */
    public void setSyncDelay(Long SyncDelay) {
        this.SyncDelay = SyncDelay;
    }

    public StandbyDBInstanceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandbyDBInstanceRelation(StandbyDBInstanceRelation source) {
        if (source.PrimaryInstanceId != null) {
            this.PrimaryInstanceId = new String(source.PrimaryInstanceId);
        }
        if (source.PrimaryInstanceName != null) {
            this.PrimaryInstanceName = new String(source.PrimaryInstanceName);
        }
        if (source.PrimaryRegion != null) {
            this.PrimaryRegion = new String(source.PrimaryRegion);
        }
        if (source.PrimaryVip != null) {
            this.PrimaryVip = new String(source.PrimaryVip);
        }
        if (source.PrimaryVport != null) {
            this.PrimaryVport = new Long(source.PrimaryVport);
        }
        if (source.PrimaryZones != null) {
            this.PrimaryZones = new String[source.PrimaryZones.length];
            for (int i = 0; i < source.PrimaryZones.length; i++) {
                this.PrimaryZones[i] = new String(source.PrimaryZones[i]);
            }
        }
        if (source.PrimaryStatus != null) {
            this.PrimaryStatus = new String(source.PrimaryStatus);
        }
        if (source.SecondaryInstanceId != null) {
            this.SecondaryInstanceId = new String(source.SecondaryInstanceId);
        }
        if (source.SecondaryInstanceName != null) {
            this.SecondaryInstanceName = new String(source.SecondaryInstanceName);
        }
        if (source.SecondaryRegion != null) {
            this.SecondaryRegion = new String(source.SecondaryRegion);
        }
        if (source.SecondaryVip != null) {
            this.SecondaryVip = new String(source.SecondaryVip);
        }
        if (source.SecondaryVport != null) {
            this.SecondaryVport = new Long(source.SecondaryVport);
        }
        if (source.SecondaryZones != null) {
            this.SecondaryZones = new String[source.SecondaryZones.length];
            for (int i = 0; i < source.SecondaryZones.length; i++) {
                this.SecondaryZones[i] = new String(source.SecondaryZones[i]);
            }
        }
        if (source.SecondaryStatus != null) {
            this.SecondaryStatus = new String(source.SecondaryStatus);
        }
        if (source.ConnType != null) {
            this.ConnType = new String(source.ConnType);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.SyncStatusDesc != null) {
            this.SyncStatusDesc = new String(source.SyncStatusDesc);
        }
        if (source.StandbyStatus != null) {
            this.StandbyStatus = new String(source.StandbyStatus);
        }
        if (source.PrimaryCreateVersion != null) {
            this.PrimaryCreateVersion = new String(source.PrimaryCreateVersion);
        }
        if (source.SecondaryCreateVersion != null) {
            this.SecondaryCreateVersion = new String(source.SecondaryCreateVersion);
        }
        if (source.SyncDelay != null) {
            this.SyncDelay = new Long(source.SyncDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryInstanceId", this.PrimaryInstanceId);
        this.setParamSimple(map, prefix + "PrimaryInstanceName", this.PrimaryInstanceName);
        this.setParamSimple(map, prefix + "PrimaryRegion", this.PrimaryRegion);
        this.setParamSimple(map, prefix + "PrimaryVip", this.PrimaryVip);
        this.setParamSimple(map, prefix + "PrimaryVport", this.PrimaryVport);
        this.setParamArraySimple(map, prefix + "PrimaryZones.", this.PrimaryZones);
        this.setParamSimple(map, prefix + "PrimaryStatus", this.PrimaryStatus);
        this.setParamSimple(map, prefix + "SecondaryInstanceId", this.SecondaryInstanceId);
        this.setParamSimple(map, prefix + "SecondaryInstanceName", this.SecondaryInstanceName);
        this.setParamSimple(map, prefix + "SecondaryRegion", this.SecondaryRegion);
        this.setParamSimple(map, prefix + "SecondaryVip", this.SecondaryVip);
        this.setParamSimple(map, prefix + "SecondaryVport", this.SecondaryVport);
        this.setParamArraySimple(map, prefix + "SecondaryZones.", this.SecondaryZones);
        this.setParamSimple(map, prefix + "SecondaryStatus", this.SecondaryStatus);
        this.setParamSimple(map, prefix + "ConnType", this.ConnType);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncStatusDesc", this.SyncStatusDesc);
        this.setParamSimple(map, prefix + "StandbyStatus", this.StandbyStatus);
        this.setParamSimple(map, prefix + "PrimaryCreateVersion", this.PrimaryCreateVersion);
        this.setParamSimple(map, prefix + "SecondaryCreateVersion", this.SecondaryCreateVersion);
        this.setParamSimple(map, prefix + "SyncDelay", this.SyncDelay);

    }
}

