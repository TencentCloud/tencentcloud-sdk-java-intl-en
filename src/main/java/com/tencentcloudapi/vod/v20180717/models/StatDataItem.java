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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatDataItem extends AbstractModel {

    /**
    * Start time of data time range in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). For example, if the time granularity is 1-day, `2018-12-01T00:00:00+08:00` represents the time range between December 1, 2018 (inclusive) and December 2, 2018 (not inclusive).
<li>For data at hourly level, `2019-08-22T00:00:00+08:00` indicates the statistics between 00:00 and 01:00 AM on August 22, 2019.</li>
<li>For data at daily level, `2019-08-22T00:00:00+08:00` indicates statistics on August 22, 2019.</li>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Data size. 
<li>The data of the storage space, the unit is bytes. </li>
<li>Transcoding duration data, unit is seconds. </li>
<li>Traffic data, unit is bytes. </li>
<li>Bandwidth data, unit is bits per second. </li>
<li>Live broadcast clip data, the unit is seconds. </li>
<li>Carousel data, unit is seconds. </li>
<li>The number of sub-applications, the unit is one. </li>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Start time of data time range in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). For example, if the time granularity is 1-day, `2018-12-01T00:00:00+08:00` represents the time range between December 1, 2018 (inclusive) and December 2, 2018 (not inclusive).
<li>For data at hourly level, `2019-08-22T00:00:00+08:00` indicates the statistics between 00:00 and 01:00 AM on August 22, 2019.</li>
<li>For data at daily level, `2019-08-22T00:00:00+08:00` indicates statistics on August 22, 2019.</li> 
     * @return Time Start time of data time range in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). For example, if the time granularity is 1-day, `2018-12-01T00:00:00+08:00` represents the time range between December 1, 2018 (inclusive) and December 2, 2018 (not inclusive).
<li>For data at hourly level, `2019-08-22T00:00:00+08:00` indicates the statistics between 00:00 and 01:00 AM on August 22, 2019.</li>
<li>For data at daily level, `2019-08-22T00:00:00+08:00` indicates statistics on August 22, 2019.</li>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Start time of data time range in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). For example, if the time granularity is 1-day, `2018-12-01T00:00:00+08:00` represents the time range between December 1, 2018 (inclusive) and December 2, 2018 (not inclusive).
<li>For data at hourly level, `2019-08-22T00:00:00+08:00` indicates the statistics between 00:00 and 01:00 AM on August 22, 2019.</li>
<li>For data at daily level, `2019-08-22T00:00:00+08:00` indicates statistics on August 22, 2019.</li>
     * @param Time Start time of data time range in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). For example, if the time granularity is 1-day, `2018-12-01T00:00:00+08:00` represents the time range between December 1, 2018 (inclusive) and December 2, 2018 (not inclusive).
<li>For data at hourly level, `2019-08-22T00:00:00+08:00` indicates the statistics between 00:00 and 01:00 AM on August 22, 2019.</li>
<li>For data at daily level, `2019-08-22T00:00:00+08:00` indicates statistics on August 22, 2019.</li>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Data size. 
<li>The data of the storage space, the unit is bytes. </li>
<li>Transcoding duration data, unit is seconds. </li>
<li>Traffic data, unit is bytes. </li>
<li>Bandwidth data, unit is bits per second. </li>
<li>Live broadcast clip data, the unit is seconds. </li>
<li>Carousel data, unit is seconds. </li>
<li>The number of sub-applications, the unit is one. </li> 
     * @return Value Data size. 
<li>The data of the storage space, the unit is bytes. </li>
<li>Transcoding duration data, unit is seconds. </li>
<li>Traffic data, unit is bytes. </li>
<li>Bandwidth data, unit is bits per second. </li>
<li>Live broadcast clip data, the unit is seconds. </li>
<li>Carousel data, unit is seconds. </li>
<li>The number of sub-applications, the unit is one. </li>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Data size. 
<li>The data of the storage space, the unit is bytes. </li>
<li>Transcoding duration data, unit is seconds. </li>
<li>Traffic data, unit is bytes. </li>
<li>Bandwidth data, unit is bits per second. </li>
<li>Live broadcast clip data, the unit is seconds. </li>
<li>Carousel data, unit is seconds. </li>
<li>The number of sub-applications, the unit is one. </li>
     * @param Value Data size. 
<li>The data of the storage space, the unit is bytes. </li>
<li>Transcoding duration data, unit is seconds. </li>
<li>Traffic data, unit is bytes. </li>
<li>Bandwidth data, unit is bits per second. </li>
<li>Live broadcast clip data, the unit is seconds. </li>
<li>Carousel data, unit is seconds. </li>
<li>The number of sub-applications, the unit is one. </li>
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

