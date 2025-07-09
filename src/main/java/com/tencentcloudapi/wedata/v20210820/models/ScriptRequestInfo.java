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

public class ScriptRequestInfo extends AbstractModel {

    /**
    * Script path
Project area 1470575647377821696 project, under the f1 directory:
/datastudio/project/1470575647377821696/f1/sql1234.sql
Personal area:
/datastudio/personal/sqlTTT.sql
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Script Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Operation Type
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Additional Information
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * Bucket Name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * File Extension Type
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
     * Get Script path
Project area 1470575647377821696 project, under the f1 directory:
/datastudio/project/1470575647377821696/f1/sql1234.sql
Personal area:
/datastudio/personal/sqlTTT.sql 
     * @return FilePath Script path
Project area 1470575647377821696 project, under the f1 directory:
/datastudio/project/1470575647377821696/f1/sql1234.sql
Personal area:
/datastudio/personal/sqlTTT.sql
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Script path
Project area 1470575647377821696 project, under the f1 directory:
/datastudio/project/1470575647377821696/f1/sql1234.sql
Personal area:
/datastudio/personal/sqlTTT.sql
     * @param FilePath Script path
Project area 1470575647377821696 project, under the f1 directory:
/datastudio/project/1470575647377821696/f1/sql1234.sql
Personal area:
/datastudio/personal/sqlTTT.sql
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

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
     * Get Script Version 
     * @return Version Script Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Script Version
     * @param Version Script Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Operation Type 
     * @return Operation Operation Type
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation Type
     * @param Operation Operation Type
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Additional Information 
     * @return ExtraInfo Additional Information
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Additional Information
     * @param ExtraInfo Additional Information
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Bucket Name 
     * @return BucketName Bucket Name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket Name
     * @param BucketName Bucket Name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get File Extension Type 
     * @return FileExtensionType File Extension Type
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set File Extension Type
     * @param FileExtensionType File Extension Type
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    public ScriptRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptRequestInfo(ScriptRequestInfo source) {
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);

    }
}

