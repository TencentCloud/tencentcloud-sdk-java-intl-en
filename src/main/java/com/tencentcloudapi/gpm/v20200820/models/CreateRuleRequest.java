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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel {

    /**
    * Rule name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule script. Up to 65535 bytes are allowed.
    */
    @SerializedName("RuleScript")
    @Expose
    private String RuleScript;

    /**
    * Rule description. Up to 1024 bytes are allowed.
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Tag. It is an array of key-value structure. Up to 50 tags can be associated.
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
     * Get Rule name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*. 
     * @return RuleName Rule name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     * @param RuleName Rule name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule script. Up to 65535 bytes are allowed. 
     * @return RuleScript Rule script. Up to 65535 bytes are allowed.
     */
    public String getRuleScript() {
        return this.RuleScript;
    }

    /**
     * Set Rule script. Up to 65535 bytes are allowed.
     * @param RuleScript Rule script. Up to 65535 bytes are allowed.
     */
    public void setRuleScript(String RuleScript) {
        this.RuleScript = RuleScript;
    }

    /**
     * Get Rule description. Up to 1024 bytes are allowed. 
     * @return RuleDesc Rule description. Up to 1024 bytes are allowed.
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description. Up to 1024 bytes are allowed.
     * @param RuleDesc Rule description. Up to 1024 bytes are allowed.
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Tag. It is an array of key-value structure. Up to 50 tags can be associated. 
     * @return Tags Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     * @param Tags Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleScript != null) {
            this.RuleScript = new String(source.RuleScript);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleScript", this.RuleScript);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

