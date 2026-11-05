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

public class KBCategory extends AbstractModel {

    /**
    * <p>Whether it can be added</p>
    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * <p>Whether it is deletable</p>
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * <p>Whether it is editable</p>
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * <p>Category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Subcategory list.</p>
    */
    @SerializedName("ChildList")
    @Expose
    private KBCategory [] ChildList;

    /**
    * <p>Is leaf node (no subcategory)</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>The number of category objects</p>
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * <p>Metadata configuration (configuration message when this category is set as metadata)</p>
    */
    @SerializedName("MetaValue")
    @Expose
    private MetaValue MetaValue;

    /**
    * <p>Category name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Whether it can be added</p> 
     * @return CanAdd <p>Whether it can be added</p>
     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set <p>Whether it can be added</p>
     * @param CanAdd <p>Whether it can be added</p>
     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get <p>Whether it is deletable</p> 
     * @return CanDelete <p>Whether it is deletable</p>
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set <p>Whether it is deletable</p>
     * @param CanDelete <p>Whether it is deletable</p>
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get <p>Whether it is editable</p> 
     * @return CanEdit <p>Whether it is editable</p>
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set <p>Whether it is editable</p>
     * @param CanEdit <p>Whether it is editable</p>
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get <p>Category ID</p> 
     * @return CategoryId <p>Category ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID</p>
     * @param CategoryId <p>Category ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Subcategory list.</p> 
     * @return ChildList <p>Subcategory list.</p>
     */
    public KBCategory [] getChildList() {
        return this.ChildList;
    }

    /**
     * Set <p>Subcategory list.</p>
     * @param ChildList <p>Subcategory list.</p>
     */
    public void setChildList(KBCategory [] ChildList) {
        this.ChildList = ChildList;
    }

    /**
     * Get <p>Is leaf node (no subcategory)</p> 
     * @return IsLeaf <p>Is leaf node (no subcategory)</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>Is leaf node (no subcategory)</p>
     * @param IsLeaf <p>Is leaf node (no subcategory)</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>The number of category objects</p> 
     * @return ItemCount <p>The number of category objects</p>
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set <p>The number of category objects</p>
     * @param ItemCount <p>The number of category objects</p>
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get <p>Metadata configuration (configuration message when this category is set as metadata)</p> 
     * @return MetaValue <p>Metadata configuration (configuration message when this category is set as metadata)</p>
     */
    public MetaValue getMetaValue() {
        return this.MetaValue;
    }

    /**
     * Set <p>Metadata configuration (configuration message when this category is set as metadata)</p>
     * @param MetaValue <p>Metadata configuration (configuration message when this category is set as metadata)</p>
     */
    public void setMetaValue(MetaValue MetaValue) {
        this.MetaValue = MetaValue;
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

    public KBCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBCategory(KBCategory source) {
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.ChildList != null) {
            this.ChildList = new KBCategory[source.ChildList.length];
            for (int i = 0; i < source.ChildList.length; i++) {
                this.ChildList[i] = new KBCategory(source.ChildList[i]);
            }
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.MetaValue != null) {
            this.MetaValue = new MetaValue(source.MetaValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "ChildList.", this.ChildList);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamObj(map, prefix + "MetaValue.", this.MetaValue);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

