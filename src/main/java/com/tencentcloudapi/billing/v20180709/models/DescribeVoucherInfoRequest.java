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

public class DescribeVoucherInfoRequest extends AbstractModel {

    /**
    * <p>How many data entries per page, 20 is selected by default, maximum not exceeding 1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Page number, starts from 1 by default</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Voucher status: pending use: unUsed, Used: used, delivered: delivered, discarded: cancel, expired: overdue</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Voucher id</p>
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * <p>Voucher order id</p>
    */
    @SerializedName("CodeId")
    @Expose
    private String CodeId;

    /**
    * <p>product code</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>Activity id</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * <p>Voucher name</p>
    */
    @SerializedName("VoucherName")
    @Expose
    private String VoucherName;

    /**
    * <p>Start time of delivery. Example: 2021-01-01</p>
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * <p>Delivery end time. Example: 2021-01-01</p>
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * <p>Specified sorting field: BeginTime start time, EndTime expiry time, CreateTime creation time</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>Specify ascending/descending order: desc, asc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>Payment mode, postPay (postpaid)/prePay (prepaid)/riPay (reserved instance)/"" or "*" means all modes. If payMode is "" or "*", productCode and subProductCode must be empty.</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Payment scenario PayMode=postPay: spotpay - spot instance, "settle account" - standard post-paid. PayMode=prePay: purchase - monthly subscription new purchase, renew - annual and monthly renewal (auto renewal), modify - monthly subscription configuration change. PayMode=riPay: oneOffFee - prepayment of reserved instance, hourlyFee - hourly charge for reserved instance, * - support all payment scenarios.</p>
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * <p>Operator is used by default as user uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>The primary types of vouchers are has_price and no_price, which represent the cash voucher with a price and the cash voucher without a price respectively.</p>
    */
    @SerializedName("VoucherMainType")
    @Expose
    private String VoucherMainType;

    /**
    * <p>Voucher subtype: Discount is a discount voucher, and deduct is a deduction voucher.</p>
    */
    @SerializedName("VoucherSubType")
    @Expose
    private String VoucherSubType;

    /**
    * <p>Voucher validity start time</p>
    */
    @SerializedName("StartTimeFrom")
    @Expose
    private String StartTimeFrom;

    /**
    * <p>Voucher validity time end time</p>
    */
    @SerializedName("StartTimeTo")
    @Expose
    private String StartTimeTo;

    /**
    * <p>Voucher expiration time start time</p>
    */
    @SerializedName("EndTimeFrom")
    @Expose
    private String EndTimeFrom;

    /**
    * <p>Voucher expiration time end time</p>
    */
    @SerializedName("EndTimeTo")
    @Expose
    private String EndTimeTo;

    /**
    * <p>Voucher issuance start time</p>
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * <p>Voucher issuance time end time</p>
    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    * <p>Language parameter</p><p>Default value: zh</p><p>Expect the product name to return in Chinese or other languages. Currently only support Chinese and English. Return in Chinese when "zh" is entered or left blank; return in English in other cases.</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
     * Get <p>How many data entries per page, 20 is selected by default, maximum not exceeding 1000</p> 
     * @return Limit <p>How many data entries per page, 20 is selected by default, maximum not exceeding 1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>How many data entries per page, 20 is selected by default, maximum not exceeding 1000</p>
     * @param Limit <p>How many data entries per page, 20 is selected by default, maximum not exceeding 1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Page number, starts from 1 by default</p> 
     * @return Offset <p>Page number, starts from 1 by default</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Page number, starts from 1 by default</p>
     * @param Offset <p>Page number, starts from 1 by default</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Voucher status: pending use: unUsed, Used: used, delivered: delivered, discarded: cancel, expired: overdue</p> 
     * @return Status <p>Voucher status: pending use: unUsed, Used: used, delivered: delivered, discarded: cancel, expired: overdue</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Voucher status: pending use: unUsed, Used: used, delivered: delivered, discarded: cancel, expired: overdue</p>
     * @param Status <p>Voucher status: pending use: unUsed, Used: used, delivered: delivered, discarded: cancel, expired: overdue</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Voucher id</p> 
     * @return VoucherId <p>Voucher id</p>
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set <p>Voucher id</p>
     * @param VoucherId <p>Voucher id</p>
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get <p>Voucher order id</p> 
     * @return CodeId <p>Voucher order id</p>
     */
    public String getCodeId() {
        return this.CodeId;
    }

