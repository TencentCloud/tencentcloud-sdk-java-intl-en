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

public class BaselineSystemCategory extends AbstractModel {

    /**
    * <p>List of subcategories under the parent category (each subcategory includes its built-in detection item ID list).</p>
    */
    @SerializedName("SubCategoryList")
    @Expose
    private BaselineSubCategory [] SubCategoryList;

    /**
    * <p>System parent category basic information (ID, name, description, CheckAssetType).</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>Detection item count</p>
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
     * Get <p>List of subcategories under the parent category (each subcategory includes its built-in detection item ID list).</p> 
     * @return SubCategoryList <p>List of subcategories under the parent category (each subcategory includes its built-in detection item ID list).</p>
     */
    public BaselineSubCategory [] getSubCategoryList() {
        return this.SubCategoryList;
    }

    /**
     * Set <p>List of subcategories under the parent category (each subcategory includes its built-in detection item ID list).</p>
     * @param SubCategoryList <p>List of subcategories under the parent category (each subcategory includes its built-in detection item ID list).</p>
     */
    public void setSubCategoryList(BaselineSubCategory [] SubCategoryList) {
        this.SubCategoryList = SubCategoryList;
    }

    /**
     * Get <p>System parent category basic information (ID, name, description, CheckAssetType).</p> 
     * @return Category <p>System parent category basic information (ID, name, description, CheckAssetType).</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>System parent category basic information (ID, name, description, CheckAssetType).</p>
     * @param Category <p>System parent category basic information (ID, name, description, CheckAssetType).</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Detection item count</p> 
     * @return ItemCount <p>Detection item count</p>
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set <p>Detection item count</p>
     * @param ItemCount <p>Detection item count</p>
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    public BaselineSystemCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSystemCategory(BaselineSystemCategory source) {
        if (source.SubCategoryList != null) {
            this.SubCategoryList = new BaselineSubCategory[source.SubCategoryList.length];
            for (int i = 0; i < source.SubCategoryList.length; i++) {
                this.SubCategoryList[i] = new BaselineSubCategory(source.SubCategoryList[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SubCategoryList.", this.SubCategoryList);
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);

    }
}

