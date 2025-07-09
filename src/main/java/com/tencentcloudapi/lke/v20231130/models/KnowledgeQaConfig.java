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

public class KnowledgeQaConfig extends AbstractModel {

    /**
    * Welcome words, within 200 characters.
    */
    @SerializedName("Greeting")
    @Expose
    private String Greeting;

    /**
    * Character description, within 4,000 characters. By filling out the description, set the #Character Name, #Style Characteristics, and reachable #Intent of the application. It is recommended to fill in according to the following template, with custom intents no more than 5. 
#Character Name:
#Style Characteristics:
#Output Requirements:
#Ability Limitations:
The following user intents can be reached.
##Intent Name:
##Intent Description:
##Intent Example:
##Intent Implementation:
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
    * Generative model configuration.
    */
    @SerializedName("Model")
    @Expose
    private AppModel Model;

    /**
    * Knowledge search configuration.
    */
    @SerializedName("Search")
    @Expose
    private KnowledgeQaSearch [] Search;

    /**
    * Knowledge management output configuration.
    */
    @SerializedName("Output")
    @Expose
    private KnowledgeQaOutput Output;

    /**
    * Workflow configuration.
    */
    @SerializedName("Workflow")
    @Expose
    private KnowledgeWorkflow Workflow;

    /**
    * Retrieval range.
    */
    @SerializedName("SearchRange")
    @Expose
    private SearchRange SearchRange;

    /**
    * Application modes: standard, agent, single_workflow.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Retrieve a policy.
    */
    @SerializedName("SearchStrategy")
    @Expose
    private SearchStrategy SearchStrategy;

    /**
    * Single workflow ID, which is entered when Pattern is single_workflow.
    */
    @SerializedName("SingleWorkflow")
    @Expose
    private KnowledgeQaSingleWorkflow SingleWorkflow;

    /**
    * Application associated plug-in.
    */
    @SerializedName("Plugins")
    @Expose
    private KnowledgeQaPlugin [] Plugins;

    /**
    * Thinking model configuration.
    */
    @SerializedName("ThoughtModel")
    @Expose
    private AppModel ThoughtModel;

    /**
    * Priority of intent achievement methods.
    */
    @SerializedName("IntentAchievements")
    @Expose
    private IntentAchievement [] IntentAchievements;

    /**
    * Whether to enable Image-Text Search.
    */
    @SerializedName("ImageTextRetrieval")
    @Expose
    private Boolean ImageTextRetrieval;

    /**
    * Configure voice call parameters.
    */
    @SerializedName("AiCall")
    @Expose
    private AICallConfig AiCall;

    /**
    * Session content moderation switch. Note: 1. This feature is enabled by default if no value is input. 2. Tencent Cloud provides a content pre-filtering feature to help filter high-risk or illegal content. If you do not use our filtering feature, you can disable it here. We hereby remind you that you are responsible for ensuring that your content complies with platform policies and laws and regulations, and that you should fulfill your content moderation obligations.
    */
    @SerializedName("EnableAudit")
    @Expose
    private Boolean EnableAudit;

    /**
     * Get Welcome words, within 200 characters. 
     * @return Greeting Welcome words, within 200 characters.
     */
    public String getGreeting() {
        return this.Greeting;
    }

    /**
     * Set Welcome words, within 200 characters.
     * @param Greeting Welcome words, within 200 characters.
     */
    public void setGreeting(String Greeting) {
        this.Greeting = Greeting;
    }

    /**
     * Get Character description, within 4,000 characters. By filling out the description, set the #Character Name, #Style Characteristics, and reachable #Intent of the application. It is recommended to fill in according to the following template, with custom intents no more than 5. 
#Character Name:
#Style Characteristics:
#Output Requirements:
#Ability Limitations:
The following user intents can be reached.
##Intent Name:
##Intent Description:
##Intent Example:
##Intent Implementation: 
     * @return RoleDescription Character description, within 4,000 characters. By filling out the description, set the #Character Name, #Style Characteristics, and reachable #Intent of the application. It is recommended to fill in according to the following template, with custom intents no more than 5. 
#Character Name:
#Style Characteristics:
#Output Requirements:
#Ability Limitations:
The following user intents can be reached.
##Intent Name:
##Intent Description:
##Intent Example:
##Intent Implementation:
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set Character description, within 4,000 characters. By filling out the description, set the #Character Name, #Style Characteristics, and reachable #Intent of the application. It is recommended to fill in according to the following template, with custom intents no more than 5. 
#Character Name:
#Style Characteristics:
#Output Requirements:
#Ability Limitations:
The following user intents can be reached.
##Intent Name:
##Intent Description:
##Intent Example:
##Intent Implementation:
     * @param RoleDescription Character description, within 4,000 characters. By filling out the description, set the #Character Name, #Style Characteristics, and reachable #Intent of the application. It is recommended to fill in according to the following template, with custom intents no more than 5. 
#Character Name:
#Style Characteristics:
#Output Requirements:
#Ability Limitations:
The following user intents can be reached.
##Intent Name:
##Intent Description:
##Intent Example:
##Intent Implementation:
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    /**
     * Get Generative model configuration. 
     * @return Model Generative model configuration.
     */
    public AppModel getModel() {
        return this.Model;
    }

