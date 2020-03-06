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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditResponse extends AbstractModel{

    /**
    * Tracking set name.
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * Tracking set status. Value range: 1 (enabled), 0 (disabled).
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Queue name.
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * Region where the queue is located.
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * COS bucket name.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * Region where the COS bucket is located.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Whether to enable CMQ message notification. 1: yes; 0: no.
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * Log prefix.
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write)
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Tracking set status. Value range: 1 (enabled), 0 (disabled). 
     * @return AuditStatus Tracking set status. Value range: 1 (enabled), 0 (disabled).
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Tracking set status. Value range: 1 (enabled), 0 (disabled).
     * @param AuditStatus Tracking set status. Value range: 1 (enabled), 0 (disabled).
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
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
     * Get Region where the queue is located. 
     * @return CmqRegion Region where the queue is located.
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set Region where the queue is located.
     * @param CmqRegion Region where the queue is located.
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
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
     * Get Region where the COS bucket is located. 
     * @return CosRegion Region where the COS bucket is located.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set Region where the COS bucket is located.
     * @param CosRegion Region where the COS bucket is located.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Whether to enable CMQ message notification. 1: yes; 0: no. 
     * @return IsEnableCmqNotify Whether to enable CMQ message notification. 1: yes; 0: no.
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set Whether to enable CMQ message notification. 1: yes; 0: no.
     * @param IsEnableCmqNotify Whether to enable CMQ message notification. 1: yes; 0: no.
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
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
     * Get Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write) 
     * @return ReadWriteAttribute Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write)
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write)
     * @param ReadWriteAttribute Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write)
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues. 
     * @return RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

