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

public class DescribeOrgMemberAccountBalanceData extends AbstractModel {

    /**
    * <p>Member account Uin</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
    * <p>Member name</p>
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * <p>Whether it is a credit account</p>
    */
    @SerializedName("IsCreditAccount")
    @Expose
    private Boolean IsCreditAccount;

    /**
    * <p>Current actual available balance</p><p>Unit: cent</p>
    */
    @SerializedName("RealBalance")
    @Expose
    private Float RealBalance;

    /**
    * <p>Cash account balance</p><p>Unit: cent</p>
    */
    @SerializedName("CashAccountBalance")
    @Expose
    private Float CashAccountBalance;

    /**
    * <p>Credit limit</p><p>Unit: cent</p><p>Credit limit = Basic credit limit + Temporary credit limit</p>
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * <p>Temporary credit limit</p><p>Unit: cent</p>
    */
    @SerializedName("TempCredit")
    @Expose
    private Float TempCredit;

    /**
    * <p>Basic credit limit</p><p>Unit: cent</p>
    */
    @SerializedName("BasicCreditAmount")
    @Expose
    private Float BasicCreditAmount;

    /**
    * <p>Overdue payments</p><p>Unit: cent</p>
    */
    @SerializedName("OweAmount")
    @Expose
    private Float OweAmount;

    /**
     * Get <p>Member account Uin</p> 
     * @return MemberUin <p>Member account Uin</p>
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>Member account Uin</p>
     * @param MemberUin <p>Member account Uin</p>
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get <p>Member name</p> 
     * @return MemberName <p>Member name</p>
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set <p>Member name</p>
     * @param MemberName <p>Member name</p>
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get <p>Whether it is a credit account</p> 
     * @return IsCreditAccount <p>Whether it is a credit account</p>
     */
    public Boolean getIsCreditAccount() {
        return this.IsCreditAccount;
    }

    /**
     * Set <p>Whether it is a credit account</p>
     * @param IsCreditAccount <p>Whether it is a credit account</p>
     */
    public void setIsCreditAccount(Boolean IsCreditAccount) {
        this.IsCreditAccount = IsCreditAccount;
    }

    /**
     * Get <p>Current actual available balance</p><p>Unit: cent</p> 
     * @return RealBalance <p>Current actual available balance</p><p>Unit: cent</p>
     */
    public Float getRealBalance() {
        return this.RealBalance;
    }

    /**
     * Set <p>Current actual available balance</p><p>Unit: cent</p>
     * @param RealBalance <p>Current actual available balance</p><p>Unit: cent</p>
     */
    public void setRealBalance(Float RealBalance) {
        this.RealBalance = RealBalance;
    }

    /**
     * Get <p>Cash account balance</p><p>Unit: cent</p> 
     * @return CashAccountBalance <p>Cash account balance</p><p>Unit: cent</p>
     */
    public Float getCashAccountBalance() {
        return this.CashAccountBalance;
    }

    /**
     * Set <p>Cash account balance</p><p>Unit: cent</p>
     * @param CashAccountBalance <p>Cash account balance</p><p>Unit: cent</p>
     */
    public void setCashAccountBalance(Float CashAccountBalance) {
        this.CashAccountBalance = CashAccountBalance;
    }

    /**
     * Get <p>Credit limit</p><p>Unit: cent</p><p>Credit limit = Basic credit limit + Temporary credit limit</p> 
     * @return CreditAmount <p>Credit limit</p><p>Unit: cent</p><p>Credit limit = Basic credit limit + Temporary credit limit</p>
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set <p>Credit limit</p><p>Unit: cent</p><p>Credit limit = Basic credit limit + Temporary credit limit</p>
     * @param CreditAmount <p>Credit limit</p><p>Unit: cent</p><p>Credit limit = Basic credit limit + Temporary credit limit</p>
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get <p>Temporary credit limit</p><p>Unit: cent</p> 
     * @return TempCredit <p>Temporary credit limit</p><p>Unit: cent</p>
     */
    public Float getTempCredit() {
        return this.TempCredit;
    }

    /**
     * Set <p>Temporary credit limit</p><p>Unit: cent</p>
     * @param TempCredit <p>Temporary credit limit</p><p>Unit: cent</p>
     */
    public void setTempCredit(Float TempCredit) {
        this.TempCredit = TempCredit;
    }

    /**
     * Get <p>Basic credit limit</p><p>Unit: cent</p> 
     * @return BasicCreditAmount <p>Basic credit limit</p><p>Unit: cent</p>
     */
    public Float getBasicCreditAmount() {
        return this.BasicCreditAmount;
    }

    /**
     * Set <p>Basic credit limit</p><p>Unit: cent</p>
     * @param BasicCreditAmount <p>Basic credit limit</p><p>Unit: cent</p>
     */
    public void setBasicCreditAmount(Float BasicCreditAmount) {
        this.BasicCreditAmount = BasicCreditAmount;
    }

    /**
     * Get <p>Overdue payments</p><p>Unit: cent</p> 
     * @return OweAmount <p>Overdue payments</p><p>Unit: cent</p>
     */
    public Float getOweAmount() {
        return this.OweAmount;
    }

    /**
     * Set <p>Overdue payments</p><p>Unit: cent</p>
     * @param OweAmount <p>Overdue payments</p><p>Unit: cent</p>
     */
    public void setOweAmount(Float OweAmount) {
        this.OweAmount = OweAmount;
    }

    public DescribeOrgMemberAccountBalanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgMemberAccountBalanceData(DescribeOrgMemberAccountBalanceData source) {
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.IsCreditAccount != null) {
            this.IsCreditAccount = new Boolean(source.IsCreditAccount);
        }
        if (source.RealBalance != null) {
            this.RealBalance = new Float(source.RealBalance);
        }
        if (source.CashAccountBalance != null) {
            this.CashAccountBalance = new Float(source.CashAccountBalance);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
        if (source.TempCredit != null) {
            this.TempCredit = new Float(source.TempCredit);
        }
        if (source.BasicCreditAmount != null) {
            this.BasicCreditAmount = new Float(source.BasicCreditAmount);
        }
        if (source.OweAmount != null) {
            this.OweAmount = new Float(source.OweAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "IsCreditAccount", this.IsCreditAccount);
        this.setParamSimple(map, prefix + "RealBalance", this.RealBalance);
        this.setParamSimple(map, prefix + "CashAccountBalance", this.CashAccountBalance);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);
        this.setParamSimple(map, prefix + "TempCredit", this.TempCredit);
        this.setParamSimple(map, prefix + "BasicCreditAmount", this.BasicCreditAmount);
        this.setParamSimple(map, prefix + "OweAmount", this.OweAmount);

    }
}

