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
    * Whether to enable managed rules. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IDs of the rules to be disabled.
    */
    @SerializedName("BlockRuleIDs")
    @Expose
    private Long [] BlockRuleIDs;

    /**
    * IDs of the rules to be executed in Observe mode.
    */
    @SerializedName("ObserveRuleIDs")
    @Expose
    private Long [] ObserveRuleIDs;

    /**
     * Get Whether to enable managed rules. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable managed rules. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable managed rules. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable managed rules. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IDs of the rules to be disabled. 
     * @return BlockRuleIDs IDs of the rules to be disabled.
     */
    public Long [] getBlockRuleIDs() {
        return this.BlockRuleIDs;
    }

    /**
     * Set IDs of the rules to be disabled.
     * @param BlockRuleIDs IDs of the rules to be disabled.
     */
    public void setBlockRuleIDs(Long [] BlockRuleIDs) {
        this.BlockRuleIDs = BlockRuleIDs;
    }

    /**
     * Get IDs of the rules to be executed in Observe mode. 
     * @return ObserveRuleIDs IDs of the rules to be executed in Observe mode.
     */
    public Long [] getObserveRuleIDs() {
        return this.ObserveRuleIDs;
    }

    /**
     * Set IDs of the rules to be executed in Observe mode.
     * @param ObserveRuleIDs IDs of the rules to be executed in Observe mode.
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

