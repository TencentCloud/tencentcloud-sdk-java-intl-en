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

public class DbNormalDetail extends AbstractModel {

    /**
    * Whether it is subscribed. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsSubscribed")
    @Expose
    private String IsSubscribed;

    /**
    * Database collation
    */
    @SerializedName("CollationName")
    @Expose
    private String CollationName;

    /**
    * Whether the cleanup task is enabled to automatically remove old change tracking information when CT is enabled. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsAutoCleanupOn")
    @Expose
    private String IsAutoCleanupOn;

    /**
    * Whether SQL Server Service Broker is enabled. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsBrokerEnabled")
    @Expose
    private String IsBrokerEnabled;

    /**
    * Whether CDC is enabled. Valid values: `0` (disabled), `1` (enabled)
    */
    @SerializedName("IsCdcEnabled")
    @Expose
    private String IsCdcEnabled;

    /**
    * Whether CT is enabled. Valid values: `0` (disabled), `1` (enabled)
    */
    @SerializedName("IsDbChainingOn")
    @Expose
    private String IsDbChainingOn;

    /**
    * Whether it is encrypted. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsEncrypted")
    @Expose
    private String IsEncrypted;

    /**
    * Whether full-text indexes are enabled. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsFulltextEnabled")
    @Expose
    private String IsFulltextEnabled;

    /**
    * Whether it is a mirror database. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsMirroring")
    @Expose
    private String IsMirroring;

    /**
    * Whether it is published. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsPublished")
    @Expose
    private String IsPublished;

    /**
    * Whether snapshots are enabled. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsReadCommittedSnapshotOn")
    @Expose
    private String IsReadCommittedSnapshotOn;

    /**
    * Whether it is trustworthy. Valid values: `0` (no), `1` (yes)
    */
    @SerializedName("IsTrustworthyOn")
    @Expose
    private String IsTrustworthyOn;

    /**
    * Mirroring state
    */
    @SerializedName("MirroringState")
    @Expose
    private String MirroringState;

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Recovery model
    */
    @SerializedName("RecoveryModelDesc")
    @Expose
    private String RecoveryModelDesc;

    /**
    * Retention period (in days) of change tracking information
    */
    @SerializedName("RetentionPeriod")
    @Expose
    private String RetentionPeriod;

    /**
    * Database status
    */
    @SerializedName("StateDesc")
    @Expose
    private String StateDesc;

    /**
    * User type
    */
    @SerializedName("UserAccessDesc")
    @Expose
    private String UserAccessDesc;

    /**
    * Database creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Whether it is subscribed. Valid values: `0` (no), `1` (yes) 
     * @return IsSubscribed Whether it is subscribed. Valid values: `0` (no), `1` (yes)
     */
    public String getIsSubscribed() {
        return this.IsSubscribed;
    }

    /**
     * Set Whether it is subscribed. Valid values: `0` (no), `1` (yes)
     * @param IsSubscribed Whether it is subscribed. Valid values: `0` (no), `1` (yes)
     */
    public void setIsSubscribed(String IsSubscribed) {
        this.IsSubscribed = IsSubscribed;
    }

    /**
     * Get Database collation 
     * @return CollationName Database collation
     */
    public String getCollationName() {
        return this.CollationName;
    }

    /**
     * Set Database collation
     * @param CollationName Database collation
     */
    public void setCollationName(String CollationName) {
        this.CollationName = CollationName;
    }

    /**
     * Get Whether the cleanup task is enabled to automatically remove old change tracking information when CT is enabled. Valid values: `0` (no), `1` (yes) 
     * @return IsAutoCleanupOn Whether the cleanup task is enabled to automatically remove old change tracking information when CT is enabled. Valid values: `0` (no), `1` (yes)
     */
    public String getIsAutoCleanupOn() {
        return this.IsAutoCleanupOn;
    }

