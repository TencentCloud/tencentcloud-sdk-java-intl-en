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

public class DeleteCategoryRequest extends AbstractModel {

    /**
    * <p>Category ID to be deleted</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Classification type (cannot be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
     * Get <p>Category ID to be deleted</p> 
     * @return CategoryId <p>Category ID to be deleted</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID to be deleted</p>
     * @param CategoryId <p>Category ID to be deleted</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Classification type (cannot be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p> 
     * @return CategoryType <p>Classification type (cannot be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>Classification type (cannot be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     * @param CategoryType <p>Classification type (cannot be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    public DeleteCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCategoryRequest(DeleteCategoryRequest source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "KbId", this.KbId);

    }
}

