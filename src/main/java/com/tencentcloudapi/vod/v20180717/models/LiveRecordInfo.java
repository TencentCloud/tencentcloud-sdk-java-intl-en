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

public class LiveRecordInfo extends AbstractModel {

    /**
    * Live recording stream ID.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Recording start time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("RecordStartTime")
    @Expose
    private String RecordStartTime;

    /**
    * Recording end time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("RecordEndTime")
    @Expose
    private String RecordEndTime;

    /**
     * Get Live recording stream ID. 
     * @return StreamId Live recording stream ID.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Live recording stream ID.
     * @param StreamId Live recording stream ID.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Recording start time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return RecordStartTime Recording start time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set Recording start time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param RecordStartTime Recording start time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setRecordStartTime(String RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get Recording end time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return RecordEndTime Recording end time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getRecordEndTime() {
        return this.RecordEndTime;
    }

    /**
     * Set Recording end time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param RecordEndTime Recording end time, using [ISO date format](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setRecordEndTime(String RecordEndTime) {
        this.RecordEndTime = RecordEndTime;
    }

    public LiveRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordInfo(LiveRecordInfo source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new String(source.RecordStartTime);
        }
        if (source.RecordEndTime != null) {
            this.RecordEndTime = new String(source.RecordEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordEndTime", this.RecordEndTime);

    }
}

