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

public class DescribeSubscribeMessageTemplateLibraryKeywordInfoResp extends AbstractModel {

    /**
    * <p>Template keyword ID.</p>
    */
    @SerializedName("KeywordId")
    @Expose
    private String KeywordId;

    /**
    * <p>Template keyword.</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Template keyword type.</p>
    */
    @SerializedName("KeywordType")
    @Expose
    private String KeywordType;

    /**
    * <p>Template keyword default value.</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>Template keyword in multiple languages.</p>
    */
    @SerializedName("KeywordList")
    @Expose
    private I18nItem [] KeywordList;

    /**
    * <p>Template keyword default values in multiple languages.</p>
    */
    @SerializedName("DefaultValueList")
    @Expose
    private I18nItem [] DefaultValueList;

    /**
     * Get <p>Template keyword ID.</p> 
     * @return KeywordId <p>Template keyword ID.</p>
     */
    public String getKeywordId() {
        return this.KeywordId;
    }

    /**
     * Set <p>Template keyword ID.</p>
     * @param KeywordId <p>Template keyword ID.</p>
     */
    public void setKeywordId(String KeywordId) {
        this.KeywordId = KeywordId;
    }

    /**
     * Get <p>Template keyword.</p> 
     * @return Keyword <p>Template keyword.</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Template keyword.</p>
     * @param Keyword <p>Template keyword.</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>Template keyword type.</p> 
     * @return KeywordType <p>Template keyword type.</p>
     */
    public String getKeywordType() {
        return this.KeywordType;
    }

    /**
     * Set <p>Template keyword type.</p>
     * @param KeywordType <p>Template keyword type.</p>
     */
    public void setKeywordType(String KeywordType) {
        this.KeywordType = KeywordType;
    }

    /**
     * Get <p>Template keyword default value.</p> 
     * @return DefaultValue <p>Template keyword default value.</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>Template keyword default value.</p>
     * @param DefaultValue <p>Template keyword default value.</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>Template keyword in multiple languages.</p> 
     * @return KeywordList <p>Template keyword in multiple languages.</p>
     */
    public I18nItem [] getKeywordList() {
        return this.KeywordList;
    }

    /**
     * Set <p>Template keyword in multiple languages.</p>
     * @param KeywordList <p>Template keyword in multiple languages.</p>
     */
    public void setKeywordList(I18nItem [] KeywordList) {
        this.KeywordList = KeywordList;
    }

    /**
     * Get <p>Template keyword default values in multiple languages.</p> 
     * @return DefaultValueList <p>Template keyword default values in multiple languages.</p>
     */
    public I18nItem [] getDefaultValueList() {
        return this.DefaultValueList;
    }

    /**
     * Set <p>Template keyword default values in multiple languages.</p>
     * @param DefaultValueList <p>Template keyword default values in multiple languages.</p>
     */
    public void setDefaultValueList(I18nItem [] DefaultValueList) {
        this.DefaultValueList = DefaultValueList;
    }

    public DescribeSubscribeMessageTemplateLibraryKeywordInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeMessageTemplateLibraryKeywordInfoResp(DescribeSubscribeMessageTemplateLibraryKeywordInfoResp source) {
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

