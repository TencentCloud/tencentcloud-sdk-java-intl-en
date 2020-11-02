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

public class IpFilter extends AbstractModel{

    /**
    * IP blocklist/allowlist configuration switch
on: enabled
off: disabled
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP blocklist/allowlist type
whitelist: allowlist
blacklist: blocklist
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP blocklist/allowlist list
Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges.
Up to 50 allowlists or blocklists can be entered
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FilterRules")
    @Expose
    private IpFilterPathRule [] FilterRules;

    /**
     * Get IP blocklist/allowlist configuration switch
on: enabled
off: disabled 
     * @return Switch IP blocklist/allowlist configuration switch
on: enabled
off: disabled
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP blocklist/allowlist configuration switch
on: enabled
off: disabled
     * @param Switch IP blocklist/allowlist configuration switch
on: enabled
off: disabled
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP blocklist/allowlist type
whitelist: allowlist
blacklist: blocklist
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterType IP blocklist/allowlist type
whitelist: allowlist
blacklist: blocklist
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP blocklist/allowlist type
whitelist: allowlist
blacklist: blocklist
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterType IP blocklist/allowlist type
whitelist: allowlist
blacklist: blocklist
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP blocklist/allowlist list
Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges.
Up to 50 allowlists or blocklists can be entered
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Filters IP blocklist/allowlist list
Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges.
Up to 50 allowlists or blocklists can be entered
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP blocklist/allowlist list
Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges.
Up to 50 allowlists or blocklists can be entered
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Filters IP blocklist/allowlist list
Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges.
Up to 50 allowlists or blocklists can be entered
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public IpFilterPathRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFilterRules(IpFilterPathRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);

    }
}

