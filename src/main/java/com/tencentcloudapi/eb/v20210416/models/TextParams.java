/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextParams extends AbstractModel {

    /**
    * Comma, | , tab, space, line break, %, or #, which can contain only 1 character.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
    * Entered regex (128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get Comma, | , tab, space, line break, %, or #, which can contain only 1 character.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Separator Comma, | , tab, space, line break, %, or #, which can contain only 1 character.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set Comma, | , tab, space, line break, %, or #, which can contain only 1 character.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Separator Comma, | , tab, space, line break, %, or #, which can contain only 1 character.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    /**
     * Get Entered regex (128 characters)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Regex Entered regex (128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Entered regex (128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Regex Entered regex (128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public TextParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextParams(TextParams source) {
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Separator", this.Separator);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

