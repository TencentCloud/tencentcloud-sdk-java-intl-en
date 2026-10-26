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

public class UpdateRecordBackupTemplateModify extends AbstractModel {

    /**
    * Template name (not required if you do not rename)
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Cloud upload time period (settings can be done by week. Multiple time periods can be set for each day, with each time period not less than 10 minutes)
    */
    @SerializedName("TimeSections")
    @Expose
    private RecordTemplateTimeSections [] TimeSections;

    /**
    * Recording time period (set by week. Multiple time periods can be set each day, each not less than 10 minutes)
    */
    @SerializedName("DevTimeSections")
    @Expose
    private RecordTemplateTimeSections [] DevTimeSections;

    /**
    * Cloud speed multiplication (supports 1x, 2x, and 4x).
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
     * Get Template name (not required if you do not rename) 
     * @return TemplateName Template name (not required if you do not rename)
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name (not required if you do not rename)
     * @param TemplateName Template name (not required if you do not rename)
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Cloud upload time period (settings can be done by week. Multiple time periods can be set for each day, with each time period not less than 10 minutes) 
     * @return TimeSections Cloud upload time period (settings can be done by week. Multiple time periods can be set for each day, with each time period not less than 10 minutes)
     */
    public RecordTemplateTimeSections [] getTimeSections() {
        return this.TimeSections;
    }

    /**
     * Set Cloud upload time period (settings can be done by week. Multiple time periods can be set for each day, with each time period not less than 10 minutes)
     * @param TimeSections Cloud upload time period (settings can be done by week. Multiple time periods can be set for each day, with each time period not less than 10 minutes)
     */
    public void setTimeSections(RecordTemplateTimeSections [] TimeSections) {
        this.TimeSections = TimeSections;
    }

    /**
     * Get Recording time period (set by week. Multiple time periods can be set each day, each not less than 10 minutes) 
     * @return DevTimeSections Recording time period (set by week. Multiple time periods can be set each day, each not less than 10 minutes)
     */
    public RecordTemplateTimeSections [] getDevTimeSections() {
        return this.DevTimeSections;
    }

    /**
     * Set Recording time period (set by week. Multiple time periods can be set each day, each not less than 10 minutes)
     * @param DevTimeSections Recording time period (set by week. Multiple time periods can be set each day, each not less than 10 minutes)
     */
    public void setDevTimeSections(RecordTemplateTimeSections [] DevTimeSections) {
        this.DevTimeSections = DevTimeSections;
    }

    /**
     * Get Cloud speed multiplication (supports 1x, 2x, and 4x). 
     * @return Scale Cloud speed multiplication (supports 1x, 2x, and 4x).
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Cloud speed multiplication (supports 1x, 2x, and 4x).
     * @param Scale Cloud speed multiplication (supports 1x, 2x, and 4x).
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    public UpdateRecordBackupTemplateModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordBackupTemplateModify(UpdateRecordBackupTemplateModify source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);
        this.setParamArrayObj(map, prefix + "DevTimeSections.", this.DevTimeSections);
        this.setParamSimple(map, prefix + "Scale", this.Scale);

    }
}

