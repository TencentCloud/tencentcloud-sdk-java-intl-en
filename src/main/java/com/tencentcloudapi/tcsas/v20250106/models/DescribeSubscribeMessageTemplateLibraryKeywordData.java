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

public class DescribeSubscribeMessageTemplateLibraryKeywordData extends AbstractModel {

    /**
    * <p>Subscription message template library keyword ID.</p>
    */
    @SerializedName("KeywordId")
    @Expose
    private String KeywordId;

    /**
    * <p>Subscription message template library keywords.</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Subscription message template library keyword type.</p>
    */
    @SerializedName("KeywordType")
    @Expose
    private String KeywordType;

    /**
    * <p>Subscription message template library keyword default value.</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>Subscription message template library keyword in multiple languages.</p>
    */
    @SerializedName("KeywordList")
    @Expose
    private I18nItem [] KeywordList;

    /**
    * <p>Subscription message template library keyword default value multilingual type.</p>
    */
    @SerializedName("DefaultValueList")
    @Expose
    private I18nItem [] DefaultValueList;

    /**
     * Get <p>Subscription message template library keyword ID.</p> 
     * @return KeywordId <p>Subscription message template library keyword ID.</p>
     */
    public String getKeywordId() {
        return this.KeywordId;
    }

    /**
     * Set <p>Subscription message template library keyword ID.</p>
     * @param KeywordId <p>Subscription message template library keyword ID.</p>
     */
    public void setKeywordId(String KeywordId) {
        this.KeywordId = KeywordId;
    }

    /**
     * Get <p>Subscription message template library keywords.</p> 
     * @return Keyword <p>Subscription message template library keywords.</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Subscription message template library keywords.</p>
     * @param Keyword <p>Subscription message template library keywords.</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>Subscription message template library keyword type.</p> 
     * @return KeywordType <p>Subscription message template library keyword type.</p>
     */
    public String getKeywordType() {
        return this.KeywordType;
    }

    /**
     * Set <p>Subscription message template library keyword type.</p>
     * @param KeywordType <p>Subscription message template library keyword type.</p>
     */
    public void setKeywordType(String KeywordType) {
        this.KeywordType = KeywordType;
    }

    /**
     * Get <p>Subscription message template library keyword default value.</p> 
     * @return DefaultValue <p>Subscription message template library keyword default value.</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>Subscription message template library keyword default value.</p>
     * @param DefaultValue <p>Subscription message template library keyword default value.</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>Subscription message template library keyword in multiple languages.</p> 
     * @return KeywordList <p>Subscription message template library keyword in multiple languages.</p>
     */
    public I18nItem [] getKeywordList() {
        return this.KeywordList;
    }

    /**
     * Set <p>Subscription message template library keyword in multiple languages.</p>
     * @param KeywordList <p>Subscription message template library keyword in multiple languages.</p>
     */
    public void setKeywordList(I18nItem [] KeywordList) {
        this.KeywordList = KeywordList;
    }

    /**
     * Get <p>Subscription message template library keyword default value multilingual type.</p> 
     * @return DefaultValueList <p>Subscription message template library keyword default value multilingual type.</p>
     */
    public I18nItem [] getDefaultValueList() {
        return this.DefaultValueList;
    }

    /**
     * Set <p>Subscription message template library keyword default value multilingual type.</p>
     * @param DefaultValueList <p>Subscription message template library keyword default value multilingual type.</p>
     */
    public void setDefaultValueList(I18nItem [] DefaultValueList) {
        this.DefaultValueList = DefaultValueList;
    }

    public DescribeSubscribeMessageTemplateLibraryKeywordData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeMessageTemplateLibraryKeywordData(DescribeSubscribeMessageTemplateLibraryKeywordData source) {
        if (source.KeywordId != null) {
            this.KeywordId = new String(source.KeywordId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.KeywordType != null) {
            this.KeywordType = new String(source.KeywordType);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.KeywordList != null) {
            this.KeywordList = new I18nItem[source.KeywordList.length];
            for (int i = 0; i < source.KeywordList.length; i++) {
                this.KeywordList[i] = new I18nItem(source.KeywordList[i]);
            }
        }
        if (source.DefaultValueList != null) {
            this.DefaultValueList = new I18nItem[source.DefaultValueList.length];
            for (int i = 0; i < source.DefaultValueList.length; i++) {
                this.DefaultValueList[i] = new I18nItem(source.DefaultValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeywordId", this.KeywordId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "KeywordType", this.KeywordType);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArrayObj(map, prefix + "KeywordList.", this.KeywordList);
        this.setParamArrayObj(map, prefix + "DefaultValueList.", this.DefaultValueList);

    }
}

