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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotConfig extends AbstractModel{

    /**
    * Whether to enable bot security. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The settings of the bot managed rule. If it is null, the settings that were last configured will be used.
    */
    @SerializedName("BotManagedRule")
    @Expose
    private BotManagedRule BotManagedRule;

    /**
    * The settings of the client reputation rule. If it is null, the settings that were last configured will be used.
    */
    @SerializedName("BotPortraitRule")
    @Expose
    private BotPortraitRule BotPortraitRule;

    /**
    * The bot intelligence settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntelligenceRule")
    @Expose
    private IntelligenceRule IntelligenceRule;

    /**
    * Settings of the custom bot rule. If it is null, the settings that were last configured will be used.
    */
    @SerializedName("BotUserRules")
    @Expose
    private BotUserRule [] BotUserRules;

    /**
    * Active bot detection rule.
    */
    @SerializedName("AlgDetectRule")
    @Expose
    private AlgDetectRule [] AlgDetectRule;

    /**
    * Settings of the bot managed rule. It is only used for output.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Customizes")
    @Expose
    private BotUserRule [] Customizes;

    /**
     * Get Whether to enable bot security. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable bot security. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable bot security. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable bot security. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The settings of the bot managed rule. If it is null, the settings that were last configured will be used. 
     * @return BotManagedRule The settings of the bot managed rule. If it is null, the settings that were last configured will be used.
     */
    public BotManagedRule getBotManagedRule() {
        return this.BotManagedRule;
    }

    /**
     * Set The settings of the bot managed rule. If it is null, the settings that were last configured will be used.
     * @param BotManagedRule The settings of the bot managed rule. If it is null, the settings that were last configured will be used.
     */
    public void setBotManagedRule(BotManagedRule BotManagedRule) {
        this.BotManagedRule = BotManagedRule;
    }

    /**
     * Get The settings of the client reputation rule. If it is null, the settings that were last configured will be used. 
     * @return BotPortraitRule The settings of the client reputation rule. If it is null, the settings that were last configured will be used.
     */
    public BotPortraitRule getBotPortraitRule() {
        return this.BotPortraitRule;
    }

    /**
     * Set The settings of the client reputation rule. If it is null, the settings that were last configured will be used.
     * @param BotPortraitRule The settings of the client reputation rule. If it is null, the settings that were last configured will be used.
     */
    public void setBotPortraitRule(BotPortraitRule BotPortraitRule) {
        this.BotPortraitRule = BotPortraitRule;
    }

    /**
     * Get The bot intelligence settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntelligenceRule The bot intelligence settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IntelligenceRule getIntelligenceRule() {
        return this.IntelligenceRule;
    }

    /**
     * Set The bot intelligence settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntelligenceRule The bot intelligence settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntelligenceRule(IntelligenceRule IntelligenceRule) {
        this.IntelligenceRule = IntelligenceRule;
    }

    /**
     * Get Settings of the custom bot rule. If it is null, the settings that were last configured will be used. 
     * @return BotUserRules Settings of the custom bot rule. If it is null, the settings that were last configured will be used.
     */
    public BotUserRule [] getBotUserRules() {
        return this.BotUserRules;
    }

    /**
     * Set Settings of the custom bot rule. If it is null, the settings that were last configured will be used.
     * @param BotUserRules Settings of the custom bot rule. If it is null, the settings that were last configured will be used.
     */
    public void setBotUserRules(BotUserRule [] BotUserRules) {
        this.BotUserRules = BotUserRules;
    }

    /**
     * Get Active bot detection rule. 
     * @return AlgDetectRule Active bot detection rule.
     */
    public AlgDetectRule [] getAlgDetectRule() {
        return this.AlgDetectRule;
    }

    /**
     * Set Active bot detection rule.
     * @param AlgDetectRule Active bot detection rule.
     */
    public void setAlgDetectRule(AlgDetectRule [] AlgDetectRule) {
        this.AlgDetectRule = AlgDetectRule;
    }

    /**
     * Get Settings of the bot managed rule. It is only used for output.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Customizes Settings of the bot managed rule. It is only used for output.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public BotUserRule [] getCustomizes() {
        return this.Customizes;
    }

    /**
     * Set Settings of the bot managed rule. It is only used for output.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Customizes Settings of the bot managed rule. It is only used for output.
Note: This field may return `null`, indicating that no valid values can be obtained.
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

