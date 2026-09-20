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

public class IpFilterPathRule extends AbstractModel {

    /**
    * IP allowlist/blocklist type:
<li>whitelist: allowlist;</li>
<li>blacklist: blocklist.</li>
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP blocklist and allowlist. Supports IPs in X.X.X.X format or network segments in /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: specify the path to take effect;</li>
<li>path: The absolute path takes effect.</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

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
     * Get IP blocklist and allowlist. Supports IPs in X.X.X.X format or network segments in /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries. 
     * @return Filters IP blocklist and allowlist. Supports IPs in X.X.X.X format or network segments in /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP blocklist and allowlist. Supports IPs in X.X.X.X format or network segments in /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     * @param Filters IP blocklist and allowlist. Supports IPs in X.X.X.X format or network segments in /8, /16, or /24 format.
Fill up to 50 allowlist entries or 50 blocklist entries.
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: specify the path to take effect;</li>
<li>path: The absolute path takes effect.</li> 
     * @return RuleType Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: specify the path to take effect;</li>
<li>path: The absolute path takes effect.</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: specify the path to take effect;</li>
<li>path: The absolute path takes effect.</li>
     * @param RuleType Rule type:
<li>all: take effect for all files;</li>
<li>file: The specified file suffix takes effect;</li>
<li>directory: specify the path to take effect;</li>
<li>path: The absolute path takes effect.</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li> 
     * @return RulePaths Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
     * @param RulePaths Matching content under the corresponding type of RuleType:
<li>Fill with * when set to all;</li>
<li>For file, fill in the extension, such as jpg or txt;</li>
<li>For directory, fill in the path, such as /xxx/test/;</li>
<li>For path, fill in the absolute path, such as /xxx/test.html.</li>
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

