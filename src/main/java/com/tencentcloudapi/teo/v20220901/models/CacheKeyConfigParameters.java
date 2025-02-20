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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheKeyConfigParameters extends AbstractModel {

    /**
    * Whether to enable full-path cache. values:.
<Li>`On`: enable full-path cache (i.e., disable ignore query string).</li>.
<Li>`Off`: disable full-path cache (i.e., enable ignore query string).</li>.
    */
    @SerializedName("FullURLCache")
    @Expose
    private String FullURLCache;

    /**
    * Whether to ignore case in the cache key. values:.
<Li>`On`: ignore;</li>.
<Li>`Off`: not ignore.</li>.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * Query string retention configuration parameter. this field and fullurlcache must be set simultaneously, but cannot both be `on`.
    */
    @SerializedName("QueryString")
    @Expose
    private CacheKeyQueryString QueryString;

    /**
     * Get Whether to enable full-path cache. values:.
<Li>`On`: enable full-path cache (i.e., disable ignore query string).</li>.
<Li>`Off`: disable full-path cache (i.e., enable ignore query string).</li>. 
     * @return FullURLCache Whether to enable full-path cache. values:.
<Li>`On`: enable full-path cache (i.e., disable ignore query string).</li>.
<Li>`Off`: disable full-path cache (i.e., enable ignore query string).</li>.
     */
    public String getFullURLCache() {
        return this.FullURLCache;
    }

    /**
     * Set Whether to enable full-path cache. values:.
<Li>`On`: enable full-path cache (i.e., disable ignore query string).</li>.
<Li>`Off`: disable full-path cache (i.e., enable ignore query string).</li>.
     * @param FullURLCache Whether to enable full-path cache. values:.
<Li>`On`: enable full-path cache (i.e., disable ignore query string).</li>.
<Li>`Off`: disable full-path cache (i.e., enable ignore query string).</li>.
     */
    public void setFullURLCache(String FullURLCache) {
        this.FullURLCache = FullURLCache;
    }

    /**
     * Get Whether to ignore case in the cache key. values:.
<Li>`On`: ignore;</li>.
<Li>`Off`: not ignore.</li>. 
     * @return IgnoreCase Whether to ignore case in the cache key. values:.
<Li>`On`: ignore;</li>.
<Li>`Off`: not ignore.</li>.
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether to ignore case in the cache key. values:.
<Li>`On`: ignore;</li>.
<Li>`Off`: not ignore.</li>.
     * @param IgnoreCase Whether to ignore case in the cache key. values:.
<Li>`On`: ignore;</li>.
<Li>`Off`: not ignore.</li>.
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get Query string retention configuration parameter. this field and fullurlcache must be set simultaneously, but cannot both be `on`. 
     * @return QueryString Query string retention configuration parameter. this field and fullurlcache must be set simultaneously, but cannot both be `on`.
     */
    public CacheKeyQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Query string retention configuration parameter. this field and fullurlcache must be set simultaneously, but cannot both be `on`.
     * @param QueryString Query string retention configuration parameter. this field and fullurlcache must be set simultaneously, but cannot both be `on`.
     */
    public void setQueryString(CacheKeyQueryString QueryString) {
        this.QueryString = QueryString;
    }

    public CacheKeyConfigParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyConfigParameters(CacheKeyConfigParameters source) {
        if (source.FullURLCache != null) {
            this.FullURLCache = new String(source.FullURLCache);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.QueryString != null) {
            this.QueryString = new CacheKeyQueryString(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullURLCache", this.FullURLCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);

    }
}

