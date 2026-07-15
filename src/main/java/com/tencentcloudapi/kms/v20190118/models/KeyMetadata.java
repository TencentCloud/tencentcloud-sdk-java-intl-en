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

public class KeyMetadata extends AbstractModel {

    /**
    * <p>Globally unique ID of the CMK.</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>An alias name as a key that is easier to identify and understand</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Key creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Description of the CMK.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>CMK state, value: Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * <p>CMK purpose. Value: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>CMK type. 2 means compliant with FIPS 140-2 standard. 4 means compliant with national cryptography standards.</p><p>Enumeration value:</p><ul><li>2: Complies with FIPS 140-2 standard</li><li>4: Complies with national cryptography standards</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * <p>Is key rotation function enabled?</p>
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * <p>Creator of the CMK. For user-created CMKs, the value is user. For CMKs auto-created by authorized Cloud services, the value is the corresponding product name.</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>The time when the next rotation occurs with key rotation enabled</p>
    */
    @SerializedName("NextRotateTime")
    @Expose
    private Long NextRotateTime;

    /**
    * <p>The time when schedule deletion</p>
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * <p>CMK key material type. TENCENT_KMS for those created by KMS, EXTERNAL for user import.</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>Valid when Origin is EXTERNAL. Indicates the expiration date of the key material. 0 means never expire.</p>
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * <p>Resource ID, format: creatorUin/$creatorUin/$keyId</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>HSM Cluster ID (only applicable to KMS exclusive/managed service instance)</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>Key rotation cycle (days)</p>
    */
    @SerializedName("RotateDays")
    @Expose
    private Long RotateDays;

    /**
    * <p>Last rotation time (Unix timestamp).</p>
    */
    @SerializedName("LastRotateTime")
    @Expose
    private Long LastRotateTime;

    /**
    * <p>Whether the key is the primary replica. 0: primary replica, 1: synced replica.</p>
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
    * <p>Key synchronization state: 0: unsynced, 1: synced successfully, 2: synchronization failed, 3: syncing.</p>
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
    * <p>Synchronous original cluster. If empty, it is a public cloud public cluster.</p>
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
    * <p>Member account name</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

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
     * Get <p>An alias name as a key that is easier to identify and understand</p> 
     * @return Alias <p>An alias name as a key that is easier to identify and understand</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>An alias name as a key that is easier to identify and understand</p>
     * @param Alias <p>An alias name as a key that is easier to identify and understand</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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
     * Get <p>Description of the CMK.</p> 
     * @return Description <p>Description of the CMK.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description of the CMK.</p>
     * @param Description <p>Description of the CMK.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>CMK state, value: Enabled | Disabled | PendingDelete | PendingImport | Archived</p> 
     * @return KeyState <p>CMK state, value: Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>CMK state, value: Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     * @param KeyState <p>CMK state, value: Enabled | Disabled | PendingDelete | PendingImport | Archived</p>
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>CMK purpose. Value: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p> 
     * @return KeyUsage <p>CMK purpose. Value: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>CMK purpose. Value: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     * @param KeyUsage <p>CMK purpose. Value: ENCRYPT_DECRYPT | ASYMMETRIC_DECRYPT_RSA_2048 | ASYMMETRIC_DECRYPT_SM2 | ASYMMETRIC_SIGN_VERIFY_SM2 | ASYMMETRIC_SIGN_VERIFY_RSA_2048 | ASYMMETRIC_SIGN_VERIFY_ECC</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>CMK type. 2 means compliant with FIPS 140-2 standard. 4 means compliant with national cryptography standards.</p><p>Enumeration value:</p><ul><li>2: Complies with FIPS 140-2 standard</li><li>4: Complies with national cryptography standards</li></ul> 
     * @return Type <p>CMK type. 2 means compliant with FIPS 140-2 standard. 4 means compliant with national cryptography standards.</p><p>Enumeration value:</p><ul><li>2: Complies with FIPS 140-2 standard</li><li>4: Complies with national cryptography standards</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>CMK type. 2 means compliant with FIPS 140-2 standard. 4 means compliant with national cryptography standards.</p><p>Enumeration value:</p><ul><li>2: Complies with FIPS 140-2 standard</li><li>4: Complies with national cryptography standards</li></ul>
     * @param Type <p>CMK type. 2 means compliant with FIPS 140-2 standard. 4 means compliant with national cryptography standards.</p><p>Enumeration value:</p><ul><li>2: Complies with FIPS 140-2 standard</li><li>4: Complies with national cryptography standards</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get <p>Is key rotation function enabled?</p> 
     * @return KeyRotationEnabled <p>Is key rotation function enabled?</p>
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set <p>Is key rotation function enabled?</p>
     * @param KeyRotationEnabled <p>Is key rotation function enabled?</p>
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get <p>Creator of the CMK. For user-created CMKs, the value is user. For CMKs auto-created by authorized Cloud services, the value is the corresponding product name.</p> 
     * @return Owner <p>Creator of the CMK. For user-created CMKs, the value is user. For CMKs auto-created by authorized Cloud services, the value is the corresponding product name.</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>Creator of the CMK. For user-created CMKs, the value is user. For CMKs auto-created by authorized Cloud services, the value is the corresponding product name.</p>
     * @param Owner <p>Creator of the CMK. For user-created CMKs, the value is user. For CMKs auto-created by authorized Cloud services, the value is the corresponding product name.</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>The time when the next rotation occurs with key rotation enabled</p> 
     * @return NextRotateTime <p>The time when the next rotation occurs with key rotation enabled</p>
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * Set <p>The time when the next rotation occurs with key rotation enabled</p>
     * @param NextRotateTime <p>The time when the next rotation occurs with key rotation enabled</p>
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
    }

    /**
     * Get <p>The time when schedule deletion</p> 
     * @return DeletionDate <p>The time when schedule deletion</p>
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set <p>The time when schedule deletion</p>
     * @param DeletionDate <p>The time when schedule deletion</p>
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get <p>CMK key material type. TENCENT_KMS for those created by KMS, EXTERNAL for user import.</p> 
     * @return Origin <p>CMK key material type. TENCENT_KMS for those created by KMS, EXTERNAL for user import.</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>CMK key material type. TENCENT_KMS for those created by KMS, EXTERNAL for user import.</p>
     * @param Origin <p>CMK key material type. TENCENT_KMS for those created by KMS, EXTERNAL for user import.</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>Valid when Origin is EXTERNAL. Indicates the expiration date of the key material. 0 means never expire.</p> 
     * @return ValidTo <p>Valid when Origin is EXTERNAL. Indicates the expiration date of the key material. 0 means never expire.</p>
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set <p>Valid when Origin is EXTERNAL. Indicates the expiration date of the key material. 0 means never expire.</p>
     * @param ValidTo <p>Valid when Origin is EXTERNAL. Indicates the expiration date of the key material. 0 means never expire.</p>
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get <p>Resource ID, format: creatorUin/$creatorUin/$keyId</p> 
     * @return ResourceId <p>Resource ID, format: creatorUin/$creatorUin/$keyId</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID, format: creatorUin/$creatorUin/$keyId</p>
     * @param ResourceId <p>Resource ID, format: creatorUin/$creatorUin/$keyId</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>HSM Cluster ID (only applicable to KMS exclusive/managed service instance)</p> 
     * @return HsmClusterId <p>HSM Cluster ID (only applicable to KMS exclusive/managed service instance)</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM Cluster ID (only applicable to KMS exclusive/managed service instance)</p>
     * @param HsmClusterId <p>HSM Cluster ID (only applicable to KMS exclusive/managed service instance)</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>Key rotation cycle (days)</p> 
     * @return RotateDays <p>Key rotation cycle (days)</p>
     */
    public Long getRotateDays() {
        return this.RotateDays;
    }

