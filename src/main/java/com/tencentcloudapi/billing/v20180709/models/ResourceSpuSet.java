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

public class ResourceSpuSet extends AbstractModel {

    /**
    * Quoted subproduct (Chinese)
    */
    @SerializedName("SpuNameZh")
    @Expose
    private String SpuNameZh;

    /**
    * Quoted subproduct (English)
    */
    @SerializedName("SpuNameEn")
    @Expose
    private String SpuNameEn;

    /**
    * Quoted product (Chinese)
    */
    @SerializedName("CategoryNameZh")
    @Expose
    private String CategoryNameZh;

    /**
    * Quoted product (English)
    */
    @SerializedName("CategoryNameEn")
    @Expose
    private String CategoryNameEn;

    /**
    * Product code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Product name (Chinese)
    */
    @SerializedName("BusinessNameZh")
    @Expose
    private String BusinessNameZh;

    /**
    * Product name (English)
    */
    @SerializedName("BusinessNameEn")
    @Expose
    private String BusinessNameEn;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct name (Chinese)
    */
    @SerializedName("ProductNameZh")
    @Expose
    private String ProductNameZh;

    /**
    * Subproduct name (English)
    */
    @SerializedName("ProductNameEn")
    @Expose
    private String ProductNameEn;

    /**
    * Component type code
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Component type name (Chinese)
    */
    @SerializedName("ComponentNameZh")
    @Expose
    private String ComponentNameZh;

    /**
    * Component type name (English)
    */
    @SerializedName("ComponentNameEn")
    @Expose
    private String ComponentNameEn;

    /**
    * Component code
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * Component name (Chinese)
    */
    @SerializedName("ItemNameZh")
    @Expose
    private String ItemNameZh;

    /**
    * Component name (English)
    */
    @SerializedName("ItemNameEn")
    @Expose
    private String ItemNameEn;

    /**
     * Get Quoted subproduct (Chinese) 
     * @return SpuNameZh Quoted subproduct (Chinese)
     */
    public String getSpuNameZh() {
        return this.SpuNameZh;
    }

    /**
     * Set Quoted subproduct (Chinese)
     * @param SpuNameZh Quoted subproduct (Chinese)
     */
    public void setSpuNameZh(String SpuNameZh) {
        this.SpuNameZh = SpuNameZh;
    }

    /**
     * Get Quoted subproduct (English) 
     * @return SpuNameEn Quoted subproduct (English)
     */
    public String getSpuNameEn() {
        return this.SpuNameEn;
    }

    /**
     * Set Quoted subproduct (English)
     * @param SpuNameEn Quoted subproduct (English)
     */
    public void setSpuNameEn(String SpuNameEn) {
        this.SpuNameEn = SpuNameEn;
    }

    /**
     * Get Quoted product (Chinese) 
     * @return CategoryNameZh Quoted product (Chinese)
     */
    public String getCategoryNameZh() {
        return this.CategoryNameZh;
    }

    /**
     * Set Quoted product (Chinese)
     * @param CategoryNameZh Quoted product (Chinese)
     */
    public void setCategoryNameZh(String CategoryNameZh) {
        this.CategoryNameZh = CategoryNameZh;
    }

    /**
     * Get Quoted product (English) 
     * @return CategoryNameEn Quoted product (English)
     */
    public String getCategoryNameEn() {
        return this.CategoryNameEn;
    }

