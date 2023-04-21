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

public class CreateRoomRequest extends AbstractModel{

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
    * LCIC SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 	Resolution. Valid values: 1: SD; 2: HD; 3: FHD
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
    * The room subtype. Valid values: videodoc: Document + Video; video: Video only.
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * The user ID of the teacher. User IDs are returned by the user registration APIs. The user specified will have teacher permissions in the room created.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * Whether to automatically turn the mic on when the user enters a room. Valid values: 0: No (default value); 1: Yes.
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * Whether to disconnect communication after audio/video permissions are revoked. Valid values: `0` (default): Yes; `1`: No.
    */
    @SerializedName("TurnOffMic")
    @Expose
    private Long TurnOffMic;

    /**
    * Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes.
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends.
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * The user IDs of the teaching assistants. User IDs are returned by the user registration APIs. The users specified will have teaching assistant permissions in the room created.
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * The number of RTC users.
    */
    @SerializedName("RTCAudienceNumber")
    @Expose
    private Long RTCAudienceNumber;

    /**
    * The audience type.
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * Recording layout
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * The ID of the group to bind. If you specify this parameter, only members of the group can enter this room.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

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
     * Get 	Resolution. Valid values: 1: SD; 2: HD; 3: FHD 
     * @return Resolution 	Resolution. Valid values: 1: SD; 2: HD; 3: FHD
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 	Resolution. Valid values: 1: SD; 2: HD; 3: FHD
     * @param Resolution 	Resolution. Valid values: 1: SD; 2: HD; 3: FHD
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
     * Get The user ID of the teacher. User IDs are returned by the user registration APIs. The user specified will have teacher permissions in the room created. 
     * @return TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs. The user specified will have teacher permissions in the room created.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set The user ID of the teacher. User IDs are returned by the user registration APIs. The user specified will have teacher permissions in the room created.
     * @param TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs. The user specified will have teacher permissions in the room created.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
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
     * Get Whether to disconnect communication after audio/video permissions are revoked. Valid values: `0` (default): Yes; `1`: No. 
     * @return TurnOffMic Whether to disconnect communication after audio/video permissions are revoked. Valid values: `0` (default): Yes; `1`: No.
     */
    public Long getTurnOffMic() {
        return this.TurnOffMic;
    }

    /**
     * Set Whether to disconnect communication after audio/video permissions are revoked. Valid values: `0` (default): Yes; `1`: No.
     * @param TurnOffMic Whether to disconnect communication after audio/video permissions are revoked. Valid values: `0` (default): Yes; `1`: No.
     */
    public void setTurnOffMic(Long TurnOffMic) {
        this.TurnOffMic = TurnOffMic;
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
     * Get The user IDs of the teaching assistants. User IDs are returned by the user registration APIs. The users specified will have teaching assistant permissions in the room created. 
     * @return Assistants The user IDs of the teaching assistants. User IDs are returned by the user registration APIs. The users specified will have teaching assistant permissions in the room created.
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set The user IDs of the teaching assistants. User IDs are returned by the user registration APIs. The users specified will have teaching assistant permissions in the room created.
     * @param Assistants The user IDs of the teaching assistants. User IDs are returned by the user registration APIs. The users specified will have teaching assistant permissions in the room created.
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get The number of RTC users. 
     * @return RTCAudienceNumber The number of RTC users.
     */
    public Long getRTCAudienceNumber() {
        return this.RTCAudienceNumber;
    }

    /**
     * Set The number of RTC users.
     * @param RTCAudienceNumber The number of RTC users.
     */
    public void setRTCAudienceNumber(Long RTCAudienceNumber) {
        this.RTCAudienceNumber = RTCAudienceNumber;
    }

    /**
     * Get The audience type. 
     * @return AudienceType The audience type.
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set The audience type.
     * @param AudienceType The audience type.
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get Recording layout 
     * @return RecordLayout Recording layout
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set Recording layout
     * @param RecordLayout Recording layout
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
    }

    /**
     * Get The ID of the group to bind. If you specify this parameter, only members of the group can enter this room. 
     * @return GroupId The ID of the group to bind. If you specify this parameter, only members of the group can enter this room.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The ID of the group to bind. If you specify this parameter, only members of the group can enter this room.
     * @param GroupId The ID of the group to bind. If you specify this parameter, only members of the group can enter this room.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoomRequest(CreateRoomRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.AutoMic != null) {
            this.AutoMic = new Long(source.AutoMic);
        }
        if (source.TurnOffMic != null) {
            this.TurnOffMic = new Long(source.TurnOffMic);
        }
        if (source.AudioQuality != null) {
            this.AudioQuality = new Long(source.AudioQuality);
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
        if (source.RTCAudienceNumber != null) {
            this.RTCAudienceNumber = new Long(source.RTCAudienceNumber);
        }
        if (source.AudienceType != null) {
            this.AudienceType = new Long(source.AudienceType);
        }
        if (source.RecordLayout != null) {
            this.RecordLayout = new Long(source.RecordLayout);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "TurnOffMic", this.TurnOffMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "RTCAudienceNumber", this.RTCAudienceNumber);
        this.setParamSimple(map, prefix + "AudienceType", this.AudienceType);
        this.setParamSimple(map, prefix + "RecordLayout", this.RecordLayout);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

