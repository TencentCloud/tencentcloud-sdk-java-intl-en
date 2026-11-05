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

public class MetaValue extends AbstractModel {

    /**
    * <p>Metadata value name (for display only).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Whether to refer to all values of this type (when true, ref_value_id should be 0)</p>
    */
    @SerializedName("RefAll")
    @Expose
    private Boolean RefAll;

    /**
    * <p>Business ID referenced by metadata (property ID, category ID, etc.); this field should be 0 when ref_all=true</p>
    */
    @SerializedName("RefValueId")
    @Expose
    private String RefValueId;

    /**
    * <p>Metadata usage scenario: 1=retrieve only, 2=both retrieve and generate<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>Retrieve only</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>Both retrieve and generate</td></tr></tbody></table></p>
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * <p>Metadata value type: 1=property tag, 2=document classification, 3=QA classification<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>Property tag</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>Document classification</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>QA classification</td></tr></tbody></table></p>
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
     * Get <p>Metadata value name (for display only).</p> 
     * @return Name <p>Metadata value name (for display only).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Metadata value name (for display only).</p>
     * @param Name <p>Metadata value name (for display only).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Whether to refer to all values of this type (when true, ref_value_id should be 0)</p> 
     * @return RefAll <p>Whether to refer to all values of this type (when true, ref_value_id should be 0)</p>
     */
    public Boolean getRefAll() {
        return this.RefAll;
    }

    /**
     * Set <p>Whether to refer to all values of this type (when true, ref_value_id should be 0)</p>
     * @param RefAll <p>Whether to refer to all values of this type (when true, ref_value_id should be 0)</p>
     */
    public void setRefAll(Boolean RefAll) {
        this.RefAll = RefAll;
    }

    /**
     * Get <p>Business ID referenced by metadata (property ID, category ID, etc.); this field should be 0 when ref_all=true</p> 
     * @return RefValueId <p>Business ID referenced by metadata (property ID, category ID, etc.); this field should be 0 when ref_all=true</p>
     */
    public String getRefValueId() {
        return this.RefValueId;
    }

    /**
     * Set <p>Business ID referenced by metadata (property ID, category ID, etc.); this field should be 0 when ref_all=true</p>
     * @param RefValueId <p>Business ID referenced by metadata (property ID, category ID, etc.); this field should be 0 when ref_all=true</p>
     */
    public void setRefValueId(String RefValueId) {
        this.RefValueId = RefValueId;
    }

    /**
     * Get <p>Metadata usage scenario: 1=retrieve only, 2=both retrieve and generate<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>Retrieve only</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>Both retrieve and generate</td></tr></tbody></table></p> 
     * @return Scene <p>Metadata usage scenario: 1=retrieve only, 2=both retrieve and generate<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>Retrieve only</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>Both retrieve and generate</td></tr></tbody></table></p>
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set <p>Metadata usage scenario: 1=retrieve only, 2=both retrieve and generate<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>Retrieve only</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>Both retrieve and generate</td></tr></tbody></table></p>
     * @param Scene <p>Metadata usage scenario: 1=retrieve only, 2=both retrieve and generate<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>Retrieve only</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>Both retrieve and generate</td></tr></tbody></table></p>
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>Metadata value type: 1=property tag, 2=document classification, 3=QA classification<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>Property tag</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>Document classification</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>QA classification</td></tr></tbody></table></p> 
     * @return ValueType <p>Metadata value type: 1=property tag, 2=document classification, 3=QA classification<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>Property tag</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>Document classification</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>QA classification</td></tr></tbody></table></p>
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>Metadata value type: 1=property tag, 2=document classification, 3=QA classification<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>Property tag</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>Document classification</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>QA classification</td></tr></tbody></table></p>
     * @param ValueType <p>Metadata value type: 1=property tag, 2=document classification, 3=QA classification<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>Unknown</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>Property tag</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>Document classification</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>QA classification</td></tr></tbody></table></p>
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    public MetaValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaValue(MetaValue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RefAll != null) {
            this.RefAll = new Boolean(source.RefAll);
        }
        if (source.RefValueId != null) {
            this.RefValueId = new String(source.RefValueId);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RefAll", this.RefAll);
        this.setParamSimple(map, prefix + "RefValueId", this.RefValueId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

