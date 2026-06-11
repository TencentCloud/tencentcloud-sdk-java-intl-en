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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGSubscribeMessageTemplateLibraryInfoResp extends AbstractModel {

    /**
    * <p>Subscription message template library title.</p>
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * <p>Subscription message template library title in multiple languages.</p>
    */
    @SerializedName("TemplateTitleI18nList")
    @Expose
    private I18nItem [] TemplateTitleI18nList;

    /**
    * <p>Subscription message template library default language.</p>
    */
    @SerializedName("DefaultLang")
    @Expose
    private String DefaultLang;

    /**
    * <p>Subscription message template library supported languages.</p>
    */
    @SerializedName("SupportLang")
    @Expose
    private String SupportLang;

    /**
    * <p>Subscription message template library keywords.</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * <p>Subscription message template library keyword in multiple languages.</p>
    */
    @SerializedName("KeywordI18nList")
    @Expose
    private SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] KeywordI18nList;

    /**
    * <p>Subscription message template library description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Subscription message template library ID.</p>
    */
    @SerializedName("TemplateLibraryId")
    @Expose
    private String TemplateLibraryId;

    /**
    * <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
     * Get <p>Subscription message template library title.</p> 
     * @return TemplateTitle <p>Subscription message template library title.</p>
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set <p>Subscription message template library title.</p>
     * @param TemplateTitle <p>Subscription message template library title.</p>
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get <p>Subscription message template library title in multiple languages.</p> 
     * @return TemplateTitleI18nList <p>Subscription message template library title in multiple languages.</p>
     */
    public I18nItem [] getTemplateTitleI18nList() {
        return this.TemplateTitleI18nList;
    }

    /**
     * Set <p>Subscription message template library title in multiple languages.</p>
     * @param TemplateTitleI18nList <p>Subscription message template library title in multiple languages.</p>
     */
    public void setTemplateTitleI18nList(I18nItem [] TemplateTitleI18nList) {
        this.TemplateTitleI18nList = TemplateTitleI18nList;
    }

    /**
     * Get <p>Subscription message template library default language.</p> 
     * @return DefaultLang <p>Subscription message template library default language.</p>
     */
    public String getDefaultLang() {
        return this.DefaultLang;
    }

    /**
     * Set <p>Subscription message template library default language.</p>
     * @param DefaultLang <p>Subscription message template library default language.</p>
     */
    public void setDefaultLang(String DefaultLang) {
        this.DefaultLang = DefaultLang;
    }

    /**
     * Get <p>Subscription message template library supported languages.</p> 
     * @return SupportLang <p>Subscription message template library supported languages.</p>
     */
    public String getSupportLang() {
        return this.SupportLang;
    }

    /**
     * Set <p>Subscription message template library supported languages.</p>
     * @param SupportLang <p>Subscription message template library supported languages.</p>
     */
    public void setSupportLang(String SupportLang) {
        this.SupportLang = SupportLang;
    }

    /**
     * Get <p>Subscription message template library keywords.</p> 
     * @return Keywords <p>Subscription message template library keywords.</p>
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>Subscription message template library keywords.</p>
     * @param Keywords <p>Subscription message template library keywords.</p>
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>Subscription message template library keyword in multiple languages.</p> 
     * @return KeywordI18nList <p>Subscription message template library keyword in multiple languages.</p>
     */
    public SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] getKeywordI18nList() {
        return this.KeywordI18nList;
    }

    /**
     * Set <p>Subscription message template library keyword in multiple languages.</p>
     * @param KeywordI18nList <p>Subscription message template library keyword in multiple languages.</p>
     */
    public void setKeywordI18nList(SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] KeywordI18nList) {
        this.KeywordI18nList = KeywordI18nList;
    }

    /**
     * Get <p>Subscription message template library description.</p> 
     * @return Description <p>Subscription message template library description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Subscription message template library description.</p>
     * @param Description <p>Subscription message template library description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Subscription message template library ID.</p> 
     * @return TemplateLibraryId <p>Subscription message template library ID.</p>
     */
    public String getTemplateLibraryId() {
        return this.TemplateLibraryId;
    }

    /**
     * Set <p>Subscription message template library ID.</p>
     * @param TemplateLibraryId <p>Subscription message template library ID.</p>
     */
    public void setTemplateLibraryId(String TemplateLibraryId) {
        this.TemplateLibraryId = TemplateLibraryId;
    }

    /**
     * Get <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p> 
     * @return TemplateType <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     * @param TemplateType <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    public DescribeMNGSubscribeMessageTemplateLibraryInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSubscribeMessageTemplateLibraryInfoResp(DescribeMNGSubscribeMessageTemplateLibraryInfoResp source) {
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TemplateTitleI18nList != null) {
            this.TemplateTitleI18nList = new I18nItem[source.TemplateTitleI18nList.length];
            for (int i = 0; i < source.TemplateTitleI18nList.length; i++) {
                this.TemplateTitleI18nList[i] = new I18nItem(source.TemplateTitleI18nList[i]);
            }
        }
        if (source.DefaultLang != null) {
            this.DefaultLang = new String(source.DefaultLang);
        }
        if (source.SupportLang != null) {
            this.SupportLang = new String(source.SupportLang);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.KeywordI18nList != null) {
            this.KeywordI18nList = new SubscribeMessageTemplateLibraryKeywordI18nInfoResp[source.KeywordI18nList.length];
            for (int i = 0; i < source.KeywordI18nList.length; i++) {
                this.KeywordI18nList[i] = new SubscribeMessageTemplateLibraryKeywordI18nInfoResp(source.KeywordI18nList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TemplateLibraryId != null) {
            this.TemplateLibraryId = new String(source.TemplateLibraryId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamArrayObj(map, prefix + "TemplateTitleI18nList.", this.TemplateTitleI18nList);
        this.setParamSimple(map, prefix + "DefaultLang", this.DefaultLang);
        this.setParamSimple(map, prefix + "SupportLang", this.SupportLang);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamArrayObj(map, prefix + "KeywordI18nList.", this.KeywordI18nList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TemplateLibraryId", this.TemplateLibraryId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);

    }
}

