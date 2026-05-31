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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVaultRequest extends AbstractModel {

    /**
    * Safe ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Safe name, maximum 255 characters
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * Safe description, maximum 1024 characters
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * Backup retention period (seconds). Range: (0, 632448000].
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * Encryption key ID, maximum 36 characters
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key type, available values: cloud, custom
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * Key region, maximum 32 characters
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * Is the safe locked
    */
    @SerializedName("IsLock")
    @Expose
    private Boolean IsLock;

    /**
    * Lock expiry time, format: 2006-01-02 15:04:05, lock time current maximum 15 days
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
    * Whether it is encrypted
    */
    @SerializedName("IsEncryption")
    @Expose
    private Boolean IsEncryption;

    /**
     * Get Safe ID 
     * @return VaultId Safe ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe ID
     * @param VaultId Safe ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Safe name, maximum 255 characters 
     * @return VaultName Safe name, maximum 255 characters
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set Safe name, maximum 255 characters
     * @param VaultName Safe name, maximum 255 characters
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get Safe description, maximum 1024 characters 
     * @return VaultDescribe Safe description, maximum 1024 characters
     */
    public String getVaultDescribe() {
        return this.VaultDescribe;
    }

    /**
     * Set Safe description, maximum 1024 characters
     * @param VaultDescribe Safe description, maximum 1024 characters
     */
    public void setVaultDescribe(String VaultDescribe) {
        this.VaultDescribe = VaultDescribe;
    }

    /**
     * Get Backup retention period (seconds). Range: (0, 632448000]. 
     * @return BackupSaveSeconds Backup retention period (seconds). Range: (0, 632448000].
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set Backup retention period (seconds). Range: (0, 632448000].
     * @param BackupSaveSeconds Backup retention period (seconds). Range: (0, 632448000].
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get Encryption key ID, maximum 36 characters 
     * @return KeyId Encryption key ID, maximum 36 characters
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Encryption key ID, maximum 36 characters
     * @param KeyId Encryption key ID, maximum 36 characters
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key type, available values: cloud, custom 
     * @return KeyType Key type, available values: cloud, custom
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set Key type, available values: cloud, custom
     * @param KeyType Key type, available values: cloud, custom
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get Key region, maximum 32 characters 
     * @return KeyRegion Key region, maximum 32 characters
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Key region, maximum 32 characters
     * @param KeyRegion Key region, maximum 32 characters
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get Is the safe locked 
     * @return IsLock Is the safe locked
     */
    public Boolean getIsLock() {
        return this.IsLock;
    }

    /**
     * Set Is the safe locked
     * @param IsLock Is the safe locked
     */
    public void setIsLock(Boolean IsLock) {
        this.IsLock = IsLock;
    }

    /**
     * Get Lock expiry time, format: 2006-01-02 15:04:05, lock time current maximum 15 days 
     * @return LockedTime Lock expiry time, format: 2006-01-02 15:04:05, lock time current maximum 15 days
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set Lock expiry time, format: 2006-01-02 15:04:05, lock time current maximum 15 days
     * @param LockedTime Lock expiry time, format: 2006-01-02 15:04:05, lock time current maximum 15 days
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    /**
     * Get Whether it is encrypted 
     * @return IsEncryption Whether it is encrypted
     */
    public Boolean getIsEncryption() {
        return this.IsEncryption;
    }

    /**
     * Set Whether it is encrypted
     * @param IsEncryption Whether it is encrypted
     */
    public void setIsEncryption(Boolean IsEncryption) {
        this.IsEncryption = IsEncryption;
    }

    public ModifyVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVaultRequest(ModifyVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.IsLock != null) {
            this.IsLock = new Boolean(source.IsLock);
        }
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
        if (source.IsEncryption != null) {
            this.IsEncryption = new Boolean(source.IsEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "IsLock", this.IsLock);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);
        this.setParamSimple(map, prefix + "IsEncryption", this.IsEncryption);

    }
}

