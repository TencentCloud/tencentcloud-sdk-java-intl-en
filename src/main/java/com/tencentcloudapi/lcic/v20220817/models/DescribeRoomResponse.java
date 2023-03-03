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

public class DescribeRoomResponse extends AbstractModel{

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
    * Resolution. Valid values: `1`: SD; `2`: HD; `3`: FHD	
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
    * Whether to automatically turn the mic on when the user enters a room. Valid values: `0`: No (default value); `1`: Yes.	
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * Whether to enable the high audio quality mode. Valid values: `0`: No (default value); `1`: Yes.	
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only.
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * Whether to disable auto recording. Valid values: `0`: No (default); `1`: Yes. If this parameter is `0`, recording will start when the class starts and stops when the class ends.	
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * Assistant ID list	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * Recording URL. This parameter exists only after a room is ended.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * The class status. `0`: The class has not started. `1`: The class has started. `2`: The class ended. `3`: The class expired.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
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
     * Get Resolution. Valid values: `1`: SD; `2`: HD; `3`: FHD	 
     * @return Resolution Resolution. Valid values: `1`: SD; `2`: HD; `3`: FHD	
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution. Valid values: `1`: SD; `2`: HD; `3`: FHD	
     * @param Resolution Resolution. Valid values: `1`: SD; `2`: HD; `3`: FHD	
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
     * Get Whether to automatically turn the mic on when the user enters a room. Valid values: `0`: No (default value); `1`: Yes.	 
     * @return AutoMic Whether to automatically turn the mic on when the user enters a room. Valid values: `0`: No (default value); `1`: Yes.	
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set Whether to automatically turn the mic on when the user enters a room. Valid values: `0`: No (default value); `1`: Yes.	
     * @param AutoMic Whether to automatically turn the mic on when the user enters a room. Valid values: `0`: No (default value); `1`: Yes.	
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get Whether to enable the high audio quality mode. Valid values: `0`: No (default value); `1`: Yes.	 
     * @return AudioQuality Whether to enable the high audio quality mode. Valid values: `0`: No (default value); `1`: Yes.	
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set Whether to enable the high audio quality mode. Valid values: `0`: No (default value); `1`: Yes.	
     * @param AudioQuality Whether to enable the high audio quality mode. Valid values: `0`: No (default value); `1`: Yes.	
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only. 
     * @return SubType The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only.
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only.
     * @param SubType The room subtype. Valid values: `videodoc`: Document + Video; `video`: Video only.
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get Whether to disable auto recording. Valid values: `0`: No (default); `1`: Yes. If this parameter is `0`, recording will start when the class starts and stops when the class ends.	 
     * @return DisableRecord Whether to disable auto recording. Valid values: `0`: No (default); `1`: Yes. If this parameter is `0`, recording will start when the class starts and stops when the class ends.	
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set Whether to disable auto recording. Valid values: `0`: No (default); `1`: Yes. If this parameter is `0`, recording will start when the class starts and stops when the class ends.	
     * @param DisableRecord Whether to disable auto recording. Valid values: `0`: No (default); `1`: Yes. If this parameter is `0`, recording will start when the class starts and stops when the class ends.	
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get Assistant ID list	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Assistants Assistant ID list	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set Assistant ID list	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Assistants Assistant ID list	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get Recording URL. This parameter exists only after a room is ended.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordUrl Recording URL. This parameter exists only after a room is ended.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set Recording URL. This parameter exists only after a room is ended.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordUrl Recording URL. This parameter exists only after a room is ended.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get The class status. `0`: The class has not started. `1`: The class has started. `2`: The class ended. `3`: The class expired.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The class status. `0`: The class has not started. `1`: The class has started. `2`: The class ended. `3`: The class expired.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The class status. `0`: The class has not started. `1`: The class has started. `2`: The class ended. `3`: The class expired.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The class status. `0`: The class has not started. `1`: The class has started. `2`: The class ended. `3`: The class expired.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

