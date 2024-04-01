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

public class DescribeRoomResponse extends AbstractModel {

    /**
    * Room name	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Reserved room start time, in UNIX timestamp format	
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Reserved room end time, in UNIX timestamp format	
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Teacher ID	
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * LCIC SdkAppId	
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    *  Watch type. Can have the following values: 1 interactive viewing 2 standard viewing
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * Resolution. Valid values: 1: SD; 2: HD; 3: FHD
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * Maximum number of mic-on users (excluding teachers). Value range: [0, 16]
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes.
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes.
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * The room subtype. Valid values: videodoc: Document + Video; video: Video only.
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends.
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * Assistant ID list Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * Recording URL. This parameter exists only after a room is ended. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * The class status. 0: The class has not started. 1: The class has started. 2: The class ended. 3: The class expired. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Whether the students' consent is required to control their cameras/microphones.
    */
    @SerializedName("EnableDirectControl")
    @Expose
    private Long EnableDirectControl;

    /**
    * Turn on focus mode. 0 Watch all character audio and video (default) 1 Watch only teachers and teaching assistants
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * Horizontal and vertical screen. 0: Horizontal screen to open broadcast (default); 1: Vertical screen to open broadcast, currently only support mobile pure video type
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * Whether the room is enabled for grading after the lesson. 0: not enabled 1: enabled
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
    * Recording Duration
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * Drag class time: unit minutes, 0 is unlimited (default), -1 is can't drag the class, greater than 0 is the time of dragging the class, the maximum value of 120 minutes
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * Live type: 0 regular (default) 1 Simulated Live
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * Simulated Live link
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * Whether to start the lesson automatically: 0 not automatic lesson (default) 1 automatic lesson live_type=1 is valid
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * Recorded file background image, support png, jpg, jpeg, bmp format, does not support transparent channel for the time being
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * RTMP  stream link
    */
    @SerializedName("RTMPStreamingURL")
    @Expose
    private String RTMPStreamingURL;

    /**
    * Record customized scene, only recordlayout=9 this parameter is valid
    */
    @SerializedName("RecordScene")
    @Expose
    private String RecordScene;

    /**
    * Record customized language, only when recordlayout=9, this parameter is valid
    */
    @SerializedName("RecordLang")
    @Expose
    private String RecordLang;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Room name	 
     * @return Name Room name	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Room name	
     * @param Name Room name	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Reserved room start time, in UNIX timestamp format	 
     * @return StartTime Reserved room start time, in UNIX timestamp format	
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Reserved room start time, in UNIX timestamp format	
     * @param StartTime Reserved room start time, in UNIX timestamp format	
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Reserved room end time, in UNIX timestamp format	 
     * @return EndTime Reserved room end time, in UNIX timestamp format	
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Reserved room end time, in UNIX timestamp format	
     * @param EndTime Reserved room end time, in UNIX timestamp format	
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Teacher ID	 
     * @return TeacherId Teacher ID	
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set Teacher ID	
     * @param TeacherId Teacher ID	
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get LCIC SdkAppId	 
     * @return SdkAppId LCIC SdkAppId	
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set LCIC SdkAppId	
     * @param SdkAppId LCIC SdkAppId	
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get  Watch type. Can have the following values: 1 interactive viewing 2 standard viewing 
     * @return AudienceType  Watch type. Can have the following values: 1 interactive viewing 2 standard viewing
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set  Watch type. Can have the following values: 1 interactive viewing 2 standard viewing
     * @param AudienceType  Watch type. Can have the following values: 1 interactive viewing 2 standard viewing
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get Resolution. Valid values: 1: SD; 2: HD; 3: FHD 
     * @return Resolution Resolution. Valid values: 1: SD; 2: HD; 3: FHD
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution. Valid values: 1: SD; 2: HD; 3: FHD
     * @param Resolution Resolution. Valid values: 1: SD; 2: HD; 3: FHD
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Maximum number of mic-on users (excluding teachers). Value range: [0, 16] 
     * @return MaxMicNumber Maximum number of mic-on users (excluding teachers). Value range: [0, 16]
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set Maximum number of mic-on users (excluding teachers). Value range: [0, 16]
     * @param MaxMicNumber Maximum number of mic-on users (excluding teachers). Value range: [0, 16]
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes. 
     * @return AutoMic Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes.
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes.
     * @param AutoMic Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes.
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. 
     * @return AudioQuality Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes.
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes.
     * @param AudioQuality Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes.
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get The room subtype. Valid values: videodoc: Document + Video; video: Video only. 
     * @return SubType The room subtype. Valid values: videodoc: Document + Video; video: Video only.
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set The room subtype. Valid values: videodoc: Document + Video; video: Video only.
     * @param SubType The room subtype. Valid values: videodoc: Document + Video; video: Video only.
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. 
     * @return DisableRecord Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends.
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends.
     * @param DisableRecord Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends.
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get Assistant ID list Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Assistants Assistant ID list Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set Assistant ID list Note: This field may return null, indicating that no valid values can be obtained.
     * @param Assistants Assistant ID list Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get Recording URL. This parameter exists only after a room is ended. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordUrl Recording URL. This parameter exists only after a room is ended. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set Recording URL. This parameter exists only after a room is ended. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordUrl Recording URL. This parameter exists only after a room is ended. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get The class status. 0: The class has not started. 1: The class has started. 2: The class ended. 3: The class expired. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The class status. 0: The class has not started. 1: The class has started. 2: The class ended. 3: The class expired. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The class status. 0: The class has not started. 1: The class has started. 2: The class ended. 3: The class expired. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The class status. 0: The class has not started. 1: The class has started. 2: The class ended. 3: The class expired. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether the students' consent is required to control their cameras/microphones. 
     * @return EnableDirectControl Whether the students' consent is required to control their cameras/microphones.
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set Whether the students' consent is required to control their cameras/microphones.
     * @param EnableDirectControl Whether the students' consent is required to control their cameras/microphones.
     */
    public void setEnableDirectControl(Long EnableDirectControl) {
        this.EnableDirectControl = EnableDirectControl;
    }

