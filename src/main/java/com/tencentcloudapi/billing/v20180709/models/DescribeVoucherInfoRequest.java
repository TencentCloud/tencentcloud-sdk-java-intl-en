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

public class DescribeVoucherInfoRequest extends AbstractModel{

    /**
    * The number of records per page. The default is 20, and the maximum is 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The page number the records start from. The default is 1.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The voucher status. Valid values: `unUsed`, `used`, `delivered`, `cancel`, `overdue`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * The voucher order ID.
    */
    @SerializedName("CodeId")
    @Expose
    private String CodeId;

    /**
    * The product code.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * The campaign ID.
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * The voucher name.
    */
    @SerializedName("VoucherName")
    @Expose
    private String VoucherName;

    /**
    * The start date of the voucher issuance, such as `2021-01-01`.
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * The end date of the voucher issuance, such as `2021-01-01`.
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * The field used to sort the records. Valid values: BeginTime, EndTime, CreateTime.
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * Whether to sort the records in ascending or descending order. Valid values: desc, asc.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * The payment mode. Valid values: `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. If this parameter is empty or `*`, `productCode` and `subProductCode` must also be empty.
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
    * The operator. The default is the UIN of the current user.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get The number of records per page. The default is 20, and the maximum is 1,000. 
     * @return Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records per page. The default is 20, and the maximum is 1,000.
     * @param Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The page number the records start from. The default is 1. 
     * @return Offset The page number the records start from. The default is 1.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page number the records start from. The default is 1.
     * @param Offset The page number the records start from. The default is 1.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The voucher status. Valid values: `unUsed`, `used`, `delivered`, `cancel`, `overdue`. 
     * @return Status The voucher status. Valid values: `unUsed`, `used`, `delivered`, `cancel`, `overdue`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The voucher status. Valid values: `unUsed`, `used`, `delivered`, `cancel`, `overdue`.
     * @param Status The voucher status. Valid values: `unUsed`, `used`, `delivered`, `cancel`, `overdue`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get The voucher order ID. 
     * @return CodeId The voucher order ID.
     */
    public String getCodeId() {
        return this.CodeId;
    }

    /**
     * Set The voucher order ID.
     * @param CodeId The voucher order ID.
     */
    public void setCodeId(String CodeId) {
        this.CodeId = CodeId;
    }

    /**
     * Get The product code. 
     * @return ProductCode The product code.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set The product code.
     * @param ProductCode The product code.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get The campaign ID. 
     * @return ActivityId The campaign ID.
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set The campaign ID.
     * @param ActivityId The campaign ID.
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get The voucher name. 
     * @return VoucherName The voucher name.
     */
    public String getVoucherName() {
        return this.VoucherName;
    }

    /**
     * Set The voucher name.
     * @param VoucherName The voucher name.
     */
    public void setVoucherName(String VoucherName) {
        this.VoucherName = VoucherName;
    }

    /**
     * Get The start date of the voucher issuance, such as `2021-01-01`. 
     * @return TimeFrom The start date of the voucher issuance, such as `2021-01-01`.
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set The start date of the voucher issuance, such as `2021-01-01`.
     * @param TimeFrom The start date of the voucher issuance, such as `2021-01-01`.
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get The end date of the voucher issuance, such as `2021-01-01`. 
     * @return TimeTo The end date of the voucher issuance, such as `2021-01-01`.
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set The end date of the voucher issuance, such as `2021-01-01`.
     * @param TimeTo The end date of the voucher issuance, such as `2021-01-01`.
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get The field used to sort the records. Valid values: BeginTime, EndTime, CreateTime. 
     * @return SortField The field used to sort the records. Valid values: BeginTime, EndTime, CreateTime.
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set The field used to sort the records. Valid values: BeginTime, EndTime, CreateTime.
     * @param SortField The field used to sort the records. Valid values: BeginTime, EndTime, CreateTime.
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get Whether to sort the records in ascending or descending order. Valid values: desc, asc. 
     * @return SortOrder Whether to sort the records in ascending or descending order. Valid values: desc, asc.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Whether to sort the records in ascending or descending order. Valid values: desc, asc.
     * @param SortOrder Whether to sort the records in ascending or descending order. Valid values: desc, asc.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get The payment mode. Valid values: `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. If this parameter is empty or `*`, `productCode` and `subProductCode` must also be empty. 
     * @return PayMode The payment mode. Valid values: `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. If this parameter is empty or `*`, `productCode` and `subProductCode` must also be empty.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set The payment mode. Valid values: `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. If this parameter is empty or `*`, `productCode` and `subProductCode` must also be empty.
     * @param PayMode The payment mode. Valid values: `postPay`: pay-as-you-go; `prePay`: prepaid; `riPay`: reserved instance; empty or `*`: all. If this parameter is empty or `*`, `productCode` and `subProductCode` must also be empty.
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
     * Get The operator. The default is the UIN of the current user. 
     * @return Operator The operator. The default is the UIN of the current user.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The operator. The default is the UIN of the current user.
     * @param Operator The operator. The default is the UIN of the current user.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
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

    }
}

