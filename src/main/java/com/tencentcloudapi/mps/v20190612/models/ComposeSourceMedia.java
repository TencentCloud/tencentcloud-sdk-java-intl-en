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

public class ComposeSourceMedia extends AbstractModel {

    /**
    * The material ID, which can be found in `FileInfos`.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The start time of the material. The following two formats are supported.
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
Default value: `0s`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time of the material. This parameter and `StartTime` determine which time segment of the material is used. The following two formats are supported:
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
If the track duration is set, the default value is `StartTime` plus the track duration. If not, the default value is `StartTime` plus 1 second.
Note: `EndTime` must be at least 0.02 seconds later than `StartTime`.

    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The material ID, which can be found in `FileInfos`. 
     * @return FileId The material ID, which can be found in `FileInfos`.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The material ID, which can be found in `FileInfos`.
     * @param FileId The material ID, which can be found in `FileInfos`.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The start time of the material. The following two formats are supported.
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
Default value: `0s`. 
     * @return StartTime The start time of the material. The following two formats are supported.
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
Default value: `0s`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time of the material. The following two formats are supported.
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
Default value: `0s`.
     * @param StartTime The start time of the material. The following two formats are supported.
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
Default value: `0s`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of the material. This parameter and `StartTime` determine which time segment of the material is used. The following two formats are supported:
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
If the track duration is set, the default value is `StartTime` plus the track duration. If not, the default value is `StartTime` plus 1 second.
Note: `EndTime` must be at least 0.02 seconds later than `StartTime`.
 
     * @return EndTime The end time of the material. This parameter and `StartTime` determine which time segment of the material is used. The following two formats are supported:
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
If the track duration is set, the default value is `StartTime` plus the track duration. If not, the default value is `StartTime` plus 1 second.
Note: `EndTime` must be at least 0.02 seconds later than `StartTime`.

     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the material. This parameter and `StartTime` determine which time segment of the material is used. The following two formats are supported:
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
If the track duration is set, the default value is `StartTime` plus the track duration. If not, the default value is `StartTime` plus 1 second.
Note: `EndTime` must be at least 0.02 seconds later than `StartTime`.

     * @param EndTime The end time of the material. This parameter and `StartTime` determine which time segment of the material is used. The following two formats are supported:
<li>If the value of this parameter ends with `s`, it specifies the time in seconds. For example, `3.5s` indicates the time when 3.5 seconds of the material elapses.</li>
u200c<li>If the value of this parameter ends with `%`, it specifies the time as a percentage of the material's duration. For example, `10%` indicates the time when 10% of the material's duration elapses. </li>
If the track duration is set, the default value is `StartTime` plus the track duration. If not, the default value is `StartTime` plus 1 second.
Note: `EndTime` must be at least 0.02 seconds later than `StartTime`.

     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ComposeSourceMedia() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeSourceMedia(ComposeSourceMedia source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

