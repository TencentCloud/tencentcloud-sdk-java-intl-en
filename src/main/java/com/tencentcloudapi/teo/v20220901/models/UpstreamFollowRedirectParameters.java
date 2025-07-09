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
    * Whether to enable origin-pull to follow the redirection configuration. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The maximum number of redirects. value range: 1-5.
Note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("MaxTimes")
    @Expose
    private Long MaxTimes;

    /**
     * Get Whether to enable origin-pull to follow the redirection configuration. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable origin-pull to follow the redirection configuration. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable origin-pull to follow the redirection configuration. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable origin-pull to follow the redirection configuration. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The maximum number of redirects. value range: 1-5.
Note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled. 
     * @return MaxTimes The maximum number of redirects. value range: 1-5.
Note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public Long getMaxTimes() {
        return this.MaxTimes;
    }

    /**
     * Set The maximum number of redirects. value range: 1-5.
Note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     * @param MaxTimes The maximum number of redirects. value range: 1-5.
Note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
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

