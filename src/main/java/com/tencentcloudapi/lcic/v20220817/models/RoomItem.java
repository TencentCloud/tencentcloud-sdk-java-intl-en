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
    * 
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * 
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * 
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
    * 
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * 
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * 
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * 
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * 
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * 
    */
    @SerializedName("RecordScene")
    @Expose
    private String RecordScene;

    /**
    * 
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
     * Get  
     * @return InteractionMode 
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set 
     * @param InteractionMode 
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get  
     * @return VideoOrientation 
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set 
     * @param VideoOrientation 
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get  
     * @return IsGradingRequiredPostClass 
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set 
     * @param IsGradingRequiredPostClass 
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
     * Get  
     * @return EndDelayTime 
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set 
     * @param EndDelayTime 
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get  
     * @return LiveType 
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set 
     * @param LiveType 
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get  
     * @return RecordLiveUrl 
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set 
     * @param RecordLiveUrl 
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get  
     * @return EnableAutoStart 
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set 
     * @param EnableAutoStart 
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get  
     * @return RecordBackground 
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set 
     * @param RecordBackground 
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get  
     * @return RecordScene 
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set 
     * @param RecordScene 
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get  
     * @return RecordLang 
     */
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set 
     * @param RecordLang 
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

