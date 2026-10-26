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

public class RecordTemplateInfo extends AbstractModel {

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Cloud upload time period. Settings can be done by week. Multiple time periods can be set for each day, with each time period greater than or equal to 10 minutes.
    */
    @SerializedName("TimeSections")
    @Expose
    private RecordTemplateTimeSections [] TimeSections;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name 
     * @return TemplateName Template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
     * @param TemplateName Template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Cloud upload time period. Settings can be done by week. Multiple time periods can be set for each day, with each time period greater than or equal to 10 minutes. 
     * @return TimeSections Cloud upload time period. Settings can be done by week. Multiple time periods can be set for each day, with each time period greater than or equal to 10 minutes.
     */
    public RecordTemplateTimeSections [] getTimeSections() {
        return this.TimeSections;
    }

    /**
     * Set Cloud upload time period. Settings can be done by week. Multiple time periods can be set for each day, with each time period greater than or equal to 10 minutes.
     * @param TimeSections Cloud upload time period. Settings can be done by week. Multiple time periods can be set for each day, with each time period greater than or equal to 10 minutes.
     */
    public void setTimeSections(RecordTemplateTimeSections [] TimeSections) {
        this.TimeSections = TimeSections;
    }

    public RecordTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTemplateInfo(RecordTemplateInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);

    }
}

