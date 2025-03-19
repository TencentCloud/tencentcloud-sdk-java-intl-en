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
    * Whether to cache when an origin server does not return the cache-control header. this field is required when switch is on; when switch is off, this field is not required and will be ineffective if filled. valid values:.
<Li>On: cache;</li>.
<Li>Off: do not cache.</li>.
    */
    @SerializedName("DefaultCache")
    @Expose
    private String DefaultCache;

    /**
    * Whether to use the default caching policy when an origin server does not return the cache-control header. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachetime is not 0, this field should be off. valid values:.
<Li>On: use the default caching policy.</li>.
<Li>Off: do not use the default caching policy.</li>.
    */
    @SerializedName("DefaultCacheStrategy")
    @Expose
    private String DefaultCacheStrategy;

    /**
    * The default cache time in seconds when an origin server does not return the cache-control header. the value ranges from 0 to 315360000. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachestrategy is on, this field should be 0.
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
     * Get Whether to cache when an origin server does not return the cache-control header. this field is required when switch is on; when switch is off, this field is not required and will be ineffective if filled. valid values:.
<Li>On: cache;</li>.
<Li>Off: do not cache.</li>. 
     * @return DefaultCache Whether to cache when an origin server does not return the cache-control header. this field is required when switch is on; when switch is off, this field is not required and will be ineffective if filled. valid values:.
<Li>On: cache;</li>.
<Li>Off: do not cache.</li>.
     */
    public String getDefaultCache() {
        return this.DefaultCache;
    }

    /**
     * Set Whether to cache when an origin server does not return the cache-control header. this field is required when switch is on; when switch is off, this field is not required and will be ineffective if filled. valid values:.
<Li>On: cache;</li>.
<Li>Off: do not cache.</li>.
     * @param DefaultCache Whether to cache when an origin server does not return the cache-control header. this field is required when switch is on; when switch is off, this field is not required and will be ineffective if filled. valid values:.
<Li>On: cache;</li>.
<Li>Off: do not cache.</li>.
     */
    public void setDefaultCache(String DefaultCache) {
        this.DefaultCache = DefaultCache;
    }

    /**
     * Get Whether to use the default caching policy when an origin server does not return the cache-control header. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachetime is not 0, this field should be off. valid values:.
<Li>On: use the default caching policy.</li>.
<Li>Off: do not use the default caching policy.</li>. 
     * @return DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the cache-control header. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachetime is not 0, this field should be off. valid values:.
<Li>On: use the default caching policy.</li>.
<Li>Off: do not use the default caching policy.</li>.
     */
    public String getDefaultCacheStrategy() {
        return this.DefaultCacheStrategy;
    }

    /**
     * Set Whether to use the default caching policy when an origin server does not return the cache-control header. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachetime is not 0, this field should be off. valid values:.
<Li>On: use the default caching policy.</li>.
<Li>Off: do not use the default caching policy.</li>.
     * @param DefaultCacheStrategy Whether to use the default caching policy when an origin server does not return the cache-control header. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachetime is not 0, this field should be off. valid values:.
<Li>On: use the default caching policy.</li>.
<Li>Off: do not use the default caching policy.</li>.
     */
    public void setDefaultCacheStrategy(String DefaultCacheStrategy) {
        this.DefaultCacheStrategy = DefaultCacheStrategy;
    }

    /**
     * Get The default cache time in seconds when an origin server does not return the cache-control header. the value ranges from 0 to 315360000. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachestrategy is on, this field should be 0. 
     * @return DefaultCacheTime The default cache time in seconds when an origin server does not return the cache-control header. the value ranges from 0 to 315360000. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachestrategy is on, this field should be 0.
     */
    public Long getDefaultCacheTime() {
        return this.DefaultCacheTime;
    }

    /**
     * Set The default cache time in seconds when an origin server does not return the cache-control header. the value ranges from 0 to 315360000. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachestrategy is on, this field should be 0.
     * @param DefaultCacheTime The default cache time in seconds when an origin server does not return the cache-control header. the value ranges from 0 to 315360000. this field is required when defaultcache is set to on; otherwise, it is ineffective. when defaultcachestrategy is on, this field should be 0.
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

