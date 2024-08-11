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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsoleMNPVersionCompileTaskRequest extends AbstractModel {

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Version
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * External URL of the document
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Internal URL of the document
    */
    @SerializedName("FileInnerUrl")
    @Expose
    private String FileInnerUrl;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Type 2 Version
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Version introduction
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Version description
    */
    @SerializedName("MNPVersionDesc")
    @Expose
    private String MNPVersionDesc;

    /**
    * Type 1 Unencrypted 2 Encrypted 3 Source
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Upload platform 1- TCMPP 2 WeChat 3. TCMPP + WeChat
    */
    @SerializedName("ReleaseChannel")
    @Expose
    private Long ReleaseChannel;

    /**
     * Get Mini program ID 
     * @return MNPId Mini program ID
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
     * @param MNPId Mini program ID
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Version 
     * @return MNPVersion Version
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Version
     * @param MNPVersion Version
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get External URL of the document 
     * @return FileUrl External URL of the document
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set External URL of the document
     * @param FileUrl External URL of the document
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Internal URL of the document 
     * @return FileInnerUrl Internal URL of the document
     */
    public String getFileInnerUrl() {
        return this.FileInnerUrl;
    }

    /**
     * Set Internal URL of the document
     * @param FileInnerUrl Internal URL of the document
     */
    public void setFileInnerUrl(String FileInnerUrl) {
        this.FileInnerUrl = FileInnerUrl;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Type 2 Version 
     * @return TaskType Type 2 Version
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Type 2 Version
     * @param TaskType Type 2 Version
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Version introduction 
     * @return MNPVersionIntro Version introduction
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Version introduction
     * @param MNPVersionIntro Version introduction
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Version description 
     * @return MNPVersionDesc Version description
     */
    public String getMNPVersionDesc() {
        return this.MNPVersionDesc;
    }

    /**
     * Set Version description
     * @param MNPVersionDesc Version description
     */
    public void setMNPVersionDesc(String MNPVersionDesc) {
        this.MNPVersionDesc = MNPVersionDesc;
    }

    /**
     * Get Type 1 Unencrypted 2 Encrypted 3 Source 
     * @return SourceType Type 1 Unencrypted 2 Encrypted 3 Source
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Type 1 Unencrypted 2 Encrypted 3 Source
     * @param SourceType Type 1 Unencrypted 2 Encrypted 3 Source
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Upload platform 1- TCMPP 2 WeChat 3. TCMPP + WeChat 
     * @return ReleaseChannel Upload platform 1- TCMPP 2 WeChat 3. TCMPP + WeChat
     */
    public Long getReleaseChannel() {
        return this.ReleaseChannel;
    }

    /**
     * Set Upload platform 1- TCMPP 2 WeChat 3. TCMPP + WeChat
     * @param ReleaseChannel Upload platform 1- TCMPP 2 WeChat 3. TCMPP + WeChat
     */
    public void setReleaseChannel(Long ReleaseChannel) {
        this.ReleaseChannel = ReleaseChannel;
    }

    public CreateConsoleMNPVersionCompileTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleMNPVersionCompileTaskRequest(CreateConsoleMNPVersionCompileTaskRequest source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileInnerUrl != null) {
            this.FileInnerUrl = new String(source.FileInnerUrl);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.MNPVersionIntro != null) {
            this.MNPVersionIntro = new String(source.MNPVersionIntro);
        }
        if (source.MNPVersionDesc != null) {
            this.MNPVersionDesc = new String(source.MNPVersionDesc);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.ReleaseChannel != null) {
            this.ReleaseChannel = new Long(source.ReleaseChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileInnerUrl", this.FileInnerUrl);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "MNPVersionIntro", this.MNPVersionIntro);
        this.setParamSimple(map, prefix + "MNPVersionDesc", this.MNPVersionDesc);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ReleaseChannel", this.ReleaseChannel);

    }
}

