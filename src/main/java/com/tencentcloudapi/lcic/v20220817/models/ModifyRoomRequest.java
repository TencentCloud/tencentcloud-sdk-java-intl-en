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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoomRequest extends AbstractModel{

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The room start time (Unix timestamp).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The room end time (Unix timestamp).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The user ID of the teacher. User IDs are returned by the user registration APIs.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * The room name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The resolution. Valid values: 1: SD; 2: HD; 3: FHD.
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * The maximum number of mic-on users (excluding the teacher). Value range: 0-16.
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes.
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
    * The room subtype. Valid values: videodoc: Document + Video; video: Video only; coteaching: Dual-teacher.
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
    * The user IDs of the teacher assistants. User IDs are returned by the user registration APIs.
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * The ID of the group to bind.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get The room ID. 
     * @return RoomId The room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
     * @param RoomId The room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The SDKAppID assigned by LCIC. 
     * @return SdkAppId The SDKAppID assigned by LCIC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.
     * @param SdkAppId The SDKAppID assigned by LCIC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The room start time (Unix timestamp). 
     * @return StartTime The room start time (Unix timestamp).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The room start time (Unix timestamp).
     * @param StartTime The room start time (Unix timestamp).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The room end time (Unix timestamp). 
     * @return EndTime The room end time (Unix timestamp).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The room end time (Unix timestamp).
     * @param EndTime The room end time (Unix timestamp).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The user ID of the teacher. User IDs are returned by the user registration APIs. 
     * @return TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set The user ID of the teacher. User IDs are returned by the user registration APIs.
     * @param TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get The room name. 
     * @return Name The room name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The room name.
     * @param Name The room name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The resolution. Valid values: 1: SD; 2: HD; 3: FHD. 
     * @return Resolution The resolution. Valid values: 1: SD; 2: HD; 3: FHD.
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set The resolution. Valid values: 1: SD; 2: HD; 3: FHD.
     * @param Resolution The resolution. Valid values: 1: SD; 2: HD; 3: FHD.
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get The maximum number of mic-on users (excluding the teacher). Value range: 0-16. 
     * @return MaxMicNumber The maximum number of mic-on users (excluding the teacher). Value range: 0-16.
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set The maximum number of mic-on users (excluding the teacher). Value range: 0-16.
     * @param MaxMicNumber The maximum number of mic-on users (excluding the teacher). Value range: 0-16.
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. 
     * @return AutoMic Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes.
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes.
     * @param AutoMic Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes.
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
     * Get The room subtype. Valid values: videodoc: Document + Video; video: Video only; coteaching: Dual-teacher. 
     * @return SubType The room subtype. Valid values: videodoc: Document + Video; video: Video only; coteaching: Dual-teacher.
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set The room subtype. Valid values: videodoc: Document + Video; video: Video only; coteaching: Dual-teacher.
     * @param SubType The room subtype. Valid values: videodoc: Document + Video; video: Video only; coteaching: Dual-teacher.
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
     * Get The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. 
     * @return Assistants The user IDs of the teacher assistants. User IDs are returned by the user registration APIs.
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set The user IDs of the teacher assistants. User IDs are returned by the user registration APIs.
     * @param Assistants The user IDs of the teacher assistants. User IDs are returned by the user registration APIs.
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get The ID of the group to bind. 
     * @return GroupId The ID of the group to bind.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The ID of the group to bind.
     * @param GroupId The ID of the group to bind.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoomRequest(ModifyRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

