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

public class CreateBudgetRequest extends AbstractModel {

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
    * Validity start time 2025-01-01 (Period: day) / 2025-01 (Period: month)
    */
    @SerializedName("PeriodBegin")
    @Expose
    private String PeriodBegin;

    /**
    * Validity end time 2025-12-01 (Period: day) / 2025-12 (Cycle: month)
    */
    @SerializedName("PeriodEnd")
    @Expose
    private String PeriodEnd;

    /**
    * FIX Fixed Budget, CYCLE Budget Planning
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Budget amount limit
Pass a fixed value when the schedule type is FIX (fixed budget).
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
    * COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (before tax)
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * Threshold alert
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
    * Budget Dimension Range Condition
    */
    @SerializedName("DimensionsRange")
    @Expose
    private BudgetConditionsForm DimensionsRange;

    /**
    * Fluctuation alert
    */
    @SerializedName("WaveThresholdJson")
    @Expose
    private WaveThresholdForm [] WaveThresholdJson;

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
     * Get Validity start time 2025-01-01 (Period: day) / 2025-01 (Period: month) 
     * @return PeriodBegin Validity start time 2025-01-01 (Period: day) / 2025-01 (Period: month)
     */
    public String getPeriodBegin() {
        return this.PeriodBegin;
    }

    /**
     * Set Validity start time 2025-01-01 (Period: day) / 2025-01 (Period: month)
     * @param PeriodBegin Validity start time 2025-01-01 (Period: day) / 2025-01 (Period: month)
     */
    public void setPeriodBegin(String PeriodBegin) {
        this.PeriodBegin = PeriodBegin;
    }

    /**
     * Get Validity end time 2025-12-01 (Period: day) / 2025-12 (Cycle: month) 
     * @return PeriodEnd Validity end time 2025-12-01 (Period: day) / 2025-12 (Cycle: month)
     */
    public String getPeriodEnd() {
        return this.PeriodEnd;
    }

    /**
     * Set Validity end time 2025-12-01 (Period: day) / 2025-12 (Cycle: month)
     * @param PeriodEnd Validity end time 2025-12-01 (Period: day) / 2025-12 (Cycle: month)
     */
    public void setPeriodEnd(String PeriodEnd) {
        this.PeriodEnd = PeriodEnd;
    }

    /**
     * Get FIX Fixed Budget, CYCLE Budget Planning 
     * @return PlanType FIX Fixed Budget, CYCLE Budget Planning
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set FIX Fixed Budget, CYCLE Budget Planning
     * @param PlanType FIX Fixed Budget, CYCLE Budget Planning
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Budget amount limit
Pass a fixed value when the schedule type is FIX (fixed budget).
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}]. 
     * @return BudgetQuota Budget amount limit
Pass a fixed value when the schedule type is FIX (fixed budget).
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set Budget amount limit
Pass a fixed value when the schedule type is FIX (fixed budget).
When the schedule type is CYCLE (budget planning), pass [{"dateDesc":"2025-07","quota":"1000"},{"dateDesc":"2025-08","quota":"2000"}].
     * @param BudgetQuota Budget amount limit
Pass a fixed value when the schedule type is FIX (fixed budget).
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
     * Get COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (before tax) 
     * @return FeeType COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (before tax)
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (before tax)
     * @param FeeType COST Original price, REAL_COST Actual fee, CASH Cash, INCENTIVE Free credit, VOUCHER Voucher, TRANSFER Allocated fees (royalty amount), TAX Tax, AMOUNT_BEFORE_TAX Cash payment (before tax)
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get Threshold alert 
     * @return WarnJson Threshold alert
     */
    public BudgetWarn [] getWarnJson() {
        return this.WarnJson;
    }

    /**
     * Set Threshold alert
     * @param WarnJson Threshold alert
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
     * Get Budget Dimension Range Condition 
     * @return DimensionsRange Budget Dimension Range Condition
     */
    public BudgetConditionsForm getDimensionsRange() {
        return this.DimensionsRange;
    }

    /**
     * Set Budget Dimension Range Condition
     * @param DimensionsRange Budget Dimension Range Condition
     */
    public void setDimensionsRange(BudgetConditionsForm DimensionsRange) {
        this.DimensionsRange = DimensionsRange;
    }

    /**
     * Get Fluctuation alert 
     * @return WaveThresholdJson Fluctuation alert
     */
    public WaveThresholdForm [] getWaveThresholdJson() {
        return this.WaveThresholdJson;
    }

    /**
     * Set Fluctuation alert
     * @param WaveThresholdJson Fluctuation alert
     */
    public void setWaveThresholdJson(WaveThresholdForm [] WaveThresholdJson) {
        this.WaveThresholdJson = WaveThresholdJson;
    }

    public CreateBudgetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBudgetRequest(CreateBudgetRequest source) {
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

