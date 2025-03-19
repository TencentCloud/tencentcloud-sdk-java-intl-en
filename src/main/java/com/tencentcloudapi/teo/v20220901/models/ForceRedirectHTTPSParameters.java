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

public class ForceRedirectHTTPSParameters extends AbstractModel {

    /**
    * Whether to enable forced redirect configuration switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Redirection status code. this field is required when switch is on; otherwise, it is not effective. valid values are:.
<Li>`301`: 301 redirect;</li>.
<Li>`302`: 302 redirect.</li>.
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
     * Get Whether to enable forced redirect configuration switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable forced redirect configuration switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable forced redirect configuration switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable forced redirect configuration switch. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Redirection status code. this field is required when switch is on; otherwise, it is not effective. valid values are:.
<Li>`301`: 301 redirect;</li>.
<Li>`302`: 302 redirect.</li>. 
     * @return RedirectStatusCode Redirection status code. this field is required when switch is on; otherwise, it is not effective. valid values are:.
<Li>`301`: 301 redirect;</li>.
<Li>`302`: 302 redirect.</li>.
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set Redirection status code. this field is required when switch is on; otherwise, it is not effective. valid values are:.
<Li>`301`: 301 redirect;</li>.
<Li>`302`: 302 redirect.</li>.
     * @param RedirectStatusCode Redirection status code. this field is required when switch is on; otherwise, it is not effective. valid values are:.
<Li>`301`: 301 redirect;</li>.
<Li>`302`: 302 redirect.</li>.
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

