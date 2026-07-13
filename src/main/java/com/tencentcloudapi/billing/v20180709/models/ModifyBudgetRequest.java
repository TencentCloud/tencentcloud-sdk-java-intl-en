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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBudgetRequest extends AbstractModel {

    /**
    * Budget project id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * Budget Name
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * DAY, MONTH, QUARTER, YEAR
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Validity start time 2025-01-01
    */
    @SerializedName("PeriodBegin")
    @Expose
    private String PeriodBegin;

    /**
    * Validity End Time 2025-12-01
    */
    @SerializedName("PeriodEnd")
    @Expose
    private String PeriodEnd;

    /**
    * FIX fixed value, CYCLE different value
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Budget amount limit 
Set as a fixed value when the schedule type is fixed budget.
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * BILL System bill, CONSUMPTION Consumption bill
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (pre-tax)
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * threshold alert
    */
    @SerializedName("WarnJson")
    @Expose
    private BudgetWarn [] WarnJson;

    /**
    * Budget remark
    */
    @SerializedName("BudgetNote")
    @Expose
    private String BudgetNote;

    /**
    * Budget dimension range condition
    */
    @SerializedName("DimensionsRange")
    @Expose
    private BudgetConditionsForm DimensionsRange;

    /**
    * fluctuation alert
    */
    @SerializedName("WaveThresholdJson")
    @Expose
    private WaveThresholdForm [] WaveThresholdJson;

    /**
     * Get Budget project id 
     * @return BudgetId Budget project id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Budget project id
     * @param BudgetId Budget project id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get Budget Name 
     * @return BudgetName Budget Name
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set Budget Name
     * @param BudgetName Budget Name
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get DAY, MONTH, QUARTER, YEAR 
     * @return CycleType DAY, MONTH, QUARTER, YEAR
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set DAY, MONTH, QUARTER, YEAR
     * @param CycleType DAY, MONTH, QUARTER, YEAR
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Validity start time 2025-01-01 
     * @return PeriodBegin Validity start time 2025-01-01
     */
    public String getPeriodBegin() {
        return this.PeriodBegin;
    }

    /**
     * Set Validity start time 2025-01-01
     * @param PeriodBegin Validity start time 2025-01-01
     */
    public void setPeriodBegin(String PeriodBegin) {
        this.PeriodBegin = PeriodBegin;
    }

    /**
     * Get Validity End Time 2025-12-01 
     * @return PeriodEnd Validity End Time 2025-12-01
     */
    public String getPeriodEnd() {
        return this.PeriodEnd;
    }

    /**
     * Set Validity End Time 2025-12-01
     * @param PeriodEnd Validity End Time 2025-12-01
     */
    public void setPeriodEnd(String PeriodEnd) {
        this.PeriodEnd = PeriodEnd;
    }

    /**
     * Get FIX fixed value, CYCLE different value 
     * @return PlanType FIX fixed value, CYCLE different value
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set FIX fixed value, CYCLE different value
     * @param PlanType FIX fixed value, CYCLE different value
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Budget amount limit 
Set as a fixed value when the schedule type is fixed budget.
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]. 
     * @return BudgetQuota Budget amount limit 
Set as a fixed value when the schedule type is fixed budget.
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set Budget amount limit 
Set as a fixed value when the schedule type is fixed budget.
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
     * @param BudgetQuota Budget amount limit 
Set as a fixed value when the schedule type is fixed budget.
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
    }

    /**
     * Get BILL System bill, CONSUMPTION Consumption bill 
     * @return BillType BILL System bill, CONSUMPTION Consumption bill
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set BILL System bill, CONSUMPTION Consumption bill
     * @param BillType BILL System bill, CONSUMPTION Consumption bill
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (pre-tax) 
     * @return FeeType COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (pre-tax)
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (pre-tax)
     * @param FeeType COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (pre-tax)
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get threshold alert 
     * @return WarnJson threshold alert
     */
    public BudgetWarn [] getWarnJson() {
        return this.WarnJson;
    }

    /**
     * Set threshold alert
     * @param WarnJson threshold alert
     */
    public void setWarnJson(BudgetWarn [] WarnJson) {
        this.WarnJson = WarnJson;
    }

    /**
     * Get Budget remark 
     * @return BudgetNote Budget remark
     */
    public String getBudgetNote() {
        return this.BudgetNote;
    }

    /**
     * Set Budget remark
     * @param BudgetNote Budget remark
     */
    public void setBudgetNote(String BudgetNote) {
        this.BudgetNote = BudgetNote;
    }

    /**
     * Get Budget dimension range condition 
     * @return DimensionsRange Budget dimension range condition
     */
    public BudgetConditionsForm getDimensionsRange() {
        return this.DimensionsRange;
    }

    /**
     * Set Budget dimension range condition
     * @param DimensionsRange Budget dimension range condition
     */
    public void setDimensionsRange(BudgetConditionsForm DimensionsRange) {
        this.DimensionsRange = DimensionsRange;
    }

    /**
     * Get fluctuation alert 
     * @return WaveThresholdJson fluctuation alert
     */
    public WaveThresholdForm [] getWaveThresholdJson() {
        return this.WaveThresholdJson;
    }

    /**
     * Set fluctuation alert
     * @param WaveThresholdJson fluctuation alert
     */
    public void setWaveThresholdJson(WaveThresholdForm [] WaveThresholdJson) {
        this.WaveThresholdJson = WaveThresholdJson;
    }

    public ModifyBudgetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBudgetRequest(ModifyBudgetRequest source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.PeriodBegin != null) {
            this.PeriodBegin = new String(source.PeriodBegin);
        }
        if (source.PeriodEnd != null) {
            this.PeriodEnd = new String(source.PeriodEnd);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.WarnJson != null) {
            this.WarnJson = new BudgetWarn[source.WarnJson.length];
            for (int i = 0; i < source.WarnJson.length; i++) {
                this.WarnJson[i] = new BudgetWarn(source.WarnJson[i]);
            }
        }
        if (source.BudgetNote != null) {
            this.BudgetNote = new String(source.BudgetNote);
        }
        if (source.DimensionsRange != null) {
            this.DimensionsRange = new BudgetConditionsForm(source.DimensionsRange);
        }
        if (source.WaveThresholdJson != null) {
            this.WaveThresholdJson = new WaveThresholdForm[source.WaveThresholdJson.length];
            for (int i = 0; i < source.WaveThresholdJson.length; i++) {
                this.WaveThresholdJson[i] = new WaveThresholdForm(source.WaveThresholdJson[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "PeriodBegin", this.PeriodBegin);
        this.setParamSimple(map, prefix + "PeriodEnd", this.PeriodEnd);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamArrayObj(map, prefix + "WarnJson.", this.WarnJson);
        this.setParamSimple(map, prefix + "BudgetNote", this.BudgetNote);
        this.setParamObj(map, prefix + "DimensionsRange.", this.DimensionsRange);
        this.setParamArrayObj(map, prefix + "WaveThresholdJson.", this.WaveThresholdJson);

    }
}

