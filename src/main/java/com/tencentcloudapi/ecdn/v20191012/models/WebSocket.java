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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebSocket extends AbstractModel{

    /**
    * WebSocket configuration switch, which can be `on` or `off`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Sets timeout period in seconds. Maximum value: 65
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get WebSocket configuration switch, which can be `on` or `off`. 
     * @return Switch WebSocket configuration switch, which can be `on` or `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set WebSocket configuration switch, which can be `on` or `off`.
     * @param Switch WebSocket configuration switch, which can be `on` or `off`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Sets timeout period in seconds. Maximum value: 65
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Timeout Sets timeout period in seconds. Maximum value: 65
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Sets timeout period in seconds. Maximum value: 65
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Timeout Sets timeout period in seconds. Maximum value: 65
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

