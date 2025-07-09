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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramScheduleInfo extends AbstractModel {

    /**
    * program name.
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * program id.
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * source type.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * source id.
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * The id of the source location.
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * Start timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Duration.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get program name. 
     * @return ProgramName program name.
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set program name.
     * @param ProgramName program name.
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get program id. 
     * @return ProgramId program id.
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set program id.
     * @param ProgramId program id.
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get source type. 
     * @return SourceType source type.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set source type.
     * @param SourceType source type.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get source id. 
     * @return SourceId source id.
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set source id.
     * @param SourceId source id.
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get The id of the source location. 
     * @return SourceLocationId The id of the source location.
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set The id of the source location.
     * @param SourceLocationId The id of the source location.
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get Start timestamp. 
     * @return StartTime Start timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp.
     * @param StartTime Start timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Duration. 
     * @return Duration Duration.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration.
     * @param Duration Duration.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public ProgramScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramScheduleInfo(ProgramScheduleInfo source) {
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

