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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedValue extends AbstractModel {

    /**
    * Timestamp with MillisecondsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
     * Get Timestamp with MillisecondsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Time Timestamp with MillisecondsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Timestamp with MillisecondsNote: This field may return null, indicating that no valid value can be obtained.
     * @param Time Timestamp with MillisecondsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Speed NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param Speed NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    public SpeedValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedValue(SpeedValue source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

