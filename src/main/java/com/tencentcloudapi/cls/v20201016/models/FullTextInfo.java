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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FullTextInfo extends AbstractModel{

    /**
    * Case sensitivity
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * Separator of the full-text index. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * Whether Chinese characters are contained
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
     * Get Case sensitivity 
     * @return CaseSensitive Case sensitivity
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Case sensitivity
     * @param CaseSensitive Case sensitivity
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Separator of the full-text index. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r. 
     * @return Tokenizer Separator of the full-text index. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set Separator of the full-text index. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     * @param Tokenizer Separator of the full-text index. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get Whether Chinese characters are contained
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ContainZH Whether Chinese characters are contained
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set Whether Chinese characters are contained
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ContainZH Whether Chinese characters are contained
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    public FullTextInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FullTextInfo(FullTextInfo source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);

    }
}

