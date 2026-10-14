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

public class Content extends AbstractModel {

    /**
    * <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tabs<br>custom_params: custom business parameters<br>sandbox: cloud desktop<br>custom_variables: custom input parameters<br>web_search: web search content<br>file_collection: file collection information<br>widget: widget info<br>widget_action: client-side widget action information</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Text content</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Reference info.</p>
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * <p>Reference information</p>
    */
    @SerializedName("References")
    @Expose
    private ContentReference [] References;

    /**
    * <p>Image information.</p>
    */
    @SerializedName("Image")
    @Expose
    private ImageInfoContent Image;

    /**
    * <p>File information</p>
    */
    @SerializedName("File")
    @Expose
    private FileInfoContent File;

    /**
    * <p>Tab info.</p>
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>User-customized business parameter information.</p>
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * <p>Custom Variable</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
    * <p>Sandbox information</p>
    */
    @SerializedName("Sandbox")
    @Expose
    private SandboxContent Sandbox;

    /**
    * <p>Web page search content</p>
    */
    @SerializedName("WebSearch")
    @Expose
    private WebSearchContent WebSearch;

    /**
    * <p>File information collection</p>
    */
    @SerializedName("FileCollection")
    @Expose
    private FileCollection FileCollection;

    /**
    * <p>Widget information.</p>
    */
    @SerializedName("Widget")
    @Expose
    private Widget Widget;

    /**
    * <p>Widget action information</p>
    */
    @SerializedName("WidgetAction")
    @Expose
    private WidgetAction WidgetAction;

    /**
    * <p>Task List</p>
    */
    @SerializedName("Tasks")
    @Expose
    private AgentTask [] Tasks;

    /**
    * <p>Questionnaire information</p>
    */
    @SerializedName("Questionnaire")
    @Expose
    private Questionnaire Questionnaire;

    /**
    * <p>Tab mode</p>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
    * <p>MCP APP information returned</p>
    */
    @SerializedName("McpApp")
    @Expose
    private ConversationMcpApp McpApp;

    /**
    * <p>Application or workflow resource product</p>
    */
    @SerializedName("Resource")
    @Expose
    private ConversationResourceArtifact Resource;

    /**
     * Get <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tabs<br>custom_params: custom business parameters<br>sandbox: cloud desktop<br>custom_variables: custom input parameters<br>web_search: web search content<br>file_collection: file collection information<br>widget: widget info<br>widget_action: client-side widget action information</p> 
     * @return Type <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tabs<br>custom_params: custom business parameters<br>sandbox: cloud desktop<br>custom_variables: custom input parameters<br>web_search: web search content<br>file_collection: file collection information<br>widget: widget info<br>widget_action: client-side widget action information</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tabs<br>custom_params: custom business parameters<br>sandbox: cloud desktop<br>custom_variables: custom input parameters<br>web_search: web search content<br>file_collection: file collection information<br>widget: widget info<br>widget_action: client-side widget action information</p>
     * @param Type <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tabs<br>custom_params: custom business parameters<br>sandbox: cloud desktop<br>custom_variables: custom input parameters<br>web_search: web search content<br>file_collection: file collection information<br>widget: widget info<br>widget_action: client-side widget action information</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

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
     * Get <p>Reference info.</p> 
     * @return QuoteInfos <p>Reference info.</p>
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set <p>Reference info.</p>
     * @param QuoteInfos <p>Reference info.</p>
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get <p>Reference information</p> 
     * @return References <p>Reference information</p>
     */
    public ContentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>Reference information</p>
     * @param References <p>Reference information</p>
     */
    public void setReferences(ContentReference [] References) {
        this.References = References;
    }

    /**
     * Get <p>Image information.</p> 
     * @return Image <p>Image information.</p>
     */
    public ImageInfoContent getImage() {
        return this.Image;
    }

    /**
     * Set <p>Image information.</p>
     * @param Image <p>Image information.</p>
     */
    public void setImage(ImageInfoContent Image) {
        this.Image = Image;
    }

    /**
     * Get <p>File information</p> 
     * @return File <p>File information</p>
     */
    public FileInfoContent getFile() {
        return this.File;
    }

    /**
     * Set <p>File information</p>
     * @param File <p>File information</p>
     */
    public void setFile(FileInfoContent File) {
        this.File = File;
    }

    /**
     * Get <p>Tab info.</p> 
     * @return OptionCards <p>Tab info.</p>
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>Tab info.</p>
     * @param OptionCards <p>Tab info.</p>
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>User-customized business parameter information.</p> 
     * @return CustomParams <p>User-customized business parameter information.</p>
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set <p>User-customized business parameter information.</p>
     * @param CustomParams <p>User-customized business parameter information.</p>
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get <p>Custom Variable</p> 
     * @return CustomVariables <p>Custom Variable</p>
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>Custom Variable</p>
     * @param CustomVariables <p>Custom Variable</p>
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>Sandbox information</p> 
     * @return Sandbox <p>Sandbox information</p>
     */
    public SandboxContent getSandbox() {
        return this.Sandbox;
    }

    /**
     * Set <p>Sandbox information</p>
     * @param Sandbox <p>Sandbox information</p>
     */
    public void setSandbox(SandboxContent Sandbox) {
        this.Sandbox = Sandbox;
    }

