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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheInfo extends AbstractModel {

    /**
    * Cache cleanup time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * Cache cleanup schedule time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheClearTime")
    @Expose
    private String CacheClearTime;

    /**
    * Whether the cache has been cleaned up
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheCleared")
    @Expose
    private Boolean CacheCleared;

    /**
     * Get Cache cleanup time (hours)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheClearDelay Cache cleanup time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set Cache cleanup time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheClearDelay Cache cleanup time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get Cache cleanup schedule time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheClearTime Cache cleanup schedule time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCacheClearTime() {
        return this.CacheClearTime;
    }

    /**
     * Set Cache cleanup schedule time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheClearTime Cache cleanup schedule time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheClearTime(String CacheClearTime) {
        this.CacheClearTime = CacheClearTime;
    }

    /**
     * Get Whether the cache has been cleaned up
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CacheCleared Whether the cache has been cleaned up
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCacheCleared() {
        return this.CacheCleared;
    }

    /**
     * Set Whether the cache has been cleaned up
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CacheCleared Whether the cache has been cleaned up
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheCleared(Boolean CacheCleared) {
        this.CacheCleared = CacheCleared;
    }

    public CacheInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheInfo(CacheInfo source) {
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.CacheClearTime != null) {
            this.CacheClearTime = new String(source.CacheClearTime);
        }
        if (source.CacheCleared != null) {
            this.CacheCleared = new Boolean(source.CacheCleared);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamSimple(map, prefix + "CacheClearTime", this.CacheClearTime);
        this.setParamSimple(map, prefix + "CacheCleared", this.CacheCleared);

    }
}

