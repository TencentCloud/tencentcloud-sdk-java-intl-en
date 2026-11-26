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

public class BotConfig extends AbstractModel {

    /**
    * bot switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Common detailed basic rules. If it is null, use the last set configuration by default.
    */
    @SerializedName("BotManagedRule")
    @Expose
    private BotManagedRule BotManagedRule;

    /**
    * User profiling rule. If it is null, use the last set configuration by default.
    */
    @SerializedName("BotPortraitRule")
    @Expose
    private BotPortraitRule BotPortraitRule;

    /**
    * Bot intelligent analysis. If it is null, use the last set configuration by default.
    */
    @SerializedName("IntelligenceRule")
    @Expose
    private IntelligenceRule IntelligenceRule;

    /**
    * Bot custom rule. If it is null, the last set configuration is used by default.
    */
    @SerializedName("BotUserRules")
    @Expose
    private BotUserRule [] BotUserRules;

    /**
    * Bot active feature detection rule.
    */
    @SerializedName("AlgDetectRule")
    @Expose
    private AlgDetectRule [] AlgDetectRule;

    /**
    * Bot managed custom policy. This input parameter is optional and is only used as an output parameter.
    */
    @SerializedName("Customizes")
    @Expose
    private BotUserRule [] Customizes;

    /**
     * Get bot switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch bot switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set bot switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch bot switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Common detailed basic rules. If it is null, use the last set configuration by default. 
     * @return BotManagedRule Common detailed basic rules. If it is null, use the last set configuration by default.
     */
    public BotManagedRule getBotManagedRule() {
        return this.BotManagedRule;
    }

    /**
     * Set Common detailed basic rules. If it is null, use the last set configuration by default.
     * @param BotManagedRule Common detailed basic rules. If it is null, use the last set configuration by default.
     */
    public void setBotManagedRule(BotManagedRule BotManagedRule) {
        this.BotManagedRule = BotManagedRule;
    }

    /**
     * Get User profiling rule. If it is null, use the last set configuration by default. 
     * @return BotPortraitRule User profiling rule. If it is null, use the last set configuration by default.
     */
    public BotPortraitRule getBotPortraitRule() {
        return this.BotPortraitRule;
    }

    /**
     * Set User profiling rule. If it is null, use the last set configuration by default.
     * @param BotPortraitRule User profiling rule. If it is null, use the last set configuration by default.
     */
    public void setBotPortraitRule(BotPortraitRule BotPortraitRule) {
        this.BotPortraitRule = BotPortraitRule;
    }

    /**
     * Get Bot intelligent analysis. If it is null, use the last set configuration by default. 
     * @return IntelligenceRule Bot intelligent analysis. If it is null, use the last set configuration by default.
     */
    public IntelligenceRule getIntelligenceRule() {
        return this.IntelligenceRule;
    }

    /**
     * Set Bot intelligent analysis. If it is null, use the last set configuration by default.
     * @param IntelligenceRule Bot intelligent analysis. If it is null, use the last set configuration by default.
     */
    public void setIntelligenceRule(IntelligenceRule IntelligenceRule) {
        this.IntelligenceRule = IntelligenceRule;
    }

    /**
     * Get Bot custom rule. If it is null, the last set configuration is used by default. 
     * @return BotUserRules Bot custom rule. If it is null, the last set configuration is used by default.
     */
    public BotUserRule [] getBotUserRules() {
        return this.BotUserRules;
    }

    /**
     * Set Bot custom rule. If it is null, the last set configuration is used by default.
     * @param BotUserRules Bot custom rule. If it is null, the last set configuration is used by default.
     */
    public void setBotUserRules(BotUserRule [] BotUserRules) {
        this.BotUserRules = BotUserRules;
    }

    /**
     * Get Bot active feature detection rule. 
     * @return AlgDetectRule Bot active feature detection rule.
     */
    public AlgDetectRule [] getAlgDetectRule() {
        return this.AlgDetectRule;
    }

    /**
     * Set Bot active feature detection rule.
     * @param AlgDetectRule Bot active feature detection rule.
     */
    public void setAlgDetectRule(AlgDetectRule [] AlgDetectRule) {
        this.AlgDetectRule = AlgDetectRule;
    }

    /**
     * Get Bot managed custom policy. This input parameter is optional and is only used as an output parameter. 
     * @return Customizes Bot managed custom policy. This input parameter is optional and is only used as an output parameter.
     */
    public BotUserRule [] getCustomizes() {
        return this.Customizes;
    }

    /**
     * Set Bot managed custom policy. This input parameter is optional and is only used as an output parameter.
     * @param Customizes Bot managed custom policy. This input parameter is optional and is only used as an output parameter.
     */
    public void setCustomizes(BotUserRule [] Customizes) {
        this.Customizes = Customizes;
    }

    public BotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotConfig(BotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BotManagedRule != null) {
            this.BotManagedRule = new BotManagedRule(source.BotManagedRule);
        }
        if (source.BotPortraitRule != null) {
            this.BotPortraitRule = new BotPortraitRule(source.BotPortraitRule);
        }
        if (source.IntelligenceRule != null) {
            this.IntelligenceRule = new IntelligenceRule(source.IntelligenceRule);
        }
        if (source.BotUserRules != null) {
            this.BotUserRules = new BotUserRule[source.BotUserRules.length];
            for (int i = 0; i < source.BotUserRules.length; i++) {
                this.BotUserRules[i] = new BotUserRule(source.BotUserRules[i]);
            }
        }
        if (source.AlgDetectRule != null) {
            this.AlgDetectRule = new AlgDetectRule[source.AlgDetectRule.length];
            for (int i = 0; i < source.AlgDetectRule.length; i++) {
                this.AlgDetectRule[i] = new AlgDetectRule(source.AlgDetectRule[i]);
            }
        }
        if (source.Customizes != null) {
            this.Customizes = new BotUserRule[source.Customizes.length];
            for (int i = 0; i < source.Customizes.length; i++) {
                this.Customizes[i] = new BotUserRule(source.Customizes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "BotManagedRule.", this.BotManagedRule);
        this.setParamObj(map, prefix + "BotPortraitRule.", this.BotPortraitRule);
        this.setParamObj(map, prefix + "IntelligenceRule.", this.IntelligenceRule);
        this.setParamArrayObj(map, prefix + "BotUserRules.", this.BotUserRules);
        this.setParamArrayObj(map, prefix + "AlgDetectRule.", this.AlgDetectRule);
        this.setParamArrayObj(map, prefix + "Customizes.", this.Customizes);

    }
}

