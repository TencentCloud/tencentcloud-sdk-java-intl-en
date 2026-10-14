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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationResourceArtifact extends AbstractModel {

    /**
    * 
    */
    @SerializedName("App")
    @Expose
    private ConversationAppArtifact App;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 
    */
    @SerializedName("Workflow")
    @Expose
    private ConversationWorkflowArtifact Workflow;

    /**
     * Get  
     * @return App 
     */
    public ConversationAppArtifact getApp() {
        return this.App;
    }

    /**
     * Set 
     * @param App 
     */
    public void setApp(ConversationAppArtifact App) {
        this.App = App;
    }

    /**
     * Get  
     * @return Type 
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Workflow 
     */
    public ConversationWorkflowArtifact getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set 
     * @param Workflow 
     */
    public void setWorkflow(ConversationWorkflowArtifact Workflow) {
        this.Workflow = Workflow;
    }

    public ConversationResourceArtifact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationResourceArtifact(ConversationResourceArtifact source) {
        if (source.App != null) {
            this.App = new ConversationAppArtifact(source.App);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Workflow != null) {
            this.Workflow = new ConversationWorkflowArtifact(source.Workflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "App.", this.App);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);

    }
}

