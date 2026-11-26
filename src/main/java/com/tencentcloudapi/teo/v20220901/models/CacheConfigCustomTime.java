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

public class CacheConfigCustomTime extends AbstractModel {

    /**
    * Custom cache time switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom cache time value, in seconds. Value range: 0-315360000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Custom cache time switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Custom cache time switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Custom cache time switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Custom cache time switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom cache time value, in seconds. Value range: 0-315360000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. 
     * @return CacheTime Custom cache time value, in seconds. Value range: 0-315360000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Custom cache time value, in seconds. Value range: 0-315360000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     * @param CacheTime Custom cache time value, in seconds. Value range: 0-315360000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public CacheConfigCustomTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigCustomTime(CacheConfigCustomTime source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

