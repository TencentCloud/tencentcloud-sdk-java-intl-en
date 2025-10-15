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

public class ResourceFile extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Resource file ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource file name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Source file path.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * Specifies the COS storage path of the resource object.
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * Specifies the resource file type.

    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * Resource size
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Creator user ID 
    */
    @SerializedName("CreatorUserUin")
    @Expose
    private String CreatorUserUin;

    /**
    * Creator name
    */
    @SerializedName("CreatorUserName")
    @Expose
    private String CreatorUserName;

    /**
    * Last updated username.

    */
    @SerializedName("UpdateUserName")
    @Expose
    private String UpdateUserName;

    /**
    * Last updated user ID.

    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * COS bucket.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * COS region
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Specifies the resource source mode.
    */
    @SerializedName("ResourceSourceMode")
    @Expose
    private String ResourceSourceMode;

    /**
    * Local project ID.

    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Local project information.

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
     * Get Resource file ID. 
     * @return ResourceId Resource file ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource file ID.
     * @param ResourceId Resource file ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource file name. 
     * @return ResourceName Resource file name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource file name.
     * @param ResourceName Resource file name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Source file path. 
     * @return LocalPath Source file path.
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Source file path.
     * @param LocalPath Source file path.
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get Specifies the COS storage path of the resource object. 
     * @return RemotePath Specifies the COS storage path of the resource object.
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set Specifies the COS storage path of the resource object.
     * @param RemotePath Specifies the COS storage path of the resource object.
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get Specifies the resource file type.
 
     * @return FileExtensionType Specifies the resource file type.

     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set Specifies the resource file type.

     * @param FileExtensionType Specifies the resource file type.

     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get Resource size 
     * @return Size Resource size
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Resource size
     * @param Size Resource size
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Creator user ID  
     * @return CreatorUserUin Creator user ID 
     */
    public String getCreatorUserUin() {
        return this.CreatorUserUin;
    }

    /**
     * Set Creator user ID 
     * @param CreatorUserUin Creator user ID 
     */
    public void setCreatorUserUin(String CreatorUserUin) {
        this.CreatorUserUin = CreatorUserUin;
    }

    /**
     * Get Creator name 
     * @return CreatorUserName Creator name
     */
    public String getCreatorUserName() {
        return this.CreatorUserName;
    }

    /**
     * Set Creator name
     * @param CreatorUserName Creator name
     */
    public void setCreatorUserName(String CreatorUserName) {
        this.CreatorUserName = CreatorUserName;
    }

    /**
     * Get Last updated username.
 
     * @return UpdateUserName Last updated username.

     */
    public String getUpdateUserName() {
        return this.UpdateUserName;
    }

    /**
     * Set Last updated username.

     * @param UpdateUserName Last updated username.

     */
    public void setUpdateUserName(String UpdateUserName) {
        this.UpdateUserName = UpdateUserName;
    }

    /**
     * Get Last updated user ID.
 
     * @return UpdateUserUin Last updated user ID.

     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Last updated user ID.

     * @param UpdateUserUin Last updated user ID.

     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get COS bucket. 
     * @return BucketName COS bucket.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set COS bucket.
     * @param BucketName COS bucket.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get COS region 
     * @return CosRegion COS region
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS region
     * @param CosRegion COS region
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Specifies the resource source mode. 
     * @return ResourceSourceMode Specifies the resource source mode.
     */
    public String getResourceSourceMode() {
        return this.ResourceSourceMode;
    }

    /**
     * Set Specifies the resource source mode.
     * @param ResourceSourceMode Specifies the resource source mode.
     */
    public void setResourceSourceMode(String ResourceSourceMode) {
        this.ResourceSourceMode = ResourceSourceMode;
    }

    /**
     * Get Local project ID.
 
     * @return BundleId Local project ID.

     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Local project ID.

     * @param BundleId Local project ID.

     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Local project information.
 
     * @return BundleInfo Local project information.

     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Local project information.

     * @param BundleInfo Local project information.

     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public ResourceFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFile(ResourceFile source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.CreatorUserUin != null) {
            this.CreatorUserUin = new String(source.CreatorUserUin);
        }
        if (source.CreatorUserName != null) {
            this.CreatorUserName = new String(source.CreatorUserName);
        }
        if (source.UpdateUserName != null) {
            this.UpdateUserName = new String(source.UpdateUserName);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.ResourceSourceMode != null) {
            this.ResourceSourceMode = new String(source.ResourceSourceMode);
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
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CreatorUserUin", this.CreatorUserUin);
        this.setParamSimple(map, prefix + "CreatorUserName", this.CreatorUserName);
        this.setParamSimple(map, prefix + "UpdateUserName", this.UpdateUserName);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ResourceSourceMode", this.ResourceSourceMode);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

