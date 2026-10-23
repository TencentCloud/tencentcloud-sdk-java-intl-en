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

public class CacheParameters extends AbstractModel {

    /**
    * Cache follows the origin site. Leave unset means this configuration is not set. FollowOrigin, NoCache, and CustomTime can only be configured with one Switch set to on.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private FollowOrigin FollowOrigin;

    /**
    * No cache. Leave unset means not setting this configuration. Only one Switch among FollowOrigin, NoCache, and CustomTime can be configured as on.
    */
    @SerializedName("NoCache")
    @Expose
    private NoCache NoCache;

    /**
    * Custom cache time. Leave unset means this configuration is not set. Only one of FollowOrigin, NoCache, and CustomTime can be configured with the Switch set to on.
    */
    @SerializedName("CustomTime")
    @Expose
    private CustomTime CustomTime;

    /**
     * Get Cache follows the origin site. Leave unset means this configuration is not set. FollowOrigin, NoCache, and CustomTime can only be configured with one Switch set to on. 
     * @return FollowOrigin Cache follows the origin site. Leave unset means this configuration is not set. FollowOrigin, NoCache, and CustomTime can only be configured with one Switch set to on.
     */
    public FollowOrigin getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Cache follows the origin site. Leave unset means this configuration is not set. FollowOrigin, NoCache, and CustomTime can only be configured with one Switch set to on.
     * @param FollowOrigin Cache follows the origin site. Leave unset means this configuration is not set. FollowOrigin, NoCache, and CustomTime can only be configured with one Switch set to on.
     */
    public void setFollowOrigin(FollowOrigin FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get No cache. Leave unset means not setting this configuration. Only one Switch among FollowOrigin, NoCache, and CustomTime can be configured as on. 
     * @return NoCache No cache. Leave unset means not setting this configuration. Only one Switch among FollowOrigin, NoCache, and CustomTime can be configured as on.
     */
    public NoCache getNoCache() {
        return this.NoCache;
    }

    /**
     * Set No cache. Leave unset means not setting this configuration. Only one Switch among FollowOrigin, NoCache, and CustomTime can be configured as on.
     * @param NoCache No cache. Leave unset means not setting this configuration. Only one Switch among FollowOrigin, NoCache, and CustomTime can be configured as on.
     */
    public void setNoCache(NoCache NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get Custom cache time. Leave unset means this configuration is not set. Only one of FollowOrigin, NoCache, and CustomTime can be configured with the Switch set to on. 
     * @return CustomTime Custom cache time. Leave unset means this configuration is not set. Only one of FollowOrigin, NoCache, and CustomTime can be configured with the Switch set to on.
     */
    public CustomTime getCustomTime() {
        return this.CustomTime;
    }

    /**
     * Set Custom cache time. Leave unset means this configuration is not set. Only one of FollowOrigin, NoCache, and CustomTime can be configured with the Switch set to on.
     * @param CustomTime Custom cache time. Leave unset means this configuration is not set. Only one of FollowOrigin, NoCache, and CustomTime can be configured with the Switch set to on.
     */
    public void setCustomTime(CustomTime CustomTime) {
        this.CustomTime = CustomTime;
    }

    public CacheParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheParameters(CacheParameters source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new FollowOrigin(source.FollowOrigin);
        }
        if (source.NoCache != null) {
            this.NoCache = new NoCache(source.NoCache);
        }
        if (source.CustomTime != null) {
            this.CustomTime = new CustomTime(source.CustomTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FollowOrigin.", this.FollowOrigin);
        this.setParamObj(map, prefix + "NoCache.", this.NoCache);
        this.setParamObj(map, prefix + "CustomTime.", this.CustomTime);

    }
}

