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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRecordBackupTemplatesData extends AbstractModel {

    /**
    * <p>Template ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Template name</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>Cloud Upload Time Period (settings can be done by week, supports setting multiple time periods per day, each time period not less than 10 minutes)</p>
    */
    @SerializedName("TimeSections")
    @Expose
    private RecordTemplateTimeSections [] TimeSections;

    /**
    * <p>Recording time period (settings can be done by week, supports setting multiple time periods per day, each time period greater than or equal to 10 minutes)</p>
    */
    @SerializedName("DevTimeSections")
    @Expose
    private RecordTemplateTimeSections [] DevTimeSections;

    /**
    * <p>Speed multiplication for cloud migration (supports 1x, 2x, and 4x)</p>
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * <p>Cycle offset. Default: 1, which means pulling yesterday's data. 0 means pulling today's data. 3 means pulling the day before yesterday's data.</p>
    */
    @SerializedName("DayOffset")
    @Expose
    private Long DayOffset;

    /**
     * Get <p>Template ID</p> 
     * @return TemplateId <p>Template ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Template ID</p>
     * @param TemplateId <p>Template ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Template name</p> 
     * @return TemplateName <p>Template name</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>Template name</p>
     * @param TemplateName <p>Template name</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>Cloud Upload Time Period (settings can be done by week, supports setting multiple time periods per day, each time period not less than 10 minutes)</p> 
     * @return TimeSections <p>Cloud Upload Time Period (settings can be done by week, supports setting multiple time periods per day, each time period not less than 10 minutes)</p>
     */
    public RecordTemplateTimeSections [] getTimeSections() {
        return this.TimeSections;
    }

    /**
     * Set <p>Cloud Upload Time Period (settings can be done by week, supports setting multiple time periods per day, each time period not less than 10 minutes)</p>
     * @param TimeSections <p>Cloud Upload Time Period (settings can be done by week, supports setting multiple time periods per day, each time period not less than 10 minutes)</p>
     */
    public void setTimeSections(RecordTemplateTimeSections [] TimeSections) {
        this.TimeSections = TimeSections;
    }

    /**
     * Get <p>Recording time period (settings can be done by week, supports setting multiple time periods per day, each time period greater than or equal to 10 minutes)</p> 
     * @return DevTimeSections <p>Recording time period (settings can be done by week, supports setting multiple time periods per day, each time period greater than or equal to 10 minutes)</p>
     */
    public RecordTemplateTimeSections [] getDevTimeSections() {
        return this.DevTimeSections;
    }

    /**
     * Set <p>Recording time period (settings can be done by week, supports setting multiple time periods per day, each time period greater than or equal to 10 minutes)</p>
     * @param DevTimeSections <p>Recording time period (settings can be done by week, supports setting multiple time periods per day, each time period greater than or equal to 10 minutes)</p>
     */
    public void setDevTimeSections(RecordTemplateTimeSections [] DevTimeSections) {
        this.DevTimeSections = DevTimeSections;
    }

    /**
     * Get <p>Speed multiplication for cloud migration (supports 1x, 2x, and 4x)</p> 
     * @return Scale <p>Speed multiplication for cloud migration (supports 1x, 2x, and 4x)</p>
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set <p>Speed multiplication for cloud migration (supports 1x, 2x, and 4x)</p>
     * @param Scale <p>Speed multiplication for cloud migration (supports 1x, 2x, and 4x)</p>
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateAt <p>Creation time.</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateAt <p>Creation time.</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateAt <p>Update time.</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateAt <p>Update time.</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get <p>Cycle offset. Default: 1, which means pulling yesterday's data. 0 means pulling today's data. 3 means pulling the day before yesterday's data.</p> 
     * @return DayOffset <p>Cycle offset. Default: 1, which means pulling yesterday's data. 0 means pulling today's data. 3 means pulling the day before yesterday's data.</p>
     */
    public Long getDayOffset() {
        return this.DayOffset;
    }

    /**
     * Set <p>Cycle offset. Default: 1, which means pulling yesterday's data. 0 means pulling today's data. 3 means pulling the day before yesterday's data.</p>
     * @param DayOffset <p>Cycle offset. Default: 1, which means pulling yesterday's data. 0 means pulling today's data. 3 means pulling the day before yesterday's data.</p>
     */
    public void setDayOffset(Long DayOffset) {
        this.DayOffset = DayOffset;
    }

    public ListRecordBackupTemplatesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRecordBackupTemplatesData(ListRecordBackupTemplatesData source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TimeSections != null) {
            this.TimeSections = new RecordTemplateTimeSections[source.TimeSections.length];
            for (int i = 0; i < source.TimeSections.length; i++) {
                this.TimeSections[i] = new RecordTemplateTimeSections(source.TimeSections[i]);
            }
        }
        if (source.DevTimeSections != null) {
            this.DevTimeSections = new RecordTemplateTimeSections[source.DevTimeSections.length];
            for (int i = 0; i < source.DevTimeSections.length; i++) {
                this.DevTimeSections[i] = new RecordTemplateTimeSections(source.DevTimeSections[i]);
            }
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
        if (source.DayOffset != null) {
            this.DayOffset = new Long(source.DayOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);
        this.setParamArrayObj(map, prefix + "DevTimeSections.", this.DevTimeSections);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "DayOffset", this.DayOffset);

    }
}