    /**
     * Set <p>Voucher order id</p>
     * @param CodeId <p>Voucher order id</p>
     */
    public void setCodeId(String CodeId) {
        this.CodeId = CodeId;
    }

    /**
     * Get <p>product code</p> 
     * @return ProductCode <p>product code</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>product code</p>
     * @param ProductCode <p>product code</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>Activity id</p> 
     * @return ActivityId <p>Activity id</p>
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>Activity id</p>
     * @param ActivityId <p>Activity id</p>
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>Voucher name</p> 
     * @return VoucherName <p>Voucher name</p>
     */
    public String getVoucherName() {
        return this.VoucherName;
    }

    /**
     * Set <p>Voucher name</p>
     * @param VoucherName <p>Voucher name</p>
     */
    public void setVoucherName(String VoucherName) {
        this.VoucherName = VoucherName;
    }

    /**
     * Get <p>Start time of delivery. Example: 2021-01-01</p> 
     * @return TimeFrom <p>Start time of delivery. Example: 2021-01-01</p>
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set <p>Start time of delivery. Example: 2021-01-01</p>
     * @param TimeFrom <p>Start time of delivery. Example: 2021-01-01</p>
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get <p>Delivery end time. Example: 2021-01-01</p> 
     * @return TimeTo <p>Delivery end time. Example: 2021-01-01</p>
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set <p>Delivery end time. Example: 2021-01-01</p>
     * @param TimeTo <p>Delivery end time. Example: 2021-01-01</p>
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get <p>Specified sorting field: BeginTime start time, EndTime expiry time, CreateTime creation time</p> 
     * @return SortField <p>Specified sorting field: BeginTime start time, EndTime expiry time, CreateTime creation time</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>Specified sorting field: BeginTime start time, EndTime expiry time, CreateTime creation time</p>
     * @param SortField <p>Specified sorting field: BeginTime start time, EndTime expiry time, CreateTime creation time</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>Specify ascending/descending order: desc, asc</p> 
     * @return SortOrder <p>Specify ascending/descending order: desc, asc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Specify ascending/descending order: desc, asc</p>
     * @param SortOrder <p>Specify ascending/descending order: desc, asc</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>Payment mode, postPay (postpaid)/prePay (prepaid)/riPay (reserved instance)/"" or "*" means all modes. If payMode is "" or "*", productCode and subProductCode must be empty.</p> 
     * @return PayMode <p>Payment mode, postPay (postpaid)/prePay (prepaid)/riPay (reserved instance)/"" or "*" means all modes. If payMode is "" or "*", productCode and subProductCode must be empty.</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode, postPay (postpaid)/prePay (prepaid)/riPay (reserved instance)/"" or "*" means all modes. If payMode is "" or "*", productCode and subProductCode must be empty.</p>
     * @param PayMode <p>Payment mode, postPay (postpaid)/prePay (prepaid)/riPay (reserved instance)/"" or "*" means all modes. If payMode is "" or "*", productCode and subProductCode must be empty.</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Payment scenario PayMode=postPay: spotpay - spot instance, "settle account" - standard post-paid. PayMode=prePay: purchase - monthly subscription new purchase, renew - annual and monthly renewal (auto renewal), modify - monthly subscription configuration change. PayMode=riPay: oneOffFee - prepayment of reserved instance, hourlyFee - hourly charge for reserved instance, * - support all payment scenarios.</p> 
     * @return PayScene <p>Payment scenario PayMode=postPay: spotpay - spot instance, "settle account" - standard post-paid. PayMode=prePay: purchase - monthly subscription new purchase, renew - annual and monthly renewal (auto renewal), modify - monthly subscription configuration change. PayMode=riPay: oneOffFee - prepayment of reserved instance, hourlyFee - hourly charge for reserved instance, * - support all payment scenarios.</p>
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set <p>Payment scenario PayMode=postPay: spotpay - spot instance, "settle account" - standard post-paid. PayMode=prePay: purchase - monthly subscription new purchase, renew - annual and monthly renewal (auto renewal), modify - monthly subscription configuration change. PayMode=riPay: oneOffFee - prepayment of reserved instance, hourlyFee - hourly charge for reserved instance, * - support all payment scenarios.</p>
     * @param PayScene <p>Payment scenario PayMode=postPay: spotpay - spot instance, "settle account" - standard post-paid. PayMode=prePay: purchase - monthly subscription new purchase, renew - annual and monthly renewal (auto renewal), modify - monthly subscription configuration change. PayMode=riPay: oneOffFee - prepayment of reserved instance, hourlyFee - hourly charge for reserved instance, * - support all payment scenarios.</p>
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get <p>Operator is used by default as user uin</p> 
     * @return Operator <p>Operator is used by default as user uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>Operator is used by default as user uin</p>
     * @param Operator <p>Operator is used by default as user uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>The primary types of vouchers are has_price and no_price, which represent the cash voucher with a price and the cash voucher without a price respectively.</p> 
     * @return VoucherMainType <p>The primary types of vouchers are has_price and no_price, which represent the cash voucher with a price and the cash voucher without a price respectively.</p>
     */
    public String getVoucherMainType() {
        return this.VoucherMainType;
    }

