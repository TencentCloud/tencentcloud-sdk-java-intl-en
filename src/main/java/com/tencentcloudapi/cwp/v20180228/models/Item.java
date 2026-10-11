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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item extends AbstractModel {

    /**
    * Id
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Custom threshold.
    */
    @SerializedName("CustomItemValues")
    @Expose
    private Long [] CustomItemValues;

    /**
    * Category of a detection item.
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
     * Get Id 
     * @return ItemId Id
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Id
     * @param ItemId Id
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Name 
     * @return ItemName Name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Name
     * @param ItemName Name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Custom threshold. 
     * @return CustomItemValues Custom threshold.
     */
    public Long [] getCustomItemValues() {
        return this.CustomItemValues;
    }

    /**
     * Set Custom threshold.
     * @param CustomItemValues Custom threshold.
     */
    public void setCustomItemValues(Long [] CustomItemValues) {
        this.CustomItemValues = CustomItemValues;
    }

    /**
     * Get Category of a detection item. 
     * @return CategoryId Category of a detection item.
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Category of a detection item.
     * @param CategoryId Category of a detection item.
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.CustomItemValues != null) {
            this.CustomItemValues = new Long[source.CustomItemValues.length];
            for (int i = 0; i < source.CustomItemValues.length; i++) {
                this.CustomItemValues[i] = new Long(source.CustomItemValues[i]);
            }
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamArraySimple(map, prefix + "CustomItemValues.", this.CustomItemValues);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);

    }
}

