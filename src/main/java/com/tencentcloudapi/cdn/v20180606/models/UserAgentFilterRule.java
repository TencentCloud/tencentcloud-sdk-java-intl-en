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

public class UserAgentFilterRule extends AbstractModel{

    /**
    * Effective access path type
all: all access paths are effective
file: effective by file extension
directory: effective by directory
path: effective by full access path
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Effective access paths
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * `UserAgent` list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAgents")
    @Expose
    private String [] UserAgents;

    /**
    * Blacklist or whitelist. Valid values: blacklist, whitelist
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get Effective access path type
all: all access paths are effective
file: effective by file extension
directory: effective by directory
path: effective by full access path
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Effective access path type
all: all access paths are effective
file: effective by file extension
directory: effective by directory
path: effective by full access path
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Effective access path type
all: all access paths are effective
file: effective by file extension
directory: effective by directory
path: effective by full access path
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RuleType Effective access path type
all: all access paths are effective
file: effective by file extension
directory: effective by directory
path: effective by full access path
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Effective access paths
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RulePaths Effective access paths
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Effective access paths
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RulePaths Effective access paths
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get `UserAgent` list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserAgents `UserAgent` list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUserAgents() {
        return this.UserAgents;
    }

    /**
     * Set `UserAgent` list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserAgents `UserAgent` list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAgents(String [] UserAgents) {
        this.UserAgents = UserAgents;
    }

    /**
     * Get Blacklist or whitelist. Valid values: blacklist, whitelist
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterType Blacklist or whitelist. Valid values: blacklist, whitelist
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Blacklist or whitelist. Valid values: blacklist, whitelist
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterType Blacklist or whitelist. Valid values: blacklist, whitelist
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
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

