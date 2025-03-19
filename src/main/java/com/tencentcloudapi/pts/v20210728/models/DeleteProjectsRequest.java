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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProjectsRequest extends AbstractModel {

    /**
    * Array of Project ID to be deleted.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Whether to delete project-related scenarios. The default value is false.
    */
    @SerializedName("DeleteScenarios")
    @Expose
    private Boolean DeleteScenarios;

    /**
    * Whether to delete project-related jobs. The default value is false.
    */
    @SerializedName("DeleteJobs")
    @Expose
    private Boolean DeleteJobs;

    /**
     * Get Array of Project ID to be deleted. 
     * @return ProjectIds Array of Project ID to be deleted.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of Project ID to be deleted.
     * @param ProjectIds Array of Project ID to be deleted.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Whether to delete project-related scenarios. The default value is false. 
     * @return DeleteScenarios Whether to delete project-related scenarios. The default value is false.
     */
    public Boolean getDeleteScenarios() {
        return this.DeleteScenarios;
    }

    /**
     * Set Whether to delete project-related scenarios. The default value is false.
     * @param DeleteScenarios Whether to delete project-related scenarios. The default value is false.
     */
    public void setDeleteScenarios(Boolean DeleteScenarios) {
        this.DeleteScenarios = DeleteScenarios;
    }

    /**
     * Get Whether to delete project-related jobs. The default value is false. 
     * @return DeleteJobs Whether to delete project-related jobs. The default value is false.
     */
    public Boolean getDeleteJobs() {
        return this.DeleteJobs;
    }

    /**
     * Set Whether to delete project-related jobs. The default value is false.
     * @param DeleteJobs Whether to delete project-related jobs. The default value is false.
     */
    public void setDeleteJobs(Boolean DeleteJobs) {
        this.DeleteJobs = DeleteJobs;
    }

    public DeleteProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProjectsRequest(DeleteProjectsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.DeleteScenarios != null) {
            this.DeleteScenarios = new Boolean(source.DeleteScenarios);
        }
        if (source.DeleteJobs != null) {
            this.DeleteJobs = new Boolean(source.DeleteJobs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "DeleteScenarios", this.DeleteScenarios);
        this.setParamSimple(map, prefix + "DeleteJobs", this.DeleteJobs);

    }
}

