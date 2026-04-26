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

public class DescribeCPQBillingMappingRequest extends AbstractModel {

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * The number of entries returned at a time. The maximum value is `100`.	
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Quoted subproduct name
    */
    @SerializedName("SpuName")
    @Expose
    private String SpuName;

    /**
    * Quoted product name
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * Product name
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * Subproduct name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Component type name
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Product code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Component type code
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Component code
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of entries returned at a time. The maximum value is `100`.	 
     * @return Limit The number of entries returned at a time. The maximum value is `100`.	
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of entries returned at a time. The maximum value is `100`.	
     * @param Limit The number of entries returned at a time. The maximum value is `100`.	
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Quoted subproduct name 
     * @return SpuName Quoted subproduct name
     */
    public String getSpuName() {
        return this.SpuName;
    }

    /**
     * Set Quoted subproduct name
     * @param SpuName Quoted subproduct name
     */
    public void setSpuName(String SpuName) {
        this.SpuName = SpuName;
    }

    /**
     * Get Quoted product name 
     * @return CategoryName Quoted product name
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set Quoted product name
     * @param CategoryName Quoted product name
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get Product name 
     * @return BusinessName Product name
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set Product name
     * @param BusinessName Product name
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get Subproduct name 
     * @return ProductName Subproduct name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Subproduct name
     * @param ProductName Subproduct name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Component type name 
     * @return ComponentName Component type name
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component type name
     * @param ComponentName Component type name
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Component name 
     * @return ItemName Component name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Component name
     * @param ItemName Component name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Product code 
     * @return BusinessCode Product code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
     * @param BusinessCode Product code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Subproduct code 
     * @return ProductCode Subproduct code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct code
     * @param ProductCode Subproduct code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Component type code 
     * @return ComponentCode Component type code
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component type code
     * @param ComponentCode Component type code
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Component code 
     * @return ItemCode Component code
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set Component code
     * @param ItemCode Component code
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public DescribeCPQBillingMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCPQBillingMappingRequest(DescribeCPQBillingMappingRequest source) {
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.SpuName != null) {
            this.SpuName = new String(source.SpuName);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SpuName", this.SpuName);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);

    }
}

