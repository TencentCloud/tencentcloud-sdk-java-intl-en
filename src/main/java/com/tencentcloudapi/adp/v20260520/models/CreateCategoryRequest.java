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

public class CreateCategoryRequest extends AbstractModel {

    /**
    * <p>Classification type (0 is not allowed. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>Associated knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Category name (length: 1–64 characters)</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Parent category ID</p>
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private String ParentCategoryId;

    /**
     * Get <p>Classification type (0 is not allowed. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p> 
     * @return CategoryType <p>Classification type (0 is not allowed. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>Classification type (0 is not allowed. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     * @param CategoryType <p>Classification type (0 is not allowed. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>Associated knowledge base ID</p> 
     * @return KbId <p>Associated knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Associated knowledge base ID</p>
     * @param KbId <p>Associated knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Category name (length: 1–64 characters)</p> 
     * @return Name <p>Category name (length: 1–64 characters)</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Category name (length: 1–64 characters)</p>
     * @param Name <p>Category name (length: 1–64 characters)</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Parent category ID</p> 
     * @return ParentCategoryId <p>Parent category ID</p>
     */
    public String getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set <p>Parent category ID</p>
     * @param ParentCategoryId <p>Parent category ID</p>
     */
    public void setParentCategoryId(String ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    public CreateCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCategoryRequest(CreateCategoryRequest source) {
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new String(source.ParentCategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);

    }
}

