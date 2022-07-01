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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigCache extends AbstractModel{

    /**
    * Cache configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Specifies whether to enable force cache
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
     * Get Cache configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Switch Cache configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Cache configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Switch Cache configuration switch
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CacheTime Cache expiration time settings
Unit: second. The maximum value is 365 days.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Specifies whether to enable force cache
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IgnoreCacheControl Specifies whether to enable force cache
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Specifies whether to enable force cache
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IgnoreCacheControl Specifies whether to enable force cache
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    public CacheConfigCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigCache(CacheConfigCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);

    }
}

