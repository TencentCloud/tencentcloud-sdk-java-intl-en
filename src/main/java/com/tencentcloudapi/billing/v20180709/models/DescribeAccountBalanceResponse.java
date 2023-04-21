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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountBalanceResponse extends AbstractModel{

    /**
    * Available account balance in cents, which takes the same calculation rules as `RealBalance`, `CreditBalance`, and `RealCreditBalance`.
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * The UIN to query.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Available account balance in cents, which takes the same calculation rules as `Balance`, `CreditBalance`, and `RealCreditBalance`.
    */
    @SerializedName("RealBalance")
    @Expose
    private Float RealBalance;

    /**
    * Cash account balance in cents. Currently, this field is not applied.
    */
    @SerializedName("CashAccountBalance")
    @Expose
    private Float CashAccountBalance;

    /**
    * Income account balance in cents. Currently, this field is not applied.
    */
    @SerializedName("IncomeIntoAccountBalance")
    @Expose
    private Float IncomeIntoAccountBalance;

    /**
    * Present account balance in cents. Currently, this field is not applied.
    */
    @SerializedName("PresentAccountBalance")
    @Expose
    private Float PresentAccountBalance;

    /**
    * Frozen amount in cents.
    */
    @SerializedName("FreezeAmount")
    @Expose
    private Float FreezeAmount;

    /**
    * Overdue amount in cents, which is when the available credit balance is negative.
    */
    @SerializedName("OweAmount")
    @Expose
    private Float OweAmount;

    /**
    * Whether overdue payments are allowed. Currently, this field is not applied.
    */
    @SerializedName("IsAllowArrears")
    @Expose
    private Boolean IsAllowArrears;

    /**
    * Whether you have a credit limit. Currently, this field is not applied.
    */
    @SerializedName("IsCreditLimited")
    @Expose
    private Boolean IsCreditLimited;

    /**
    * Credit limit in cents. Credit limit－available credit balance = consumption amount
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * Available credit balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `RealCreditBalance`.
    */
    @SerializedName("CreditBalance")
    @Expose
    private Float CreditBalance;

    /**
    * Available account balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `CreditBalance`.
    */
    @SerializedName("RealCreditBalance")
    @Expose
    private Float RealCreditBalance;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Available account balance in cents, which takes the same calculation rules as `RealBalance`, `CreditBalance`, and `RealCreditBalance`. 
     * @return Balance Available account balance in cents, which takes the same calculation rules as `RealBalance`, `CreditBalance`, and `RealCreditBalance`.
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set Available account balance in cents, which takes the same calculation rules as `RealBalance`, `CreditBalance`, and `RealCreditBalance`.
     * @param Balance Available account balance in cents, which takes the same calculation rules as `RealBalance`, `CreditBalance`, and `RealCreditBalance`.
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get The UIN to query. 
     * @return Uin The UIN to query.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set The UIN to query.
     * @param Uin The UIN to query.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Available account balance in cents, which takes the same calculation rules as `Balance`, `CreditBalance`, and `RealCreditBalance`. 
     * @return RealBalance Available account balance in cents, which takes the same calculation rules as `Balance`, `CreditBalance`, and `RealCreditBalance`.
     */
    public Float getRealBalance() {
        return this.RealBalance;
    }

    /**
     * Set Available account balance in cents, which takes the same calculation rules as `Balance`, `CreditBalance`, and `RealCreditBalance`.
     * @param RealBalance Available account balance in cents, which takes the same calculation rules as `Balance`, `CreditBalance`, and `RealCreditBalance`.
     */
    public void setRealBalance(Float RealBalance) {
        this.RealBalance = RealBalance;
    }

    /**
     * Get Cash account balance in cents. Currently, this field is not applied. 
     * @return CashAccountBalance Cash account balance in cents. Currently, this field is not applied.
     */
    public Float getCashAccountBalance() {
        return this.CashAccountBalance;
    }

    /**
     * Set Cash account balance in cents. Currently, this field is not applied.
     * @param CashAccountBalance Cash account balance in cents. Currently, this field is not applied.
     */
    public void setCashAccountBalance(Float CashAccountBalance) {
        this.CashAccountBalance = CashAccountBalance;
    }

    /**
     * Get Income account balance in cents. Currently, this field is not applied. 
     * @return IncomeIntoAccountBalance Income account balance in cents. Currently, this field is not applied.
     */
    public Float getIncomeIntoAccountBalance() {
        return this.IncomeIntoAccountBalance;
    }

    /**
     * Set Income account balance in cents. Currently, this field is not applied.
     * @param IncomeIntoAccountBalance Income account balance in cents. Currently, this field is not applied.
     */
    public void setIncomeIntoAccountBalance(Float IncomeIntoAccountBalance) {
        this.IncomeIntoAccountBalance = IncomeIntoAccountBalance;
    }

    /**
     * Get Present account balance in cents. Currently, this field is not applied. 
     * @return PresentAccountBalance Present account balance in cents. Currently, this field is not applied.
     */
    public Float getPresentAccountBalance() {
        return this.PresentAccountBalance;
    }

    /**
     * Set Present account balance in cents. Currently, this field is not applied.
     * @param PresentAccountBalance Present account balance in cents. Currently, this field is not applied.
     */
    public void setPresentAccountBalance(Float PresentAccountBalance) {
        this.PresentAccountBalance = PresentAccountBalance;
    }

    /**
     * Get Frozen amount in cents. 
     * @return FreezeAmount Frozen amount in cents.
     */
    public Float getFreezeAmount() {
        return this.FreezeAmount;
    }

    /**
     * Set Frozen amount in cents.
     * @param FreezeAmount Frozen amount in cents.
     */
    public void setFreezeAmount(Float FreezeAmount) {
        this.FreezeAmount = FreezeAmount;
    }

    /**
     * Get Overdue amount in cents, which is when the available credit balance is negative. 
     * @return OweAmount Overdue amount in cents, which is when the available credit balance is negative.
     */
    public Float getOweAmount() {
        return this.OweAmount;
    }

    /**
     * Set Overdue amount in cents, which is when the available credit balance is negative.
     * @param OweAmount Overdue amount in cents, which is when the available credit balance is negative.
     */
    public void setOweAmount(Float OweAmount) {
        this.OweAmount = OweAmount;
    }

    /**
     * Get Whether overdue payments are allowed. Currently, this field is not applied. 
     * @return IsAllowArrears Whether overdue payments are allowed. Currently, this field is not applied.
     */
    public Boolean getIsAllowArrears() {
        return this.IsAllowArrears;
    }

    /**
     * Set Whether overdue payments are allowed. Currently, this field is not applied.
     * @param IsAllowArrears Whether overdue payments are allowed. Currently, this field is not applied.
     */
    public void setIsAllowArrears(Boolean IsAllowArrears) {
        this.IsAllowArrears = IsAllowArrears;
    }

    /**
     * Get Whether you have a credit limit. Currently, this field is not applied. 
     * @return IsCreditLimited Whether you have a credit limit. Currently, this field is not applied.
     */
    public Boolean getIsCreditLimited() {
        return this.IsCreditLimited;
    }

    /**
     * Set Whether you have a credit limit. Currently, this field is not applied.
     * @param IsCreditLimited Whether you have a credit limit. Currently, this field is not applied.
     */
    public void setIsCreditLimited(Boolean IsCreditLimited) {
        this.IsCreditLimited = IsCreditLimited;
    }

    /**
     * Get Credit limit in cents. Credit limit－available credit balance = consumption amount 
     * @return CreditAmount Credit limit in cents. Credit limit－available credit balance = consumption amount
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set Credit limit in cents. Credit limit－available credit balance = consumption amount
     * @param CreditAmount Credit limit in cents. Credit limit－available credit balance = consumption amount
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get Available credit balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `RealCreditBalance`. 
     * @return CreditBalance Available credit balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `RealCreditBalance`.
     */
    public Float getCreditBalance() {
        return this.CreditBalance;
    }

    /**
     * Set Available credit balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `RealCreditBalance`.
     * @param CreditBalance Available credit balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `RealCreditBalance`.
     */
    public void setCreditBalance(Float CreditBalance) {
        this.CreditBalance = CreditBalance;
    }

    /**
     * Get Available account balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `CreditBalance`. 
     * @return RealCreditBalance Available account balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `CreditBalance`.
     */
    public Float getRealCreditBalance() {
        return this.RealCreditBalance;
    }

    /**
     * Set Available account balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `CreditBalance`.
     * @param RealCreditBalance Available account balance in cents, which takes the same calculation rules as `Balance`, `RealBalance`, and `CreditBalance`.
     */
    public void setRealCreditBalance(Float RealCreditBalance) {
        this.RealCreditBalance = RealCreditBalance;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccountBalanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountBalanceResponse(DescribeAccountBalanceResponse source) {
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RealBalance != null) {
            this.RealBalance = new Float(source.RealBalance);
        }
        if (source.CashAccountBalance != null) {
            this.CashAccountBalance = new Float(source.CashAccountBalance);
        }
        if (source.IncomeIntoAccountBalance != null) {
            this.IncomeIntoAccountBalance = new Float(source.IncomeIntoAccountBalance);
        }
        if (source.PresentAccountBalance != null) {
            this.PresentAccountBalance = new Float(source.PresentAccountBalance);
        }
        if (source.FreezeAmount != null) {
            this.FreezeAmount = new Float(source.FreezeAmount);
        }
        if (source.OweAmount != null) {
            this.OweAmount = new Float(source.OweAmount);
        }
        if (source.IsAllowArrears != null) {
            this.IsAllowArrears = new Boolean(source.IsAllowArrears);
        }
        if (source.IsCreditLimited != null) {
            this.IsCreditLimited = new Boolean(source.IsCreditLimited);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
        if (source.CreditBalance != null) {
            this.CreditBalance = new Float(source.CreditBalance);
        }
        if (source.RealCreditBalance != null) {
            this.RealCreditBalance = new Float(source.RealCreditBalance);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RealBalance", this.RealBalance);
        this.setParamSimple(map, prefix + "CashAccountBalance", this.CashAccountBalance);
        this.setParamSimple(map, prefix + "IncomeIntoAccountBalance", this.IncomeIntoAccountBalance);
        this.setParamSimple(map, prefix + "PresentAccountBalance", this.PresentAccountBalance);
        this.setParamSimple(map, prefix + "FreezeAmount", this.FreezeAmount);
        this.setParamSimple(map, prefix + "OweAmount", this.OweAmount);
        this.setParamSimple(map, prefix + "IsAllowArrears", this.IsAllowArrears);
        this.setParamSimple(map, prefix + "IsCreditLimited", this.IsCreditLimited);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);
        this.setParamSimple(map, prefix + "CreditBalance", this.CreditBalance);
        this.setParamSimple(map, prefix + "RealCreditBalance", this.RealCreditBalance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

