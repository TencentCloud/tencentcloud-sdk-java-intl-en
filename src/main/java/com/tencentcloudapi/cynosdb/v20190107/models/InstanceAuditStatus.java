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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditStatus extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * Specifies the log retention period.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * High-Frequency storage duration.
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * Specifies the duration of low-frequency storage.
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * Specifies the log storage volume.
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * Specifies the high-frequency storage volume.
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * Specifies the infrequent access storage size.
    */
    @SerializedName("LowRealStorage")
    @Expose
    private Float LowRealStorage;

    /**
    * Specifies whether it is a full audit. true - indicates a full audit.
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
    * Specifies the audit activation time.
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * Instance-Related information.
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
    * Specifies the total storage capacity.
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
    * The rule template applied to the instance.
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Specifies whether to enable log delivery: ON, OFF.
    */
    @SerializedName("Deliver")
    @Expose
    private String Deliver;

    /**
    * Log shipping type.
    */
    @SerializedName("DeliverSummary")
    @Expose
    private DeliverSummary [] DeliverSummary;

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  
     * @return AuditStatus 
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 
     * @param AuditStatus 
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Specifies the log retention period. 
     * @return LogExpireDay Specifies the log retention period.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Specifies the log retention period.
     * @param LogExpireDay Specifies the log retention period.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get High-Frequency storage duration. 
     * @return HighLogExpireDay High-Frequency storage duration.
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set High-Frequency storage duration.
     * @param HighLogExpireDay High-Frequency storage duration.
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get Specifies the duration of low-frequency storage. 
     * @return LowLogExpireDay Specifies the duration of low-frequency storage.
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set Specifies the duration of low-frequency storage.
     * @param LowLogExpireDay Specifies the duration of low-frequency storage.
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get Specifies the log storage volume. 
     * @return BillingAmount Specifies the log storage volume.
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set Specifies the log storage volume.
     * @param BillingAmount Specifies the log storage volume.
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get Specifies the high-frequency storage volume. 
     * @return HighRealStorage Specifies the high-frequency storage volume.
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set Specifies the high-frequency storage volume.
     * @param HighRealStorage Specifies the high-frequency storage volume.
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get Specifies the infrequent access storage size. 
     * @return LowRealStorage Specifies the infrequent access storage size.
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set Specifies the infrequent access storage size.
     * @param LowRealStorage Specifies the infrequent access storage size.
     */
    public void setLowRealStorage(Float LowRealStorage) {
        this.LowRealStorage = LowRealStorage;
    }

    /**
     * Get Specifies whether it is a full audit. true - indicates a full audit. 
     * @return AuditAll Specifies whether it is a full audit. true - indicates a full audit.
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set Specifies whether it is a full audit. true - indicates a full audit.
     * @param AuditAll Specifies whether it is a full audit. true - indicates a full audit.
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    /**
     * Get Specifies the audit activation time. 
     * @return CreateAt Specifies the audit activation time.
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Specifies the audit activation time.
     * @param CreateAt Specifies the audit activation time.
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get Instance-Related information. 
     * @return InstanceInfo Instance-Related information.
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Instance-Related information.
     * @param InstanceInfo Instance-Related information.
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get Specifies the total storage capacity. 
     * @return RealStorage Specifies the total storage capacity.
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set Specifies the total storage capacity.
     * @param RealStorage Specifies the total storage capacity.
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
    }

    /**
     * Get The rule template applied to the instance. 
     * @return RuleTemplateIds The rule template applied to the instance.
     */
    public String [] getRuleTemplateIds() {
        return this.RuleTemplateIds;
    }

    /**
     * Set The rule template applied to the instance.
     * @param RuleTemplateIds The rule template applied to the instance.
     */
    public void setRuleTemplateIds(String [] RuleTemplateIds) {
        this.RuleTemplateIds = RuleTemplateIds;
    }

    /**
     * Get Specifies whether to enable log delivery: ON, OFF. 
     * @return Deliver Specifies whether to enable log delivery: ON, OFF.
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set Specifies whether to enable log delivery: ON, OFF.
     * @param Deliver Specifies whether to enable log delivery: ON, OFF.
     */
    public void setDeliver(String Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get Log shipping type. 
     * @return DeliverSummary Log shipping type.
     */
    public DeliverSummary [] getDeliverSummary() {
        return this.DeliverSummary;
    }

    /**
     * Set Log shipping type.
     * @param DeliverSummary Log shipping type.
     */
    public void setDeliverSummary(DeliverSummary [] DeliverSummary) {
        this.DeliverSummary = DeliverSummary;
    }

    public InstanceAuditStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditStatus(InstanceAuditStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
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
        if (source.RuleTemplateIds != null) {
            this.RuleTemplateIds = new String[source.RuleTemplateIds.length];
            for (int i = 0; i < source.RuleTemplateIds.length; i++) {
                this.RuleTemplateIds[i] = new String(source.RuleTemplateIds[i]);
            }
        }
        if (source.Deliver != null) {
            this.Deliver = new String(source.Deliver);
        }
        if (source.DeliverSummary != null) {
            this.DeliverSummary = new DeliverSummary[source.DeliverSummary.length];
            for (int i = 0; i < source.DeliverSummary.length; i++) {
                this.DeliverSummary[i] = new DeliverSummary(source.DeliverSummary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
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
        this.setParamArraySimple(map, prefix + "RuleTemplateIds.", this.RuleTemplateIds);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamArrayObj(map, prefix + "DeliverSummary.", this.DeliverSummary);

    }
}

