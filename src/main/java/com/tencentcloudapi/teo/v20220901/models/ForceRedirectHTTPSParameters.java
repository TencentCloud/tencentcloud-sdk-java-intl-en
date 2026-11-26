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

public class ForceRedirectHTTPSParameters extends AbstractModel {

    /**
    * Access forced redirect configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Redirection status code. When Switch is on, this field is required; otherwise, it is ineffective. Valid values:
<li>301: 301 redirect;</li>
<li>302: 302 redirection.</li>
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
     * Get Access forced redirect configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Access forced redirect configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Access forced redirect configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Access forced redirect configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Redirection status code. When Switch is on, this field is required; otherwise, it is ineffective. Valid values:
<li>301: 301 redirect;</li>
<li>302: 302 redirection.</li> 
     * @return RedirectStatusCode Redirection status code. When Switch is on, this field is required; otherwise, it is ineffective. Valid values:
<li>301: 301 redirect;</li>
<li>302: 302 redirection.</li>
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set Redirection status code. When Switch is on, this field is required; otherwise, it is ineffective. Valid values:
<li>301: 301 redirect;</li>
<li>302: 302 redirection.</li>
     * @param RedirectStatusCode Redirection status code. When Switch is on, this field is required; otherwise, it is ineffective. Valid values:
<li>301: 301 redirect;</li>
<li>302: 302 redirection.</li>
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    public ForceRedirectHTTPSParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceRedirectHTTPSParameters(ForceRedirectHTTPSParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RedirectStatusCode != null) {
            this.RedirectStatusCode = new Long(source.RedirectStatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);

    }
}