    /**
     * Set <p>The primary types of vouchers are has_price and no_price, which represent the cash voucher with a price and the cash voucher without a price respectively.</p>
     * @param VoucherMainType <p>The primary types of vouchers are has_price and no_price, which represent the cash voucher with a price and the cash voucher without a price respectively.</p>
     */
    public void setVoucherMainType(String VoucherMainType) {
        this.VoucherMainType = VoucherMainType;
    }

    /**
     * Get <p>Voucher subtype: Discount is a discount voucher, and deduct is a deduction voucher.</p> 
     * @return VoucherSubType <p>Voucher subtype: Discount is a discount voucher, and deduct is a deduction voucher.</p>
     */
    public String getVoucherSubType() {
        return this.VoucherSubType;
    }

    /**
     * Set <p>Voucher subtype: Discount is a discount voucher, and deduct is a deduction voucher.</p>
     * @param VoucherSubType <p>Voucher subtype: Discount is a discount voucher, and deduct is a deduction voucher.</p>
     */
    public void setVoucherSubType(String VoucherSubType) {
        this.VoucherSubType = VoucherSubType;
    }

    /**
     * Get <p>Voucher validity start time</p> 
     * @return StartTimeFrom <p>Voucher validity start time</p>
     */
    public String getStartTimeFrom() {
        return this.StartTimeFrom;
    }

    /**
     * Set <p>Voucher validity start time</p>
     * @param StartTimeFrom <p>Voucher validity start time</p>
     */
    public void setStartTimeFrom(String StartTimeFrom) {
        this.StartTimeFrom = StartTimeFrom;
    }

    /**
     * Get <p>Voucher validity time end time</p> 
     * @return StartTimeTo <p>Voucher validity time end time</p>
     */
    public String getStartTimeTo() {
        return this.StartTimeTo;
    }

    /**
     * Set <p>Voucher validity time end time</p>
     * @param StartTimeTo <p>Voucher validity time end time</p>
     */
    public void setStartTimeTo(String StartTimeTo) {
        this.StartTimeTo = StartTimeTo;
    }

