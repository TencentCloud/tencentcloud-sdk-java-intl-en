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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item extends AbstractModel {

    /**
    * <p>The unique ID of the item</p>
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * <p>The name of the item</p>
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * <p>The category of the item</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>The price of the item</p>
    */
    @SerializedName("Price")
    @Expose
    private Amount Price;

    /**
    * <p>If the item has a UPC (Universal Product Code), please provide it here.</p>
    */
    @SerializedName("UPC")
    @Expose
    private String UPC;

    /**
    * <p>If the item has an EAN (European Article Number), please provide it here.</p>
    */
    @SerializedName("EAN")
    @Expose
    private String EAN;

    /**
    * <p>If the item has an SKU (Stock Keeping Unit), please provide it here.</p>
    */
    @SerializedName("SKU")
    @Expose
    private String SKU;

    /**
    * <p>If the item has an ISBN (International Standard Book Number), please provide it here.</p>
    */
    @SerializedName("ISBN")
    @Expose
    private String ISBN;

    /**
    * <p>The brand of the item</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>The quantity of the item</p>
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * <p>The manufacture of the item</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>The tags of the item in your system</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get <p>The unique ID of the item</p> 
     * @return ItemId <p>The unique ID of the item</p>
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set <p>The unique ID of the item</p>
     * @param ItemId <p>The unique ID of the item</p>
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get <p>The name of the item</p> 
     * @return ItemName <p>The name of the item</p>
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set <p>The name of the item</p>
     * @param ItemName <p>The name of the item</p>
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get <p>The category of the item</p> 
     * @return Category <p>The category of the item</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>The category of the item</p>
     * @param Category <p>The category of the item</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>The price of the item</p> 
     * @return Price <p>The price of the item</p>
     */
    public Amount getPrice() {
        return this.Price;
    }

    /**
     * Set <p>The price of the item</p>
     * @param Price <p>The price of the item</p>
     */
    public void setPrice(Amount Price) {
        this.Price = Price;
    }

    /**
     * Get <p>If the item has a UPC (Universal Product Code), please provide it here.</p> 
     * @return UPC <p>If the item has a UPC (Universal Product Code), please provide it here.</p>
     */
    public String getUPC() {
        return this.UPC;
    }

    /**
     * Set <p>If the item has a UPC (Universal Product Code), please provide it here.</p>
     * @param UPC <p>If the item has a UPC (Universal Product Code), please provide it here.</p>
     */
    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    /**
     * Get <p>If the item has an EAN (European Article Number), please provide it here.</p> 
     * @return EAN <p>If the item has an EAN (European Article Number), please provide it here.</p>
     */
    public String getEAN() {
        return this.EAN;
    }

    /**
     * Set <p>If the item has an EAN (European Article Number), please provide it here.</p>
     * @param EAN <p>If the item has an EAN (European Article Number), please provide it here.</p>
     */
    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    /**
     * Get <p>If the item has an SKU (Stock Keeping Unit), please provide it here.</p> 
     * @return SKU <p>If the item has an SKU (Stock Keeping Unit), please provide it here.</p>
     */
    public String getSKU() {
        return this.SKU;
    }

    /**
     * Set <p>If the item has an SKU (Stock Keeping Unit), please provide it here.</p>
     * @param SKU <p>If the item has an SKU (Stock Keeping Unit), please provide it here.</p>
     */
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    /**
     * Get <p>If the item has an ISBN (International Standard Book Number), please provide it here.</p> 
     * @return ISBN <p>If the item has an ISBN (International Standard Book Number), please provide it here.</p>
     */
    public String getISBN() {
        return this.ISBN;
    }

    /**
     * Set <p>If the item has an ISBN (International Standard Book Number), please provide it here.</p>
     * @param ISBN <p>If the item has an ISBN (International Standard Book Number), please provide it here.</p>
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Get <p>The brand of the item</p> 
     * @return Brand <p>The brand of the item</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>The brand of the item</p>
     * @param Brand <p>The brand of the item</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>The quantity of the item</p> 
     * @return Quantity <p>The quantity of the item</p>
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set <p>The quantity of the item</p>
     * @param Quantity <p>The quantity of the item</p>
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get <p>The manufacture of the item</p> 
     * @return Manufacturer <p>The manufacture of the item</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>The manufacture of the item</p>
     * @param Manufacturer <p>The manufacture of the item</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>The tags of the item in your system</p> 
     * @return Tags <p>The tags of the item in your system</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>The tags of the item in your system</p>
     * @param Tags <p>The tags of the item in your system</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Price != null) {
            this.Price = new Amount(source.Price);
        }
        if (source.UPC != null) {
            this.UPC = new String(source.UPC);
        }
        if (source.EAN != null) {
            this.EAN = new String(source.EAN);
        }
        if (source.SKU != null) {
            this.SKU = new String(source.SKU);
        }
        if (source.ISBN != null) {
            this.ISBN = new String(source.ISBN);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "UPC", this.UPC);
        this.setParamSimple(map, prefix + "EAN", this.EAN);
        this.setParamSimple(map, prefix + "SKU", this.SKU);
        this.setParamSimple(map, prefix + "ISBN", this.ISBN);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

