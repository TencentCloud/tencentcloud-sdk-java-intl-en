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

public class VideoDownloadTask extends AbstractModel {

    /**
    * Download task ID
    */
    @SerializedName("DownloadTaskId")
    @Expose
    private String DownloadTaskId;

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel name
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Channel encoding
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Device code
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * Task status (0: pending; 1: executing; 2: task complete;
3: Task failure)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Download the recording time period
    */
    @SerializedName("VideoTimeSection")
    @Expose
    private String VideoTimeSection;

    /**
    * Playback speed
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Download duration.
    */
    @SerializedName("DownloadTime")
    @Expose
    private Long DownloadTime;

    /**
    * Video recording size
    */
    @SerializedName("VideoSize")
    @Expose
    private Long VideoSize;

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * File download address
    */
    @SerializedName("FileDownloadUrl")
    @Expose
    private String FileDownloadUrl;

    /**
    * Reason for failure
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * Lifecycle rule, number of days in hot storage
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * mp4 preview address
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get Download task ID 
     * @return DownloadTaskId Download task ID
     */
    public String getDownloadTaskId() {
        return this.DownloadTaskId;
    }

    /**
     * Set Download task ID
     * @param DownloadTaskId Download task ID
     */
    public void setDownloadTaskId(String DownloadTaskId) {
        this.DownloadTaskId = DownloadTaskId;
    }

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
     * Get Channel name 
     * @return ChannelName Channel name
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name
     * @param ChannelName Channel name
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Channel encoding 
     * @return ChannelCode Channel encoding
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set Channel encoding
     * @param ChannelCode Channel encoding
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Device code 
     * @return DeviceCode Device code
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set Device code
     * @param DeviceCode Device code
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Get Task status (0: pending; 1: executing; 2: task complete;
3: Task failure) 
     * @return Status Task status (0: pending; 1: executing; 2: task complete;
3: Task failure)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status (0: pending; 1: executing; 2: task complete;
3: Task failure)
     * @param Status Task status (0: pending; 1: executing; 2: task complete;
3: Task failure)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Download the recording time period 
     * @return VideoTimeSection Download the recording time period
     */
    public String getVideoTimeSection() {
        return this.VideoTimeSection;
    }

    /**
     * Set Download the recording time period
     * @param VideoTimeSection Download the recording time period
     */
    public void setVideoTimeSection(String VideoTimeSection) {
        this.VideoTimeSection = VideoTimeSection;
    }

    /**
     * Get Playback speed 
     * @return Scale Playback speed
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Playback speed
     * @param Scale Playback speed
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Download duration. 
     * @return DownloadTime Download duration.
     */
    public Long getDownloadTime() {
        return this.DownloadTime;
    }

    /**
     * Set Download duration.
     * @param DownloadTime Download duration.
     */
    public void setDownloadTime(Long DownloadTime) {
        this.DownloadTime = DownloadTime;
    }

    /**
     * Get Video recording size 
     * @return VideoSize Video recording size
     */
    public Long getVideoSize() {
        return this.VideoSize;
    }

    /**
     * Set Video recording size
     * @param VideoSize Video recording size
     */
    public void setVideoSize(Long VideoSize) {
        this.VideoSize = VideoSize;
    }

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get File download address 
     * @return FileDownloadUrl File download address
     */
    public String getFileDownloadUrl() {
        return this.FileDownloadUrl;
    }

    /**
     * Set File download address
     * @param FileDownloadUrl File download address
     */
    public void setFileDownloadUrl(String FileDownloadUrl) {
        this.FileDownloadUrl = FileDownloadUrl;
    }

    /**
     * Get Reason for failure 
     * @return FailedReason Reason for failure
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Reason for failure
     * @param FailedReason Reason for failure
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get Lifecycle rule, number of days in hot storage 
     * @return Expire Lifecycle rule, number of days in hot storage
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set Lifecycle rule, number of days in hot storage
     * @param Expire Lifecycle rule, number of days in hot storage
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get mp4 preview address 
     * @return PreviewUrl mp4 preview address
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set mp4 preview address
     * @param PreviewUrl mp4 preview address
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    public VideoDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDownloadTask(VideoDownloadTask source) {
        if (source.DownloadTaskId != null) {
            this.DownloadTaskId = new String(source.DownloadTaskId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceCode != null) {
            this.DeviceCode = new String(source.DeviceCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VideoTimeSection != null) {
            this.VideoTimeSection = new String(source.VideoTimeSection);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.DownloadTime != null) {
            this.DownloadTime = new Long(source.DownloadTime);
        }
        if (source.VideoSize != null) {
            this.VideoSize = new Long(source.VideoSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileDownloadUrl != null) {
            this.FileDownloadUrl = new String(source.FileDownloadUrl);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadTaskId", this.DownloadTaskId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VideoTimeSection", this.VideoTimeSection);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DownloadTime", this.DownloadTime);
        this.setParamSimple(map, prefix + "VideoSize", this.VideoSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileDownloadUrl", this.FileDownloadUrl);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

