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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcurrentRecordStreamNum extends AbstractModel {

    /**
    * Time point.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Number of channels.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get Time point. 
     * @return Time Time point.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time point.
     * @param Time Time point.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Number of channels. 
     * @return Num Number of channels.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Number of channels.
     * @param Num Number of channels.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public ConcurrentRecordStreamNum() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcurrentRecordStreamNum(ConcurrentRecordStreamNum source) {
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

