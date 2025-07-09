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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServeParticipant extends AbstractModel {

    /**
    * Agent email.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Agent phone number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Ringing timestamp, unix second-level timestamp.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * Answer timestamp. unix second-level timestamp.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * End timestamp. unix second-level timestamp.
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * Recording id can be indexed to the agent side recording.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Participant type: "staffseat", "outboundseat", "staffphoneseat".
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Transfer source agent information.
    */
    @SerializedName("TransferFrom")
    @Expose
    private String TransferFrom;

    /**
    * Transfer source participant type is consistent with the type value.
    */
    @SerializedName("TransferFromType")
    @Expose
    private String TransferFromType;

    /**
    * Transfer destination agent information.
    */
    @SerializedName("TransferTo")
    @Expose
    private String TransferTo;

    /**
    * Transfer destination participant type, which is consistent with type values.
    */
    @SerializedName("TransferToType")
    @Expose
    private String TransferToType;

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Ending status.
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * Recording url.
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * Participant sequence number, starting from 0.
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * Start timestamp. unix second-level timestamp.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * Skill group name.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * Address of the third-party cos for transferring recording.
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
     * Get Agent email. 
     * @return Mail Agent email.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Agent email.
     * @param Mail Agent email.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Agent phone number. 
     * @return Phone Agent phone number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Agent phone number.
     * @param Phone Agent phone number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Ringing timestamp, unix second-level timestamp. 
     * @return RingTimestamp Ringing timestamp, unix second-level timestamp.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set Ringing timestamp, unix second-level timestamp.
     * @param RingTimestamp Ringing timestamp, unix second-level timestamp.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get Answer timestamp. unix second-level timestamp. 
     * @return AcceptTimestamp Answer timestamp. unix second-level timestamp.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set Answer timestamp. unix second-level timestamp.
     * @param AcceptTimestamp Answer timestamp. unix second-level timestamp.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get End timestamp. unix second-level timestamp. 
     * @return EndedTimestamp End timestamp. unix second-level timestamp.
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set End timestamp. unix second-level timestamp.
     * @param EndedTimestamp End timestamp. unix second-level timestamp.
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get Recording id can be indexed to the agent side recording. 
     * @return RecordId Recording id can be indexed to the agent side recording.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Recording id can be indexed to the agent side recording.
     * @param RecordId Recording id can be indexed to the agent side recording.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Participant type: "staffseat", "outboundseat", "staffphoneseat". 
     * @return Type Participant type: "staffseat", "outboundseat", "staffphoneseat".
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Participant type: "staffseat", "outboundseat", "staffphoneseat".
     * @param Type Participant type: "staffseat", "outboundseat", "staffphoneseat".
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Transfer source agent information. 
     * @return TransferFrom Transfer source agent information.
     */
    public String getTransferFrom() {
        return this.TransferFrom;
    }

    /**
     * Set Transfer source agent information.
     * @param TransferFrom Transfer source agent information.
     */
    public void setTransferFrom(String TransferFrom) {
        this.TransferFrom = TransferFrom;
    }

    /**
     * Get Transfer source participant type is consistent with the type value. 
     * @return TransferFromType Transfer source participant type is consistent with the type value.
     */
    public String getTransferFromType() {
        return this.TransferFromType;
    }

    /**
     * Set Transfer source participant type is consistent with the type value.
     * @param TransferFromType Transfer source participant type is consistent with the type value.
     */
    public void setTransferFromType(String TransferFromType) {
        this.TransferFromType = TransferFromType;
    }

    /**
     * Get Transfer destination agent information. 
     * @return TransferTo Transfer destination agent information.
     */
    public String getTransferTo() {
        return this.TransferTo;
    }

    /**
     * Set Transfer destination agent information.
     * @param TransferTo Transfer destination agent information.
     */
    public void setTransferTo(String TransferTo) {
        this.TransferTo = TransferTo;
    }

    /**
     * Get Transfer destination participant type, which is consistent with type values. 
     * @return TransferToType Transfer destination participant type, which is consistent with type values.
     */
    public String getTransferToType() {
        return this.TransferToType;
    }

    /**
     * Set Transfer destination participant type, which is consistent with type values.
     * @param TransferToType Transfer destination participant type, which is consistent with type values.
     */
    public void setTransferToType(String TransferToType) {
        this.TransferToType = TransferToType;
    }

    /**
     * Get Skill group id. 
     * @return SkillGroupId Skill group id.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupId Skill group id.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Ending status. 
     * @return EndStatusString Ending status.
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set Ending status.
     * @param EndStatusString Ending status.
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get Recording url. 
     * @return RecordURL Recording url.
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set Recording url.
     * @param RecordURL Recording url.
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get Participant sequence number, starting from 0. 
     * @return Sequence Participant sequence number, starting from 0.
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set Participant sequence number, starting from 0.
     * @param Sequence Participant sequence number, starting from 0.
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get Start timestamp. unix second-level timestamp. 
     * @return StartTimestamp Start timestamp. unix second-level timestamp.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Start timestamp. unix second-level timestamp.
     * @param StartTimestamp Start timestamp. unix second-level timestamp.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get Skill group name. 
     * @return SkillGroupName Skill group name.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Skill group name.
     * @param SkillGroupName Skill group name.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get Address of the third-party cos for transferring recording. 
     * @return CustomRecordURL Address of the third-party cos for transferring recording.
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set Address of the third-party cos for transferring recording.
     * @param CustomRecordURL Address of the third-party cos for transferring recording.
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

