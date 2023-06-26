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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatRollItem extends AbstractModel{

    /**
    * Item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Quantity
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * Unit price
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

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
     * Get Unit price 
     * @return Price Unit price
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price
     * @param Price Unit price
     */
    public void setPrice(String Price) {
        this.Price = Price;
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

    public VatRollItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatRollItem(VatRollItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

