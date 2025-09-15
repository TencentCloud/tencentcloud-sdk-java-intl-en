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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StageInfoDetail extends AbstractModel {

    /**
    * Steps.
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * Step name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Indicates whether to display
    */
    @SerializedName("IsShow")
    @Expose
    private Boolean IsShow;

    /**
    * Whether it is a subprocess
    */
    @SerializedName("IsSubFlow")
    @Expose
    private Boolean IsSubFlow;

    /**
    * Subprocess tag.
    */
    @SerializedName("SubFlowFlag")
    @Expose
    private String SubFlowFlag;

    /**
    * Step execution status. 0: not started, 1: in progress, 2: completed, 3: partially completed, -1: failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Step running status description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Running progress.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Start time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Starttime")
    @Expose
    private String Starttime;

    /**
    * End time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endtime")
    @Expose
    private String Endtime;

    /**
    * Whether details are included.
    */
    @SerializedName("HadWoodDetail")
    @Expose
    private Boolean HadWoodDetail;

    /**
    * Wood subprocess ID.
    */
    @SerializedName("WoodJobId")
    @Expose
    private Long WoodJobId;

    /**
    * Multi-language version key.
    */
    @SerializedName("LanguageKey")
    @Expose
    private String LanguageKey;

    /**
    * Reason for stage failure.
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * Step duration.
    */
    @SerializedName("TimeConsuming")
    @Expose
    private String TimeConsuming;

    /**
    * 
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Steps. 
     * @return Stage Steps.
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set Steps.
     * @param Stage Steps.
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get Step name. 
     * @return Name Step name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Step name.
     * @param Name Step name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Indicates whether to display 
     * @return IsShow Indicates whether to display
     */
    public Boolean getIsShow() {
        return this.IsShow;
    }

    /**
     * Set Indicates whether to display
     * @param IsShow Indicates whether to display
     */
    public void setIsShow(Boolean IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get Whether it is a subprocess 
     * @return IsSubFlow Whether it is a subprocess
     */
    public Boolean getIsSubFlow() {
        return this.IsSubFlow;
    }

    /**
     * Set Whether it is a subprocess
     * @param IsSubFlow Whether it is a subprocess
     */
    public void setIsSubFlow(Boolean IsSubFlow) {
        this.IsSubFlow = IsSubFlow;
    }

    /**
     * Get Subprocess tag. 
     * @return SubFlowFlag Subprocess tag.
     */
    public String getSubFlowFlag() {
        return this.SubFlowFlag;
    }

    /**
     * Set Subprocess tag.
     * @param SubFlowFlag Subprocess tag.
     */
    public void setSubFlowFlag(String SubFlowFlag) {
        this.SubFlowFlag = SubFlowFlag;
    }

    /**
     * Get Step execution status. 0: not started, 1: in progress, 2: completed, 3: partially completed, -1: failed 
     * @return Status Step execution status. 0: not started, 1: in progress, 2: completed, 3: partially completed, -1: failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Step execution status. 0: not started, 1: in progress, 2: completed, 3: partially completed, -1: failed
     * @param Status Step execution status. 0: not started, 1: in progress, 2: completed, 3: partially completed, -1: failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Step running status description. 
     * @return Desc Step running status description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Step running status description.
     * @param Desc Step running status description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Running progress. 
     * @return Progress Running progress.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Running progress.
     * @param Progress Running progress.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Start time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Starttime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStarttime() {
        return this.Starttime;
    }

    /**
     * Set Start time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Starttime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStarttime(String Starttime) {
        this.Starttime = Starttime;
    }

    /**
     * Get End time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Endtime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndtime() {
        return this.Endtime;
    }

    /**
     * Set End time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Endtime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndtime(String Endtime) {
        this.Endtime = Endtime;
    }

    /**
     * Get Whether details are included. 
     * @return HadWoodDetail Whether details are included.
     */
    public Boolean getHadWoodDetail() {
        return this.HadWoodDetail;
    }

    /**
     * Set Whether details are included.
     * @param HadWoodDetail Whether details are included.
     */
    public void setHadWoodDetail(Boolean HadWoodDetail) {
        this.HadWoodDetail = HadWoodDetail;
    }

    /**
     * Get Wood subprocess ID. 
     * @return WoodJobId Wood subprocess ID.
     */
    public Long getWoodJobId() {
        return this.WoodJobId;
    }

    /**
     * Set Wood subprocess ID.
     * @param WoodJobId Wood subprocess ID.
     */
    public void setWoodJobId(Long WoodJobId) {
        this.WoodJobId = WoodJobId;
    }

    /**
     * Get Multi-language version key. 
     * @return LanguageKey Multi-language version key.
     */
    public String getLanguageKey() {
        return this.LanguageKey;
    }

    /**
     * Set Multi-language version key.
     * @param LanguageKey Multi-language version key.
     */
    public void setLanguageKey(String LanguageKey) {
        this.LanguageKey = LanguageKey;
    }

    /**
     * Get Reason for stage failure. 
     * @return FailedReason Reason for stage failure.
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Reason for stage failure.
     * @param FailedReason Reason for stage failure.
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get Step duration. 
     * @return TimeConsuming Step duration.
     */
    public String getTimeConsuming() {
        return this.TimeConsuming;
    }

    /**
     * Set Step duration.
     * @param TimeConsuming Step duration.
     */
    public void setTimeConsuming(String TimeConsuming) {
        this.TimeConsuming = TimeConsuming;
    }

    /**
     * Get  
     * @return Id 
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 
     * @param Id 
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public StageInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StageInfoDetail(StageInfoDetail source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsShow != null) {
            this.IsShow = new Boolean(source.IsShow);
        }
        if (source.IsSubFlow != null) {
            this.IsSubFlow = new Boolean(source.IsSubFlow);
        }
        if (source.SubFlowFlag != null) {
            this.SubFlowFlag = new String(source.SubFlowFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Starttime != null) {
            this.Starttime = new String(source.Starttime);
        }
        if (source.Endtime != null) {
            this.Endtime = new String(source.Endtime);
        }
        if (source.HadWoodDetail != null) {
            this.HadWoodDetail = new Boolean(source.HadWoodDetail);
        }
        if (source.WoodJobId != null) {
            this.WoodJobId = new Long(source.WoodJobId);
        }
        if (source.LanguageKey != null) {
            this.LanguageKey = new String(source.LanguageKey);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.TimeConsuming != null) {
            this.TimeConsuming = new String(source.TimeConsuming);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsShow", this.IsShow);
        this.setParamSimple(map, prefix + "IsSubFlow", this.IsSubFlow);
        this.setParamSimple(map, prefix + "SubFlowFlag", this.SubFlowFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Starttime", this.Starttime);
        this.setParamSimple(map, prefix + "Endtime", this.Endtime);
        this.setParamSimple(map, prefix + "HadWoodDetail", this.HadWoodDetail);
        this.setParamSimple(map, prefix + "WoodJobId", this.WoodJobId);
        this.setParamSimple(map, prefix + "LanguageKey", this.LanguageKey);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "TimeConsuming", this.TimeConsuming);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

