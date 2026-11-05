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

public class ModifyCategoryRequest extends AbstractModel {

    /**
    * <p>Category ID to be modified (must be greater than 0)</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Classification type (not allowed to be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>Modify field content (required, used in conjunction with update_mask)</p>
    */
    @SerializedName("Fields")
    @Expose
    private CategoryModifyFields Fields;

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Field mask: specifies the field to modify (supported Paths: Name)</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>Category ID to be modified (must be greater than 0)</p> 
     * @return CategoryId <p>Category ID to be modified (must be greater than 0)</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID to be modified (must be greater than 0)</p>
     * @param CategoryId <p>Category ID to be modified (must be greater than 0)</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Classification type (not allowed to be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p> 
     * @return CategoryType <p>Classification type (not allowed to be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>Classification type (not allowed to be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     * @param CategoryType <p>Classification type (not allowed to be 0. Value: 1=document classification, 2=QA classification)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>Document classification</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>QA classification</td></tr></tbody></table></p>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>Modify field content (required, used in conjunction with update_mask)</p> 
     * @return Fields <p>Modify field content (required, used in conjunction with update_mask)</p>
     */
    public CategoryModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>Modify field content (required, used in conjunction with update_mask)</p>
     * @param Fields <p>Modify field content (required, used in conjunction with update_mask)</p>
     */
    public void setFields(CategoryModifyFields Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>ID of the knowledge base it belongs to</p> 
     * @return KbId <p>ID of the knowledge base it belongs to</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>ID of the knowledge base it belongs to</p>
     * @param KbId <p>ID of the knowledge base it belongs to</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Field mask: specifies the field to modify (supported Paths: Name)</p> 
     * @return UpdateMask <p>Field mask: specifies the field to modify (supported Paths: Name)</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask: specifies the field to modify (supported Paths: Name)</p>
     * @param UpdateMask <p>Field mask: specifies the field to modify (supported Paths: Name)</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCategoryRequest(ModifyCategoryRequest source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.Fields != null) {
            this.Fields = new CategoryModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

