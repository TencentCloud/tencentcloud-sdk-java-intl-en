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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectLimitRequest extends AbstractModel{

    /**
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Project API
    */
    @SerializedName("ProjectInterface")
    @Expose
    private String ProjectInterface;

    /**
    * Reporting rate. 10 means 10%
    */
    @SerializedName("ReportRate")
    @Expose
    private Long ReportRate;

    /**
    * Reporting type. 1: rate; 2: number of reported data entries
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * Primary key ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get Project ID 
     * @return ProjectID Project ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID
     * @param ProjectID Project ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Project API 
     * @return ProjectInterface Project API
     */
    public String getProjectInterface() {
        return this.ProjectInterface;
    }

    /**
     * Set Project API
     * @param ProjectInterface Project API
     */
    public void setProjectInterface(String ProjectInterface) {
        this.ProjectInterface = ProjectInterface;
    }

    /**
     * Get Reporting rate. 10 means 10% 
     * @return ReportRate Reporting rate. 10 means 10%
     */
    public Long getReportRate() {
        return this.ReportRate;
    }

    /**
     * Set Reporting rate. 10 means 10%
     * @param ReportRate Reporting rate. 10 means 10%
     */
    public void setReportRate(Long ReportRate) {
        this.ReportRate = ReportRate;
    }

    /**
     * Get Reporting type. 1: rate; 2: number of reported data entries 
     * @return ReportType Reporting type. 1: rate; 2: number of reported data entries
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set Reporting type. 1: rate; 2: number of reported data entries
     * @param ReportType Reporting type. 1: rate; 2: number of reported data entries
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get Primary key ID 
     * @return ID Primary key ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Primary key ID
     * @param ID Primary key ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ModifyProjectLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectLimitRequest(ModifyProjectLimitRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ProjectInterface != null) {
            this.ProjectInterface = new String(source.ProjectInterface);
        }
        if (source.ReportRate != null) {
            this.ReportRate = new Long(source.ReportRate);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "ProjectInterface", this.ProjectInterface);
        this.setParamSimple(map, prefix + "ReportRate", this.ReportRate);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

