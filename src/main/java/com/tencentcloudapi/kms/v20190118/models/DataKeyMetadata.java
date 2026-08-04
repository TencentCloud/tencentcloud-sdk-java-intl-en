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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataKeyMetadata extends AbstractModel {

    /**
    * <p>Globally unique ID of the DataKey</p>
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * <p>Globally unique ID of the CMK.</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>CMK name</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>Data key name that is easier to identify and understand as a key</p>
    */
    @SerializedName("DataKeyName")
    @Expose
    private String DataKeyName;

    /**
    * <p>Length of the data key, in bytes</p>
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
    * <p>Key creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Description of DataKey</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>DataKey state, value: Enabled | Disabled | PendingDelete</p>
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * <p>Creator of the data key. For user-created keys, it is user; for keys automatically created by authorized cloud services, it is the corresponding product name.</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>Schedule deletion time</p>
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * <p>DataKey key material type. For keys created by KMS: TENCENT_KMS. For keys of user import type: EXTERNAL.</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>HSM Cluster ID (only applicable to KMS exclusive edition/managed version service instances)</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>Resource ID, format: creatorUin/$creatorUin/$dataKeyId</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Whether the key is a primary replica. 0: primary replica, 1: synced replica.</p>
    */
    @SerializedName("IsSyncReplica")
    @Expose
    private Long IsSyncReplica;

    /**
    * <p>Synchronous original region</p>
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * <p>Key synchronization status. 0: unsynced, 1: synchronization successful, 2: synchronization failure, 3: syncing.</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * <p>Synchronous result description</p>
    */
    @SerializedName("SyncMessages")
    @Expose
    private String SyncMessages;

    /**
    * <p>Start time of synchronization</p>
    */
    @SerializedName("SyncStartTime")
    @Expose
    private Long SyncStartTime;

    /**
    * <p>Synchronous end time</p>
    */
    @SerializedName("SyncEndTime")
    @Expose
    private Long SyncEndTime;

    /**
    * <p>Synchronous primitive cluster. If empty, it is a public cloud public cluster.</p>
    */
    @SerializedName("SourceHsmClusterId")
    @Expose
    private String SourceHsmClusterId;

    /**
    * <p>Member account appId</p>
    */
    @SerializedName("AccountAppId")
    @Expose
    private Long AccountAppId;

    /**
    * <p>member account uin</p>
    */
    @SerializedName("AccountUin")
    @Expose
    private Long AccountUin;

    /**
    * <p>Enter the member account name.</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Creator UIN</p>
    */
    @SerializedName("CreatorUinString")
    @Expose
    private String CreatorUinString;

    /**
     * Get <p>Globally unique ID of the DataKey</p> 
     * @return DataKeyId <p>Globally unique ID of the DataKey</p>
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set <p>Globally unique ID of the DataKey</p>
     * @param DataKeyId <p>Globally unique ID of the DataKey</p>
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
    }

    /**
     * Get <p>Globally unique ID of the CMK.</p> 
     * @return KeyId <p>Globally unique ID of the CMK.</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Globally unique ID of the CMK.</p>
     * @param KeyId <p>Globally unique ID of the CMK.</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>CMK name</p> 
     * @return KeyName <p>CMK name</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>CMK name</p>
     * @param KeyName <p>CMK name</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>Data key name that is easier to identify and understand as a key</p> 
     * @return DataKeyName <p>Data key name that is easier to identify and understand as a key</p>
     */
    public String getDataKeyName() {
        return this.DataKeyName;
    }

    /**
     * Set <p>Data key name that is easier to identify and understand as a key</p>
     * @param DataKeyName <p>Data key name that is easier to identify and understand as a key</p>
     */
    public void setDataKeyName(String DataKeyName) {
        this.DataKeyName = DataKeyName;
    }

    /**
     * Get <p>Length of the data key, in bytes</p> 
     * @return NumberOfBytes <p>Length of the data key, in bytes</p>
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * Set <p>Length of the data key, in bytes</p>
     * @param NumberOfBytes <p>Length of the data key, in bytes</p>
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * Get <p>Key creation time</p> 
     * @return CreateTime <p>Key creation time</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Key creation time</p>
     * @param CreateTime <p>Key creation time</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Description of DataKey</p> 
     * @return Description <p>Description of DataKey</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description of DataKey</p>
     * @param Description <p>Description of DataKey</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>DataKey state, value: Enabled | Disabled | PendingDelete</p> 
     * @return KeyState <p>DataKey state, value: Enabled | Disabled | PendingDelete</p>
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>DataKey state, value: Enabled | Disabled | PendingDelete</p>
     * @param KeyState <p>DataKey state, value: Enabled | Disabled | PendingDelete</p>
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreatorUin <p>Creator.</p>
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreatorUin <p>Creator.</p>
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>Creator of the data key. For user-created keys, it is user; for keys automatically created by authorized cloud services, it is the corresponding product name.</p> 
     * @return Owner <p>Creator of the data key. For user-created keys, it is user; for keys automatically created by authorized cloud services, it is the corresponding product name.</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>Creator of the data key. For user-created keys, it is user; for keys automatically created by authorized cloud services, it is the corresponding product name.</p>
     * @param Owner <p>Creator of the data key. For user-created keys, it is user; for keys automatically created by authorized cloud services, it is the corresponding product name.</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>Schedule deletion time</p> 
     * @return DeletionDate <p>Schedule deletion time</p>
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set <p>Schedule deletion time</p>
     * @param DeletionDate <p>Schedule deletion time</p>
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get <p>DataKey key material type. For keys created by KMS: TENCENT_KMS. For keys of user import type: EXTERNAL.</p> 
     * @return Origin <p>DataKey key material type. For keys created by KMS: TENCENT_KMS. For keys of user import type: EXTERNAL.</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>DataKey key material type. For keys created by KMS: TENCENT_KMS. For keys of user import type: EXTERNAL.</p>
     * @param Origin <p>DataKey key material type. For keys created by KMS: TENCENT_KMS. For keys of user import type: EXTERNAL.</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>HSM Cluster ID (only applicable to KMS exclusive edition/managed version service instances)</p> 
     * @return HsmClusterId <p>HSM Cluster ID (only applicable to KMS exclusive edition/managed version service instances)</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM Cluster ID (only applicable to KMS exclusive edition/managed version service instances)</p>
     * @param HsmClusterId <p>HSM Cluster ID (only applicable to KMS exclusive edition/managed version service instances)</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>Resource ID, format: creatorUin/$creatorUin/$dataKeyId</p> 
     * @return ResourceId <p>Resource ID, format: creatorUin/$creatorUin/$dataKeyId</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID, format: creatorUin/$creatorUin/$dataKeyId</p>
     * @param ResourceId <p>Resource ID, format: creatorUin/$creatorUin/$dataKeyId</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Whether the key is a primary replica. 0: primary replica, 1: synced replica.</p> 
     * @return IsSyncReplica <p>Whether the key is a primary replica. 0: primary replica, 1: synced replica.</p>
     */
    public Long getIsSyncReplica() {
        return this.IsSyncReplica;
    }

    /**
     * Set <p>Whether the key is a primary replica. 0: primary replica, 1: synced replica.</p>
     * @param IsSyncReplica <p>Whether the key is a primary replica. 0: primary replica, 1: synced replica.</p>
     */
    public void setIsSyncReplica(Long IsSyncReplica) {
        this.IsSyncReplica = IsSyncReplica;
    }

    /**
     * Get <p>Synchronous original region</p> 
     * @return SourceRegion <p>Synchronous original region</p>
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set <p>Synchronous original region</p>
     * @param SourceRegion <p>Synchronous original region</p>
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get <p>Key synchronization status. 0: unsynced, 1: synchronization successful, 2: synchronization failure, 3: syncing.</p> 
     * @return SyncStatus <p>Key synchronization status. 0: unsynced, 1: synchronization successful, 2: synchronization failure, 3: syncing.</p>
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>Key synchronization status. 0: unsynced, 1: synchronization successful, 2: synchronization failure, 3: syncing.</p>
     * @param SyncStatus <p>Key synchronization status. 0: unsynced, 1: synchronization successful, 2: synchronization failure, 3: syncing.</p>
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>Synchronous result description</p> 
     * @return SyncMessages <p>Synchronous result description</p>
     */
    public String getSyncMessages() {
        return this.SyncMessages;
    }

    /**
     * Set <p>Synchronous result description</p>
     * @param SyncMessages <p>Synchronous result description</p>
     */
    public void setSyncMessages(String SyncMessages) {
        this.SyncMessages = SyncMessages;
    }

    /**
     * Get <p>Start time of synchronization</p> 
     * @return SyncStartTime <p>Start time of synchronization</p>
     */
    public Long getSyncStartTime() {
        return this.SyncStartTime;
    }

    /**
     * Set <p>Start time of synchronization</p>
     * @param SyncStartTime <p>Start time of synchronization</p>
     */
    public void setSyncStartTime(Long SyncStartTime) {
        this.SyncStartTime = SyncStartTime;
    }

    /**
     * Get <p>Synchronous end time</p> 
     * @return SyncEndTime <p>Synchronous end time</p>
     */
    public Long getSyncEndTime() {
        return this.SyncEndTime;
    }

    /**
     * Set <p>Synchronous end time</p>
     * @param SyncEndTime <p>Synchronous end time</p>
     */
    public void setSyncEndTime(Long SyncEndTime) {
        this.SyncEndTime = SyncEndTime;
    }

    /**
     * Get <p>Synchronous primitive cluster. If empty, it is a public cloud public cluster.</p> 
     * @return SourceHsmClusterId <p>Synchronous primitive cluster. If empty, it is a public cloud public cluster.</p>
     */
    public String getSourceHsmClusterId() {
        return this.SourceHsmClusterId;
    }

    /**
     * Set <p>Synchronous primitive cluster. If empty, it is a public cloud public cluster.</p>
     * @param SourceHsmClusterId <p>Synchronous primitive cluster. If empty, it is a public cloud public cluster.</p>
     */
    public void setSourceHsmClusterId(String SourceHsmClusterId) {
        this.SourceHsmClusterId = SourceHsmClusterId;
    }

    /**
     * Get <p>Member account appId</p> 
     * @return AccountAppId <p>Member account appId</p>
     */
    public Long getAccountAppId() {
        return this.AccountAppId;
    }

    /**
     * Set <p>Member account appId</p>
     * @param AccountAppId <p>Member account appId</p>
     */
    public void setAccountAppId(Long AccountAppId) {
        this.AccountAppId = AccountAppId;
    }

    /**
     * Get <p>member account uin</p> 
     * @return AccountUin <p>member account uin</p>
     */
    public Long getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set <p>member account uin</p>
     * @param AccountUin <p>member account uin</p>
     */
    public void setAccountUin(Long AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get <p>Enter the member account name.</p> 
     * @return AccountName <p>Enter the member account name.</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Enter the member account name.</p>
     * @param AccountName <p>Enter the member account name.</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>Creator UIN</p> 
     * @return CreatorUinString <p>Creator UIN</p>
     */
    public String getCreatorUinString() {
        return this.CreatorUinString;
    }

    /**
     * Set <p>Creator UIN</p>
     * @param CreatorUinString <p>Creator UIN</p>
     */
    public void setCreatorUinString(String CreatorUinString) {
        this.CreatorUinString = CreatorUinString;
    }

    public DataKeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataKeyMetadata(DataKeyMetadata source) {
        if (source.DataKeyId != null) {
            this.DataKeyId = new String(source.DataKeyId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.DataKeyName != null) {
            this.DataKeyName = new String(source.DataKeyName);
        }
        if (source.NumberOfBytes != null) {
            this.NumberOfBytes = new Long(source.NumberOfBytes);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyState != null) {
            this.KeyState = new String(source.KeyState);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new Long(source.CreatorUin);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IsSyncReplica != null) {
            this.IsSyncReplica = new Long(source.IsSyncReplica);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.SyncMessages != null) {
            this.SyncMessages = new String(source.SyncMessages);
        }
        if (source.SyncStartTime != null) {
            this.SyncStartTime = new Long(source.SyncStartTime);
        }
        if (source.SyncEndTime != null) {
            this.SyncEndTime = new Long(source.SyncEndTime);
        }
        if (source.SourceHsmClusterId != null) {
            this.SourceHsmClusterId = new String(source.SourceHsmClusterId);
        }
        if (source.AccountAppId != null) {
            this.AccountAppId = new Long(source.AccountAppId);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new Long(source.AccountUin);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.CreatorUinString != null) {
            this.CreatorUinString = new String(source.CreatorUinString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "DataKeyName", this.DataKeyName);
        this.setParamSimple(map, prefix + "NumberOfBytes", this.NumberOfBytes);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "IsSyncReplica", this.IsSyncReplica);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncMessages", this.SyncMessages);
        this.setParamSimple(map, prefix + "SyncStartTime", this.SyncStartTime);
        this.setParamSimple(map, prefix + "SyncEndTime", this.SyncEndTime);
        this.setParamSimple(map, prefix + "SourceHsmClusterId", this.SourceHsmClusterId);
        this.setParamSimple(map, prefix + "AccountAppId", this.AccountAppId);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "CreatorUinString", this.CreatorUinString);

    }
}

