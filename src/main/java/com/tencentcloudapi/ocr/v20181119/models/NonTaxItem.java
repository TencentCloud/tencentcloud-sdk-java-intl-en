/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NonTaxItem extends AbstractModel {

    /**
    * Item code
    */
    @SerializedName("ItemID")
    @Expose
    private String ItemID;

    /**
    * Item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Unit
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Quantity
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * Standard
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
     * Get Item code 
     * @return ItemID Item code
     */
    public String getItemID() {
        return this.ItemID;
    }

    /**
     * Set Item code
     * @param ItemID Item code
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get Item name 
     * @return Name Item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Item name
     * @param Name Item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Unit 
     * @return Unit Unit
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit
     * @param Unit Unit
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Quantity 
     * @return Quantity Quantity
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set Quantity
     * @param Quantity Quantity
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get Standard 
     * @return Standard Standard
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set Standard
     * @param Standard Standard
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get Amount 
     * @return Total Amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Amount
     * @param Total Amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    public NonTaxItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NonTaxItem(NonTaxItem source) {
        if (source.ItemID != null) {
            this.ItemID = new String(source.ItemID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

