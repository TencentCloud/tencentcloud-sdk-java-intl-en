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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightResInfoResp extends AbstractModel {

    /**
    * MPS task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Highlights video link.
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * Collection cover link.
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * Generation time, UTC format.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Starting pts.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * End pts.
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * Duration in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get MPS task ID. 
     * @return TaskId MPS task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set MPS task ID.
     * @param TaskId MPS task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Highlights video link. 
     * @return SegmentUrl Highlights video link.
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set Highlights video link.
     * @param SegmentUrl Highlights video link.
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get Collection cover link. 
     * @return CovImgUrl Collection cover link.
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set Collection cover link.
     * @param CovImgUrl Collection cover link.
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * Get Generation time, UTC format. 
     * @return CreateTime Generation time, UTC format.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Generation time, UTC format.
     * @param CreateTime Generation time, UTC format.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Starting pts. 
     * @return StartTime Starting pts.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting pts.
     * @param StartTime Starting pts.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End pts. 
     * @return EndTime End pts.
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End pts.
     * @param EndTime End pts.
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Duration in seconds. 
     * @return Duration Duration in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration in seconds.
     * @param Duration Duration in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public HighlightResInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightResInfoResp(HighlightResInfoResp source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SegmentUrl != null) {
            this.SegmentUrl = new String(source.SegmentUrl);
        }
        if (source.CovImgUrl != null) {
            this.CovImgUrl = new String(source.CovImgUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SegmentUrl", this.SegmentUrl);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

