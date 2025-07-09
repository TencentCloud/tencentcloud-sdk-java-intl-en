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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyRegexInfo extends AbstractModel {

    /**
    * Log key to be filtered
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Filter rule regex corresponding to key
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get Log key to be filtered 
     * @return Key Log key to be filtered
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Log key to be filtered
     * @param Key Log key to be filtered
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Filter rule regex corresponding to key 
     * @return Regex Filter rule regex corresponding to key
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Filter rule regex corresponding to key
     * @param Regex Filter rule regex corresponding to key
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public KeyRegexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyRegexInfo(KeyRegexInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

