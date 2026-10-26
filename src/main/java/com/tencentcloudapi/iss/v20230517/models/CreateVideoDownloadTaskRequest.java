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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoDownloadTaskRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Default: 1x. Supports 1x, 2x, 4x, and 8x playback speeds.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Expiration time of the transcoded mp4 file (7, 15, 30, 60, 90, 180, and 365 are supported)
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * Download file format. Currently only supports (1: mp4)
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * Completion policy (0: The task fails and no MP4 is generated if the stream pull fails but the video recording is incomplete. 1: The task succeeds and an MP4 is generated if the stream pull fails but the video recording is incomplete.)
    */
    @SerializedName("CompletionPolicy")
    @Expose
    private Long CompletionPolicy;

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Start time. 
     * @return BeginTime Start time.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time.
     * @param BeginTime Start time.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Default: 1x. Supports 1x, 2x, 4x, and 8x playback speeds. 
     * @return Scale Default: 1x. Supports 1x, 2x, 4x, and 8x playback speeds.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Default: 1x. Supports 1x, 2x, 4x, and 8x playback speeds.
     * @param Scale Default: 1x. Supports 1x, 2x, 4x, and 8x playback speeds.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Expiration time of the transcoded mp4 file (7, 15, 30, 60, 90, 180, and 365 are supported) 
     * @return Expire Expiration time of the transcoded mp4 file (7, 15, 30, 60, 90, 180, and 365 are supported)
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set Expiration time of the transcoded mp4 file (7, 15, 30, 60, 90, 180, and 365 are supported)
     * @param Expire Expiration time of the transcoded mp4 file (7, 15, 30, 60, 90, 180, and 365 are supported)
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get Download file format. Currently only supports (1: mp4) 
     * @return FileType Download file format. Currently only supports (1: mp4)
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set Download file format. Currently only supports (1: mp4)
     * @param FileType Download file format. Currently only supports (1: mp4)
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Completion policy (0: The task fails and no MP4 is generated if the stream pull fails but the video recording is incomplete. 1: The task succeeds and an MP4 is generated if the stream pull fails but the video recording is incomplete.) 
     * @return CompletionPolicy Completion policy (0: The task fails and no MP4 is generated if the stream pull fails but the video recording is incomplete. 1: The task succeeds and an MP4 is generated if the stream pull fails but the video recording is incomplete.)
     */
    public Long getCompletionPolicy() {
        return this.CompletionPolicy;
    }

    /**
     * Set Completion policy (0: The task fails and no MP4 is generated if the stream pull fails but the video recording is incomplete. 1: The task succeeds and an MP4 is generated if the stream pull fails but the video recording is incomplete.)
     * @param CompletionPolicy Completion policy (0: The task fails and no MP4 is generated if the stream pull fails but the video recording is incomplete. 1: The task succeeds and an MP4 is generated if the stream pull fails but the video recording is incomplete.)
     */
    public void setCompletionPolicy(Long CompletionPolicy) {
        this.CompletionPolicy = CompletionPolicy;
    }

    public CreateVideoDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoDownloadTaskRequest(CreateVideoDownloadTaskRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.CompletionPolicy != null) {
            this.CompletionPolicy = new Long(source.CompletionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CompletionPolicy", this.CompletionPolicy);

    }
}