    /**
     * Get Turn on focus mode. 0 Watch all character audio and video (default) 1 Watch only teachers and teaching assistants 
     * @return InteractionMode Turn on focus mode. 0 Watch all character audio and video (default) 1 Watch only teachers and teaching assistants
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set Turn on focus mode. 0 Watch all character audio and video (default) 1 Watch only teachers and teaching assistants
     * @param InteractionMode Turn on focus mode. 0 Watch all character audio and video (default) 1 Watch only teachers and teaching assistants
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get Horizontal and vertical screen. 0: Horizontal screen to open broadcast (default); 1: Vertical screen to open broadcast, currently only support mobile pure video type 
     * @return VideoOrientation Horizontal and vertical screen. 0: Horizontal screen to open broadcast (default); 1: Vertical screen to open broadcast, currently only support mobile pure video type
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set Horizontal and vertical screen. 0: Horizontal screen to open broadcast (default); 1: Vertical screen to open broadcast, currently only support mobile pure video type
     * @param VideoOrientation Horizontal and vertical screen. 0: Horizontal screen to open broadcast (default); 1: Vertical screen to open broadcast, currently only support mobile pure video type
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get Whether the room is enabled for grading after the lesson. 0: not enabled 1: enabled 
     * @return IsGradingRequiredPostClass Whether the room is enabled for grading after the lesson. 0: not enabled 1: enabled
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set Whether the room is enabled for grading after the lesson. 0: not enabled 1: enabled
     * @param IsGradingRequiredPostClass Whether the room is enabled for grading after the lesson. 0: not enabled 1: enabled
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
     * Get Recording Duration 
     * @return VideoDuration Recording Duration
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set Recording Duration
     * @param VideoDuration Recording Duration
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get Drag class time: unit minutes, 0 is unlimited (default), -1 is can't drag the class, greater than 0 is the time of dragging the class, the maximum value of 120 minutes 
     * @return EndDelayTime Drag class time: unit minutes, 0 is unlimited (default), -1 is can't drag the class, greater than 0 is the time of dragging the class, the maximum value of 120 minutes
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set Drag class time: unit minutes, 0 is unlimited (default), -1 is can't drag the class, greater than 0 is the time of dragging the class, the maximum value of 120 minutes
     * @param EndDelayTime Drag class time: unit minutes, 0 is unlimited (default), -1 is can't drag the class, greater than 0 is the time of dragging the class, the maximum value of 120 minutes
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get Live type: 0 regular (default) 1 Simulated Live 
     * @return LiveType Live type: 0 regular (default) 1 Simulated Live
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set Live type: 0 regular (default) 1 Simulated Live
     * @param LiveType Live type: 0 regular (default) 1 Simulated Live
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get Simulated Live link 
     * @return RecordLiveUrl Simulated Live link
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set Simulated Live link
     * @param RecordLiveUrl Simulated Live link
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get Whether to start the lesson automatically: 0 not automatic lesson (default) 1 automatic lesson live_type=1 is valid 
     * @return EnableAutoStart Whether to start the lesson automatically: 0 not automatic lesson (default) 1 automatic lesson live_type=1 is valid
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set Whether to start the lesson automatically: 0 not automatic lesson (default) 1 automatic lesson live_type=1 is valid
     * @param EnableAutoStart Whether to start the lesson automatically: 0 not automatic lesson (default) 1 automatic lesson live_type=1 is valid
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get Recorded file background image, support png, jpg, jpeg, bmp format, does not support transparent channel for the time being 
     * @return RecordBackground Recorded file background image, support png, jpg, jpeg, bmp format, does not support transparent channel for the time being
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set Recorded file background image, support png, jpg, jpeg, bmp format, does not support transparent channel for the time being
     * @param RecordBackground Recorded file background image, support png, jpg, jpeg, bmp format, does not support transparent channel for the time being
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get RTMP  stream link 
     * @return RTMPStreamingURL RTMP  stream link
     */
    public String getRTMPStreamingURL() {
        return this.RTMPStreamingURL;
    }

