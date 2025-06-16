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

public class ModelInfo extends AbstractModel {

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Model description.
    */
    @SerializedName("ModelDesc")
    @Expose
    private String ModelDesc;

    /**
    * Model name.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Resource status, 1: available; 2: exhausted.
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * Character limit of prompt content.
    */
    @SerializedName("PromptWordsLimit")
    @Expose
    private String PromptWordsLimit;

    /**
    * By controlling the diversity of content generation through core sampling, a higher Top P value will lead to more diverse content generation.
    */
    @SerializedName("TopP")
    @Expose
    private ModelParameter TopP;

    /**
    * Temperature control randomness.
    */
    @SerializedName("Temperature")
    @Expose
    private ModelParameter Temperature;

    /**
    * Maximum quantity of tokens that can be generated.
    */
    @SerializedName("MaxTokens")
    @Expose
    private ModelParameter MaxTokens;

    /**
    * Model source, Hunyuan: Tencent Hunyuan; Industry: Tencent Cloud industry large model; Experience: new model experience.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Model icon.
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * Whether it is free.
    */
    @SerializedName("IsFree")
    @Expose
    private Boolean IsFree;

    /**
    * Maximum characters input in the model dialog box.
    */
    @SerializedName("InputLenLimit")
    @Expose
    private Long InputLenLimit;

    /**
    * Workflow support levels:
0 - Not supported by the model;
1 - Supported by the model;
2 - Poorly supported by the model.
    */
    @SerializedName("SupportWorkflowStatus")
    @Expose
    private Long SupportWorkflowStatus;

    /**
    * Model categories:
Generate: Generative model
Thought: Thinking model
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * Whether it is the default model.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Maximum characters of role prompt words.
    */
    @SerializedName("RoleLenLimit")
    @Expose
    private Long RoleLenLimit;

    /**
    * Whether it is an exclusive concurrency model.
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * The model supports intelligent call effects.
    */
    @SerializedName("SupportAiCallStatus")
    @Expose
    private Long SupportAiCallStatus;

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Model description. 
     * @return ModelDesc Model description.
     */
    public String getModelDesc() {
        return this.ModelDesc;
    }

    /**
     * Set Model description.
     * @param ModelDesc Model description.
     */
    public void setModelDesc(String ModelDesc) {
        this.ModelDesc = ModelDesc;
    }

    /**
     * Get Model name. 
     * @return AliasName Model name.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Model name.
     * @param AliasName Model name.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Resource status, 1: available; 2: exhausted. 
     * @return ResourceStatus Resource status, 1: available; 2: exhausted.
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set Resource status, 1: available; 2: exhausted.
     * @param ResourceStatus Resource status, 1: available; 2: exhausted.
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get Character limit of prompt content. 
     * @return PromptWordsLimit Character limit of prompt content.
     */
    public String getPromptWordsLimit() {
        return this.PromptWordsLimit;
    }

    /**
     * Set Character limit of prompt content.
     * @param PromptWordsLimit Character limit of prompt content.
     */
    public void setPromptWordsLimit(String PromptWordsLimit) {
        this.PromptWordsLimit = PromptWordsLimit;
    }

    /**
     * Get By controlling the diversity of content generation through core sampling, a higher Top P value will lead to more diverse content generation. 
     * @return TopP By controlling the diversity of content generation through core sampling, a higher Top P value will lead to more diverse content generation.
     */
    public ModelParameter getTopP() {
        return this.TopP;
    }

    /**
     * Set By controlling the diversity of content generation through core sampling, a higher Top P value will lead to more diverse content generation.
     * @param TopP By controlling the diversity of content generation through core sampling, a higher Top P value will lead to more diverse content generation.
     */
    public void setTopP(ModelParameter TopP) {
        this.TopP = TopP;
    }

    /**
     * Get Temperature control randomness. 
     * @return Temperature Temperature control randomness.
     */
    public ModelParameter getTemperature() {
        return this.Temperature;
    }

