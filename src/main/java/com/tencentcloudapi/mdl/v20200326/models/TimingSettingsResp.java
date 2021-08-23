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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingSettingsResp extends AbstractModel{

    /**
    * Event trigger type
    */
    @SerializedName("StartType")
    @Expose
    private String StartType;

    /**
    * Not empty if `StartType` is `FIXED_TIME`
UTC time, such as `2020-01-01T12:00:00Z`
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get Event trigger type 
     * @return StartType Event trigger type
     */
    public String getStartType() {
        return this.StartType;
    }

    /**
     * Set Event trigger type
     * @param StartType Event trigger type
     */
    public void setStartType(String StartType) {
        this.StartType = StartType;
    }

    /**
     * Get Not empty if `StartType` is `FIXED_TIME`
UTC time, such as `2020-01-01T12:00:00Z` 
     * @return Time Not empty if `StartType` is `FIXED_TIME`
UTC time, such as `2020-01-01T12:00:00Z`
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Not empty if `StartType` is `FIXED_TIME`
UTC time, such as `2020-01-01T12:00:00Z`
     * @param Time Not empty if `StartType` is `FIXED_TIME`
UTC time, such as `2020-01-01T12:00:00Z`
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public TimingSettingsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingSettingsResp(TimingSettingsResp source) {
        if (source.StartType != null) {
            this.StartType = new String(source.StartType);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartType", this.StartType);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

