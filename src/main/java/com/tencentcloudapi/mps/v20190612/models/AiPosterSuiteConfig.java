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
    * <p>Image output mode.</p><p>Enumeration values:</p><ul><li>auto: fully automatic mode. CustomVariables can be passed in this mode.</li><li>modify: modification mode. The corresponding description needs to be provided in the AddOnParameter.ExtPrompt field in this mode. CustomVariables cannot be passed in this mode.</li></ul><p>Default value: auto.</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Ecommerce platform visual template ID.</p><p>If you need a personalized visual template, submit a ticket.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Sub-image configuration.</p>
    */
    @SerializedName("Recipe")
    @Expose
    private RecipeItem [] Recipe;

    /**
    * <p>Sub-image text language.</p><p>Enumeration values:</p><ul><li>zh-CN: Simplified Chinese.</li><li>en-US: American English.</li></ul><p>Default value: zh-CN.</p><p>If you need more languages, submit a ticket.</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Sub-image aspect ratio.</p><p>Enumeration values:</p><ul><li>1:1: 1:1.</li><li>3:4: 3:4.</li><li>4:3: 4:3.</li><li>9:16: 9:16.</li><li>16:9: 16:9.</li></ul><p>Default value: 1:1.</p>
    */
    @SerializedName("PanelRatio")
    @Expose
    private String PanelRatio;

    /**
    * <p>Sub-image resolution.</p><p>Enumeration values:</p><ul><li>720: 720.</li><li>1K: 1K.</li><li>2K: 2K.</li><li>4K: 4K.</li></ul><p>Default value: 1K.</p>
    */
    @SerializedName("PanelResolution")
    @Expose
    private String PanelResolution;

    /**
    * <p>User-defined variable.</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>Model name.</p><p>Enumeration value:</p><ul><li>WAND-suite-1.0-flash: WAND-suite-1.0-flash.</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>Image output mode.</p><p>Enumeration values:</p><ul><li>auto: fully automatic mode. CustomVariables can be passed in this mode.</li><li>modify: modification mode. The corresponding description needs to be provided in the AddOnParameter.ExtPrompt field in this mode. CustomVariables cannot be passed in this mode.</li></ul><p>Default value: auto.</p> 
     * @return Mode <p>Image output mode.</p><p>Enumeration values:</p><ul><li>auto: fully automatic mode. CustomVariables can be passed in this mode.</li><li>modify: modification mode. The corresponding description needs to be provided in the AddOnParameter.ExtPrompt field in this mode. CustomVariables cannot be passed in this mode.</li></ul><p>Default value: auto.</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Image output mode.</p><p>Enumeration values:</p><ul><li>auto: fully automatic mode. CustomVariables can be passed in this mode.</li><li>modify: modification mode. The corresponding description needs to be provided in the AddOnParameter.ExtPrompt field in this mode. CustomVariables cannot be passed in this mode.</li></ul><p>Default value: auto.</p>
     * @param Mode <p>Image output mode.</p><p>Enumeration values:</p><ul><li>auto: fully automatic mode. CustomVariables can be passed in this mode.</li><li>modify: modification mode. The corresponding description needs to be provided in the AddOnParameter.ExtPrompt field in this mode. CustomVariables cannot be passed in this mode.</li></ul><p>Default value: auto.</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Ecommerce platform visual template ID.</p><p>If you need a personalized visual template, submit a ticket.</p> 
     * @return Definition <p>Ecommerce platform visual template ID.</p><p>If you need a personalized visual template, submit a ticket.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Ecommerce platform visual template ID.</p><p>If you need a personalized visual template, submit a ticket.</p>
     * @param Definition <p>Ecommerce platform visual template ID.</p><p>If you need a personalized visual template, submit a ticket.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Sub-image configuration.</p> 
     * @return Recipe <p>Sub-image configuration.</p>
     */
    public RecipeItem [] getRecipe() {
        return this.Recipe;
    }

    /**
     * Set <p>Sub-image configuration.</p>
     * @param Recipe <p>Sub-image configuration.</p>
     */
    public void setRecipe(RecipeItem [] Recipe) {
        this.Recipe = Recipe;
    }

    /**
     * Get <p>Sub-image text language.</p><p>Enumeration values:</p><ul><li>zh-CN: Simplified Chinese.</li><li>en-US: American English.</li></ul><p>Default value: zh-CN.</p><p>If you need more languages, submit a ticket.</p> 
     * @return Language <p>Sub-image text language.</p><p>Enumeration values:</p><ul><li>zh-CN: Simplified Chinese.</li><li>en-US: American English.</li></ul><p>Default value: zh-CN.</p><p>If you need more languages, submit a ticket.</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Sub-image text language.</p><p>Enumeration values:</p><ul><li>zh-CN: Simplified Chinese.</li><li>en-US: American English.</li></ul><p>Default value: zh-CN.</p><p>If you need more languages, submit a ticket.</p>
     * @param Language <p>Sub-image text language.</p><p>Enumeration values:</p><ul><li>zh-CN: Simplified Chinese.</li><li>en-US: American English.</li></ul><p>Default value: zh-CN.</p><p>If you need more languages, submit a ticket.</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Sub-image aspect ratio.</p><p>Enumeration values:</p><ul><li>1:1: 1:1.</li><li>3:4: 3:4.</li><li>4:3: 4:3.</li><li>9:16: 9:16.</li><li>16:9: 16:9.</li></ul><p>Default value: 1:1.</p> 
     * @return PanelRatio <p>Sub-image aspect ratio.</p><p>Enumeration values:</p><ul><li>1:1: 1:1.</li><li>3:4: 3:4.</li><li>4:3: 4:3.</li><li>9:16: 9:16.</li><li>16:9: 16:9.</li></ul><p>Default value: 1:1.</p>
     */
    public String getPanelRatio() {
        return this.PanelRatio;
    }

    /**
     * Set <p>Sub-image aspect ratio.</p><p>Enumeration values:</p><ul><li>1:1: 1:1.</li><li>3:4: 3:4.</li><li>4:3: 4:3.</li><li>9:16: 9:16.</li><li>16:9: 16:9.</li></ul><p>Default value: 1:1.</p>
     * @param PanelRatio <p>Sub-image aspect ratio.</p><p>Enumeration values:</p><ul><li>1:1: 1:1.</li><li>3:4: 3:4.</li><li>4:3: 4:3.</li><li>9:16: 9:16.</li><li>16:9: 16:9.</li></ul><p>Default value: 1:1.</p>
     */
    public void setPanelRatio(String PanelRatio) {
        this.PanelRatio = PanelRatio;
    }

    /**
     * Get <p>Sub-image resolution.</p><p>Enumeration values:</p><ul><li>720: 720.</li><li>1K: 1K.</li><li>2K: 2K.</li><li>4K: 4K.</li></ul><p>Default value: 1K.</p> 
     * @return PanelResolution <p>Sub-image resolution.</p><p>Enumeration values:</p><ul><li>720: 720.</li><li>1K: 1K.</li><li>2K: 2K.</li><li>4K: 4K.</li></ul><p>Default value: 1K.</p>
     */
    public String getPanelResolution() {
        return this.PanelResolution;
    }

    /**
     * Set <p>Sub-image resolution.</p><p>Enumeration values:</p><ul><li>720: 720.</li><li>1K: 1K.</li><li>2K: 2K.</li><li>4K: 4K.</li></ul><p>Default value: 1K.</p>
     * @param PanelResolution <p>Sub-image resolution.</p><p>Enumeration values:</p><ul><li>720: 720.</li><li>1K: 1K.</li><li>2K: 2K.</li><li>4K: 4K.</li></ul><p>Default value: 1K.</p>
     */
    public void setPanelResolution(String PanelResolution) {
        this.PanelResolution = PanelResolution;
    }

    /**
     * Get <p>User-defined variable.</p> 
     * @return CustomVariables <p>User-defined variable.</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>User-defined variable.</p>
     * @param CustomVariables <p>User-defined variable.</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>Model name.</p><p>Enumeration value:</p><ul><li>WAND-suite-1.0-flash: WAND-suite-1.0-flash.</li></ul> 
     * @return Model <p>Model name.</p><p>Enumeration value:</p><ul><li>WAND-suite-1.0-flash: WAND-suite-1.0-flash.</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Model name.</p><p>Enumeration value:</p><ul><li>WAND-suite-1.0-flash: WAND-suite-1.0-flash.</li></ul>
     * @param Model <p>Model name.</p><p>Enumeration value:</p><ul><li>WAND-suite-1.0-flash: WAND-suite-1.0-flash.</li></ul>
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

