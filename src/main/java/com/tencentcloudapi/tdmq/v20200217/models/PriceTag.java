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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceTag extends AbstractModel {

    /**
    * Pricing name. Enumeration values are as follows:

-tps: TPS base price
-stepTps: TPS step length
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Billing category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Tag of the billable item.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Step size corresponding to the billing item.
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get Pricing name. Enumeration values are as follows:

-tps: TPS base price
-stepTps: TPS step length 
     * @return Name Pricing name. Enumeration values are as follows:

-tps: TPS base price
-stepTps: TPS step length
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pricing name. Enumeration values are as follows:

-tps: TPS base price
-stepTps: TPS step length
     * @param Name Pricing name. Enumeration values are as follows:

-tps: TPS base price
-stepTps: TPS step length
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Billing category 
     * @return Category Billing category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Billing category
     * @param Category Billing category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Tag of the billable item. 
     * @return Code Tag of the billable item.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Tag of the billable item.
     * @param Code Tag of the billable item.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Step size corresponding to the billing item. 
     * @return Step Step size corresponding to the billing item.
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set Step size corresponding to the billing item.
     * @param Step Step size corresponding to the billing item.
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public PriceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceTag(PriceTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

