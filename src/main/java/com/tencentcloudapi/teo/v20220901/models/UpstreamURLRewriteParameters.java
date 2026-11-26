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

public class UpstreamURLRewriteParameters extends AbstractModel {

    /**
    * Origin-pull URL rewrite type. Only Path is supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin-pull URL rewrite action. Valid values:
<li><b>replace</b>: Replaces the full Path. It is used to replace the complete request URL Path with the specified Path.</li>
</li>
<li><b>addPrefix</b>: Add a path prefix. It is used to add the specified path prefix to the request URL Path.</li>
</li>
<li><b>rmvPrefix</b>: removes the path prefix. It is used to remove the specified path prefix from the request URL Path.</li>
</li>
<li><b>regexReplace</b>: regular replacement full path. Used to match and replace the full path through Google RE2 regular expressions.</li>
</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Origin-pull URL rewrite value. It should meet the URL Path specification and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified. Length range: 1–1024. When Action is addPrefix, it cannot end with /. When Action is rmvPrefix, * cannot exist. When Action is regexReplace, $NUM can be used to refer to a regular expression capture group, where NUM represents the group number, for example $1, with support up to $9.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Origin-pull URL rewrite uses a regex replacement to match the regular expression of the full path. It should meet the Google RE2 specification with a length range of 1–1024. This field is required when Action is regexReplace. Otherwise, no need to specify this field.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get Origin-pull URL rewrite type. Only Path is supported. 
     * @return Type Origin-pull URL rewrite type. Only Path is supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin-pull URL rewrite type. Only Path is supported.
     * @param Type Origin-pull URL rewrite type. Only Path is supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin-pull URL rewrite action. Valid values:
<li><b>replace</b>: Replaces the full Path. It is used to replace the complete request URL Path with the specified Path.</li>
</li>
<li><b>addPrefix</b>: Add a path prefix. It is used to add the specified path prefix to the request URL Path.</li>
</li>
<li><b>rmvPrefix</b>: removes the path prefix. It is used to remove the specified path prefix from the request URL Path.</li>
</li>
<li><b>regexReplace</b>: regular replacement full path. Used to match and replace the full path through Google RE2 regular expressions.</li>
</li> 
     * @return Action Origin-pull URL rewrite action. Valid values:
<li><b>replace</b>: Replaces the full Path. It is used to replace the complete request URL Path with the specified Path.</li>
</li>
<li><b>addPrefix</b>: Add a path prefix. It is used to add the specified path prefix to the request URL Path.</li>
</li>
<li><b>rmvPrefix</b>: removes the path prefix. It is used to remove the specified path prefix from the request URL Path.</li>
</li>
<li><b>regexReplace</b>: regular replacement full path. Used to match and replace the full path through Google RE2 regular expressions.</li>
</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Origin-pull URL rewrite action. Valid values:
<li><b>replace</b>: Replaces the full Path. It is used to replace the complete request URL Path with the specified Path.</li>
</li>
<li><b>addPrefix</b>: Add a path prefix. It is used to add the specified path prefix to the request URL Path.</li>
</li>
<li><b>rmvPrefix</b>: removes the path prefix. It is used to remove the specified path prefix from the request URL Path.</li>
</li>
<li><b>regexReplace</b>: regular replacement full path. Used to match and replace the full path through Google RE2 regular expressions.</li>
</li>
     * @param Action Origin-pull URL rewrite action. Valid values:
<li><b>replace</b>: Replaces the full Path. It is used to replace the complete request URL Path with the specified Path.</li>
</li>
<li><b>addPrefix</b>: Add a path prefix. It is used to add the specified path prefix to the request URL Path.</li>
</li>
<li><b>rmvPrefix</b>: removes the path prefix. It is used to remove the specified path prefix from the request URL Path.</li>
</li>
<li><b>regexReplace</b>: regular replacement full path. Used to match and replace the full path through Google RE2 regular expressions.</li>
</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Origin-pull URL rewrite value. It should meet the URL Path specification and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified. Length range: 1–1024. When Action is addPrefix, it cannot end with /. When Action is rmvPrefix, * cannot exist. When Action is regexReplace, $NUM can be used to refer to a regular expression capture group, where NUM represents the group number, for example $1, with support up to $9. 
     * @return Value Origin-pull URL rewrite value. It should meet the URL Path specification and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified. Length range: 1–1024. When Action is addPrefix, it cannot end with /. When Action is rmvPrefix, * cannot exist. When Action is regexReplace, $NUM can be used to refer to a regular expression capture group, where NUM represents the group number, for example $1, with support up to $9.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Origin-pull URL rewrite value. It should meet the URL Path specification and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified. Length range: 1–1024. When Action is addPrefix, it cannot end with /. When Action is rmvPrefix, * cannot exist. When Action is regexReplace, $NUM can be used to refer to a regular expression capture group, where NUM represents the group number, for example $1, with support up to $9.
     * @param Value Origin-pull URL rewrite value. It should meet the URL Path specification and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified. Length range: 1–1024. When Action is addPrefix, it cannot end with /. When Action is rmvPrefix, * cannot exist. When Action is regexReplace, $NUM can be used to refer to a regular expression capture group, where NUM represents the group number, for example $1, with support up to $9.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Origin-pull URL rewrite uses a regex replacement to match the regular expression of the full path. It should meet the Google RE2 specification with a length range of 1–1024. This field is required when Action is regexReplace. Otherwise, no need to specify this field. 
     * @return Regex Origin-pull URL rewrite uses a regex replacement to match the regular expression of the full path. It should meet the Google RE2 specification with a length range of 1–1024. This field is required when Action is regexReplace. Otherwise, no need to specify this field.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Origin-pull URL rewrite uses a regex replacement to match the regular expression of the full path. It should meet the Google RE2 specification with a length range of 1–1024. This field is required when Action is regexReplace. Otherwise, no need to specify this field.
     * @param Regex Origin-pull URL rewrite uses a regex replacement to match the regular expression of the full path. It should meet the Google RE2 specification with a length range of 1–1024. This field is required when Action is regexReplace. Otherwise, no need to specify this field.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public UpstreamURLRewriteParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamURLRewriteParameters(UpstreamURLRewriteParameters source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

