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

public class IntelligenceRule extends AbstractModel {

    /**
    * Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Rule details.
    */
    @SerializedName("IntelligenceRuleItems")
    @Expose
    private IntelligenceRuleItem [] IntelligenceRuleItems;

    /**
     * Get Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Rule details. 
     * @return IntelligenceRuleItems Rule details.
     */
    public IntelligenceRuleItem [] getIntelligenceRuleItems() {
        return this.IntelligenceRuleItems;
    }

    /**
     * Set Rule details.
     * @param IntelligenceRuleItems Rule details.
     */
    public void setIntelligenceRuleItems(IntelligenceRuleItem [] IntelligenceRuleItems) {
        this.IntelligenceRuleItems = IntelligenceRuleItems;
    }

    public IntelligenceRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRule(IntelligenceRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.IntelligenceRuleItems != null) {
            this.IntelligenceRuleItems = new IntelligenceRuleItem[source.IntelligenceRuleItems.length];
            for (int i = 0; i < source.IntelligenceRuleItems.length; i++) {
                this.IntelligenceRuleItems[i] = new IntelligenceRuleItem(source.IntelligenceRuleItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "IntelligenceRuleItems.", this.IntelligenceRuleItems);

    }
}

