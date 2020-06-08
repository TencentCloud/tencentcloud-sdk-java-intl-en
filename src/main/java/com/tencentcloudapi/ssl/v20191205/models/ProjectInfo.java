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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInfo extends AbstractModel{

    /**
    * Project name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * UIN of the project creator.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectCreatorUin")
    @Expose
    private Long ProjectCreatorUin;

    /**
    * Project creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectCreateTime")
    @Expose
    private String ProjectCreateTime;

    /**
    * Brief project information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectResume")
    @Expose
    private String ProjectResume;

    /**
    * User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Project name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get UIN of the project creator.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectCreatorUin UIN of the project creator.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectCreatorUin() {
        return this.ProjectCreatorUin;
    }

    /**
     * Set UIN of the project creator.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectCreatorUin UIN of the project creator.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectCreatorUin(Long ProjectCreatorUin) {
        this.ProjectCreatorUin = ProjectCreatorUin;
    }

    /**
     * Get Project creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectCreateTime Project creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectCreateTime() {
        return this.ProjectCreateTime;
    }

    /**
     * Set Project creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectCreateTime Project creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectCreateTime(String ProjectCreateTime) {
        this.ProjectCreateTime = ProjectCreateTime;
    }

    /**
     * Get Brief project information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectResume Brief project information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectResume() {
        return this.ProjectResume;
    }

    /**
     * Set Brief project information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectResume Brief project information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectResume(String ProjectResume) {
        this.ProjectResume = ProjectResume;
    }

    /**
     * Get User UIN.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Project ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectCreatorUin", this.ProjectCreatorUin);
        this.setParamSimple(map, prefix + "ProjectCreateTime", this.ProjectCreateTime);
        this.setParamSimple(map, prefix + "ProjectResume", this.ProjectResume);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

