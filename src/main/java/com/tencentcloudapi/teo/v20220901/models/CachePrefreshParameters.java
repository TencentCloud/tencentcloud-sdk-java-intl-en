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
    * Whether to enable cache prefresh. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Prefresh interval set as a percentage of the node cache time. value range: 1-99.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("CacheTimePercent")
    @Expose
    private Long CacheTimePercent;

    /**
     * Get Whether to enable cache prefresh. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable cache prefresh. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable cache prefresh. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable cache prefresh. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Prefresh interval set as a percentage of the node cache time. value range: 1-99.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled. 
     * @return CacheTimePercent Prefresh interval set as a percentage of the node cache time. value range: 1-99.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public Long getCacheTimePercent() {
        return this.CacheTimePercent;
    }

    /**
     * Set Prefresh interval set as a percentage of the node cache time. value range: 1-99.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     * @param CacheTimePercent Prefresh interval set as a percentage of the node cache time. value range: 1-99.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
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

