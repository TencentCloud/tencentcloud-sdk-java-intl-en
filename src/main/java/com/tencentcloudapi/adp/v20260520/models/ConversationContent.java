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

public class ConversationContent extends AbstractModel {

    /**
    * <p>Text content</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Content type. text: text, image: image, file: file, custom_variables: custom input parameter information, widget_action: widget action information</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Custom parameter data</p>
    */
    @SerializedName("CustomParamList")
    @Expose
    private String [] CustomParamList;

    /**
    * <p>Custom parameter data</p>
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * <p>Custom variable data</p>
    */
    @SerializedName("CustomVariablesData")
    @Expose
    private String CustomVariablesData;

    /**
    * <p>Business form</p>
    */
    @SerializedName("EnterpriseCharts")
    @Expose
    private String EnterpriseCharts;

    /**
    * <p>Tab List</p>
    */
    @SerializedName("OptionCardList")
    @Expose
    private String [] OptionCardList;

    /**
    * <p>Tab list.</p>
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>Tab mode. Enumeration values: 0-OPTION_MODE_SINGLE (single selection), 1-OPTION_MODE_MULTI (multiple selection)</p>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
    * <p>Reference marker information list</p>
    */
    @SerializedName("QuoteInfoList")
    @Expose
    private ConversationQuoteInfo [] QuoteInfoList;

    /**
    * <p>List of reference superscript information</p>
    */
    @SerializedName("QuoteInfos")
    @Expose
    private ConversationQuoteInfo [] QuoteInfos;

    /**
    * <p>Reference source list</p>
    */
    @SerializedName("ReferenceList")
    @Expose
    private ConversationReference [] ReferenceList;

    /**
    * <p>Reference list</p>
    */
    @SerializedName("References")
    @Expose
    private ConversationReference [] References;

    /**
    * <p>Associated record ID</p>
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>Intelligent Agent Task List</p>
    */
    @SerializedName("TaskList")
    @Expose
    private ConversationAgentTask [] TaskList;

    /**
    * <p>Intelligent Agent Task List</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ConversationAgentTask [] Tasks;

    /**
    * <p>Workflow input parameter</p>
    */
    @SerializedName("WorkflowInput")
    @Expose
    private String WorkflowInput;

    /**
    * <p>MCP-APP call information</p>
    */
    @SerializedName("McpApp")
    @Expose
    private ConversationMcpApp McpApp;

    /**
     * Get <p>Text content</p> 
     * @return Text <p>Text content</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text content</p>
     * @param Text <p>Text content</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Content type. text: text, image: image, file: file, custom_variables: custom input parameter information, widget_action: widget action information</p> 
     * @return Type <p>Content type. text: text, image: image, file: file, custom_variables: custom input parameter information, widget_action: widget action information</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Content type. text: text, image: image, file: file, custom_variables: custom input parameter information, widget_action: widget action information</p>
     * @param Type <p>Content type. text: text, image: image, file: file, custom_variables: custom input parameter information, widget_action: widget action information</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Custom parameter data</p> 
     * @return CustomParamList <p>Custom parameter data</p>
     */
    public String [] getCustomParamList() {
        return this.CustomParamList;
    }

    /**
     * Set <p>Custom parameter data</p>
     * @param CustomParamList <p>Custom parameter data</p>
     */
    public void setCustomParamList(String [] CustomParamList) {
        this.CustomParamList = CustomParamList;
    }

    /**
     * Get <p>Custom parameter data</p> 
     * @return CustomParams <p>Custom parameter data</p>
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set <p>Custom parameter data</p>
     * @param CustomParams <p>Custom parameter data</p>
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get <p>Custom variable data</p> 
     * @return CustomVariablesData <p>Custom variable data</p>
     */
    public String getCustomVariablesData() {
        return this.CustomVariablesData;
    }

    /**
     * Set <p>Custom variable data</p>
     * @param CustomVariablesData <p>Custom variable data</p>
     */
    public void setCustomVariablesData(String CustomVariablesData) {
        this.CustomVariablesData = CustomVariablesData;
    }

