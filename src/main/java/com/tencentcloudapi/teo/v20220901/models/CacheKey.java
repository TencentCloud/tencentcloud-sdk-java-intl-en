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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheKey extends AbstractModel{

    /**
    * Whether to enable full-path cache. Values:
<li>`on`: Enable full-path cache (i.e., disable Ignore Query String).</li>
<li>`off`: Disable full-path cache (i.e., enable Ignore Query String).</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * Whether to ignore case in the cache key. Values:
<li>`on`: Ignore</li>
<li>`off`: Not ignore</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * Request parameter contained in `CacheKey`. 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("QueryString")
    @Expose
    private QueryString QueryString;

    /**
     * Get Whether to enable full-path cache. Values:
<li>`on`: Enable full-path cache (i.e., disable Ignore Query String).</li>
<li>`off`: Disable full-path cache (i.e., enable Ignore Query String).</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullUrlCache Whether to enable full-path cache. Values:
<li>`on`: Enable full-path cache (i.e., disable Ignore Query String).</li>
<li>`off`: Disable full-path cache (i.e., enable Ignore Query String).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set Whether to enable full-path cache. Values:
<li>`on`: Enable full-path cache (i.e., disable Ignore Query String).</li>
<li>`off`: Disable full-path cache (i.e., enable Ignore Query String).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullUrlCache Whether to enable full-path cache. Values:
<li>`on`: Enable full-path cache (i.e., disable Ignore Query String).</li>
<li>`off`: Disable full-path cache (i.e., enable Ignore Query String).</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get Whether to ignore case in the cache key. Values:
<li>`on`: Ignore</li>
<li>`off`: Not ignore</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreCase Whether to ignore case in the cache key. Values:
<li>`on`: Ignore</li>
<li>`off`: Not ignore</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether to ignore case in the cache key. Values:
<li>`on`: Ignore</li>
<li>`off`: Not ignore</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoreCase Whether to ignore case in the cache key. Values:
<li>`on`: Ignore</li>
<li>`off`: Not ignore</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get Request parameter contained in `CacheKey`. 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return QueryString Request parameter contained in `CacheKey`. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public QueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Request parameter contained in `CacheKey`. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param QueryString Request parameter contained in `CacheKey`. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setQueryString(QueryString QueryString) {
        this.QueryString = QueryString;
    }

    public CacheKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKey(CacheKey source) {
        if (source.FullUrlCache != null) {
            this.FullUrlCache = new String(source.FullUrlCache);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.QueryString != null) {
            this.QueryString = new QueryString(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);

    }
}

