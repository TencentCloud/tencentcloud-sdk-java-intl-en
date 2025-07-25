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

public class AgentProcedureDebugging extends AbstractModel {

    /**
    * Model thinking content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * The specific text content to be displayed.
    */
    @SerializedName("DisplayContent")
    @Expose
    private String DisplayContent;

    /**
    * Display type.
    */
    @SerializedName("DisplayType")
    @Expose
    private Long DisplayType;

    /**
    * Index displayed by the search engine.
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * Specific reference source.
    */
    @SerializedName("References")
    @Expose
    private AgentReference [] References;

    /**
    * Display the ongoing status.
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * URL of cloud desktop.
    */
    @SerializedName("SandboxUrl")
    @Expose
    private String SandboxUrl;

    /**
    * URL opened through the browser in cloud desktop.
    */
    @SerializedName("DisplayUrl")
    @Expose
    private String DisplayUrl;

    /**
     * Get Model thinking content. 
     * @return Content Model thinking content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Model thinking content.
     * @param Content Model thinking content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get The specific text content to be displayed. 
     * @return DisplayContent The specific text content to be displayed.
     */
    public String getDisplayContent() {
        return this.DisplayContent;
    }

    /**
     * Set The specific text content to be displayed.
     * @param DisplayContent The specific text content to be displayed.
     */
    public void setDisplayContent(String DisplayContent) {
        this.DisplayContent = DisplayContent;
    }

    /**
     * Get Display type. 
     * @return DisplayType Display type.
     */
    public Long getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set Display type.
     * @param DisplayType Display type.
     */
    public void setDisplayType(Long DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get Index displayed by the search engine. 
     * @return QuoteInfos Index displayed by the search engine.
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set Index displayed by the search engine.
     * @param QuoteInfos Index displayed by the search engine.
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get Specific reference source. 
     * @return References Specific reference source.
     */
    public AgentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set Specific reference source.
     * @param References Specific reference source.
     */
    public void setReferences(AgentReference [] References) {
        this.References = References;
    }

    /**
     * Get Display the ongoing status. 
     * @return DisplayStatus Display the ongoing status.
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set Display the ongoing status.
     * @param DisplayStatus Display the ongoing status.
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get URL of cloud desktop. 
     * @return SandboxUrl URL of cloud desktop.
     */
    public String getSandboxUrl() {
        return this.SandboxUrl;
    }

    /**
     * Set URL of cloud desktop.
     * @param SandboxUrl URL of cloud desktop.
     */
    public void setSandboxUrl(String SandboxUrl) {
        this.SandboxUrl = SandboxUrl;
    }

    /**
     * Get URL opened through the browser in cloud desktop. 
     * @return DisplayUrl URL opened through the browser in cloud desktop.
     */
    public String getDisplayUrl() {
        return this.DisplayUrl;
    }

    /**
     * Set URL opened through the browser in cloud desktop.
     * @param DisplayUrl URL opened through the browser in cloud desktop.
     */
    public void setDisplayUrl(String DisplayUrl) {
        this.DisplayUrl = DisplayUrl;
    }

    public AgentProcedureDebugging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProcedureDebugging(AgentProcedureDebugging source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DisplayContent != null) {
            this.DisplayContent = new String(source.DisplayContent);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new Long(source.DisplayType);
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.References != null) {
            this.References = new AgentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new AgentReference(source.References[i]);
            }
        }
        if (source.DisplayStatus != null) {
            this.DisplayStatus = new String(source.DisplayStatus);
        }
        if (source.SandboxUrl != null) {
            this.SandboxUrl = new String(source.SandboxUrl);
        }
        if (source.DisplayUrl != null) {
            this.DisplayUrl = new String(source.DisplayUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DisplayContent", this.DisplayContent);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "DisplayStatus", this.DisplayStatus);
        this.setParamSimple(map, prefix + "SandboxUrl", this.SandboxUrl);
        this.setParamSimple(map, prefix + "DisplayUrl", this.DisplayUrl);

    }
}

