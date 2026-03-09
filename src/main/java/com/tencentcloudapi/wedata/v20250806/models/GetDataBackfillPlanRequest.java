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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDataBackfillPlanRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Supplemental plan id.
    */
    @SerializedName("DataBackfillPlanId")
    @Expose
    private String DataBackfillPlanId;

    /**
    * Show the time zone. default is UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Supplemental plan id. 
     * @return DataBackfillPlanId Supplemental plan id.
     */
    public String getDataBackfillPlanId() {
        return this.DataBackfillPlanId;
    }

    /**
     * Set Supplemental plan id.
     * @param DataBackfillPlanId Supplemental plan id.
     */
    public void setDataBackfillPlanId(String DataBackfillPlanId) {
        this.DataBackfillPlanId = DataBackfillPlanId;
    }

    /**
     * Get Show the time zone. default is UTC+8. 
     * @return TimeZone Show the time zone. default is UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Show the time zone. default is UTC+8.
     * @param TimeZone Show the time zone. default is UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public GetDataBackfillPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataBackfillPlanRequest(GetDataBackfillPlanRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DataBackfillPlanId != null) {
            this.DataBackfillPlanId = new String(source.DataBackfillPlanId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DataBackfillPlanId", this.DataBackfillPlanId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

