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

public class UpstreamFollowRedirectParameters extends AbstractModel {

    /**
    * Configuration switch for origin-pull follow redirect. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Maximum number of redirects. Value range: 1-5.
Note: This field is required when Switch is on. When Switch is off, no need to specify this field. If specified, it does not take effect.
    */
    @SerializedName("MaxTimes")
    @Expose
    private Long MaxTimes;

    /**
     * Get Configuration switch for origin-pull follow redirect. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Configuration switch for origin-pull follow redirect. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Configuration switch for origin-pull follow redirect. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Configuration switch for origin-pull follow redirect. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Maximum number of redirects. Value range: 1-5.
Note: This field is required when Switch is on. When Switch is off, no need to specify this field. If specified, it does not take effect. 
     * @return MaxTimes Maximum number of redirects. Value range: 1-5.
Note: This field is required when Switch is on. When Switch is off, no need to specify this field. If specified, it does not take effect.
     */
    public Long getMaxTimes() {
        return this.MaxTimes;
    }

    /**
     * Set Maximum number of redirects. Value range: 1-5.
Note: This field is required when Switch is on. When Switch is off, no need to specify this field. If specified, it does not take effect.
     * @param MaxTimes Maximum number of redirects. Value range: 1-5.
Note: This field is required when Switch is on. When Switch is off, no need to specify this field. If specified, it does not take effect.
     */
    public void setMaxTimes(Long MaxTimes) {
        this.MaxTimes = MaxTimes;
    }

    public UpstreamFollowRedirectParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamFollowRedirectParameters(UpstreamFollowRedirectParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxTimes != null) {
            this.MaxTimes = new Long(source.MaxTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxTimes", this.MaxTimes);

    }
}