    /**
     * Set Whether the cleanup task is enabled to automatically remove old change tracking information when CT is enabled. Valid values: `0` (no), `1` (yes)
     * @param IsAutoCleanupOn Whether the cleanup task is enabled to automatically remove old change tracking information when CT is enabled. Valid values: `0` (no), `1` (yes)
     */
    public void setIsAutoCleanupOn(String IsAutoCleanupOn) {
        this.IsAutoCleanupOn = IsAutoCleanupOn;
    }

    /**
     * Get Whether SQL Server Service Broker is enabled. Valid values: `0` (no), `1` (yes) 
     * @return IsBrokerEnabled Whether SQL Server Service Broker is enabled. Valid values: `0` (no), `1` (yes)
     */
    public String getIsBrokerEnabled() {
        return this.IsBrokerEnabled;
    }

    /**
     * Set Whether SQL Server Service Broker is enabled. Valid values: `0` (no), `1` (yes)
     * @param IsBrokerEnabled Whether SQL Server Service Broker is enabled. Valid values: `0` (no), `1` (yes)
     */
    public void setIsBrokerEnabled(String IsBrokerEnabled) {
        this.IsBrokerEnabled = IsBrokerEnabled;
    }

    /**
     * Get Whether CDC is enabled. Valid values: `0` (disabled), `1` (enabled) 
     * @return IsCdcEnabled Whether CDC is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public String getIsCdcEnabled() {
        return this.IsCdcEnabled;
    }

    /**
     * Set Whether CDC is enabled. Valid values: `0` (disabled), `1` (enabled)
     * @param IsCdcEnabled Whether CDC is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public void setIsCdcEnabled(String IsCdcEnabled) {
        this.IsCdcEnabled = IsCdcEnabled;
    }

    /**
     * Get Whether CT is enabled. Valid values: `0` (disabled), `1` (enabled) 
     * @return IsDbChainingOn Whether CT is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public String getIsDbChainingOn() {
        return this.IsDbChainingOn;
    }

    /**
     * Set Whether CT is enabled. Valid values: `0` (disabled), `1` (enabled)
     * @param IsDbChainingOn Whether CT is enabled. Valid values: `0` (disabled), `1` (enabled)
     */
    public void setIsDbChainingOn(String IsDbChainingOn) {
        this.IsDbChainingOn = IsDbChainingOn;
    }

    /**
     * Get Whether it is encrypted. Valid values: `0` (no), `1` (yes) 
     * @return IsEncrypted Whether it is encrypted. Valid values: `0` (no), `1` (yes)
     */
    public String getIsEncrypted() {
        return this.IsEncrypted;
    }

    /**
     * Set Whether it is encrypted. Valid values: `0` (no), `1` (yes)
     * @param IsEncrypted Whether it is encrypted. Valid values: `0` (no), `1` (yes)
     */
    public void setIsEncrypted(String IsEncrypted) {
        this.IsEncrypted = IsEncrypted;
    }

    /**
     * Get Whether full-text indexes are enabled. Valid values: `0` (no), `1` (yes) 
     * @return IsFulltextEnabled Whether full-text indexes are enabled. Valid values: `0` (no), `1` (yes)
     * @deprecated
     */
    @Deprecated
    public String getIsFulltextEnabled() {
        return this.IsFulltextEnabled;
    }

    /**
     * Set Whether full-text indexes are enabled. Valid values: `0` (no), `1` (yes)
     * @param IsFulltextEnabled Whether full-text indexes are enabled. Valid values: `0` (no), `1` (yes)
     * @deprecated
     */
    @Deprecated
    public void setIsFulltextEnabled(String IsFulltextEnabled) {
        this.IsFulltextEnabled = IsFulltextEnabled;
    }

    /**
     * Get Whether it is a mirror database. Valid values: `0` (no), `1` (yes) 
     * @return IsMirroring Whether it is a mirror database. Valid values: `0` (no), `1` (yes)
     */
    public String getIsMirroring() {
        return this.IsMirroring;
    }

