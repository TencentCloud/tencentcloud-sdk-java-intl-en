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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTime extends AbstractModel {

    /**
    * Valid values:
<br><li> `Period`: periodic execution
<br><li> `Fixed`: scheduled execution
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Execution interval or scheduled time point in minutes. Value range: 1–1440.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
     * Get Valid values:
<br><li> `Period`: periodic execution
<br><li> `Fixed`: scheduled execution 
     * @return Type Valid values:
<br><li> `Period`: periodic execution
<br><li> `Fixed`: scheduled execution
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Valid values:
<br><li> `Period`: periodic execution
<br><li> `Fixed`: scheduled execution
     * @param Type Valid values:
<br><li> `Period`: periodic execution
<br><li> `Fixed`: scheduled execution
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Execution interval or scheduled time point in minutes. Value range: 1–1440. 
     * @return Time Execution interval or scheduled time point in minutes. Value range: 1–1440.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Execution interval or scheduled time point in minutes. Value range: 1–1440.
     * @param Time Execution interval or scheduled time point in minutes. Value range: 1–1440.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    public MonitorTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorTime(MonitorTime source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

