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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserAgentFilter extends AbstractModel {

    /**
    * UserAgent allowlist/blocklist configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * List of effective UserAgent blocklist/allowlist rules.
    */
    @SerializedName("FilterRules")
    @Expose
    private UserAgentFilterRule [] FilterRules;

    /**
     * Get UserAgent allowlist/blocklist configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Switch UserAgent allowlist/blocklist configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set UserAgent allowlist/blocklist configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Switch UserAgent allowlist/blocklist configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get List of effective UserAgent blocklist/allowlist rules. 
     * @return FilterRules List of effective UserAgent blocklist/allowlist rules.
     */
    public UserAgentFilterRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set List of effective UserAgent blocklist/allowlist rules.
     * @param FilterRules List of effective UserAgent blocklist/allowlist rules.
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

