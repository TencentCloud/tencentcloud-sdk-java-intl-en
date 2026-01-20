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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuditConfigRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * Whether to disable the audit service. Valid values: true - Disable; false - Do not disable. Default value: false.Notes:1. When the audit service is disabled, your audit logs and files will be deleted, and all audit policies for this instance will be removed.2. At least one of CloseAudit and LogExpireDay must be provided. If both are provided, CloseAudit takes priority.3. You can use this parameter to disable the audit service. Once disabled, the audit service cannot be re-enabled via this API.
    */
    @SerializedName("CloseAudit")
    @Expose
    private Boolean CloseAudit;

    /**
    * High-frequency audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.comom/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years. 
     * @return LogExpireDay Audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     * @param LogExpireDay Audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get Whether to disable the audit service. Valid values: true - Disable; false - Do not disable. Default value: false.Notes:1. When the audit service is disabled, your audit logs and files will be deleted, and all audit policies for this instance will be removed.2. At least one of CloseAudit and LogExpireDay must be provided. If both are provided, CloseAudit takes priority.3. You can use this parameter to disable the audit service. Once disabled, the audit service cannot be re-enabled via this API. 
     * @return CloseAudit Whether to disable the audit service. Valid values: true - Disable; false - Do not disable. Default value: false.Notes:1. When the audit service is disabled, your audit logs and files will be deleted, and all audit policies for this instance will be removed.2. At least one of CloseAudit and LogExpireDay must be provided. If both are provided, CloseAudit takes priority.3. You can use this parameter to disable the audit service. Once disabled, the audit service cannot be re-enabled via this API.
     */
    public Boolean getCloseAudit() {
        return this.CloseAudit;
    }

    /**
     * Set Whether to disable the audit service. Valid values: true - Disable; false - Do not disable. Default value: false.Notes:1. When the audit service is disabled, your audit logs and files will be deleted, and all audit policies for this instance will be removed.2. At least one of CloseAudit and LogExpireDay must be provided. If both are provided, CloseAudit takes priority.3. You can use this parameter to disable the audit service. Once disabled, the audit service cannot be re-enabled via this API.
     * @param CloseAudit Whether to disable the audit service. Valid values: true - Disable; false - Do not disable. Default value: false.Notes:1. When the audit service is disabled, your audit logs and files will be deleted, and all audit policies for this instance will be removed.2. At least one of CloseAudit and LogExpireDay must be provided. If both are provided, CloseAudit takes priority.3. You can use this parameter to disable the audit service. Once disabled, the audit service cannot be re-enabled via this API.
     */
    public void setCloseAudit(Boolean CloseAudit) {
        this.CloseAudit = CloseAudit;
    }

    /**
     * Get High-frequency audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years. 
     * @return HighLogExpireDay High-frequency audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set High-frequency audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     * @param HighLogExpireDay High-frequency audit log retention period. Valid values:7 - One week;30 - One month;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    public ModifyAuditConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditConfigRequest(ModifyAuditConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.CloseAudit != null) {
            this.CloseAudit = new Boolean(source.CloseAudit);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "CloseAudit", this.CloseAudit);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);

    }
}

