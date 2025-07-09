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

public class Deal extends AbstractModel {

    /**
    * Order ID.
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * The status of the order. 1: unpaid; 2: paid; 3: shipping; 4: shipped; 5: shipment failed; 6: refunded; 7: closed case; 8: order expired; 9: order invalidated; 10: product invalidated; 11: third-party payment refused; 12: payment in process
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Payer
    */
    @SerializedName("Payer")
    @Expose
    private String Payer;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Actual payment amount (pent)
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Long RealTotalCost;

    /**
    * Voucher offset amount (pent)
    */
    @SerializedName("VoucherDecline")
    @Expose
    private Long VoucherDecline;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Product category ID
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

    /**
    * Product details
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfo [] ProductInfo;

    /**
    * Duration
    */
    @SerializedName("TimeSpan")
    @Expose
    private Float TimeSpan;

    /**
    * Time unit
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Currency unit
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Discount rate
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * Unit price (cents)
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * Original price (cents)
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * Product code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct code
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Large order number.
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * Refund formula.
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * Refund involves order information.
    */
    @SerializedName("RefReturnDeals")
    @Expose
    private String RefReturnDeals;

    /**
    * Billing mode: `prePay` (prepaid), `postPay` (pay-as-you-go), `riPay` (reserved instance)
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Transaction type

Modify network mode adjust bandwidth mode.
Adjust bandwidth size.
`Refund`: refund.
downgrade.
upgrade configuration.
renew.
purchase.
preMoveOut monthly subscription resource migration out.
preMoveIn specifies the monthly subscription resources to migrate.
preToPost specifies the prepaid to postpaid conversion.
postMoveOut specifies the pay-as-you-go resources to be migrated out.
postMoveIn specifies the pay-as-you-go resources for inbound migration.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Product code chinese name.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Sub-Product code chinese name.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * The resource ID corresponding to the order. If the query parameter `Limit` exceeds 200, null will be returned.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String [] ResourceId;

    /**
     * Get Order ID. 
     * @return OrderId Order ID.
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID.
     * @param OrderId Order ID.
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get The status of the order. 1: unpaid; 2: paid; 3: shipping; 4: shipped; 5: shipment failed; 6: refunded; 7: closed case; 8: order expired; 9: order invalidated; 10: product invalidated; 11: third-party payment refused; 12: payment in process 
     * @return Status The status of the order. 1: unpaid; 2: paid; 3: shipping; 4: shipped; 5: shipment failed; 6: refunded; 7: closed case; 8: order expired; 9: order invalidated; 10: product invalidated; 11: third-party payment refused; 12: payment in process
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the order. 1: unpaid; 2: paid; 3: shipping; 4: shipped; 5: shipment failed; 6: refunded; 7: closed case; 8: order expired; 9: order invalidated; 10: product invalidated; 11: third-party payment refused; 12: payment in process
     * @param Status The status of the order. 1: unpaid; 2: paid; 3: shipping; 4: shipped; 5: shipment failed; 6: refunded; 7: closed case; 8: order expired; 9: order invalidated; 10: product invalidated; 11: third-party payment refused; 12: payment in process
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Payer 
     * @return Payer Payer
     */
    public String getPayer() {
        return this.Payer;
    }

