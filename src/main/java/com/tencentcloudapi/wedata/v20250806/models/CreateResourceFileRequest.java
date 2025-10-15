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

public class CreateResourceFileRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Resource file name. should be consistent with the uploaded file name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Bucket name. can be obtained from the GetResourceCosPath api.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * BucketName specifies the cos storage bucket region.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Upload path for resource files in the project. value example: /wedata/qxxxm/. root directory, please use /.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The manually entered value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID. import a specific value. parentFolderPath is the folder path. name is the file name. value example: /datastudio/resource/projectId/parentFolderPath/name. 

    */
    @SerializedName("ResourceFile")
    @Expose
    private String ResourceFile;

    /**
    * Bundle Client ID.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * bundle client info.
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
     * Get Resource file name. should be consistent with the uploaded file name. 
     * @return ResourceName Resource file name. should be consistent with the uploaded file name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource file name. should be consistent with the uploaded file name.
     * @param ResourceName Resource file name. should be consistent with the uploaded file name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Bucket name. can be obtained from the GetResourceCosPath api. 
     * @return BucketName Bucket name. can be obtained from the GetResourceCosPath api.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name. can be obtained from the GetResourceCosPath api.
     * @param BucketName Bucket name. can be obtained from the GetResourceCosPath api.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get BucketName specifies the cos storage bucket region. 
     * @return CosRegion BucketName specifies the cos storage bucket region.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set BucketName specifies the cos storage bucket region.
     * @param CosRegion BucketName specifies the cos storage bucket region.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Upload path for resource files in the project. value example: /wedata/qxxxm/. root directory, please use /. 
     * @return ParentFolderPath Upload path for resource files in the project. value example: /wedata/qxxxm/. root directory, please use /.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Upload path for resource files in the project. value example: /wedata/qxxxm/. root directory, please use /.
     * @param ParentFolderPath Upload path for resource files in the project. value example: /wedata/qxxxm/. root directory, please use /.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The manually entered value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID. import a specific value. parentFolderPath is the folder path. name is the file name. value example: /datastudio/resource/projectId/parentFolderPath/name. 
 
     * @return ResourceFile -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The manually entered value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID. import a specific value. parentFolderPath is the folder path. name is the file name. value example: /datastudio/resource/projectId/parentFolderPath/name. 

     */
    public String getResourceFile() {
        return this.ResourceFile;
    }

    /**
     * Set -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The manually entered value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID. import a specific value. parentFolderPath is the folder path. name is the file name. value example: /datastudio/resource/projectId/parentFolderPath/name. 

     * @param ResourceFile -Upload file and manual entry are two methods, choose one. if both are provided, the sequence is file > manual entry.
-The manually entered value must be an existing cos path. /datastudio/resource/ is the fixed prefix. projectId is the project ID. import a specific value. parentFolderPath is the folder path. name is the file name. value example: /datastudio/resource/projectId/parentFolderPath/name. 

     */
    public void setResourceFile(String ResourceFile) {
        this.ResourceFile = ResourceFile;
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
     * Get bundle client info. 
     * @return BundleInfo bundle client info.
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set bundle client info.
     * @param BundleInfo bundle client info.
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public CreateResourceFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceFileRequest(CreateResourceFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.ResourceFile != null) {
            this.ResourceFile = new String(source.ResourceFile);
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
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "ResourceFile", this.ResourceFile);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

