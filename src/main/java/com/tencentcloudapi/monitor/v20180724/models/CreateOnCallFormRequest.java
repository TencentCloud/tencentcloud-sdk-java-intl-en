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

public class CreateOnCallFormRequest extends AbstractModel {

    /**
    * The fixed value is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * On-call schedule name.
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
    * On-call personnel ID group.
    */
    @SerializedName("StaffInfos")
    @Expose
    private StaffInfo [] StaffInfos;

    /**
    * Rotation type.
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * Shift change time.
    */
    @SerializedName("ShiftTime")
    @Expose
    private String ShiftTime;

    /**
    * Effect time. Unit: seconds.
    */
    @SerializedName("EffectiveStartTime")
    @Expose
    private Long EffectiveStartTime;

    /**
    * End time of the validity period (in seconds).
    */
    @SerializedName("EffectiveEndTime")
    @Expose
    private Long EffectiveEndTime;

    /**
    * Time zone (-12 to 12).
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * Description of the shift schedule.
    */
    @SerializedName("OnCallFormDesc")
    @Expose
    private String OnCallFormDesc;

    /**
    * Shift information.
    */
    @SerializedName("CoverStaffInfos")
    @Expose
    private CoverStaffInfo [] CoverStaffInfos;

    /**
    * Tag bound to the template
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get The fixed value is monitor. 
     * @return Module The fixed value is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The fixed value is monitor.
     * @param Module The fixed value is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get On-call schedule name. 
     * @return OnCallFormName On-call schedule name.
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set On-call schedule name.
     * @param OnCallFormName On-call schedule name.
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    /**
     * Get On-call personnel ID group. 
     * @return StaffInfos On-call personnel ID group.
     */
    public StaffInfo [] getStaffInfos() {
        return this.StaffInfos;
    }

    /**
     * Set On-call personnel ID group.
     * @param StaffInfos On-call personnel ID group.
     */
    public void setStaffInfos(StaffInfo [] StaffInfos) {
        this.StaffInfos = StaffInfos;
    }

    /**
     * Get Rotation type. 
     * @return RotationType Rotation type.
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set Rotation type.
     * @param RotationType Rotation type.
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get Shift change time. 
     * @return ShiftTime Shift change time.
     */
    public String getShiftTime() {
        return this.ShiftTime;
    }

    /**
     * Set Shift change time.
     * @param ShiftTime Shift change time.
     */
    public void setShiftTime(String ShiftTime) {
        this.ShiftTime = ShiftTime;
    }

    /**
     * Get Effect time. Unit: seconds. 
     * @return EffectiveStartTime Effect time. Unit: seconds.
     */
    public Long getEffectiveStartTime() {
        return this.EffectiveStartTime;
    }

    /**
     * Set Effect time. Unit: seconds.
     * @param EffectiveStartTime Effect time. Unit: seconds.
     */
    public void setEffectiveStartTime(Long EffectiveStartTime) {
        this.EffectiveStartTime = EffectiveStartTime;
    }

    /**
     * Get End time of the validity period (in seconds). 
     * @return EffectiveEndTime End time of the validity period (in seconds).
     */
    public Long getEffectiveEndTime() {
        return this.EffectiveEndTime;
    }

    /**
     * Set End time of the validity period (in seconds).
     * @param EffectiveEndTime End time of the validity period (in seconds).
     */
    public void setEffectiveEndTime(Long EffectiveEndTime) {
        this.EffectiveEndTime = EffectiveEndTime;
    }

    /**
     * Get Time zone (-12 to 12). 
     * @return TimeZone Time zone (-12 to 12).
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone (-12 to 12).
     * @param TimeZone Time zone (-12 to 12).
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Description of the shift schedule. 
     * @return OnCallFormDesc Description of the shift schedule.
     */
    public String getOnCallFormDesc() {
        return this.OnCallFormDesc;
    }

    /**
     * Set Description of the shift schedule.
     * @param OnCallFormDesc Description of the shift schedule.
     */
    public void setOnCallFormDesc(String OnCallFormDesc) {
        this.OnCallFormDesc = OnCallFormDesc;
    }

    /**
     * Get Shift information. 
     * @return CoverStaffInfos Shift information.
     */
    public CoverStaffInfo [] getCoverStaffInfos() {
        return this.CoverStaffInfos;
    }

    /**
     * Set Shift information.
     * @param CoverStaffInfos Shift information.
     */
    public void setCoverStaffInfos(CoverStaffInfo [] CoverStaffInfos) {
        this.CoverStaffInfos = CoverStaffInfos;
    }

    /**
     * Get Tag bound to the template 
     * @return Tags Tag bound to the template
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag bound to the template
     * @param Tags Tag bound to the template
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateOnCallFormRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOnCallFormRequest(CreateOnCallFormRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
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
        if (source.OnCallFormDesc != null) {
            this.OnCallFormDesc = new String(source.OnCallFormDesc);
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
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);
        this.setParamArrayObj(map, prefix + "StaffInfos.", this.StaffInfos);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "ShiftTime", this.ShiftTime);
        this.setParamSimple(map, prefix + "EffectiveStartTime", this.EffectiveStartTime);
        this.setParamSimple(map, prefix + "EffectiveEndTime", this.EffectiveEndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "OnCallFormDesc", this.OnCallFormDesc);
        this.setParamArrayObj(map, prefix + "CoverStaffInfos.", this.CoverStaffInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

