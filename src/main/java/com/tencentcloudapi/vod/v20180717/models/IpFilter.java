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

public class IpFilter extends AbstractModel {

    /**
    * IP allowlist/blocklist configuration switch. Parameter value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP allowlist or blocklist. It supports IPs in the X.X.X.X format or network segments in the /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * IP allowlist/blocklist path-specific configuration.
    */
    @SerializedName("FilterRules")
    @Expose
    private IpFilterPathRule [] FilterRules;

    /**
     * Get IP allowlist/blocklist configuration switch. Parameter value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Switch IP allowlist/blocklist configuration switch. Parameter value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP allowlist/blocklist configuration switch. Parameter value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Switch IP allowlist/blocklist configuration switch. Parameter value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li> 
     * @return FilterType IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     * @param FilterType IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP allowlist or blocklist. It supports IPs in the X.X.X.X format or network segments in the /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries. 
     * @return Filters IP allowlist or blocklist. It supports IPs in the X.X.X.X format or network segments in the /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP allowlist or blocklist. It supports IPs in the X.X.X.X format or network segments in the /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     * @param Filters IP allowlist or blocklist. It supports IPs in the X.X.X.X format or network segments in the /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get IP allowlist/blocklist path-specific configuration. 
     * @return FilterRules IP allowlist/blocklist path-specific configuration.
     */
    public IpFilterPathRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set IP allowlist/blocklist path-specific configuration.
     * @param FilterRules IP allowlist/blocklist path-specific configuration.
     */
    public void setFilterRules(IpFilterPathRule [] FilterRules) {
        this.FilterRules = FilterRules;
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