    /**
     * Set Whether it is a mirror database. Valid values: `0` (no), `1` (yes)
     * @param IsMirroring Whether it is a mirror database. Valid values: `0` (no), `1` (yes)
     */
    public void setIsMirroring(String IsMirroring) {
        this.IsMirroring = IsMirroring;
    }

    /**
     * Get Whether it is published. Valid values: `0` (no), `1` (yes) 
     * @return IsPublished Whether it is published. Valid values: `0` (no), `1` (yes)
     */
    public String getIsPublished() {
        return this.IsPublished;
    }

    /**
     * Set Whether it is published. Valid values: `0` (no), `1` (yes)
     * @param IsPublished Whether it is published. Valid values: `0` (no), `1` (yes)
     */
    public void setIsPublished(String IsPublished) {
        this.IsPublished = IsPublished;
    }

    /**
     * Get Whether snapshots are enabled. Valid values: `0` (no), `1` (yes) 
     * @return IsReadCommittedSnapshotOn Whether snapshots are enabled. Valid values: `0` (no), `1` (yes)
     */
    public String getIsReadCommittedSnapshotOn() {
        return this.IsReadCommittedSnapshotOn;
    }

    /**
     * Set Whether snapshots are enabled. Valid values: `0` (no), `1` (yes)
     * @param IsReadCommittedSnapshotOn Whether snapshots are enabled. Valid values: `0` (no), `1` (yes)
     */
    public void setIsReadCommittedSnapshotOn(String IsReadCommittedSnapshotOn) {
        this.IsReadCommittedSnapshotOn = IsReadCommittedSnapshotOn;
    }

    /**
     * Get Whether it is trustworthy. Valid values: `0` (no), `1` (yes) 
     * @return IsTrustworthyOn Whether it is trustworthy. Valid values: `0` (no), `1` (yes)
     */
    public String getIsTrustworthyOn() {
        return this.IsTrustworthyOn;
    }

    /**
     * Set Whether it is trustworthy. Valid values: `0` (no), `1` (yes)
     * @param IsTrustworthyOn Whether it is trustworthy. Valid values: `0` (no), `1` (yes)
     */
    public void setIsTrustworthyOn(String IsTrustworthyOn) {
        this.IsTrustworthyOn = IsTrustworthyOn;
    }

    /**
     * Get Mirroring state 
     * @return MirroringState Mirroring state
     */
    public String getMirroringState() {
        return this.MirroringState;
    }

    /**
     * Set Mirroring state
     * @param MirroringState Mirroring state
     */
    public void setMirroringState(String MirroringState) {
        this.MirroringState = MirroringState;
    }

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Recovery model 
     * @return RecoveryModelDesc Recovery model
     */
    public String getRecoveryModelDesc() {
        return this.RecoveryModelDesc;
    }

    /**
     * Set Recovery model
     * @param RecoveryModelDesc Recovery model
     */
    public void setRecoveryModelDesc(String RecoveryModelDesc) {
        this.RecoveryModelDesc = RecoveryModelDesc;
    }

    /**
     * Get Retention period (in days) of change tracking information 
     * @return RetentionPeriod Retention period (in days) of change tracking information
     */
    public String getRetentionPeriod() {
        return this.RetentionPeriod;
    }

    /**
     * Set Retention period (in days) of change tracking information
     * @param RetentionPeriod Retention period (in days) of change tracking information
     */
    public void setRetentionPeriod(String RetentionPeriod) {
        this.RetentionPeriod = RetentionPeriod;
    }

    /**
     * Get Database status 
     * @return StateDesc Database status
     */
    public String getStateDesc() {
        return this.StateDesc;
    }

    /**
     * Set Database status
     * @param StateDesc Database status
     */
    public void setStateDesc(String StateDesc) {
        this.StateDesc = StateDesc;
    }

    /**
     * Get User type 
     * @return UserAccessDesc User type
     */
    public String getUserAccessDesc() {
        return this.UserAccessDesc;
    }

