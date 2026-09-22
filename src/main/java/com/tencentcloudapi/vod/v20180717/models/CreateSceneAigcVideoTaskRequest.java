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

public class CreateSceneAigcVideoTaskRequest extends AbstractModel {

    /**
    * **VOD application ID. Customers who activate VOD services after December 25, 2023 must fill in this field with the app ID when accessing resources in VOD applications (whether the default application or a newly created application).**
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Scenario-based video generation parameter configuration.
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcVideoSceneInfo SceneInfo;

    /**
    * Output media file configuration for a scenario-based video task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcVideoOutputConfig OutputConfig;

    /**
    * Input image list. Supported image formats: jpg, jpeg, png, webp.


    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcVideoTaskInputFileInfo [] FileInfos;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Reserved field, used for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * User-customized prompt
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get **VOD application ID. Customers who activate VOD services after December 25, 2023 must fill in this field with the app ID when accessing resources in VOD applications (whether the default application or a newly created application).** 
     * @return SubAppId **VOD application ID. Customers who activate VOD services after December 25, 2023 must fill in this field with the app ID when accessing resources in VOD applications (whether the default application or a newly created application).**
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set **VOD application ID. Customers who activate VOD services after December 25, 2023 must fill in this field with the app ID when accessing resources in VOD applications (whether the default application or a newly created application).**
     * @param SubAppId **VOD application ID. Customers who activate VOD services after December 25, 2023 must fill in this field with the app ID when accessing resources in VOD applications (whether the default application or a newly created application).**
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Scenario-based video generation parameter configuration. 
     * @return SceneInfo Scenario-based video generation parameter configuration.
     */
    public AigcVideoSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set Scenario-based video generation parameter configuration.
     * @param SceneInfo Scenario-based video generation parameter configuration.
     */
    public void setSceneInfo(AigcVideoSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get Output media file configuration for a scenario-based video task. 
     * @return OutputConfig Output media file configuration for a scenario-based video task.
     */
    public SceneAigcVideoOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output media file configuration for a scenario-based video task.
     * @param OutputConfig Output media file configuration for a scenario-based video task.
     */
    public void setOutputConfig(SceneAigcVideoOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get Input image list. Supported image formats: jpg, jpeg, png, webp.

 
     * @return FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp.


     */
    public SceneAigcVideoTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input image list. Supported image formats: jpg, jpeg, png, webp.


     * @param FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp.


     */
    public void setFileInfos(SceneAigcVideoTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Maximum length: 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Maximum length: 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Reserved field, used for special purposes. 
     * @return ExtInfo Reserved field, used for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used for special purposes.
     * @param ExtInfo Reserved field, used for special purposes.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get User-customized prompt 
     * @return Prompt User-customized prompt
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set User-customized prompt
     * @param Prompt User-customized prompt
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public CreateSceneAigcVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSceneAigcVideoTaskRequest(CreateSceneAigcVideoTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new AigcVideoSceneInfo(source.SceneInfo);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SceneAigcVideoOutputConfig(source.OutputConfig);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcVideoTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcVideoTaskInputFileInfo(source.FileInfos[i]);
            }
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
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