    /**
     * Get <p>Voucher expiration time start time</p> 
     * @return EndTimeFrom <p>Voucher expiration time start time</p>
     */
    public String getEndTimeFrom() {
        return this.EndTimeFrom;
    }

    /**
     * Set <p>Voucher expiration time start time</p>
     * @param EndTimeFrom <p>Voucher expiration time start time</p>
     */
    public void setEndTimeFrom(String EndTimeFrom) {
        this.EndTimeFrom = EndTimeFrom;
    }

    /**
     * Get <p>Voucher expiration time end time</p> 
     * @return EndTimeTo <p>Voucher expiration time end time</p>
     */
    public String getEndTimeTo() {
        return this.EndTimeTo;
    }

    /**
     * Set <p>Voucher expiration time end time</p>
     * @param EndTimeTo <p>Voucher expiration time end time</p>
     */
    public void setEndTimeTo(String EndTimeTo) {
        this.EndTimeTo = EndTimeTo;
    }

    /**
     * Get <p>Voucher issuance start time</p> 
     * @return CreateTimeFrom <p>Voucher issuance start time</p>
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set <p>Voucher issuance start time</p>
     * @param CreateTimeFrom <p>Voucher issuance start time</p>
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get <p>Voucher issuance time end time</p> 
     * @return CreateTimeTo <p>Voucher issuance time end time</p>
     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set <p>Voucher issuance time end time</p>
     * @param CreateTimeTo <p>Voucher issuance time end time</p>
     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get <p>Language parameter</p><p>Default value: zh</p><p>Expect the product name to return in Chinese or other languages. Currently only support Chinese and English. Return in Chinese when "zh" is entered or left blank; return in English in other cases.</p> 
     * @return Lang <p>Language parameter</p><p>Default value: zh</p><p>Expect the product name to return in Chinese or other languages. Currently only support Chinese and English. Return in Chinese when "zh" is entered or left blank; return in English in other cases.</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>Language parameter</p><p>Default value: zh</p><p>Expect the product name to return in Chinese or other languages. Currently only support Chinese and English. Return in Chinese when "zh" is entered or left blank; return in English in other cases.</p>
     * @param Lang <p>Language parameter</p><p>Default value: zh</p><p>Expect the product name to return in Chinese or other languages. Currently only support Chinese and English. Return in Chinese when "zh" is entered or left blank; return in English in other cases.</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public DescribeVoucherInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherInfoRequest(DescribeVoucherInfoRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.CodeId != null) {
            this.CodeId = new String(source.CodeId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.VoucherName != null) {
            this.VoucherName = new String(source.VoucherName);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.VoucherMainType != null) {
            this.VoucherMainType = new String(source.VoucherMainType);
        }
        if (source.VoucherSubType != null) {
            this.VoucherSubType = new String(source.VoucherSubType);
        }
        if (source.StartTimeFrom != null) {
            this.StartTimeFrom = new String(source.StartTimeFrom);
        }
        if (source.StartTimeTo != null) {
            this.StartTimeTo = new String(source.StartTimeTo);
        }
        if (source.EndTimeFrom != null) {
            this.EndTimeFrom = new String(source.EndTimeFrom);
        }
        if (source.EndTimeTo != null) {
            this.EndTimeTo = new String(source.EndTimeTo);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "CodeId", this.CodeId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "VoucherName", this.VoucherName);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "VoucherMainType", this.VoucherMainType);
        this.setParamSimple(map, prefix + "VoucherSubType", this.VoucherSubType);
        this.setParamSimple(map, prefix + "StartTimeFrom", this.StartTimeFrom);
        this.setParamSimple(map, prefix + "StartTimeTo", this.StartTimeTo);
        this.setParamSimple(map, prefix + "EndTimeFrom", this.EndTimeFrom);
        this.setParamSimple(map, prefix + "EndTimeTo", this.EndTimeTo);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "Lang", this.Lang);

    }
}

