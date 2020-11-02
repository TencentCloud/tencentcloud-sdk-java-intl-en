/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretMetadata extends AbstractModel{

    /**
    * Name of the Secret.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Description of the Secret.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * KMS Key ID used for Secret encryption.
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Creator UIN.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Secret deletion time, formatted as a Unix timestamp. This parameter is only applicable for Secrets in `PendingDelete` status.
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * Secret creation time, formatted as a Unix timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Type of KMS CMK used for Secret encryption. `DEFAULT`: default key created by SecretsManager; `CUSTOMER`: user-specified key.
    */
    @SerializedName("KmsKeyType")
    @Expose
    private String KmsKeyType;

    /**
     * Get Name of the Secret. 
     * @return SecretName Name of the Secret.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the Secret.
     * @param SecretName Name of the Secret.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Description of the Secret. 
     * @return Description Description of the Secret.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the Secret.
     * @param Description Description of the Secret.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get KMS Key ID used for Secret encryption. 
     * @return KmsKeyId KMS Key ID used for Secret encryption.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set KMS Key ID used for Secret encryption.
     * @param KmsKeyId KMS Key ID used for Secret encryption.
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Creator UIN. 
     * @return CreateUin Creator UIN.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator UIN.
     * @param CreateUin Creator UIN.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`. 
     * @return Status Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     * @param Status Secret status, which can be `Enabled`, `Disabled`, or `PendingDelete`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Secret deletion time, formatted as a Unix timestamp. This parameter is only applicable for Secrets in `PendingDelete` status. 
     * @return DeleteTime Secret deletion time, formatted as a Unix timestamp. This parameter is only applicable for Secrets in `PendingDelete` status.
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Secret deletion time, formatted as a Unix timestamp. This parameter is only applicable for Secrets in `PendingDelete` status.
     * @param DeleteTime Secret deletion time, formatted as a Unix timestamp. This parameter is only applicable for Secrets in `PendingDelete` status.
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get Secret creation time, formatted as a Unix timestamp. 
     * @return CreateTime Secret creation time, formatted as a Unix timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Secret creation time, formatted as a Unix timestamp.
     * @param CreateTime Secret creation time, formatted as a Unix timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Type of KMS CMK used for Secret encryption. `DEFAULT`: default key created by SecretsManager; `CUSTOMER`: user-specified key. 
     * @return KmsKeyType Type of KMS CMK used for Secret encryption. `DEFAULT`: default key created by SecretsManager; `CUSTOMER`: user-specified key.
     */
    public String getKmsKeyType() {
        return this.KmsKeyType;
    }

    /**
     * Set Type of KMS CMK used for Secret encryption. `DEFAULT`: default key created by SecretsManager; `CUSTOMER`: user-specified key.
     * @param KmsKeyType Type of KMS CMK used for Secret encryption. `DEFAULT`: default key created by SecretsManager; `CUSTOMER`: user-specified key.
     */
    public void setKmsKeyType(String KmsKeyType) {
        this.KmsKeyType = KmsKeyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "KmsKeyType", this.KmsKeyType);

    }
}

