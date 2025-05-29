/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QACate extends AbstractModel {

    /**
    * Q&A category business ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * Category name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Quantity of Q&As under the category.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Whether it is possible to add.
    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * Whether it can be edited.
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * Whether it can be deleted.
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * Subcategory.
    */
    @SerializedName("Children")
    @Expose
    private QACate [] Children;

    /**
     * Get Q&A category business ID. 
     * @return CateBizId Q&A category business ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Q&A category business ID.
     * @param CateBizId Q&A category business ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
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
     * Get Quantity of Q&As under the category. 
     * @return Total Quantity of Q&As under the category.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Quantity of Q&As under the category.
     * @param Total Quantity of Q&As under the category.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Whether it is possible to add. 
     * @return CanAdd Whether it is possible to add.
     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set Whether it is possible to add.
     * @param CanAdd Whether it is possible to add.
     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get Whether it can be edited. 
     * @return CanEdit Whether it can be edited.
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set Whether it can be edited.
     * @param CanEdit Whether it can be edited.
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get Whether it can be deleted. 
     * @return CanDelete Whether it can be deleted.
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set Whether it can be deleted.
     * @param CanDelete Whether it can be deleted.
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get Subcategory. 
     * @return Children Subcategory.
     */
    public QACate [] getChildren() {
        return this.Children;
    }

    /**
     * Set Subcategory.
     * @param Children Subcategory.
     */
    public void setChildren(QACate [] Children) {
        this.Children = Children;
    }

    public QACate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QACate(QACate source) {
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.Children != null) {
            this.Children = new QACate[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new QACate(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

