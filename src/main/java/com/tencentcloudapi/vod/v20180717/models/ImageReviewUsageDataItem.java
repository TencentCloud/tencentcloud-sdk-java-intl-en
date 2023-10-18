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

public class ImageReviewUsageDataItem extends AbstractModel {

    /**
    * The start time (in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)) of the data returned. For example, if the granularity is a day, `2018-12-01T00:00:00+08:00` indicates that the data is for the whole day of December 1, 2018.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * The number of times the image recognition feature is used.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get The start time (in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)) of the data returned. For example, if the granularity is a day, `2018-12-01T00:00:00+08:00` indicates that the data is for the whole day of December 1, 2018. 
     * @return Time The start time (in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)) of the data returned. For example, if the granularity is a day, `2018-12-01T00:00:00+08:00` indicates that the data is for the whole day of December 1, 2018.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set The start time (in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)) of the data returned. For example, if the granularity is a day, `2018-12-01T00:00:00+08:00` indicates that the data is for the whole day of December 1, 2018.
     * @param Time The start time (in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)) of the data returned. For example, if the granularity is a day, `2018-12-01T00:00:00+08:00` indicates that the data is for the whole day of December 1, 2018.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get The number of times the image recognition feature is used. 
     * @return Count The number of times the image recognition feature is used.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of times the image recognition feature is used.
     * @param Count The number of times the image recognition feature is used.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ImageReviewUsageDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageReviewUsageDataItem(ImageReviewUsageDataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

