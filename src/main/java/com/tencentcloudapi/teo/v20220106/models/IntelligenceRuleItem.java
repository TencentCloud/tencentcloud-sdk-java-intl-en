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

public class IntelligenceRuleItem extends AbstractModel{

    /**
    * Malicious bot, which is used to tag bad bots
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Action
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Malicious bot, which is used to tag bad bots
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label Malicious bot, which is used to tag bad bots
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Malicious bot, which is used to tag bad bots
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label Malicious bot, which is used to tag bad bots
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Action
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Action
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Action
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public IntelligenceRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRuleItem(IntelligenceRuleItem source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

