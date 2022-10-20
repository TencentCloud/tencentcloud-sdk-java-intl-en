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

public class ModifySecurityWafGroupPolicyRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If not specified, it defaults to the setting that was last configured.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The rule level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>If not specified, it defaults to the setting that was last configured.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * The rule action. Values:
<li>`block`: Block</li>
<li>`observe`: Observe</li>If not specified, it defaults to the setting that was last configured.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The settings of the managed rule. If not specified, it defaults to the settings that were last configured.
    */
    @SerializedName("WafRules")
    @Expose
    private WafRule WafRules;

    /**
    * The settings of the AI rule engine. If not specified, it defaults to the settings that were last configured.
    */
    @SerializedName("AiRule")
    @Expose
    private AiRule AiRule;

    /**
    * The settings of the managed rule group. If not specified, it defaults to the settings that were last configured.
    */
    @SerializedName("WafGroups")
    @Expose
    private WafGroup [] WafGroups;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The subdomain name. 
     * @return Entity The subdomain name.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name.
     * @param Entity The subdomain name.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If not specified, it defaults to the setting that was last configured. 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If not specified, it defaults to the setting that was last configured.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If not specified, it defaults to the setting that was last configured.
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If not specified, it defaults to the setting that was last configured.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The rule level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>If not specified, it defaults to the setting that was last configured. 
     * @return Level The rule level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>If not specified, it defaults to the setting that was last configured.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set The rule level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>If not specified, it defaults to the setting that was last configured.
     * @param Level The rule level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>If not specified, it defaults to the setting that was last configured.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get The rule action. Values:
<li>`block`: Block</li>
<li>`observe`: Observe</li>If not specified, it defaults to the setting that was last configured. 
     * @return Mode The rule action. Values:
<li>`block`: Block</li>
<li>`observe`: Observe</li>If not specified, it defaults to the setting that was last configured.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The rule action. Values:
<li>`block`: Block</li>
<li>`observe`: Observe</li>If not specified, it defaults to the setting that was last configured.
     * @param Mode The rule action. Values:
<li>`block`: Block</li>
<li>`observe`: Observe</li>If not specified, it defaults to the setting that was last configured.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The settings of the managed rule. If not specified, it defaults to the settings that were last configured. 
     * @return WafRules The settings of the managed rule. If not specified, it defaults to the settings that were last configured.
     */
    public WafRule getWafRules() {
        return this.WafRules;
    }

    /**
     * Set The settings of the managed rule. If not specified, it defaults to the settings that were last configured.
     * @param WafRules The settings of the managed rule. If not specified, it defaults to the settings that were last configured.
     */
    public void setWafRules(WafRule WafRules) {
        this.WafRules = WafRules;
    }

    /**
     * Get The settings of the AI rule engine. If not specified, it defaults to the settings that were last configured. 
     * @return AiRule The settings of the AI rule engine. If not specified, it defaults to the settings that were last configured.
     */
    public AiRule getAiRule() {
        return this.AiRule;
    }

    /**
     * Set The settings of the AI rule engine. If not specified, it defaults to the settings that were last configured.
     * @param AiRule The settings of the AI rule engine. If not specified, it defaults to the settings that were last configured.
     */
    public void setAiRule(AiRule AiRule) {
        this.AiRule = AiRule;
    }

    /**
     * Get The settings of the managed rule group. If not specified, it defaults to the settings that were last configured. 
     * @return WafGroups The settings of the managed rule group. If not specified, it defaults to the settings that were last configured.
     */
    public WafGroup [] getWafGroups() {
        return this.WafGroups;
    }

    /**
     * Set The settings of the managed rule group. If not specified, it defaults to the settings that were last configured.
     * @param WafGroups The settings of the managed rule group. If not specified, it defaults to the settings that were last configured.
     */
    public void setWafGroups(WafGroup [] WafGroups) {
        this.WafGroups = WafGroups;
    }

    public ModifySecurityWafGroupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityWafGroupPolicyRequest(ModifySecurityWafGroupPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
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
        if (source.WafGroups != null) {
            this.WafGroups = new WafGroup[source.WafGroups.length];
            for (int i = 0; i < source.WafGroups.length; i++) {
                this.WafGroups[i] = new WafGroup(source.WafGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "WafRules.", this.WafRules);
        this.setParamObj(map, prefix + "AiRule.", this.AiRule);
        this.setParamArrayObj(map, prefix + "WafGroups.", this.WafGroups);

    }
}

