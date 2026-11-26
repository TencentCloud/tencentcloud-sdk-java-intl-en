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

public class WafRule extends AbstractModel {

    /**
    * Managed rule switch. Valid values:
<li> on: enabled;</li>
<li> off: disabled</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * List of blocklisted IDs. Adding a rule ID to this parameter list disables the ID, meaning the rule ID no longer takes effect.
    */
    @SerializedName("BlockRuleIDs")
    @Expose
    private Long [] BlockRuleIDs;

    /**
    * List of observation mode IDs. Add a rule ID to this parameter list to make the ID take effect in observation mode, that is, the rule ID enters observation mode.
    */
    @SerializedName("ObserveRuleIDs")
    @Expose
    private Long [] ObserveRuleIDs;

    /**
     * Get Managed rule switch. Valid values:
<li> on: enabled;</li>
<li> off: disabled</li> 
     * @return Switch Managed rule switch. Valid values:
<li> on: enabled;</li>
<li> off: disabled</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Managed rule switch. Valid values:
<li> on: enabled;</li>
<li> off: disabled</li>
     * @param Switch Managed rule switch. Valid values:
<li> on: enabled;</li>
<li> off: disabled</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get List of blocklisted IDs. Adding a rule ID to this parameter list disables the ID, meaning the rule ID no longer takes effect. 
     * @return BlockRuleIDs List of blocklisted IDs. Adding a rule ID to this parameter list disables the ID, meaning the rule ID no longer takes effect.
     */
    public Long [] getBlockRuleIDs() {
        return this.BlockRuleIDs;
    }

    /**
     * Set List of blocklisted IDs. Adding a rule ID to this parameter list disables the ID, meaning the rule ID no longer takes effect.
     * @param BlockRuleIDs List of blocklisted IDs. Adding a rule ID to this parameter list disables the ID, meaning the rule ID no longer takes effect.
     */
    public void setBlockRuleIDs(Long [] BlockRuleIDs) {
        this.BlockRuleIDs = BlockRuleIDs;
    }

    /**
     * Get List of observation mode IDs. Add a rule ID to this parameter list to make the ID take effect in observation mode, that is, the rule ID enters observation mode. 
     * @return ObserveRuleIDs List of observation mode IDs. Add a rule ID to this parameter list to make the ID take effect in observation mode, that is, the rule ID enters observation mode.
     */
    public Long [] getObserveRuleIDs() {
        return this.ObserveRuleIDs;
    }

    /**
     * Set List of observation mode IDs. Add a rule ID to this parameter list to make the ID take effect in observation mode, that is, the rule ID enters observation mode.
     * @param ObserveRuleIDs List of observation mode IDs. Add a rule ID to this parameter list to make the ID take effect in observation mode, that is, the rule ID enters observation mode.
     */
    public void setObserveRuleIDs(Long [] ObserveRuleIDs) {
        this.ObserveRuleIDs = ObserveRuleIDs;
    }

    public WafRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafRule(WafRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BlockRuleIDs != null) {
            this.BlockRuleIDs = new Long[source.BlockRuleIDs.length];
            for (int i = 0; i < source.BlockRuleIDs.length; i++) {
                this.BlockRuleIDs[i] = new Long(source.BlockRuleIDs[i]);
            }
        }
        if (source.ObserveRuleIDs != null) {
            this.ObserveRuleIDs = new Long[source.ObserveRuleIDs.length];
            for (int i = 0; i < source.ObserveRuleIDs.length; i++) {
                this.ObserveRuleIDs[i] = new Long(source.ObserveRuleIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "BlockRuleIDs.", this.BlockRuleIDs);
        this.setParamArraySimple(map, prefix + "ObserveRuleIDs.", this.ObserveRuleIDs);

    }
}

