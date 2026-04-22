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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CategoryInfo extends AbstractModel {

    /**
    * Category ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Category name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subcategory information
    */
    @SerializedName("SubItems")
    @Expose
    private CategoryItem [] SubItems;

    /**
     * Get Category ID 
     * @return ID Category ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Category ID
     * @param ID Category ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Category name 
     * @return Name Category name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Category name
     * @param Name Category name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subcategory information 
     * @return SubItems Subcategory information
     */
    public CategoryItem [] getSubItems() {
        return this.SubItems;
    }

    /**
     * Set Subcategory information
     * @param SubItems Subcategory information
     */
    public void setSubItems(CategoryItem [] SubItems) {
        this.SubItems = SubItems;
    }

    public CategoryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryInfo(CategoryInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubItems != null) {
            this.SubItems = new CategoryItem[source.SubItems.length];
            for (int i = 0; i < source.SubItems.length; i++) {
                this.SubItems[i] = new CategoryItem(source.SubItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SubItems.", this.SubItems);

    }
}

