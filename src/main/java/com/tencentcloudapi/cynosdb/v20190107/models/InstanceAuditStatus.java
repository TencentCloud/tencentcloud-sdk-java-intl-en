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
    * Log retention period.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * High-frequency storage duration.
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * Low-frequency storage duration.
    */
    @SerializedName("LowLogExpireDay")
    @Expose
    private Long LowLogExpireDay;

    /**
    * Log storage volume.
    */
    @SerializedName("BillingAmount")
    @Expose
    private Float BillingAmount;

    /**
    * High-frequency storage volume.
    */
    @SerializedName("HighRealStorage")
    @Expose
    private Float HighRealStorage;

    /**
    * Infrequent access storage size.
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
    * Instance-related information.
    */
    @SerializedName("InstanceInfo")
    @Expose
    private AuditInstanceInfo InstanceInfo;

    /**
    * Total storage.
    */
    @SerializedName("RealStorage")
    @Expose
    private Float RealStorage;

    /**
    * Rule template applied to the instance.
    */
    @SerializedName("RuleTemplateIds")
    @Expose
    private String [] RuleTemplateIds;

    /**
    * Whether to enable log delivery: ON, OFF
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
     * Get Log retention period. 
     * @return LogExpireDay Log retention period.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Log retention period.
     * @param LogExpireDay Log retention period.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get High-frequency storage duration. 
     * @return HighLogExpireDay High-frequency storage duration.
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set High-frequency storage duration.
     * @param HighLogExpireDay High-frequency storage duration.
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get Low-frequency storage duration. 
     * @return LowLogExpireDay Low-frequency storage duration.
     */
    public Long getLowLogExpireDay() {
        return this.LowLogExpireDay;
    }

    /**
     * Set Low-frequency storage duration.
     * @param LowLogExpireDay Low-frequency storage duration.
     */
    public void setLowLogExpireDay(Long LowLogExpireDay) {
        this.LowLogExpireDay = LowLogExpireDay;
    }

    /**
     * Get Log storage volume. 
     * @return BillingAmount Log storage volume.
     */
    public Float getBillingAmount() {
        return this.BillingAmount;
    }

    /**
     * Set Log storage volume.
     * @param BillingAmount Log storage volume.
     */
    public void setBillingAmount(Float BillingAmount) {
        this.BillingAmount = BillingAmount;
    }

    /**
     * Get High-frequency storage volume. 
     * @return HighRealStorage High-frequency storage volume.
     */
    public Float getHighRealStorage() {
        return this.HighRealStorage;
    }

    /**
     * Set High-frequency storage volume.
     * @param HighRealStorage High-frequency storage volume.
     */
    public void setHighRealStorage(Float HighRealStorage) {
        this.HighRealStorage = HighRealStorage;
    }

    /**
     * Get Infrequent access storage size. 
     * @return LowRealStorage Infrequent access storage size.
     */
    public Float getLowRealStorage() {
        return this.LowRealStorage;
    }

    /**
     * Set Infrequent access storage size.
     * @param LowRealStorage Infrequent access storage size.
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
     * Get Instance-related information. 
     * @return InstanceInfo Instance-related information.
     */
    public AuditInstanceInfo getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Instance-related information.
     * @param InstanceInfo Instance-related information.
     */
    public void setInstanceInfo(AuditInstanceInfo InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get Total storage. 
     * @return RealStorage Total storage.
     */
    public Float getRealStorage() {
        return this.RealStorage;
    }

    /**
     * Set Total storage.
     * @param RealStorage Total storage.
     */
    public void setRealStorage(Float RealStorage) {
        this.RealStorage = RealStorage;
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
     * Get Whether to enable log delivery: ON, OFF 
     * @return Deliver Whether to enable log delivery: ON, OFF
     */
    public String getDeliver() {
        return this.Deliver;
    }

    /**
     * Set Whether to enable log delivery: ON, OFF
     * @param Deliver Whether to enable log delivery: ON, OFF
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

