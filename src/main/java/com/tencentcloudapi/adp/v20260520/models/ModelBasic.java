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

public class ModelBasic extends AbstractModel {

    /**
    * <p>Model description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Model icon address</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Model ID</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>Model type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM model</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank model</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding model</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>Document parsing model</td></tr></table>
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * <p>Model name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Model description</p> 
     * @return Description <p>Model description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Model description</p>
     * @param Description <p>Model description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Model icon address</p> 
     * @return IconUrl <p>Model icon address</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>Model icon address</p>
     * @param IconUrl <p>Model icon address</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Model ID</p> 
     * @return ModelId <p>Model ID</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>Model ID</p>
     * @param ModelId <p>Model ID</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>Model type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM model</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank model</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding model</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>Document parsing model</td></tr></table> 
     * @return ModelType <p>Model type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM model</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank model</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding model</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>Document parsing model</td></tr></table>
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>Model type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM model</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank model</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding model</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>Document parsing model</td></tr></table>
     * @param ModelType <p>Model type</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>MODEL_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>MODEL_TYPE_LLM</td><td>1</td><td>LLM model</td></tr><tr><td>MODEL_TYPE_RERANK</td><td>2</td><td>Rerank model</td></tr><tr><td>MODEL_TYPE_EMBEDDING</td><td>3</td><td>Embedding model</td></tr><tr><td>MODEL_TYPE_FILE_PARSE</td><td>4</td><td>Document parsing model</td></tr></table>
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>Model name</p> 
     * @return Name <p>Model name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Model name</p>
     * @param Name <p>Model name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModelBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelBasic(ModelBasic source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

