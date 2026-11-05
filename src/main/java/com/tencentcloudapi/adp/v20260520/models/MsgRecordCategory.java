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

public class MsgRecordCategory extends AbstractModel {

    /**
    * <p>Business ID of the category</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Subcategory list, tree nesting</p>
    */
    @SerializedName("Children")
    @Expose
    private MsgRecordCategory [] Children;

    /**
    * <p>Category name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Operation permissions of the current user on this category.</p>
    */
    @SerializedName("Permission")
    @Expose
    private CategoryPermission Permission;

    /**
    * <p>The number of message records in this category</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
     * Get <p>Business ID of the category</p> 
     * @return CategoryId <p>Business ID of the category</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Business ID of the category</p>
     * @param CategoryId <p>Business ID of the category</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Subcategory list, tree nesting</p> 
     * @return Children <p>Subcategory list, tree nesting</p>
     */
    public MsgRecordCategory [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>Subcategory list, tree nesting</p>
     * @param Children <p>Subcategory list, tree nesting</p>
     */
    public void setChildren(MsgRecordCategory [] Children) {
        this.Children = Children;
    }

    /**
     * Get <p>Category name</p> 
     * @return Name <p>Category name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Category name</p>
     * @param Name <p>Category name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Operation permissions of the current user on this category.</p> 
     * @return Permission <p>Operation permissions of the current user on this category.</p>
     */
    public CategoryPermission getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>Operation permissions of the current user on this category.</p>
     * @param Permission <p>Operation permissions of the current user on this category.</p>
     */
    public void setPermission(CategoryPermission Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>The number of message records in this category</p> 
     * @return TotalCount <p>The number of message records in this category</p>
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>The number of message records in this category</p>
     * @param TotalCount <p>The number of message records in this category</p>
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    public MsgRecordCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordCategory(MsgRecordCategory source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.Children != null) {
            this.Children = new MsgRecordCategory[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new MsgRecordCategory(source.Children[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Permission != null) {
            this.Permission = new CategoryPermission(source.Permission);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

