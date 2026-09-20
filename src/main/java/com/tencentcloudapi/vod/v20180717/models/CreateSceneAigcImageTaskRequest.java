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

public class CreateSceneAigcImageTaskRequest extends AbstractModel {

    /**
    * **VOD app ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).**
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Scenario-based image generation parameter configuration.
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcImageSceneInfo SceneInfo;

    /**
    * Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data.

- AI outfit change scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] FileInfos;

    /**
    * Output media file configuration for scenario-based image generation tasks.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcImageOutputConfig OutputConfig;

    /**
    * An identification code for deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Max length: 1000 characters.
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
     * Get **VOD app ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).** 
     * @return SubAppId **VOD app ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).**
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set **VOD app ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).**
     * @param SubAppId **VOD app ID. Customers who activate on-demand services from December 25, 2023 must fill in this field with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).**
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Scenario-based image generation parameter configuration. 
     * @return SceneInfo Scenario-based image generation parameter configuration.
     */
    public AigcImageSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set Scenario-based image generation parameter configuration.
     * @param SceneInfo Scenario-based image generation parameter configuration.
     */
    public void setSceneInfo(AigcImageSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data.

- AI outfit change scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles. 
     * @return FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data.

- AI outfit change scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     */
    public SceneAigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data.

- AI outfit change scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     * @param FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data.

- AI outfit change scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     */
    public void setFileInfos(SceneAigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Output media file configuration for scenario-based image generation tasks. 
     * @return OutputConfig Output media file configuration for scenario-based image generation tasks.
     */
    public SceneAigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Output media file configuration for scenario-based image generation tasks.
     * @param OutputConfig Output media file configuration for scenario-based image generation tasks.
     */
    public void setOutputConfig(SceneAigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get An identification code for deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication. 
     * @return SessionId An identification code for deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identification code for deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     * @param SessionId An identification code for deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Max length: 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Max length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Max length: 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. The audio and video quality revival complete callback will return the value of this field. Max length: 1000 characters.
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

    public CreateSceneAigcImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSceneAigcImageTaskRequest(CreateSceneAigcImageTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new AigcImageSceneInfo(source.SceneInfo);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new SceneAigcImageTaskInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SceneAigcImageOutputConfig(source.OutputConfig);
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
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