    /**
     * Set Payer
     * @param Payer Payer
     */
    public void setPayer(String Payer) {
        this.Payer = Payer;
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
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Actual payment amount (pent) 
     * @return RealTotalCost Actual payment amount (pent)
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Actual payment amount (pent)
     * @param RealTotalCost Actual payment amount (pent)
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Voucher offset amount (pent) 
     * @return VoucherDecline Voucher offset amount (pent)
     */
    public Long getVoucherDecline() {
        return this.VoucherDecline;
    }

    /**
     * Set Voucher offset amount (pent)
     * @param VoucherDecline Voucher offset amount (pent)
     */
    public void setVoucherDecline(Long VoucherDecline) {
        this.VoucherDecline = VoucherDecline;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Product category ID 
     * @return GoodsCategoryId Product category ID
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set Product category ID
     * @param GoodsCategoryId Product category ID
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get Product details 
     * @return ProductInfo Product details
     */
    public ProductInfo [] getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set Product details
     * @param ProductInfo Product details
     */
    public void setProductInfo(ProductInfo [] ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get Duration 
     * @return TimeSpan Duration
     */
    public Float getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration
     * @param TimeSpan Duration
     */
    public void setTimeSpan(Float TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit 
     * @return TimeUnit Time unit
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit
     * @param TimeUnit Time unit
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Currency unit 
     * @return Currency Currency unit
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency unit
     * @param Currency Currency unit
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Discount rate 
     * @return Policy Discount rate
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set Discount rate
     * @param Policy Discount rate
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Unit price (cents) 
     * @return Price Unit price (cents)
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price (cents)
     * @param Price Unit price (cents)
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get Original price (cents) 
     * @return TotalCost Original price (cents)
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original price (cents)
     * @param TotalCost Original price (cents)
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Product code 
     * @return ProductCode Product code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code
     * @param ProductCode Product code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Subproduct code 
     * @return SubProductCode Subproduct code
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Subproduct code
     * @param SubProductCode Subproduct code
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Large order number. 
     * @return BigDealId Large order number.
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set Large order number.
     * @param BigDealId Large order number.
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get Refund formula. 
     * @return Formula Refund formula.
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set Refund formula.
     * @param Formula Refund formula.
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get Refund involves order information. 
     * @return RefReturnDeals Refund involves order information.
     */
    public String getRefReturnDeals() {
        return this.RefReturnDeals;
    }

    /**
     * Set Refund involves order information.
     * @param RefReturnDeals Refund involves order information.
     */
    public void setRefReturnDeals(String RefReturnDeals) {
        this.RefReturnDeals = RefReturnDeals;
    }

    /**
     * Get Billing mode: `prePay` (prepaid), `postPay` (pay-as-you-go), `riPay` (reserved instance) 
     * @return PayMode Billing mode: `prePay` (prepaid), `postPay` (pay-as-you-go), `riPay` (reserved instance)
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode: `prePay` (prepaid), `postPay` (pay-as-you-go), `riPay` (reserved instance)
     * @param PayMode Billing mode: `prePay` (prepaid), `postPay` (pay-as-you-go), `riPay` (reserved instance)
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Transaction type

Modify network mode adjust bandwidth mode.
Adjust bandwidth size.
`Refund`: refund.
downgrade.
upgrade configuration.
renew.
purchase.
preMoveOut monthly subscription resource migration out.
preMoveIn specifies the monthly subscription resources to migrate.
preToPost specifies the prepaid to postpaid conversion.
postMoveOut specifies the pay-as-you-go resources to be migrated out.
postMoveIn specifies the pay-as-you-go resources for inbound migration. 
     * @return Action Transaction type

Modify network mode adjust bandwidth mode.
Adjust bandwidth size.
`Refund`: refund.
downgrade.
upgrade configuration.
renew.
purchase.
preMoveOut monthly subscription resource migration out.
preMoveIn specifies the monthly subscription resources to migrate.
preToPost specifies the prepaid to postpaid conversion.
postMoveOut specifies the pay-as-you-go resources to be migrated out.
postMoveIn specifies the pay-as-you-go resources for inbound migration.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Transaction type

Modify network mode adjust bandwidth mode.
Adjust bandwidth size.
`Refund`: refund.
downgrade.
upgrade configuration.
renew.
purchase.
preMoveOut monthly subscription resource migration out.
preMoveIn specifies the monthly subscription resources to migrate.
preToPost specifies the prepaid to postpaid conversion.
postMoveOut specifies the pay-as-you-go resources to be migrated out.
postMoveIn specifies the pay-as-you-go resources for inbound migration.
     * @param Action Transaction type

Modify network mode adjust bandwidth mode.
Adjust bandwidth size.
`Refund`: refund.
downgrade.
upgrade configuration.
renew.
purchase.
preMoveOut monthly subscription resource migration out.
preMoveIn specifies the monthly subscription resources to migrate.
preToPost specifies the prepaid to postpaid conversion.
postMoveOut specifies the pay-as-you-go resources to be migrated out.
postMoveIn specifies the pay-as-you-go resources for inbound migration.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Product code chinese name. 
     * @return ProductName Product code chinese name.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product code chinese name.
     * @param ProductName Product code chinese name.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Sub-Product code chinese name. 
     * @return SubProductName Sub-Product code chinese name.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set Sub-Product code chinese name.
     * @param SubProductName Sub-Product code chinese name.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get The resource ID corresponding to the order. If the query parameter `Limit` exceeds 200, null will be returned.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId The resource ID corresponding to the order. If the query parameter `Limit` exceeds 200, null will be returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The resource ID corresponding to the order. If the query parameter `Limit` exceeds 200, null will be returned.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId The resource ID corresponding to the order. If the query parameter `Limit` exceeds 200, null will be returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String [] ResourceId) {
        this.ResourceId = ResourceId;
    }

    public Deal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deal(Deal source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Payer != null) {
            this.Payer = new String(source.Payer);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
        if (source.VoucherDecline != null) {
            this.VoucherDecline = new Long(source.VoucherDecline);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.ProductInfo != null) {
            this.ProductInfo = new ProductInfo[source.ProductInfo.length];
            for (int i = 0; i < source.ProductInfo.length; i++) {
                this.ProductInfo[i] = new ProductInfo(source.ProductInfo[i]);
            }
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Float(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.RefReturnDeals != null) {
            this.RefReturnDeals = new String(source.RefReturnDeals);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String[source.ResourceId.length];
            for (int i = 0; i < source.ResourceId.length; i++) {
                this.ResourceId[i] = new String(source.ResourceId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherDecline", this.VoucherDecline);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamArrayObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "RefReturnDeals", this.RefReturnDeals);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamArraySimple(map, prefix + "ResourceId.", this.ResourceId);

    }
}

