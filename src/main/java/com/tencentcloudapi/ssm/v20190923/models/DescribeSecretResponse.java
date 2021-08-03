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

public class DescribeSecretResponse extends AbstractModel{

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
    * ID of the KMS CMK used for encryption.
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
    * Credential status: Enabled, Disabled, PendingDelete, Creating, Failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 0: user-defined credential; 1: Tencent Cloud service credential.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * Tencent Cloud service name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Tencent Cloud service instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * Whether to enable rotation. True: yes; False: no.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RotationStatus")
    @Expose
    private Boolean RotationStatus;

    /**
    * Rotation frequency in days by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RotationFrequency")
    @Expose
    private Long RotationFrequency;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get ID of the KMS CMK used for encryption. 
     * @return KmsKeyId ID of the KMS CMK used for encryption.
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set ID of the KMS CMK used for encryption.
     * @param KmsKeyId ID of the KMS CMK used for encryption.
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
     * Get Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0. 
     * @return DeleteTime Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     * @param DeleteTime Deletion time, formatted as a Unix timestamp. For a Secret that is not in `PendingDelete` status, this value is 0.
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Tencent Cloud service name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Tencent Cloud service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Tencent Cloud service name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductName Tencent Cloud service name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Tencent Cloud service instance ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceID Tencent Cloud service instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set Tencent Cloud service instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceID Tencent Cloud service instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get Whether to enable rotation. True: yes; False: no.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RotationStatus Whether to enable rotation. True: yes; False: no.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set Whether to enable rotation. True: yes; False: no.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RotationStatus Whether to enable rotation. True: yes; False: no.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRotationStatus(Boolean RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get Rotation frequency in days by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RotationFrequency Rotation frequency in days by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRotationFrequency() {
        return this.RotationFrequency;
    }

    /**
     * Set Rotation frequency in days by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RotationFrequency Rotation frequency in days by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRotationFrequency(Long RotationFrequency) {
        this.RotationFrequency = RotationFrequency;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecretResponse(DescribeSecretResponse source) {
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
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.RotationStatus != null) {
            this.RotationStatus = new Boolean(source.RotationStatus);
        }
        if (source.RotationFrequency != null) {
            this.RotationFrequency = new Long(source.RotationFrequency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "RotationStatus", this.RotationStatus);
        this.setParamSimple(map, prefix + "RotationFrequency", this.RotationFrequency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

