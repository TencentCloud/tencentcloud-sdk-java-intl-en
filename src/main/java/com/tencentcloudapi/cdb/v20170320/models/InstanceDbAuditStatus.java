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

public class InstanceDbAuditStatus extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Audit status. ON - Audit is enabled, OFF - Audit is disabled.
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * Task status. Valid values: 0 - No task; 1 - Enabling audit; 2 - Disabling audit.
    */
    @SerializedName("AuditTask")
    @Expose
    private Long AuditTask;

    /**
    * Log retention period. Valid values:7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * High-frequency storage period. Valid values:3 - 3 days;7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * Low-frequency storage period (in days). This equals the log retention period minus the high-frequency storage period.
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * Log storage volume (in GB).
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * High-frequency storage volume (in GB).
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * Low-frequency storage volume (in GB).
    */
    @SerializedName("LowRealStorage")
    @Expose
    private Float LowRealStorage;

    /**
    * Whether full audit is enabled. true - Full audit.
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * Time when the audit service was activated.
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * Related information about the instance.
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
    * Total storage volume (in GB).
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
    * Whether an audit policy is configured.
    */
    @SerializedName("OldRule")
    @Expose
    private Boolean OldRule;

    /**
    * Rule template applied to the instance.
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Trial status.
    */
    @SerializedName("TrialStatus")
    @Expose
    private String TrialStatus;

    /**
    * Trial start time.
    */
    @SerializedName("TrialStartTime")
    @Expose
    private Long TrialStartTime;

    /**
    * Trial duration.
    */
    @SerializedName("TrialDuration")
    @Expose
    private Long TrialDuration;

    /**
    * Trial end time.
    */
    @SerializedName("TrialCloseTime")
    @Expose
    private Long TrialCloseTime;

    /**
    * Log query time limit during the trial period.
    */
    @SerializedName("TrialDescribeLogHours")
    @Expose
    private Long TrialDescribeLogHours;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Audit status. ON - Audit is enabled, OFF - Audit is disabled. 
     * @return AuditStatus Audit status. ON - Audit is enabled, OFF - Audit is disabled.
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Audit status. ON - Audit is enabled, OFF - Audit is disabled.
     * @param AuditStatus Audit status. ON - Audit is enabled, OFF - Audit is disabled.
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Task status. Valid values: 0 - No task; 1 - Enabling audit; 2 - Disabling audit. 
     * @return AuditTask Task status. Valid values: 0 - No task; 1 - Enabling audit; 2 - Disabling audit.
     */
    public Long getAuditTask() {
        return this.AuditTask;
    }

    /**
     * Set Task status. Valid values: 0 - No task; 1 - Enabling audit; 2 - Disabling audit.
     * @param AuditTask Task status. Valid values: 0 - No task; 1 - Enabling audit; 2 - Disabling audit.
     */
    public void setAuditTask(Long AuditTask) {
        this.AuditTask = AuditTask;
    }

    /**
     * Get Log retention period. Valid values:7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years. 
     * @return LogExpireDay Log retention period. Valid values:7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Log retention period. Valid values:7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     * @param LogExpireDay Log retention period. Valid values:7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get High-frequency storage period. Valid values:3 - 3 days;7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years. 
     * @return HighLogExpireDay High-frequency storage period. Valid values:3 - 3 days;7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set High-frequency storage period. Valid values:3 - 3 days;7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     * @param HighLogExpireDay High-frequency storage period. Valid values:3 - 3 days;7 - One week;30 - One month;90 - Three months;180 - Six months;365 - One year;1095 - Three years;1825 - Five years.
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get Low-frequency storage period (in days). This equals the log retention period minus the high-frequency storage period. 
     * @return LowLogExpireDay Low-frequency storage period (in days). This equals the log retention period minus the high-frequency storage period.
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set Low-frequency storage period (in days). This equals the log retention period minus the high-frequency storage period.
     * @param LowLogExpireDay Low-frequency storage period (in days). This equals the log retention period minus the high-frequency storage period.
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get Log storage volume (in GB). 
     * @return BillingAmount Log storage volume (in GB).
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set Log storage volume (in GB).
     * @param BillingAmount Log storage volume (in GB).
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get High-frequency storage volume (in GB). 
     * @return HighRealStorage High-frequency storage volume (in GB).
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set High-frequency storage volume (in GB).
     * @param HighRealStorage High-frequency storage volume (in GB).
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get Low-frequency storage volume (in GB). 
     * @return LowRealStorage Low-frequency storage volume (in GB).
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set Low-frequency storage volume (in GB).
     * @param LowRealStorage Low-frequency storage volume (in GB).
     */
    public void setLowRealStorage(Float LowRealStorage) {
        this.LowRealStorage = LowRealStorage;
    }

    /**
     * Get Whether full audit is enabled. true - Full audit. 
     * @return AuditAll Whether full audit is enabled. true - Full audit.
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set Whether full audit is enabled. true - Full audit.
     * @param AuditAll Whether full audit is enabled. true - Full audit.
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get Time when the audit service was activated. 
     * @return CreateAt Time when the audit service was activated.
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Time when the audit service was activated.
     * @param CreateAt Time when the audit service was activated.
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get Related information about the instance. 
     * @return InstanceInfo Related information about the instance.
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Related information about the instance.
     * @param InstanceInfo Related information about the instance.
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get Total storage volume (in GB). 
     * @return RealStorage Total storage volume (in GB).
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set Total storage volume (in GB).
     * @param RealStorage Total storage volume (in GB).
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
    }

    /**
     * Get Whether an audit policy is configured. 
     * @return OldRule Whether an audit policy is configured.
     */
    public Boolean getOldRule() {
        return this.OldRule;
    }

    /**
     * Set Whether an audit policy is configured.
     * @param OldRule Whether an audit policy is configured.
     */
    public void setOldRule(Boolean OldRule) {
        this.OldRule = OldRule;
    }

    /**
     * Get Rule template applied to the instance. 
     * @return RuleTemplateIds Rule template applied to the instance.
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set Rule template applied to the instance.
     * @param RuleTemplateIds Rule template applied to the instance.
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get Trial status. 
     * @return TrialStatus Trial status.
     */
    public String getTrialStatus() {
        return this.TrialStatus;
    }

    /**
     * Set Trial status.
     * @param TrialStatus Trial status.
     */
    public void setTrialStatus(String TrialStatus) {
        this.TrialStatus = TrialStatus;
    }

    /**
     * Get Trial start time. 
     * @return TrialStartTime Trial start time.
     */
    public Long getTrialStartTime() {
        return this.TrialStartTime;
    }

    /**
     * Set Trial start time.
     * @param TrialStartTime Trial start time.
     */
    public void setTrialStartTime(Long TrialStartTime) {
        this.TrialStartTime = TrialStartTime;
    }

    /**
     * Get Trial duration. 
     * @return TrialDuration Trial duration.
     */
    public Long getTrialDuration() {
        return this.TrialDuration;
    }

    /**
     * Set Trial duration.
     * @param TrialDuration Trial duration.
     */
    public void setTrialDuration(Long TrialDuration) {
        this.TrialDuration = TrialDuration;
    }

    /**
     * Get Trial end time. 
     * @return TrialCloseTime Trial end time.
     */
    public Long getTrialCloseTime() {
        return this.TrialCloseTime;
    }

    /**
     * Set Trial end time.
     * @param TrialCloseTime Trial end time.
     */
    public void setTrialCloseTime(Long TrialCloseTime) {
        this.TrialCloseTime = TrialCloseTime;
    }

    /**
     * Get Log query time limit during the trial period. 
     * @return TrialDescribeLogHours Log query time limit during the trial period.
     */
    public Long getTrialDescribeLogHours() {
        return this.TrialDescribeLogHours;
    }

    /**
     * Set Log query time limit during the trial period.
     * @param TrialDescribeLogHours Log query time limit during the trial period.
     */
    public void setTrialDescribeLogHours(Long TrialDescribeLogHours) {
        this.TrialDescribeLogHours = TrialDescribeLogHours;
    }

    public InstanceDbAuditStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDbAuditStatus(InstanceDbAuditStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.AuditTask != null) {
            this.AuditTask = new Long(source.AuditTask);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.LowLogExpireDay != null) {
            this.LowLogExpireDay = new Long(source.LowLogExpireDay);
        }
        if (source.BillingAmount != null) {
            this.BillingAmount = new Float(source.BillingAmount);
        }
        if (source.HighRealStorage != null) {
            this.HighRealStorage = new Float(source.HighRealStorage);
        }
        if (source.LowRealStorage != null) {
            this.LowRealStorage = new Float(source.LowRealStorage);
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new AuditInstanceInfo(source.InstanceInfo);
        }
        if (source.RealStorage != null) {
            this.RealStorage = new Float(source.RealStorage);
        }
        if (source.OldRule != null) {
            this.OldRule = new Boolean(source.OldRule);
        }
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.TrialStatus != null) {
            this.TrialStatus = new String(source.TrialStatus);
        }
        if (source.TrialStartTime != null) {
            this.TrialStartTime = new Long(source.TrialStartTime);
        }
        if (source.TrialDuration != null) {
            this.TrialDuration = new Long(source.TrialDuration);
        }
        if (source.TrialCloseTime != null) {
            this.TrialCloseTime = new Long(source.TrialCloseTime);
        }
        if (source.TrialDescribeLogHours != null) {
            this.TrialDescribeLogHours = new Long(source.TrialDescribeLogHours);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditTask", this.AuditTask);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "LowLogExpireDay", this.LowLogExpireDay);
        this.setParamSimple(map, prefix + "BillingAmount", this.BillingAmount);
        this.setParamSimple(map, prefix + "HighRealStorage", this.HighRealStorage);
        this.setParamSimple(map, prefix + "LowRealStorage", this.LowRealStorage);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "RealStorage", this.RealStorage);
        this.setParamSimple(map, prefix + "OldRule", this.OldRule);
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "TrialStatus", this.TrialStatus);
        this.setParamSimple(map, prefix + "TrialStartTime", this.TrialStartTime);
        this.setParamSimple(map, prefix + "TrialDuration", this.TrialDuration);
        this.setParamSimple(map, prefix + "TrialCloseTime", this.TrialCloseTime);
        this.setParamSimple(map, prefix + "TrialDescribeLogHours", this.TrialDescribeLogHours);

    }
}

