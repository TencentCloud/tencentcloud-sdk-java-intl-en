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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Code extends AbstractModel {

    /**
    * Object bucket name (enter the custom part of the bucket name without `-appid`)
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * File path of code package stored in COS, which should start with “/”
    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * This parameter contains a .zip file (up to 50 MB) of the function code file and its dependencies. When this API is used, the content of the .zip file needs to be Base64-encoded
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
    * (Disused) Git address
    */
    @SerializedName("GitUrl")
    @Expose
    private String GitUrl;

    /**
    * (Disused) Git username
    */
    @SerializedName("GitUserName")
    @Expose
    private String GitUserName;

    /**
    * (Disused) Git password
    */
    @SerializedName("GitPassword")
    @Expose
    private String GitPassword;

    /**
    * (Disused) Git password after encryption. It’s usually not required.
    */
    @SerializedName("GitPasswordSecret")
    @Expose
    private String GitPasswordSecret;

    /**
    * (Disused) Git branch
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
    * (Disused) Directory to the codes in the Git repository. 
    */
    @SerializedName("GitDirectory")
    @Expose
    private String GitDirectory;

    /**
    * (Disused) 
    */
    @SerializedName("GitCommitId")
    @Expose
    private String GitCommitId;

    /**
    * (Disused) Git username after encryption. It’s usually not required.
    */
    @SerializedName("GitUserNameSecret")
    @Expose
    private String GitUserNameSecret;

    /**
    * TCR image configurations
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageConfig ImageConfig;

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
     * Get File path of code package stored in COS, which should start with “/” 
     * @return CosObjectName File path of code package stored in COS, which should start with “/”
     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * Set File path of code package stored in COS, which should start with “/”
     * @param CosObjectName File path of code package stored in COS, which should start with “/”
     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * Get This parameter contains a .zip file (up to 50 MB) of the function code file and its dependencies. When this API is used, the content of the .zip file needs to be Base64-encoded 
     * @return ZipFile This parameter contains a .zip file (up to 50 MB) of the function code file and its dependencies. When this API is used, the content of the .zip file needs to be Base64-encoded
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set This parameter contains a .zip file (up to 50 MB) of the function code file and its dependencies. When this API is used, the content of the .zip file needs to be Base64-encoded
     * @param ZipFile This parameter contains a .zip file (up to 50 MB) of the function code file and its dependencies. When this API is used, the content of the .zip file needs to be Base64-encoded
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
     * Get (Disused) Git address 
     * @return GitUrl (Disused) Git address
     */
    public String getGitUrl() {
        return this.GitUrl;
    }

    /**
     * Set (Disused) Git address
     * @param GitUrl (Disused) Git address
     */
    public void setGitUrl(String GitUrl) {
        this.GitUrl = GitUrl;
    }

    /**
     * Get (Disused) Git username 
     * @return GitUserName (Disused) Git username
     */
    public String getGitUserName() {
        return this.GitUserName;
    }

    /**
     * Set (Disused) Git username
     * @param GitUserName (Disused) Git username
     */
    public void setGitUserName(String GitUserName) {
        this.GitUserName = GitUserName;
    }

    /**
     * Get (Disused) Git password 
     * @return GitPassword (Disused) Git password
     */
    public String getGitPassword() {
        return this.GitPassword;
    }

    /**
     * Set (Disused) Git password
     * @param GitPassword (Disused) Git password
     */
    public void setGitPassword(String GitPassword) {
        this.GitPassword = GitPassword;
    }

    /**
     * Get (Disused) Git password after encryption. It’s usually not required. 
     * @return GitPasswordSecret (Disused) Git password after encryption. It’s usually not required.
     */
    public String getGitPasswordSecret() {
        return this.GitPasswordSecret;
    }

    /**
     * Set (Disused) Git password after encryption. It’s usually not required.
     * @param GitPasswordSecret (Disused) Git password after encryption. It’s usually not required.
     */
    public void setGitPasswordSecret(String GitPasswordSecret) {
        this.GitPasswordSecret = GitPasswordSecret;
    }

    /**
     * Get (Disused) Git branch 
     * @return GitBranch (Disused) Git branch
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set (Disused) Git branch
     * @param GitBranch (Disused) Git branch
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    /**
     * Get (Disused) Directory to the codes in the Git repository.  
     * @return GitDirectory (Disused) Directory to the codes in the Git repository. 
     */
    public String getGitDirectory() {
        return this.GitDirectory;
    }

    /**
     * Set (Disused) Directory to the codes in the Git repository. 
     * @param GitDirectory (Disused) Directory to the codes in the Git repository. 
     */
    public void setGitDirectory(String GitDirectory) {
        this.GitDirectory = GitDirectory;
    }

    /**
     * Get (Disused)  
     * @return GitCommitId (Disused) 
     */
    public String getGitCommitId() {
        return this.GitCommitId;
    }

    /**
     * Set (Disused) 
     * @param GitCommitId (Disused) 
     */
    public void setGitCommitId(String GitCommitId) {
        this.GitCommitId = GitCommitId;
    }

    /**
     * Get (Disused) Git username after encryption. It’s usually not required. 
     * @return GitUserNameSecret (Disused) Git username after encryption. It’s usually not required.
     */
    public String getGitUserNameSecret() {
        return this.GitUserNameSecret;
    }

    /**
     * Set (Disused) Git username after encryption. It’s usually not required.
     * @param GitUserNameSecret (Disused) Git username after encryption. It’s usually not required.
     */
    public void setGitUserNameSecret(String GitUserNameSecret) {
        this.GitUserNameSecret = GitUserNameSecret;
    }

    /**
     * Get TCR image configurations 
     * @return ImageConfig TCR image configurations
     */
    public ImageConfig getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set TCR image configurations
     * @param ImageConfig TCR image configurations
     */
    public void setImageConfig(ImageConfig ImageConfig) {
        this.ImageConfig = ImageConfig;
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
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageConfig(source.ImageConfig);
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
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);

    }
}

