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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceTag extends AbstractModel {

    /**
    * Billing name refers to the category of billable items for specifications. The pricing name for specific specifications can be found in the returned results of the DescribeProductSKUList API.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Billing category, pricing name subclass. For the billing category of specific specifications, see the returned results in DescribeProductSKUList API.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Billing item tag is a subproject of the billing Category under the pricing Name (Name), representing a specific charge. For the billing item tag of the specification, see 
DescribeProductSKUList API returned results.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Billing step length indicates the billing quantity of the billing item tag (Code) under the billing category (Category) for the pricing name (Name). For the field value of specific specifications, refer to DescribeProductSKUList API.
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get Billing name refers to the category of billable items for specifications. The pricing name for specific specifications can be found in the returned results of the DescribeProductSKUList API. 
     * @return Name Billing name refers to the category of billable items for specifications. The pricing name for specific specifications can be found in the returned results of the DescribeProductSKUList API.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Billing name refers to the category of billable items for specifications. The pricing name for specific specifications can be found in the returned results of the DescribeProductSKUList API.
     * @param Name Billing name refers to the category of billable items for specifications. The pricing name for specific specifications can be found in the returned results of the DescribeProductSKUList API.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Billing category, pricing name subclass. For the billing category of specific specifications, see the returned results in DescribeProductSKUList API. 
     * @return Category Billing category, pricing name subclass. For the billing category of specific specifications, see the returned results in DescribeProductSKUList API.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Billing category, pricing name subclass. For the billing category of specific specifications, see the returned results in DescribeProductSKUList API.
     * @param Category Billing category, pricing name subclass. For the billing category of specific specifications, see the returned results in DescribeProductSKUList API.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Billing item tag is a subproject of the billing Category under the pricing Name (Name), representing a specific charge. For the billing item tag of the specification, see 
DescribeProductSKUList API returned results. 
     * @return Code Billing item tag is a subproject of the billing Category under the pricing Name (Name), representing a specific charge. For the billing item tag of the specification, see 
DescribeProductSKUList API returned results.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Billing item tag is a subproject of the billing Category under the pricing Name (Name), representing a specific charge. For the billing item tag of the specification, see 
DescribeProductSKUList API returned results.
     * @param Code Billing item tag is a subproject of the billing Category under the pricing Name (Name), representing a specific charge. For the billing item tag of the specification, see 
DescribeProductSKUList API returned results.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Billing step length indicates the billing quantity of the billing item tag (Code) under the billing category (Category) for the pricing name (Name). For the field value of specific specifications, refer to DescribeProductSKUList API. 
     * @return Step Billing step length indicates the billing quantity of the billing item tag (Code) under the billing category (Category) for the pricing name (Name). For the field value of specific specifications, refer to DescribeProductSKUList API.
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set Billing step length indicates the billing quantity of the billing item tag (Code) under the billing category (Category) for the pricing name (Name). For the field value of specific specifications, refer to DescribeProductSKUList API.
     * @param Step Billing step length indicates the billing quantity of the billing item tag (Code) under the billing category (Category) for the pricing name (Name). For the field value of specific specifications, refer to DescribeProductSKUList API.
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

