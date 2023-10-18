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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserAgentFilter extends AbstractModel {

    /**
    * UserAgent blacklist and whitelist configuration switches, the values are: <li>on:Enable; </li> <li>off: Disable. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * UA blacklist/whitelist effect rule list
    */
    @SerializedName("FilterRules")
    @Expose
    private UserAgentFilterRule [] FilterRules;

    /**
     * Get UserAgent blacklist and whitelist configuration switches, the values are: <li>on:Enable; </li> <li>off: Disable. </li> 
     * @return Switch UserAgent blacklist and whitelist configuration switches, the values are: <li>on:Enable; </li> <li>off: Disable. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set UserAgent blacklist and whitelist configuration switches, the values are: <li>on:Enable; </li> <li>off: Disable. </li>
     * @param Switch UserAgent blacklist and whitelist configuration switches, the values are: <li>on:Enable; </li> <li>off: Disable. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get UA blacklist/whitelist effect rule list 
     * @return FilterRules UA blacklist/whitelist effect rule list
     */
    public UserAgentFilterRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set UA blacklist/whitelist effect rule list
     * @param FilterRules UA blacklist/whitelist effect rule list
     */
    public void setFilterRules(UserAgentFilterRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    public UserAgentFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAgentFilter(UserAgentFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new UserAgentFilterRule[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new UserAgentFilterRule(source.FilterRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);

    }
}

