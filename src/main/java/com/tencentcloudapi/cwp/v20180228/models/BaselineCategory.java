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

public class BaselineCategory extends AbstractModel {

    /**
    * Category ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * Category name
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * Parent Category ID. No parent category if it is 0.
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private Long ParentCategoryId;

    /**
    * Total number of detection items under a subcategory.
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
     * Get Category ID 
     * @return CategoryId Category ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Category ID
     * @param CategoryId Category ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Category name 
     * @return CategoryName Category name
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set Category name
     * @param CategoryName Category name
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get Parent Category ID. No parent category if it is 0. 
     * @return ParentCategoryId Parent Category ID. No parent category if it is 0.
     */
    public Long getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set Parent Category ID. No parent category if it is 0.
     * @param ParentCategoryId Parent Category ID. No parent category if it is 0.
     */
    public void setParentCategoryId(Long ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    /**
     * Get Total number of detection items under a subcategory. 
     * @return ItemCount Total number of detection items under a subcategory.
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set Total number of detection items under a subcategory.
     * @param ItemCount Total number of detection items under a subcategory.
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    public BaselineCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineCategory(BaselineCategory source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new Long(source.ParentCategoryId);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);

    }
}

