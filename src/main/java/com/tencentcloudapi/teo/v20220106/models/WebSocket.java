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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSocket extends AbstractModel{

    /**
    * Whether to enable custom WebSocket timeout setting. When it’s `off`: it means to keep the default WebSocket connection timeout period, which is 15 seconds. To change the timeout period, please set it to `on`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Sets timeout period in seconds. Maximum value: 120
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Whether to enable custom WebSocket timeout setting. When it’s `off`: it means to keep the default WebSocket connection timeout period, which is 15 seconds. To change the timeout period, please set it to `on`. 
     * @return Switch Whether to enable custom WebSocket timeout setting. When it’s `off`: it means to keep the default WebSocket connection timeout period, which is 15 seconds. To change the timeout period, please set it to `on`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable custom WebSocket timeout setting. When it’s `off`: it means to keep the default WebSocket connection timeout period, which is 15 seconds. To change the timeout period, please set it to `on`.
     * @param Switch Whether to enable custom WebSocket timeout setting. When it’s `off`: it means to keep the default WebSocket connection timeout period, which is 15 seconds. To change the timeout period, please set it to `on`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Sets timeout period in seconds. Maximum value: 120 
     * @return Timeout Sets timeout period in seconds. Maximum value: 120
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Sets timeout period in seconds. Maximum value: 120
     * @param Timeout Sets timeout period in seconds. Maximum value: 120
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

