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

public class KeyRule extends AbstractModel {

    /**
    * Content for each CacheType:
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a backslash (/).
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Rule types:
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`index`: home page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String).
`off`: Disable full-path cache (i.e., enable Ignore Query String).
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * Whether caches are case insensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("QueryString")
    @Expose
    private RuleQueryString QueryString;

    /**
    * Path cache key tag, the value "user" is passed.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get Content for each CacheType:
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a backslash (/).
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return RulePaths Content for each CacheType:
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a backslash (/).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each CacheType:
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a backslash (/).
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param RulePaths Content for each CacheType:
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a backslash (/).
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Rule types:
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`index`: home page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleType Rule types:
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`index`: home page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`index`: home page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleType Rule types:
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`index`: home page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String).
`off`: Disable full-path cache (i.e., enable Ignore Query String).
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FullUrlCache Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String).
`off`: Disable full-path cache (i.e., enable Ignore Query String).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String).
`off`: Disable full-path cache (i.e., enable Ignore Query String).
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FullUrlCache Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String).
`off`: Disable full-path cache (i.e., enable Ignore Query String).
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get Whether caches are case insensitive
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IgnoreCase Whether caches are case insensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether caches are case insensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IgnoreCase Whether caches are case insensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return QueryString Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RuleQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param QueryString Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQueryString(RuleQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Path cache key tag, the value "user" is passed.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleTag Path cache key tag, the value "user" is passed.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Path cache key tag, the value "user" is passed.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleTag Path cache key tag, the value "user" is passed.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    public KeyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyRule(KeyRule source) {
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.FullUrlCache != null) {
            this.FullUrlCache = new String(source.FullUrlCache);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.QueryString != null) {
            this.QueryString = new RuleQueryString(source.QueryString);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);

    }
}

