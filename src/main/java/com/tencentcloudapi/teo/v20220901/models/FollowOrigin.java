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

public class FollowOrigin extends AbstractModel {

    /**
    * Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on; otherwise, it is ineffective. Valid values:
<li>on: Cache.</li>
<li>off: Do not cache.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
    * Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheTime is not 0, this field should be off. Valid values:
<li>on: Use the default caching policy.</li>
<li>off: Do not use the default caching policy.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("DefaultCacheStrategy")
    @Expose
    private String DefaultCacheStrategy;

    /**
    * The default cache time in seconds when an origin server does not return the Cache-Control header. The value ranges from 0 to 315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field should be 0.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("DefaultCacheTime")
    @Expose
    private Long DefaultCacheTime;

    /**
     * Get Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable the configuration of following the origin server. Valid values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on; otherwise, it is ineffective. Valid values:
<li>on: Cache.</li>
<li>off: Do not cache.</li>
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return DefaultCache Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on; otherwise, it is ineffective. Valid values:
<li>on: Cache.</li>
<li>off: Do not cache.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on; otherwise, it is ineffective. Valid values:
<li>on: Cache.</li>
<li>off: Do not cache.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param DefaultCache Whether to cache when an origin server does not return the Cache-Control header. This field is required when Switch is on; otherwise, it is ineffective. Valid values:
<li>on: Cache.</li>
<li>off: Do not cache.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    /**
     * Get Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheTime is not 0, this field should be off. Valid values:
<li>on: Use the default caching policy.</li>
<li>off: Do not use the default caching policy.</li>
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheTime is not 0, this field should be off. Valid values:
<li>on: Use the default caching policy.</li>
<li>off: Do not use the default caching policy.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getDefaultCacheStrategy() {
        return this.DefaultCacheStrategy;
    }

    /**
     * Set Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheTime is not 0, this field should be off. Valid values:
<li>on: Use the default caching policy.</li>
<li>off: Do not use the default caching policy.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the Cache-Control header. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheTime is not 0, this field should be off. Valid values:
<li>on: Use the default caching policy.</li>
<li>off: Do not use the default caching policy.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setDefaultCacheStrategy(String DefaultCacheStrategy) {
        this.DefaultCacheStrategy = DefaultCacheStrategy;
    }

    /**
     * Get The default cache time in seconds when an origin server does not return the Cache-Control header. The value ranges from 0 to 315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field should be 0.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return DefaultCacheTime The default cache time in seconds when an origin server does not return the Cache-Control header. The value ranges from 0 to 315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field should be 0.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set The default cache time in seconds when an origin server does not return the Cache-Control header. The value ranges from 0 to 315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field should be 0.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param DefaultCacheTime The default cache time in seconds when an origin server does not return the Cache-Control header. The value ranges from 0 to 315360000. This field is required when DefaultCache is set to on; otherwise, it is ineffective. When DefaultCacheStrategy is on, this field should be 0.
Note: This field may return null, which indicates a failure to obtain a valid value.
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

