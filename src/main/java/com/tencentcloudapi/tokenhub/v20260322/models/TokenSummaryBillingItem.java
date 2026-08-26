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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenSummaryBillingItem extends AbstractModel {

    /**
    * Billing item. Values: input (input Token), output (output Token), cache (cache Token), call_count (call count).
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * Aggregated raw usage of this billing item during a period. Unit: tokens.
    */
    @SerializedName("TotalQty")
    @Expose
    private Long TotalQty;

    /**
     * Get Billing item. Values: input (input Token), output (output Token), cache (cache Token), call_count (call count). 
     * @return BillingItem Billing item. Values: input (input Token), output (output Token), cache (cache Token), call_count (call count).
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set Billing item. Values: input (input Token), output (output Token), cache (cache Token), call_count (call count).
     * @param BillingItem Billing item. Values: input (input Token), output (output Token), cache (cache Token), call_count (call count).
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get Aggregated raw usage of this billing item during a period. Unit: tokens. 
     * @return TotalQty Aggregated raw usage of this billing item during a period. Unit: tokens.
     */
    public Long getTotalQty() {
        return this.TotalQty;
    }

    /**
     * Set Aggregated raw usage of this billing item during a period. Unit: tokens.
     * @param TotalQty Aggregated raw usage of this billing item during a period. Unit: tokens.
     */
    public void setTotalQty(Long TotalQty) {
        this.TotalQty = TotalQty;
    }

    public TokenSummaryBillingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenSummaryBillingItem(TokenSummaryBillingItem source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.TotalQty != null) {
            this.TotalQty = new Long(source.TotalQty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "TotalQty", this.TotalQty);

    }
}

