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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillCategory extends AbstractModel {

    /**
    * Category identifier
    */
    @SerializedName("CategoryKey")
    @Expose
    private String CategoryKey;

    /**
    * Category name
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
     * Get Category identifier 
     * @return CategoryKey Category identifier
     */
    public String getCategoryKey() {
        return this.CategoryKey;
    }

    /**
     * Set Category identifier
     * @param CategoryKey Category identifier
     */
    public void setCategoryKey(String CategoryKey) {
        this.CategoryKey = CategoryKey;
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

    public SkillCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillCategory(SkillCategory source) {
        if (source.CategoryKey != null) {
            this.CategoryKey = new String(source.CategoryKey);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryKey", this.CategoryKey);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);

    }
}

