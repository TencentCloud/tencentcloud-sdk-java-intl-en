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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheKey extends AbstractModel {

    /**
    * Whether to enable full path cache. Valid values:
<li>on: Turn on full path cache (that is, disable parameter ignoring);</li>
<li>off: Disable full path cache (parameter ignorable enabled).</li>
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * Whether to ignore case-insensitive cache. Valid values:
<li>on: Ignore;</li>
<li>off: Do not ignore.</li>
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * CacheKey contains request parameters.
    */
    @SerializedName("QueryString")
    @Expose
    private QueryString QueryString;

    /**
     * Get Whether to enable full path cache. Valid values:
<li>on: Turn on full path cache (that is, disable parameter ignoring);</li>
<li>off: Disable full path cache (parameter ignorable enabled).</li> 
     * @return FullUrlCache Whether to enable full path cache. Valid values:
<li>on: Turn on full path cache (that is, disable parameter ignoring);</li>
<li>off: Disable full path cache (parameter ignorable enabled).</li>
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set Whether to enable full path cache. Valid values:
<li>on: Turn on full path cache (that is, disable parameter ignoring);</li>
<li>off: Disable full path cache (parameter ignorable enabled).</li>
     * @param FullUrlCache Whether to enable full path cache. Valid values:
<li>on: Turn on full path cache (that is, disable parameter ignoring);</li>
<li>off: Disable full path cache (parameter ignorable enabled).</li>
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get Whether to ignore case-insensitive cache. Valid values:
<li>on: Ignore;</li>
<li>off: Do not ignore.</li> 
     * @return IgnoreCase Whether to ignore case-insensitive cache. Valid values:
<li>on: Ignore;</li>
<li>off: Do not ignore.</li>
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether to ignore case-insensitive cache. Valid values:
<li>on: Ignore;</li>
<li>off: Do not ignore.</li>
     * @param IgnoreCase Whether to ignore case-insensitive cache. Valid values:
<li>on: Ignore;</li>
<li>off: Do not ignore.</li>
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get CacheKey contains request parameters. 
     * @return QueryString CacheKey contains request parameters.
     */
    public QueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set CacheKey contains request parameters.
     * @param QueryString CacheKey contains request parameters.
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

