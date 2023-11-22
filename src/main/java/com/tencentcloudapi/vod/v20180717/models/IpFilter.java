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

public class IpFilter extends AbstractModel {

    /**
    * IP black and white list configuration switch, value: <li>on: on; </li> <li>off: off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP blacklist and whitelist types: <li>whitelist: whitelist;</li> <li>blacklist: blacklist. </li>
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP black and white list, supports: IP in the form of X.X.X.X, or network segment in the form of /8, /16, /24; Can populate up to 50 whitelists or 50 blacklists.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
    */
    @SerializedName("FilterRules")
    @Expose
    private IpFilterPathRule [] FilterRules;

    /**
     * Get IP black and white list configuration switch, value: <li>on: on; </li> <li>off: off. </li> 
     * @return Switch IP black and white list configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP black and white list configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     * @param Switch IP black and white list configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP blacklist and whitelist types: <li>whitelist: whitelist;</li> <li>blacklist: blacklist. </li> 
     * @return FilterType IP blacklist and whitelist types: <li>whitelist: whitelist;</li> <li>blacklist: blacklist. </li>
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP blacklist and whitelist types: <li>whitelist: whitelist;</li> <li>blacklist: blacklist. </li>
     * @param FilterType IP blacklist and whitelist types: <li>whitelist: whitelist;</li> <li>blacklist: blacklist. </li>
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP black and white list, supports: IP in the form of X.X.X.X, or network segment in the form of /8, /16, /24; Can populate up to 50 whitelists or 50 blacklists. 
     * @return Filters IP black and white list, supports: IP in the form of X.X.X.X, or network segment in the form of /8, /16, /24; Can populate up to 50 whitelists or 50 blacklists.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP black and white list, supports: IP in the form of X.X.X.X, or network segment in the form of /8, /16, /24; Can populate up to 50 whitelists or 50 blacklists.
     * @param Filters IP black and white list, supports: IP in the form of X.X.X.X, or network segment in the form of /8, /16, /24; Can populate up to 50 whitelists or 50 blacklists.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers. 
     * @return FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
     */
    public IpFilterPathRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
     * @param FilterRules IP blocklist/allowlist path-based configuration. This feature is only available to selected beta customers.
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

