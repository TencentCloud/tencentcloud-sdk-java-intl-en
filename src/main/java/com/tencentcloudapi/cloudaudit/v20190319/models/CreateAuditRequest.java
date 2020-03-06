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

public class CreateAuditRequest extends AbstractModel{

    /**
    * Tracking set name, which can contain 3-128 ASCII letters (a-z; A-Z), digits (0-9), and underscores (_).
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * User-defined COS bucket name, which can only contain 1-40 lowercase letters (a-z), digits (0-9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * COS region. Supported regions can be queried using the ListCosEnableRegion API.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Whether to create a COS bucket. 1: yes; 0: no.
    */
    @SerializedName("IsCreateNewBucket")
    @Expose
    private Long IsCreateNewBucket;

    /**
    * Whether to enable CMQ message notification. 1: yes; 0: no. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write).
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of IsEnableCmqNotify is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * Region where the queue is located. Supported CMQ regions can be queried using the ListCmqEnableRegion API. This field is required if the value of IsEnableCmqNotify is 1.
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * Whether to create a queue. 1: yes; 0: no. This field is required if the value of IsEnableCmqNotify is 1.
    */
    @SerializedName("IsCreateNewQueue")
    @Expose
    private Long IsCreateNewQueue;

    /**
    * Prefix of a log file, which can only contain 3-40 ASCII letters (a-z; A-Z) and digits (0-9). It can be left empty and is the account ID by default.
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
     * Get Tracking set name, which can contain 3-128 ASCII letters (a-z; A-Z), digits (0-9), and underscores (_). 
     * @return AuditName Tracking set name, which can contain 3-128 ASCII letters (a-z; A-Z), digits (0-9), and underscores (_).
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set Tracking set name, which can contain 3-128 ASCII letters (a-z; A-Z), digits (0-9), and underscores (_).
     * @param AuditName Tracking set name, which can contain 3-128 ASCII letters (a-z; A-Z), digits (0-9), and underscores (_).
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get User-defined COS bucket name, which can only contain 1-40 lowercase letters (a-z), digits (0-9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss. 
     * @return CosBucketName User-defined COS bucket name, which can only contain 1-40 lowercase letters (a-z), digits (0-9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set User-defined COS bucket name, which can only contain 1-40 lowercase letters (a-z), digits (0-9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     * @param CosBucketName User-defined COS bucket name, which can only contain 1-40 lowercase letters (a-z), digits (0-9), and dashes (-) and cannot begin or end with "-". If a bucket is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get COS region. Supported regions can be queried using the ListCosEnableRegion API. 
     * @return CosRegion COS region. Supported regions can be queried using the ListCosEnableRegion API.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS region. Supported regions can be queried using the ListCosEnableRegion API.
     * @param CosRegion COS region. Supported regions can be queried using the ListCosEnableRegion API.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Whether to create a COS bucket. 1: yes; 0: no. 
     * @return IsCreateNewBucket Whether to create a COS bucket. 1: yes; 0: no.
     */
    public Long getIsCreateNewBucket() {
        return this.IsCreateNewBucket;
    }

    /**
     * Set Whether to create a COS bucket. 1: yes; 0: no.
     * @param IsCreateNewBucket Whether to create a COS bucket. 1: yes; 0: no.
     */
    public void setIsCreateNewBucket(Long IsCreateNewBucket) {
        this.IsCreateNewBucket = IsCreateNewBucket;
    }

    /**
     * Get Whether to enable CMQ message notification. 1: yes; 0: no. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time. 
     * @return IsEnableCmqNotify Whether to enable CMQ message notification. 1: yes; 0: no. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set Whether to enable CMQ message notification. 1: yes; 0: no. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     * @param IsEnableCmqNotify Whether to enable CMQ message notification. 1: yes; 0: no. Only CMQ queue service is currently supported. If CMQ message notification is enabled, CloudAudit will deliver your log contents to the designated queue in the specified region in real time.
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * Get Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write). 
     * @return ReadWriteAttribute Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write).
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write).
     * @param ReadWriteAttribute Manages the read/write attribute of an event. Value range: 1 (read-only), 2 (write-only), 3 (read/write).
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of IsEnableCmqNotify is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss. 
     * @return CmqQueueName Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of IsEnableCmqNotify is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * Set Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of IsEnableCmqNotify is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     * @param CmqQueueName Queue name, which must begin with a letter and can contain up to 64 letters, digits, and dashes (-). This field is required if the value of IsEnableCmqNotify is 1. If a queue is not newly created, CloudAudit will not verify whether it actually exists. Please enter the name with caution so as to avoid log delivery failure and consequent data loss.
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * Get Region where the queue is located. Supported CMQ regions can be queried using the ListCmqEnableRegion API. This field is required if the value of IsEnableCmqNotify is 1. 
     * @return CmqRegion Region where the queue is located. Supported CMQ regions can be queried using the ListCmqEnableRegion API. This field is required if the value of IsEnableCmqNotify is 1.
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set Region where the queue is located. Supported CMQ regions can be queried using the ListCmqEnableRegion API. This field is required if the value of IsEnableCmqNotify is 1.
     * @param CmqRegion Region where the queue is located. Supported CMQ regions can be queried using the ListCmqEnableRegion API. This field is required if the value of IsEnableCmqNotify is 1.
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get Whether to create a queue. 1: yes; 0: no. This field is required if the value of IsEnableCmqNotify is 1. 
     * @return IsCreateNewQueue Whether to create a queue. 1: yes; 0: no. This field is required if the value of IsEnableCmqNotify is 1.
     */
    public Long getIsCreateNewQueue() {
        return this.IsCreateNewQueue;
    }

    /**
     * Set Whether to create a queue. 1: yes; 0: no. This field is required if the value of IsEnableCmqNotify is 1.
     * @param IsCreateNewQueue Whether to create a queue. 1: yes; 0: no. This field is required if the value of IsEnableCmqNotify is 1.
     */
    public void setIsCreateNewQueue(Long IsCreateNewQueue) {
        this.IsCreateNewQueue = IsCreateNewQueue;
    }

    /**
     * Get Prefix of a log file, which can only contain 3-40 ASCII letters (a-z; A-Z) and digits (0-9). It can be left empty and is the account ID by default. 
     * @return LogFilePrefix Prefix of a log file, which can only contain 3-40 ASCII letters (a-z; A-Z) and digits (0-9). It can be left empty and is the account ID by default.
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set Prefix of a log file, which can only contain 3-40 ASCII letters (a-z; A-Z) and digits (0-9). It can be left empty and is the account ID by default.
     * @param LogFilePrefix Prefix of a log file, which can only contain 3-40 ASCII letters (a-z; A-Z) and digits (0-9). It can be left empty and is the account ID by default.
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "IsCreateNewBucket", this.IsCreateNewBucket);
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "IsCreateNewQueue", this.IsCreateNewQueue);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);

    }
}

