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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupEncryptRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the Redis console and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Whether backup encryption is enabled.</p><p>Default value: false</p>
    */
    @SerializedName("BackupEncrypt")
    @Expose
    private Boolean BackupEncrypt;

    /**
    * <p>Encryption key type.</p><p>Enumeration value:</p><ul><li>0: Tencent Cloud hosted (default)</li><li>1: User-customized KMS key</li></ul><p>Default value: 0</p>
    */
    @SerializedName("EncryptKeyType")
    @Expose
    private Long EncryptKeyType;

    /**
    * <p>Key ID of KMS.</p><p>Parameter format: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>Regional information.</p><p>Parameter format: ap-xxxx</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/573/34406?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">Supported region list for KMS</a></p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
     * Get <p>Instance ID. Log in to the Redis console and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the Redis console and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the Redis console and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the Redis console and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Whether backup encryption is enabled.</p><p>Default value: false</p> 
     * @return BackupEncrypt <p>Whether backup encryption is enabled.</p><p>Default value: false</p>
     */
    public Boolean getBackupEncrypt() {
        return this.BackupEncrypt;
    }

    /**
     * Set <p>Whether backup encryption is enabled.</p><p>Default value: false</p>
     * @param BackupEncrypt <p>Whether backup encryption is enabled.</p><p>Default value: false</p>
     */
    public void setBackupEncrypt(Boolean BackupEncrypt) {
        this.BackupEncrypt = BackupEncrypt;
    }

    /**
     * Get <p>Encryption key type.</p><p>Enumeration value:</p><ul><li>0: Tencent Cloud hosted (default)</li><li>1: User-customized KMS key</li></ul><p>Default value: 0</p> 
     * @return EncryptKeyType <p>Encryption key type.</p><p>Enumeration value:</p><ul><li>0: Tencent Cloud hosted (default)</li><li>1: User-customized KMS key</li></ul><p>Default value: 0</p>
     */
    public Long getEncryptKeyType() {
        return this.EncryptKeyType;
    }

    /**
     * Set <p>Encryption key type.</p><p>Enumeration value:</p><ul><li>0: Tencent Cloud hosted (default)</li><li>1: User-customized KMS key</li></ul><p>Default value: 0</p>
     * @param EncryptKeyType <p>Encryption key type.</p><p>Enumeration value:</p><ul><li>0: Tencent Cloud hosted (default)</li><li>1: User-customized KMS key</li></ul><p>Default value: 0</p>
     */
    public void setEncryptKeyType(Long EncryptKeyType) {
        this.EncryptKeyType = EncryptKeyType;
    }

    /**
     * Get <p>Key ID of KMS.</p><p>Parameter format: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p> 
     * @return KmsKeyId <p>Key ID of KMS.</p><p>Parameter format: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>Key ID of KMS.</p><p>Parameter format: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     * @param KmsKeyId <p>Key ID of KMS.</p><p>Parameter format: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>Regional information.</p><p>Parameter format: ap-xxxx</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/573/34406?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">Supported region list for KMS</a></p> 
     * @return KmsRegion <p>Regional information.</p><p>Parameter format: ap-xxxx</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/573/34406?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">Supported region list for KMS</a></p>
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>Regional information.</p><p>Parameter format: ap-xxxx</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/573/34406?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">Supported region list for KMS</a></p>
     * @param KmsRegion <p>Regional information.</p><p>Parameter format: ap-xxxx</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/573/34406?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">Supported region list for KMS</a></p>
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    public ModifyBackupEncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupEncryptRequest(ModifyBackupEncryptRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupEncrypt != null) {
            this.BackupEncrypt = new Boolean(source.BackupEncrypt);
        }
        if (source.EncryptKeyType != null) {
            this.EncryptKeyType = new Long(source.EncryptKeyType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupEncrypt", this.BackupEncrypt);
        this.setParamSimple(map, prefix + "EncryptKeyType", this.EncryptKeyType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);

    }
}

