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

public class FileParseModel extends AbstractModel {

    /**
    * Model alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Model description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Enhanced mode
    */
    @SerializedName("EnhancementMode")
    @Expose
    private String EnhancementMode;

    /**
    * Unique ID of a model
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Model type
    */
    @SerializedName("ModelProviderType")
    @Expose
    private String ModelProviderType;

    /**
    * Whether to enable formula enhancement
    */
    @SerializedName("EnableFormulaEnhancement")
    @Expose
    private Boolean EnableFormulaEnhancement;

    /**
    * Whether to enable LLM enhancement
    */
    @SerializedName("EnableLLMEnhancement")
    @Expose
    private Boolean EnableLLMEnhancement;

    /**
    * Whether to output an HTML table
    */
    @SerializedName("OutputHtmlTable")
    @Expose
    private Boolean OutputHtmlTable;

    /**
    * Supported file type list
    */
    @SerializedName("SupportedFileList")
    @Expose
    private SupportedFileType [] SupportedFileList;

    /**
     * Get Model alias 
     * @return Alias Model alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Model alias
     * @param Alias Model alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Model description 
     * @return Description Model description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Model description
     * @param Description Model description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Enhanced mode 
     * @return EnhancementMode Enhanced mode
     */
    public String getEnhancementMode() {
        return this.EnhancementMode;
    }

    /**
     * Set Enhanced mode
     * @param EnhancementMode Enhanced mode
     */
    public void setEnhancementMode(String EnhancementMode) {
        this.EnhancementMode = EnhancementMode;
    }

    /**
     * Get Unique ID of a model 
     * @return ModelId Unique ID of a model
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set Unique ID of a model
     * @param ModelId Unique ID of a model
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Model type 
     * @return ModelProviderType Model type
     */
    public String getModelProviderType() {
        return this.ModelProviderType;
    }

    /**
     * Set Model type
     * @param ModelProviderType Model type
     */
    public void setModelProviderType(String ModelProviderType) {
        this.ModelProviderType = ModelProviderType;
    }

    /**
     * Get Whether to enable formula enhancement 
     * @return EnableFormulaEnhancement Whether to enable formula enhancement
     */
    public Boolean getEnableFormulaEnhancement() {
        return this.EnableFormulaEnhancement;
    }

    /**
     * Set Whether to enable formula enhancement
     * @param EnableFormulaEnhancement Whether to enable formula enhancement
     */
    public void setEnableFormulaEnhancement(Boolean EnableFormulaEnhancement) {
        this.EnableFormulaEnhancement = EnableFormulaEnhancement;
    }

    /**
     * Get Whether to enable LLM enhancement 
     * @return EnableLLMEnhancement Whether to enable LLM enhancement
     */
    public Boolean getEnableLLMEnhancement() {
        return this.EnableLLMEnhancement;
    }

    /**
     * Set Whether to enable LLM enhancement
     * @param EnableLLMEnhancement Whether to enable LLM enhancement
     */
    public void setEnableLLMEnhancement(Boolean EnableLLMEnhancement) {
        this.EnableLLMEnhancement = EnableLLMEnhancement;
    }

    /**
     * Get Whether to output an HTML table 
     * @return OutputHtmlTable Whether to output an HTML table
     */
    public Boolean getOutputHtmlTable() {
        return this.OutputHtmlTable;
    }

    /**
     * Set Whether to output an HTML table
     * @param OutputHtmlTable Whether to output an HTML table
     */
    public void setOutputHtmlTable(Boolean OutputHtmlTable) {
        this.OutputHtmlTable = OutputHtmlTable;
    }

    /**
     * Get Supported file type list 
     * @return SupportedFileList Supported file type list
     */
    public SupportedFileType [] getSupportedFileList() {
        return this.SupportedFileList;
    }

    /**
     * Set Supported file type list
     * @param SupportedFileList Supported file type list
     */
    public void setSupportedFileList(SupportedFileType [] SupportedFileList) {
        this.SupportedFileList = SupportedFileList;
    }

    public FileParseModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileParseModel(FileParseModel source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnhancementMode != null) {
            this.EnhancementMode = new String(source.EnhancementMode);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelProviderType != null) {
            this.ModelProviderType = new String(source.ModelProviderType);
        }
        if (source.EnableFormulaEnhancement != null) {
            this.EnableFormulaEnhancement = new Boolean(source.EnableFormulaEnhancement);
        }
        if (source.EnableLLMEnhancement != null) {
            this.EnableLLMEnhancement = new Boolean(source.EnableLLMEnhancement);
        }
        if (source.OutputHtmlTable != null) {
            this.OutputHtmlTable = new Boolean(source.OutputHtmlTable);
        }
        if (source.SupportedFileList != null) {
            this.SupportedFileList = new SupportedFileType[source.SupportedFileList.length];
            for (int i = 0; i < source.SupportedFileList.length; i++) {
                this.SupportedFileList[i] = new SupportedFileType(source.SupportedFileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnhancementMode", this.EnhancementMode);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelProviderType", this.ModelProviderType);
        this.setParamSimple(map, prefix + "EnableFormulaEnhancement", this.EnableFormulaEnhancement);
        this.setParamSimple(map, prefix + "EnableLLMEnhancement", this.EnableLLMEnhancement);
        this.setParamSimple(map, prefix + "OutputHtmlTable", this.OutputHtmlTable);
        this.setParamArrayObj(map, prefix + "SupportedFileList.", this.SupportedFileList);

    }
}

