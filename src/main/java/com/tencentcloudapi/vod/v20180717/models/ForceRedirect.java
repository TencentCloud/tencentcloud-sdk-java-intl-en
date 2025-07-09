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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForceRedirect extends AbstractModel {

    /**
    * Access forced jump configuration switch, value: <li>on: on; </li> <li>off: off. </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Access forced jump type: <li>http: forced http jump</li> <li>https: forced https jump</li>
    */
    @SerializedName("RedirectType")
    @Expose
    private String RedirectType;

    /**
    * Status code returned for forced redirect Supports 301, 302.
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
    * Whether to return the newly added header during force redirection.
    */
    @SerializedName("CarryHeaders")
    @Expose
    private String CarryHeaders;

    /**
     * Get Access forced jump configuration switch, value: <li>on: on; </li> <li>off: off. </li> 
     * @return Switch Access forced jump configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Access forced jump configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     * @param Switch Access forced jump configuration switch, value: <li>on: on; </li> <li>off: off. </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Access forced jump type: <li>http: forced http jump</li> <li>https: forced https jump</li> 
     * @return RedirectType Access forced jump type: <li>http: forced http jump</li> <li>https: forced https jump</li>
     */
    public String getRedirectType() {
        return this.RedirectType;
    }

    /**
     * Set Access forced jump type: <li>http: forced http jump</li> <li>https: forced https jump</li>
     * @param RedirectType Access forced jump type: <li>http: forced http jump</li> <li>https: forced https jump</li>
     */
    public void setRedirectType(String RedirectType) {
        this.RedirectType = RedirectType;
    }

    /**
     * Get Status code returned for forced redirect Supports 301, 302. 
     * @return RedirectStatusCode Status code returned for forced redirect Supports 301, 302.
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set Status code returned for forced redirect Supports 301, 302.
     * @param RedirectStatusCode Status code returned for forced redirect Supports 301, 302.
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Get Whether to return the newly added header during force redirection. 
     * @return CarryHeaders Whether to return the newly added header during force redirection.
     */
    public String getCarryHeaders() {
        return this.CarryHeaders;
    }

    /**
     * Set Whether to return the newly added header during force redirection.
     * @param CarryHeaders Whether to return the newly added header during force redirection.
     */
    public void setCarryHeaders(String CarryHeaders) {
        this.CarryHeaders = CarryHeaders;
    }

    public ForceRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceRedirect(ForceRedirect source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RedirectType != null) {
            this.RedirectType = new String(source.RedirectType);
        }
        if (source.RedirectStatusCode != null) {
            this.RedirectStatusCode = new Long(source.RedirectStatusCode);
        }
        if (source.CarryHeaders != null) {
            this.CarryHeaders = new String(source.CarryHeaders);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectType", this.RedirectType);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);
        this.setParamSimple(map, prefix + "CarryHeaders", this.CarryHeaders);

    }
}

