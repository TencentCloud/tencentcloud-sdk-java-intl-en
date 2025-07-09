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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafConfig extends AbstractModel {

    /**
    * Switch
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Protection level: `loose`, `normal`, `strict`, `stricter`, `custom`
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Mode: `block`, `observe`, `close`
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * WAF rule allowlist/blocklist
    */
    @SerializedName("WafRules")
    @Expose
    private WafRule WafRules;

    /**
    * AI rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
     * Get Switch 
     * @return Switch Switch
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch
     * @param Switch Switch
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Protection level: `loose`, `normal`, `strict`, `stricter`, `custom` 
     * @return Level Protection level: `loose`, `normal`, `strict`, `stricter`, `custom`
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Protection level: `loose`, `normal`, `strict`, `stricter`, `custom`
     * @param Level Protection level: `loose`, `normal`, `strict`, `stricter`, `custom`
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Mode: `block`, `observe`, `close` 
     * @return Mode Mode: `block`, `observe`, `close`
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Mode: `block`, `observe`, `close`
     * @param Mode Mode: `block`, `observe`, `close`
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get WAF rule allowlist/blocklist 
     * @return WafRules WAF rule allowlist/blocklist
     */
    public WafRule getWafRules() {
        return this.WafRules;
    }

    /**
     * Set WAF rule allowlist/blocklist
     * @param WafRules WAF rule allowlist/blocklist
     */
    public void setWafRules(WafRule WafRules) {
        this.WafRules = WafRules;
    }

    /**
     * Get AI rule engine
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AiRule AI rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set AI rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AiRule AI rule engine
Note: This field may return `null`, indicating that no valid value can be obtained.
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
        if (source.WafRules != null) {
            this.WafRules = new WafRule(source.WafRules);
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
        this.setParamObj(map, prefix + "WafRules.", this.WafRules);
        this.setParamObj(map, prefix + "AiRule.", this.AiRule);

    }
}

