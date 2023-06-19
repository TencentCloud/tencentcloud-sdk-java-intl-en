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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigFollowOrigin extends AbstractModel{

    /**
    * Follow origin server switch configuration: <li>on: Enable.</li> <li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Heuristic cache configuration
    */
    @SerializedName("HeuristicCache")
    @Expose
    private HeuristicCache HeuristicCache;

    /**
     * Get Follow origin server switch configuration: <li>on: Enable.</li> <li>off: Disable.</li> 
     * @return Switch Follow origin server switch configuration: <li>on: Enable.</li> <li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Follow origin server switch configuration: <li>on: Enable.</li> <li>off: Disable.</li>
     * @param Switch Follow origin server switch configuration: <li>on: Enable.</li> <li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Heuristic cache configuration 
     * @return HeuristicCache Heuristic cache configuration
     */
    public HeuristicCache getHeuristicCache() {
        return this.HeuristicCache;
    }

    /**
     * Set Heuristic cache configuration
     * @param HeuristicCache Heuristic cache configuration
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

