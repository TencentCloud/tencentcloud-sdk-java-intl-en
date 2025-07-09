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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserFileInfo extends AbstractModel {

    /**
    * Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * File NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File Type, such as jar, zip, etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * File Upload Type, Resource Management as resource
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * File MD5 Value
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
    * File Size, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Local Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * Local Temporary Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LocalTempPath")
    @Expose
    private String LocalTempPath;

    /**
    * Remote Path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * File owner's uin
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * File depth
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
    * Additional information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ParamInfo [] ExtraInfo;

    /**
    * Absolute path of local temporary compressed file
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ZipPath")
    @Expose
    private String ZipPath;

    /**
    * File's belonging bucket 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region of the file's belonging bucket
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeleteName")
    @Expose
    private String DeleteName;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeleteOwner")
    @Expose
    private String DeleteOwner;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * Additional information base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EncodeExtraInfo")
    @Expose
    private String EncodeExtraInfo;

    /**
     * Get Resource ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceId Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceId Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get File NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FileName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param FileName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File Type, such as jar, zip, etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileExtensionType File Type, such as jar, zip, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set File Type, such as jar, zip, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileExtensionType File Type, such as jar, zip, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get File Upload Type, Resource Management as resource
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type File Upload Type, Resource Management as resource
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File Upload Type, Resource Management as resource
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type File Upload Type, Resource Management as resource
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get File MD5 Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Md5Value File MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMd5Value() {
        return this.Md5Value;
    }

    /**
     * Set File MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Md5Value File MD5 Value
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
     * Get File Size, in bytes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Size File Size, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File Size, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Size File Size, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSize(Long Size) {
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
     * Get Local Temporary Path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LocalTempPath Local Temporary Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocalTempPath() {
        return this.LocalTempPath;
    }

    /**
     * Set Local Temporary Path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LocalTempPath Local Temporary Path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocalTempPath(String LocalTempPath) {
        this.LocalTempPath = LocalTempPath;
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
     * Get File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerName File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerName File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get File owner's uin
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Owner File owner's uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set File owner's uin
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Owner File owner's uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get File depth
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PathDepth File depth
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPathDepth() {
        return this.PathDepth;
    }

    /**
     * Set File depth
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PathDepth File depth
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
     * Get Additional information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtraInfo Additional information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ParamInfo [] getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtraInfo Additional information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtraInfo(ParamInfo [] ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Absolute path of local temporary compressed file
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ZipPath Absolute path of local temporary compressed file
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getZipPath() {
        return this.ZipPath;
    }

    /**
     * Set Absolute path of local temporary compressed file
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ZipPath Absolute path of local temporary compressed file
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setZipPath(String ZipPath) {
        this.ZipPath = ZipPath;
    }

    /**
     * Get File's belonging bucket 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Bucket File's belonging bucket 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set File's belonging bucket 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Bucket File's belonging bucket 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region of the file's belonging bucket
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Region of the file's belonging bucket
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the file's belonging bucket
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Region of the file's belonging bucket
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DeleteName NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDeleteName() {
        return this.DeleteName;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param DeleteName NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeleteName(String DeleteName) {
        this.DeleteName = DeleteName;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DeleteOwner NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDeleteOwner() {
        return this.DeleteOwner;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param DeleteOwner NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeleteOwner(String DeleteOwner) {
        this.DeleteOwner = DeleteOwner;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param Operator NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorName NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorName NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get Additional information base64 encoded
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EncodeExtraInfo Additional information base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEncodeExtraInfo() {
        return this.EncodeExtraInfo;
    }

    /**
     * Set Additional information base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EncodeExtraInfo Additional information base64 encoded
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEncodeExtraInfo(String EncodeExtraInfo) {
        this.EncodeExtraInfo = EncodeExtraInfo;
    }

    public UserFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserFileInfo(UserFileInfo source) {
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
            this.Size = new Long(source.Size);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.LocalTempPath != null) {
            this.LocalTempPath = new String(source.LocalTempPath);
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
            this.ExtraInfo = new ParamInfo[source.ExtraInfo.length];
            for (int i = 0; i < source.ExtraInfo.length; i++) {
                this.ExtraInfo[i] = new ParamInfo(source.ExtraInfo[i]);
            }
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
        if (source.DeleteName != null) {
            this.DeleteName = new String(source.DeleteName);
        }
        if (source.DeleteOwner != null) {
            this.DeleteOwner = new String(source.DeleteOwner);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.EncodeExtraInfo != null) {
            this.EncodeExtraInfo = new String(source.EncodeExtraInfo);
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
        this.setParamSimple(map, prefix + "LocalTempPath", this.LocalTempPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "PathDepth", this.PathDepth);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ZipPath", this.ZipPath);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeleteName", this.DeleteName);
        this.setParamSimple(map, prefix + "DeleteOwner", this.DeleteOwner);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "EncodeExtraInfo", this.EncodeExtraInfo);

    }
}

