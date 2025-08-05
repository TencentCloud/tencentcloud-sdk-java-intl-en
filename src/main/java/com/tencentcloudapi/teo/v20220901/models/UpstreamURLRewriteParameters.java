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
    * Origin-Pull URL rewrite type. valid values: Path.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin-Pull URL rewrite action. valid values:.
<li><b>replace</b>: replace the full Path. used to replace the complete request URL Path with the specified Path.
</li>
<li><b>addPrefix</b>: add Path prefix. used to add specified Path prefix to request URL Path.</li>.
</li>
<li><b>rmvPrefix</b>: specifies the removal of Path prefix. used to remove the specified Path prefix from the request URL Path.
</li>
<li><b>regexReplace</b>: refers to regular expression replacement of the full path. used for matching and replacing the full path via Google RE2 regular expressions.
</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Origin-Pull URL rewrite value. should meet URL Path standard and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified, with a length range of 1–1024. when Action is addPrefix, it cannot end with /. when Action is rmvPrefix, * cannot exist. when Action is regexReplace, $NUM can be used to refer to regular expression capture groups, where NUM represents the group number, such as $1, and supports up to $9.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Origin-Pull URL rewrite used for regex replacement to match the full path regular expression. should meet Google RE2 standard with length range 1–1024. this field is required when Action is regexReplace, otherwise not required.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get Origin-Pull URL rewrite type. valid values: Path. 
     * @return Type Origin-Pull URL rewrite type. valid values: Path.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin-Pull URL rewrite type. valid values: Path.
     * @param Type Origin-Pull URL rewrite type. valid values: Path.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin-Pull URL rewrite action. valid values:.
<li><b>replace</b>: replace the full Path. used to replace the complete request URL Path with the specified Path.
</li>
<li><b>addPrefix</b>: add Path prefix. used to add specified Path prefix to request URL Path.</li>.
</li>
<li><b>rmvPrefix</b>: specifies the removal of Path prefix. used to remove the specified Path prefix from the request URL Path.
</li>
<li><b>regexReplace</b>: refers to regular expression replacement of the full path. used for matching and replacing the full path via Google RE2 regular expressions.
</li> 
     * @return Action Origin-Pull URL rewrite action. valid values:.
<li><b>replace</b>: replace the full Path. used to replace the complete request URL Path with the specified Path.
</li>
<li><b>addPrefix</b>: add Path prefix. used to add specified Path prefix to request URL Path.</li>.
</li>
<li><b>rmvPrefix</b>: specifies the removal of Path prefix. used to remove the specified Path prefix from the request URL Path.
</li>
<li><b>regexReplace</b>: refers to regular expression replacement of the full path. used for matching and replacing the full path via Google RE2 regular expressions.
</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Origin-Pull URL rewrite action. valid values:.
<li><b>replace</b>: replace the full Path. used to replace the complete request URL Path with the specified Path.
</li>
<li><b>addPrefix</b>: add Path prefix. used to add specified Path prefix to request URL Path.</li>.
</li>
<li><b>rmvPrefix</b>: specifies the removal of Path prefix. used to remove the specified Path prefix from the request URL Path.
</li>
<li><b>regexReplace</b>: refers to regular expression replacement of the full path. used for matching and replacing the full path via Google RE2 regular expressions.
</li>
     * @param Action Origin-Pull URL rewrite action. valid values:.
<li><b>replace</b>: replace the full Path. used to replace the complete request URL Path with the specified Path.
</li>
<li><b>addPrefix</b>: add Path prefix. used to add specified Path prefix to request URL Path.</li>.
</li>
<li><b>rmvPrefix</b>: specifies the removal of Path prefix. used to remove the specified Path prefix from the request URL Path.
</li>
<li><b>regexReplace</b>: refers to regular expression replacement of the full path. used for matching and replacing the full path via Google RE2 regular expressions.
</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Origin-Pull URL rewrite value. should meet URL Path standard and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified, with a length range of 1–1024. when Action is addPrefix, it cannot end with /. when Action is rmvPrefix, * cannot exist. when Action is regexReplace, $NUM can be used to refer to regular expression capture groups, where NUM represents the group number, such as $1, and supports up to $9. 
     * @return Value Origin-Pull URL rewrite value. should meet URL Path standard and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified, with a length range of 1–1024. when Action is addPrefix, it cannot end with /. when Action is rmvPrefix, * cannot exist. when Action is regexReplace, $NUM can be used to refer to regular expression capture groups, where NUM represents the group number, such as $1, and supports up to $9.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Origin-Pull URL rewrite value. should meet URL Path standard and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified, with a length range of 1–1024. when Action is addPrefix, it cannot end with /. when Action is rmvPrefix, * cannot exist. when Action is regexReplace, $NUM can be used to refer to regular expression capture groups, where NUM represents the group number, such as $1, and supports up to $9.
     * @param Value Origin-Pull URL rewrite value. should meet URL Path standard and ensure the rewritten Path starts with / to prevent the Host of the origin-pull URL from being modified, with a length range of 1–1024. when Action is addPrefix, it cannot end with /. when Action is rmvPrefix, * cannot exist. when Action is regexReplace, $NUM can be used to refer to regular expression capture groups, where NUM represents the group number, such as $1, and supports up to $9.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Origin-Pull URL rewrite used for regex replacement to match the full path regular expression. should meet Google RE2 standard with length range 1–1024. this field is required when Action is regexReplace, otherwise not required. 
     * @return Regex Origin-Pull URL rewrite used for regex replacement to match the full path regular expression. should meet Google RE2 standard with length range 1–1024. this field is required when Action is regexReplace, otherwise not required.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Origin-Pull URL rewrite used for regex replacement to match the full path regular expression. should meet Google RE2 standard with length range 1–1024. this field is required when Action is regexReplace, otherwise not required.
     * @param Regex Origin-Pull URL rewrite used for regex replacement to match the full path regular expression. should meet Google RE2 standard with length range 1–1024. this field is required when Action is regexReplace, otherwise not required.
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

