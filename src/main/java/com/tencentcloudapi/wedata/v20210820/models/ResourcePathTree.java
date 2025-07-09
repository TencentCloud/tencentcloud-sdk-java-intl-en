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

public class ResourcePathTree extends AbstractModel {

    /**
    * Resource name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Is leaf node
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * Resource ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Local path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * Remote path
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * File TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * File sizeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * File MD5 value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Md5Value")
    @Expose
    private String Md5Value;

    /**
    * File Owner's Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * Updater
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * File Updater UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * COS Region
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Additional InformationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
     * Get Resource name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Resource name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Name Resource name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Is leaf node
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsLeaf Is leaf node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set Is leaf node
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsLeaf Is leaf node
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

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
     * Get Local path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LocalPath Local path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Local path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LocalPath Local path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get Remote path
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemotePath Remote path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set Remote path
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemotePath Remote path
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get File TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FileExtensionType File TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set File TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param FileExtensionType File TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get File sizeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Size File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File sizeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Size File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get File MD5 value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Md5Value File MD5 value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMd5Value() {
        return this.Md5Value;
    }

    /**
     * Set File MD5 value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Md5Value File MD5 value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMd5Value(String Md5Value) {
        this.Md5Value = Md5Value;
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
     * Get Updater
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateUser Updater
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updater
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateUser Updater
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get File Updater UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateUserId File Updater UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set File Updater UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateUserId File Updater UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CosBucket COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CosBucket COS Bucket Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get COS Region
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CosRegion COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CosRegion COS Region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Additional InformationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtraInfo Additional InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Additional InformationNote: This field may return null, indicating that no valid value can be obtained.
     * @param ExtraInfo Additional InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public ResourcePathTree() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePathTree(ResourcePathTree source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
            this.Size = new Long(source.Size);
        }
        if (source.Md5Value != null) {
            this.Md5Value = new String(source.Md5Value);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Md5Value", this.Md5Value);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);

    }
}

