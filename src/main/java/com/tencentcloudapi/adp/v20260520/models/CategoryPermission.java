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

public class CategoryPermission extends AbstractModel {

    /**
    * <p>Whether the current user can add subcategories</p>
    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * <p>Whether the current user can delete the category</p>
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * <p>Whether the current user can edit this category</p>
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
     * Get <p>Whether the current user can add subcategories</p> 
     * @return CanAdd <p>Whether the current user can add subcategories</p>
     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set <p>Whether the current user can add subcategories</p>
     * @param CanAdd <p>Whether the current user can add subcategories</p>
     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get <p>Whether the current user can delete the category</p> 
     * @return CanDelete <p>Whether the current user can delete the category</p>
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set <p>Whether the current user can delete the category</p>
     * @param CanDelete <p>Whether the current user can delete the category</p>
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get <p>Whether the current user can edit this category</p> 
     * @return CanEdit <p>Whether the current user can edit this category</p>
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set <p>Whether the current user can edit this category</p>
     * @param CanEdit <p>Whether the current user can edit this category</p>
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    public CategoryPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryPermission(CategoryPermission source) {
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);

    }
}

