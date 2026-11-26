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

public class CachePrefreshParameters extends AbstractModel {

    /**
    * Cache pre-refresh switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The pre-refresh time is set to a percentage value of the node cache time. Value range: 1–99.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field. If specified, it does not take effect.
    */
    @SerializedName("CacheTimePercent")
    @Expose
    private Long CacheTimePercent;

    /**
     * Get Cache pre-refresh switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Cache pre-refresh switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Cache pre-refresh switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Cache pre-refresh switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The pre-refresh time is set to a percentage value of the node cache time. Value range: 1–99.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field. If specified, it does not take effect. 
     * @return CacheTimePercent The pre-refresh time is set to a percentage value of the node cache time. Value range: 1–99.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field. If specified, it does not take effect.
     */
    public Long getCacheTimePercent() {
        return this.CacheTimePercent;
    }

    /**
     * Set The pre-refresh time is set to a percentage value of the node cache time. Value range: 1–99.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field. If specified, it does not take effect.
     * @param CacheTimePercent The pre-refresh time is set to a percentage value of the node cache time. Value range: 1–99.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field. If specified, it does not take effect.
     */
    public void setCacheTimePercent(Long CacheTimePercent) {
        this.CacheTimePercent = CacheTimePercent;
    }

    public CachePrefreshParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CachePrefreshParameters(CachePrefreshParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheTimePercent != null) {
            this.CacheTimePercent = new Long(source.CacheTimePercent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTimePercent", this.CacheTimePercent);

    }
}

