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

public class DescribeCustomerVoucherListRequest extends AbstractModel {

    /**
    * Page number, starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of items per page. value range: 1-100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Customer UIN.
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
    * Voucher status. valid values: Issued, Used, Expired, Invalidated.
    */
    @SerializedName("VoucherStatus")
    @Expose
    private String VoucherStatus;

    /**
    * Payment mode. valid values: AllPayment, Prepaid, Postpaid.
    */
    @SerializedName("PaymentMode")
    @Expose
    private String PaymentMode;

    /**
    * valid values: ProductTrial, CustomerOffer.
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Applicable product. valid values: AllProducts, SpecifyProducts, SpecifyProductsBlacklist.
    */
    @SerializedName("ProductScope")
    @Expose
    private String ProductScope;

    /**
    * Voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private Long VoucherId;

    /**
     * Get Page number, starts from 1. 
     * @return Page Page number, starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, starts from 1.
     * @param Page Page number, starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of items per page. value range: 1-100. 
     * @return PageSize Number of items per page. value range: 1-100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. value range: 1-100.
     * @param PageSize Number of items per page. value range: 1-100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Customer UIN. 
     * @return CustomerUin Customer UIN.
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Customer UIN.
     * @param CustomerUin Customer UIN.
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Voucher status. valid values: Issued, Used, Expired, Invalidated. 
     * @return VoucherStatus Voucher status. valid values: Issued, Used, Expired, Invalidated.
     */
    public String getVoucherStatus() {
        return this.VoucherStatus;
    }

    /**
     * Set Voucher status. valid values: Issued, Used, Expired, Invalidated.
     * @param VoucherStatus Voucher status. valid values: Issued, Used, Expired, Invalidated.
     */
    public void setVoucherStatus(String VoucherStatus) {
        this.VoucherStatus = VoucherStatus;
    }

    /**
     * Get Payment mode. valid values: AllPayment, Prepaid, Postpaid. 
     * @return PaymentMode Payment mode. valid values: AllPayment, Prepaid, Postpaid.
     */
    public String getPaymentMode() {
        return this.PaymentMode;
    }

    /**
     * Set Payment mode. valid values: AllPayment, Prepaid, Postpaid.
     * @param PaymentMode Payment mode. valid values: AllPayment, Prepaid, Postpaid.
     */
    public void setPaymentMode(String PaymentMode) {
        this.PaymentMode = PaymentMode;
    }

    /**
     * Get valid values: ProductTrial, CustomerOffer. 
     * @return Usage valid values: ProductTrial, CustomerOffer.
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set valid values: ProductTrial, CustomerOffer.
     * @param Usage valid values: ProductTrial, CustomerOffer.
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Applicable product. valid values: AllProducts, SpecifyProducts, SpecifyProductsBlacklist. 
     * @return ProductScope Applicable product. valid values: AllProducts, SpecifyProducts, SpecifyProductsBlacklist.
     */
    public String getProductScope() {
        return this.ProductScope;
    }

    /**
     * Set Applicable product. valid values: AllProducts, SpecifyProducts, SpecifyProductsBlacklist.
     * @param ProductScope Applicable product. valid values: AllProducts, SpecifyProducts, SpecifyProductsBlacklist.
     */
    public void setProductScope(String ProductScope) {
        this.ProductScope = ProductScope;
    }

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

    public DescribeCustomerVoucherListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerVoucherListRequest(DescribeCustomerVoucherListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
        if (source.VoucherStatus != null) {
            this.VoucherStatus = new String(source.VoucherStatus);
        }
        if (source.PaymentMode != null) {
            this.PaymentMode = new String(source.PaymentMode);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.ProductScope != null) {
            this.ProductScope = new String(source.ProductScope);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new Long(source.VoucherId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "VoucherStatus", this.VoucherStatus);
        this.setParamSimple(map, prefix + "PaymentMode", this.PaymentMode);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ProductScope", this.ProductScope);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);

    }
}

