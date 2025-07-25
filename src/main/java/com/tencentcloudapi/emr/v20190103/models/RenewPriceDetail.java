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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewPriceDetail extends AbstractModel {

    /**
    * 
    */
    @SerializedName("BillingName")
    @Expose
    private String BillingName;

    /**
    * 
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * 
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
     * Get  
     * @return BillingName 
     */
    public String getBillingName() {
        return this.BillingName;
    }

    /**
     * Set 
     * @param BillingName 
     */
    public void setBillingName(String BillingName) {
        this.BillingName = BillingName;
    }

    /**
     * Get  
     * @return Policy 
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set 
     * @param Policy 
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get  
     * @return Quantity 
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 
     * @param Quantity 
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get  
     * @return OriginalCost 
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 
     * @param OriginalCost 
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get  
     * @return DiscountCost 
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 
     * @param DiscountCost 
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    public RenewPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewPriceDetail(RenewPriceDetail source) {
        if (source.BillingName != null) {
            this.BillingName = new String(source.BillingName);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingName", this.BillingName);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);

    }
}

