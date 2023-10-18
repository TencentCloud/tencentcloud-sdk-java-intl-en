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

public class IpFilterPathRule extends AbstractModel {

    /**
    * IP blocklist/allowlist type: <li>whitelist: allowlist IPs;</li> <li>blacklist: blocklist IPs.</li>
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP blocklist/allowlist list Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges. Up to 50 allowlists or blocklists can be entered.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * Rule types: <li>all: Effective for all files;</li> <li>file: Effective for specified file suffixes;</li> <li>directory: Effective for specified paths;</li> <li>path: Effective for specified absolute paths.</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each RuleType: <li>For all, enter an asterisk (*).</li> <li>For file, enter the suffix, such as jpg, txt.</li> <li>For directory, enter the path, such as /xxx/test/.</li> <li>For path, enter the corresponding absolute path, such as /xxx/test.html.</li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get IP blocklist/allowlist type: <li>whitelist: allowlist IPs;</li> <li>blacklist: blocklist IPs.</li> 
     * @return FilterType IP blocklist/allowlist type: <li>whitelist: allowlist IPs;</li> <li>blacklist: blocklist IPs.</li>
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP blocklist/allowlist type: <li>whitelist: allowlist IPs;</li> <li>blacklist: blocklist IPs.</li>
     * @param FilterType IP blocklist/allowlist type: <li>whitelist: allowlist IPs;</li> <li>blacklist: blocklist IPs.</li>
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP blocklist/allowlist list Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges. Up to 50 allowlists or blocklists can be entered. 
     * @return Filters IP blocklist/allowlist list Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges. Up to 50 allowlists or blocklists can be entered.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP blocklist/allowlist list Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges. Up to 50 allowlists or blocklists can be entered.
     * @param Filters IP blocklist/allowlist list Supports IPs in X.X.X.X format, or /8, /16, /24 format IP ranges. Up to 50 allowlists or blocklists can be entered.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Rule types: <li>all: Effective for all files;</li> <li>file: Effective for specified file suffixes;</li> <li>directory: Effective for specified paths;</li> <li>path: Effective for specified absolute paths.</li> 
     * @return RuleType Rule types: <li>all: Effective for all files;</li> <li>file: Effective for specified file suffixes;</li> <li>directory: Effective for specified paths;</li> <li>path: Effective for specified absolute paths.</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types: <li>all: Effective for all files;</li> <li>file: Effective for specified file suffixes;</li> <li>directory: Effective for specified paths;</li> <li>path: Effective for specified absolute paths.</li>
     * @param RuleType Rule types: <li>all: Effective for all files;</li> <li>file: Effective for specified file suffixes;</li> <li>directory: Effective for specified paths;</li> <li>path: Effective for specified absolute paths.</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each RuleType: <li>For all, enter an asterisk (*).</li> <li>For file, enter the suffix, such as jpg, txt.</li> <li>For directory, enter the path, such as /xxx/test/.</li> <li>For path, enter the corresponding absolute path, such as /xxx/test.html.</li> 
     * @return RulePaths Content for each RuleType: <li>For all, enter an asterisk (*).</li> <li>For file, enter the suffix, such as jpg, txt.</li> <li>For directory, enter the path, such as /xxx/test/.</li> <li>For path, enter the corresponding absolute path, such as /xxx/test.html.</li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each RuleType: <li>For all, enter an asterisk (*).</li> <li>For file, enter the suffix, such as jpg, txt.</li> <li>For directory, enter the path, such as /xxx/test/.</li> <li>For path, enter the corresponding absolute path, such as /xxx/test.html.</li>
     * @param RulePaths Content for each RuleType: <li>For all, enter an asterisk (*).</li> <li>For file, enter the suffix, such as jpg, txt.</li> <li>For directory, enter the path, such as /xxx/test/.</li> <li>For path, enter the corresponding absolute path, such as /xxx/test.html.</li>
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public IpFilterPathRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpFilterPathRule(IpFilterPathRule source) {
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

