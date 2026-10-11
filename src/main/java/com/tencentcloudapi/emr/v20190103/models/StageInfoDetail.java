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
    * Step.
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
    * Whether it is displayed.
    */
    @SerializedName("IsShow")
    @Expose
    private Boolean IsShow;

    /**
    * Whether it is a sub-flow.
    */
    @SerializedName("IsSubFlow")
    @Expose
    private Boolean IsSubFlow;

    /**
    * Sub-flow tag.
    */
    @SerializedName("SubFlowFlag")
    @Expose
    private String SubFlowFlag;

    /**
    * Step running status. Valid values: 0 (not started), 1 (in progress), 2 (completed), 3 (partially completed), and -1 (failed).
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
    * Start time.
    */
    @SerializedName("Starttime")
    @Expose
    private String Starttime;

    /**
    * End time.
    */
    @SerializedName("Endtime")
    @Expose
    private String Endtime;

    /**
    * Whether detailed information is included.
    */
    @SerializedName("HadWoodDetail")
    @Expose
    private Boolean HadWoodDetail;

    /**
    * Wood sub-flow ID.
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
    * Reason for the stage failure.
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
    * ID used by the frontend.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Step. 
     * @return Stage Step.
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set Step.
     * @param Stage Step.
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
     * Get Whether it is displayed. 
     * @return IsShow Whether it is displayed.
     */
    public Boolean getIsShow() {
        return this.IsShow;
    }

    /**
     * Set Whether it is displayed.
     * @param IsShow Whether it is displayed.
     */
    public void setIsShow(Boolean IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get Whether it is a sub-flow. 
     * @return IsSubFlow Whether it is a sub-flow.
     */
    public Boolean getIsSubFlow() {
        return this.IsSubFlow;
    }

    /**
     * Set Whether it is a sub-flow.
     * @param IsSubFlow Whether it is a sub-flow.
     */
    public void setIsSubFlow(Boolean IsSubFlow) {
        this.IsSubFlow = IsSubFlow;
    }

    /**
     * Get Sub-flow tag. 
     * @return SubFlowFlag Sub-flow tag.
     */
    public String getSubFlowFlag() {
        return this.SubFlowFlag;
    }

    /**
     * Set Sub-flow tag.
     * @param SubFlowFlag Sub-flow tag.
     */
    public void setSubFlowFlag(String SubFlowFlag) {
        this.SubFlowFlag = SubFlowFlag;
    }

    /**
     * Get Step running status. Valid values: 0 (not started), 1 (in progress), 2 (completed), 3 (partially completed), and -1 (failed). 
     * @return Status Step running status. Valid values: 0 (not started), 1 (in progress), 2 (completed), 3 (partially completed), and -1 (failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Step running status. Valid values: 0 (not started), 1 (in progress), 2 (completed), 3 (partially completed), and -1 (failed).
     * @param Status Step running status. Valid values: 0 (not started), 1 (in progress), 2 (completed), 3 (partially completed), and -1 (failed).
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
     * Get Start time. 
     * @return Starttime Start time.
     */
    public String getStarttime() {
        return this.Starttime;
    }

    /**
     * Set Start time.
     * @param Starttime Start time.
     */
    public void setStarttime(String Starttime) {
        this.Starttime = Starttime;
    }

    /**
     * Get End time. 
     * @return Endtime End time.
     */
    public String getEndtime() {
        return this.Endtime;
    }

    /**
     * Set End time.
     * @param Endtime End time.
     */
    public void setEndtime(String Endtime) {
        this.Endtime = Endtime;
    }

    /**
     * Get Whether detailed information is included. 
     * @return HadWoodDetail Whether detailed information is included.
     */
    public Boolean getHadWoodDetail() {
        return this.HadWoodDetail;
    }

    /**
     * Set Whether detailed information is included.
     * @param HadWoodDetail Whether detailed information is included.
     */
    public void setHadWoodDetail(Boolean HadWoodDetail) {
        this.HadWoodDetail = HadWoodDetail;
    }

    /**
     * Get Wood sub-flow ID. 
     * @return WoodJobId Wood sub-flow ID.
     */
    public Long getWoodJobId() {
        return this.WoodJobId;
    }

    /**
     * Set Wood sub-flow ID.
     * @param WoodJobId Wood sub-flow ID.
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
     * Get Reason for the stage failure. 
     * @return FailedReason Reason for the stage failure.
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Reason for the stage failure.
     * @param FailedReason Reason for the stage failure.
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
     * Get ID used by the frontend. 
     * @return Id ID used by the frontend.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID used by the frontend.
     * @param Id ID used by the frontend.
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

