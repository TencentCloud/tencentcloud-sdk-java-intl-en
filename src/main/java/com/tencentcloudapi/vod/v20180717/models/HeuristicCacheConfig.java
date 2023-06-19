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

public class HeuristicCacheConfig extends AbstractModel{

    /**
    * Heuristic cache configuration switch:<li>on:Enable.</li> <li>off: Disable.</li>
    */
    @SerializedName("HeuristicCacheTimeSwitch")
    @Expose
    private String HeuristicCacheTimeSwitch;

    /**
    * Unit: seconds.
    */
    @SerializedName("HeuristicCacheTime")
    @Expose
    private Long HeuristicCacheTime;

    /**
     * Get Heuristic cache configuration switch:<li>on:Enable.</li> <li>off: Disable.</li> 
     * @return HeuristicCacheTimeSwitch Heuristic cache configuration switch:<li>on:Enable.</li> <li>off: Disable.</li>
     */
    public String getHeuristicCacheTimeSwitch() {
        return this.HeuristicCacheTimeSwitch;
    }

    /**
     * Set Heuristic cache configuration switch:<li>on:Enable.</li> <li>off: Disable.</li>
     * @param HeuristicCacheTimeSwitch Heuristic cache configuration switch:<li>on:Enable.</li> <li>off: Disable.</li>
     */
    public void setHeuristicCacheTimeSwitch(String HeuristicCacheTimeSwitch) {
        this.HeuristicCacheTimeSwitch = HeuristicCacheTimeSwitch;
    }

    /**
     * Get Unit: seconds. 
     * @return HeuristicCacheTime Unit: seconds.
     */
    public Long getHeuristicCacheTime() {
        return this.HeuristicCacheTime;
    }

    /**
     * Set Unit: seconds.
     * @param HeuristicCacheTime Unit: seconds.
     */
    public void setHeuristicCacheTime(Long HeuristicCacheTime) {
        this.HeuristicCacheTime = HeuristicCacheTime;
    }

    public HeuristicCacheConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeuristicCacheConfig(HeuristicCacheConfig source) {
        if (source.HeuristicCacheTimeSwitch != null) {
            this.HeuristicCacheTimeSwitch = new String(source.HeuristicCacheTimeSwitch);
        }
        if (source.HeuristicCacheTime != null) {
            this.HeuristicCacheTime = new Long(source.HeuristicCacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeuristicCacheTimeSwitch", this.HeuristicCacheTimeSwitch);
        this.setParamSimple(map, prefix + "HeuristicCacheTime", this.HeuristicCacheTime);

    }
}

