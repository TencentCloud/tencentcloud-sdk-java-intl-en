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
    * Encrypted KeyId of KMS instance
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Encryption key alias of KMS instance 
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KeyAlias")
    @Expose
    private String KeyAlias;

    /**
    * Instance DEK ciphertext
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DEKCipherTextBlob")
    @Expose
    private String DEKCipherTextBlob;

    /**
    * Whether the key is enabled. Valid values: `1` (yes), `0` (no)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Region where KMS key resides
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * DEK key creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Encrypted KeyId of KMS instance
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return KeyId Encrypted KeyId of KMS instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Encrypted KeyId of KMS instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param KeyId Encrypted KeyId of KMS instance
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Encryption key alias of KMS instance 
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return KeyAlias Encryption key alias of KMS instance 
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getKeyAlias() {
        return this.KeyAlias;
    }

    /**
     * Set Encryption key alias of KMS instance 
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param KeyAlias Encryption key alias of KMS instance 
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKeyAlias(String KeyAlias) {
        this.KeyAlias = KeyAlias;
    }

    /**
     * Get Instance DEK ciphertext
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DEKCipherTextBlob Instance DEK ciphertext
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDEKCipherTextBlob() {
        return this.DEKCipherTextBlob;
    }

    /**
     * Set Instance DEK ciphertext
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DEKCipherTextBlob Instance DEK ciphertext
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDEKCipherTextBlob(String DEKCipherTextBlob) {
        this.DEKCipherTextBlob = DEKCipherTextBlob;
    }

    /**
     * Get Whether the key is enabled. Valid values: `1` (yes), `0` (no)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IsEnabled Whether the key is enabled. Valid values: `1` (yes), `0` (no)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether the key is enabled. Valid values: `1` (yes), `0` (no)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IsEnabled Whether the key is enabled. Valid values: `1` (yes), `0` (no)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Region where KMS key resides
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return KeyRegion Region where KMS key resides
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set Region where KMS key resides
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param KeyRegion Region where KMS key resides
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get DEK key creation time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CreateTime DEK key creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set DEK key creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CreateTime DEK key creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    }
}

