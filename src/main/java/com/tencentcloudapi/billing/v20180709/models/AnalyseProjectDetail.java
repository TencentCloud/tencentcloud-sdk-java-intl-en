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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseProjectDetail extends AbstractModel {

    /**
    * Project ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Default projectNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Default projectNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Default projectNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Default projectNote: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Default projectNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public AnalyseProjectDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseProjectDetail(AnalyseProjectDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

