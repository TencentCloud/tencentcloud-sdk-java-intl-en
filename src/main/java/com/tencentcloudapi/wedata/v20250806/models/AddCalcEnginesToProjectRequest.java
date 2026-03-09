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

public class AddCalcEnginesToProjectRequest extends AbstractModel {

    /**
    * Modified project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * DLC cluster information.
    */
    @SerializedName("DLCInfo")
    @Expose
    private DLCClusterInfo [] DLCInfo;

    /**
     * Get Modified project ID. 
     * @return ProjectId Modified project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Modified project ID.
     * @param ProjectId Modified project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get DLC cluster information. 
     * @return DLCInfo DLC cluster information.
     */
    public DLCClusterInfo [] getDLCInfo() {
        return this.DLCInfo;
    }

    /**
     * Set DLC cluster information.
     * @param DLCInfo DLC cluster information.
     */
    public void setDLCInfo(DLCClusterInfo [] DLCInfo) {
        this.DLCInfo = DLCInfo;
    }

    public AddCalcEnginesToProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCalcEnginesToProjectRequest(AddCalcEnginesToProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DLCInfo != null) {
            this.DLCInfo = new DLCClusterInfo[source.DLCInfo.length];
            for (int i = 0; i < source.DLCInfo.length; i++) {
                this.DLCInfo[i] = new DLCClusterInfo(source.DLCInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "DLCInfo.", this.DLCInfo);

    }
}

