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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMNGVersionRequest extends AbstractModel {

    /**
    * <p>Mini game appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Version number.</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>URL of the mini game file exported from the IDE and uploaded to the file server.<p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Version description.</p>
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * <p>Version type. Valid values: 1: Debug version; 2: Development version.</p> Default value: 2.</p>
    */
    @SerializedName("VersionType")
    @Expose
    private Long VersionType;

    /**
    * <p>Compilation conditions.</p>
    */
    @SerializedName("CompileCondition")
    @Expose
    private String CompileCondition;

    /**
    * <p>Compilation configuration.</p>
    */
    @SerializedName("CompileConfig")
    @Expose
    private String CompileConfig;

    /**
    * <p>CICD ID</p>
    */
    @SerializedName("PipelineId")
    @Expose
    private String PipelineId;

    /**
    * <p>Internal file URL.</p>
    */
    @SerializedName("FileInnerUrl")
    @Expose
    private String FileInnerUrl;

    /**
     * Get <p>Mini game appid.</p> 
     * @return MNPId <p>Mini game appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid.</p>
     * @param MNPId <p>Mini game appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Version number.</p> 
     * @return MNPVersion <p>Version number.</p>
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set <p>Version number.</p>
     * @param MNPVersion <p>Version number.</p>
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get <p>URL of the mini game file exported from the IDE and uploaded to the file server.<p> 
     * @return FileUrl <p>URL of the mini game file exported from the IDE and uploaded to the file server.<p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>URL of the mini game file exported from the IDE and uploaded to the file server.<p>
     * @param FileUrl <p>URL of the mini game file exported from the IDE and uploaded to the file server.<p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Version description.</p> 
     * @return MNPVersionIntro <p>Version description.</p>
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set <p>Version description.</p>
     * @param MNPVersionIntro <p>Version description.</p>
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get <p>Version type. Valid values: 1: Debug version; 2: Development version.</p> Default value: 2.</p> 
     * @return VersionType <p>Version type. Valid values: 1: Debug version; 2: Development version.</p> Default value: 2.</p>
     */
    public Long getVersionType() {
        return this.VersionType;
    }

    /**
     * Set <p>Version type. Valid values: 1: Debug version; 2: Development version.</p> Default value: 2.</p>
     * @param VersionType <p>Version type. Valid values: 1: Debug version; 2: Development version.</p> Default value: 2.</p>
     */
    public void setVersionType(Long VersionType) {
        this.VersionType = VersionType;
    }

    /**
     * Get <p>Compilation conditions.</p> 
     * @return CompileCondition <p>Compilation conditions.</p>
     */
    public String getCompileCondition() {
        return this.CompileCondition;
    }

    /**
     * Set <p>Compilation conditions.</p>
     * @param CompileCondition <p>Compilation conditions.</p>
     */
    public void setCompileCondition(String CompileCondition) {
        this.CompileCondition = CompileCondition;
    }

    /**
     * Get <p>Compilation configuration.</p> 
     * @return CompileConfig <p>Compilation configuration.</p>
     */
    public String getCompileConfig() {
        return this.CompileConfig;
    }

    /**
     * Set <p>Compilation configuration.</p>
     * @param CompileConfig <p>Compilation configuration.</p>
     */
    public void setCompileConfig(String CompileConfig) {
        this.CompileConfig = CompileConfig;
    }

    /**
     * Get <p>CICD ID</p> 
     * @return PipelineId <p>CICD ID</p>
     */
    public String getPipelineId() {
        return this.PipelineId;
    }

    /**
     * Set <p>CICD ID</p>
     * @param PipelineId <p>CICD ID</p>
     */
    public void setPipelineId(String PipelineId) {
        this.PipelineId = PipelineId;
    }

    /**
     * Get <p>Internal file URL.</p> 
     * @return FileInnerUrl <p>Internal file URL.</p>
     */
    public String getFileInnerUrl() {
        return this.FileInnerUrl;
    }

    /**
     * Set <p>Internal file URL.</p>
     * @param FileInnerUrl <p>Internal file URL.</p>
     */
    public void setFileInnerUrl(String FileInnerUrl) {
        this.FileInnerUrl = FileInnerUrl;
    }

    public CreateMNGVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNGVersionRequest(CreateMNGVersionRequest source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.MNPVersionIntro != null) {
            this.MNPVersionIntro = new String(source.MNPVersionIntro);
        }
        if (source.VersionType != null) {
            this.VersionType = new Long(source.VersionType);
        }
        if (source.CompileCondition != null) {
            this.CompileCondition = new String(source.CompileCondition);
        }
        if (source.CompileConfig != null) {
            this.CompileConfig = new String(source.CompileConfig);
        }
        if (source.PipelineId != null) {
            this.PipelineId = new String(source.PipelineId);
        }
        if (source.FileInnerUrl != null) {
            this.FileInnerUrl = new String(source.FileInnerUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "MNPVersionIntro", this.MNPVersionIntro);
        this.setParamSimple(map, prefix + "VersionType", this.VersionType);
        this.setParamSimple(map, prefix + "CompileCondition", this.CompileCondition);
        this.setParamSimple(map, prefix + "CompileConfig", this.CompileConfig);
        this.setParamSimple(map, prefix + "PipelineId", this.PipelineId);
        this.setParamSimple(map, prefix + "FileInnerUrl", this.FileInnerUrl);

    }
}

