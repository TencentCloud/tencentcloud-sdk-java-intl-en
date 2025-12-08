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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Library extends AbstractModel {

    /**
    * Media library ID.
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * Specifies the friendly name of the media library.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies the COS storage bucket bound to the media library.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Specifies the region where the COS bucket bound to the media library is located.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Specifies the access domain of the business API for the media library.
    */
    @SerializedName("AccessDomain")
    @Expose
    private String AccessDomain;

    /**
    * Creation time of the media library.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Media library configuration item.
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
    * Media library amount in Bytes. since the number type has precision limitations, this field is a String type.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Number of media library directories. since the String type is used due to precision limitations of the number type, this field is of String type.
    */
    @SerializedName("DirNum")
    @Expose
    private String DirNum;

    /**
    * Number of files in the media library. since the String type is used due to precision limitations of the number type, this field is of String type.
    */
    @SerializedName("FileNum")
    @Expose
    private String FileNum;

    /**
     * Get Media library ID. 
     * @return LibraryId Media library ID.
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set Media library ID.
     * @param LibraryId Media library ID.
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get Specifies the friendly name of the media library. 
     * @return Name Specifies the friendly name of the media library.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the friendly name of the media library.
     * @param Name Specifies the friendly name of the media library.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies the COS storage bucket bound to the media library. 
     * @return BucketName Specifies the COS storage bucket bound to the media library.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Specifies the COS storage bucket bound to the media library.
     * @param BucketName Specifies the COS storage bucket bound to the media library.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Specifies the region where the COS bucket bound to the media library is located. 
     * @return BucketRegion Specifies the region where the COS bucket bound to the media library is located.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Specifies the region where the COS bucket bound to the media library is located.
     * @param BucketRegion Specifies the region where the COS bucket bound to the media library is located.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Specifies the access domain of the business API for the media library. 
     * @return AccessDomain Specifies the access domain of the business API for the media library.
     */
    public String getAccessDomain() {
        return this.AccessDomain;
    }

    /**
     * Set Specifies the access domain of the business API for the media library.
     * @param AccessDomain Specifies the access domain of the business API for the media library.
     */
    public void setAccessDomain(String AccessDomain) {
        this.AccessDomain = AccessDomain;
    }

    /**
     * Get Creation time of the media library. 
     * @return CreationTime Creation time of the media library.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time of the media library.
     * @param CreationTime Creation time of the media library.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Media library configuration item. 
     * @return LibraryExtension Media library configuration item.
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set Media library configuration item.
     * @param LibraryExtension Media library configuration item.
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    /**
     * Get Media library amount in Bytes. since the number type has precision limitations, this field is a String type. 
     * @return Size Media library amount in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Media library amount in Bytes. since the number type has precision limitations, this field is a String type.
     * @param Size Media library amount in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Number of media library directories. since the String type is used due to precision limitations of the number type, this field is of String type. 
     * @return DirNum Number of media library directories. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public String getDirNum() {
        return this.DirNum;
    }

    /**
     * Set Number of media library directories. since the String type is used due to precision limitations of the number type, this field is of String type.
     * @param DirNum Number of media library directories. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public void setDirNum(String DirNum) {
        this.DirNum = DirNum;
    }

    /**
     * Get Number of files in the media library. since the String type is used due to precision limitations of the number type, this field is of String type. 
     * @return FileNum Number of files in the media library. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public String getFileNum() {
        return this.FileNum;
    }

    /**
     * Set Number of files in the media library. since the String type is used due to precision limitations of the number type, this field is of String type.
     * @param FileNum Number of files in the media library. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public void setFileNum(String FileNum) {
        this.FileNum = FileNum;
    }

    public Library() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Library(Library source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.AccessDomain != null) {
            this.AccessDomain = new String(source.AccessDomain);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.DirNum != null) {
            this.DirNum = new String(source.DirNum);
        }
        if (source.FileNum != null) {
            this.FileNum = new String(source.FileNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "AccessDomain", this.AccessDomain);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DirNum", this.DirNum);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);

    }
}

