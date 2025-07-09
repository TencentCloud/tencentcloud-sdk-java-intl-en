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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceCacheRule extends AbstractModel {

    /**
    * Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`default`: the cache rules when the origin server has not returned max-age
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * Content for each CacheType:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `default`, enter "no max-age".
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheContents")
    @Expose
    private String [] CacheContents;

    /**
    * Cache expiration time
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`default`: the cache rules when the origin server has not returned max-age
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`default`: the cache rules when the origin server has not returned max-age
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`default`: the cache rules when the origin server has not returned max-age
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheType Rule types:
`all`: Apply to all files.
`file`: Apply to files with the specified suffixes.
`directory`: Apply to specified paths.
`path`: Apply to specified absolute paths.
`default`: the cache rules when the origin server has not returned max-age
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get Content for each CacheType:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `default`, enter "no max-age".
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheContents Content for each CacheType:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `default`, enter "no max-age".
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getCacheContents() {
        return this.CacheContents;
    }

    /**
     * Set Content for each CacheType:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `default`, enter "no max-age".
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheContents Content for each CacheType:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `default`, enter "no max-age".
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheContents(String [] CacheContents) {
        this.CacheContents = CacheContents;
    }

    /**
     * Get Cache expiration time
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheTime Cache expiration time
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheTime Cache expiration time
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public AdvanceCacheRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvanceCacheRule(AdvanceCacheRule source) {
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.CacheContents != null) {
            this.CacheContents = new String[source.CacheContents.length];
            for (int i = 0; i < source.CacheContents.length; i++) {
                this.CacheContents[i] = new String(source.CacheContents[i]);
            }
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamArraySimple(map, prefix + "CacheContents.", this.CacheContents);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

