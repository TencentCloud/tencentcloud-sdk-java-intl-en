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

public class FollowOrigin extends AbstractModel {

    /**
    * Follow the origin site configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. Valid values:
<li>`on`: cache;</li>
<li>off: Do not cache.</li>
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
    * Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is on; otherwise, it is ineffective. This field must be off when DefaultCacheTime is not 0. Valid values:
<li>on: Use the default caching policy;</li>
<li>off: Do not use the default caching policy.</li>
    */
    @SerializedName("DefaultCacheStrategy")
    @Expose
    private String DefaultCacheStrategy;

    /**
    * The default cache time in seconds when an origin server does not return the Cache-Control header. Value range: 0-315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field must be 0.
    */
    @SerializedName("DefaultCacheTime")
    @Expose
    private Long DefaultCacheTime;

    /**
     * Get Follow the origin site configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Follow the origin site configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Follow the origin site configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Follow the origin site configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. Valid values:
<li>`on`: cache;</li>
<li>off: Do not cache.</li> 
     * @return DefaultCache Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. Valid values:
<li>`on`: cache;</li>
<li>off: Do not cache.</li>
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. Valid values:
<li>`on`: cache;</li>
<li>off: Do not cache.</li>
     * @param DefaultCache Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. Valid values:
<li>`on`: cache;</li>
<li>off: Do not cache.</li>
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    /**
     * Get Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is on; otherwise, it is ineffective. This field must be off when DefaultCacheTime is not 0. Valid values:
<li>on: Use the default caching policy;</li>
<li>off: Do not use the default caching policy.</li> 
     * @return DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is on; otherwise, it is ineffective. This field must be off when DefaultCacheTime is not 0. Valid values:
<li>on: Use the default caching policy;</li>
<li>off: Do not use the default caching policy.</li>
     */
    public String getDefaultCacheStrategy() {
        return this.DefaultCacheStrategy;
    }

    /**
     * Set Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is on; otherwise, it is ineffective. This field must be off when DefaultCacheTime is not 0. Valid values:
<li>on: Use the default caching policy;</li>
<li>off: Do not use the default caching policy.</li>
     * @param DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is on; otherwise, it is ineffective. This field must be off when DefaultCacheTime is not 0. Valid values:
<li>on: Use the default caching policy;</li>
<li>off: Do not use the default caching policy.</li>
     */
    public void setDefaultCacheStrategy(String DefaultCacheStrategy) {
        this.DefaultCacheStrategy = DefaultCacheStrategy;
    }

    /**
     * Get The default cache time in seconds when an origin server does not return the Cache-Control header. Value range: 0-315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field must be 0. 
     * @return DefaultCacheTime The default cache time in seconds when an origin server does not return the Cache-Control header. Value range: 0-315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field must be 0.
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set The default cache time in seconds when an origin server does not return the Cache-Control header. Value range: 0-315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field must be 0.
     * @param DefaultCacheTime The default cache time in seconds when an origin server does not return the Cache-Control header. Value range: 0-315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field must be 0.
     */
    public void setDefaultCacheTime(Long DefaultCacheTime) {
        this.DefaultCacheTime = DefaultCacheTime;
    }

    public FollowOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FollowOrigin(FollowOrigin source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.DefaultCache != null) {
            this.DefaultCache = new String(source.DefaultCache);
        }
        if (source.DefaultCacheStrategy != null) {
            this.DefaultCacheStrategy = new String(source.DefaultCacheStrategy);
        }
        if (source.DefaultCacheTime != null) {
            this.DefaultCacheTime = new Long(source.DefaultCacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "DefaultCache", this.DefaultCache);
        this.setParamSimple(map, prefix + "DefaultCacheStrategy", this.DefaultCacheStrategy);
        this.setParamSimple(map, prefix + "DefaultCacheTime", this.DefaultCacheTime);

    }
}

