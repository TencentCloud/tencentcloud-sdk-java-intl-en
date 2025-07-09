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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageFile extends AbstractModel {

    /**
    * The user whose stream is recorded into the file. In the mixed-stream recording mode, this parameter will be empty.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The filename.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * The type of the media recorded.
video
audio
audio_video
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * The start time (Unix timestamp) of the recording file.
    */
    @SerializedName("BeginTimeStamp")
    @Expose
    private Long BeginTimeStamp;

    /**
     * Get The user whose stream is recorded into the file. In the mixed-stream recording mode, this parameter will be empty.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UserId The user whose stream is recorded into the file. In the mixed-stream recording mode, this parameter will be empty.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user whose stream is recorded into the file. In the mixed-stream recording mode, this parameter will be empty.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UserId The user whose stream is recorded into the file. In the mixed-stream recording mode, this parameter will be empty.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The filename. 
     * @return FileName The filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set The filename.
     * @param FileName The filename.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get The type of the media recorded.
video
audio
audio_video
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TrackType The type of the media recorded.
video
audio
audio_video
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set The type of the media recorded.
video
audio
audio_video
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TrackType The type of the media recorded.
video
audio
audio_video
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get The start time (Unix timestamp) of the recording file. 
     * @return BeginTimeStamp The start time (Unix timestamp) of the recording file.
     */
    public Long getBeginTimeStamp() {
        return this.BeginTimeStamp;
    }

    /**
     * Set The start time (Unix timestamp) of the recording file.
     * @param BeginTimeStamp The start time (Unix timestamp) of the recording file.
     */
    public void setBeginTimeStamp(Long BeginTimeStamp) {
        this.BeginTimeStamp = BeginTimeStamp;
    }

    public StorageFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageFile(StorageFile source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.BeginTimeStamp != null) {
            this.BeginTimeStamp = new Long(source.BeginTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "BeginTimeStamp", this.BeginTimeStamp);

    }
}

