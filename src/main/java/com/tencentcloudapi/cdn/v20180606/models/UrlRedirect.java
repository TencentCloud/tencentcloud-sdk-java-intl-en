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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlRedirect extends AbstractModel{

    /**
    * Whether to enable URL rewriting
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Rule of URL rewriting rule, which is required if `Switch` is `on`. There can be up to 10 rules.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PathRules")
    @Expose
    private UrlRedirectRule [] PathRules;

    /**
     * Get Whether to enable URL rewriting
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable URL rewriting
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable URL rewriting
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable URL rewriting
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Rule of URL rewriting rule, which is required if `Switch` is `on`. There can be up to 10 rules.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PathRules Rule of URL rewriting rule, which is required if `Switch` is `on`. There can be up to 10 rules.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public UrlRedirectRule [] getPathRules() {
        return this.PathRules;
    }

    /**
     * Set Rule of URL rewriting rule, which is required if `Switch` is `on`. There can be up to 10 rules.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PathRules Rule of URL rewriting rule, which is required if `Switch` is `on`. There can be up to 10 rules.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPathRules(UrlRedirectRule [] PathRules) {
        this.PathRules = PathRules;
    }

    public UrlRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlRedirect(UrlRedirect source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.PathRules != null) {
            this.PathRules = new UrlRedirectRule[source.PathRules.length];
            for (int i = 0; i < source.PathRules.length; i++) {
                this.PathRules[i] = new UrlRedirectRule(source.PathRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "PathRules.", this.PathRules);

    }
}