    /**
     * Get <p>Business form</p> 
     * @return EnterpriseCharts <p>Business form</p>
     */
    public String getEnterpriseCharts() {
        return this.EnterpriseCharts;
    }

    /**
     * Set <p>Business form</p>
     * @param EnterpriseCharts <p>Business form</p>
     */
    public void setEnterpriseCharts(String EnterpriseCharts) {
        this.EnterpriseCharts = EnterpriseCharts;
    }

    /**
     * Get <p>Tab List</p> 
     * @return OptionCardList <p>Tab List</p>
     */
    public String [] getOptionCardList() {
        return this.OptionCardList;
    }

    /**
     * Set <p>Tab List</p>
     * @param OptionCardList <p>Tab List</p>
     */
    public void setOptionCardList(String [] OptionCardList) {
        this.OptionCardList = OptionCardList;
    }

    /**
     * Get <p>Tab list.</p> 
     * @return OptionCards <p>Tab list.</p>
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>Tab list.</p>
     * @param OptionCards <p>Tab list.</p>
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>Tab mode. Enumeration values: 0-OPTION_MODE_SINGLE (single selection), 1-OPTION_MODE_MULTI (multiple selection)</p> 
     * @return OptionMode <p>Tab mode. Enumeration values: 0-OPTION_MODE_SINGLE (single selection), 1-OPTION_MODE_MULTI (multiple selection)</p>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>Tab mode. Enumeration values: 0-OPTION_MODE_SINGLE (single selection), 1-OPTION_MODE_MULTI (multiple selection)</p>
     * @param OptionMode <p>Tab mode. Enumeration values: 0-OPTION_MODE_SINGLE (single selection), 1-OPTION_MODE_MULTI (multiple selection)</p>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
    }

    /**
     * Get <p>Reference marker information list</p> 
     * @return QuoteInfoList <p>Reference marker information list</p>
     */
    public ConversationQuoteInfo [] getQuoteInfoList() {
        return this.QuoteInfoList;
    }

    /**
     * Set <p>Reference marker information list</p>
     * @param QuoteInfoList <p>Reference marker information list</p>
     */
    public void setQuoteInfoList(ConversationQuoteInfo [] QuoteInfoList) {
        this.QuoteInfoList = QuoteInfoList;
    }

