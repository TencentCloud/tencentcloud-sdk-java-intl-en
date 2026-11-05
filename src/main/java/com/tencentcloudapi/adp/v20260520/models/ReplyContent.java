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

public class ReplyContent extends AbstractModel {

    /**
    * <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tab<br>custom_params: user-customized business parameter<br>sandbox: cloud desktop<br>custom_variables: custom input parameter<br>web_search: web search content<br>file_collection: file collection info<br>widget: widget info<br>widget_action: client-side widget action information</p>
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
    * <p>Tab information</p>
    */
    @SerializedName("OptionCardList")
    @Expose
    private String [] OptionCardList;

    /**
    * <p>File collection info</p>
    */
    @SerializedName("FileCollection")
    @Expose
    private ConversationFileCollection FileCollection;

    /**
    * <p>Widget information.</p>
    */
    @SerializedName("Widget")
    @Expose
    private ConversationWidget Widget;

    /**
     * Get <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tab<br>custom_params: user-customized business parameter<br>sandbox: cloud desktop<br>custom_variables: custom input parameter<br>web_search: web search content<br>file_collection: file collection info<br>widget: widget info<br>widget_action: client-side widget action information</p> 
     * @return Type <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tab<br>custom_params: user-customized business parameter<br>sandbox: cloud desktop<br>custom_variables: custom input parameter<br>web_search: web search content<br>file_collection: file collection info<br>widget: widget info<br>widget_action: client-side widget action information</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tab<br>custom_params: user-customized business parameter<br>sandbox: cloud desktop<br>custom_variables: custom input parameter<br>web_search: web search content<br>file_collection: file collection info<br>widget: widget info<br>widget_action: client-side widget action information</p>
     * @param Type <p>Message content type<br>text: text<br>image: image<br>file: file<br>option_cards: tab<br>custom_params: user-customized business parameter<br>sandbox: cloud desktop<br>custom_variables: custom input parameter<br>web_search: web search content<br>file_collection: file collection info<br>widget: widget info<br>widget_action: client-side widget action information</p>
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
     * Get <p>Tab information</p> 
     * @return OptionCardList <p>Tab information</p>
     */
    public String [] getOptionCardList() {
        return this.OptionCardList;
    }

    /**
     * Set <p>Tab information</p>
     * @param OptionCardList <p>Tab information</p>
     */
    public void setOptionCardList(String [] OptionCardList) {
        this.OptionCardList = OptionCardList;
    }

    /**
     * Get <p>File collection info</p> 
     * @return FileCollection <p>File collection info</p>
     */
    public ConversationFileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set <p>File collection info</p>
     * @param FileCollection <p>File collection info</p>
     */
    public void setFileCollection(ConversationFileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get <p>Widget information.</p> 
     * @return Widget <p>Widget information.</p>
     */
    public ConversationWidget getWidget() {
        return this.Widget;
    }

    /**
     * Set <p>Widget information.</p>
     * @param Widget <p>Widget information.</p>
     */
    public void setWidget(ConversationWidget Widget) {
        this.Widget = Widget;
    }

    public ReplyContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplyContent(ReplyContent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.OptionCardList != null) {
            this.OptionCardList = new String[source.OptionCardList.length];
            for (int i = 0; i < source.OptionCardList.length; i++) {
                this.OptionCardList[i] = new String(source.OptionCardList[i]);
            }
        }
        if (source.FileCollection != null) {
            this.FileCollection = new ConversationFileCollection(source.FileCollection);
        }
        if (source.Widget != null) {
            this.Widget = new ConversationWidget(source.Widget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "OptionCardList.", this.OptionCardList);
        this.setParamObj(map, prefix + "FileCollection.", this.FileCollection);
        this.setParamObj(map, prefix + "Widget.", this.Widget);

    }
}

