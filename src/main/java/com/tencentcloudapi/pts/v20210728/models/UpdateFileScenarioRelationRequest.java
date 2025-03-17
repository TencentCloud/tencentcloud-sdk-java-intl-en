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

public class UpdateFileScenarioRelationRequest extends AbstractModel {

    /**
    * File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Array of Scenario ID.
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
     * Get File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step. 
     * @return FileId File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     * @param FileId File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
     * Get Array of Scenario ID. 
     * @return ScenarioIds Array of Scenario ID.
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set Array of Scenario ID.
     * @param ScenarioIds Array of Scenario ID.
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    public UpdateFileScenarioRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFileScenarioRelationRequest(UpdateFileScenarioRelationRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);

    }
}

