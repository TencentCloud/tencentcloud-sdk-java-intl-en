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

public class CacheConfigCache extends AbstractModel {

    /**
    * Whether to enable path cache. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
`on`: Enable
`off`: Disable
This is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * Force cache
`on`: Enable
`off`: Disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * Whether to ignore the header and body on cache nodes if the origin server returns the header `Set-Cookie`.
`on`: Ignore; do not cache the header and body.
`off`: Do not ignore; follow the custom cache rules of cache nodes.
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
    * Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginMtimeCheckType")
    @Expose
    private String OriginMtimeCheckType;

    /**
     * Get Whether to enable path cache. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable path cache. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable path cache. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Switch Whether to enable path cache. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
`on`: Enable
`off`: Disable
This is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
`on`: Enable
`off`: Disable
This is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
`on`: Enable
`off`: Disable
This is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
`on`: Enable
`off`: Disable
This is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get Force cache
`on`: Enable
`off`: Disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IgnoreCacheControl Force cache
`on`: Enable
`off`: Disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Force cache
`on`: Enable
`off`: Disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IgnoreCacheControl Force cache
`on`: Enable
`off`: Disable
This is disabled by default. If enabled, the `no-store` and `no-cache` resources returned from the origin server will be cached according to `CacheRules` rules.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get Whether to ignore the header and body on cache nodes if the origin server returns the header `Set-Cookie`.
`on`: Ignore; do not cache the header and body.
`off`: Do not ignore; follow the custom cache rules of cache nodes.
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IgnoreSetCookie Whether to ignore the header and body on cache nodes if the origin server returns the header `Set-Cookie`.
`on`: Ignore; do not cache the header and body.
`off`: Do not ignore; follow the custom cache rules of cache nodes.
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set Whether to ignore the header and body on cache nodes if the origin server returns the header `Set-Cookie`.
`on`: Ignore; do not cache the header and body.
`off`: Do not ignore; follow the custom cache rules of cache nodes.
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IgnoreSetCookie Whether to ignore the header and body on cache nodes if the origin server returns the header `Set-Cookie`.
`on`: Ignore; do not cache the header and body.
`off`: Do not ignore; follow the custom cache rules of cache nodes.
It is disabled by default.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    /**
     * Get Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginMtimeCheckType Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginMtimeCheckType() {
        return this.OriginMtimeCheckType;
    }

    /**
     * Set Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginMtimeCheckType Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginMtimeCheckType(String OriginMtimeCheckType) {
        this.OriginMtimeCheckType = OriginMtimeCheckType;
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
        if (source.OriginMtimeCheckType != null) {
            this.OriginMtimeCheckType = new String(source.OriginMtimeCheckType);
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
        this.setParamSimple(map, prefix + "OriginMtimeCheckType", this.OriginMtimeCheckType);

    }
}

