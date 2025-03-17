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

public class DeleteScenariosRequest extends AbstractModel {

    /**
    * Array of Scenario ID to be deleted.
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to delete scene-related jobs. The default value is false.
    */
    @SerializedName("DeleteJobs")
    @Expose
    private Boolean DeleteJobs;

    /**
     * Get Array of Scenario ID to be deleted. 
     * @return ScenarioIds Array of Scenario ID to be deleted.
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set Array of Scenario ID to be deleted.
     * @param ScenarioIds Array of Scenario ID to be deleted.
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

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
     * Get Whether to delete scene-related jobs. The default value is false. 
     * @return DeleteJobs Whether to delete scene-related jobs. The default value is false.
     */
    public Boolean getDeleteJobs() {
        return this.DeleteJobs;
    }

    /**
     * Set Whether to delete scene-related jobs. The default value is false.
     * @param DeleteJobs Whether to delete scene-related jobs. The default value is false.
     */
    public void setDeleteJobs(Boolean DeleteJobs) {
        this.DeleteJobs = DeleteJobs;
    }

    public DeleteScenariosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScenariosRequest(DeleteScenariosRequest source) {
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteJobs != null) {
            this.DeleteJobs = new Boolean(source.DeleteJobs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteJobs", this.DeleteJobs);

    }
}

