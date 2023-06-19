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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCache extends AbstractModel{

    /**
    * Rule types:<li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each CacheType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li>
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Cache configuration
    */
    @SerializedName("CacheConfig")
    @Expose
    private RuleCacheConfig CacheConfig;

    /**
     * Get Rule types:<li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li> 
     * @return RuleType Rule types:<li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:<li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     * @param RuleType Rule types:<li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each CacheType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> 
     * @return RulePaths Content for each CacheType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li>
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each CacheType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li>
     * @param RulePaths Content for each CacheType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li>
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Cache configuration 
     * @return CacheConfig Cache configuration
     */
    public RuleCacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set Cache configuration
     * @param CacheConfig Cache configuration
     */
    public void setCacheConfig(RuleCacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    public RuleCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCache(RuleCache source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new RuleCacheConfig(source.CacheConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);

    }
}

