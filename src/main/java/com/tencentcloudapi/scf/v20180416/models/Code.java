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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Code extends AbstractModel{

    /**
    * Object bucket name (enter the custom part of the bucket name without `-appid`)
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * COS object path
    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
    */
    @SerializedName("ZipFile")
    @Expose
    private String ZipFile;

    /**
    * COS region. For Beijing regions, you need to import `ap-beijing`. For Beijing Region 1, you need to input `ap-beijing-1`. For other regions, no import is required.
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * `DemoId` is required if Demo is used for the creation.
    */
    @SerializedName("DemoId")
    @Expose
    private String DemoId;

    /**
    * `TempCosObjectName` is required if TempCos is used for the creation.
    */
    @SerializedName("TempCosObjectName")
    @Expose
    private String TempCosObjectName;

    /**
    * Git address
    */
    @SerializedName("GitUrl")
    @Expose
    private String GitUrl;

    /**
    * Git user name
    */
    @SerializedName("GitUserName")
    @Expose
    private String GitUserName;

    /**
    * Git password
    */
    @SerializedName("GitPassword")
    @Expose
    private String GitPassword;

    /**
    * Git password after encryption. In general, this value is not required.
    */
    @SerializedName("GitPasswordSecret")
    @Expose
    private String GitPasswordSecret;

    /**
    * Git branch
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
    * Code path in Git repository
    */
    @SerializedName("GitDirectory")
    @Expose
    private String GitDirectory;

    /**
    * Version to be pulled
    */
    @SerializedName("GitCommitId")
    @Expose
    private String GitCommitId;

    /**
    * Git user name after encryption. In general, this value is not required.
    */
    @SerializedName("GitUserNameSecret")
    @Expose
    private String GitUserNameSecret;

    /**
     * Get Object bucket name (enter the custom part of the bucket name without `-appid`) 
     * @return CosBucketName Object bucket name (enter the custom part of the bucket name without `-appid`)
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set Object bucket name (enter the custom part of the bucket name without `-appid`)
     * @param CosBucketName Object bucket name (enter the custom part of the bucket name without `-appid`)
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get COS object path 
     * @return CosObjectName COS object path
     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * Set COS object path
     * @param CosObjectName COS object path
     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * Get It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported. 
     * @return ZipFile It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     * @param ZipFile It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
    }

    /**
     * Get COS region. For Beijing regions, you need to import `ap-beijing`. For Beijing Region 1, you need to input `ap-beijing-1`. For other regions, no import is required. 
     * @return CosBucketRegion COS region. For Beijing regions, you need to import `ap-beijing`. For Beijing Region 1, you need to input `ap-beijing-1`. For other regions, no import is required.
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set COS region. For Beijing regions, you need to import `ap-beijing`. For Beijing Region 1, you need to input `ap-beijing-1`. For other regions, no import is required.
     * @param CosBucketRegion COS region. For Beijing regions, you need to import `ap-beijing`. For Beijing Region 1, you need to input `ap-beijing-1`. For other regions, no import is required.
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get `DemoId` is required if Demo is used for the creation. 
     * @return DemoId `DemoId` is required if Demo is used for the creation.
     */
    public String getDemoId() {
        return this.DemoId;
    }

    /**
     * Set `DemoId` is required if Demo is used for the creation.
     * @param DemoId `DemoId` is required if Demo is used for the creation.
     */
    public void setDemoId(String DemoId) {
        this.DemoId = DemoId;
    }

    /**
     * Get `TempCosObjectName` is required if TempCos is used for the creation. 
     * @return TempCosObjectName `TempCosObjectName` is required if TempCos is used for the creation.
     */
    public String getTempCosObjectName() {
        return this.TempCosObjectName;
    }

    /**
     * Set `TempCosObjectName` is required if TempCos is used for the creation.
     * @param TempCosObjectName `TempCosObjectName` is required if TempCos is used for the creation.
     */
    public void setTempCosObjectName(String TempCosObjectName) {
        this.TempCosObjectName = TempCosObjectName;
    }

    /**
     * Get Git address 
     * @return GitUrl Git address
     */
    public String getGitUrl() {
        return this.GitUrl;
    }

    /**
     * Set Git address
     * @param GitUrl Git address
     */
    public void setGitUrl(String GitUrl) {
        this.GitUrl = GitUrl;
    }

    /**
     * Get Git user name 
     * @return GitUserName Git user name
     */
    public String getGitUserName() {
        return this.GitUserName;
    }

    /**
     * Set Git user name
     * @param GitUserName Git user name
     */
    public void setGitUserName(String GitUserName) {
        this.GitUserName = GitUserName;
    }

    /**
     * Get Git password 
     * @return GitPassword Git password
     */
    public String getGitPassword() {
        return this.GitPassword;
    }

    /**
     * Set Git password
     * @param GitPassword Git password
     */
    public void setGitPassword(String GitPassword) {
        this.GitPassword = GitPassword;
    }

    /**
     * Get Git password after encryption. In general, this value is not required. 
     * @return GitPasswordSecret Git password after encryption. In general, this value is not required.
     */
    public String getGitPasswordSecret() {
        return this.GitPasswordSecret;
    }

    /**
     * Set Git password after encryption. In general, this value is not required.
     * @param GitPasswordSecret Git password after encryption. In general, this value is not required.
     */
    public void setGitPasswordSecret(String GitPasswordSecret) {
        this.GitPasswordSecret = GitPasswordSecret;
    }

    /**
     * Get Git branch 
     * @return GitBranch Git branch
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set Git branch
     * @param GitBranch Git branch
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    /**
     * Get Code path in Git repository 
     * @return GitDirectory Code path in Git repository
     */
    public String getGitDirectory() {
        return this.GitDirectory;
    }

    /**
     * Set Code path in Git repository
     * @param GitDirectory Code path in Git repository
     */
    public void setGitDirectory(String GitDirectory) {
        this.GitDirectory = GitDirectory;
    }

    /**
     * Get Version to be pulled 
     * @return GitCommitId Version to be pulled
     */
    public String getGitCommitId() {
        return this.GitCommitId;
    }

    /**
     * Set Version to be pulled
     * @param GitCommitId Version to be pulled
     */
    public void setGitCommitId(String GitCommitId) {
        this.GitCommitId = GitCommitId;
    }

    /**
     * Get Git user name after encryption. In general, this value is not required. 
     * @return GitUserNameSecret Git user name after encryption. In general, this value is not required.
     */
    public String getGitUserNameSecret() {
        return this.GitUserNameSecret;
    }

    /**
     * Set Git user name after encryption. In general, this value is not required.
     * @param GitUserNameSecret Git user name after encryption. In general, this value is not required.
     */
    public void setGitUserNameSecret(String GitUserNameSecret) {
        this.GitUserNameSecret = GitUserNameSecret;
    }

    public Code() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Code(Code source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosObjectName != null) {
            this.CosObjectName = new String(source.CosObjectName);
        }
        if (source.ZipFile != null) {
            this.ZipFile = new String(source.ZipFile);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.DemoId != null) {
            this.DemoId = new String(source.DemoId);
        }
        if (source.TempCosObjectName != null) {
            this.TempCosObjectName = new String(source.TempCosObjectName);
        }
        if (source.GitUrl != null) {
            this.GitUrl = new String(source.GitUrl);
        }
        if (source.GitUserName != null) {
            this.GitUserName = new String(source.GitUserName);
        }
        if (source.GitPassword != null) {
            this.GitPassword = new String(source.GitPassword);
        }
        if (source.GitPasswordSecret != null) {
            this.GitPasswordSecret = new String(source.GitPasswordSecret);
        }
        if (source.GitBranch != null) {
            this.GitBranch = new String(source.GitBranch);
        }
        if (source.GitDirectory != null) {
            this.GitDirectory = new String(source.GitDirectory);
        }
        if (source.GitCommitId != null) {
            this.GitCommitId = new String(source.GitCommitId);
        }
        if (source.GitUserNameSecret != null) {
            this.GitUserNameSecret = new String(source.GitUserNameSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "DemoId", this.DemoId);
        this.setParamSimple(map, prefix + "TempCosObjectName", this.TempCosObjectName);
        this.setParamSimple(map, prefix + "GitUrl", this.GitUrl);
        this.setParamSimple(map, prefix + "GitUserName", this.GitUserName);
        this.setParamSimple(map, prefix + "GitPassword", this.GitPassword);
        this.setParamSimple(map, prefix + "GitPasswordSecret", this.GitPasswordSecret);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);
        this.setParamSimple(map, prefix + "GitDirectory", this.GitDirectory);
        this.setParamSimple(map, prefix + "GitCommitId", this.GitCommitId);
        this.setParamSimple(map, prefix + "GitUserNameSecret", this.GitUserNameSecret);

    }
}

