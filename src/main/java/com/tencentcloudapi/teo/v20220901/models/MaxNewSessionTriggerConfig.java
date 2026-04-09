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

public class MaxNewSessionTriggerConfig extends AbstractModel {

    /**
    * Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
    */
    @SerializedName("MaxNewSessionCountInterval")
    @Expose
    private String MaxNewSessionCountInterval;

    /**
    * Trigger threshold cumulative count. value range: 1-100000000.
    */
    @SerializedName("MaxNewSessionCountThreshold")
    @Expose
    private Long MaxNewSessionCountThreshold;

    /**
     * Get Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>. 
     * @return MaxNewSessionCountInterval Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     */
    public String getMaxNewSessionCountInterval() {
        return this.MaxNewSessionCountInterval;
    }

    /**
     * Set Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     * @param MaxNewSessionCountInterval Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     */
    public void setMaxNewSessionCountInterval(String MaxNewSessionCountInterval) {
        this.MaxNewSessionCountInterval = MaxNewSessionCountInterval;
    }

    /**
     * Get Trigger threshold cumulative count. value range: 1-100000000. 
     * @return MaxNewSessionCountThreshold Trigger threshold cumulative count. value range: 1-100000000.
     */
    public Long getMaxNewSessionCountThreshold() {
        return this.MaxNewSessionCountThreshold;
    }

    /**
     * Set Trigger threshold cumulative count. value range: 1-100000000.
     * @param MaxNewSessionCountThreshold Trigger threshold cumulative count. value range: 1-100000000.
     */
    public void setMaxNewSessionCountThreshold(Long MaxNewSessionCountThreshold) {
        this.MaxNewSessionCountThreshold = MaxNewSessionCountThreshold;
    }

    public MaxNewSessionTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxNewSessionTriggerConfig(MaxNewSessionTriggerConfig source) {
        if (source.MaxNewSessionCountInterval != null) {
            this.MaxNewSessionCountInterval = new String(source.MaxNewSessionCountInterval);
        }
        if (source.MaxNewSessionCountThreshold != null) {
            this.MaxNewSessionCountThreshold = new Long(source.MaxNewSessionCountThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxNewSessionCountInterval", this.MaxNewSessionCountInterval);
        this.setParamSimple(map, prefix + "MaxNewSessionCountThreshold", this.MaxNewSessionCountThreshold);

    }
}

