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

public class QueryVoucherAmountByUinItem extends AbstractModel {

    /**
    * Customer UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Voucher quota
    */
    @SerializedName("TotalAmount")
    @Expose
    private Float TotalAmount;

    /**
    * Voucher amount
    */
    @SerializedName("RemainAmount")
    @Expose
    private Float RemainAmount;

    /**
     * Get Customer UIN 
     * @return ClientUin Customer UIN
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer UIN
     * @param ClientUin Customer UIN
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Voucher quota 
     * @return TotalAmount Voucher quota
     */
    public Float getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set Voucher quota
     * @param TotalAmount Voucher quota
     */
    public void setTotalAmount(Float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get Voucher amount 
     * @return RemainAmount Voucher amount
     */
    public Float getRemainAmount() {
        return this.RemainAmount;
    }

    /**
     * Set Voucher amount
     * @param RemainAmount Voucher amount
     */
    public void setRemainAmount(Float RemainAmount) {
        this.RemainAmount = RemainAmount;
    }

    public QueryVoucherAmountByUinItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherAmountByUinItem(QueryVoucherAmountByUinItem source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Float(source.TotalAmount);
        }
        if (source.RemainAmount != null) {
            this.RemainAmount = new Float(source.RemainAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "RemainAmount", this.RemainAmount);

    }
}

