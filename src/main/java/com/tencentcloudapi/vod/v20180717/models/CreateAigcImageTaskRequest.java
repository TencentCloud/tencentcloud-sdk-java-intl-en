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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcImageTaskRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcImageTaskInputFileInfo [] FileInfos;

    /**
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * 
    */
    @SerializedName("EnhancePrompt")
    @Expose
    private String EnhancePrompt;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcImageOutputConfig OutputConfig;

    /**
    * 
    */
    @SerializedName("InputRegion")
    @Expose
    private String InputRegion;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return ModelName 
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 
     * @param ModelName 
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get  
     * @return ModelVersion 
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 
     * @param ModelVersion 
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get  
     * @return FileInfos 
     */
    public AigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 
     * @param FileInfos 
     */
    public void setFileInfos(AigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get  
     * @return Prompt 
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 
     * @param Prompt 
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get  
     * @return NegativePrompt 
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set 
     * @param NegativePrompt 
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get  
     * @return EnhancePrompt 
     */
    public String getEnhancePrompt() {
        return this.EnhancePrompt;
    }

    /**
     * Set 
     * @param EnhancePrompt 
     */
    public void setEnhancePrompt(String EnhancePrompt) {
        this.EnhancePrompt = EnhancePrompt;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public AigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
     */
    public void setOutputConfig(AigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get  
     * @return InputRegion 
     */
    public String getInputRegion() {
        return this.InputRegion;
    }

    /**
     * Set 
     * @param InputRegion 
     */
    public void setInputRegion(String InputRegion) {
        this.InputRegion = InputRegion;
    }

    /**
     * Get  
     * @return SceneType 
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 
     * @param SceneType 
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get  
     * @return Seed 
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 
     * @param Seed 
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return TasksPriority 
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 
     * @param TasksPriority 
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcImageTaskRequest(CreateAigcImageTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new AigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.EnhancePrompt != null) {
            this.EnhancePrompt = new String(source.EnhancePrompt);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcImageOutputConfig(source.OutputConfig);
        }
        if (source.InputRegion != null) {
            this.InputRegion = new String(source.InputRegion);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamSimple(map, prefix + "EnhancePrompt", this.EnhancePrompt);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "InputRegion", this.InputRegion);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

