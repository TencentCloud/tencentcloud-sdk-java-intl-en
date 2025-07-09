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
    * The category ID.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Parent category ID, which is -1 for a first-level category.
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * The category name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Category level. 0 for first-level category, up to 3, i.e., up to 4 levels of categories are allowed.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * The IDs of the immediate subcategories of the current category.
    */
    @SerializedName("SubClassIdSet")
    @Expose
    private Long [] SubClassIdSet;

    /**
    * The category name. This parameter is not recommended. Please use `Name` instead.
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
     * Get The category ID. 
     * @return ClassId The category ID.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set The category ID.
     * @param ClassId The category ID.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Parent category ID, which is -1 for a first-level category. 
     * @return ParentId Parent category ID, which is -1 for a first-level category.
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent category ID, which is -1 for a first-level category.
     * @param ParentId Parent category ID, which is -1 for a first-level category.
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get The category name. 
     * @return Name The category name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The category name.
     * @param Name The category name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Category level. 0 for first-level category, up to 3, i.e., up to 4 levels of categories are allowed. 
     * @return Level Category level. 0 for first-level category, up to 3, i.e., up to 4 levels of categories are allowed.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Category level. 0 for first-level category, up to 3, i.e., up to 4 levels of categories are allowed.
     * @param Level Category level. 0 for first-level category, up to 3, i.e., up to 4 levels of categories are allowed.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get The IDs of the immediate subcategories of the current category. 
     * @return SubClassIdSet The IDs of the immediate subcategories of the current category.
     */
    public Long [] getSubClassIdSet() {
        return this.SubClassIdSet;
    }

    /**
     * Set The IDs of the immediate subcategories of the current category.
     * @param SubClassIdSet The IDs of the immediate subcategories of the current category.
     */
    public void setSubClassIdSet(Long [] SubClassIdSet) {
        this.SubClassIdSet = SubClassIdSet;
    }

    /**
     * Get The category name. This parameter is not recommended. Please use `Name` instead. 
     * @return ClassName The category name. This parameter is not recommended. Please use `Name` instead.
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set The category name. This parameter is not recommended. Please use `Name` instead.
     * @param ClassName The category name. This parameter is not recommended. Please use `Name` instead.
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

