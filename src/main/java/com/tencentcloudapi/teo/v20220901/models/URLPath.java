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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class URLPath extends AbstractModel {

    /**
    * Execution action. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom;</li>
<li>regex: regular expression matching.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Regular expression for matching, with a length range of 1–1024.<br>Note: This field is required when Action is regex. When Action is follow or custom, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * Target URL for redirection. Length range: 1–1024.<br>Note: This field is required when Action is regex or custom. When Action is follow, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Execution action. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom;</li>
<li>regex: regular expression matching.</li> 
     * @return Action Execution action. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom;</li>
<li>regex: regular expression matching.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Execution action. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom;</li>
<li>regex: regular expression matching.</li>
     * @param Action Execution action. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom;</li>
<li>regex: regular expression matching.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Regular expression for matching, with a length range of 1–1024.<br>Note: This field is required when Action is regex. When Action is follow or custom, no need to specify this field, and it does not take effect if specified. 
     * @return Regex Regular expression for matching, with a length range of 1–1024.<br>Note: This field is required when Action is regex. When Action is follow or custom, no need to specify this field, and it does not take effect if specified.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Regular expression for matching, with a length range of 1–1024.<br>Note: This field is required when Action is regex. When Action is follow or custom, no need to specify this field, and it does not take effect if specified.
     * @param Regex Regular expression for matching, with a length range of 1–1024.<br>Note: This field is required when Action is regex. When Action is follow or custom, no need to specify this field, and it does not take effect if specified.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get Target URL for redirection. Length range: 1–1024.<br>Note: This field is required when Action is regex or custom. When Action is follow, no need to specify this field, and it does not take effect if specified. 
     * @return Value Target URL for redirection. Length range: 1–1024.<br>Note: This field is required when Action is regex or custom. When Action is follow, no need to specify this field, and it does not take effect if specified.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Target URL for redirection. Length range: 1–1024.<br>Note: This field is required when Action is regex or custom. When Action is follow, no need to specify this field, and it does not take effect if specified.
     * @param Value Target URL for redirection. Length range: 1–1024.<br>Note: This field is required when Action is regex or custom. When Action is follow, no need to specify this field, and it does not take effect if specified.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public URLPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public URLPath(URLPath source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

