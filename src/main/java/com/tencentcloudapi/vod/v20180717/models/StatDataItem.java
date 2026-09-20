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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatDataItem extends AbstractModel {

    /**
    * Start time of the time interval where the data is located, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Data size.
<li>Data of storage space, in bytes.</li>
<li>Transcoding duration data, in seconds.</li>
<li>Traffic data, in bytes.</li>
<li>Bandwidth statistics in bit/s.</li>
<li>Live stream editing data, in seconds.</li>
<li>Loop banner data, in seconds.</li>
<li>Number of sub-applications. The unit is count.</li>
<li>Log service usage data, in counts.</li>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Start time of the time interval where the data is located, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li> 
     * @return Time Start time of the time interval where the data is located, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Start time of the time interval where the data is located, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     * @param Time Start time of the time interval where the data is located, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 means the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
<li>For hour-level data, 2019-08-22T00:00:00+08:00 refers to the stats from 0:00 to 1:00 on August 22, 2019.</li>
<li>For daily-level data, 2019-08-22T00:00:00+08:00 refers to the stats of 2019-08-22.</li>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Data size.
<li>Data of storage space, in bytes.</li>
<li>Transcoding duration data, in seconds.</li>
<li>Traffic data, in bytes.</li>
<li>Bandwidth statistics in bit/s.</li>
<li>Live stream editing data, in seconds.</li>
<li>Loop banner data, in seconds.</li>
<li>Number of sub-applications. The unit is count.</li>
<li>Log service usage data, in counts.</li> 
     * @return Value Data size.
<li>Data of storage space, in bytes.</li>
<li>Transcoding duration data, in seconds.</li>
<li>Traffic data, in bytes.</li>
<li>Bandwidth statistics in bit/s.</li>
<li>Live stream editing data, in seconds.</li>
<li>Loop banner data, in seconds.</li>
<li>Number of sub-applications. The unit is count.</li>
<li>Log service usage data, in counts.</li>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Data size.
<li>Data of storage space, in bytes.</li>
<li>Transcoding duration data, in seconds.</li>
<li>Traffic data, in bytes.</li>
<li>Bandwidth statistics in bit/s.</li>
<li>Live stream editing data, in seconds.</li>
<li>Loop banner data, in seconds.</li>
<li>Number of sub-applications. The unit is count.</li>
<li>Log service usage data, in counts.</li>
     * @param Value Data size.
<li>Data of storage space, in bytes.</li>
<li>Transcoding duration data, in seconds.</li>
<li>Traffic data, in bytes.</li>
<li>Bandwidth statistics in bit/s.</li>
<li>Live stream editing data, in seconds.</li>
<li>Loop banner data, in seconds.</li>
<li>Number of sub-applications. The unit is count.</li>
<li>Log service usage data, in counts.</li>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public StatDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatDataItem(StatDataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

