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

public class CreateProjectRequest extends AbstractModel {

    /**
    * Basic project information.
    */
    @SerializedName("Project")
    @Expose
    private ProjectRequest Project;

    /**
    * DLC bind cluster information.
    */
    @SerializedName("DLCInfo")
    @Expose
    private DLCClusterInfo DLCInfo;

    /**
    * id list to bind resource group.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get Basic project information. 
     * @return Project Basic project information.
     */
    public ProjectRequest getProject() {
        return this.Project;
    }

    /**
     * Set Basic project information.
     * @param Project Basic project information.
     */
    public void setProject(ProjectRequest Project) {
        this.Project = Project;
    }

    /**
     * Get DLC bind cluster information. 
     * @return DLCInfo DLC bind cluster information.
     */
    public DLCClusterInfo getDLCInfo() {
        return this.DLCInfo;
    }

    /**
     * Set DLC bind cluster information.
     * @param DLCInfo DLC bind cluster information.
     */
    public void setDLCInfo(DLCClusterInfo DLCInfo) {
        this.DLCInfo = DLCInfo;
    }

    /**
     * Get id list to bind resource group. 
     * @return ResourceIds id list to bind resource group.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set id list to bind resource group.
     * @param ResourceIds id list to bind resource group.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Project != null) {
            this.Project = new ProjectRequest(source.Project);
        }
        if (source.DLCInfo != null) {
            this.DLCInfo = new DLCClusterInfo(source.DLCInfo);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamObj(map, prefix + "DLCInfo.", this.DLCInfo);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