    /**
     * Get <p>Web page search content</p> 
     * @return WebSearch <p>Web page search content</p>
     */
    public WebSearchContent getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set <p>Web page search content</p>
     * @param WebSearch <p>Web page search content</p>
     */
    public void setWebSearch(WebSearchContent WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get <p>File information collection</p> 
     * @return FileCollection <p>File information collection</p>
     */
    public FileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set <p>File information collection</p>
     * @param FileCollection <p>File information collection</p>
     */
    public void setFileCollection(FileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get <p>Widget information.</p> 
     * @return Widget <p>Widget information.</p>
     */
    public Widget getWidget() {
        return this.Widget;
    }

    /**
     * Set <p>Widget information.</p>
     * @param Widget <p>Widget information.</p>
     */
    public void setWidget(Widget Widget) {
        this.Widget = Widget;
    }

    /**
     * Get <p>Widget action information</p> 
     * @return WidgetAction <p>Widget action information</p>
     */
    public WidgetAction getWidgetAction() {
        return this.WidgetAction;
    }

    /**
     * Set <p>Widget action information</p>
     * @param WidgetAction <p>Widget action information</p>
     */
    public void setWidgetAction(WidgetAction WidgetAction) {
        this.WidgetAction = WidgetAction;
    }

    /**
     * Get <p>Task List</p> 
     * @return Tasks <p>Task List</p>
     */
    public AgentTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Task List</p>
     * @param Tasks <p>Task List</p>
     */
    public void setTasks(AgentTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>Questionnaire information</p> 
     * @return Questionnaire <p>Questionnaire information</p>
     */
    public Questionnaire getQuestionnaire() {
        return this.Questionnaire;
    }

    /**
     * Set <p>Questionnaire information</p>
     * @param Questionnaire <p>Questionnaire information</p>
     */
    public void setQuestionnaire(Questionnaire Questionnaire) {
        this.Questionnaire = Questionnaire;
    }

    /**
     * Get <p>Tab mode</p> 
     * @return OptionMode <p>Tab mode</p>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>Tab mode</p>
     * @param OptionMode <p>Tab mode</p>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
    }

    /**
     * Get <p>MCP APP information returned</p> 
     * @return McpApp <p>MCP APP information returned</p>
     */
    public ConversationMcpApp getMcpApp() {
        return this.McpApp;
    }

    /**
     * Set <p>MCP APP information returned</p>
     * @param McpApp <p>MCP APP information returned</p>
     */
    public void setMcpApp(ConversationMcpApp McpApp) {
        this.McpApp = McpApp;
    }

    /**
     * Get <p>Application or workflow resource product</p> 
     * @return Resource <p>Application or workflow resource product</p>
     */
    public ConversationResourceArtifact getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Application or workflow resource product</p>
     * @param Resource <p>Application or workflow resource product</p>
     */
    public void setResource(ConversationResourceArtifact Resource) {
        this.Resource = Resource;
    }

    public Content() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Content(Content source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.References != null) {
            this.References = new ContentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ContentReference(source.References[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new ImageInfoContent(source.Image);
        }
        if (source.File != null) {
            this.File = new FileInfoContent(source.File);
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.CustomParams != null) {
            this.CustomParams = new String[source.CustomParams.length];
            for (int i = 0; i < source.CustomParams.length; i++) {
                this.CustomParams[i] = new String(source.CustomParams[i]);
            }
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new String[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new String(source.CustomVariables[i]);
            }
        }
        if (source.Sandbox != null) {
            this.Sandbox = new SandboxContent(source.Sandbox);
        }
        if (source.WebSearch != null) {
            this.WebSearch = new WebSearchContent(source.WebSearch);
        }
        if (source.FileCollection != null) {
            this.FileCollection = new FileCollection(source.FileCollection);
        }
        if (source.Widget != null) {
            this.Widget = new Widget(source.Widget);
        }
        if (source.WidgetAction != null) {
            this.WidgetAction = new WidgetAction(source.WidgetAction);
        }
        if (source.Tasks != null) {
            this.Tasks = new AgentTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new AgentTask(source.Tasks[i]);
            }
        }
        if (source.Questionnaire != null) {
            this.Questionnaire = new Questionnaire(source.Questionnaire);
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
        }
        if (source.McpApp != null) {
            this.McpApp = new ConversationMcpApp(source.McpApp);
        }
        if (source.Resource != null) {
            this.Resource = new ConversationResourceArtifact(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "File.", this.File);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamArraySimple(map, prefix + "CustomParams.", this.CustomParams);
        this.setParamArraySimple(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamObj(map, prefix + "Sandbox.", this.Sandbox);
        this.setParamObj(map, prefix + "WebSearch.", this.WebSearch);
        this.setParamObj(map, prefix + "FileCollection.", this.FileCollection);
        this.setParamObj(map, prefix + "Widget.", this.Widget);
        this.setParamObj(map, prefix + "WidgetAction.", this.WidgetAction);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamObj(map, prefix + "Questionnaire.", this.Questionnaire);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);
        this.setParamObj(map, prefix + "McpApp.", this.McpApp);
        this.setParamObj(map, prefix + "Resource.", this.Resource);

    }
}

