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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OneOnCallForm extends AbstractModel {

    /**
    * Duty ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnCallFormID")
    @Expose
    private String OnCallFormID;

    /**
    * On-call name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
    * Shift description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnCallFormDesc")
    @Expose
    private String OnCallFormDesc;

    /**
    * On-duty personnel
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StaffInfos")
    @Expose
    private StaffInfo [] StaffInfos;

    /**
    * Rotation type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * Shift change time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShiftTime")
    @Expose
    private String ShiftTime;

    /**
    * Start time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectiveStartTime")
    @Expose
    private Long EffectiveStartTime;

    /**
    * End time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectiveEndTime")
    @Expose
    private Long EffectiveEndTime;

    /**
    * Time zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * Shift information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverStaffInfos")
    @Expose
    private CoverStaffInfo [] CoverStaffInfos;

    /**
    * Tag bound to the template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Duty ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnCallFormID Duty ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOnCallFormID() {
        return this.OnCallFormID;
    }

    /**
     * Set Duty ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnCallFormID Duty ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnCallFormID(String OnCallFormID) {
        this.OnCallFormID = OnCallFormID;
    }

    /**
     * Get On-call name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnCallFormName On-call name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set On-call name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnCallFormName On-call name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    /**
     * Get Shift description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnCallFormDesc Shift description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOnCallFormDesc() {
        return this.OnCallFormDesc;
    }

    /**
     * Set Shift description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnCallFormDesc Shift description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnCallFormDesc(String OnCallFormDesc) {
        this.OnCallFormDesc = OnCallFormDesc;
    }

    /**
     * Get On-duty personnel
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StaffInfos On-duty personnel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StaffInfo [] getStaffInfos() {
        return this.StaffInfos;
    }

    /**
     * Set On-duty personnel
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StaffInfos On-duty personnel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStaffInfos(StaffInfo [] StaffInfos) {
        this.StaffInfos = StaffInfos;
    }

    /**
     * Get Rotation type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RotationType Rotation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set Rotation type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RotationType Rotation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get Shift change time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShiftTime Shift change time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getShiftTime() {
        return this.ShiftTime;
    }

    /**
     * Set Shift change time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShiftTime Shift change time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShiftTime(String ShiftTime) {
        this.ShiftTime = ShiftTime;
    }

    /**
     * Get Start time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectiveStartTime Start time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectiveStartTime() {
        return this.EffectiveStartTime;
    }

    /**
     * Set Start time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectiveStartTime Start time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectiveStartTime(Long EffectiveStartTime) {
        this.EffectiveStartTime = EffectiveStartTime;
    }

    /**
     * Get End time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectiveEndTime End time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectiveEndTime() {
        return this.EffectiveEndTime;
    }

    /**
     * Set End time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectiveEndTime End time of the on-call validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectiveEndTime(Long EffectiveEndTime) {
        this.EffectiveEndTime = EffectiveEndTime;
    }

    /**
     * Get Time zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Shift information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoverStaffInfos Shift information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CoverStaffInfo [] getCoverStaffInfos() {
        return this.CoverStaffInfos;
    }

    /**
     * Set Shift information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoverStaffInfos Shift information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverStaffInfos(CoverStaffInfo [] CoverStaffInfos) {
        this.CoverStaffInfos = CoverStaffInfos;
    }

    /**
     * Get Tag bound to the template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag bound to the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag bound to the template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag bound to the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public OneOnCallForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneOnCallForm(OneOnCallForm source) {
        if (source.OnCallFormID != null) {
            this.OnCallFormID = new String(source.OnCallFormID);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
        }
        if (source.OnCallFormDesc != null) {
            this.OnCallFormDesc = new String(source.OnCallFormDesc);
        }
        if (source.StaffInfos != null) {
            this.StaffInfos = new StaffInfo[source.StaffInfos.length];
            for (int i = 0; i < source.StaffInfos.length; i++) {
                this.StaffInfos[i] = new StaffInfo(source.StaffInfos[i]);
            }
        }
        if (source.RotationType != null) {
            this.RotationType = new String(source.RotationType);
        }
        if (source.ShiftTime != null) {
            this.ShiftTime = new String(source.ShiftTime);
        }
        if (source.EffectiveStartTime != null) {
            this.EffectiveStartTime = new Long(source.EffectiveStartTime);
        }
        if (source.EffectiveEndTime != null) {
            this.EffectiveEndTime = new Long(source.EffectiveEndTime);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Float(source.TimeZone);
        }
        if (source.CoverStaffInfos != null) {
            this.CoverStaffInfos = new CoverStaffInfo[source.CoverStaffInfos.length];
            for (int i = 0; i < source.CoverStaffInfos.length; i++) {
                this.CoverStaffInfos[i] = new CoverStaffInfo(source.CoverStaffInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnCallFormID", this.OnCallFormID);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);
        this.setParamSimple(map, prefix + "OnCallFormDesc", this.OnCallFormDesc);
        this.setParamArrayObj(map, prefix + "StaffInfos.", this.StaffInfos);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "ShiftTime", this.ShiftTime);
        this.setParamSimple(map, prefix + "EffectiveStartTime", this.EffectiveStartTime);
        this.setParamSimple(map, prefix + "EffectiveEndTime", this.EffectiveEndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArrayObj(map, prefix + "CoverStaffInfos.", this.CoverStaffInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

