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

public class PayDealsRequest extends AbstractModel {

    /**
    * Specifies one or more Sub-order No. that need to pay. must pass either this parameter or the BigDealIds field, but not both.
    */
    @SerializedName("OrderIds")
    @Expose
    private String [] OrderIds;

    /**
    * Whether to automatically use a voucher. valid values: 1 (yes), 0 (no). default: 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list. currently only supports specifying one voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Specifies one or more Order No. that need to pay. must pass either this parameter or the OrderIds field.
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * 0 self pay, 3 group agent, 4 reseller places a product-level payment order for customers. default 0.
    */
    @SerializedName("AgentPay")
    @Expose
    private Long AgentPay;

    /**
    * Disregard it.
    */
    @SerializedName("CpsUin")
    @Expose
    private String CpsUin;

    /**
     * Get Specifies one or more Sub-order No. that need to pay. must pass either this parameter or the BigDealIds field, but not both. 
     * @return OrderIds Specifies one or more Sub-order No. that need to pay. must pass either this parameter or the BigDealIds field, but not both.
     */
    public String [] getOrderIds() {
        return this.OrderIds;
    }

    /**
     * Set Specifies one or more Sub-order No. that need to pay. must pass either this parameter or the BigDealIds field, but not both.
     * @param OrderIds Specifies one or more Sub-order No. that need to pay. must pass either this parameter or the BigDealIds field, but not both.
     */
    public void setOrderIds(String [] OrderIds) {
        this.OrderIds = OrderIds;
    }

    /**
     * Get Whether to automatically use a voucher. valid values: 1 (yes), 0 (no). default: 0. 
     * @return AutoVoucher Whether to automatically use a voucher. valid values: 1 (yes), 0 (no). default: 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use a voucher. valid values: 1 (yes), 0 (no). default: 0.
     * @param AutoVoucher Whether to automatically use a voucher. valid values: 1 (yes), 0 (no). default: 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. currently only supports specifying one voucher. 
     * @return VoucherIds Voucher ID list. currently only supports specifying one voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. currently only supports specifying one voucher.
     * @param VoucherIds Voucher ID list. currently only supports specifying one voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Specifies one or more Order No. that need to pay. must pass either this parameter or the OrderIds field. 
     * @return BigDealIds Specifies one or more Order No. that need to pay. must pass either this parameter or the OrderIds field.
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set Specifies one or more Order No. that need to pay. must pass either this parameter or the OrderIds field.
     * @param BigDealIds Specifies one or more Order No. that need to pay. must pass either this parameter or the OrderIds field.
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get 0 self pay, 3 group agent, 4 reseller places a product-level payment order for customers. default 0. 
     * @return AgentPay 0 self pay, 3 group agent, 4 reseller places a product-level payment order for customers. default 0.
     */
    public Long getAgentPay() {
        return this.AgentPay;
    }

    /**
     * Set 0 self pay, 3 group agent, 4 reseller places a product-level payment order for customers. default 0.
     * @param AgentPay 0 self pay, 3 group agent, 4 reseller places a product-level payment order for customers. default 0.
     */
    public void setAgentPay(Long AgentPay) {
        this.AgentPay = AgentPay;
    }

    /**
     * Get Disregard it. 
     * @return CpsUin Disregard it.
     */
    public String getCpsUin() {
        return this.CpsUin;
    }

    /**
     * Set Disregard it.
     * @param CpsUin Disregard it.
     */
    public void setCpsUin(String CpsUin) {
        this.CpsUin = CpsUin;
    }

    public PayDealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayDealsRequest(PayDealsRequest source) {
        if (source.OrderIds != null) {
            this.OrderIds = new String[source.OrderIds.length];
            for (int i = 0; i < source.OrderIds.length; i++) {
                this.OrderIds[i] = new String(source.OrderIds[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
        if (source.AgentPay != null) {
            this.AgentPay = new Long(source.AgentPay);
        }
        if (source.CpsUin != null) {
            this.CpsUin = new String(source.CpsUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OrderIds.", this.OrderIds);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamSimple(map, prefix + "AgentPay", this.AgentPay);
        this.setParamSimple(map, prefix + "CpsUin", this.CpsUin);

    }
}

