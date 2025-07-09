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

public class CacheConfigParameters extends AbstractModel {

    /**
    * Follow origin server cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private FollowOrigin FollowOrigin;

    /**
    * No cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("NoCache")
    @Expose
    private NoCache NoCache;

    /**
    * Custom cache time configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CustomTime")
    @Expose
    private CacheConfigCustomTime CustomTime;

    /**
     * Get Follow origin server cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return FollowOrigin Follow origin server cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public FollowOrigin getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Follow origin server cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param FollowOrigin Follow origin server cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setFollowOrigin(FollowOrigin FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get No cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return NoCache No cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public NoCache getNoCache() {
        return this.NoCache;
    }

    /**
     * Set No cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param NoCache No cache configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setNoCache(NoCache NoCache) {
        this.NoCache = NoCache;
    }

    /**
     * Get Custom cache time configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return CustomTime Custom cache time configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public CacheConfigCustomTime getCustomTime() {
        return this.CustomTime;
    }

    /**
     * Set Custom cache time configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param CustomTime Custom cache time configuration. only one of followorigin, nocache, customtime can have switch set to on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCustomTime(CacheConfigCustomTime CustomTime) {
        this.CustomTime = CustomTime;
    }

    public CacheConfigParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigParameters(CacheConfigParameters source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new FollowOrigin(source.FollowOrigin);
        }
        if (source.NoCache != null) {
            this.NoCache = new NoCache(source.NoCache);
        }
        if (source.CustomTime != null) {
            this.CustomTime = new CacheConfigCustomTime(source.CustomTime);
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

