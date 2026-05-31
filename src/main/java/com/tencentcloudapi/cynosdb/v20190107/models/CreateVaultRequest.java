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

public class CreateVaultRequest extends AbstractModel {

    /**
    * Safe name, length must be greater than 0
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * Backup retention period (seconds). Must be greater than 0.
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * Safe description
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * KMS key ID, length 0-36 characters
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key type, available values: cloud (KMS managed keys), custom (custom key)
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * Key region, length 0-32 characters
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * Lock time, format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
     * Get Safe name, length must be greater than 0 
     * @return VaultName Safe name, length must be greater than 0
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set Safe name, length must be greater than 0
     * @param VaultName Safe name, length must be greater than 0
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get Backup retention period (seconds). Must be greater than 0. 
     * @return BackupSaveSeconds Backup retention period (seconds). Must be greater than 0.
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set Backup retention period (seconds). Must be greater than 0.
     * @param BackupSaveSeconds Backup retention period (seconds). Must be greater than 0.
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get Safe description 
     * @return VaultDescribe Safe description
     */
    public String getVaultDescribe() {
        return this.VaultDescribe;
    }

    /**
     * Set Safe description
     * @param VaultDescribe Safe description
     */
    public void setVaultDescribe(String VaultDescribe) {
        this.VaultDescribe = VaultDescribe;
    }

    /**
     * Get KMS key ID, length 0-36 characters 
     * @return KeyId KMS key ID, length 0-36 characters
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set KMS key ID, length 0-36 characters
     * @param KeyId KMS key ID, length 0-36 characters
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key type, available values: cloud (KMS managed keys), custom (custom key) 
     * @return KeyType Key type, available values: cloud (KMS managed keys), custom (custom key)
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set Key type, available values: cloud (KMS managed keys), custom (custom key)
     * @param KeyType Key type, available values: cloud (KMS managed keys), custom (custom key)
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get Key region, length 0-32 characters 
     * @return KeyRegion Key region, length 0-32 characters
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Key region, length 0-32 characters
     * @param KeyRegion Key region, length 0-32 characters
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get Lock time, format: YYYY-MM-DD HH:mm:ss 
     * @return LockedTime Lock time, format: YYYY-MM-DD HH:mm:ss
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set Lock time, format: YYYY-MM-DD HH:mm:ss
     * @param LockedTime Lock time, format: YYYY-MM-DD HH:mm:ss
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    public CreateVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVaultRequest(CreateVaultRequest source) {
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
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
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);

    }
}

