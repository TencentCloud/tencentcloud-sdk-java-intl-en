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

public class CacheConfigFollowOrigin extends AbstractModel {

    /**
    * Whether to follow the origin configuration for path cache. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Heuristic cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HeuristicCache")
    @Expose
    private HeuristicCache HeuristicCache;

    /**
     * Get Whether to follow the origin configuration for path cache. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to follow the origin configuration for path cache. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to follow the origin configuration for path cache. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to follow the origin configuration for path cache. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Heuristic cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HeuristicCache Heuristic cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public HeuristicCache getHeuristicCache() {
        return this.HeuristicCache;
    }

    /**
     * Set Heuristic cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HeuristicCache Heuristic cache configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeuristicCache(HeuristicCache HeuristicCache) {
        this.HeuristicCache = HeuristicCache;
    }

    public CacheConfigFollowOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigFollowOrigin(CacheConfigFollowOrigin source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeuristicCache != null) {
            this.HeuristicCache = new HeuristicCache(source.HeuristicCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "HeuristicCache.", this.HeuristicCache);

    }
}