    /**
     * Get <p>List of reference superscript information</p> 
     * @return QuoteInfos <p>List of reference superscript information</p>
     */
    public ConversationQuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set <p>List of reference superscript information</p>
     * @param QuoteInfos <p>List of reference superscript information</p>
     */
    public void setQuoteInfos(ConversationQuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get <p>Reference source list</p> 
     * @return ReferenceList <p>Reference source list</p>
     */
    public ConversationReference [] getReferenceList() {
        return this.ReferenceList;
    }

    /**
     * Set <p>Reference source list</p>
     * @param ReferenceList <p>Reference source list</p>
     */
    public void setReferenceList(ConversationReference [] ReferenceList) {
        this.ReferenceList = ReferenceList;
    }

    /**
     * Get <p>Reference list</p> 
     * @return References <p>Reference list</p>
     */
    public ConversationReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>Reference list</p>
     * @param References <p>Reference list</p>
     */
    public void setReferences(ConversationReference [] References) {
        this.References = References;
    }

    /**
     * Get <p>Associated record ID</p> 
     * @return RelatedRecordId <p>Associated record ID</p>
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>Associated record ID</p>
     * @param RelatedRecordId <p>Associated record ID</p>
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>Intelligent Agent Task List</p> 
     * @return TaskList <p>Intelligent Agent Task List</p>
     */
    public ConversationAgentTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>Intelligent Agent Task List</p>
     * @param TaskList <p>Intelligent Agent Task List</p>
     */
    public void setTaskList(ConversationAgentTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>Intelligent Agent Task List</p> 
     * @return Tasks <p>Intelligent Agent Task List</p>
     */
    public ConversationAgentTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Intelligent Agent Task List</p>
     * @param Tasks <p>Intelligent Agent Task List</p>
     */
    public void setTasks(ConversationAgentTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>Workflow input parameter</p> 
     * @return WorkflowInput <p>Workflow input parameter</p>
     */
    public String getWorkflowInput() {
        return this.WorkflowInput;
    }

    /**
     * Set <p>Workflow input parameter</p>
     * @param WorkflowInput <p>Workflow input parameter</p>
     */
    public void setWorkflowInput(String WorkflowInput) {
        this.WorkflowInput = WorkflowInput;
    }

    /**
     * Get <p>MCP-APP call information</p> 
     * @return McpApp <p>MCP-APP call information</p>
     */
    public ConversationMcpApp getMcpApp() {
        return this.McpApp;
    }

    /**
     * Set <p>MCP-APP call information</p>
     * @param McpApp <p>MCP-APP call information</p>
     */
    public void setMcpApp(ConversationMcpApp McpApp) {
        this.McpApp = McpApp;
    }

    public ConversationContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationContent(ConversationContent source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CustomParamList != null) {
            this.CustomParamList = new String[source.CustomParamList.length];
            for (int i = 0; i < source.CustomParamList.length; i++) {
                this.CustomParamList[i] = new String(source.CustomParamList[i]);
            }
        }
        if (source.CustomParams != null) {
            this.CustomParams = new String[source.CustomParams.length];
            for (int i = 0; i < source.CustomParams.length; i++) {
                this.CustomParams[i] = new String(source.CustomParams[i]);
            }
        }
        if (source.CustomVariablesData != null) {
            this.CustomVariablesData = new String(source.CustomVariablesData);
        }
        if (source.EnterpriseCharts != null) {
            this.EnterpriseCharts = new String(source.EnterpriseCharts);
        }
        if (source.OptionCardList != null) {
            this.OptionCardList = new String[source.OptionCardList.length];
            for (int i = 0; i < source.OptionCardList.length; i++) {
                this.OptionCardList[i] = new String(source.OptionCardList[i]);
            }
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
        }
        if (source.QuoteInfoList != null) {
            this.QuoteInfoList = new ConversationQuoteInfo[source.QuoteInfoList.length];
            for (int i = 0; i < source.QuoteInfoList.length; i++) {
                this.QuoteInfoList[i] = new ConversationQuoteInfo(source.QuoteInfoList[i]);
            }
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new ConversationQuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new ConversationQuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.ReferenceList != null) {
            this.ReferenceList = new ConversationReference[source.ReferenceList.length];
            for (int i = 0; i < source.ReferenceList.length; i++) {
                this.ReferenceList[i] = new ConversationReference(source.ReferenceList[i]);
            }
        }
        if (source.References != null) {
            this.References = new ConversationReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ConversationReference(source.References[i]);
            }
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.TaskList != null) {
            this.TaskList = new ConversationAgentTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new ConversationAgentTask(source.TaskList[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ConversationAgentTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ConversationAgentTask(source.Tasks[i]);
            }
        }
        if (source.WorkflowInput != null) {
            this.WorkflowInput = new String(source.WorkflowInput);
        }
        if (source.McpApp != null) {
            this.McpApp = new ConversationMcpApp(source.McpApp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "CustomParamList.", this.CustomParamList);
        this.setParamArraySimple(map, prefix + "CustomParams.", this.CustomParams);
        this.setParamSimple(map, prefix + "CustomVariablesData", this.CustomVariablesData);
        this.setParamSimple(map, prefix + "EnterpriseCharts", this.EnterpriseCharts);
        this.setParamArraySimple(map, prefix + "OptionCardList.", this.OptionCardList);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);
        this.setParamArrayObj(map, prefix + "QuoteInfoList.", this.QuoteInfoList);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "ReferenceList.", this.ReferenceList);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "WorkflowInput", this.WorkflowInput);
        this.setParamObj(map, prefix + "McpApp.", this.McpApp);

    }
}

