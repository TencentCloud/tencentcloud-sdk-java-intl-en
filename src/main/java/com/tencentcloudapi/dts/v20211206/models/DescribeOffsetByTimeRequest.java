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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOffsetByTimeRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Timestamp, the format is: Y-m-d h:m:s. If the input time is much later than the current time, this is equivalent to the latest offset; if the input time is much earlier than the current time, this is equivalent to the oldest offset; if the input is empty, the default time is 0, which is the oldest offset to be queried.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Timestamp, the format is: Y-m-d h:m:s. If the input time is much later than the current time, this is equivalent to the latest offset; if the input time is much earlier than the current time, this is equivalent to the oldest offset; if the input is empty, the default time is 0, which is the oldest offset to be queried. 
     * @return Time Timestamp, the format is: Y-m-d h:m:s. If the input time is much later than the current time, this is equivalent to the latest offset; if the input time is much earlier than the current time, this is equivalent to the oldest offset; if the input is empty, the default time is 0, which is the oldest offset to be queried.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Timestamp, the format is: Y-m-d h:m:s. If the input time is much later than the current time, this is equivalent to the latest offset; if the input time is much earlier than the current time, this is equivalent to the oldest offset; if the input is empty, the default time is 0, which is the oldest offset to be queried.
     * @param Time Timestamp, the format is: Y-m-d h:m:s. If the input time is much later than the current time, this is equivalent to the latest offset; if the input time is much earlier than the current time, this is equivalent to the oldest offset; if the input is empty, the default time is 0, which is the oldest offset to be queried.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public DescribeOffsetByTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOffsetByTimeRequest(DescribeOffsetByTimeRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