    /**
     * Set Quoted product (English)
     * @param CategoryNameEn Quoted product (English)
     */
    public void setCategoryNameEn(String CategoryNameEn) {
        this.CategoryNameEn = CategoryNameEn;
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
     * Get Product name (Chinese) 
     * @return BusinessNameZh Product name (Chinese)
     */
    public String getBusinessNameZh() {
        return this.BusinessNameZh;
    }

    /**
     * Set Product name (Chinese)
     * @param BusinessNameZh Product name (Chinese)
     */
    public void setBusinessNameZh(String BusinessNameZh) {
        this.BusinessNameZh = BusinessNameZh;
    }

    /**
     * Get Product name (English) 
     * @return BusinessNameEn Product name (English)
     */
    public String getBusinessNameEn() {
        return this.BusinessNameEn;
    }

    /**
     * Set Product name (English)
     * @param BusinessNameEn Product name (English)
     */
    public void setBusinessNameEn(String BusinessNameEn) {
        this.BusinessNameEn = BusinessNameEn;
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
     * Get Subproduct name (Chinese) 
     * @return ProductNameZh Subproduct name (Chinese)
     */
    public String getProductNameZh() {
        return this.ProductNameZh;
    }

    /**
     * Set Subproduct name (Chinese)
     * @param ProductNameZh Subproduct name (Chinese)
     */
    public void setProductNameZh(String ProductNameZh) {
        this.ProductNameZh = ProductNameZh;
    }

    /**
     * Get Subproduct name (English) 
     * @return ProductNameEn Subproduct name (English)
     */
    public String getProductNameEn() {
        return this.ProductNameEn;
    }

    /**
     * Set Subproduct name (English)
     * @param ProductNameEn Subproduct name (English)
     */
    public void setProductNameEn(String ProductNameEn) {
        this.ProductNameEn = ProductNameEn;
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
     * Get Component type name (Chinese) 
     * @return ComponentNameZh Component type name (Chinese)
     */
    public String getComponentNameZh() {
        return this.ComponentNameZh;
    }

    /**
     * Set Component type name (Chinese)
     * @param ComponentNameZh Component type name (Chinese)
     */
    public void setComponentNameZh(String ComponentNameZh) {
        this.ComponentNameZh = ComponentNameZh;
    }

    /**
     * Get Component type name (English) 
     * @return ComponentNameEn Component type name (English)
     */
    public String getComponentNameEn() {
        return this.ComponentNameEn;
    }

    /**
     * Set Component type name (English)
     * @param ComponentNameEn Component type name (English)
     */
    public void setComponentNameEn(String ComponentNameEn) {
        this.ComponentNameEn = ComponentNameEn;
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

    /**
     * Get Component name (Chinese) 
     * @return ItemNameZh Component name (Chinese)
     */
    public String getItemNameZh() {
        return this.ItemNameZh;
    }

    /**
     * Set Component name (Chinese)
     * @param ItemNameZh Component name (Chinese)
     */
    public void setItemNameZh(String ItemNameZh) {
        this.ItemNameZh = ItemNameZh;
    }

    /**
     * Get Component name (English) 
     * @return ItemNameEn Component name (English)
     */
    public String getItemNameEn() {
        return this.ItemNameEn;
    }

    /**
     * Set Component name (English)
     * @param ItemNameEn Component name (English)
     */
    public void setItemNameEn(String ItemNameEn) {
        this.ItemNameEn = ItemNameEn;
    }

    public ResourceSpuSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpuSet(ResourceSpuSet source) {
        if (source.SpuNameZh != null) {
            this.SpuNameZh = new String(source.SpuNameZh);
        }
        if (source.SpuNameEn != null) {
            this.SpuNameEn = new String(source.SpuNameEn);
        }
        if (source.CategoryNameZh != null) {
            this.CategoryNameZh = new String(source.CategoryNameZh);
        }
        if (source.CategoryNameEn != null) {
            this.CategoryNameEn = new String(source.CategoryNameEn);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessNameZh != null) {
            this.BusinessNameZh = new String(source.BusinessNameZh);
        }
        if (source.BusinessNameEn != null) {
            this.BusinessNameEn = new String(source.BusinessNameEn);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductNameZh != null) {
            this.ProductNameZh = new String(source.ProductNameZh);
        }
        if (source.ProductNameEn != null) {
            this.ProductNameEn = new String(source.ProductNameEn);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ComponentNameZh != null) {
            this.ComponentNameZh = new String(source.ComponentNameZh);
        }
        if (source.ComponentNameEn != null) {
            this.ComponentNameEn = new String(source.ComponentNameEn);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemNameZh != null) {
            this.ItemNameZh = new String(source.ItemNameZh);
        }
        if (source.ItemNameEn != null) {
            this.ItemNameEn = new String(source.ItemNameEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpuNameZh", this.SpuNameZh);
        this.setParamSimple(map, prefix + "SpuNameEn", this.SpuNameEn);
        this.setParamSimple(map, prefix + "CategoryNameZh", this.CategoryNameZh);
        this.setParamSimple(map, prefix + "CategoryNameEn", this.CategoryNameEn);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessNameZh", this.BusinessNameZh);
        this.setParamSimple(map, prefix + "BusinessNameEn", this.BusinessNameEn);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductNameZh", this.ProductNameZh);
        this.setParamSimple(map, prefix + "ProductNameEn", this.ProductNameEn);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ComponentNameZh", this.ComponentNameZh);
        this.setParamSimple(map, prefix + "ComponentNameEn", this.ComponentNameEn);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemNameZh", this.ItemNameZh);
        this.setParamSimple(map, prefix + "ItemNameEn", this.ItemNameEn);

    }
}

