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

public class StatusCodeCache extends AbstractModel {

    /**
    * Whether to enable status code caching. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Status code cache expiration rules details
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheRules")
    @Expose
    private StatusCodeCacheRule [] CacheRules;

    /**
     * Get Whether to enable status code caching. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable status code caching. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable status code caching. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Switch Whether to enable status code caching. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Status code cache expiration rules details
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheRules Status code cache expiration rules details
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public StatusCodeCacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set Status code cache expiration rules details
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheRules Status code cache expiration rules details
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheRules(StatusCodeCacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    public StatusCodeCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusCodeCache(StatusCodeCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheRules != null) {
            this.CacheRules = new StatusCodeCacheRule[source.CacheRules.length];
            for (int i = 0; i < source.CacheRules.length; i++) {
                this.CacheRules[i] = new StatusCodeCacheRule(source.CacheRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);

    }
}

