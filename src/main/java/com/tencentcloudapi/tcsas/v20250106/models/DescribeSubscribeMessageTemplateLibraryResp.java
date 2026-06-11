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

public class DescribeSubscribeMessageTemplateLibraryResp extends AbstractModel {

    /**
    * <p>Mini program name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini program icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Template title.</p>
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * <p>Template title in multiple languages.</p>
    */
    @SerializedName("TitleList")
    @Expose
    private I18nItem [] TitleList;

    /**
    * <p>Default language.</p>
    */
    @SerializedName("DefaultLang")
    @Expose
    private String DefaultLang;

    /**
    * <p>Supported languages.</p>
    */
    @SerializedName("SupportLang")
    @Expose
    private String SupportLang;

    /**
    * <p>Template keyword in multiple languages.</p>
    */
    @SerializedName("KeywordList")
    @Expose
    private DescribeSubscribeMessageTemplateLibraryKeywordInfoResp [] KeywordList;

    /**
    * <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
     * Get <p>Mini program name.</p> 
     * @return MNPName <p>Mini program name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini program name.</p>
     * @param MNPName <p>Mini program name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini program icon.</p> 
     * @return MNPIcon <p>Mini program icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini program icon.</p>
     * @param MNPIcon <p>Mini program icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Template title.</p> 
     * @return TemplateTitle <p>Template title.</p>
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set <p>Template title.</p>
     * @param TemplateTitle <p>Template title.</p>
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get <p>Template title in multiple languages.</p> 
     * @return TitleList <p>Template title in multiple languages.</p>
     */
    public I18nItem [] getTitleList() {
        return this.TitleList;
    }

    /**
     * Set <p>Template title in multiple languages.</p>
     * @param TitleList <p>Template title in multiple languages.</p>
     */
    public void setTitleList(I18nItem [] TitleList) {
        this.TitleList = TitleList;
    }

    /**
     * Get <p>Default language.</p> 
     * @return DefaultLang <p>Default language.</p>
     */
    public String getDefaultLang() {
        return this.DefaultLang;
    }

    /**
     * Set <p>Default language.</p>
     * @param DefaultLang <p>Default language.</p>
     */
    public void setDefaultLang(String DefaultLang) {
        this.DefaultLang = DefaultLang;
    }

    /**
     * Get <p>Supported languages.</p> 
     * @return SupportLang <p>Supported languages.</p>
     */
    public String getSupportLang() {
        return this.SupportLang;
    }

    /**
     * Set <p>Supported languages.</p>
     * @param SupportLang <p>Supported languages.</p>
     */
    public void setSupportLang(String SupportLang) {
        this.SupportLang = SupportLang;
    }

    /**
     * Get <p>Template keyword in multiple languages.</p> 
     * @return KeywordList <p>Template keyword in multiple languages.</p>
     */
    public DescribeSubscribeMessageTemplateLibraryKeywordInfoResp [] getKeywordList() {
        return this.KeywordList;
    }

    /**
     * Set <p>Template keyword in multiple languages.</p>
     * @param KeywordList <p>Template keyword in multiple languages.</p>
     */
    public void setKeywordList(DescribeSubscribeMessageTemplateLibraryKeywordInfoResp [] KeywordList) {
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

    public DescribeSubscribeMessageTemplateLibraryResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeMessageTemplateLibraryResp(DescribeSubscribeMessageTemplateLibraryResp source) {
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
            this.KeywordList = new DescribeSubscribeMessageTemplateLibraryKeywordInfoResp[source.KeywordList.length];
            for (int i = 0; i < source.KeywordList.length; i++) {
                this.KeywordList[i] = new DescribeSubscribeMessageTemplateLibraryKeywordInfoResp(source.KeywordList[i]);
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