    /**
     * Set Temperature control randomness.
     * @param Temperature Temperature control randomness.
     */
    public void setTemperature(ModelParameter Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get Maximum quantity of tokens that can be generated. 
     * @return MaxTokens Maximum quantity of tokens that can be generated.
     */
    public ModelParameter getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set Maximum quantity of tokens that can be generated.
     * @param MaxTokens Maximum quantity of tokens that can be generated.
     */
    public void setMaxTokens(ModelParameter MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get Model source, Hunyuan: Tencent Hunyuan; Industry: Tencent Cloud industry large model; Experience: new model experience. 
     * @return Source Model source, Hunyuan: Tencent Hunyuan; Industry: Tencent Cloud industry large model; Experience: new model experience.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Model source, Hunyuan: Tencent Hunyuan; Industry: Tencent Cloud industry large model; Experience: new model experience.
     * @param Source Model source, Hunyuan: Tencent Hunyuan; Industry: Tencent Cloud industry large model; Experience: new model experience.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Model icon. 
     * @return Icon Model icon.
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set Model icon.
     * @param Icon Model icon.
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get Whether it is free. 
     * @return IsFree Whether it is free.
     */
    public Boolean getIsFree() {
        return this.IsFree;
    }

    /**
     * Set Whether it is free.
     * @param IsFree Whether it is free.
     */
    public void setIsFree(Boolean IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get Maximum characters input in the model dialog box. 
     * @return InputLenLimit Maximum characters input in the model dialog box.
     */
    public Long getInputLenLimit() {
        return this.InputLenLimit;
    }

    /**
     * Set Maximum characters input in the model dialog box.
     * @param InputLenLimit Maximum characters input in the model dialog box.
     */
    public void setInputLenLimit(Long InputLenLimit) {
        this.InputLenLimit = InputLenLimit;
    }

    /**
     * Get Workflow support levels:
0 - Not supported by the model;
1 - Supported by the model;
2 - Poorly supported by the model. 
     * @return SupportWorkflowStatus Workflow support levels:
0 - Not supported by the model;
1 - Supported by the model;
2 - Poorly supported by the model.
     */
    public Long getSupportWorkflowStatus() {
        return this.SupportWorkflowStatus;
    }

    /**
     * Set Workflow support levels:
0 - Not supported by the model;
1 - Supported by the model;
2 - Poorly supported by the model.
     * @param SupportWorkflowStatus Workflow support levels:
0 - Not supported by the model;
1 - Supported by the model;
2 - Poorly supported by the model.
     */
    public void setSupportWorkflowStatus(Long SupportWorkflowStatus) {
        this.SupportWorkflowStatus = SupportWorkflowStatus;
    }

    /**
     * Get Model categories:
Generate: Generative model
Thought: Thinking model 
     * @return ModelCategory Model categories:
Generate: Generative model
Thought: Thinking model
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set Model categories:
Generate: Generative model
Thought: Thinking model
     * @param ModelCategory Model categories:
Generate: Generative model
Thought: Thinking model
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get Whether it is the default model. 
     * @return IsDefault Whether it is the default model.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default model.
     * @param IsDefault Whether it is the default model.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Maximum characters of role prompt words. 
     * @return RoleLenLimit Maximum characters of role prompt words.
     */
    public Long getRoleLenLimit() {
        return this.RoleLenLimit;
    }

    /**
     * Set Maximum characters of role prompt words.
     * @param RoleLenLimit Maximum characters of role prompt words.
     */
    public void setRoleLenLimit(Long RoleLenLimit) {
        this.RoleLenLimit = RoleLenLimit;
    }

    /**
     * Get Whether it is an exclusive concurrency model. 
     * @return IsExclusive Whether it is an exclusive concurrency model.
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set Whether it is an exclusive concurrency model.
     * @param IsExclusive Whether it is an exclusive concurrency model.
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get The model supports intelligent call effects. 
     * @return SupportAiCallStatus The model supports intelligent call effects.
     */
    public Long getSupportAiCallStatus() {
        return this.SupportAiCallStatus;
    }

    /**
     * Set The model supports intelligent call effects.
     * @param SupportAiCallStatus The model supports intelligent call effects.
     */
    public void setSupportAiCallStatus(Long SupportAiCallStatus) {
        this.SupportAiCallStatus = SupportAiCallStatus;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelDesc != null) {
            this.ModelDesc = new String(source.ModelDesc);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.PromptWordsLimit != null) {
            this.PromptWordsLimit = new String(source.PromptWordsLimit);
        }
        if (source.TopP != null) {
            this.TopP = new ModelParameter(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new ModelParameter(source.Temperature);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new ModelParameter(source.MaxTokens);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.IsFree != null) {
            this.IsFree = new Boolean(source.IsFree);
        }
        if (source.InputLenLimit != null) {
            this.InputLenLimit = new Long(source.InputLenLimit);
        }
        if (source.SupportWorkflowStatus != null) {
            this.SupportWorkflowStatus = new Long(source.SupportWorkflowStatus);
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.RoleLenLimit != null) {
            this.RoleLenLimit = new Long(source.RoleLenLimit);
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.SupportAiCallStatus != null) {
            this.SupportAiCallStatus = new Long(source.SupportAiCallStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelDesc", this.ModelDesc);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "PromptWordsLimit", this.PromptWordsLimit);
        this.setParamObj(map, prefix + "TopP.", this.TopP);
        this.setParamObj(map, prefix + "Temperature.", this.Temperature);
        this.setParamObj(map, prefix + "MaxTokens.", this.MaxTokens);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "InputLenLimit", this.InputLenLimit);
        this.setParamSimple(map, prefix + "SupportWorkflowStatus", this.SupportWorkflowStatus);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "RoleLenLimit", this.RoleLenLimit);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "SupportAiCallStatus", this.SupportAiCallStatus);

    }
}

