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

public class CacheConfig extends AbstractModel {

    /**
    * Whether to enable heuristic cache validity. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HeuristicCacheTimeSwitch")
    @Expose
    private String HeuristicCacheTimeSwitch;

    /**
    * Unit: Second
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HeuristicCacheTime")
    @Expose
    private Long HeuristicCacheTime;

    /**
     * Get Whether to enable heuristic cache validity. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return HeuristicCacheTimeSwitch Whether to enable heuristic cache validity. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getHeuristicCacheTimeSwitch() {
        return this.HeuristicCacheTimeSwitch;
    }

    /**
     * Set Whether to enable heuristic cache validity. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param HeuristicCacheTimeSwitch Whether to enable heuristic cache validity. Values:
`on`: Enable
`off`: Disable
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setHeuristicCacheTimeSwitch(String HeuristicCacheTimeSwitch) {
        this.HeuristicCacheTimeSwitch = HeuristicCacheTimeSwitch;
    }

    /**
     * Get Unit: Second
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return HeuristicCacheTime Unit: Second
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public Long getHeuristicCacheTime() {
        return this.HeuristicCacheTime;
    }

    /**
     * Set Unit: Second
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param HeuristicCacheTime Unit: Second
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setHeuristicCacheTime(Long HeuristicCacheTime) {
        this.HeuristicCacheTime = HeuristicCacheTime;
    }

    public CacheConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfig(CacheConfig source) {
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

