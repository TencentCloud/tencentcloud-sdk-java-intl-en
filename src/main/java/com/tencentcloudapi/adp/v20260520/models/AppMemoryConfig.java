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

public class AppMemoryConfig extends AbstractModel {

    /**
    * Whether to enable long-term memory
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Long memory duration
    */
    @SerializedName("LongMemoryDay")
    @Expose
    private Long LongMemoryDay;

    /**
    * Model configuration
    */
    @SerializedName("Model")
    @Expose
    private ModelDetailInfo Model;

    /**
    * prompt content
    */
    @SerializedName("PromptContent")
    @Expose
    private String PromptContent;

    /**
    * Prompt word mode. Enumeration value: 1: custom
    */
    @SerializedName("PromptMode")
    @Expose
    private Long PromptMode;

    /**
     * Get Whether to enable long-term memory 
     * @return Enabled Whether to enable long-term memory
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable long-term memory
     * @param Enabled Whether to enable long-term memory
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Long memory duration 
     * @return LongMemoryDay Long memory duration
     */
    public Long getLongMemoryDay() {
        return this.LongMemoryDay;
    }

    /**
     * Set Long memory duration
     * @param LongMemoryDay Long memory duration
     */
    public void setLongMemoryDay(Long LongMemoryDay) {
        this.LongMemoryDay = LongMemoryDay;
    }

    /**
     * Get Model configuration 
     * @return Model Model configuration
     */
    public ModelDetailInfo getModel() {
        return this.Model;
    }

    /**
     * Set Model configuration
     * @param Model Model configuration
     */
    public void setModel(ModelDetailInfo Model) {
        this.Model = Model;
    }

    /**
     * Get prompt content 
     * @return PromptContent prompt content
     */
    public String getPromptContent() {
        return this.PromptContent;
    }

    /**
     * Set prompt content
     * @param PromptContent prompt content
     */
    public void setPromptContent(String PromptContent) {
        this.PromptContent = PromptContent;
    }

    /**
     * Get Prompt word mode. Enumeration value: 1: custom 
     * @return PromptMode Prompt word mode. Enumeration value: 1: custom
     */
    public Long getPromptMode() {
        return this.PromptMode;
    }

    /**
     * Set Prompt word mode. Enumeration value: 1: custom
     * @param PromptMode Prompt word mode. Enumeration value: 1: custom
     */
    public void setPromptMode(Long PromptMode) {
        this.PromptMode = PromptMode;
    }

    public AppMemoryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppMemoryConfig(AppMemoryConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LongMemoryDay != null) {
            this.LongMemoryDay = new Long(source.LongMemoryDay);
        }
        if (source.Model != null) {
            this.Model = new ModelDetailInfo(source.Model);
        }
        if (source.PromptContent != null) {
            this.PromptContent = new String(source.PromptContent);
        }
        if (source.PromptMode != null) {
            this.PromptMode = new Long(source.PromptMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LongMemoryDay", this.LongMemoryDay);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamSimple(map, prefix + "PromptContent", this.PromptContent);
        this.setParamSimple(map, prefix + "PromptMode", this.PromptMode);

    }
}

