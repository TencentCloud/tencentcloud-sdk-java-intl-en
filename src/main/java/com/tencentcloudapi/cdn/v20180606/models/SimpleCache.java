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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleCache extends AbstractModel{

    /**
    * Cache expiration time rules
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheRules")
    @Expose
    private SimpleCacheRule [] CacheRules;

    /**
    * Follows origin server Cache-Control: max-age configurations
on: enabled
off: disabled
If this is enabled, resources that do not match CacheRules rules will be cached by the node according to the max-age value returned by the origin server. Resources that match CacheRules rules will be cached on the node according to the cache expiration time set in CacheRules.
This conflicts with CompareMaxAge. The two cannot be enabled at the same time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
    * Forced cache
on: enabled
off: disabled
This is disabled by default. If enabled, `no-store` and `no-cache` resources returned from the origin server will be cached according to CacheRules rules.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * Ignores the Set-Cookie header of the origin server
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
    * Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * Always forwards to the origin server for verification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Revalidate")
    @Expose
    private Revalidate Revalidate;

    /**
     * Get Cache expiration time rules
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheRules Cache expiration time rules
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SimpleCacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set Cache expiration time rules
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheRules Cache expiration time rules
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheRules(SimpleCacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Get Follows origin server Cache-Control: max-age configurations
on: enabled
off: disabled
If this is enabled, resources that do not match CacheRules rules will be cached by the node according to the max-age value returned by the origin server. Resources that match CacheRules rules will be cached on the node according to the cache expiration time set in CacheRules.
This conflicts with CompareMaxAge. The two cannot be enabled at the same time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FollowOrigin Follows origin server Cache-Control: max-age configurations
on: enabled
off: disabled
If this is enabled, resources that do not match CacheRules rules will be cached by the node according to the max-age value returned by the origin server. Resources that match CacheRules rules will be cached on the node according to the cache expiration time set in CacheRules.
This conflicts with CompareMaxAge. The two cannot be enabled at the same time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Follows origin server Cache-Control: max-age configurations
on: enabled
off: disabled
If this is enabled, resources that do not match CacheRules rules will be cached by the node according to the max-age value returned by the origin server. Resources that match CacheRules rules will be cached on the node according to the cache expiration time set in CacheRules.
This conflicts with CompareMaxAge. The two cannot be enabled at the same time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FollowOrigin Follows origin server Cache-Control: max-age configurations
on: enabled
off: disabled
If this is enabled, resources that do not match CacheRules rules will be cached by the node according to the max-age value returned by the origin server. Resources that match CacheRules rules will be cached on the node according to the cache expiration time set in CacheRules.
This conflicts with CompareMaxAge. The two cannot be enabled at the same time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get Forced cache
on: enabled
off: disabled
This is disabled by default. If enabled, `no-store` and `no-cache` resources returned from the origin server will be cached according to CacheRules rules.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreCacheControl Forced cache
on: enabled
off: disabled
This is disabled by default. If enabled, `no-store` and `no-cache` resources returned from the origin server will be cached according to CacheRules rules.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Forced cache
on: enabled
off: disabled
This is disabled by default. If enabled, `no-store` and `no-cache` resources returned from the origin server will be cached according to CacheRules rules.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IgnoreCacheControl Forced cache
on: enabled
off: disabled
This is disabled by default. If enabled, `no-store` and `no-cache` resources returned from the origin server will be cached according to CacheRules rules.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get Ignores the Set-Cookie header of the origin server
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreSetCookie Ignores the Set-Cookie header of the origin server
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set Ignores the Set-Cookie header of the origin server
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IgnoreSetCookie Ignores the Set-Cookie header of the origin server
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    /**
     * Get Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CompareMaxAge Advanced cache expiration configuration. If this is enabled, the max-age value returned by the origin server will be compared with the cache expiration time set in CacheRules, and the smallest value will be cached on the node.
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get Always forwards to the origin server for verification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Revalidate Always forwards to the origin server for verification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Revalidate getRevalidate() {
        return this.Revalidate;
    }

    /**
     * Set Always forwards to the origin server for verification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Revalidate Always forwards to the origin server for verification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRevalidate(Revalidate Revalidate) {
        this.Revalidate = Revalidate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);
        this.setParamSimple(map, prefix + "CompareMaxAge", this.CompareMaxAge);
        this.setParamObj(map, prefix + "Revalidate.", this.Revalidate);

    }
}