    /**
     * Set RTMP  stream link
     * @param RTMPStreamingURL RTMP  stream link
     */
    public void setRTMPStreamingURL(String RTMPStreamingURL) {
        this.RTMPStreamingURL = RTMPStreamingURL;
    }

    /**
     * Get Record customized scene, only recordlayout=9 this parameter is valid 
     * @return RecordScene Record customized scene, only recordlayout=9 this parameter is valid
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set Record customized scene, only recordlayout=9 this parameter is valid
     * @param RecordScene Record customized scene, only recordlayout=9 this parameter is valid
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get Record customized language, only when recordlayout=9, this parameter is valid 
     * @return RecordLang Record customized language, only when recordlayout=9, this parameter is valid
     */
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set Record customized language, only when recordlayout=9, this parameter is valid
     * @param RecordLang Record customized language, only when recordlayout=9, this parameter is valid
     */
    public void setRecordLang(String RecordLang) {
        this.RecordLang = RecordLang;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRoomResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomResponse(DescribeRoomResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudienceType != null) {
            this.AudienceType = new Long(source.AudienceType);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
        }
        if (source.AutoMic != null) {
            this.AutoMic = new Long(source.AutoMic);
        }
        if (source.AudioQuality != null) {
            this.AudioQuality = new Long(source.AudioQuality);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.DisableRecord != null) {
            this.DisableRecord = new Long(source.DisableRecord);
        }
        if (source.Assistants != null) {
            this.Assistants = new String[source.Assistants.length];
            for (int i = 0; i < source.Assistants.length; i++) {
                this.Assistants[i] = new String(source.Assistants[i]);
            }
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
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
        if (source.VideoDuration != null) {
            this.VideoDuration = new Long(source.VideoDuration);
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
        if (source.RTMPStreamingURL != null) {
            this.RTMPStreamingURL = new String(source.RTMPStreamingURL);
        }
        if (source.RecordScene != null) {
            this.RecordScene = new String(source.RecordScene);
        }
        if (source.RecordLang != null) {
            this.RecordLang = new String(source.RecordLang);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AudienceType", this.AudienceType);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableDirectControl", this.EnableDirectControl);
        this.setParamSimple(map, prefix + "InteractionMode", this.InteractionMode);
        this.setParamSimple(map, prefix + "VideoOrientation", this.VideoOrientation);
        this.setParamSimple(map, prefix + "IsGradingRequiredPostClass", this.IsGradingRequiredPostClass);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "EndDelayTime", this.EndDelayTime);
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "RecordLiveUrl", this.RecordLiveUrl);
        this.setParamSimple(map, prefix + "EnableAutoStart", this.EnableAutoStart);
        this.setParamSimple(map, prefix + "RecordBackground", this.RecordBackground);
        this.setParamSimple(map, prefix + "RTMPStreamingURL", this.RTMPStreamingURL);
        this.setParamSimple(map, prefix + "RecordScene", this.RecordScene);
        this.setParamSimple(map, prefix + "RecordLang", this.RecordLang);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

