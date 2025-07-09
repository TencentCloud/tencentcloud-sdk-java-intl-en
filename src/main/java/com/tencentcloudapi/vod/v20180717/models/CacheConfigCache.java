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
    * Path cache configuration switch, the values u200bu200bare: <li>on: on; </li> <li>off: off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings<li>Unit: second. The maximum value is 365 days.</li>
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Advanced cache expiration configuration. When enabled, the max-age value returned by the origin site will be compared with the cache expiration time set in CacheRules, and the minimum value will be used to cache the node. Values: <li>on: enabled; </li> <li >off: off. </li>
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * Force caching, values: <li>on: on; </li> <li>off: off. </li>
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * When the origin site returns the Set-Cookie header, whether the node caches the header and body: <li>on: on, does not cache the header and body;</li> <li>off: off, follows user customization Node caching rules. </li>
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
     * Get Path cache configuration switch, the values u200bu200bare: <li>on: on; </li> <li>off: off. </li> 
     * @return Switch Path cache configuration switch, the values u200bu200bare: <li>on: on; </li> <li>off: off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Path cache configuration switch, the values u200bu200bare: <li>on: on; </li> <li>off: off. </li>
     * @param Switch Path cache configuration switch, the values u200bu200bare: <li>on: on; </li> <li>off: off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings<li>Unit: second. The maximum value is 365 days.</li> 
     * @return CacheTime Cache expiration time settings<li>Unit: second. The maximum value is 365 days.</li>
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings<li>Unit: second. The maximum value is 365 days.</li>
     * @param CacheTime Cache expiration time settings<li>Unit: second. The maximum value is 365 days.</li>
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Advanced cache expiration configuration. When enabled, the max-age value returned by the origin site will be compared with the cache expiration time set in CacheRules, and the minimum value will be used to cache the node. Values: <li>on: enabled; </li> <li >off: off. </li> 
     * @return CompareMaxAge Advanced cache expiration configuration. When enabled, the max-age value returned by the origin site will be compared with the cache expiration time set in CacheRules, and the minimum value will be used to cache the node. Values: <li>on: enabled; </li> <li >off: off. </li>
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set Advanced cache expiration configuration. When enabled, the max-age value returned by the origin site will be compared with the cache expiration time set in CacheRules, and the minimum value will be used to cache the node. Values: <li>on: enabled; </li> <li >off: off. </li>
     * @param CompareMaxAge Advanced cache expiration configuration. When enabled, the max-age value returned by the origin site will be compared with the cache expiration time set in CacheRules, and the minimum value will be used to cache the node. Values: <li>on: enabled; </li> <li >off: off. </li>
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get Force caching, values: <li>on: on; </li> <li>off: off. </li> 
     * @return IgnoreCacheControl Force caching, values: <li>on: on; </li> <li>off: off. </li>
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Force caching, values: <li>on: on; </li> <li>off: off. </li>
     * @param IgnoreCacheControl Force caching, values: <li>on: on; </li> <li>off: off. </li>
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get When the origin site returns the Set-Cookie header, whether the node caches the header and body: <li>on: on, does not cache the header and body;</li> <li>off: off, follows user customization Node caching rules. </li> 
     * @return IgnoreSetCookie When the origin site returns the Set-Cookie header, whether the node caches the header and body: <li>on: on, does not cache the header and body;</li> <li>off: off, follows user customization Node caching rules. </li>
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set When the origin site returns the Set-Cookie header, whether the node caches the header and body: <li>on: on, does not cache the header and body;</li> <li>off: off, follows user customization Node caching rules. </li>
     * @param IgnoreSetCookie When the origin site returns the Set-Cookie header, whether the node caches the header and body: <li>on: on, does not cache the header and body;</li> <li>off: off, follows user customization Node caching rules. </li>
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

