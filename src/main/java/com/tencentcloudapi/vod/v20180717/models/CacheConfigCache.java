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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigCache extends AbstractModel {

    /**
    * Path cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings. Unit: second. The maximum value is 365 days.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Advanced cache expiration configuration. When enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the minimum value will be used for node cache. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * Force cache. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * Whether to cache the Set-Cookie header and body on the node when the origin server returns the Set-Cookie header.
<li>on: Enable. Do not cache the header or body;</li>
<li>`off`: disabled, following user-defined node cache rules.</li>
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
     * Get Path cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Switch Path cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Path cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Switch Path cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings. Unit: second. The maximum value is 365 days. 
     * @return CacheTime Cache expiration time settings. Unit: second. The maximum value is 365 days.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings. Unit: second. The maximum value is 365 days.
     * @param CacheTime Cache expiration time settings. Unit: second. The maximum value is 365 days.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Advanced cache expiration configuration. When enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the minimum value will be used for node cache. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return CompareMaxAge Advanced cache expiration configuration. When enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the minimum value will be used for node cache. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set Advanced cache expiration configuration. When enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the minimum value will be used for node cache. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param CompareMaxAge Advanced cache expiration configuration. When enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the minimum value will be used for node cache. Valid values:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get Force cache. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return IgnoreCacheControl Force cache. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Force cache. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param IgnoreCacheControl Force cache. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get Whether to cache the Set-Cookie header and body on the node when the origin server returns the Set-Cookie header.
<li>on: Enable. Do not cache the header or body;</li>
<li>`off`: disabled, following user-defined node cache rules.</li> 
     * @return IgnoreSetCookie Whether to cache the Set-Cookie header and body on the node when the origin server returns the Set-Cookie header.
<li>on: Enable. Do not cache the header or body;</li>
<li>`off`: disabled, following user-defined node cache rules.</li>
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set Whether to cache the Set-Cookie header and body on the node when the origin server returns the Set-Cookie header.
<li>on: Enable. Do not cache the header or body;</li>
<li>`off`: disabled, following user-defined node cache rules.</li>
     * @param IgnoreSetCookie Whether to cache the Set-Cookie header and body on the node when the origin server returns the Set-Cookie header.
<li>on: Enable. Do not cache the header or body;</li>
<li>`off`: disabled, following user-defined node cache rules.</li>
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    public CacheConfigCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigCache(CacheConfigCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
        if (source.CompareMaxAge != null) {
            this.CompareMaxAge = new String(source.CompareMaxAge);
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
        if (source.IgnoreSetCookie != null) {
            this.IgnoreSetCookie = new String(source.IgnoreSetCookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamSimple(map, prefix + "CompareMaxAge", this.CompareMaxAge);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);

    }
}

