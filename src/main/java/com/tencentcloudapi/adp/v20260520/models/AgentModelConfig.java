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

public class AgentModelConfig extends AbstractModel {

    /**
    * <p>Unique model id</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>Model alias</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Model context length character limit</p>
    */
    @SerializedName("ContextWordsLimit")
    @Expose
    private Long ContextWordsLimit;

    /**
    * <p>Instruction length character limit</p>
    */
    @SerializedName("InstructionsWordsLimit")
    @Expose
    private Long InstructionsWordsLimit;

    /**
    * <p>Model parameters</p>
    */
    @SerializedName("ModelParameters")
    @Expose
    private ModelParams ModelParameters;

    /**
     * Get <p>Unique model id</p> 
     * @return ModelId <p>Unique model id</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>Unique model id</p>
     * @param ModelId <p>Unique model id</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>Model alias</p> 
     * @return Alias <p>Model alias</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Model alias</p>
     * @param Alias <p>Model alias</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Model context length character limit</p> 
     * @return ContextWordsLimit <p>Model context length character limit</p>
     */
    public Long getContextWordsLimit() {
        return this.ContextWordsLimit;
    }

    /**
     * Set <p>Model context length character limit</p>
     * @param ContextWordsLimit <p>Model context length character limit</p>
     */
    public void setContextWordsLimit(Long ContextWordsLimit) {
        this.ContextWordsLimit = ContextWordsLimit;
    }

    /**
     * Get <p>Instruction length character limit</p> 
     * @return InstructionsWordsLimit <p>Instruction length character limit</p>
     */
    public Long getInstructionsWordsLimit() {
        return this.InstructionsWordsLimit;
    }

    /**
     * Set <p>Instruction length character limit</p>
     * @param InstructionsWordsLimit <p>Instruction length character limit</p>
     */
    public void setInstructionsWordsLimit(Long InstructionsWordsLimit) {
        this.InstructionsWordsLimit = InstructionsWordsLimit;
    }

    /**
     * Get <p>Model parameters</p> 
     * @return ModelParameters <p>Model parameters</p>
     */
    public ModelParams getModelParameters() {
        return this.ModelParameters;
    }

    /**
     * Set <p>Model parameters</p>
     * @param ModelParameters <p>Model parameters</p>
     */
    public void setModelParameters(ModelParams ModelParameters) {
        this.ModelParameters = ModelParameters;
    }

    public AgentModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentModelConfig(AgentModelConfig source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ContextWordsLimit != null) {
            this.ContextWordsLimit = new Long(source.ContextWordsLimit);
        }
        if (source.InstructionsWordsLimit != null) {
            this.InstructionsWordsLimit = new Long(source.InstructionsWordsLimit);
        }
        if (source.ModelParameters != null) {
            this.ModelParameters = new ModelParams(source.ModelParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ContextWordsLimit", this.ContextWordsLimit);
        this.setParamSimple(map, prefix + "InstructionsWordsLimit", this.InstructionsWordsLimit);
        this.setParamObj(map, prefix + "ModelParameters.", this.ModelParameters);

    }
}

