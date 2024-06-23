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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteResourceFilesRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Usage Status
    */
    @SerializedName("UseStatus")
    @Expose
    private Boolean UseStatus;

    /**
    * Resource ID List
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Resource Path List
    */
    @SerializedName("FilePaths")
    @Expose
    private String [] FilePaths;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Usage Status 
     * @return UseStatus Usage Status
     */
    public Boolean getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set Usage Status
     * @param UseStatus Usage Status
     */
    public void setUseStatus(Boolean UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get Resource ID List 
     * @return ResourceIds Resource ID List
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID List
     * @param ResourceIds Resource ID List
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Resource Path List 
     * @return FilePaths Resource Path List
     */
    public String [] getFilePaths() {
        return this.FilePaths;
    }

    /**
     * Set Resource Path List
     * @param FilePaths Resource Path List
     */
    public void setFilePaths(String [] FilePaths) {
        this.FilePaths = FilePaths;
    }

    public DeleteResourceFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteResourceFilesRequest(DeleteResourceFilesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UseStatus != null) {
            this.UseStatus = new Boolean(source.UseStatus);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.FilePaths != null) {
            this.FilePaths = new String[source.FilePaths.length];
            for (int i = 0; i < source.FilePaths.length; i++) {
                this.FilePaths[i] = new String(source.FilePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "FilePaths.", this.FilePaths);

    }
}

