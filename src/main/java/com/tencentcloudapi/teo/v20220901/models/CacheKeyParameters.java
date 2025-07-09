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

public class CacheKeyParameters extends AbstractModel {

    /**
    * Switch for retaining the complete query string. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. this field and querystring.switch must be set simultaneously, but cannot both be on.
    */
    @SerializedName("FullURLCache")
    @Expose
    private String FullURLCache;

    /**
    * Configuration parameter for retaining the query string. this field and fullurlcache must be set simultaneously, but cannot both be on.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("QueryString")
    @Expose
    private CacheKeyQueryString QueryString;

    /**
    * Switch for ignoring case. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * HTTP request header configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Header")
    @Expose
    private CacheKeyHeader Header;

    /**
    * Request protocol switch. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Cookie configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Cookie")
    @Expose
    private CacheKeyCookie Cookie;

    /**
     * Get Switch for retaining the complete query string. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. this field and querystring.switch must be set simultaneously, but cannot both be on. 
     * @return FullURLCache Switch for retaining the complete query string. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. this field and querystring.switch must be set simultaneously, but cannot both be on.
     */
    public String getFullURLCache() {
        return this.FullURLCache;
    }

    /**
     * Set Switch for retaining the complete query string. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. this field and querystring.switch must be set simultaneously, but cannot both be on.
     * @param FullURLCache Switch for retaining the complete query string. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. this field and querystring.switch must be set simultaneously, but cannot both be on.
     */
    public void setFullURLCache(String FullURLCache) {
        this.FullURLCache = FullURLCache;
    }

    /**
     * Get Configuration parameter for retaining the query string. this field and fullurlcache must be set simultaneously, but cannot both be on.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return QueryString Configuration parameter for retaining the query string. this field and fullurlcache must be set simultaneously, but cannot both be on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheKeyQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Configuration parameter for retaining the query string. this field and fullurlcache must be set simultaneously, but cannot both be on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param QueryString Configuration parameter for retaining the query string. this field and fullurlcache must be set simultaneously, but cannot both be on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setQueryString(CacheKeyQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Switch for ignoring case. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. 
     * @return IgnoreCase Switch for ignoring case. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Switch for ignoring case. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     * @param IgnoreCase Switch for ignoring case. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get HTTP request header configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Header HTTP request header configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheKeyHeader getHeader() {
        return this.Header;
    }

    /**
     * Set HTTP request header configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Header HTTP request header configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHeader(CacheKeyHeader Header) {
        this.Header = Header;
    }

    /**
     * Get Request protocol switch. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured. 
     * @return Scheme Request protocol switch. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Request protocol switch. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     * @param Scheme Request protocol switch. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: at least one of fullurlcache, ignorecase, header, scheme, or cookie must be configured.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Cookie configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Cookie Cookie configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheKeyCookie getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Cookie Cookie configuration parameters. at least one of the following configurations must be set: fullurlcache, ignorecase, header, scheme, cookie.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCookie(CacheKeyCookie Cookie) {
        this.Cookie = Cookie;
    }

    public CacheKeyParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyParameters(CacheKeyParameters source) {
        if (source.FullURLCache != null) {
            this.FullURLCache = new String(source.FullURLCache);
        }
        if (source.QueryString != null) {
            this.QueryString = new CacheKeyQueryString(source.QueryString);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.Header != null) {
            this.Header = new CacheKeyHeader(source.Header);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Cookie != null) {
            this.Cookie = new CacheKeyCookie(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullURLCache", this.FullURLCache);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);

    }
}

