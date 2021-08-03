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
    * Credential name
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Credential description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * KMS `KeyId` used to encrypt the credential
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * Creator UIN
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Credential status: Enabled, Disabled, PendingDelete, Creating, Failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Credential deletion date, which takes effect for credentials in `PendingDelete` status and is in UNIX timestamp format
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * Credential creation time in UNIX timestamp format
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Type of the KMS CMK used to encrypt the credential. `DEFAULT` represents the default key created by Secrets Manager, and `CUSTOMER` represents the user-specified key
    */
    @SerializedName("KmsKeyType")
    @Expose
    private String KmsKeyType;

    /**
    * 1: enable rotation; 0: disable rotation
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RotationStatus")
    @Expose
    private Long RotationStatus;

    /**
    * Start time of the next rotation in UNIX timestamp format
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NextRotationTime")
    @Expose
    private Long NextRotationTime;

    /**
    * 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * Tencent Cloud service name, which takes effect only when `SecretType` is 1 (Tencent Cloud service credential)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get Credential name 
     * @return SecretName Credential name
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Credential name
     * @param SecretName Credential name
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Credential description 
     * @return Description Credential description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Credential description
     * @param Description Credential description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get KMS `KeyId` used to encrypt the credential 
     * @return KmsKeyId KMS `KeyId` used to encrypt the credential
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set KMS `KeyId` used to encrypt the credential
     * @param KmsKeyId KMS `KeyId` used to encrypt the credential
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get Creator UIN 
     * @return CreateUin Creator UIN
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator UIN
     * @param CreateUin Creator UIN
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Credential status: Enabled, Disabled, PendingDelete, Creating, Failed. 
     * @return Status Credential status: Enabled, Disabled, PendingDelete, Creating, Failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Credential status: Enabled, Disabled, PendingDelete, Creating, Failed.
     * @param Status Credential status: Enabled, Disabled, PendingDelete, Creating, Failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Credential deletion date, which takes effect for credentials in `PendingDelete` status and is in UNIX timestamp format 
     * @return DeleteTime Credential deletion date, which takes effect for credentials in `PendingDelete` status and is in UNIX timestamp format
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Credential deletion date, which takes effect for credentials in `PendingDelete` status and is in UNIX timestamp format
     * @param DeleteTime Credential deletion date, which takes effect for credentials in `PendingDelete` status and is in UNIX timestamp format
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get Credential creation time in UNIX timestamp format 
     * @return CreateTime Credential creation time in UNIX timestamp format
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Credential creation time in UNIX timestamp format
     * @param CreateTime Credential creation time in UNIX timestamp format
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Type of the KMS CMK used to encrypt the credential. `DEFAULT` represents the default key created by Secrets Manager, and `CUSTOMER` represents the user-specified key 
     * @return KmsKeyType Type of the KMS CMK used to encrypt the credential. `DEFAULT` represents the default key created by Secrets Manager, and `CUSTOMER` represents the user-specified key
     */
    public String getKmsKeyType() {
        return this.KmsKeyType;
    }

    /**
     * Set Type of the KMS CMK used to encrypt the credential. `DEFAULT` represents the default key created by Secrets Manager, and `CUSTOMER` represents the user-specified key
     * @param KmsKeyType Type of the KMS CMK used to encrypt the credential. `DEFAULT` represents the default key created by Secrets Manager, and `CUSTOMER` represents the user-specified key
     */
    public void setKmsKeyType(String KmsKeyType) {
        this.KmsKeyType = KmsKeyType;
    }

    /**
     * Get 1: enable rotation; 0: disable rotation
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RotationStatus 1: enable rotation; 0: disable rotation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set 1: enable rotation; 0: disable rotation
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RotationStatus 1: enable rotation; 0: disable rotation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRotationStatus(Long RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get Start time of the next rotation in UNIX timestamp format
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NextRotationTime Start time of the next rotation in UNIX timestamp format
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNextRotationTime() {
        return this.NextRotationTime;
    }

    /**
     * Set Start time of the next rotation in UNIX timestamp format
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NextRotationTime Start time of the next rotation in UNIX timestamp format
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNextRotationTime(Long NextRotationTime) {
        this.NextRotationTime = NextRotationTime;
    }

    /**
     * Get 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecretType 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecretType 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get Tencent Cloud service name, which takes effect only when `SecretType` is 1 (Tencent Cloud service credential)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Tencent Cloud service name, which takes effect only when `SecretType` is 1 (Tencent Cloud service credential)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Tencent Cloud service name, which takes effect only when `SecretType` is 1 (Tencent Cloud service credential)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductName Tencent Cloud service name, which takes effect only when `SecretType` is 1 (Tencent Cloud service credential)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public SecretMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretMetadata(SecretMetadata source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.KmsKeyType != null) {
            this.KmsKeyType = new String(source.KmsKeyType);
        }
        if (source.RotationStatus != null) {
            this.RotationStatus = new Long(source.RotationStatus);
        }
        if (source.NextRotationTime != null) {
            this.NextRotationTime = new Long(source.NextRotationTime);
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
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
        this.setParamSimple(map, prefix + "RotationStatus", this.RotationStatus);
        this.setParamSimple(map, prefix + "NextRotationTime", this.NextRotationTime);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

