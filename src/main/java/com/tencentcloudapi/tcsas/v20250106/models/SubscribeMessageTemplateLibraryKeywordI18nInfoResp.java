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

public class SubscribeMessageTemplateLibraryKeywordI18nInfoResp extends AbstractModel {

    /**
    * <p>Multilanguage list.</p>
    */
    @SerializedName("I18nList")
    @Expose
    private I18nItem [] I18nList;

    /**
     * Get <p>Multilanguage list.</p> 
     * @return I18nList <p>Multilanguage list.</p>
     */
    public I18nItem [] getI18nList() {
        return this.I18nList;
    }

    /**
     * Set <p>Multilanguage list.</p>
     * @param I18nList <p>Multilanguage list.</p>
     */
    public void setI18nList(I18nItem [] I18nList) {
        this.I18nList = I18nList;
    }

    public SubscribeMessageTemplateLibraryKeywordI18nInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeMessageTemplateLibraryKeywordI18nInfoResp(SubscribeMessageTemplateLibraryKeywordI18nInfoResp source) {
        if (source.I18nList != null) {
            this.I18nList = new I18nItem[source.I18nList.length];
            for (int i = 0; i < source.I18nList.length; i++) {
                this.I18nList[i] = new I18nItem(source.I18nList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "I18nList.", this.I18nList);

    }
}

