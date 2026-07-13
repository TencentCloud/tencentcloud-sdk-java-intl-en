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

public class BudgetExtend extends AbstractModel {

    /**
    * Budget Name
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * Budget limit
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * DAY, MONTH, QUARTER, YEAR
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

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
    * Validity start time 2025-01-01
    */
    @SerializedName("PeriodBegin")
    @Expose
    private String PeriodBegin;

    /**
    * Validity end time 2025-12-01
    */
    @SerializedName("PeriodEnd")
    @Expose
    private String PeriodEnd;

    /**
    * COST,USAGE,RI,SP
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * FIX fixed value, CYCLE different value
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * threshold alert
    */
    @SerializedName("WarnJson")
    @Expose
    private BudgetWarn [] WarnJson;

    /**
    * User UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private Long PayerUin;

    /**
    * fluctuation alert
    */
    @SerializedName("WaveThresholdJson")
    @Expose
    private WaveThresholdForm [] WaveThresholdJson;

    /**
    * Budget remark
    */
    @SerializedName("BudgetNote")
    @Expose
    private String BudgetNote;

    /**
    * Custom sending object information
    */
    @SerializedName("SendDetail")
    @Expose
    private String SendDetail;

    /**
    * Default uin sent
    */
    @SerializedName("DefaultMode")
    @Expose
    private Long DefaultMode;

    /**
    * CUS custom budget, ZERO_COST zero-cost budget template, BY_MONTH monthly cost budget template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * (1, "Not over budget")
(2, "Overspend")
    */
    @SerializedName("MoneyStatus")
    @Expose
    private Long MoneyStatus;

    /**
    * Reminder count
    */
    @SerializedName("RemindTimes")
    @Expose
    private Long RemindTimes;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update budget time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Associated Id of the budget
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * NO_FORECAST (Not set)
FORECAST_NO_DATA (Set up prediction but no data)
FORECAST_HAS_DATA (Set up prediction with predictive data)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasForecast")
    @Expose
    private String HasForecast;

    /**
    * predicted fee
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForecastCost")
    @Expose
    private String ForecastCost;

    /**
    * Projection progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForecastProgress")
    @Expose
    private String ForecastProgress;

    /**
    * actual fee
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * Custom send
    */
    @SerializedName("BudgetSendInfoForm")
    @Expose
    private BudgetSendInfoDto [] BudgetSendInfoForm;

    /**
    * current cycle
    */
    @SerializedName("CurDateDesc")
    @Expose
    private String CurDateDesc;

    /**
    * EXPIRED
ACTIVE
UNACTIVATED Invalid
ACTIVATED To be effective
    */
    @SerializedName("BudgetStatus")
    @Expose
    private String BudgetStatus;

    /**
    * Budget dimension range condition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DimensionsRange")
    @Expose
    private BudgetConditionsForm DimensionsRange;

    /**
    * Budget progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BudgetProgress")
    @Expose
    private String BudgetProgress;

    /**
    * Budget Type is set to budget planning and returns the budget limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BudgetQuotaJson")
    @Expose
    private BudgetPlan [] BudgetQuotaJson;

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
     * Get Budget limit 
     * @return BudgetQuota Budget limit
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set Budget limit
     * @param BudgetQuota Budget limit
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
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
     * Get Validity end time 2025-12-01 
     * @return PeriodEnd Validity end time 2025-12-01
     */
    public String getPeriodEnd() {
        return this.PeriodEnd;
    }

    /**
     * Set Validity end time 2025-12-01
     * @param PeriodEnd Validity end time 2025-12-01
     */
    public void setPeriodEnd(String PeriodEnd) {
        this.PeriodEnd = PeriodEnd;
    }

