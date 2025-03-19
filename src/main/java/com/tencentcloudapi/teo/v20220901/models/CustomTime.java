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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomTime extends AbstractModel {

    /**
    * Custom cache time switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Ignore origin server cachecontrol switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Custom cache time switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Custom cache time switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Custom cache time switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Custom cache time switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Ignore origin server cachecontrol switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled. 
     * @return IgnoreCacheControl Ignore origin server cachecontrol switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set Ignore origin server cachecontrol switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     * @param IgnoreCacheControl Ignore origin server cachecontrol switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled. 
     * @return CacheTime Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     * @param CacheTime Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public CustomTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomTime(CustomTime source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

