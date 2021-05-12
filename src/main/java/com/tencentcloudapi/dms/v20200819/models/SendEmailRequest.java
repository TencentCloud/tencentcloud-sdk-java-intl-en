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
package com.tencentcloudapi.dms.v20200819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailRequest extends AbstractModel{

    /**
    * Sender
    */
    @SerializedName("FromAddress")
    @Expose
    private String FromAddress;

    /**
    * Recipient
    */
    @SerializedName("ToAddress")
    @Expose
    private String ToAddress;

    /**
    * Email summary
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Sender name
    */
    @SerializedName("FromName")
    @Expose
    private String FromName;

    /**
    * Reply-to address
    */
    @SerializedName("ReplyAddress")
    @Expose
    private String ReplyAddress;

    /**
    * The body of an HTML email
    */
    @SerializedName("HtmlContent")
    @Expose
    private String HtmlContent;

    /**
    * The body of a plain-text email
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
     * Get Sender 
     * @return FromAddress Sender
     */
    public String getFromAddress() {
        return this.FromAddress;
    }

    /**
     * Set Sender
     * @param FromAddress Sender
     */
    public void setFromAddress(String FromAddress) {
        this.FromAddress = FromAddress;
    }

    /**
     * Get Recipient 
     * @return ToAddress Recipient
     */
    public String getToAddress() {
        return this.ToAddress;
    }

    /**
     * Set Recipient
     * @param ToAddress Recipient
     */
    public void setToAddress(String ToAddress) {
        this.ToAddress = ToAddress;
    }

    /**
     * Get Email summary 
     * @return Subject Email summary
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Email summary
     * @param Subject Email summary
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Sender name 
     * @return FromName Sender name
     */
    public String getFromName() {
        return this.FromName;
    }

    /**
     * Set Sender name
     * @param FromName Sender name
     */
    public void setFromName(String FromName) {
        this.FromName = FromName;
    }

    /**
     * Get Reply-to address 
     * @return ReplyAddress Reply-to address
     */
    public String getReplyAddress() {
        return this.ReplyAddress;
    }

    /**
     * Set Reply-to address
     * @param ReplyAddress Reply-to address
     */
    public void setReplyAddress(String ReplyAddress) {
        this.ReplyAddress = ReplyAddress;
    }

    /**
     * Get The body of an HTML email 
     * @return HtmlContent The body of an HTML email
     */
    public String getHtmlContent() {
        return this.HtmlContent;
    }

    /**
     * Set The body of an HTML email
     * @param HtmlContent The body of an HTML email
     */
    public void setHtmlContent(String HtmlContent) {
        this.HtmlContent = HtmlContent;
    }

    /**
     * Get The body of a plain-text email 
     * @return TextContent The body of a plain-text email
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set The body of a plain-text email
     * @param TextContent The body of a plain-text email
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    public SendEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendEmailRequest(SendEmailRequest source) {
        if (source.FromAddress != null) {
            this.FromAddress = new String(source.FromAddress);
        }
        if (source.ToAddress != null) {
            this.ToAddress = new String(source.ToAddress);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.FromName != null) {
            this.FromName = new String(source.FromName);
        }
        if (source.ReplyAddress != null) {
            this.ReplyAddress = new String(source.ReplyAddress);
        }
        if (source.HtmlContent != null) {
            this.HtmlContent = new String(source.HtmlContent);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromAddress", this.FromAddress);
        this.setParamSimple(map, prefix + "ToAddress", this.ToAddress);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "FromName", this.FromName);
        this.setParamSimple(map, prefix + "ReplyAddress", this.ReplyAddress);
        this.setParamSimple(map, prefix + "HtmlContent", this.HtmlContent);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

