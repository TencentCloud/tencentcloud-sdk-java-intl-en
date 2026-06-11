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

public class I18nItem extends AbstractModel {

    /**
    * <p>Language.</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * <p>Value in the corresponding language.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>Language.</p> 
     * @return Lang <p>Language.</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>Language.</p>
     * @param Lang <p>Language.</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get <p>Value in the corresponding language.</p> 
     * @return Value <p>Value in the corresponding language.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Value in the corresponding language.</p>
     * @param Value <p>Value in the corresponding language.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public I18nItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public I18nItem(I18nItem source) {
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

