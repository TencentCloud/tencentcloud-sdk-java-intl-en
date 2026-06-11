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

public class DescribeMNGSubscribeMessageTemplateLibraryResp extends AbstractModel {

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
    @SerializedName("SupportLang")
    @Expose
    private String SupportLang;

    /**
    * <p>Subscription message template keyword list.</p>
    */
    @SerializedName("KeywordList")
    @Expose
    private DescribeMNGSubscribeMessageTemplateLibraryKeywordInfoResp [] KeywordList;

    /**
    * <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

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
     * @return SupportLang <p>Subscription message template supported languages.</p>
     */
    public String getSupportLang() {
        return this.SupportLang;
    }

    /**
     * Set <p>Subscription message template supported languages.</p>
     * @param SupportLang <p>Subscription message template supported languages.</p>
     */
    public void setSupportLang(String SupportLang) {
        this.SupportLang = SupportLang;
    }

    /**
     * Get <p>Subscription message template keyword list.</p> 
     * @return KeywordList <p>Subscription message template keyword list.</p>
     */
    public DescribeMNGSubscribeMessageTemplateLibraryKeywordInfoResp [] getKeywordList() {
        return this.KeywordList;
    }

    /**
     * Set <p>Subscription message template keyword list.</p>
     * @param KeywordList <p>Subscription message template keyword list.</p>
     */
    public void setKeywordList(DescribeMNGSubscribeMessageTemplateLibraryKeywordInfoResp [] KeywordList) {
        this.KeywordList = KeywordList;
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

    public DescribeMNGSubscribeMessageTemplateLibraryResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSubscribeMessageTemplateLibraryResp(DescribeMNGSubscribeMessageTemplateLibraryResp source) {
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
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
        if (source.SupportLang != null) {
            this.SupportLang = new String(source.SupportLang);
        }
        if (source.KeywordList != null) {
            this.KeywordList = new DescribeMNGSubscribeMessageTemplateLibraryKeywordInfoResp[source.KeywordList.length];
            for (int i = 0; i < source.KeywordList.length; i++) {
                this.KeywordList[i] = new DescribeMNGSubscribeMessageTemplateLibraryKeywordInfoResp(source.KeywordList[i]);
            }
        }
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamArrayObj(map, prefix + "TitleList.", this.TitleList);
        this.setParamSimple(map, prefix + "DefaultLang", this.DefaultLang);
        this.setParamSimple(map, prefix + "SupportLang", this.SupportLang);
        this.setParamArrayObj(map, prefix + "KeywordList.", this.KeywordList);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);

    }
}

