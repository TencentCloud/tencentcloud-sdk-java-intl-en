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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Referer extends AbstractModel {

    /**
    * Referer blacklist/whitelist configuration switch
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Referer blacklist/whitelist configuration rule
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RefererRules")
    @Expose
    private RefererRule [] RefererRules;

    /**
     * Get Referer blacklist/whitelist configuration switch
`on`: Enable
`off`: Disable 
     * @return Switch Referer blacklist/whitelist configuration switch
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Referer blacklist/whitelist configuration switch
`on`: Enable
`off`: Disable
     * @param Switch Referer blacklist/whitelist configuration switch
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Referer blacklist/whitelist configuration rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RefererRules Referer blacklist/whitelist configuration rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RefererRule [] getRefererRules() {
        return this.RefererRules;
    }

    /**
     * Set Referer blacklist/whitelist configuration rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RefererRules Referer blacklist/whitelist configuration rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRefererRules(RefererRule [] RefererRules) {
        this.RefererRules = RefererRules;
    }

    public Referer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Referer(Referer source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RefererRules != null) {
            this.RefererRules = new RefererRule[source.RefererRules.length];
            for (int i = 0; i < source.RefererRules.length; i++) {
                this.RefererRules[i] = new RefererRule(source.RefererRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RefererRules.", this.RefererRules);

    }
}

