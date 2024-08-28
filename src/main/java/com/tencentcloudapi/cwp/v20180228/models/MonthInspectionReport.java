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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonthInspectionReport extends AbstractModel {

    /**
    * Inspection report name
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * Inspection report download link
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
    * Inspection report update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Inspection report name 
     * @return ReportName Inspection report name
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set Inspection report name
     * @param ReportName Inspection report name
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get Inspection report download link 
     * @return ReportPath Inspection report download link
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set Inspection report download link
     * @param ReportPath Inspection report download link
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    /**
     * Get Inspection report update time 
     * @return ModifyTime Inspection report update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Inspection report update time
     * @param ModifyTime Inspection report update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public MonthInspectionReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthInspectionReport(MonthInspectionReport source) {
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.ReportPath != null) {
            this.ReportPath = new String(source.ReportPath);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

