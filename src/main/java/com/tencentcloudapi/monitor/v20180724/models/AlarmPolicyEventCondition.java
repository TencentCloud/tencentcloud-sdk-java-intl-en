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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyEventCondition extends AbstractModel {

    /**
    * Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private AlarmPolicyRule [] Rules;

    /**
     * Get Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rules Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rules Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(AlarmPolicyRule [] Rules) {
        this.Rules = Rules;
    }

    public AlarmPolicyEventCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyEventCondition(AlarmPolicyEventCondition source) {
        if (source.Rules != null) {
            this.Rules = new AlarmPolicyRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AlarmPolicyRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

