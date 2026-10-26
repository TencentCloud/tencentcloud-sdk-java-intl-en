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

public class AddRecordBackupTemplateRequest extends AbstractModel {

    /**
    * <p>Template name (supports only Chinese, English, number, _, -, length not exceeding 32 characters. Template name must be globally unique, cannot be empty, and must be unique)</p>
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
    * <p>Recording time period (settings can be done by week, support setting multiple time periods per day, each time period not less than 10 minutes)</p>
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
    * <p>Cycle offset. Default: 1. It means to pull yesterday's video recording to the device. 0 means to pull today's video recording to the device. 3 means to pull the video recording to the device from the day before yesterday.</p><p>Value range: [0, 90]</p><p>Default value: 1</p>
    */
    @SerializedName("DayOffset")
    @Expose
    private Long DayOffset;

    /**
     * Get <p>Template name (supports only Chinese, English, number, _, -, length not exceeding 32 characters. Template name must be globally unique, cannot be empty, and must be unique)</p> 
     * @return TemplateName <p>Template name (supports only Chinese, English, number, _, -, length not exceeding 32 characters. Template name must be globally unique, cannot be empty, and must be unique)</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>Template name (supports only Chinese, English, number, _, -, length not exceeding 32 characters. Template name must be globally unique, cannot be empty, and must be unique)</p>
     * @param TemplateName <p>Template name (supports only Chinese, English, number, _, -, length not exceeding 32 characters. Template name must be globally unique, cannot be empty, and must be unique)</p>
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
     * Get <p>Recording time period (settings can be done by week, support setting multiple time periods per day, each time period not less than 10 minutes)</p> 
     * @return DevTimeSections <p>Recording time period (settings can be done by week, support setting multiple time periods per day, each time period not less than 10 minutes)</p>
     */
    public RecordTemplateTimeSections [] getDevTimeSections() {
        return this.DevTimeSections;
    }

    /**
     * Set <p>Recording time period (settings can be done by week, support setting multiple time periods per day, each time period not less than 10 minutes)</p>
     * @param DevTimeSections <p>Recording time period (settings can be done by week, support setting multiple time periods per day, each time period not less than 10 minutes)</p>
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
     * Get <p>Cycle offset. Default: 1. It means to pull yesterday's video recording to the device. 0 means to pull today's video recording to the device. 3 means to pull the video recording to the device from the day before yesterday.</p><p>Value range: [0, 90]</p><p>Default value: 1</p> 
     * @return DayOffset <p>Cycle offset. Default: 1. It means to pull yesterday's video recording to the device. 0 means to pull today's video recording to the device. 3 means to pull the video recording to the device from the day before yesterday.</p><p>Value range: [0, 90]</p><p>Default value: 1</p>
     */
    public Long getDayOffset() {
        return this.DayOffset;
    }

    /**
     * Set <p>Cycle offset. Default: 1. It means to pull yesterday's video recording to the device. 0 means to pull today's video recording to the device. 3 means to pull the video recording to the device from the day before yesterday.</p><p>Value range: [0, 90]</p><p>Default value: 1</p>
     * @param DayOffset <p>Cycle offset. Default: 1. It means to pull yesterday's video recording to the device. 0 means to pull today's video recording to the device. 3 means to pull the video recording to the device from the day before yesterday.</p><p>Value range: [0, 90]</p><p>Default value: 1</p>
     */
    public void setDayOffset(Long DayOffset) {
        this.DayOffset = DayOffset;
    }

    public AddRecordBackupTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBackupTemplateRequest(AddRecordBackupTemplateRequest source) {
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
        if (source.DayOffset != null) {
            this.DayOffset = new Long(source.DayOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);
        this.setParamArrayObj(map, prefix + "DevTimeSections.", this.DevTimeSections);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DayOffset", this.DayOffset);

    }
}

