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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosTempTokenRequest extends AbstractModel {

    /**
    * <p>Makers site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Project name. The temporary path is concatenated based on it.</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>Project ID. Used to reverse-check the project name when ProjectName is not passed in.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get <p>Makers site ID</p> 
     * @return ZoneId <p>Makers site ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers site ID</p>
     * @param ZoneId <p>Makers site ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Project name. The temporary path is concatenated based on it.</p> 
     * @return ProjectName <p>Project name. The temporary path is concatenated based on it.</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>Project name. The temporary path is concatenated based on it.</p>
     * @param ProjectName <p>Project name. The temporary path is concatenated based on it.</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>Project ID. Used to reverse-check the project name when ProjectName is not passed in.</p> 
     * @return ProjectId <p>Project ID. Used to reverse-check the project name when ProjectName is not passed in.</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. Used to reverse-check the project name when ProjectName is not passed in.</p>
     * @param ProjectId <p>Project ID. Used to reverse-check the project name when ProjectName is not passed in.</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeCosTempTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosTempTokenRequest(DescribeCosTempTokenRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

