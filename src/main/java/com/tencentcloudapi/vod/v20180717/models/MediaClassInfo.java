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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaClassInfo extends AbstractModel {

    /**
    * Category ID.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Parent category ID. The parent category ID of a first-level category is -1.
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * Category name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Category level. The level-1 category is 0, and the maximum value is 3, which allows up to 4 classification layers.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * ID set of level-1 subcategories in the current category.
    */
    @SerializedName("SubClassIdSet")
    @Expose
    private Long [] SubClassIdSet;

    /**
    * Category name (this field is not recommended. Use the new category name field Name instead).
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
     * Get Category ID. 
     * @return ClassId Category ID.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID.
     * @param ClassId Category ID.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Parent category ID. The parent category ID of a first-level category is -1. 
     * @return ParentId Parent category ID. The parent category ID of a first-level category is -1.
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent category ID. The parent category ID of a first-level category is -1.
     * @param ParentId Parent category ID. The parent category ID of a first-level category is -1.
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Category name. 
     * @return Name Category name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Category name.
     * @param Name Category name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Category level. The level-1 category is 0, and the maximum value is 3, which allows up to 4 classification layers. 
     * @return Level Category level. The level-1 category is 0, and the maximum value is 3, which allows up to 4 classification layers.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Category level. The level-1 category is 0, and the maximum value is 3, which allows up to 4 classification layers.
     * @param Level Category level. The level-1 category is 0, and the maximum value is 3, which allows up to 4 classification layers.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get ID set of level-1 subcategories in the current category. 
     * @return SubClassIdSet ID set of level-1 subcategories in the current category.
     */
    public Long [] getSubClassIdSet() {
        return this.SubClassIdSet;
    }

    /**
     * Set ID set of level-1 subcategories in the current category.
     * @param SubClassIdSet ID set of level-1 subcategories in the current category.
     */
    public void setSubClassIdSet(Long [] SubClassIdSet) {
        this.SubClassIdSet = SubClassIdSet;
    }

    /**
     * Get Category name (this field is not recommended. Use the new category name field Name instead). 
     * @return ClassName Category name (this field is not recommended. Use the new category name field Name instead).
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Category name (this field is not recommended. Use the new category name field Name instead).
     * @param ClassName Category name (this field is not recommended. Use the new category name field Name instead).
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public MediaClassInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaClassInfo(MediaClassInfo source) {
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SubClassIdSet != null) {
            this.SubClassIdSet = new Long[source.SubClassIdSet.length];
            for (int i = 0; i < source.SubClassIdSet.length; i++) {
                this.SubClassIdSet[i] = new Long(source.SubClassIdSet[i]);
            }
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "SubClassIdSet.", this.SubClassIdSet);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);

    }
}

