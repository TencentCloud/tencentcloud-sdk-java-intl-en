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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerBillDetailRequest extends AbstractModel {

    /**
    * Sub-account UIN.
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
    * Inquiry month, in the format of YYYY-MM, such as 2023-01.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Page parameter: number of entries per page. Value range: [1, 200]
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page parameter: current page number. The minimum value is 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Billing mode. Valid values:
prePay (Monthly subscription)
postPay (Pay-As-You-Go resources)
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Transaction type. Valid values:
prepay_purchase (Purchase)
prepay_renew (Renewal)
prepay_modify (Upgrade/Downgrade)
prepay_return ( Monthly subscription refund)
postpay_deduct (Pay-as-you-go)
postpay_deduct_h (Hourly settlement)
postpay_deduct_d (Daily settlement)
postpay_deduct_m (Monthly settlement)
offline_deduct (Offline project deduction)
online_deduct (Offline product deduction)
recon_deduct (Adjustment - deduction)
recon_increase (Adjustment - compensation)
ripay_purchase (One-off RI Fee)
postpay_deduct_s (Spot)
ri_hour_pay (Hourly RI fee)
prePurchase (New monthly subscription)
preRenew (Monthly subscription renewal)
preUpgrade (Upgrade/Downgrade)
preDowngrade (Upgrade/Downgrade)
svp_hour_pay (Hourly Savings Plan fee)
recon_guarantee (Minimum spend deduction)
pre_purchase (New monthly subscription)
pre_renew (Monthly subscription renewal)
pre_upgrade (Upgrade/Downgrade)
pre_downgrade (Upgrade/Downgrade)
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Payment status
0: not distinguished
1: paid
2: unpaid
    */
    @SerializedName("IsConfirmed")
    @Expose
    private String IsConfirmed;

    /**
     * Get Sub-account UIN. 
     * @return CustomerUin Sub-account UIN.
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Sub-account UIN.
     * @param CustomerUin Sub-account UIN.
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Inquiry month, in the format of YYYY-MM, such as 2023-01. 
     * @return Month Inquiry month, in the format of YYYY-MM, such as 2023-01.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Inquiry month, in the format of YYYY-MM, such as 2023-01.
     * @param Month Inquiry month, in the format of YYYY-MM, such as 2023-01.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Page parameter: number of entries per page. Value range: [1, 200] 
     * @return PageSize Page parameter: number of entries per page. Value range: [1, 200]
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page parameter: number of entries per page. Value range: [1, 200]
     * @param PageSize Page parameter: number of entries per page. Value range: [1, 200]
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page parameter: current page number. The minimum value is 1. 
     * @return Page Page parameter: current page number. The minimum value is 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page parameter: current page number. The minimum value is 1.
     * @param Page Page parameter: current page number. The minimum value is 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Billing mode. Valid values:
prePay (Monthly subscription)
postPay (Pay-As-You-Go resources) 
     * @return PayMode Billing mode. Valid values:
prePay (Monthly subscription)
postPay (Pay-As-You-Go resources)
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values:
prePay (Monthly subscription)
postPay (Pay-As-You-Go resources)
     * @param PayMode Billing mode. Valid values:
prePay (Monthly subscription)
postPay (Pay-As-You-Go resources)
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Transaction type. Valid values:
prepay_purchase (Purchase)
prepay_renew (Renewal)
prepay_modify (Upgrade/Downgrade)
prepay_return ( Monthly subscription refund)
postpay_deduct (Pay-as-you-go)
postpay_deduct_h (Hourly settlement)
postpay_deduct_d (Daily settlement)
postpay_deduct_m (Monthly settlement)
offline_deduct (Offline project deduction)
online_deduct (Offline product deduction)
recon_deduct (Adjustment - deduction)
recon_increase (Adjustment - compensation)
ripay_purchase (One-off RI Fee)
postpay_deduct_s (Spot)
ri_hour_pay (Hourly RI fee)
prePurchase (New monthly subscription)
preRenew (Monthly subscription renewal)
preUpgrade (Upgrade/Downgrade)
preDowngrade (Upgrade/Downgrade)
svp_hour_pay (Hourly Savings Plan fee)
recon_guarantee (Minimum spend deduction)
pre_purchase (New monthly subscription)
pre_renew (Monthly subscription renewal)
pre_upgrade (Upgrade/Downgrade)
pre_downgrade (Upgrade/Downgrade) 
     * @return ActionType Transaction type. Valid values:
prepay_purchase (Purchase)
prepay_renew (Renewal)
prepay_modify (Upgrade/Downgrade)
prepay_return ( Monthly subscription refund)
postpay_deduct (Pay-as-you-go)
postpay_deduct_h (Hourly settlement)
postpay_deduct_d (Daily settlement)
postpay_deduct_m (Monthly settlement)
offline_deduct (Offline project deduction)
online_deduct (Offline product deduction)
recon_deduct (Adjustment - deduction)
recon_increase (Adjustment - compensation)
ripay_purchase (One-off RI Fee)
postpay_deduct_s (Spot)
ri_hour_pay (Hourly RI fee)
prePurchase (New monthly subscription)
preRenew (Monthly subscription renewal)
preUpgrade (Upgrade/Downgrade)
preDowngrade (Upgrade/Downgrade)
svp_hour_pay (Hourly Savings Plan fee)
recon_guarantee (Minimum spend deduction)
pre_purchase (New monthly subscription)
pre_renew (Monthly subscription renewal)
pre_upgrade (Upgrade/Downgrade)
pre_downgrade (Upgrade/Downgrade)
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Transaction type. Valid values:
prepay_purchase (Purchase)
prepay_renew (Renewal)
prepay_modify (Upgrade/Downgrade)
prepay_return ( Monthly subscription refund)
postpay_deduct (Pay-as-you-go)
postpay_deduct_h (Hourly settlement)
postpay_deduct_d (Daily settlement)
postpay_deduct_m (Monthly settlement)
offline_deduct (Offline project deduction)
online_deduct (Offline product deduction)
recon_deduct (Adjustment - deduction)
recon_increase (Adjustment - compensation)
ripay_purchase (One-off RI Fee)
postpay_deduct_s (Spot)
ri_hour_pay (Hourly RI fee)
prePurchase (New monthly subscription)
preRenew (Monthly subscription renewal)
preUpgrade (Upgrade/Downgrade)
preDowngrade (Upgrade/Downgrade)
svp_hour_pay (Hourly Savings Plan fee)
recon_guarantee (Minimum spend deduction)
pre_purchase (New monthly subscription)
pre_renew (Monthly subscription renewal)
pre_upgrade (Upgrade/Downgrade)
pre_downgrade (Upgrade/Downgrade)
     * @param ActionType Transaction type. Valid values:
prepay_purchase (Purchase)
prepay_renew (Renewal)
prepay_modify (Upgrade/Downgrade)
prepay_return ( Monthly subscription refund)
postpay_deduct (Pay-as-you-go)
postpay_deduct_h (Hourly settlement)
postpay_deduct_d (Daily settlement)
postpay_deduct_m (Monthly settlement)
offline_deduct (Offline project deduction)
online_deduct (Offline product deduction)
recon_deduct (Adjustment - deduction)
recon_increase (Adjustment - compensation)
ripay_purchase (One-off RI Fee)
postpay_deduct_s (Spot)
ri_hour_pay (Hourly RI fee)
prePurchase (New monthly subscription)
preRenew (Monthly subscription renewal)
preUpgrade (Upgrade/Downgrade)
preDowngrade (Upgrade/Downgrade)
svp_hour_pay (Hourly Savings Plan fee)
recon_guarantee (Minimum spend deduction)
pre_purchase (New monthly subscription)
pre_renew (Monthly subscription renewal)
pre_upgrade (Upgrade/Downgrade)
pre_downgrade (Upgrade/Downgrade)
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Payment status
0: not distinguished
1: paid
2: unpaid 
     * @return IsConfirmed Payment status
0: not distinguished
1: paid
2: unpaid
     */
    public String getIsConfirmed() {
        return this.IsConfirmed;
    }

    /**
     * Set Payment status
0: not distinguished
1: paid
2: unpaid
     * @param IsConfirmed Payment status
0: not distinguished
1: paid
2: unpaid
     */
    public void setIsConfirmed(String IsConfirmed) {
        this.IsConfirmed = IsConfirmed;
    }

    public DescribeCustomerBillDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerBillDetailRequest(DescribeCustomerBillDetailRequest source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
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
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "IsConfirmed", this.IsConfirmed);

    }
}

