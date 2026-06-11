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

public class DescribeMNPSubscribeMessageTemplateInfoResp extends AbstractModel {

    /**
    * <p>Template title.</p>
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * <p>Template title in multiple languages.</p>
    */
    @SerializedName("TemplateTitleI18nList")
    @Expose
    private I18nItem [] TemplateTitleI18nList;

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
    private String [] SupportLang;

    /**
    * <p>Template ID.</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Keywords.</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * <p>Template keyword in multiple languages.</p>
    */
    @SerializedName("KeywordI18nList")
    @Expose
    private SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] KeywordI18nList;

    /**
    * <p>Template type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Status. Valid values: 1: Active.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * @return TemplateTitleI18nList <p>Template title in multiple languages.</p>
     */
    public I18nItem [] getTemplateTitleI18nList() {
        return this.TemplateTitleI18nList;
    }

    /**
     * Set <p>Template title in multiple languages.</p>
     * @param TemplateTitleI18nList <p>Template title in multiple languages.</p>
     */
    public void setTemplateTitleI18nList(I18nItem [] TemplateTitleI18nList) {
        this.TemplateTitleI18nList = TemplateTitleI18nList;
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
    public String [] getSupportLang() {
        return this.SupportLang;
    }

    /**
     * Set <p>Supported languages.</p>
     * @param SupportLang <p>Supported languages.</p>
     */
    public void setSupportLang(String [] SupportLang) {
        this.SupportLang = SupportLang;
    }

    /**
     * Get <p>Template ID.</p> 
     * @return TemplateId <p>Template ID.</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Template ID.</p>
     * @param TemplateId <p>Template ID.</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Keywords.</p> 
     * @return Keywords <p>Keywords.</p>
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>Keywords.</p>
     * @param Keywords <p>Keywords.</p>
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>Template keyword in multiple languages.</p> 
     * @return KeywordI18nList <p>Template keyword in multiple languages.</p>
     */
    public SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] getKeywordI18nList() {
        return this.KeywordI18nList;
    }

    /**
     * Set <p>Template keyword in multiple languages.</p>
     * @param KeywordI18nList <p>Template keyword in multiple languages.</p>
     */
    public void setKeywordI18nList(SubscribeMessageTemplateLibraryKeywordI18nInfoResp [] KeywordI18nList) {
        this.KeywordI18nList = KeywordI18nList;
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

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Status. Valid values: 1: Active.</p> 
     * @return Status <p>Status. Valid values: 1: Active.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status. Valid values: 1: Active.</p>
     * @param Status <p>Status. Valid values: 1: Active.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeMNPSubscribeMessageTemplateInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSubscribeMessageTemplateInfoResp(DescribeMNPSubscribeMessageTemplateInfoResp source) {
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
            this.SupportLang = new String[source.SupportLang.length];
            for (int i = 0; i < source.SupportLang.length; i++) {
                this.SupportLang[i] = new String(source.SupportLang[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamArrayObj(map, prefix + "TemplateTitleI18nList.", this.TemplateTitleI18nList);
        this.setParamSimple(map, prefix + "DefaultLang", this.DefaultLang);
        this.setParamArraySimple(map, prefix + "SupportLang.", this.SupportLang);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamArrayObj(map, prefix + "KeywordI18nList.", this.KeywordI18nList);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

