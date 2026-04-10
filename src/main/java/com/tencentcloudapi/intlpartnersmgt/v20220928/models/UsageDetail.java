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

public class UsageDetail extends AbstractModel {

    /**
    * Voucher log ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * Order ID
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Billing ID
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * Amount
    */
    @SerializedName("Amount")
    @Expose
    private Float Amount;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Order product code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Sub-product code
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Product name of the order
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Subproduct name of the order
    */
    @SerializedName("SubProductCodeName")
    @Expose
    private String SubProductCodeName;

    /**
    * Order payment time
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Order completion time
    */
    @SerializedName("CompletionTime")
    @Expose
    private String CompletionTime;

    /**
    * Order owner uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get Voucher log ID 
     * @return Id Voucher log ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Voucher log ID
     * @param Id Voucher log ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Voucher ID. 
     * @return VoucherId Voucher ID.
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set Voucher ID.
     * @param VoucherId Voucher ID.
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get Order ID 
     * @return DealName Order ID
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order ID
     * @param DealName Order ID
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get Billing ID 
     * @return BillId Billing ID
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Billing ID
     * @param BillId Billing ID
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get Amount 
     * @return Amount Amount
     */
    public Float getAmount() {
        return this.Amount;
    }

    /**
     * Set Amount
     * @param Amount Amount
     */
    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Order product code 
     * @return ProductCode Order product code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Order product code
     * @param ProductCode Order product code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Sub-product code 
     * @return SubProductCode Sub-product code
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Sub-product code
     * @param SubProductCode Sub-product code
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Product name of the order 
     * @return ProductCodeName Product name of the order
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Product name of the order
     * @param ProductCodeName Product name of the order
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Subproduct name of the order 
     * @return SubProductCodeName Subproduct name of the order
     */
    public String getSubProductCodeName() {
        return this.SubProductCodeName;
    }

    /**
     * Set Subproduct name of the order
     * @param SubProductCodeName Subproduct name of the order
     */
    public void setSubProductCodeName(String SubProductCodeName) {
        this.SubProductCodeName = SubProductCodeName;
    }

    /**
     * Get Order payment time 
     * @return PayTime Order payment time
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Order payment time
     * @param PayTime Order payment time
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Order completion time 
     * @return CompletionTime Order completion time
     */
    public String getCompletionTime() {
        return this.CompletionTime;
    }

    /**
     * Set Order completion time
     * @param CompletionTime Order completion time
     */
    public void setCompletionTime(String CompletionTime) {
        this.CompletionTime = CompletionTime;
    }

    /**
     * Get Order owner uin 
     * @return OwnerUin Order owner uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Order owner uin
     * @param OwnerUin Order owner uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.Amount != null) {
            this.Amount = new Float(source.Amount);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.SubProductCodeName != null) {
            this.SubProductCodeName = new String(source.SubProductCodeName);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.CompletionTime != null) {
            this.CompletionTime = new String(source.CompletionTime);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "SubProductCodeName", this.SubProductCodeName);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CompletionTime", this.CompletionTime);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

