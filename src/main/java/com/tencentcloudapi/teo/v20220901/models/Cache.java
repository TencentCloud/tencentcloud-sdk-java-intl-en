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

public class Cache extends AbstractModel {

    /**
    * Cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache expiration time settings.
Unit: seconds. Maximum settable to 365 days.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * Whether to enable forced caching. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
     * Get Cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Cache configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache expiration time settings.
Unit: seconds. Maximum settable to 365 days. 
     * @return CacheTime Cache expiration time settings.
Unit: seconds. Maximum settable to 365 days.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time settings.
Unit: seconds. Maximum settable to 365 days.
     * @param CacheTime Cache expiration time settings.
Unit: seconds. Maximum settable to 365 days.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Whether to enable forced caching. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return IgnoreCacheControl Whether to enable forced caching. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @deprecated
     */
    @Deprecated
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Whether to enable forced caching. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param IgnoreCacheControl Whether to enable forced caching. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @deprecated
     */
    @Deprecated
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    public Cache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cache(Cache source) {
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

