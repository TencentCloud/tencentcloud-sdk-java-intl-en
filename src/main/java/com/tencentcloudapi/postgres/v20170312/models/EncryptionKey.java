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

public class EncryptionKey extends AbstractModel {

    /**
    * Specifies the KeyId for KMS instance encryption.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Alias name of the KMS instance encryption Key.
    */
    @SerializedName("KeyAlias")
    @Expose
    private String KeyAlias;

    /**
    * Specifies the ciphertext of the instance encryption key DEK.
    */
    @SerializedName("DEKCipherTextBlob")
    @Expose
    private String DEKCipherTextBlob;

    /**
    * Whether the key is enabled. valid values: 1 (enabled), 0 (disabled).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Specifies the region of the KMS key.
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * Creation time of the DEK key.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Specifies the Id of the KMS service cluster where the key resides. being empty indicates the key is in the default KMS cluster. a non-empty value indicates the key is in the specified KMS service cluster.
    */
    @SerializedName("KMSClusterId")
    @Expose
    private String KMSClusterId;

    /**
     * Get Specifies the KeyId for KMS instance encryption. 
     * @return KeyId Specifies the KeyId for KMS instance encryption.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Specifies the KeyId for KMS instance encryption.
     * @param KeyId Specifies the KeyId for KMS instance encryption.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Alias name of the KMS instance encryption Key. 
     * @return KeyAlias Alias name of the KMS instance encryption Key.
     */
    public String getKeyAlias() {
        return this.KeyAlias;
    }

    /**
     * Set Alias name of the KMS instance encryption Key.
     * @param KeyAlias Alias name of the KMS instance encryption Key.
     */
    public void setKeyAlias(String KeyAlias) {
        this.KeyAlias = KeyAlias;
    }

    /**
     * Get Specifies the ciphertext of the instance encryption key DEK. 
     * @return DEKCipherTextBlob Specifies the ciphertext of the instance encryption key DEK.
     */
    public String getDEKCipherTextBlob() {
        return this.DEKCipherTextBlob;
    }

    /**
     * Set Specifies the ciphertext of the instance encryption key DEK.
     * @param DEKCipherTextBlob Specifies the ciphertext of the instance encryption key DEK.
     */
    public void setDEKCipherTextBlob(String DEKCipherTextBlob) {
        this.DEKCipherTextBlob = DEKCipherTextBlob;
    }

    /**
     * Get Whether the key is enabled. valid values: 1 (enabled), 0 (disabled). 
     * @return IsEnabled Whether the key is enabled. valid values: 1 (enabled), 0 (disabled).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether the key is enabled. valid values: 1 (enabled), 0 (disabled).
     * @param IsEnabled Whether the key is enabled. valid values: 1 (enabled), 0 (disabled).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Specifies the region of the KMS key. 
     * @return KeyRegion Specifies the region of the KMS key.
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Specifies the region of the KMS key.
     * @param KeyRegion Specifies the region of the KMS key.
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get Creation time of the DEK key. 
     * @return CreateTime Creation time of the DEK key.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the DEK key.
     * @param CreateTime Creation time of the DEK key.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies the Id of the KMS service cluster where the key resides. being empty indicates the key is in the default KMS cluster. a non-empty value indicates the key is in the specified KMS service cluster. 
     * @return KMSClusterId Specifies the Id of the KMS service cluster where the key resides. being empty indicates the key is in the default KMS cluster. a non-empty value indicates the key is in the specified KMS service cluster.
     */
    public String getKMSClusterId() {
        return this.KMSClusterId;
    }

    /**
     * Set Specifies the Id of the KMS service cluster where the key resides. being empty indicates the key is in the default KMS cluster. a non-empty value indicates the key is in the specified KMS service cluster.
     * @param KMSClusterId Specifies the Id of the KMS service cluster where the key resides. being empty indicates the key is in the default KMS cluster. a non-empty value indicates the key is in the specified KMS service cluster.
     */
    public void setKMSClusterId(String KMSClusterId) {
        this.KMSClusterId = KMSClusterId;
    }

    public EncryptionKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptionKey(EncryptionKey source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyAlias != null) {
            this.KeyAlias = new String(source.KeyAlias);
        }
        if (source.DEKCipherTextBlob != null) {
            this.DEKCipherTextBlob = new String(source.DEKCipherTextBlob);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.KMSClusterId != null) {
            this.KMSClusterId = new String(source.KMSClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyAlias", this.KeyAlias);
        this.setParamSimple(map, prefix + "DEKCipherTextBlob", this.DEKCipherTextBlob);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "KMSClusterId", this.KMSClusterId);

    }
}

