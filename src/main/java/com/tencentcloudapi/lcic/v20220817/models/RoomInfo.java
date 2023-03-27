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

public class RoomInfo extends AbstractModel{

    /**
    * The room name. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The room start time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The room end time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The resolution. Valid values: 1: SD; 2: HD; 3: FHD. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * The maximum number of mic-on users (excluding the teacher). Value range: 0-16. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only; `coteaching`: Dual-teacher.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * The user ID of the teacher. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * Whether to disconnect communication after audio/video permissions are revoked. Valid values: 0: Yes (default value); 1: No. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TurnOffMic")
    @Expose
    private Long TurnOffMic;

    /**
    * Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * The number of RTC users. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RTCAudienceNumber")
    @Expose
    private Long RTCAudienceNumber;

    /**
    * The audience type. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * The recording layout. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * The ID of the group to bind. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get The room name. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name The room name. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The room name. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name The room name. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The room start time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime The room start time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The room start time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime The room start time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The room end time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime The room end time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The room end time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime The room end time (Unix timestamp). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The resolution. Valid values: 1: SD; 2: HD; 3: FHD. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resolution The resolution. Valid values: 1: SD; 2: HD; 3: FHD. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set The resolution. Valid values: 1: SD; 2: HD; 3: FHD. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resolution The resolution. Valid values: 1: SD; 2: HD; 3: FHD. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get The maximum number of mic-on users (excluding the teacher). Value range: 0-16. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxMicNumber The maximum number of mic-on users (excluding the teacher). Value range: 0-16. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set The maximum number of mic-on users (excluding the teacher). Value range: 0-16. Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxMicNumber The maximum number of mic-on users (excluding the teacher). Value range: 0-16. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only; `coteaching`: Dual-teacher.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubType The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only; `coteaching`: Dual-teacher.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only; `coteaching`: Dual-teacher.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubType The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only; `coteaching`: Dual-teacher.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get The user ID of the teacher. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set The user ID of the teacher. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeacherId The user ID of the teacher. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoMic Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoMic Whether to automatically turn the mic on when a user enters the room. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get Whether to disconnect communication after audio/video permissions are revoked. Valid values: 0: Yes (default value); 1: No. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TurnOffMic Whether to disconnect communication after audio/video permissions are revoked. Valid values: 0: Yes (default value); 1: No. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTurnOffMic() {
        return this.TurnOffMic;
    }

    /**
     * Set Whether to disconnect communication after audio/video permissions are revoked. Valid values: 0: Yes (default value); 1: No. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TurnOffMic Whether to disconnect communication after audio/video permissions are revoked. Valid values: 0: Yes (default value); 1: No. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTurnOffMic(Long TurnOffMic) {
        this.TurnOffMic = TurnOffMic;
    }

    /**
     * Get Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioQuality Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioQuality Whether to enable the high audio quality mode. Valid values: 0: No (default value); 1: Yes. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisableRecord Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisableRecord Whether to disable auto recording. Valid values: 0: No (default); 1: Yes. If this parameter is 0, recording will start when the class starts and stops when the class ends. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Assistants The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Assistants The user IDs of the teacher assistants. User IDs are returned by the user registration APIs. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get The number of RTC users. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RTCAudienceNumber The number of RTC users. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRTCAudienceNumber() {
        return this.RTCAudienceNumber;
    }

    /**
     * Set The number of RTC users. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RTCAudienceNumber The number of RTC users. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRTCAudienceNumber(Long RTCAudienceNumber) {
        this.RTCAudienceNumber = RTCAudienceNumber;
    }

    /**
     * Get The audience type. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudienceType The audience type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set The audience type. Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudienceType The audience type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get The recording layout. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordLayout The recording layout. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set The recording layout. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordLayout The recording layout. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
    }

    /**
     * Get The ID of the group to bind. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId The ID of the group to bind. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The ID of the group to bind. Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId The ID of the group to bind. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public RoomInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomInfo(RoomInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
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

