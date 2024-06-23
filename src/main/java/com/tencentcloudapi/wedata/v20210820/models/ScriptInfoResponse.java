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

public class ScriptInfoResponse extends AbstractModel {

    /**
    * Resource IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Script Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File Extension Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * File TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * md5 Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Md5Value")
    @Expose
    private String Md5Value;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * File sizeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * Local Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * Remote Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * UsernameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * User ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Path Depth
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PathDepth")
    @Expose
    private Long PathDepth;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Additional Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * Local Temporary File Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LocalTempPath")
    @Expose
    private String LocalTempPath;

    /**
    * Local Compressed File Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ZipPath")
    @Expose
    private String ZipPath;

    /**
    * COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS Region
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Resource IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceId Resource IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceId Resource IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Script Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileName Script Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Script Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileName Script Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File Extension Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileExtensionType File Extension Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set File Extension Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileExtensionType File Extension Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get File TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type File TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type File TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get md5 Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Md5Value md5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMd5Value() {
        return this.Md5Value;
    }

    /**
     * Set md5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Md5Value md5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMd5Value(String Md5Value) {
        this.Md5Value = Md5Value;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get File sizeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Size File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set File sizeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Size File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get Local Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LocalPath Local Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Local Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LocalPath Local Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get Remote Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemotePath Remote Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set Remote Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemotePath Remote Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get UsernameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerName UsernameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set UsernameNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerName UsernameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Owner User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Owner User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Path Depth
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PathDepth Path Depth
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPathDepth() {
        return this.PathDepth;
    }

    /**
     * Set Path Depth
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PathDepth Path Depth
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPathDepth(Long PathDepth) {
        this.PathDepth = PathDepth;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Additional Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtraInfo Additional Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Additional Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtraInfo Additional Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Local Temporary File Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LocalTempPath Local Temporary File Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocalTempPath() {
        return this.LocalTempPath;
    }

    /**
     * Set Local Temporary File Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LocalTempPath Local Temporary File Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocalTempPath(String LocalTempPath) {
        this.LocalTempPath = LocalTempPath;
    }

    /**
     * Get Local Compressed File Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ZipPath Local Compressed File Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getZipPath() {
        return this.ZipPath;
    }

    /**
     * Set Local Compressed File Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ZipPath Local Compressed File Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setZipPath(String ZipPath) {
        this.ZipPath = ZipPath;
    }

    /**
     * Get COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Bucket COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Bucket COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS Region
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ScriptInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptInfoResponse(ScriptInfoResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Md5Value != null) {
            this.Md5Value = new String(source.Md5Value);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.PathDepth != null) {
            this.PathDepth = new Long(source.PathDepth);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.LocalTempPath != null) {
            this.LocalTempPath = new String(source.LocalTempPath);
        }
        if (source.ZipPath != null) {
            this.ZipPath = new String(source.ZipPath);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Md5Value", this.Md5Value);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "PathDepth", this.PathDepth);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "LocalTempPath", this.LocalTempPath);
        this.setParamSimple(map, prefix + "ZipPath", this.ZipPath);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