    /**
     * Set <p>Key rotation cycle (days)</p>
     * @param RotateDays <p>Key rotation cycle (days)</p>
     */
    public void setRotateDays(Long RotateDays) {
        this.RotateDays = RotateDays;
    }

    /**
     * Get <p>Last rotation time (Unix timestamp).</p> 
     * @return LastRotateTime <p>Last rotation time (Unix timestamp).</p>
     */
    public Long getLastRotateTime() {
        return this.LastRotateTime;
    }

    /**
     * Set <p>Last rotation time (Unix timestamp).</p>
     * @param LastRotateTime <p>Last rotation time (Unix timestamp).</p>
     */
    public void setLastRotateTime(Long LastRotateTime) {
        this.LastRotateTime = LastRotateTime;
    }

    /**
     * Get <p>Whether the key is the primary replica. 0: primary replica, 1: synced replica.</p> 
     * @return IsSyncReplica <p>Whether the key is the primary replica. 0: primary replica, 1: synced replica.</p>
     */
    public Long getIsSyncReplica() {
        return this.IsSyncReplica;
    }

    /**
     * Set <p>Whether the key is the primary replica. 0: primary replica, 1: synced replica.</p>
     * @param IsSyncReplica <p>Whether the key is the primary replica. 0: primary replica, 1: synced replica.</p>
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
     * Get <p>Key synchronization state: 0: unsynced, 1: synced successfully, 2: synchronization failed, 3: syncing.</p> 
     * @return SyncStatus <p>Key synchronization state: 0: unsynced, 1: synced successfully, 2: synchronization failed, 3: syncing.</p>
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>Key synchronization state: 0: unsynced, 1: synced successfully, 2: synchronization failed, 3: syncing.</p>
     * @param SyncStatus <p>Key synchronization state: 0: unsynced, 1: synced successfully, 2: synchronization failed, 3: syncing.</p>
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
     * Get <p>Synchronous original cluster. If empty, it is a public cloud public cluster.</p> 
     * @return SourceHsmClusterId <p>Synchronous original cluster. If empty, it is a public cloud public cluster.</p>
     */
    public String getSourceHsmClusterId() {
        return this.SourceHsmClusterId;
    }

    /**
     * Set <p>Synchronous original cluster. If empty, it is a public cloud public cluster.</p>
     * @param SourceHsmClusterId <p>Synchronous original cluster. If empty, it is a public cloud public cluster.</p>
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
     * Get <p>Member account name</p> 
     * @return AccountName <p>Member account name</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Member account name</p>
     * @param AccountName <p>Member account name</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public KeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyMetadata(KeyMetadata source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
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
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new Long(source.CreatorUin);
        }
        if (source.KeyRotationEnabled != null) {
            this.KeyRotationEnabled = new Boolean(source.KeyRotationEnabled);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.NextRotateTime != null) {
            this.NextRotateTime = new Long(source.NextRotateTime);
        }
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.RotateDays != null) {
            this.RotateDays = new Long(source.RotateDays);
        }
        if (source.LastRotateTime != null) {
            this.LastRotateTime = new Long(source.LastRotateTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "KeyRotationEnabled", this.KeyRotationEnabled);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "NextRotateTime", this.NextRotateTime);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "RotateDays", this.RotateDays);
        this.setParamSimple(map, prefix + "LastRotateTime", this.LastRotateTime);
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

    }
}

