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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAuditRequest extends AbstractModel {

    /**
    * Tracking set name
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * Whether to enable CMQ message notification. 1: Yes; 0: No. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write).
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * Globally unique ID of the CMK. This value is required if it is not a newly created KMS element. It can be obtained through `ListKeyAliasByRegion`. CloudAudit will not verify the validity of the `KeyId`. Enter it carefully to avoid data loss.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * COS region. Supported regions can be queried through the `ListCosEnableRegion` API.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of `IsEnableCmqNotify` is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * Whether to create a COS bucket. 1: Yes; 0: No.
    */
    @SerializedName("IsCreateNewBucket")
    @Expose
    private Long IsCreateNewBucket;

    /**
    * KMS region. Currently supported regions can be obtained through `ListKmsEnableRegion`. This must be the same as the COS region.
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when delivered to COS.
    */
    @SerializedName("IsEnableKmsEncry")
    @Expose
    private Long IsEnableKmsEncry;

    /**
    * User-defined COS bucket name, which can only contain 1–40 lowercase letters (a–z), digits (0–9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * Region where the queue is located. Supported CMQ regions can be queried through the `ListCmqEnableRegion` API. This field is required if the value of `IsEnableCmqNotify` is 1.
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * Log file prefix, which can only contain 3–40 ASCII letters (a–z; A–Z) and digits (0–9).
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * Whether to create a queue. 1: Yes; 0: No. This field is required if the value of `IsEnableCmqNotify` is 1.
    */
    @SerializedName("IsCreateNewQueue")
    @Expose
    private Long IsCreateNewQueue;

    /**
     * Get Tracking set name 
     * @return AuditName Tracking set name
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set Tracking set name
     * @param AuditName Tracking set name
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get Whether to enable CMQ message notification. 1: Yes; 0: No. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time. 
     * @return IsEnableCmqNotify Whether to enable CMQ message notification. 1: Yes; 0: No. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set Whether to enable CMQ message notification. 1: Yes; 0: No. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     * @param IsEnableCmqNotify Whether to enable CMQ message notification. 1: Yes; 0: No. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * Get Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write). 
     * @return ReadWriteAttribute Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write).
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write).
     * @param ReadWriteAttribute Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write).
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get Globally unique ID of the CMK. This value is required if it is not a newly created KMS element. It can be obtained through `ListKeyAliasByRegion`. CloudAudit will not verify the validity of the `KeyId`. Enter it carefully to avoid data loss. 
     * @return KeyId Globally unique ID of the CMK. This value is required if it is not a newly created KMS element. It can be obtained through `ListKeyAliasByRegion`. CloudAudit will not verify the validity of the `KeyId`. Enter it carefully to avoid data loss.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique ID of the CMK. This value is required if it is not a newly created KMS element. It can be obtained through `ListKeyAliasByRegion`. CloudAudit will not verify the validity of the `KeyId`. Enter it carefully to avoid data loss.
     * @param KeyId Globally unique ID of the CMK. This value is required if it is not a newly created KMS element. It can be obtained through `ListKeyAliasByRegion`. CloudAudit will not verify the validity of the `KeyId`. Enter it carefully to avoid data loss.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get COS region. Supported regions can be queried through the `ListCosEnableRegion` API. 
     * @return CosRegion COS region. Supported regions can be queried through the `ListCosEnableRegion` API.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS region. Supported regions can be queried through the `ListCosEnableRegion` API.
     * @param CosRegion COS region. Supported regions can be queried through the `ListCosEnableRegion` API.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of `IsEnableCmqNotify` is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss. 
     * @return CmqQueueName Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of `IsEnableCmqNotify` is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * Set Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of `IsEnableCmqNotify` is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     * @param CmqQueueName Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of `IsEnableCmqNotify` is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * Get Whether to create a COS bucket. 1: Yes; 0: No. 
     * @return IsCreateNewBucket Whether to create a COS bucket. 1: Yes; 0: No.
     */
    public Long getIsCreateNewBucket() {
        return this.IsCreateNewBucket;
    }

    /**
     * Set Whether to create a COS bucket. 1: Yes; 0: No.
     * @param IsCreateNewBucket Whether to create a COS bucket. 1: Yes; 0: No.
     */
    public void setIsCreateNewBucket(Long IsCreateNewBucket) {
        this.IsCreateNewBucket = IsCreateNewBucket;
    }

    /**
     * Get KMS region. Currently supported regions can be obtained through `ListKmsEnableRegion`. This must be the same as the COS region. 
     * @return KmsRegion KMS region. Currently supported regions can be obtained through `ListKmsEnableRegion`. This must be the same as the COS region.
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set KMS region. Currently supported regions can be obtained through `ListKmsEnableRegion`. This must be the same as the COS region.
     * @param KmsRegion KMS region. Currently supported regions can be obtained through `ListKmsEnableRegion`. This must be the same as the COS region.
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when delivered to COS. 
     * @return IsEnableKmsEncry Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when delivered to COS.
     */
    public Long getIsEnableKmsEncry() {
        return this.IsEnableKmsEncry;
    }

    /**
     * Set Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when delivered to COS.
     * @param IsEnableKmsEncry Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when delivered to COS.
     */
    public void setIsEnableKmsEncry(Long IsEnableKmsEncry) {
        this.IsEnableKmsEncry = IsEnableKmsEncry;
    }

    /**
     * Get User-defined COS bucket name, which can only contain 1–40 lowercase letters (a–z), digits (0–9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss. 
     * @return CosBucketName User-defined COS bucket name, which can only contain 1–40 lowercase letters (a–z), digits (0–9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set User-defined COS bucket name, which can only contain 1–40 lowercase letters (a–z), digits (0–9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     * @param CosBucketName User-defined COS bucket name, which can only contain 1–40 lowercase letters (a–z), digits (0–9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Enter the name with caution to avoid log delivery failure and consequent data loss.
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get Region where the queue is located. Supported CMQ regions can be queried through the `ListCmqEnableRegion` API. This field is required if the value of `IsEnableCmqNotify` is 1. 
     * @return CmqRegion Region where the queue is located. Supported CMQ regions can be queried through the `ListCmqEnableRegion` API. This field is required if the value of `IsEnableCmqNotify` is 1.
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set Region where the queue is located. Supported CMQ regions can be queried through the `ListCmqEnableRegion` API. This field is required if the value of `IsEnableCmqNotify` is 1.
     * @param CmqRegion Region where the queue is located. Supported CMQ regions can be queried through the `ListCmqEnableRegion` API. This field is required if the value of `IsEnableCmqNotify` is 1.
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get Log file prefix, which can only contain 3–40 ASCII letters (a–z; A–Z) and digits (0–9). 
     * @return LogFilePrefix Log file prefix, which can only contain 3–40 ASCII letters (a–z; A–Z) and digits (0–9).
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set Log file prefix, which can only contain 3–40 ASCII letters (a–z; A–Z) and digits (0–9).
     * @param LogFilePrefix Log file prefix, which can only contain 3–40 ASCII letters (a–z; A–Z) and digits (0–9).
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    /**
     * Get Whether to create a queue. 1: Yes; 0: No. This field is required if the value of `IsEnableCmqNotify` is 1. 
     * @return IsCreateNewQueue Whether to create a queue. 1: Yes; 0: No. This field is required if the value of `IsEnableCmqNotify` is 1.
     */
    public Long getIsCreateNewQueue() {
        return this.IsCreateNewQueue;
    }

    /**
     * Set Whether to create a queue. 1: Yes; 0: No. This field is required if the value of `IsEnableCmqNotify` is 1.
     * @param IsCreateNewQueue Whether to create a queue. 1: Yes; 0: No. This field is required if the value of `IsEnableCmqNotify` is 1.
     */
    public void setIsCreateNewQueue(Long IsCreateNewQueue) {
        this.IsCreateNewQueue = IsCreateNewQueue;
    }

    public UpdateAuditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAuditRequest(UpdateAuditRequest source) {
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.IsEnableCmqNotify != null) {
            this.IsEnableCmqNotify = new Long(source.IsEnableCmqNotify);
        }
        if (source.ReadWriteAttribute != null) {
            this.ReadWriteAttribute = new Long(source.ReadWriteAttribute);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CmqQueueName != null) {
            this.CmqQueueName = new String(source.CmqQueueName);
        }
        if (source.IsCreateNewBucket != null) {
            this.IsCreateNewBucket = new Long(source.IsCreateNewBucket);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.IsEnableKmsEncry != null) {
            this.IsEnableKmsEncry = new Long(source.IsEnableKmsEncry);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.LogFilePrefix != null) {
            this.LogFilePrefix = new String(source.LogFilePrefix);
        }
        if (source.IsCreateNewQueue != null) {
            this.IsCreateNewQueue = new Long(source.IsCreateNewQueue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "IsCreateNewBucket", this.IsCreateNewBucket);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "IsEnableKmsEncry", this.IsEnableKmsEncry);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "IsCreateNewQueue", this.IsCreateNewQueue);

    }
}