    /**
     * Set Generative model configuration.
     * @param Model Generative model configuration.
     */
    public void setModel(AppModel Model) {
        this.Model = Model;
    }

    /**
     * Get Knowledge search configuration. 
     * @return Search Knowledge search configuration.
     */
    public KnowledgeQaSearch [] getSearch() {
        return this.Search;
    }

    /**
     * Set Knowledge search configuration.
     * @param Search Knowledge search configuration.
     */
    public void setSearch(KnowledgeQaSearch [] Search) {
        this.Search = Search;
    }

    /**
     * Get Knowledge management output configuration. 
     * @return Output Knowledge management output configuration.
     */
    public KnowledgeQaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Knowledge management output configuration.
     * @param Output Knowledge management output configuration.
     */
    public void setOutput(KnowledgeQaOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Workflow configuration. 
     * @return Workflow Workflow configuration.
     */
    public KnowledgeWorkflow getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set Workflow configuration.
     * @param Workflow Workflow configuration.
     */
    public void setWorkflow(KnowledgeWorkflow Workflow) {
        this.Workflow = Workflow;
    }

    /**
     * Get Retrieval range. 
     * @return SearchRange Retrieval range.
     */
    public SearchRange getSearchRange() {
        return this.SearchRange;
    }

    /**
     * Set Retrieval range.
     * @param SearchRange Retrieval range.
     */
    public void setSearchRange(SearchRange SearchRange) {
        this.SearchRange = SearchRange;
    }

    /**
     * Get Application modes: standard, agent, single_workflow. 
     * @return Pattern Application modes: standard, agent, single_workflow.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Application modes: standard, agent, single_workflow.
     * @param Pattern Application modes: standard, agent, single_workflow.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Retrieve a policy. 
     * @return SearchStrategy Retrieve a policy.
     */
    public SearchStrategy getSearchStrategy() {
        return this.SearchStrategy;
    }

    /**
     * Set Retrieve a policy.
     * @param SearchStrategy Retrieve a policy.
     */
    public void setSearchStrategy(SearchStrategy SearchStrategy) {
        this.SearchStrategy = SearchStrategy;
    }

    /**
     * Get Single workflow ID, which is entered when Pattern is single_workflow. 
     * @return SingleWorkflow Single workflow ID, which is entered when Pattern is single_workflow.
     */
    public KnowledgeQaSingleWorkflow getSingleWorkflow() {
        return this.SingleWorkflow;
    }

    /**
     * Set Single workflow ID, which is entered when Pattern is single_workflow.
     * @param SingleWorkflow Single workflow ID, which is entered when Pattern is single_workflow.
     */
    public void setSingleWorkflow(KnowledgeQaSingleWorkflow SingleWorkflow) {
        this.SingleWorkflow = SingleWorkflow;
    }

    /**
     * Get Application associated plug-in. 
     * @return Plugins Application associated plug-in.
     */
    public KnowledgeQaPlugin [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set Application associated plug-in.
     * @param Plugins Application associated plug-in.
     */
    public void setPlugins(KnowledgeQaPlugin [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get Thinking model configuration. 
     * @return ThoughtModel Thinking model configuration.
     */
    public AppModel getThoughtModel() {
        return this.ThoughtModel;
    }

    /**
     * Set Thinking model configuration.
     * @param ThoughtModel Thinking model configuration.
     */
    public void setThoughtModel(AppModel ThoughtModel) {
        this.ThoughtModel = ThoughtModel;
    }

    /**
     * Get Priority of intent achievement methods. 
     * @return IntentAchievements Priority of intent achievement methods.
     */
    public IntentAchievement [] getIntentAchievements() {
        return this.IntentAchievements;
    }

    /**
     * Set Priority of intent achievement methods.
     * @param IntentAchievements Priority of intent achievement methods.
     */
    public void setIntentAchievements(IntentAchievement [] IntentAchievements) {
        this.IntentAchievements = IntentAchievements;
    }

    /**
     * Get Whether to enable Image-Text Search. 
     * @return ImageTextRetrieval Whether to enable Image-Text Search.
     */
    public Boolean getImageTextRetrieval() {
        return this.ImageTextRetrieval;
    }

    /**
     * Set Whether to enable Image-Text Search.
     * @param ImageTextRetrieval Whether to enable Image-Text Search.
     */
    public void setImageTextRetrieval(Boolean ImageTextRetrieval) {
        this.ImageTextRetrieval = ImageTextRetrieval;
    }

    /**
     * Get Configure voice call parameters. 
     * @return AiCall Configure voice call parameters.
     */
    public AICallConfig getAiCall() {
        return this.AiCall;
    }

    /**
     * Set Configure voice call parameters.
     * @param AiCall Configure voice call parameters.
     */
    public void setAiCall(AICallConfig AiCall) {
        this.AiCall = AiCall;
    }

    /**
     * Get Session content moderation switch. Note: 1. This feature is enabled by default if no value is input. 2. Tencent Cloud provides a content pre-filtering feature to help filter high-risk or illegal content. If you do not use our filtering feature, you can disable it here. We hereby remind you that you are responsible for ensuring that your content complies with platform policies and laws and regulations, and that you should fulfill your content moderation obligations. 
     * @return EnableAudit Session content moderation switch. Note: 1. This feature is enabled by default if no value is input. 2. Tencent Cloud provides a content pre-filtering feature to help filter high-risk or illegal content. If you do not use our filtering feature, you can disable it here. We hereby remind you that you are responsible for ensuring that your content complies with platform policies and laws and regulations, and that you should fulfill your content moderation obligations.
     */
    public Boolean getEnableAudit() {
        return this.EnableAudit;
    }

    /**
     * Set Session content moderation switch. Note: 1. This feature is enabled by default if no value is input. 2. Tencent Cloud provides a content pre-filtering feature to help filter high-risk or illegal content. If you do not use our filtering feature, you can disable it here. We hereby remind you that you are responsible for ensuring that your content complies with platform policies and laws and regulations, and that you should fulfill your content moderation obligations.
     * @param EnableAudit Session content moderation switch. Note: 1. This feature is enabled by default if no value is input. 2. Tencent Cloud provides a content pre-filtering feature to help filter high-risk or illegal content. If you do not use our filtering feature, you can disable it here. We hereby remind you that you are responsible for ensuring that your content complies with platform policies and laws and regulations, and that you should fulfill your content moderation obligations.
     */
    public void setEnableAudit(Boolean EnableAudit) {
        this.EnableAudit = EnableAudit;
    }

    public KnowledgeQaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaConfig(KnowledgeQaConfig source) {
        if (source.Greeting != null) {
            this.Greeting = new String(source.Greeting);
        }
        if (source.RoleDescription != null) {
            this.RoleDescription = new String(source.RoleDescription);
        }
        if (source.Model != null) {
            this.Model = new AppModel(source.Model);
        }
        if (source.Search != null) {
            this.Search = new KnowledgeQaSearch[source.Search.length];
            for (int i = 0; i < source.Search.length; i++) {
                this.Search[i] = new KnowledgeQaSearch(source.Search[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new KnowledgeQaOutput(source.Output);
        }
        if (source.Workflow != null) {
            this.Workflow = new KnowledgeWorkflow(source.Workflow);
        }
        if (source.SearchRange != null) {
            this.SearchRange = new SearchRange(source.SearchRange);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.SearchStrategy != null) {
            this.SearchStrategy = new SearchStrategy(source.SearchStrategy);
        }
        if (source.SingleWorkflow != null) {
            this.SingleWorkflow = new KnowledgeQaSingleWorkflow(source.SingleWorkflow);
        }
        if (source.Plugins != null) {
            this.Plugins = new KnowledgeQaPlugin[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new KnowledgeQaPlugin(source.Plugins[i]);
            }
        }
        if (source.ThoughtModel != null) {
            this.ThoughtModel = new AppModel(source.ThoughtModel);
        }
        if (source.IntentAchievements != null) {
            this.IntentAchievements = new IntentAchievement[source.IntentAchievements.length];
            for (int i = 0; i < source.IntentAchievements.length; i++) {
                this.IntentAchievements[i] = new IntentAchievement(source.IntentAchievements[i]);
            }
        }
        if (source.ImageTextRetrieval != null) {
            this.ImageTextRetrieval = new Boolean(source.ImageTextRetrieval);
        }
        if (source.AiCall != null) {
            this.AiCall = new AICallConfig(source.AiCall);
        }
        if (source.EnableAudit != null) {
            this.EnableAudit = new Boolean(source.EnableAudit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Greeting", this.Greeting);
        this.setParamSimple(map, prefix + "RoleDescription", this.RoleDescription);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "Search.", this.Search);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);
        this.setParamObj(map, prefix + "SearchRange.", this.SearchRange);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamObj(map, prefix + "SearchStrategy.", this.SearchStrategy);
        this.setParamObj(map, prefix + "SingleWorkflow.", this.SingleWorkflow);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "ThoughtModel.", this.ThoughtModel);
        this.setParamArrayObj(map, prefix + "IntentAchievements.", this.IntentAchievements);
        this.setParamSimple(map, prefix + "ImageTextRetrieval", this.ImageTextRetrieval);
        this.setParamObj(map, prefix + "AiCall.", this.AiCall);
        this.setParamSimple(map, prefix + "EnableAudit", this.EnableAudit);

    }
}

