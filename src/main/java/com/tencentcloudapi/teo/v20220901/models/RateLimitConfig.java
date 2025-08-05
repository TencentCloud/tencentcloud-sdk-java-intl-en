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

public class RateLimitConfig extends AbstractModel {

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The settings of the custom rate limiting rule. If it is null, the settings that were last configured will be used.
    */
    @SerializedName("RateLimitUserRules")
    @Expose
    private RateLimitUserRule [] RateLimitUserRules;

    /**
    * The rate limit template feature. if null, use the last set configuration by default.
    */
    @SerializedName("RateLimitTemplate")
    @Expose
    private RateLimitTemplate RateLimitTemplate;

    /**
    * Intelligent client filtering. if null, use the last set configuration by default.
    */
    @SerializedName("RateLimitIntelligence")
    @Expose
    private RateLimitIntelligence RateLimitIntelligence;

    /**
    * The custom rate limiting rules. if it is `null`, the previous settings is used.
    */
    @SerializedName("RateLimitCustomizes")
    @Expose
    private RateLimitUserRule [] RateLimitCustomizes;

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The settings of the custom rate limiting rule. If it is null, the settings that were last configured will be used. 
     * @return RateLimitUserRules The settings of the custom rate limiting rule. If it is null, the settings that were last configured will be used.
     */
    public RateLimitUserRule [] getRateLimitUserRules() {
        return this.RateLimitUserRules;
    }

    /**
     * Set The settings of the custom rate limiting rule. If it is null, the settings that were last configured will be used.
     * @param RateLimitUserRules The settings of the custom rate limiting rule. If it is null, the settings that were last configured will be used.
     */
    public void setRateLimitUserRules(RateLimitUserRule [] RateLimitUserRules) {
        this.RateLimitUserRules = RateLimitUserRules;
    }

    /**
     * Get The rate limit template feature. if null, use the last set configuration by default. 
     * @return RateLimitTemplate The rate limit template feature. if null, use the last set configuration by default.
     */
    public RateLimitTemplate getRateLimitTemplate() {
        return this.RateLimitTemplate;
    }

    /**
     * Set The rate limit template feature. if null, use the last set configuration by default.
     * @param RateLimitTemplate The rate limit template feature. if null, use the last set configuration by default.
     */
    public void setRateLimitTemplate(RateLimitTemplate RateLimitTemplate) {
        this.RateLimitTemplate = RateLimitTemplate;
    }

    /**
     * Get Intelligent client filtering. if null, use the last set configuration by default. 
     * @return RateLimitIntelligence Intelligent client filtering. if null, use the last set configuration by default.
     */
    public RateLimitIntelligence getRateLimitIntelligence() {
        return this.RateLimitIntelligence;
    }

    /**
     * Set Intelligent client filtering. if null, use the last set configuration by default.
     * @param RateLimitIntelligence Intelligent client filtering. if null, use the last set configuration by default.
     */
    public void setRateLimitIntelligence(RateLimitIntelligence RateLimitIntelligence) {
        this.RateLimitIntelligence = RateLimitIntelligence;
    }

    /**
     * Get The custom rate limiting rules. if it is `null`, the previous settings is used. 
     * @return RateLimitCustomizes The custom rate limiting rules. if it is `null`, the previous settings is used.
     */
    public RateLimitUserRule [] getRateLimitCustomizes() {
        return this.RateLimitCustomizes;
    }

    /**
     * Set The custom rate limiting rules. if it is `null`, the previous settings is used.
     * @param RateLimitCustomizes The custom rate limiting rules. if it is `null`, the previous settings is used.
     */
    public void setRateLimitCustomizes(RateLimitUserRule [] RateLimitCustomizes) {
        this.RateLimitCustomizes = RateLimitCustomizes;
    }

    public RateLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitConfig(RateLimitConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RateLimitUserRules != null) {
            this.RateLimitUserRules = new RateLimitUserRule[source.RateLimitUserRules.length];
            for (int i = 0; i < source.RateLimitUserRules.length; i++) {
                this.RateLimitUserRules[i] = new RateLimitUserRule(source.RateLimitUserRules[i]);
            }
        }
        if (source.RateLimitTemplate != null) {
            this.RateLimitTemplate = new RateLimitTemplate(source.RateLimitTemplate);
        }
        if (source.RateLimitIntelligence != null) {
            this.RateLimitIntelligence = new RateLimitIntelligence(source.RateLimitIntelligence);
        }
        if (source.RateLimitCustomizes != null) {
            this.RateLimitCustomizes = new RateLimitUserRule[source.RateLimitCustomizes.length];
            for (int i = 0; i < source.RateLimitCustomizes.length; i++) {
                this.RateLimitCustomizes[i] = new RateLimitUserRule(source.RateLimitCustomizes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RateLimitUserRules.", this.RateLimitUserRules);
        this.setParamObj(map, prefix + "RateLimitTemplate.", this.RateLimitTemplate);
        this.setParamObj(map, prefix + "RateLimitIntelligence.", this.RateLimitIntelligence);
        this.setParamArrayObj(map, prefix + "RateLimitCustomizes.", this.RateLimitCustomizes);

    }
}

