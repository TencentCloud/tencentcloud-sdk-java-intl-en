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

public class CacheKey extends AbstractModel {

    /**
    * Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String)
`off`: Disable full-path cache (i.e., enable Ignore Query String)
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * Specifies whether the cache key is case sensitive
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
    private QueryStringKey QueryString;

    /**
    * Cookie contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cookie")
    @Expose
    private CookieKey Cookie;

    /**
    * Request header contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Header")
    @Expose
    private HeaderKey Header;

    /**
    * Custom string contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheTag")
    @Expose
    private CacheTagKey CacheTag;

    /**
    * Request protocol contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Scheme")
    @Expose
    private SchemeKey Scheme;

    /**
    * Path-specific cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KeyRules")
    @Expose
    private KeyRule [] KeyRules;

    /**
     * Get Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String)
`off`: Disable full-path cache (i.e., enable Ignore Query String) 
     * @return FullUrlCache Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String)
`off`: Disable full-path cache (i.e., enable Ignore Query String)
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String)
`off`: Disable full-path cache (i.e., enable Ignore Query String)
     * @param FullUrlCache Whether to enable full-path cache
`on`: Enable full-path cache (i.e., disable Ignore Query String)
`off`: Disable full-path cache (i.e., enable Ignore Query String)
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get Specifies whether the cache key is case sensitive
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IgnoreCase Specifies whether the cache key is case sensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Specifies whether the cache key is case sensitive
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IgnoreCase Specifies whether the cache key is case sensitive
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
    public QueryStringKey getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param QueryString Request parameter contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQueryString(QueryStringKey QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Cookie contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cookie Cookie contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CookieKey getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cookie Cookie contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCookie(CookieKey Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get Request header contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Header Request header contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public HeaderKey getHeader() {
        return this.Header;
    }

    /**
     * Set Request header contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Header Request header contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeader(HeaderKey Header) {
        this.Header = Header;
    }

    /**
     * Get Custom string contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheTag Custom string contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public CacheTagKey getCacheTag() {
        return this.CacheTag;
    }

    /**
     * Set Custom string contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheTag Custom string contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheTag(CacheTagKey CacheTag) {
        this.CacheTag = CacheTag;
    }

    /**
     * Get Request protocol contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Scheme Request protocol contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SchemeKey getScheme() {
        return this.Scheme;
    }

    /**
     * Set Request protocol contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Scheme Request protocol contained in `CacheKey`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setScheme(SchemeKey Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Path-specific cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return KeyRules Path-specific cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public KeyRule [] getKeyRules() {
        return this.KeyRules;
    }

    /**
     * Set Path-specific cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param KeyRules Path-specific cache key configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKeyRules(KeyRule [] KeyRules) {
        this.KeyRules = KeyRules;
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
            this.QueryString = new QueryStringKey(source.QueryString);
        }
        if (source.Cookie != null) {
            this.Cookie = new CookieKey(source.Cookie);
        }
        if (source.Header != null) {
            this.Header = new HeaderKey(source.Header);
        }
        if (source.CacheTag != null) {
            this.CacheTag = new CacheTagKey(source.CacheTag);
        }
        if (source.Scheme != null) {
            this.Scheme = new SchemeKey(source.Scheme);
        }
        if (source.KeyRules != null) {
            this.KeyRules = new KeyRule[source.KeyRules.length];
            for (int i = 0; i < source.KeyRules.length; i++) {
                this.KeyRules[i] = new KeyRule(source.KeyRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "CacheTag.", this.CacheTag);
        this.setParamObj(map, prefix + "Scheme.", this.Scheme);
        this.setParamArrayObj(map, prefix + "KeyRules.", this.KeyRules);

    }
}

