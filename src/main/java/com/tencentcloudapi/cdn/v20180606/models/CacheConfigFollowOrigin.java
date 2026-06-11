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
    * Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginMtimeCheckType")
    @Expose
    private String OriginMtimeCheckType;

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

    /**
     * Get Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginMtimeCheckType Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginMtimeCheckType() {
        return this.OriginMtimeCheckType;
    }

    /**
     * Set Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginMtimeCheckType Whether to enable origin server mtime verification after cache expires. valid values: equal, since, none, and null. default value: equal, which validates the origin server file's mtime and length. domains created prior to 2024-09-12 18:00 default to null, with behavior remaining unchanged.
equal: the mtime in the origin server response must match the mtime in the cache. if there is a difference in parameter values, purge the cache.
since: purges cache if the origin server response mtime is larger than the cache mtime.
none: when the cache expires and the file is retrieved from the origin server again to get the mtime and Length, it does not validate the mtime in the origin response. if the origin response carries a Content-Length header, the cache is updated only when the file size changes. if the origin response does not carry a Content-Length header, the cache is updated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginMtimeCheckType(String OriginMtimeCheckType) {
        this.OriginMtimeCheckType = OriginMtimeCheckType;
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
        if (source.OriginMtimeCheckType != null) {
            this.OriginMtimeCheckType = new String(source.OriginMtimeCheckType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "HeuristicCache.", this.HeuristicCache);
        this.setParamSimple(map, prefix + "OriginMtimeCheckType", this.OriginMtimeCheckType);

    }
}

