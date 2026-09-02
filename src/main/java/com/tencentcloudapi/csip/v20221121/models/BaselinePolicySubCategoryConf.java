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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicySubCategoryConf extends AbstractModel {

    /**
    * <p>Baseline subcategory ID.</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>Whether to select all detection items under this subcategory. true: select all; false: take effect based on the ItemIDList details.</p>
    */
    @SerializedName("AllSelect")
    @Expose
    private Boolean AllSelect;

    /**
    * <p>List of selected testing item IDs, which take effect by this detail when AllSelect=false.</p>
    */
    @SerializedName("ItemIDList")
    @Expose
    private Long [] ItemIDList;

    /**
     * Get <p>Baseline subcategory ID.</p> 
     * @return CategoryID <p>Baseline subcategory ID.</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>Baseline subcategory ID.</p>
     * @param CategoryID <p>Baseline subcategory ID.</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>Whether to select all detection items under this subcategory. true: select all; false: take effect based on the ItemIDList details.</p> 
     * @return AllSelect <p>Whether to select all detection items under this subcategory. true: select all; false: take effect based on the ItemIDList details.</p>
     */
    public Boolean getAllSelect() {
        return this.AllSelect;
    }

    /**
     * Set <p>Whether to select all detection items under this subcategory. true: select all; false: take effect based on the ItemIDList details.</p>
     * @param AllSelect <p>Whether to select all detection items under this subcategory. true: select all; false: take effect based on the ItemIDList details.</p>
     */
    public void setAllSelect(Boolean AllSelect) {
        this.AllSelect = AllSelect;
    }

    /**
     * Get <p>List of selected testing item IDs, which take effect by this detail when AllSelect=false.</p> 
     * @return ItemIDList <p>List of selected testing item IDs, which take effect by this detail when AllSelect=false.</p>
     */
    public Long [] getItemIDList() {
        return this.ItemIDList;
    }

    /**
     * Set <p>List of selected testing item IDs, which take effect by this detail when AllSelect=false.</p>
     * @param ItemIDList <p>List of selected testing item IDs, which take effect by this detail when AllSelect=false.</p>
     */
    public void setItemIDList(Long [] ItemIDList) {
        this.ItemIDList = ItemIDList;
    }

    public BaselinePolicySubCategoryConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicySubCategoryConf(BaselinePolicySubCategoryConf source) {
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.AllSelect != null) {
            this.AllSelect = new Boolean(source.AllSelect);
        }
        if (source.ItemIDList != null) {
            this.ItemIDList = new Long[source.ItemIDList.length];
            for (int i = 0; i < source.ItemIDList.length; i++) {
                this.ItemIDList[i] = new Long(source.ItemIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "AllSelect", this.AllSelect);
        this.setParamArraySimple(map, prefix + "ItemIDList.", this.ItemIDList);

    }
}

