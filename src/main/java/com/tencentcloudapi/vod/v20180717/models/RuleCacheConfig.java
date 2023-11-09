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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCacheConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfigCache Cache;

    /**
    * 
    */
    @SerializedName("NoCache")
    @Expose
    private CacheConfigNoCache NoCache;

    /**
    * 
    */
    @SerializedName("FollowOrigin")
    @Expose
    private CacheConfigFollowOrigin FollowOrigin;

    /**
     * Get  
     * @return Cache 
     */
    public CacheConfigCache getCache() {
        return this.Cache;
    }

    /**
     * Set 
     * @param Cache 
     */
    public void setCache(CacheConfigCache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get  
     * @return NoCache 
     */
    public CacheConfigNoCache getNoCache() {
        return this.NoCache;
    }

    /**
     * Set 
     * @param NoCache 
     */
    public void setNoCache(CacheConfigNoCache NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get  
     * @return FollowOrigin 
     */
    public CacheConfigFollowOrigin getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 
     * @param FollowOrigin 
     */
    public void setFollowOrigin(CacheConfigFollowOrigin FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public RuleCacheConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCacheConfig(RuleCacheConfig source) {
        if (source.Cache != null) {
            this.Cache = new CacheConfigCache(source.Cache);
        }
        if (source.NoCache != null) {
            this.NoCache = new CacheConfigNoCache(source.NoCache);
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new CacheConfigFollowOrigin(source.FollowOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "NoCache.", this.NoCache);
        this.setParamObj(map, prefix + "FollowOrigin.", this.FollowOrigin);

    }
}