    /**
     * Get COST,USAGE,RI,SP 
     * @return Dimensions COST,USAGE,RI,SP
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set COST,USAGE,RI,SP
     * @param Dimensions COST,USAGE,RI,SP
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
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
     * Get User UIN 
     * @return PayerUin User UIN
     */
    public Long getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set User UIN
     * @param PayerUin User UIN
     */
    public void setPayerUin(Long PayerUin) {
        this.PayerUin = PayerUin;
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
     * Get Custom sending object information 
     * @return SendDetail Custom sending object information
     */
    public String getSendDetail() {
        return this.SendDetail;
    }

    /**
     * Set Custom sending object information
     * @param SendDetail Custom sending object information
     */
    public void setSendDetail(String SendDetail) {
        this.SendDetail = SendDetail;
    }

    /**
     * Get Default uin sent 
     * @return DefaultMode Default uin sent
     */
    public Long getDefaultMode() {
        return this.DefaultMode;
    }

    /**
     * Set Default uin sent
     * @param DefaultMode Default uin sent
     */
    public void setDefaultMode(Long DefaultMode) {
        this.DefaultMode = DefaultMode;
    }

    /**
     * Get CUS custom budget, ZERO_COST zero-cost budget template, BY_MONTH monthly cost budget template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateType CUS custom budget, ZERO_COST zero-cost budget template, BY_MONTH monthly cost budget template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set CUS custom budget, ZERO_COST zero-cost budget template, BY_MONTH monthly cost budget template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateType CUS custom budget, ZERO_COST zero-cost budget template, BY_MONTH monthly cost budget template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get (1, "Not over budget")
(2, "Overspend") 
     * @return MoneyStatus (1, "Not over budget")
(2, "Overspend")
     */
    public Long getMoneyStatus() {
        return this.MoneyStatus;
    }

    /**
     * Set (1, "Not over budget")
(2, "Overspend")
     * @param MoneyStatus (1, "Not over budget")
(2, "Overspend")
     */
    public void setMoneyStatus(Long MoneyStatus) {
        this.MoneyStatus = MoneyStatus;
    }

    /**
     * Get Reminder count 
     * @return RemindTimes Reminder count
     */
    public Long getRemindTimes() {
        return this.RemindTimes;
    }

    /**
     * Set Reminder count
     * @param RemindTimes Reminder count
     */
    public void setRemindTimes(Long RemindTimes) {
        this.RemindTimes = RemindTimes;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update budget time 
     * @return UpdateTime Update budget time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update budget time
     * @param UpdateTime Update budget time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Associated Id of the budget 
     * @return BudgetId Associated Id of the budget
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Associated Id of the budget
     * @param BudgetId Associated Id of the budget
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get NO_FORECAST (Not set)
FORECAST_NO_DATA (Set up prediction but no data)
FORECAST_HAS_DATA (Set up prediction with predictive data)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasForecast NO_FORECAST (Not set)
FORECAST_NO_DATA (Set up prediction but no data)
FORECAST_HAS_DATA (Set up prediction with predictive data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHasForecast() {
        return this.HasForecast;
    }

    /**
     * Set NO_FORECAST (Not set)
FORECAST_NO_DATA (Set up prediction but no data)
FORECAST_HAS_DATA (Set up prediction with predictive data)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasForecast NO_FORECAST (Not set)
FORECAST_NO_DATA (Set up prediction but no data)
FORECAST_HAS_DATA (Set up prediction with predictive data)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasForecast(String HasForecast) {
        this.HasForecast = HasForecast;
    }

    /**
     * Get predicted fee
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForecastCost predicted fee
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForecastCost() {
        return this.ForecastCost;
    }

    /**
     * Set predicted fee
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForecastCost predicted fee
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForecastCost(String ForecastCost) {
        this.ForecastCost = ForecastCost;
    }

    /**
     * Get Projection progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForecastProgress Projection progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForecastProgress() {
        return this.ForecastProgress;
    }

    /**
     * Set Projection progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForecastProgress Projection progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForecastProgress(String ForecastProgress) {
        this.ForecastProgress = ForecastProgress;
    }

    /**
     * Get actual fee 
     * @return RealCost actual fee
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set actual fee
     * @param RealCost actual fee
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get Custom send 
     * @return BudgetSendInfoForm Custom send
     */
    public BudgetSendInfoDto [] getBudgetSendInfoForm() {
        return this.BudgetSendInfoForm;
    }

    /**
     * Set Custom send
     * @param BudgetSendInfoForm Custom send
     */
    public void setBudgetSendInfoForm(BudgetSendInfoDto [] BudgetSendInfoForm) {
        this.BudgetSendInfoForm = BudgetSendInfoForm;
    }

    /**
     * Get current cycle 
     * @return CurDateDesc current cycle
     */
    public String getCurDateDesc() {
        return this.CurDateDesc;
    }

    /**
     * Set current cycle
     * @param CurDateDesc current cycle
     */
    public void setCurDateDesc(String CurDateDesc) {
        this.CurDateDesc = CurDateDesc;
    }

    /**
     * Get EXPIRED
ACTIVE
UNACTIVATED Invalid
ACTIVATED To be effective 
     * @return BudgetStatus EXPIRED
ACTIVE
UNACTIVATED Invalid
ACTIVATED To be effective
     */
    public String getBudgetStatus() {
        return this.BudgetStatus;
    }

    /**
     * Set EXPIRED
ACTIVE
UNACTIVATED Invalid
ACTIVATED To be effective
     * @param BudgetStatus EXPIRED
ACTIVE
UNACTIVATED Invalid
ACTIVATED To be effective
     */
    public void setBudgetStatus(String BudgetStatus) {
        this.BudgetStatus = BudgetStatus;
    }

    /**
     * Get Budget dimension range condition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DimensionsRange Budget dimension range condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BudgetConditionsForm getDimensionsRange() {
        return this.DimensionsRange;
    }

    /**
     * Set Budget dimension range condition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DimensionsRange Budget dimension range condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDimensionsRange(BudgetConditionsForm DimensionsRange) {
        this.DimensionsRange = DimensionsRange;
    }

    /**
     * Get Budget progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BudgetProgress Budget progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBudgetProgress() {
        return this.BudgetProgress;
    }

    /**
     * Set Budget progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BudgetProgress Budget progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBudgetProgress(String BudgetProgress) {
        this.BudgetProgress = BudgetProgress;
    }

    /**
     * Get Budget Type is set to budget planning and returns the budget limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BudgetQuotaJson Budget Type is set to budget planning and returns the budget limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BudgetPlan [] getBudgetQuotaJson() {
        return this.BudgetQuotaJson;
    }

    /**
     * Set Budget Type is set to budget planning and returns the budget limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BudgetQuotaJson Budget Type is set to budget planning and returns the budget limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBudgetQuotaJson(BudgetPlan [] BudgetQuotaJson) {
        this.BudgetQuotaJson = BudgetQuotaJson;
    }

    public BudgetExtend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetExtend(BudgetExtend source) {
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PeriodBegin != null) {
            this.PeriodBegin = new String(source.PeriodBegin);
        }
        if (source.PeriodEnd != null) {
            this.PeriodEnd = new String(source.PeriodEnd);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.WarnJson != null) {
            this.WarnJson = new BudgetWarn[source.WarnJson.length];
            for (int i = 0; i < source.WarnJson.length; i++) {
                this.WarnJson[i] = new BudgetWarn(source.WarnJson[i]);
            }
        }
        if (source.PayerUin != null) {
            this.PayerUin = new Long(source.PayerUin);
        }
        if (source.WaveThresholdJson != null) {
            this.WaveThresholdJson = new WaveThresholdForm[source.WaveThresholdJson.length];
            for (int i = 0; i < source.WaveThresholdJson.length; i++) {
                this.WaveThresholdJson[i] = new WaveThresholdForm(source.WaveThresholdJson[i]);
            }
        }
        if (source.BudgetNote != null) {
            this.BudgetNote = new String(source.BudgetNote);
        }
        if (source.SendDetail != null) {
            this.SendDetail = new String(source.SendDetail);
        }
        if (source.DefaultMode != null) {
            this.DefaultMode = new Long(source.DefaultMode);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MoneyStatus != null) {
            this.MoneyStatus = new Long(source.MoneyStatus);
        }
        if (source.RemindTimes != null) {
            this.RemindTimes = new Long(source.RemindTimes);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.HasForecast != null) {
            this.HasForecast = new String(source.HasForecast);
        }
        if (source.ForecastCost != null) {
            this.ForecastCost = new String(source.ForecastCost);
        }
        if (source.ForecastProgress != null) {
            this.ForecastProgress = new String(source.ForecastProgress);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.BudgetSendInfoForm != null) {
            this.BudgetSendInfoForm = new BudgetSendInfoDto[source.BudgetSendInfoForm.length];
            for (int i = 0; i < source.BudgetSendInfoForm.length; i++) {
                this.BudgetSendInfoForm[i] = new BudgetSendInfoDto(source.BudgetSendInfoForm[i]);
            }
        }
        if (source.CurDateDesc != null) {
            this.CurDateDesc = new String(source.CurDateDesc);
        }
        if (source.BudgetStatus != null) {
            this.BudgetStatus = new String(source.BudgetStatus);
        }
        if (source.DimensionsRange != null) {
            this.DimensionsRange = new BudgetConditionsForm(source.DimensionsRange);
        }
        if (source.BudgetProgress != null) {
            this.BudgetProgress = new String(source.BudgetProgress);
        }
        if (source.BudgetQuotaJson != null) {
            this.BudgetQuotaJson = new BudgetPlan[source.BudgetQuotaJson.length];
            for (int i = 0; i < source.BudgetQuotaJson.length; i++) {
                this.BudgetQuotaJson[i] = new BudgetPlan(source.BudgetQuotaJson[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PeriodBegin", this.PeriodBegin);
        this.setParamSimple(map, prefix + "PeriodEnd", this.PeriodEnd);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamArrayObj(map, prefix + "WarnJson.", this.WarnJson);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamArrayObj(map, prefix + "WaveThresholdJson.", this.WaveThresholdJson);
        this.setParamSimple(map, prefix + "BudgetNote", this.BudgetNote);
        this.setParamSimple(map, prefix + "SendDetail", this.SendDetail);
        this.setParamSimple(map, prefix + "DefaultMode", this.DefaultMode);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MoneyStatus", this.MoneyStatus);
        this.setParamSimple(map, prefix + "RemindTimes", this.RemindTimes);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "HasForecast", this.HasForecast);
        this.setParamSimple(map, prefix + "ForecastCost", this.ForecastCost);
        this.setParamSimple(map, prefix + "ForecastProgress", this.ForecastProgress);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamArrayObj(map, prefix + "BudgetSendInfoForm.", this.BudgetSendInfoForm);
        this.setParamSimple(map, prefix + "CurDateDesc", this.CurDateDesc);
        this.setParamSimple(map, prefix + "BudgetStatus", this.BudgetStatus);
        this.setParamObj(map, prefix + "DimensionsRange.", this.DimensionsRange);
        this.setParamSimple(map, prefix + "BudgetProgress", this.BudgetProgress);
        this.setParamArrayObj(map, prefix + "BudgetQuotaJson.", this.BudgetQuotaJson);

    }
}

