/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Whether to enable WAF configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>The configuration can be modified even when it is disabled.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * The WAF global mode. Values:
<li>`block`: Block globally</li>
<li>`observe`: Observe globally</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The settings of the managed rule. If it is null, the settings that were last configured will be used.
    */
    @SerializedName("WafRule")
    @Expose
    private WafRule WafRule;

    /**
    * The setting of the AI rule engine. If it is null, the setting that was last configured will be used.
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
     * Get Whether to enable WAF configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>The configuration can be modified even when it is disabled. 
     * @return Switch Whether to enable WAF configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>The configuration can be modified even when it is disabled.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable WAF configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>The configuration can be modified even when it is disabled.
     * @param Switch Whether to enable WAF configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>The configuration can be modified even when it is disabled.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li> 
     * @return Level The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
     * @param Level The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get The WAF global mode. Values:
<li>`block`: Block globally</li>
<li>`observe`: Observe globally</li> 
     * @return Mode The WAF global mode. Values:
<li>`block`: Block globally</li>
<li>`observe`: Observe globally</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The WAF global mode. Values:
<li>`block`: Block globally</li>
<li>`observe`: Observe globally</li>
     * @param Mode The WAF global mode. Values:
<li>`block`: Block globally</li>
<li>`observe`: Observe globally</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The settings of the managed rule. If it is null, the settings that were last configured will be used. 
     * @return WafRule The settings of the managed rule. If it is null, the settings that were last configured will be used.
     */
    public WafRule getWafRule() {
        return this.WafRule;
    }

    /**
     * Set The settings of the managed rule. If it is null, the settings that were last configured will be used.
     * @param WafRule The settings of the managed rule. If it is null, the settings that were last configured will be used.
     */
    public void setWafRule(WafRule WafRule) {
        this.WafRule = WafRule;
    }

    /**
     * Get The setting of the AI rule engine. If it is null, the setting that was last configured will be used. 
     * @return AiRule The setting of the AI rule engine. If it is null, the setting that was last configured will be used.
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set The setting of the AI rule engine. If it is null, the setting that was last configured will be used.
     * @param AiRule The setting of the AI rule engine. If it is null, the setting that was last configured will be used.
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

