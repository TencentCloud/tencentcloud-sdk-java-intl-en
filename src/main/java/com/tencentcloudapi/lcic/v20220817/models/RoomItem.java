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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomItem extends AbstractModel {

    /**
    * The name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The room status. `0`: Not started; `1`: Started; `2`: Ended.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The scheduled start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The scheduled end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The actual start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealStartTime")
    @Expose
    private Long RealStartTime;

    /**
    * The actual end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealEndTime")
    @Expose
    private Long RealEndTime;

    /**
    * The resolution. `1`: SD.
`2`: HD
`3`: FHD
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * The maximum number of mic-on users allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRTCMember")
    @Expose
    private Long MaxRTCMember;

    /**
    * The URL of the room's recording. This parameter has been deprecated. Please use `RecordUrl` instead.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplayUrl")
    @Expose
    private String ReplayUrl;

    /**
    * The recording URL (HTTPS), which is generated only after a room ends.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * The maximum number of users allowed (including teachers) in the room. The default value is `0`, which indicates that no limit is set. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * Whether the students' consent is required to control their cameras/microphones.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EnableDirectControl")
    @Expose
    private Long EnableDirectControl;

    /**
    * Enable Focus Mode. 0: View all participants (default) 1: View only teacher and TA
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * Landscape/Portrait. 0: Landscape broadcast (default); 1: Portrait broadcast. Currently supported only for video-only type on mobile devices.
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * Enable post-class evaluation. 0: Disable (default) 1: Enable
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * Room Type: 0 Small Classroom(default); 1 Lecture Hall(public class)
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * Overtime duration: Unit in minutes. 0: No limitation (default); -1: Overtime prohibited; Values >0: Overtime duration in minutes, maximum 120 minutes
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * Live Streaming Type: 0: Regular (default) 1: Simulated Live
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * Simulated Live Playback Link
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * Whether to auto-start class: 0: Do not auto-start (default) 1: Auto-start. Effective when live_type=1
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * Background image for recording files, supports png, jpg, jpeg, bmp formats. Alpha channel is currently not supported.
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * Recording custom scenes. This parameter is valid only when recordlayout=9. The data content consists of user-defined scene parameters in json key-value pair format, where the value is of string type.
    */
    @SerializedName("RecordScene")
    @Expose
    private String RecordScene;

    /**
    * Recording custom language. This parameter is valid only when recordlayout=9.
    */
    @SerializedName("RecordLang")
    @Expose
    private String RecordLang;

    /**
     * Get The name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name The name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name The name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The room ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The room status. `0`: Not started; `1`: Started; `2`: Ended.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The room status. `0`: Not started; `1`: Started; `2`: Ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The room status. `0`: Not started; `1`: Started; `2`: Ended.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The room status. `0`: Not started; `1`: Started; `2`: Ended.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The scheduled start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime The scheduled start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The scheduled start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime The scheduled start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The scheduled end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime The scheduled end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The scheduled end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime The scheduled end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The actual start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealStartTime The actual start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealStartTime() {
        return this.RealStartTime;
    }

    /**
     * Set The actual start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealStartTime The actual start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealStartTime(Long RealStartTime) {
        this.RealStartTime = RealStartTime;
    }

    /**
     * Get The actual end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealEndTime The actual end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealEndTime() {
        return this.RealEndTime;
    }

    /**
     * Set The actual end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealEndTime The actual end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealEndTime(Long RealEndTime) {
        this.RealEndTime = RealEndTime;
    }

    /**
     * Get The resolution. `1`: SD.
`2`: HD
`3`: FHD
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resolution The resolution. `1`: SD.
`2`: HD
`3`: FHD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set The resolution. `1`: SD.
`2`: HD
`3`: FHD
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resolution The resolution. `1`: SD.
`2`: HD
`3`: FHD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get The maximum number of mic-on users allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxRTCMember The maximum number of mic-on users allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRTCMember() {
        return this.MaxRTCMember;
    }

    /**
     * Set The maximum number of mic-on users allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxRTCMember The maximum number of mic-on users allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRTCMember(Long MaxRTCMember) {
        this.MaxRTCMember = MaxRTCMember;
    }

    /**
     * Get The URL of the room's recording. This parameter has been deprecated. Please use `RecordUrl` instead.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReplayUrl The URL of the room's recording. This parameter has been deprecated. Please use `RecordUrl` instead.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReplayUrl() {
        return this.ReplayUrl;
    }

    /**
     * Set The URL of the room's recording. This parameter has been deprecated. Please use `RecordUrl` instead.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReplayUrl The URL of the room's recording. This parameter has been deprecated. Please use `RecordUrl` instead.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplayUrl(String ReplayUrl) {
        this.ReplayUrl = ReplayUrl;
    }

    /**
     * Get The recording URL (HTTPS), which is generated only after a room ends.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordUrl The recording URL (HTTPS), which is generated only after a room ends.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set The recording URL (HTTPS), which is generated only after a room ends.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordUrl The recording URL (HTTPS), which is generated only after a room ends.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get The maximum number of users allowed (including teachers) in the room. The default value is `0`, which indicates that no limit is set. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxMicNumber The maximum number of users allowed (including teachers) in the room. The default value is `0`, which indicates that no limit is set. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set The maximum number of users allowed (including teachers) in the room. The default value is `0`, which indicates that no limit is set. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxMicNumber The maximum number of users allowed (including teachers) in the room. The default value is `0`, which indicates that no limit is set. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get Whether the students' consent is required to control their cameras/microphones.
Note: This field may return null, indicating that no valid value was found. 
     * @return EnableDirectControl Whether the students' consent is required to control their cameras/microphones.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set Whether the students' consent is required to control their cameras/microphones.
Note: This field may return null, indicating that no valid value was found.
     * @param EnableDirectControl Whether the students' consent is required to control their cameras/microphones.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEnableDirectControl(Long EnableDirectControl) {
        this.EnableDirectControl = EnableDirectControl;
    }

    /**
     * Get Enable Focus Mode. 0: View all participants (default) 1: View only teacher and TA 
     * @return InteractionMode Enable Focus Mode. 0: View all participants (default) 1: View only teacher and TA
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set Enable Focus Mode. 0: View all participants (default) 1: View only teacher and TA
     * @param InteractionMode Enable Focus Mode. 0: View all participants (default) 1: View only teacher and TA
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get Landscape/Portrait. 0: Landscape broadcast (default); 1: Portrait broadcast. Currently supported only for video-only type on mobile devices. 
     * @return VideoOrientation Landscape/Portrait. 0: Landscape broadcast (default); 1: Portrait broadcast. Currently supported only for video-only type on mobile devices.
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set Landscape/Portrait. 0: Landscape broadcast (default); 1: Portrait broadcast. Currently supported only for video-only type on mobile devices.
     * @param VideoOrientation Landscape/Portrait. 0: Landscape broadcast (default); 1: Portrait broadcast. Currently supported only for video-only type on mobile devices.
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get Enable post-class evaluation. 0: Disable (default) 1: Enable 
     * @return IsGradingRequiredPostClass Enable post-class evaluation. 0: Disable (default) 1: Enable
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set Enable post-class evaluation. 0: Disable (default) 1: Enable
     * @param IsGradingRequiredPostClass Enable post-class evaluation. 0: Disable (default) 1: Enable
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get Room Type: 0 Small Classroom(default); 1 Lecture Hall(public class) 
     * @return RoomType Room Type: 0 Small Classroom(default); 1 Lecture Hall(public class)
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set Room Type: 0 Small Classroom(default); 1 Lecture Hall(public class)
     * @param RoomType Room Type: 0 Small Classroom(default); 1 Lecture Hall(public class)
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get Overtime duration: Unit in minutes. 0: No limitation (default); -1: Overtime prohibited; Values >0: Overtime duration in minutes, maximum 120 minutes 
     * @return EndDelayTime Overtime duration: Unit in minutes. 0: No limitation (default); -1: Overtime prohibited; Values >0: Overtime duration in minutes, maximum 120 minutes
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set Overtime duration: Unit in minutes. 0: No limitation (default); -1: Overtime prohibited; Values >0: Overtime duration in minutes, maximum 120 minutes
     * @param EndDelayTime Overtime duration: Unit in minutes. 0: No limitation (default); -1: Overtime prohibited; Values >0: Overtime duration in minutes, maximum 120 minutes
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get Live Streaming Type: 0: Regular (default) 1: Simulated Live 
     * @return LiveType Live Streaming Type: 0: Regular (default) 1: Simulated Live
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set Live Streaming Type: 0: Regular (default) 1: Simulated Live
     * @param LiveType Live Streaming Type: 0: Regular (default) 1: Simulated Live
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get Simulated Live Playback Link 
     * @return RecordLiveUrl Simulated Live Playback Link
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set Simulated Live Playback Link
     * @param RecordLiveUrl Simulated Live Playback Link
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get Whether to auto-start class: 0: Do not auto-start (default) 1: Auto-start. Effective when live_type=1 
     * @return EnableAutoStart Whether to auto-start class: 0: Do not auto-start (default) 1: Auto-start. Effective when live_type=1
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set Whether to auto-start class: 0: Do not auto-start (default) 1: Auto-start. Effective when live_type=1
     * @param EnableAutoStart Whether to auto-start class: 0: Do not auto-start (default) 1: Auto-start. Effective when live_type=1
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get Background image for recording files, supports png, jpg, jpeg, bmp formats. Alpha channel is currently not supported. 
     * @return RecordBackground Background image for recording files, supports png, jpg, jpeg, bmp formats. Alpha channel is currently not supported.
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set Background image for recording files, supports png, jpg, jpeg, bmp formats. Alpha channel is currently not supported.
     * @param RecordBackground Background image for recording files, supports png, jpg, jpeg, bmp formats. Alpha channel is currently not supported.
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get Recording custom scenes. This parameter is valid only when recordlayout=9. The data content consists of user-defined scene parameters in json key-value pair format, where the value is of string type. 
     * @return RecordScene Recording custom scenes. This parameter is valid only when recordlayout=9. The data content consists of user-defined scene parameters in json key-value pair format, where the value is of string type.
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set Recording custom scenes. This parameter is valid only when recordlayout=9. The data content consists of user-defined scene parameters in json key-value pair format, where the value is of string type.
     * @param RecordScene Recording custom scenes. This parameter is valid only when recordlayout=9. The data content consists of user-defined scene parameters in json key-value pair format, where the value is of string type.
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get Recording custom language. This parameter is valid only when recordlayout=9. 
     * @return RecordLang Recording custom language. This parameter is valid only when recordlayout=9.
     */
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set Recording custom language. This parameter is valid only when recordlayout=9.
     * @param RecordLang Recording custom language. This parameter is valid only when recordlayout=9.
     */
    public void setRecordLang(String RecordLang) {
        this.RecordLang = RecordLang;
    }

    public RoomItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomItem(RoomItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RealStartTime != null) {
            this.RealStartTime = new Long(source.RealStartTime);
        }
        if (source.RealEndTime != null) {
            this.RealEndTime = new Long(source.RealEndTime);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxRTCMember != null) {
            this.MaxRTCMember = new Long(source.MaxRTCMember);
        }
        if (source.ReplayUrl != null) {
            this.ReplayUrl = new String(source.ReplayUrl);
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
        }
        if (source.EnableDirectControl != null) {
            this.EnableDirectControl = new Long(source.EnableDirectControl);
        }
        if (source.InteractionMode != null) {
            this.InteractionMode = new Long(source.InteractionMode);
        }
        if (source.VideoOrientation != null) {
            this.VideoOrientation = new Long(source.VideoOrientation);
        }
        if (source.IsGradingRequiredPostClass != null) {
            this.IsGradingRequiredPostClass = new Long(source.IsGradingRequiredPostClass);
        }
        if (source.RoomType != null) {
            this.RoomType = new Long(source.RoomType);
        }
        if (source.EndDelayTime != null) {
            this.EndDelayTime = new Long(source.EndDelayTime);
        }
        if (source.LiveType != null) {
            this.LiveType = new Long(source.LiveType);
        }
        if (source.RecordLiveUrl != null) {
            this.RecordLiveUrl = new String(source.RecordLiveUrl);
        }
        if (source.EnableAutoStart != null) {
            this.EnableAutoStart = new Long(source.EnableAutoStart);
        }
        if (source.RecordBackground != null) {
            this.RecordBackground = new String(source.RecordBackground);
        }
        if (source.RecordScene != null) {
            this.RecordScene = new String(source.RecordScene);
        }
        if (source.RecordLang != null) {
            this.RecordLang = new String(source.RecordLang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RealStartTime", this.RealStartTime);
        this.setParamSimple(map, prefix + "RealEndTime", this.RealEndTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxRTCMember", this.MaxRTCMember);
        this.setParamSimple(map, prefix + "ReplayUrl", this.ReplayUrl);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "EnableDirectControl", this.EnableDirectControl);
        this.setParamSimple(map, prefix + "InteractionMode", this.InteractionMode);
        this.setParamSimple(map, prefix + "VideoOrientation", this.VideoOrientation);
        this.setParamSimple(map, prefix + "IsGradingRequiredPostClass", this.IsGradingRequiredPostClass);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "EndDelayTime", this.EndDelayTime);
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "RecordLiveUrl", this.RecordLiveUrl);
        this.setParamSimple(map, prefix + "EnableAutoStart", this.EnableAutoStart);
        this.setParamSimple(map, prefix + "RecordBackground", this.RecordBackground);
        this.setParamSimple(map, prefix + "RecordScene", this.RecordScene);
        this.setParamSimple(map, prefix + "RecordLang", this.RecordLang);

    }
}

