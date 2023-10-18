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

public class IpFilter extends AbstractModel {

    /**
    * IP blocklist/allowlist configuration switch
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP blocklist/allowlist type
`whitelist`: IP allowlist
`blacklist`: IP blocklist
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP blocklist/allowlist
Supports IPs in X.X.X.X format, or IP ranges in /8, /16, /24 format.
Up to 50 whitelists or blacklists can be entered
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FilterRules")
    @Expose
    private IpFilterPathRule [] FilterRules;

    /**
    * (Disused) Expected HTTP code to return when the IP allowlist/blocklist verification fails. <br><font color=red>The 514 code is used instead.</font>
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
     * Get IP blocklist/allowlist configuration switch
`on`: Enable
`off`: Disable 
     * @return Switch IP blocklist/allowlist configuration switch
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP blocklist/allowlist configuration switch
`on`: Enable
`off`: Disable
     * @param Switch IP blocklist/allowlist configuration switch
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP blocklist/allowlist type
`whitelist`: IP allowlist
`blacklist`: IP blocklist
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FilterType IP blocklist/allowlist type
`whitelist`: IP allowlist
`blacklist`: IP blocklist
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP blocklist/allowlist type
`whitelist`: IP allowlist
`blacklist`: IP blocklist
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FilterType IP blocklist/allowlist type
`whitelist`: IP allowlist
`blacklist`: IP blocklist
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP blocklist/allowlist
Supports IPs in X.X.X.X format, or IP ranges in /8, /16, /24 format.
Up to 50 whitelists or blacklists can be entered
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Filters IP blocklist/allowlist
Supports IPs in X.X.X.X format, or IP ranges in /8, /16, /24 format.
Up to 50 whitelists or blacklists can be entered
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP blocklist/allowlist
Supports IPs in X.X.X.X format, or IP ranges in /8, /16, /24 format.
Up to 50 whitelists or blacklists can be entered
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Filters IP blocklist/allowlist
Supports IPs in X.X.X.X format, or IP ranges in /8, /16, /24 format.
Up to 50 whitelists or blacklists can be entered
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public IpFilterPathRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFilterRules(IpFilterPathRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get (Disused) Expected HTTP code to return when the IP allowlist/blocklist verification fails. <br><font color=red>The 514 code is used instead.</font>
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReturnCode (Disused) Expected HTTP code to return when the IP allowlist/blocklist verification fails. <br><font color=red>The 514 code is used instead.</font>
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set (Disused) Expected HTTP code to return when the IP allowlist/blocklist verification fails. <br><font color=red>The 514 code is used instead.</font>
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReturnCode (Disused) Expected HTTP code to return when the IP allowlist/blocklist verification fails. <br><font color=red>The 514 code is used instead.</font>
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public IpFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpFilter(IpFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.FilterRules != null) {
            this.FilterRules = new IpFilterPathRule[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new IpFilterPathRule(source.FilterRules[i]);
            }
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);

    }
}

