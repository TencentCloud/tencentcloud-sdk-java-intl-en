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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiPosterSuiteConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Recipe")
    @Expose
    private RecipeItem [] Recipe;

    /**
    * 
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 
    */
    @SerializedName("PanelRatio")
    @Expose
    private String PanelRatio;

    /**
    * 
    */
    @SerializedName("PanelResolution")
    @Expose
    private String PanelResolution;

    /**
    * 
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * 
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get  
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return Recipe 
     */
    public RecipeItem [] getRecipe() {
        return this.Recipe;
    }

    /**
     * Set 
     * @param Recipe 
     */
    public void setRecipe(RecipeItem [] Recipe) {
        this.Recipe = Recipe;
    }

    /**
     * Get  
     * @return Language 
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 
     * @param Language 
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get  
     * @return PanelRatio 
     */
    public String getPanelRatio() {
        return this.PanelRatio;
    }

    /**
     * Set 
     * @param PanelRatio 
     */
    public void setPanelRatio(String PanelRatio) {
        this.PanelRatio = PanelRatio;
    }

    /**
     * Get  
     * @return PanelResolution 
     */
    public String getPanelResolution() {
        return this.PanelResolution;
    }

    /**
     * Set 
     * @param PanelResolution 
     */
    public void setPanelResolution(String PanelResolution) {
        this.PanelResolution = PanelResolution;
    }

    /**
     * Get  
     * @return CustomVariables 
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set 
     * @param CustomVariables 
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get  
     * @return Model 
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 
     * @param Model 
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public AiPosterSuiteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiPosterSuiteConfig(AiPosterSuiteConfig source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Recipe != null) {
            this.Recipe = new RecipeItem[source.Recipe.length];
            for (int i = 0; i < source.Recipe.length; i++) {
                this.Recipe[i] = new RecipeItem(source.Recipe[i]);
            }
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.PanelRatio != null) {
            this.PanelRatio = new String(source.PanelRatio);
        }
        if (source.PanelResolution != null) {
            this.PanelResolution = new String(source.PanelResolution);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "Recipe.", this.Recipe);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "PanelRatio", this.PanelRatio);
        this.setParamSimple(map, prefix + "PanelResolution", this.PanelResolution);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

