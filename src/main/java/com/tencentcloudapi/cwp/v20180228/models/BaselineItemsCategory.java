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

public class BaselineItemsCategory extends AbstractModel {

    /**
    * Parent category ID of a baseline detection item.
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private Long ParentCategoryId;

    /**
    * Parent category name of a baseline detection item.
    */
    @SerializedName("ParentCategoryName")
    @Expose
    private String ParentCategoryName;

    /**
    * Number of baseline detection item subcategories.
    */
    @SerializedName("CategoryCount")
    @Expose
    private Long CategoryCount;

    /**
    * Baseline detection item subcategory list.
    */
    @SerializedName("CategoryLists")
    @Expose
    private BaselineCategory [] CategoryLists;

    /**
     * Get Parent category ID of a baseline detection item. 
     * @return ParentCategoryId Parent category ID of a baseline detection item.
     */
    public Long getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set Parent category ID of a baseline detection item.
     * @param ParentCategoryId Parent category ID of a baseline detection item.
     */
    public void setParentCategoryId(Long ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    /**
     * Get Parent category name of a baseline detection item. 
     * @return ParentCategoryName Parent category name of a baseline detection item.
     */
    public String getParentCategoryName() {
        return this.ParentCategoryName;
    }

    /**
     * Set Parent category name of a baseline detection item.
     * @param ParentCategoryName Parent category name of a baseline detection item.
     */
    public void setParentCategoryName(String ParentCategoryName) {
        this.ParentCategoryName = ParentCategoryName;
    }

    /**
     * Get Number of baseline detection item subcategories. 
     * @return CategoryCount Number of baseline detection item subcategories.
     */
    public Long getCategoryCount() {
        return this.CategoryCount;
    }

    /**
     * Set Number of baseline detection item subcategories.
     * @param CategoryCount Number of baseline detection item subcategories.
     */
    public void setCategoryCount(Long CategoryCount) {
        this.CategoryCount = CategoryCount;
    }

    /**
     * Get Baseline detection item subcategory list. 
     * @return CategoryLists Baseline detection item subcategory list.
     */
    public BaselineCategory [] getCategoryLists() {
        return this.CategoryLists;
    }

    /**
     * Set Baseline detection item subcategory list.
     * @param CategoryLists Baseline detection item subcategory list.
     */
    public void setCategoryLists(BaselineCategory [] CategoryLists) {
        this.CategoryLists = CategoryLists;
    }

    public BaselineItemsCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemsCategory(BaselineItemsCategory source) {
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new Long(source.ParentCategoryId);
        }
        if (source.ParentCategoryName != null) {
            this.ParentCategoryName = new String(source.ParentCategoryName);
        }
        if (source.CategoryCount != null) {
            this.CategoryCount = new Long(source.CategoryCount);
        }
        if (source.CategoryLists != null) {
            this.CategoryLists = new BaselineCategory[source.CategoryLists.length];
            for (int i = 0; i < source.CategoryLists.length; i++) {
                this.CategoryLists[i] = new BaselineCategory(source.CategoryLists[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);
        this.setParamSimple(map, prefix + "ParentCategoryName", this.ParentCategoryName);
        this.setParamSimple(map, prefix + "CategoryCount", this.CategoryCount);
        this.setParamArrayObj(map, prefix + "CategoryLists.", this.CategoryLists);

    }
}

