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

public class WafConfig extends AbstractModel {

    /**
    * WafConfig switch. Valid values:
<li>on: Enable;</li>
<li> off: disabled.</li>The switch only affects whether the configuration takes effect. Even if it is off, the configuration content can still be modified normally.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Protection level set last time. Valid values:
<li> loose: loose;</li>
<li> normal: Normal;</li>
<li> strict: strict;</li>
<li>stricter: ultra-strict;</li>
<li> custom: Custom.</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Global WAF mode. Valid values:
<li> block: block (global blocking, but you can configure rules to observe);</li>
<li> observe: observation (regardless of the detailed rule configuration, it is always observation).</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Detailed configuration of the managed rule. If null, use the last set configuration by default.
    */
    @SerializedName("WafRule")
    @Expose
    private WafRule WafRule;

    /**
    * Protection configuration of the AI rule engine. If it is null, use the last set configuration by default.
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
     * Get WafConfig switch. Valid values:
<li>on: Enable;</li>
<li> off: disabled.</li>The switch only affects whether the configuration takes effect. Even if it is off, the configuration content can still be modified normally. 
     * @return Switch WafConfig switch. Valid values:
<li>on: Enable;</li>
<li> off: disabled.</li>The switch only affects whether the configuration takes effect. Even if it is off, the configuration content can still be modified normally.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set WafConfig switch. Valid values:
<li>on: Enable;</li>
<li> off: disabled.</li>The switch only affects whether the configuration takes effect. Even if it is off, the configuration content can still be modified normally.
     * @param Switch WafConfig switch. Valid values:
<li>on: Enable;</li>
<li> off: disabled.</li>The switch only affects whether the configuration takes effect. Even if it is off, the configuration content can still be modified normally.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Protection level set last time. Valid values:
<li> loose: loose;</li>
<li> normal: Normal;</li>
<li> strict: strict;</li>
<li>stricter: ultra-strict;</li>
<li> custom: Custom.</li> 
     * @return Level Protection level set last time. Valid values:
<li> loose: loose;</li>
<li> normal: Normal;</li>
<li> strict: strict;</li>
<li>stricter: ultra-strict;</li>
<li> custom: Custom.</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Protection level set last time. Valid values:
<li> loose: loose;</li>
<li> normal: Normal;</li>
<li> strict: strict;</li>
<li>stricter: ultra-strict;</li>
<li> custom: Custom.</li>
     * @param Level Protection level set last time. Valid values:
<li> loose: loose;</li>
<li> normal: Normal;</li>
<li> strict: strict;</li>
<li>stricter: ultra-strict;</li>
<li> custom: Custom.</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Global WAF mode. Valid values:
<li> block: block (global blocking, but you can configure rules to observe);</li>
<li> observe: observation (regardless of the detailed rule configuration, it is always observation).</li> 
     * @return Mode Global WAF mode. Valid values:
<li> block: block (global blocking, but you can configure rules to observe);</li>
<li> observe: observation (regardless of the detailed rule configuration, it is always observation).</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Global WAF mode. Valid values:
<li> block: block (global blocking, but you can configure rules to observe);</li>
<li> observe: observation (regardless of the detailed rule configuration, it is always observation).</li>
     * @param Mode Global WAF mode. Valid values:
<li> block: block (global blocking, but you can configure rules to observe);</li>
<li> observe: observation (regardless of the detailed rule configuration, it is always observation).</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Detailed configuration of the managed rule. If null, use the last set configuration by default. 
     * @return WafRule Detailed configuration of the managed rule. If null, use the last set configuration by default.
     */
    public WafRule getWafRule() {
        return this.WafRule;
    }

    /**
     * Set Detailed configuration of the managed rule. If null, use the last set configuration by default.
     * @param WafRule Detailed configuration of the managed rule. If null, use the last set configuration by default.
     */
    public void setWafRule(WafRule WafRule) {
        this.WafRule = WafRule;
    }

    /**
     * Get Protection configuration of the AI rule engine. If it is null, use the last set configuration by default. 
     * @return AiRule Protection configuration of the AI rule engine. If it is null, use the last set configuration by default.
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set Protection configuration of the AI rule engine. If it is null, use the last set configuration by default.
     * @param AiRule Protection configuration of the AI rule engine. If it is null, use the last set configuration by default.
     */
    public void setAiRule(AiRule AiRule) {
        this.AiRule = AiRule;
    }

    public WafConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafConfig(WafConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.WafRule != null) {
            this.WafRule = new WafRule(source.WafRule);
        }
        if (source.AiRule != null) {
            this.AiRule = new AiRule(source.AiRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "WafRule.", this.WafRule);
        this.setParamObj(map, prefix + "AiRule.", this.AiRule);

    }
}

