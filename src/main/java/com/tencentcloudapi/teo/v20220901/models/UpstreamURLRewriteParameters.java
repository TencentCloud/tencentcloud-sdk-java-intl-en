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
    * Origin-Pull url rewriting type, only path is supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin-Pull url rewrite action. valid values are:.
<Li>`Replace`: replace the path prefix.</li>.
<Li>`AddPrefix`: add the path prefix.</li>.
<Li>`RmvPrefix`: remove the path prefix.</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Origin-Pull url rewrite value, maximum length 1024, must start with /.<br>note: when action is addprefix, it cannot end with /; when action is rmvprefix, * cannot be present.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Origin-Pull url rewriting type, only path is supported. 
     * @return Type Origin-Pull url rewriting type, only path is supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin-Pull url rewriting type, only path is supported.
     * @param Type Origin-Pull url rewriting type, only path is supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin-Pull url rewrite action. valid values are:.
<Li>`Replace`: replace the path prefix.</li>.
<Li>`AddPrefix`: add the path prefix.</li>.
<Li>`RmvPrefix`: remove the path prefix.</li>. 
     * @return Action Origin-Pull url rewrite action. valid values are:.
<Li>`Replace`: replace the path prefix.</li>.
<Li>`AddPrefix`: add the path prefix.</li>.
<Li>`RmvPrefix`: remove the path prefix.</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Origin-Pull url rewrite action. valid values are:.
<Li>`Replace`: replace the path prefix.</li>.
<Li>`AddPrefix`: add the path prefix.</li>.
<Li>`RmvPrefix`: remove the path prefix.</li>.
     * @param Action Origin-Pull url rewrite action. valid values are:.
<Li>`Replace`: replace the path prefix.</li>.
<Li>`AddPrefix`: add the path prefix.</li>.
<Li>`RmvPrefix`: remove the path prefix.</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Origin-Pull url rewrite value, maximum length 1024, must start with /.<br>note: when action is addprefix, it cannot end with /; when action is rmvprefix, * cannot be present. 
     * @return Value Origin-Pull url rewrite value, maximum length 1024, must start with /.<br>note: when action is addprefix, it cannot end with /; when action is rmvprefix, * cannot be present.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Origin-Pull url rewrite value, maximum length 1024, must start with /.<br>note: when action is addprefix, it cannot end with /; when action is rmvprefix, * cannot be present.
     * @param Value Origin-Pull url rewrite value, maximum length 1024, must start with /.<br>note: when action is addprefix, it cannot end with /; when action is rmvprefix, * cannot be present.
     */
    public void setValue(String Value) {
        this.Value = Value;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

