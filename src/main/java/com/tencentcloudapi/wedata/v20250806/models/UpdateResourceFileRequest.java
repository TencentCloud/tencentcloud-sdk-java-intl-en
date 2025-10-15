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

public class UpdateResourceFileRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Resource file ID. Can be obtained through the ListResourceFiles API.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The hand-filled value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID and requires a specific value. parentFolderPath is the parent folder path. name is the file name. 
Hand-filled value example:.
   /datastudio/resource/projectId/parentFolderPath/name 

    */
    @SerializedName("ResourceFile")
    @Expose
    private String ResourceFile;

    /**
    * Resource name, preferably kept consistent with the file name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Bundle Client ID.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle Client Name
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

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
     * Get Resource file ID. Can be obtained through the ListResourceFiles API. 
     * @return ResourceId Resource file ID. Can be obtained through the ListResourceFiles API.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource file ID. Can be obtained through the ListResourceFiles API.
     * @param ResourceId Resource file ID. Can be obtained through the ListResourceFiles API.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The hand-filled value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID and requires a specific value. parentFolderPath is the parent folder path. name is the file name. 
Hand-filled value example:.
   /datastudio/resource/projectId/parentFolderPath/name 
 
     * @return ResourceFile -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The hand-filled value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID and requires a specific value. parentFolderPath is the parent folder path. name is the file name. 
Hand-filled value example:.
   /datastudio/resource/projectId/parentFolderPath/name 

     */
    public String getResourceFile() {
        return this.ResourceFile;
    }

    /**
     * Set -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The hand-filled value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID and requires a specific value. parentFolderPath is the parent folder path. name is the file name. 
Hand-filled value example:.
   /datastudio/resource/projectId/parentFolderPath/name 

     * @param ResourceFile -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The hand-filled value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID and requires a specific value. parentFolderPath is the parent folder path. name is the file name. 
Hand-filled value example:.
   /datastudio/resource/projectId/parentFolderPath/name 

     */
    public void setResourceFile(String ResourceFile) {
        this.ResourceFile = ResourceFile;
    }

    /**
     * Get Resource name, preferably kept consistent with the file name. 
     * @return ResourceName Resource name, preferably kept consistent with the file name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name, preferably kept consistent with the file name.
     * @param ResourceName Resource name, preferably kept consistent with the file name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Bundle Client ID. 
     * @return BundleId Bundle Client ID.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Bundle Client ID.
     * @param BundleId Bundle Client ID.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle Client Name 
     * @return BundleInfo Bundle Client Name
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle Client Name
     * @param BundleInfo Bundle Client Name
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public UpdateResourceFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateResourceFileRequest(UpdateResourceFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceFile != null) {
            this.ResourceFile = new String(source.ResourceFile);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceFile", this.ResourceFile);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

