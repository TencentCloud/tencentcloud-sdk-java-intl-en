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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafRule extends AbstractModel {

    /**
    * Blocklist
    */
    @SerializedName("BlockRuleIDs")
    @Expose
    private Long [] BlockRuleIDs;

    /**
    * Whether the WAF rule is enabled or disabled
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Observe mode
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ObserveRuleIDs")
    @Expose
    private Long [] ObserveRuleIDs;

    /**
     * Get Blocklist 
     * @return BlockRuleIDs Blocklist
     */
    public Long [] getBlockRuleIDs() {
        return this.BlockRuleIDs;
    }

    /**
     * Set Blocklist
     * @param BlockRuleIDs Blocklist
     */
    public void setBlockRuleIDs(Long [] BlockRuleIDs) {
        this.BlockRuleIDs = BlockRuleIDs;
    }

    /**
     * Get Whether the WAF rule is enabled or disabled 
     * @return Switch Whether the WAF rule is enabled or disabled
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether the WAF rule is enabled or disabled
     * @param Switch Whether the WAF rule is enabled or disabled
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Observe mode
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ObserveRuleIDs Observe mode
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getObserveRuleIDs() {
        return this.ObserveRuleIDs;
    }

    /**
     * Set Observe mode
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ObserveRuleIDs Observe mode
Note: This field may return `null`, indicating that no valid value can be obtained.
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
        if (source.BlockRuleIDs != null) {
            this.BlockRuleIDs = new Long[source.BlockRuleIDs.length];
            for (int i = 0; i < source.BlockRuleIDs.length; i++) {
                this.BlockRuleIDs[i] = new Long(source.BlockRuleIDs[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamArraySimple(map, prefix + "BlockRuleIDs.", this.BlockRuleIDs);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "ObserveRuleIDs.", this.ObserveRuleIDs);

    }
}

