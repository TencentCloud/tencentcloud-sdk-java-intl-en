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
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * 
    */
    @SerializedName("References")
    @Expose
    private ContentReference [] References;

    /**
    * 
    */
    @SerializedName("Image")
    @Expose
    private ImageInfoContent Image;

    /**
    * 
    */
    @SerializedName("File")
    @Expose
    private FileInfoContent File;

    /**
    * 
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * 
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * 
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
    * 
    */
    @SerializedName("Sandbox")
    @Expose
    private SandboxContent Sandbox;

    /**
    * 
    */
    @SerializedName("WebSearch")
    @Expose
    private WebSearchContent WebSearch;

    /**
    * 
    */
    @SerializedName("FileCollection")
    @Expose
    private FileCollection FileCollection;

    /**
    * 
    */
    @SerializedName("Widget")
    @Expose
    private Widget Widget;

    /**
    * 
    */
    @SerializedName("WidgetAction")
    @Expose
    private WidgetAction WidgetAction;

    /**
    * 
    */
    @SerializedName("Tasks")
    @Expose
    private AgentTask [] Tasks;

    /**
    * 
    */
    @SerializedName("Questionnaire")
    @Expose
    private Questionnaire Questionnaire;

    /**
    * 
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return QuoteInfos 
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set 
     * @param QuoteInfos 
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get  
     * @return References 
     */
    public ContentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 
     * @param References 
     */
    public void setReferences(ContentReference [] References) {
        this.References = References;
    }

    /**
     * Get  
     * @return Image 
     */
    public ImageInfoContent getImage() {
        return this.Image;
    }

    /**
     * Set 
     * @param Image 
     */
    public void setImage(ImageInfoContent Image) {
        this.Image = Image;
    }

    /**
     * Get  
     * @return File 
     */
    public FileInfoContent getFile() {
        return this.File;
    }

    /**
     * Set 
     * @param File 
     */
    public void setFile(FileInfoContent File) {
        this.File = File;
    }

    /**
     * Get  
     * @return OptionCards 
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set 
     * @param OptionCards 
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get  
     * @return CustomParams 
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set 
     * @param CustomParams 
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get  
     * @return CustomVariables 
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set 
     * @param CustomVariables 
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get  
     * @return Sandbox 
     */
    public SandboxContent getSandbox() {
        return this.Sandbox;
    }

    /**
     * Set 
     * @param Sandbox 
     */
    public void setSandbox(SandboxContent Sandbox) {
        this.Sandbox = Sandbox;
    }

    /**
     * Get  
     * @return WebSearch 
     */
    public WebSearchContent getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set 
     * @param WebSearch 
     */
    public void setWebSearch(WebSearchContent WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get  
     * @return FileCollection 
     */
    public FileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set 
     * @param FileCollection 
     */
    public void setFileCollection(FileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get  
     * @return Widget 
     */
    public Widget getWidget() {
        return this.Widget;
    }

    /**
     * Set 
     * @param Widget 
     */
    public void setWidget(Widget Widget) {
        this.Widget = Widget;
    }

    /**
     * Get  
     * @return WidgetAction 
     */
    public WidgetAction getWidgetAction() {
        return this.WidgetAction;
    }

    /**
     * Set 
     * @param WidgetAction 
     */
    public void setWidgetAction(WidgetAction WidgetAction) {
        this.WidgetAction = WidgetAction;
    }

    /**
     * Get  
     * @return Tasks 
     */
    public AgentTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 
     * @param Tasks 
     */
    public void setTasks(AgentTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get  
     * @return Questionnaire 
     */
    public Questionnaire getQuestionnaire() {
        return this.Questionnaire;
    }

    /**
     * Set 
     * @param Questionnaire 
     */
    public void setQuestionnaire(Questionnaire Questionnaire) {
        this.Questionnaire = Questionnaire;
    }

    /**
     * Get  
     * @return OptionMode 
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set 
     * @param OptionMode 
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
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

    }
}

