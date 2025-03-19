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

public class WebSocketParameters extends AbstractModel {

    /**
    * Whether to enable websocket connection timeout. values:.
<Li>On: use timeout as the websocket timeout;</li>.
<Li>Off: the platform still supports websocket connections, using the system default timeout of 15 seconds.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Timeout, unit: seconds. maximum timeout is 120 seconds.<br>note: this field is required when switch is on; otherwise, this field will not take effect.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Whether to enable websocket connection timeout. values:.
<Li>On: use timeout as the websocket timeout;</li>.
<Li>Off: the platform still supports websocket connections, using the system default timeout of 15 seconds.</li>. 
     * @return Switch Whether to enable websocket connection timeout. values:.
<Li>On: use timeout as the websocket timeout;</li>.
<Li>Off: the platform still supports websocket connections, using the system default timeout of 15 seconds.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable websocket connection timeout. values:.
<Li>On: use timeout as the websocket timeout;</li>.
<Li>Off: the platform still supports websocket connections, using the system default timeout of 15 seconds.</li>.
     * @param Switch Whether to enable websocket connection timeout. values:.
<Li>On: use timeout as the websocket timeout;</li>.
<Li>Off: the platform still supports websocket connections, using the system default timeout of 15 seconds.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Timeout, unit: seconds. maximum timeout is 120 seconds.<br>note: this field is required when switch is on; otherwise, this field will not take effect. 
     * @return Timeout Timeout, unit: seconds. maximum timeout is 120 seconds.<br>note: this field is required when switch is on; otherwise, this field will not take effect.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout, unit: seconds. maximum timeout is 120 seconds.<br>note: this field is required when switch is on; otherwise, this field will not take effect.
     * @param Timeout Timeout, unit: seconds. maximum timeout is 120 seconds.<br>note: this field is required when switch is on; otherwise, this field will not take effect.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public WebSocketParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSocketParameters(WebSocketParameters source) {
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

