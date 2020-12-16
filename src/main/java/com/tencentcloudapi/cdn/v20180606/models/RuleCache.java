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

public class RuleCache extends AbstractModel{

    /**
    * Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
For `default`, enter `no max-age`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: homepage.
`default`: effective when the origin server does not have the `max-age` value.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Cache configuration
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("CacheConfig")
    @Expose
    private RuleCacheConfig CacheConfig;

    /**
     * Get Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
For `default`, enter `no max-age`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RulePaths Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
For `default`, enter `no max-age`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
For `default`, enter `no max-age`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RulePaths Content for each `CacheType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
For `default`, enter `no max-age`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: homepage.
`default`: effective when the origin server does not have the `max-age` value.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: homepage.
`default`: effective when the origin server does not have the `max-age` value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: homepage.
`default`: effective when the origin server does not have the `max-age` value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RuleType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: homepage.
`default`: effective when the origin server does not have the `max-age` value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Cache configuration
Note: this field may return null, indicating that no valid value is obtained. 
     * @return CacheConfig Cache configuration
Note: this field may return null, indicating that no valid value is obtained.
     */
    public RuleCacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache configuration
Note: this field may return null, indicating that no valid value is obtained.
     * @param CacheConfig Cache configuration
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setCacheConfig(RuleCacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);

    }
}

