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

public class AppConfig extends AbstractModel {

    /**
    * Trial configuration
    */
    @SerializedName("Experience")
    @Expose
    private AppExperienceConfig Experience;

    /**
    * Welcome message configuration
    */
    @SerializedName("Greeting")
    @Expose
    private AppGreetingConfig Greeting;

    /**
    * Memory configuration
    */
    @SerializedName("Memory")
    @Expose
    private AppMemoryConfig Memory;

    /**
    * Mode-related configuration
    */
    @SerializedName("Mode")
    @Expose
    private AppModeConfig Mode;

    /**
    * Model configuration
    */
    @SerializedName("Model")
    @Expose
    private AppModelConfig Model;

    /**
    * Online search configuration
    */
    @SerializedName("WebSearch")
    @Expose
    private AppWebSearchConfig WebSearch;

    /**
    * Workflow configuration
    */
    @SerializedName("Workflow")
    @Expose
    private AppWorkflowConfig Workflow;

    /**
     * Get Trial configuration 
     * @return Experience Trial configuration
     */
    public AppExperienceConfig getExperience() {
        return this.Experience;
    }

    /**
     * Set Trial configuration
     * @param Experience Trial configuration
     */
    public void setExperience(AppExperienceConfig Experience) {
        this.Experience = Experience;
    }

    /**
     * Get Welcome message configuration 
     * @return Greeting Welcome message configuration
     */
    public AppGreetingConfig getGreeting() {
        return this.Greeting;
    }

    /**
     * Set Welcome message configuration
     * @param Greeting Welcome message configuration
     */
    public void setGreeting(AppGreetingConfig Greeting) {
        this.Greeting = Greeting;
    }

    /**
     * Get Memory configuration 
     * @return Memory Memory configuration
     */
    public AppMemoryConfig getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory configuration
     * @param Memory Memory configuration
     */
    public void setMemory(AppMemoryConfig Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Mode-related configuration 
     * @return Mode Mode-related configuration
     */
    public AppModeConfig getMode() {
        return this.Mode;
    }

    /**
     * Set Mode-related configuration
     * @param Mode Mode-related configuration
     */
    public void setMode(AppModeConfig Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Model configuration 
     * @return Model Model configuration
     */
    public AppModelConfig getModel() {
        return this.Model;
    }

    /**
     * Set Model configuration
     * @param Model Model configuration
     */
    public void setModel(AppModelConfig Model) {
        this.Model = Model;
    }

    /**
     * Get Online search configuration 
     * @return WebSearch Online search configuration
     */
    public AppWebSearchConfig getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set Online search configuration
     * @param WebSearch Online search configuration
     */
    public void setWebSearch(AppWebSearchConfig WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get Workflow configuration 
     * @return Workflow Workflow configuration
     */
    public AppWorkflowConfig getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set Workflow configuration
     * @param Workflow Workflow configuration
     */
    public void setWorkflow(AppWorkflowConfig Workflow) {
        this.Workflow = Workflow;
    }

    public AppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppConfig(AppConfig source) {
        if (source.Experience != null) {
            this.Experience = new AppExperienceConfig(source.Experience);
        }
        if (source.Greeting != null) {
            this.Greeting = new AppGreetingConfig(source.Greeting);
        }
        if (source.Memory != null) {
            this.Memory = new AppMemoryConfig(source.Memory);
        }
        if (source.Mode != null) {
            this.Mode = new AppModeConfig(source.Mode);
        }
        if (source.Model != null) {
            this.Model = new AppModelConfig(source.Model);
        }
        if (source.WebSearch != null) {
            this.WebSearch = new AppWebSearchConfig(source.WebSearch);
        }
        if (source.Workflow != null) {
            this.Workflow = new AppWorkflowConfig(source.Workflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Experience.", this.Experience);
        this.setParamObj(map, prefix + "Greeting.", this.Greeting);
        this.setParamObj(map, prefix + "Memory.", this.Memory);
        this.setParamObj(map, prefix + "Mode.", this.Mode);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "WebSearch.", this.WebSearch);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);

    }
}

