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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeValue extends AbstractModel {

    /**
    * UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Value.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`. 
     * @return Time UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     * @param Time UTC time in the format of `yyyy-mm-ddTHH:MM:SSZ`.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Value. 
     * @return Num Value.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Value.
     * @param Num Value.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public TimeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeValue(TimeValue source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

