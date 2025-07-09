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

public class DescribeAuditResponse extends AbstractModel {

    /**
    * Whether to enable CMQ message notification. 1: Yes; 0: No.
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write)
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * Globally unique CMK ID.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Tracking set status. 1: enabled, 0: disabled.
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Tracking set name.
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * COS bucket region.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Queue name.
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * CMK alias.
    */
    @SerializedName("KmsAlias")
    @Expose
    private String KmsAlias;

    /**
    * KMS region.
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when it is delivered to COS.
    */
    @SerializedName("IsEnableKmsEncry")
    @Expose
    private Long IsEnableKmsEncry;

    /**
    * COS bucket name.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * Queue region.
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * Log prefix.
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable CMQ message notification. 1: Yes; 0: No. 
     * @return IsEnableCmqNotify Whether to enable CMQ message notification. 1: Yes; 0: No.
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set Whether to enable CMQ message notification. 1: Yes; 0: No.
     * @param IsEnableCmqNotify Whether to enable CMQ message notification. 1: Yes; 0: No.
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * Get Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write) 
     * @return ReadWriteAttribute Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write)
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write)
     * @param ReadWriteAttribute Manages the read/write attribute of event. Valid values: 1 (read-only), 2 (write-only), 3 (read/write)
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get Globally unique CMK ID. 
     * @return KeyId Globally unique CMK ID.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique CMK ID.
     * @param KeyId Globally unique CMK ID.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Tracking set status. 1: enabled, 0: disabled. 
     * @return AuditStatus Tracking set status. 1: enabled, 0: disabled.
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Tracking set status. 1: enabled, 0: disabled.
     * @param AuditStatus Tracking set status. 1: enabled, 0: disabled.
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Tracking set name. 
     * @return AuditName Tracking set name.
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set Tracking set name.
     * @param AuditName Tracking set name.
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get COS bucket region. 
     * @return CosRegion COS bucket region.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS bucket region.
     * @param CosRegion COS bucket region.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Queue name. 
     * @return CmqQueueName Queue name.
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * Set Queue name.
     * @param CmqQueueName Queue name.
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * Get CMK alias. 
     * @return KmsAlias CMK alias.
     */
    public String getKmsAlias() {
        return this.KmsAlias;
    }

    /**
     * Set CMK alias.
     * @param KmsAlias CMK alias.
     */
    public void setKmsAlias(String KmsAlias) {
        this.KmsAlias = KmsAlias;
    }

    /**
     * Get KMS region. 
     * @return KmsRegion KMS region.
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set KMS region.
     * @param KmsRegion KMS region.
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when it is delivered to COS. 
     * @return IsEnableKmsEncry Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when it is delivered to COS.
     */
    public Long getIsEnableKmsEncry() {
        return this.IsEnableKmsEncry;
    }

    /**
     * Set Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when it is delivered to COS.
     * @param IsEnableKmsEncry Whether to enable KMS encryption. 1: Yes, 0: No. If KMS encryption is enabled, the data will be encrypted when it is delivered to COS.
     */
    public void setIsEnableKmsEncry(Long IsEnableKmsEncry) {
        this.IsEnableKmsEncry = IsEnableKmsEncry;
    }

    /**
     * Get COS bucket name. 
     * @return CosBucketName COS bucket name.
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS bucket name.
     * @param CosBucketName COS bucket name.
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get Queue region. 
     * @return CmqRegion Queue region.
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set Queue region.
     * @param CmqRegion Queue region.
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get Log prefix. 
     * @return LogFilePrefix Log prefix.
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set Log prefix.
     * @param LogFilePrefix Log prefix.
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
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

    public DescribeAuditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditResponse(DescribeAuditResponse source) {
        if (source.IsEnableCmqNotify != null) {
            this.IsEnableCmqNotify = new Long(source.IsEnableCmqNotify);
        }
        if (source.ReadWriteAttribute != null) {
            this.ReadWriteAttribute = new Long(source.ReadWriteAttribute);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CmqQueueName != null) {
            this.CmqQueueName = new String(source.CmqQueueName);
        }
        if (source.KmsAlias != null) {
            this.KmsAlias = new String(source.KmsAlias);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "KmsAlias", this.KmsAlias);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "IsEnableKmsEncry", this.IsEnableKmsEncry);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

