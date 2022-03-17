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

public class AuditSummary extends AbstractModel{

    /**
    * Tracking set status. 1: enabled, 0: disabled
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * COS bucket name
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * Tracking set name
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * Log prefix
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
     * Get Tracking set status. 1: enabled, 0: disabled 
     * @return AuditStatus Tracking set status. 1: enabled, 0: disabled
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Tracking set status. 1: enabled, 0: disabled
     * @param AuditStatus Tracking set status. 1: enabled, 0: disabled
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get COS bucket name 
     * @return CosBucketName COS bucket name
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS bucket name
     * @param CosBucketName COS bucket name
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

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
     * Get Log prefix 
     * @return LogFilePrefix Log prefix
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set Log prefix
     * @param LogFilePrefix Log prefix
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    public AuditSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditSummary(AuditSummary source) {
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.LogFilePrefix != null) {
            this.LogFilePrefix = new String(source.LogFilePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);

    }
}

