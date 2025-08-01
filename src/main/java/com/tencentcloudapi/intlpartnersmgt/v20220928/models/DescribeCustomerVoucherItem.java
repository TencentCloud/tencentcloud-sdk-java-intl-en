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

public class DescribeCustomerVoucherItem extends AbstractModel {

    /**
    * Voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private Long VoucherId;

    /**
    * Sub-account UIN
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
    * Voucher status: Issued/Used/Expired/Invalidated.
    */
    @SerializedName("VoucherStatus")
    @Expose
    private String VoucherStatus;

    /**
    * Remaining amount.
    */
    @SerializedName("RemainingAmount")
    @Expose
    private Float RemainingAmount;

    /**
    * Denomination.
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * Purpose: ProductTrial/CustomerOffer.
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Payment mode. valid values: AllPayment, Prepaid, and Postpaid.
    */
    @SerializedName("PaymentMode")
    @Expose
    private String PaymentMode;

    /**
    * Applicable product: AllProducts/SpecifyProducts/SpecifyProductsBlacklist.
    */
    @SerializedName("ProductScope")
    @Expose
    private String ProductScope;

    /**
    * Start time.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * End time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Application notes
    */
    @SerializedName("ApplyReason")
    @Expose
    private String ApplyReason;

    /**
     * Get Voucher ID. 
     * @return VoucherId Voucher ID.
     */
    public Long getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set Voucher ID.
     * @param VoucherId Voucher ID.
     */
    public void setVoucherId(Long VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get Sub-account UIN 
     * @return CustomerUin Sub-account UIN
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Sub-account UIN
     * @param CustomerUin Sub-account UIN
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Voucher status: Issued/Used/Expired/Invalidated. 
     * @return VoucherStatus Voucher status: Issued/Used/Expired/Invalidated.
     */
    public String getVoucherStatus() {
        return this.VoucherStatus;
    }

    /**
     * Set Voucher status: Issued/Used/Expired/Invalidated.
     * @param VoucherStatus Voucher status: Issued/Used/Expired/Invalidated.
     */
    public void setVoucherStatus(String VoucherStatus) {
        this.VoucherStatus = VoucherStatus;
    }

    /**
     * Get Remaining amount. 
     * @return RemainingAmount Remaining amount.
     */
    public Float getRemainingAmount() {
        return this.RemainingAmount;
    }

    /**
     * Set Remaining amount.
     * @param RemainingAmount Remaining amount.
     */
    public void setRemainingAmount(Float RemainingAmount) {
        this.RemainingAmount = RemainingAmount;
    }

    /**
     * Get Denomination. 
     * @return TotalAmount Denomination.
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set Denomination.
     * @param TotalAmount Denomination.
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get Purpose: ProductTrial/CustomerOffer. 
     * @return Usage Purpose: ProductTrial/CustomerOffer.
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set Purpose: ProductTrial/CustomerOffer.
     * @param Usage Purpose: ProductTrial/CustomerOffer.
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Payment mode. valid values: AllPayment, Prepaid, and Postpaid. 
     * @return PaymentMode Payment mode. valid values: AllPayment, Prepaid, and Postpaid.
     */
    public String getPaymentMode() {
        return this.PaymentMode;
    }

    /**
     * Set Payment mode. valid values: AllPayment, Prepaid, and Postpaid.
     * @param PaymentMode Payment mode. valid values: AllPayment, Prepaid, and Postpaid.
     */
    public void setPaymentMode(String PaymentMode) {
        this.PaymentMode = PaymentMode;
    }

    /**
     * Get Applicable product: AllProducts/SpecifyProducts/SpecifyProductsBlacklist. 
     * @return ProductScope Applicable product: AllProducts/SpecifyProducts/SpecifyProductsBlacklist.
     */
    public String getProductScope() {
        return this.ProductScope;
    }

    /**
     * Set Applicable product: AllProducts/SpecifyProducts/SpecifyProductsBlacklist.
     * @param ProductScope Applicable product: AllProducts/SpecifyProducts/SpecifyProductsBlacklist.
     */
    public void setProductScope(String ProductScope) {
        this.ProductScope = ProductScope;
    }

    /**
     * Get Start time. 
     * @return EffectiveTime Start time.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Start time.
     * @param EffectiveTime Start time.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get End time. 
     * @return ExpireTime End time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set End time.
     * @param ExpireTime End time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Application notes 
     * @return ApplyReason Application notes
     */
    public String getApplyReason() {
        return this.ApplyReason;
    }

    /**
     * Set Application notes
     * @param ApplyReason Application notes
     */
    public void setApplyReason(String ApplyReason) {
        this.ApplyReason = ApplyReason;
    }

    public DescribeCustomerVoucherItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerVoucherItem(DescribeCustomerVoucherItem source) {
        if (source.VoucherId != null) {
            this.VoucherId = new Long(source.VoucherId);
        }
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
        if (source.VoucherStatus != null) {
            this.VoucherStatus = new String(source.VoucherStatus);
        }
        if (source.RemainingAmount != null) {
            this.RemainingAmount = new Float(source.RemainingAmount);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Float(source.TotalAmount);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.PaymentMode != null) {
            this.PaymentMode = new String(source.PaymentMode);
        }
        if (source.ProductScope != null) {
            this.ProductScope = new String(source.ProductScope);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ApplyReason != null) {
            this.ApplyReason = new String(source.ApplyReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "VoucherStatus", this.VoucherStatus);
        this.setParamSimple(map, prefix + "RemainingAmount", this.RemainingAmount);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "PaymentMode", this.PaymentMode);
        this.setParamSimple(map, prefix + "ProductScope", this.ProductScope);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ApplyReason", this.ApplyReason);

    }
}

