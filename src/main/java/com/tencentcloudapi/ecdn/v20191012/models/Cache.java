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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cache extends AbstractModel{

    /**
    * Caching configuration rule array.
    */
    @SerializedName("CacheRules")
    @Expose
    private CacheRule [] CacheRules;

    /**
    * Whether to follow the `Cache-Control: max-age` configuration on the origin server (this feature is only available to users on the allowlist).
on: enable
off: disable
If it is enabled, resources that do not match `CacheRules` will be cached on node according to the `max-age` value returned by the origin server, while resources that match `CacheRules` will be cached on node according to the cache expiration time set in `CacheRules`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
     * Get Caching configuration rule array. 
     * @return CacheRules Caching configuration rule array.
     */
    public CacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set Caching configuration rule array.
     * @param CacheRules Caching configuration rule array.
     */
    public void setCacheRules(CacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Get Whether to follow the `Cache-Control: max-age` configuration on the origin server (this feature is only available to users on the allowlist).
on: enable
off: disable
If it is enabled, resources that do not match `CacheRules` will be cached on node according to the `max-age` value returned by the origin server, while resources that match `CacheRules` will be cached on node according to the cache expiration time set in `CacheRules`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FollowOrigin Whether to follow the `Cache-Control: max-age` configuration on the origin server (this feature is only available to users on the allowlist).
on: enable
off: disable
If it is enabled, resources that do not match `CacheRules` will be cached on node according to the `max-age` value returned by the origin server, while resources that match `CacheRules` will be cached on node according to the cache expiration time set in `CacheRules`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Whether to follow the `Cache-Control: max-age` configuration on the origin server (this feature is only available to users on the allowlist).
on: enable
off: disable
If it is enabled, resources that do not match `CacheRules` will be cached on node according to the `max-age` value returned by the origin server, while resources that match `CacheRules` will be cached on node according to the cache expiration time set in `CacheRules`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FollowOrigin Whether to follow the `Cache-Control: max-age` configuration on the origin server (this feature is only available to users on the allowlist).
on: enable
off: disable
If it is enabled, resources that do not match `CacheRules` will be cached on node according to the `max-age` value returned by the origin server, while resources that match `CacheRules` will be cached on node according to the cache expiration time set in `CacheRules`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public Cache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cache(Cache source) {
        if (source.CacheRules != null) {
            this.CacheRules = new CacheRule[source.CacheRules.length];
            for (int i = 0; i < source.CacheRules.length; i++) {
                this.CacheRules[i] = new CacheRule(source.CacheRules[i]);
            }
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);

    }
}

