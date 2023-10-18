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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordFile extends AbstractModel {

    /**
    * The URL of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The size of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * The duration of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The recording start time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The recording end time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The URL of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Url The URL of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Url The URL of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The size of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Size The size of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The size of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Size The size of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get The duration of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Duration The duration of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The duration of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Duration The duration of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The recording start time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return StartTime The recording start time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The recording start time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param StartTime The recording start time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The recording end time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return EndTime The recording end time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The recording end time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param EndTime The recording end time in [ISO date format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
Note: This field may return·null, indicating that no valid values can be obtained.
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

