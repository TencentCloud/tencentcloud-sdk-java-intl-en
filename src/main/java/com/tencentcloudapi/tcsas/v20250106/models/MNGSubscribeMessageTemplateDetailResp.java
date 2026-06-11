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

public class MNGSubscribeMessageTemplateDetailResp extends AbstractModel {

    /**
    * <p>Subscription message template ID.</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Subscription message template title.</p>
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * <p>Subscription message template title in multiple languages.</p>
    */
    @SerializedName("TitleList")
    @Expose
    private I18nItem [] TitleList;

    /**
    * <p>Subscription message template default language.</p>
    */
    @SerializedName("DefaultLang")
    @Expose
    private String DefaultLang;

    /**
    * <p>Subscription message template supported languages.</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>Subscription message template keywords.</p>
    */
    @SerializedName("KeywordList")
    @Expose
    private DescribeMNGSubscribeMessageTemplateLibraryKeywordData [] KeywordList;

    /**
    * <p>Mini game name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini game icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
     * Get <p>Subscription message template ID.</p> 
     * @return TemplateId <p>Subscription message template ID.</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Subscription message template ID.</p>
     * @param TemplateId <p>Subscription message template ID.</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Subscription message template title.</p> 
     * @return TemplateTitle <p>Subscription message template title.</p>
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set <p>Subscription message template title.</p>
     * @param TemplateTitle <p>Subscription message template title.</p>
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get <p>Subscription message template title in multiple languages.</p> 
     * @return TitleList <p>Subscription message template title in multiple languages.</p>
     */
    public I18nItem [] getTitleList() {
        return this.TitleList;
    }

    /**
     * Set <p>Subscription message template title in multiple languages.</p>
     * @param TitleList <p>Subscription message template title in multiple languages.</p>
     */
    public void setTitleList(I18nItem [] TitleList) {
        this.TitleList = TitleList;
    }

    /**
     * Get <p>Subscription message template default language.</p> 
     * @return DefaultLang <p>Subscription message template default language.</p>
     */
    public String getDefaultLang() {
        return this.DefaultLang;
    }

    /**
     * Set <p>Subscription message template default language.</p>
     * @param DefaultLang <p>Subscription message template default language.</p>
     */
    public void setDefaultLang(String DefaultLang) {
        this.DefaultLang = DefaultLang;
    }

    /**
     * Get <p>Subscription message template supported languages.</p> 
     * @return Languages <p>Subscription message template supported languages.</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>Subscription message template supported languages.</p>
     * @param Languages <p>Subscription message template supported languages.</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>Subscription message template keywords.</p> 
     * @return KeywordList <p>Subscription message template keywords.</p>
     */
    public DescribeMNGSubscribeMessageTemplateLibraryKeywordData [] getKeywordList() {
        return this.KeywordList;
    }

    /**
     * Set <p>Subscription message template keywords.</p>
     * @param KeywordList <p>Subscription message template keywords.</p>
     */
    public void setKeywordList(DescribeMNGSubscribeMessageTemplateLibraryKeywordData [] KeywordList) {
        this.KeywordList = KeywordList;
    }

    /**
     * Get <p>Mini game name.</p> 
     * @return MNPName <p>Mini game name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name.</p>
     * @param MNPName <p>Mini game name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini game icon.</p> 
     * @return MNPIcon <p>Mini game icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini game icon.</p>
     * @param MNPIcon <p>Mini game icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
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

    public MNGSubscribeMessageTemplateDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNGSubscribeMessageTemplateDetailResp(MNGSubscribeMessageTemplateDetailResp source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TitleList != null) {
            this.TitleList = new I18nItem[source.TitleList.length];
            for (int i = 0; i < source.TitleList.length; i++) {
                this.TitleList[i] = new I18nItem(source.TitleList[i]);
            }
        }
        if (source.DefaultLang != null) {
            this.DefaultLang = new String(source.DefaultLang);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.KeywordList != null) {
            this.KeywordList = new DescribeMNGSubscribeMessageTemplateLibraryKeywordData[source.KeywordList.length];
            for (int i = 0; i < source.KeywordList.length; i++) {
                this.KeywordList[i] = new DescribeMNGSubscribeMessageTemplateLibraryKeywordData(source.KeywordList[i]);
            }
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamArrayObj(map, prefix + "TitleList.", this.TitleList);
        this.setParamSimple(map, prefix + "DefaultLang", this.DefaultLang);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamArrayObj(map, prefix + "KeywordList.", this.KeywordList);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);

    }
}

