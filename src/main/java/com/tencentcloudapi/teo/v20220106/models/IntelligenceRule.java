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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceRule extends AbstractModel{

    /**
    * Switch
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Items in a bot intelligence rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private IntelligenceRuleItem [] Items;

    /**
     * Get Switch
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Switch Switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Switch Switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Items in a bot intelligence rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Items Items in a bot intelligence rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IntelligenceRuleItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Items in a bot intelligence rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Items Items in a bot intelligence rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItems(IntelligenceRuleItem [] Items) {
        this.Items = Items;
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
        if (source.Items != null) {
            this.Items = new IntelligenceRuleItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new IntelligenceRuleItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

