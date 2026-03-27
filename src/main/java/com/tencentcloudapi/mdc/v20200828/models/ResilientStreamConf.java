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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResilientStreamConf extends AbstractModel {

    /**
    * Whether to enable delayed broadcast smooth stream delivery: true to enable, false to disable. It is disabled by default.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Delayed broadcast duration, in seconds. Supported range: 10 to 300 seconds.
    */
    @SerializedName("BufferTime")
    @Expose
    private Long BufferTime;

    /**
     * Get Whether to enable delayed broadcast smooth stream delivery: true to enable, false to disable. It is disabled by default. 
     * @return Enable Whether to enable delayed broadcast smooth stream delivery: true to enable, false to disable. It is disabled by default.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable delayed broadcast smooth stream delivery: true to enable, false to disable. It is disabled by default.
     * @param Enable Whether to enable delayed broadcast smooth stream delivery: true to enable, false to disable. It is disabled by default.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Delayed broadcast duration, in seconds. Supported range: 10 to 300 seconds. 
     * @return BufferTime Delayed broadcast duration, in seconds. Supported range: 10 to 300 seconds.
     */
    public Long getBufferTime() {
        return this.BufferTime;
    }

    /**
     * Set Delayed broadcast duration, in seconds. Supported range: 10 to 300 seconds.
     * @param BufferTime Delayed broadcast duration, in seconds. Supported range: 10 to 300 seconds.
     */
    public void setBufferTime(Long BufferTime) {
        this.BufferTime = BufferTime;
    }

    public ResilientStreamConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResilientStreamConf(ResilientStreamConf source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.BufferTime != null) {
            this.BufferTime = new Long(source.BufferTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "BufferTime", this.BufferTime);

    }
}

