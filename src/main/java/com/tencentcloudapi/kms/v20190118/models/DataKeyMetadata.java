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
    * DataKey globally unique id.
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * Globally unique id of the CMK.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key name as a more recognizable and understandable data key.
    */
    @SerializedName("DataKeyName")
    @Expose
    private String DataKeyName;

    /**
    * Specifies the length of the data key in bytes.
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
    * Key key creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * DataKey description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * DataKey status. valid values: Enabled, Disabled, PendingDelete.
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * Creator.
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * Specifies the creator of the data key. valid values: user (user-created) or product name (auto-created by authorized cloud services).
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * The time when schedule deletion.
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * Specifies the key material type of DataKey. valid values: TENCENT_KMS (created by KMS), EXTERNAL (user import).
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * HSM cluster ID (only applicable to KMS exclusive/managed service instance).
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * Resource ID in the format of `creatorUin/$creatorUin/$dataKeyId`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Whether the key is a primary replica. valid values: `0` (primary), `1` (synced replica).
    */
    @SerializedName("IsSyncReplica")
    @Expose
    private Long IsSyncReplica;

    /**
    * Synchronous original region.
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * The state of key synchronization. valid values: 0 (unsynced), 1 (synchronization successful), 2 (synchronization failed), 3 (synchronizing).
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * Sresult description}.
    */
    @SerializedName("SyncMessages")
    @Expose
    private String SyncMessages;

    /**
    * Start time of synchronization.
    */
    @SerializedName("SyncStartTime")
    @Expose
    private Long SyncStartTime;

    /**
    * Specifies the synchronous end time.
    */
    @SerializedName("SyncEndTime")
    @Expose
    private Long SyncEndTime;

    /**
    * Synchronous original cluster. if empty, it is a public cloud public cluster.
    */
    @SerializedName("SourceHsmClusterId")
    @Expose
    private String SourceHsmClusterId;

    /**
     * Get DataKey globally unique id. 
     * @return DataKeyId DataKey globally unique id.
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set DataKey globally unique id.
     * @param DataKeyId DataKey globally unique id.
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
    }

    /**
     * Get Globally unique id of the CMK. 
     * @return KeyId Globally unique id of the CMK.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique id of the CMK.
     * @param KeyId Globally unique id of the CMK.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key name as a more recognizable and understandable data key. 
     * @return DataKeyName Key name as a more recognizable and understandable data key.
     */
    public String getDataKeyName() {
        return this.DataKeyName;
    }

    /**
     * Set Key name as a more recognizable and understandable data key.
     * @param DataKeyName Key name as a more recognizable and understandable data key.
     */
    public void setDataKeyName(String DataKeyName) {
        this.DataKeyName = DataKeyName;
    }

    /**
     * Get Specifies the length of the data key in bytes. 
     * @return NumberOfBytes Specifies the length of the data key in bytes.
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * Set Specifies the length of the data key in bytes.
     * @param NumberOfBytes Specifies the length of the data key in bytes.
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * Get Key key creation time. 
     * @return CreateTime Key key creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key key creation time.
     * @param CreateTime Key key creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get DataKey description. 
     * @return Description DataKey description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DataKey description.
     * @param Description DataKey description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get DataKey status. valid values: Enabled, Disabled, PendingDelete. 
     * @return KeyState DataKey status. valid values: Enabled, Disabled, PendingDelete.
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set DataKey status. valid values: Enabled, Disabled, PendingDelete.
     * @param KeyState DataKey status. valid values: Enabled, Disabled, PendingDelete.
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get Creator. 
     * @return CreatorUin Creator.
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator.
     * @param CreatorUin Creator.
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Specifies the creator of the data key. valid values: user (user-created) or product name (auto-created by authorized cloud services). 
     * @return Owner Specifies the creator of the data key. valid values: user (user-created) or product name (auto-created by authorized cloud services).
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Specifies the creator of the data key. valid values: user (user-created) or product name (auto-created by authorized cloud services).
     * @param Owner Specifies the creator of the data key. valid values: user (user-created) or product name (auto-created by authorized cloud services).
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get The time when schedule deletion. 
     * @return DeletionDate The time when schedule deletion.
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set The time when schedule deletion.
     * @param DeletionDate The time when schedule deletion.
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get Specifies the key material type of DataKey. valid values: TENCENT_KMS (created by KMS), EXTERNAL (user import). 
     * @return Origin Specifies the key material type of DataKey. valid values: TENCENT_KMS (created by KMS), EXTERNAL (user import).
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Specifies the key material type of DataKey. valid values: TENCENT_KMS (created by KMS), EXTERNAL (user import).
     * @param Origin Specifies the key material type of DataKey. valid values: TENCENT_KMS (created by KMS), EXTERNAL (user import).
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get HSM cluster ID (only applicable to KMS exclusive/managed service instance). 
     * @return HsmClusterId HSM cluster ID (only applicable to KMS exclusive/managed service instance).
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM cluster ID (only applicable to KMS exclusive/managed service instance).
     * @param HsmClusterId HSM cluster ID (only applicable to KMS exclusive/managed service instance).
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get Resource ID in the format of `creatorUin/$creatorUin/$dataKeyId`. 
     * @return ResourceId Resource ID in the format of `creatorUin/$creatorUin/$dataKeyId`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID in the format of `creatorUin/$creatorUin/$dataKeyId`.
     * @param ResourceId Resource ID in the format of `creatorUin/$creatorUin/$dataKeyId`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Whether the key is a primary replica. valid values: `0` (primary), `1` (synced replica). 
     * @return IsSyncReplica Whether the key is a primary replica. valid values: `0` (primary), `1` (synced replica).
     */
    public Long getIsSyncReplica() {
        return this.IsSyncReplica;
    }

    /**
     * Set Whether the key is a primary replica. valid values: `0` (primary), `1` (synced replica).
     * @param IsSyncReplica Whether the key is a primary replica. valid values: `0` (primary), `1` (synced replica).
     */
    public void setIsSyncReplica(Long IsSyncReplica) {
        this.IsSyncReplica = IsSyncReplica;
    }

    /**
     * Get Synchronous original region. 
     * @return SourceRegion Synchronous original region.
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set Synchronous original region.
     * @param SourceRegion Synchronous original region.
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get The state of key synchronization. valid values: 0 (unsynced), 1 (synchronization successful), 2 (synchronization failed), 3 (synchronizing). 
     * @return SyncStatus The state of key synchronization. valid values: 0 (unsynced), 1 (synchronization successful), 2 (synchronization failed), 3 (synchronizing).
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set The state of key synchronization. valid values: 0 (unsynced), 1 (synchronization successful), 2 (synchronization failed), 3 (synchronizing).
     * @param SyncStatus The state of key synchronization. valid values: 0 (unsynced), 1 (synchronization successful), 2 (synchronization failed), 3 (synchronizing).
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get Sresult description}. 
     * @return SyncMessages Sresult description}.
     */
    public String getSyncMessages() {
        return this.SyncMessages;
    }

    /**
     * Set Sresult description}.
     * @param SyncMessages Sresult description}.
     */
    public void setSyncMessages(String SyncMessages) {
        this.SyncMessages = SyncMessages;
    }

    /**
     * Get Start time of synchronization. 
     * @return SyncStartTime Start time of synchronization.
     */
    public Long getSyncStartTime() {
        return this.SyncStartTime;
    }

    /**
     * Set Start time of synchronization.
     * @param SyncStartTime Start time of synchronization.
     */
    public void setSyncStartTime(Long SyncStartTime) {
        this.SyncStartTime = SyncStartTime;
    }

    /**
     * Get Specifies the synchronous end time. 
     * @return SyncEndTime Specifies the synchronous end time.
     */
    public Long getSyncEndTime() {
        return this.SyncEndTime;
    }

    /**
     * Set Specifies the synchronous end time.
     * @param SyncEndTime Specifies the synchronous end time.
     */
    public void setSyncEndTime(Long SyncEndTime) {
        this.SyncEndTime = SyncEndTime;
    }

    /**
     * Get Synchronous original cluster. if empty, it is a public cloud public cluster. 
     * @return SourceHsmClusterId Synchronous original cluster. if empty, it is a public cloud public cluster.
     */
    public String getSourceHsmClusterId() {
        return this.SourceHsmClusterId;
    }

    /**
     * Set Synchronous original cluster. if empty, it is a public cloud public cluster.
     * @param SourceHsmClusterId Synchronous original cluster. if empty, it is a public cloud public cluster.
     */
    public void setSourceHsmClusterId(String SourceHsmClusterId) {
        this.SourceHsmClusterId = SourceHsmClusterId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
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

    }
}

