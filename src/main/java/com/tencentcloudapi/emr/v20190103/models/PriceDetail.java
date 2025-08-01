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

public class PriceDetail extends AbstractModel {

    /**
    * The node ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * The price formula
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * The original price
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * The discount price
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
     * Get The node ID 
     * @return ResourceId The node ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The node ID
     * @param ResourceId The node ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get The price formula 
     * @return Formula The price formula
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set The price formula
     * @param Formula The price formula
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get The original price 
     * @return OriginalCost The original price
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set The original price
     * @param OriginalCost The original price
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get The discount price 
     * @return DiscountCost The discount price
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set The discount price
     * @param DiscountCost The discount price
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    public PriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceDetail(PriceDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);

    }
}

