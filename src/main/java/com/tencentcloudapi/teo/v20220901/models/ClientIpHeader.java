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

public class ClientIpHeader extends AbstractModel {

    /**
    * Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Name of the request header containing the client IP address for origin-pull. When Switch is on, this parameter is required. X-Forwarded-For is not allowed for this parameter.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Name of the request header containing the client IP address for origin-pull. When Switch is on, this parameter is required. X-Forwarded-For is not allowed for this parameter.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return HeaderName Name of the request header containing the client IP address for origin-pull. When Switch is on, this parameter is required. X-Forwarded-For is not allowed for this parameter.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set Name of the request header containing the client IP address for origin-pull. When Switch is on, this parameter is required. X-Forwarded-For is not allowed for this parameter.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param HeaderName Name of the request header containing the client IP address for origin-pull. When Switch is on, this parameter is required. X-Forwarded-For is not allowed for this parameter.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public ClientIpHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIpHeader(ClientIpHeader source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

