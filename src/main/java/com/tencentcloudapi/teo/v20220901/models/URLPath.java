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
    * Action to be executed. values:.
<Li>`Follow`: follow the request;</li>.
<Li>`Custom`: custom;</li>.
<Li>`Regex`: regular expression matching.</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Regular expression matching expression, length range is 1-1024.<br>note: when action is regex, this field is required; when action is follow or custom, this field is not required and will not take effect if filled.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * Redirect target url, length range is 1-1024.<br>note: when action is regex or custom, this field is required; when action is follow, this field is not required and will not take effect if filled.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Action to be executed. values:.
<Li>`Follow`: follow the request;</li>.
<Li>`Custom`: custom;</li>.
<Li>`Regex`: regular expression matching.</li>. 
     * @return Action Action to be executed. values:.
<Li>`Follow`: follow the request;</li>.
<Li>`Custom`: custom;</li>.
<Li>`Regex`: regular expression matching.</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. values:.
<Li>`Follow`: follow the request;</li>.
<Li>`Custom`: custom;</li>.
<Li>`Regex`: regular expression matching.</li>.
     * @param Action Action to be executed. values:.
<Li>`Follow`: follow the request;</li>.
<Li>`Custom`: custom;</li>.
<Li>`Regex`: regular expression matching.</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Regular expression matching expression, length range is 1-1024.<br>note: when action is regex, this field is required; when action is follow or custom, this field is not required and will not take effect if filled. 
     * @return Regex Regular expression matching expression, length range is 1-1024.<br>note: when action is regex, this field is required; when action is follow or custom, this field is not required and will not take effect if filled.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Regular expression matching expression, length range is 1-1024.<br>note: when action is regex, this field is required; when action is follow or custom, this field is not required and will not take effect if filled.
     * @param Regex Regular expression matching expression, length range is 1-1024.<br>note: when action is regex, this field is required; when action is follow or custom, this field is not required and will not take effect if filled.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get Redirect target url, length range is 1-1024.<br>note: when action is regex or custom, this field is required; when action is follow, this field is not required and will not take effect if filled. 
     * @return Value Redirect target url, length range is 1-1024.<br>note: when action is regex or custom, this field is required; when action is follow, this field is not required and will not take effect if filled.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Redirect target url, length range is 1-1024.<br>note: when action is regex or custom, this field is required; when action is follow, this field is not required and will not take effect if filled.
     * @param Value Redirect target url, length range is 1-1024.<br>note: when action is regex or custom, this field is required; when action is follow, this field is not required and will not take effect if filled.
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

