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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlHitInfo extends AbstractModel {

    /**
    * <p>Hit URL</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Hit rule ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Hit rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get <p>Hit URL</p> 
     * @return Url <p>Hit URL</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Hit URL</p>
     * @param Url <p>Hit URL</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Hit rule ID</p> 
     * @return RuleId <p>Hit rule ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Hit rule ID</p>
     * @param RuleId <p>Hit rule ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Hit rule name</p> 
     * @return RuleName <p>Hit rule name</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Hit rule name</p>
     * @param RuleName <p>Hit rule name</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public UrlHitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlHitInfo(UrlHitInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

