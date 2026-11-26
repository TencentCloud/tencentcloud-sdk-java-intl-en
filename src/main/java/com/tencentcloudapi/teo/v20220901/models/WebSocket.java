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

public class WebSocket extends AbstractModel {

    /**
    * WebSocket timeout configuration switch. Valid values:
<li>on: Use Timeout as the WebSocket timeout;</li>
<li>off: The platform still supports WebSocket connections, using the system default 15 seconds as the timeout period.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Timeout period in seconds. Maximum timeout time: 120 seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get WebSocket timeout configuration switch. Valid values:
<li>on: Use Timeout as the WebSocket timeout;</li>
<li>off: The platform still supports WebSocket connections, using the system default 15 seconds as the timeout period.</li> 
     * @return Switch WebSocket timeout configuration switch. Valid values:
<li>on: Use Timeout as the WebSocket timeout;</li>
<li>off: The platform still supports WebSocket connections, using the system default 15 seconds as the timeout period.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set WebSocket timeout configuration switch. Valid values:
<li>on: Use Timeout as the WebSocket timeout;</li>
<li>off: The platform still supports WebSocket connections, using the system default 15 seconds as the timeout period.</li>
     * @param Switch WebSocket timeout configuration switch. Valid values:
<li>on: Use Timeout as the WebSocket timeout;</li>
<li>off: The platform still supports WebSocket connections, using the system default 15 seconds as the timeout period.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Timeout period in seconds. Maximum timeout time: 120 seconds. 
     * @return Timeout Timeout period in seconds. Maximum timeout time: 120 seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in seconds. Maximum timeout time: 120 seconds.
     * @param Timeout Timeout period in seconds. Maximum timeout time: 120 seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public WebSocket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSocket(WebSocket source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

