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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerBillSummaryRequest extends AbstractModel {

    /**
    * <p>Sub-customer uin</p>
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
    * <p>Inquiry month, in the format of YYYY-MM, such as 2023-01</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>Billing mode</p><p>Enumeration values:</p><ul><li>prePay: yearly/monthly subscription</li><li>postPay: Pay-As-You-Go resources</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Transaction type</p><p>Enumeration values:</p><ul><li>prepay_purchase: Purchase</li><li>prepay_renew: Renewal</li><li>prepay_modify: Upgrade/Downgrade</li><li>prepay_return: yearly/monthly subscription refund</li><li>postpay_deduct: Pay-as-you-go</li><li>postpay_deduct_h: Hourly settlement</li><li>postpay_deduct_d: Daily settlement</li><li>postpay_deduct_m: Monthly settlement</li><li>offline_deduct: Offline project deduction</li><li>online_deduct: Offline product deduction</li><li>recon_deduct: Adjustment - deduction</li><li>ripay_purchase: One-off RI Fee</li><li>postpay_deduct_s: Spot</li><li>ri_hour_pay: Hourly RI fee</li><li>prePurchase: New yearly/monthly subscription</li><li>preRenew: yearly/monthly subscription renewal</li><li>preUpgrade: Upgrade/Downgrade</li></ul>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>Payment Status<br>0: case-insensitive<br>1: paid<br>2: unpaid</p>
    */
    @SerializedName("IsConfirmed")
    @Expose
    private String IsConfirmed;

    /**
     * Get <p>Sub-customer uin</p> 
     * @return CustomerUin <p>Sub-customer uin</p>
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set <p>Sub-customer uin</p>
     * @param CustomerUin <p>Sub-customer uin</p>
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get <p>Inquiry month, in the format of YYYY-MM, such as 2023-01</p> 
     * @return Month <p>Inquiry month, in the format of YYYY-MM, such as 2023-01</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>Inquiry month, in the format of YYYY-MM, such as 2023-01</p>
     * @param Month <p>Inquiry month, in the format of YYYY-MM, such as 2023-01</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration values:</p><ul><li>prePay: yearly/monthly subscription</li><li>postPay: Pay-As-You-Go resources</li></ul> 
     * @return PayMode <p>Billing mode</p><p>Enumeration values:</p><ul><li>prePay: yearly/monthly subscription</li><li>postPay: Pay-As-You-Go resources</li></ul>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration values:</p><ul><li>prePay: yearly/monthly subscription</li><li>postPay: Pay-As-You-Go resources</li></ul>
     * @param PayMode <p>Billing mode</p><p>Enumeration values:</p><ul><li>prePay: yearly/monthly subscription</li><li>postPay: Pay-As-You-Go resources</li></ul>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Transaction type</p><p>Enumeration values:</p><ul><li>prepay_purchase: Purchase</li><li>prepay_renew: Renewal</li><li>prepay_modify: Upgrade/Downgrade</li><li>prepay_return: yearly/monthly subscription refund</li><li>postpay_deduct: Pay-as-you-go</li><li>postpay_deduct_h: Hourly settlement</li><li>postpay_deduct_d: Daily settlement</li><li>postpay_deduct_m: Monthly settlement</li><li>offline_deduct: Offline project deduction</li><li>online_deduct: Offline product deduction</li><li>recon_deduct: Adjustment - deduction</li><li>ripay_purchase: One-off RI Fee</li><li>postpay_deduct_s: Spot</li><li>ri_hour_pay: Hourly RI fee</li><li>prePurchase: New yearly/monthly subscription</li><li>preRenew: yearly/monthly subscription renewal</li><li>preUpgrade: Upgrade/Downgrade</li></ul> 
     * @return ActionType <p>Transaction type</p><p>Enumeration values:</p><ul><li>prepay_purchase: Purchase</li><li>prepay_renew: Renewal</li><li>prepay_modify: Upgrade/Downgrade</li><li>prepay_return: yearly/monthly subscription refund</li><li>postpay_deduct: Pay-as-you-go</li><li>postpay_deduct_h: Hourly settlement</li><li>postpay_deduct_d: Daily settlement</li><li>postpay_deduct_m: Monthly settlement</li><li>offline_deduct: Offline project deduction</li><li>online_deduct: Offline product deduction</li><li>recon_deduct: Adjustment - deduction</li><li>ripay_purchase: One-off RI Fee</li><li>postpay_deduct_s: Spot</li><li>ri_hour_pay: Hourly RI fee</li><li>prePurchase: New yearly/monthly subscription</li><li>preRenew: yearly/monthly subscription renewal</li><li>preUpgrade: Upgrade/Downgrade</li></ul>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>Transaction type</p><p>Enumeration values:</p><ul><li>prepay_purchase: Purchase</li><li>prepay_renew: Renewal</li><li>prepay_modify: Upgrade/Downgrade</li><li>prepay_return: yearly/monthly subscription refund</li><li>postpay_deduct: Pay-as-you-go</li><li>postpay_deduct_h: Hourly settlement</li><li>postpay_deduct_d: Daily settlement</li><li>postpay_deduct_m: Monthly settlement</li><li>offline_deduct: Offline project deduction</li><li>online_deduct: Offline product deduction</li><li>recon_deduct: Adjustment - deduction</li><li>ripay_purchase: One-off RI Fee</li><li>postpay_deduct_s: Spot</li><li>ri_hour_pay: Hourly RI fee</li><li>prePurchase: New yearly/monthly subscription</li><li>preRenew: yearly/monthly subscription renewal</li><li>preUpgrade: Upgrade/Downgrade</li></ul>
     * @param ActionType <p>Transaction type</p><p>Enumeration values:</p><ul><li>prepay_purchase: Purchase</li><li>prepay_renew: Renewal</li><li>prepay_modify: Upgrade/Downgrade</li><li>prepay_return: yearly/monthly subscription refund</li><li>postpay_deduct: Pay-as-you-go</li><li>postpay_deduct_h: Hourly settlement</li><li>postpay_deduct_d: Daily settlement</li><li>postpay_deduct_m: Monthly settlement</li><li>offline_deduct: Offline project deduction</li><li>online_deduct: Offline product deduction</li><li>recon_deduct: Adjustment - deduction</li><li>ripay_purchase: One-off RI Fee</li><li>postpay_deduct_s: Spot</li><li>ri_hour_pay: Hourly RI fee</li><li>prePurchase: New yearly/monthly subscription</li><li>preRenew: yearly/monthly subscription renewal</li><li>preUpgrade: Upgrade/Downgrade</li></ul>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>Payment Status<br>0: case-insensitive<br>1: paid<br>2: unpaid</p> 
     * @return IsConfirmed <p>Payment Status<br>0: case-insensitive<br>1: paid<br>2: unpaid</p>
     */
    public String getIsConfirmed() {
        return this.IsConfirmed;
    }

    /**
     * Set <p>Payment Status<br>0: case-insensitive<br>1: paid<br>2: unpaid</p>
     * @param IsConfirmed <p>Payment Status<br>0: case-insensitive<br>1: paid<br>2: unpaid</p>
     */
    public void setIsConfirmed(String IsConfirmed) {
        this.IsConfirmed = IsConfirmed;
    }

    public DescribeCustomerBillSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerBillSummaryRequest(DescribeCustomerBillSummaryRequest source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.IsConfirmed != null) {
            this.IsConfirmed = new String(source.IsConfirmed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "IsConfirmed", this.IsConfirmed);

    }
}

