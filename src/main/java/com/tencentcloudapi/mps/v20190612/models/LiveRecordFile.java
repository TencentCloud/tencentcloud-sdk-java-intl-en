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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordFile extends AbstractModel {

    /**
    * Live recording file URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Live recording file size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Recording file duration of live stream
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Start time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Live recording file URL 
     * @return Url Live recording file URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Live recording file URL
     * @param Url Live recording file URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Live recording file size 
     * @return Size Live recording file size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Live recording file size
     * @param Size Live recording file size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Recording file duration of live stream 
     * @return Duration Recording file duration of live stream
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Recording file duration of live stream
     * @param Duration Recording file duration of live stream
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Start time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return StartTime Start time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param StartTime Start time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return EndTime End time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param EndTime End time of the live streaming recording file in [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public LiveRecordFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordFile(LiveRecordFile source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