    /**
     * Set User type
     * @param UserAccessDesc User type
     */
    public void setUserAccessDesc(String UserAccessDesc) {
        this.UserAccessDesc = UserAccessDesc;
    }

    /**
     * Get Database creation time 
     * @return CreateTime Database creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Database creation time
     * @param CreateTime Database creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DbNormalDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbNormalDetail(DbNormalDetail source) {
        if (source.IsSubscribed != null) {
            this.IsSubscribed = new String(source.IsSubscribed);
        }
        if (source.CollationName != null) {
            this.CollationName = new String(source.CollationName);
        }
        if (source.IsAutoCleanupOn != null) {
            this.IsAutoCleanupOn = new String(source.IsAutoCleanupOn);
        }
        if (source.IsBrokerEnabled != null) {
            this.IsBrokerEnabled = new String(source.IsBrokerEnabled);
        }
        if (source.IsCdcEnabled != null) {
            this.IsCdcEnabled = new String(source.IsCdcEnabled);
        }
        if (source.IsDbChainingOn != null) {
            this.IsDbChainingOn = new String(source.IsDbChainingOn);
        }
        if (source.IsEncrypted != null) {
            this.IsEncrypted = new String(source.IsEncrypted);
        }
        if (source.IsFulltextEnabled != null) {
            this.IsFulltextEnabled = new String(source.IsFulltextEnabled);
        }
        if (source.IsMirroring != null) {
            this.IsMirroring = new String(source.IsMirroring);
        }
        if (source.IsPublished != null) {
            this.IsPublished = new String(source.IsPublished);
        }
        if (source.IsReadCommittedSnapshotOn != null) {
            this.IsReadCommittedSnapshotOn = new String(source.IsReadCommittedSnapshotOn);
        }
        if (source.IsTrustworthyOn != null) {
            this.IsTrustworthyOn = new String(source.IsTrustworthyOn);
        }
        if (source.MirroringState != null) {
            this.MirroringState = new String(source.MirroringState);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RecoveryModelDesc != null) {
            this.RecoveryModelDesc = new String(source.RecoveryModelDesc);
        }
        if (source.RetentionPeriod != null) {
            this.RetentionPeriod = new String(source.RetentionPeriod);
        }
        if (source.StateDesc != null) {
            this.StateDesc = new String(source.StateDesc);
        }
        if (source.UserAccessDesc != null) {
            this.UserAccessDesc = new String(source.UserAccessDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSubscribed", this.IsSubscribed);
        this.setParamSimple(map, prefix + "CollationName", this.CollationName);
        this.setParamSimple(map, prefix + "IsAutoCleanupOn", this.IsAutoCleanupOn);
        this.setParamSimple(map, prefix + "IsBrokerEnabled", this.IsBrokerEnabled);
        this.setParamSimple(map, prefix + "IsCdcEnabled", this.IsCdcEnabled);
        this.setParamSimple(map, prefix + "IsDbChainingOn", this.IsDbChainingOn);
        this.setParamSimple(map, prefix + "IsEncrypted", this.IsEncrypted);
        this.setParamSimple(map, prefix + "IsFulltextEnabled", this.IsFulltextEnabled);
        this.setParamSimple(map, prefix + "IsMirroring", this.IsMirroring);
        this.setParamSimple(map, prefix + "IsPublished", this.IsPublished);
        this.setParamSimple(map, prefix + "IsReadCommittedSnapshotOn", this.IsReadCommittedSnapshotOn);
        this.setParamSimple(map, prefix + "IsTrustworthyOn", this.IsTrustworthyOn);
        this.setParamSimple(map, prefix + "MirroringState", this.MirroringState);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RecoveryModelDesc", this.RecoveryModelDesc);
        this.setParamSimple(map, prefix + "RetentionPeriod", this.RetentionPeriod);
        this.setParamSimple(map, prefix + "StateDesc", this.StateDesc);
        this.setParamSimple(map, prefix + "UserAccessDesc", this.UserAccessDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

