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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServeParticipant extends AbstractModel {

    /**
    * Agent email.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Agent phone number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Ring timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * Answer timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * End timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * Recording ID can be indexed to the agent side recording.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Participant type: "staffSeat", "outboundSeat", "staffPhoneSeat".
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Transfer source agent information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferFrom")
    @Expose
    private String TransferFrom;

    /**
    * Transfer source participant type is consistent with the Type value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferFromType")
    @Expose
    private String TransferFromType;

    /**
    * Transfer destination agent information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferTo")
    @Expose
    private String TransferTo;

    /**
    * Transfer destination participant type is consistent with Type values.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransferToType")
    @Expose
    private String TransferToType;

    /**
    * Skill group ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Ending status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * Recording URL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * Participant sequence number, starting from 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * Start timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * Skill Group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
     * Get Agent email.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mail Agent email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Agent email.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mail Agent email.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Agent phone number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phone Agent phone number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent phone number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phone Agent phone number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Ring timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RingTimestamp Ring timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set Ring timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RingTimestamp Ring timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get Answer timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AcceptTimestamp Answer timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set Answer timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AcceptTimestamp Answer timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get End timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndedTimestamp End timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set End timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndedTimestamp End timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get Recording ID can be indexed to the agent side recording.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordId Recording ID can be indexed to the agent side recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Recording ID can be indexed to the agent side recording.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordId Recording ID can be indexed to the agent side recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Participant type: "staffSeat", "outboundSeat", "staffPhoneSeat".
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Participant type: "staffSeat", "outboundSeat", "staffPhoneSeat".
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Participant type: "staffSeat", "outboundSeat", "staffPhoneSeat".
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Participant type: "staffSeat", "outboundSeat", "staffPhoneSeat".
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Transfer source agent information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferFrom Transfer source agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferFrom() {
        return this.TransferFrom;
    }

    /**
     * Set Transfer source agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferFrom Transfer source agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferFrom(String TransferFrom) {
        this.TransferFrom = TransferFrom;
    }

    /**
     * Get Transfer source participant type is consistent with the Type value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferFromType Transfer source participant type is consistent with the Type value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferFromType() {
        return this.TransferFromType;
    }

    /**
     * Set Transfer source participant type is consistent with the Type value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferFromType Transfer source participant type is consistent with the Type value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferFromType(String TransferFromType) {
        this.TransferFromType = TransferFromType;
    }

    /**
     * Get Transfer destination agent information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferTo Transfer destination agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferTo() {
        return this.TransferTo;
    }

    /**
     * Set Transfer destination agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferTo Transfer destination agent information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferTo(String TransferTo) {
        this.TransferTo = TransferTo;
    }

    /**
     * Get Transfer destination participant type is consistent with Type values.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransferToType Transfer destination participant type is consistent with Type values.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransferToType() {
        return this.TransferToType;
    }

    /**
     * Set Transfer destination participant type is consistent with Type values.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransferToType Transfer destination participant type is consistent with Type values.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransferToType(String TransferToType) {
        this.TransferToType = TransferToType;
    }

    /**
     * Get Skill group ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupId Skill group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupId Skill group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Ending status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndStatusString Ending status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set Ending status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndStatusString Ending status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get Recording URL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordURL Recording URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set Recording URL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordURL Recording URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get Participant sequence number, starting from 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sequence Participant sequence number, starting from 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set Participant sequence number, starting from 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sequence Participant sequence number, starting from 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get Start timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTimestamp Start timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Start timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTimestamp Start timestamp. Unix second-level timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get Skill Group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupName Skill Group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Skill Group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupName Skill Group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomRecordURL Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomRecordURL Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    public ServeParticipant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServeParticipant(ServeParticipant source) {
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.RingTimestamp != null) {
            this.RingTimestamp = new Long(source.RingTimestamp);
        }
        if (source.AcceptTimestamp != null) {
            this.AcceptTimestamp = new Long(source.AcceptTimestamp);
        }
        if (source.EndedTimestamp != null) {
            this.EndedTimestamp = new Long(source.EndedTimestamp);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TransferFrom != null) {
            this.TransferFrom = new String(source.TransferFrom);
        }
        if (source.TransferFromType != null) {
            this.TransferFromType = new String(source.TransferFromType);
        }
        if (source.TransferTo != null) {
            this.TransferTo = new String(source.TransferTo);
        }
        if (source.TransferToType != null) {
            this.TransferToType = new String(source.TransferToType);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.EndStatusString != null) {
            this.EndStatusString = new String(source.EndStatusString);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TransferFrom", this.TransferFrom);
        this.setParamSimple(map, prefix + "TransferFromType", this.TransferFromType);
        this.setParamSimple(map, prefix + "TransferTo", this.TransferTo);
        this.setParamSimple(map, prefix + "TransferToType", this.TransferToType);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "EndStatusString", this.EndStatusString);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);

    }
}

