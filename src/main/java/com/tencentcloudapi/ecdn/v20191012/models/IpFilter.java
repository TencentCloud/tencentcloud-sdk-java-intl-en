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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpFilter extends AbstractModel {

    /**
    * IP blocklist/allowlist switch. Valid values: on, off.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP blocklist/allowlist type. Valid values: whitelist, blacklist.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP blocklist/allowlist list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
     * Get IP blocklist/allowlist switch. Valid values: on, off. 
     * @return Switch IP blocklist/allowlist switch. Valid values: on, off.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP blocklist/allowlist switch. Valid values: on, off.
     * @param Switch IP blocklist/allowlist switch. Valid values: on, off.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP blocklist/allowlist type. Valid values: whitelist, blacklist.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterType IP blocklist/allowlist type. Valid values: whitelist, blacklist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP blocklist/allowlist type. Valid values: whitelist, blacklist.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterType IP blocklist/allowlist type. Valid values: whitelist, blacklist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP blocklist/allowlist list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Filters IP blocklist/allowlist list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP blocklist/allowlist list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Filters IP blocklist/allowlist list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);

    }
}

