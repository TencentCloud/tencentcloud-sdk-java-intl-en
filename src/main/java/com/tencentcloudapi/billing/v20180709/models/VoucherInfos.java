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

public class VoucherInfos extends AbstractModel{

    /**
    * The owner of the voucher.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * The status of the voucher: `unUsed`, `used`, `delivered`, `cancel`, `overdue`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The value of the voucher. The value of this parameter is the voucher value (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("NominalValue")
    @Expose
    private Long NominalValue;

    /**
    * The balance left. The value of this parameter is the balance left (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * The voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * If `PayMode` is `postPay`, this parameter may be `spotpay` (spot instance) or `settle account` (regular pay-as-you-go). If `PayMode` is `prePay`, this parameter may be `purchase`, `renew`, or `modify` (downgrade/upgrade). If `PayMode` is `riPay`, this parameter may be `oneOffFee` (prepayment of reserved instance) or `hourlyFee` (hourly billing of reserved instance). `*` means to query vouchers that support all billing scenarios.
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * The start time of the validity period.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the validity period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The products that are applicable.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ApplicableProducts")
    @Expose
    private ApplicableProducts ApplicableProducts;

    /**
    * The products that are not applicable.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ExcludedProducts")
    @Expose
    private ExcludedProducts [] ExcludedProducts;

    /**
     * Get The owner of the voucher. 
     * @return OwnerUin The owner of the voucher.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set The owner of the voucher.
     * @param OwnerUin The owner of the voucher.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get The status of the voucher: `unUsed`, `used`, `delivered`, `cancel`, `overdue` 
     * @return Status The status of the voucher: `unUsed`, `used`, `delivered`, `cancel`, `overdue`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the voucher: `unUsed`, `used`, `delivered`, `cancel`, `overdue`
     * @param Status The status of the voucher: `unUsed`, `used`, `delivered`, `cancel`, `overdue`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The value of the voucher. The value of this parameter is the voucher value (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return NominalValue The value of the voucher. The value of this parameter is the voucher value (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getNominalValue() {
        return this.NominalValue;
    }

    /**
     * Set The value of the voucher. The value of this parameter is the voucher value (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param NominalValue The value of the voucher. The value of this parameter is the voucher value (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setNominalValue(Long NominalValue) {
        this.NominalValue = NominalValue;
    }

    /**
     * Get The balance left. The value of this parameter is the balance left (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return Balance The balance left. The value of this parameter is the balance left (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set The balance left. The value of this parameter is the balance left (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param Balance The balance left. The value of this parameter is the balance left (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get The voucher ID. 
     * @return VoucherId The voucher ID.
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set The voucher ID.
     * @param VoucherId The voucher ID.
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. 
     * @return PayMode `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all.
     * @param PayMode `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get If `PayMode` is `postPay`, this parameter may be `spotpay` (spot instance) or `settle account` (regular pay-as-you-go). If `PayMode` is `prePay`, this parameter may be `purchase`, `renew`, or `modify` (downgrade/upgrade). If `PayMode` is `riPay`, this parameter may be `oneOffFee` (prepayment of reserved instance) or `hourlyFee` (hourly billing of reserved instance). `*` means to query vouchers that support all billing scenarios. 
     * @return PayScene If `PayMode` is `postPay`, this parameter may be `spotpay` (spot instance) or `settle account` (regular pay-as-you-go). If `PayMode` is `prePay`, this parameter may be `purchase`, `renew`, or `modify` (downgrade/upgrade). If `PayMode` is `riPay`, this parameter may be `oneOffFee` (prepayment of reserved instance) or `hourlyFee` (hourly billing of reserved instance). `*` means to query vouchers that support all billing scenarios.
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set If `PayMode` is `postPay`, this parameter may be `spotpay` (spot instance) or `settle account` (regular pay-as-you-go). If `PayMode` is `prePay`, this parameter may be `purchase`, `renew`, or `modify` (downgrade/upgrade). If `PayMode` is `riPay`, this parameter may be `oneOffFee` (prepayment of reserved instance) or `hourlyFee` (hourly billing of reserved instance). `*` means to query vouchers that support all billing scenarios.
     * @param PayScene If `PayMode` is `postPay`, this parameter may be `spotpay` (spot instance) or `settle account` (regular pay-as-you-go). If `PayMode` is `prePay`, this parameter may be `purchase`, `renew`, or `modify` (downgrade/upgrade). If `PayMode` is `riPay`, this parameter may be `oneOffFee` (prepayment of reserved instance) or `hourlyFee` (hourly billing of reserved instance). `*` means to query vouchers that support all billing scenarios.
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get The start time of the validity period. 
     * @return BeginTime The start time of the validity period.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the validity period.
     * @param BeginTime The start time of the validity period.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the validity period. 
     * @return EndTime The end time of the validity period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the validity period.
     * @param EndTime The end time of the validity period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The products that are applicable.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ApplicableProducts The products that are applicable.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ApplicableProducts getApplicableProducts() {
        return this.ApplicableProducts;
    }

    /**
     * Set The products that are applicable.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ApplicableProducts The products that are applicable.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setApplicableProducts(ApplicableProducts ApplicableProducts) {
        this.ApplicableProducts = ApplicableProducts;
    }

    /**
     * Get The products that are not applicable.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ExcludedProducts The products that are not applicable.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ExcludedProducts [] getExcludedProducts() {
        return this.ExcludedProducts;
    }

    /**
     * Set The products that are not applicable.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ExcludedProducts The products that are not applicable.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setExcludedProducts(ExcludedProducts [] ExcludedProducts) {
        this.ExcludedProducts = ExcludedProducts;
    }

    public VoucherInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoucherInfos(VoucherInfos source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NominalValue != null) {
            this.NominalValue = new Long(source.NominalValue);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ApplicableProducts != null) {
            this.ApplicableProducts = new ApplicableProducts(source.ApplicableProducts);
        }
        if (source.ExcludedProducts != null) {
            this.ExcludedProducts = new ExcludedProducts[source.ExcludedProducts.length];
            for (int i = 0; i < source.ExcludedProducts.length; i++) {
                this.ExcludedProducts[i] = new ExcludedProducts(source.ExcludedProducts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NominalValue", this.NominalValue);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "ApplicableProducts.", this.ApplicableProducts);
        this.setParamArrayObj(map, prefix + "ExcludedProducts.", this.ExcludedProducts);

    }
}

