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

public class UserAgentFilterRule extends AbstractModel {

    /**
    * Effective access path type
`all`: All access paths are effective
`file`: Effective by file extension
`directory`: Effective by directory
`path`: Effective by full access path
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Effective access paths
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * `UserAgent` list
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UserAgents")
    @Expose
    private String [] UserAgents;

    /**
    * Blocklist or allowlist. Valid values: `blacklist`, `whitelist`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get Effective access path type
`all`: All access paths are effective
`file`: Effective by file extension
`directory`: Effective by directory
`path`: Effective by full access path
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleType Effective access path type
`all`: All access paths are effective
`file`: Effective by file extension
`directory`: Effective by directory
`path`: Effective by full access path
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Effective access path type
`all`: All access paths are effective
`file`: Effective by file extension
`directory`: Effective by directory
`path`: Effective by full access path
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleType Effective access path type
`all`: All access paths are effective
`file`: Effective by file extension
`directory`: Effective by directory
`path`: Effective by full access path
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Effective access paths
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RulePaths Effective access paths
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Effective access paths
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RulePaths Effective access paths
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get `UserAgent` list
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UserAgents `UserAgent` list
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getUserAgents() {
        return this.UserAgents;
    }

    /**
     * Set `UserAgent` list
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UserAgents `UserAgent` list
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUserAgents(String [] UserAgents) {
        this.UserAgents = UserAgents;
    }

    /**
     * Get Blocklist or allowlist. Valid values: `blacklist`, `whitelist`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FilterType Blocklist or allowlist. Valid values: `blacklist`, `whitelist`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Blocklist or allowlist. Valid values: `blacklist`, `whitelist`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FilterType Blocklist or allowlist. Valid values: `blacklist`, `whitelist`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    public UserAgentFilterRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAgentFilterRule(UserAgentFilterRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.UserAgents != null) {
            this.UserAgents = new String[source.UserAgents.length];
            for (int i = 0; i < source.UserAgents.length; i++) {
                this.UserAgents[i] = new String(source.UserAgents[i]);
            }
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamArraySimple(map, prefix + "UserAgents.", this.UserAgents);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);

    }
}

