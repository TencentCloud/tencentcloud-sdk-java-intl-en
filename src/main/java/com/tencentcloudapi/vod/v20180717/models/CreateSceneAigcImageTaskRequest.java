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
    * **VOD application ID. For customers who activate on-demand services after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be filled in with the app ID.**
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
    * Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data:

- AI outfit changing scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] FileInfos;

    /**
    * Configuration of the output media file for a scenario-based image generation task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcImageOutputConfig OutputConfig;

    /**
    * Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context. This is used to pass through user request information. The value of this field will be returned in the audio and video quality revival completion callback. The maximum length is 1000 characters.
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
     * Get **VOD application ID. For customers who activate on-demand services after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be filled in with the app ID.** 
     * @return SubAppId **VOD application ID. For customers who activate on-demand services after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be filled in with the app ID.**
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set **VOD application ID. For customers who activate on-demand services after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be filled in with the app ID.**
     * @param SubAppId **VOD application ID. For customers who activate on-demand services after December 25, 2023, when accessing resources in on-demand applications (whether the default application or a newly created application), this field must be filled in with the app ID.**
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
     * Get Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data:

- AI outfit changing scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles. 
     * @return FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data:

- AI outfit changing scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     */
    public SceneAigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data:

- AI outfit changing scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     * @param FileInfos Input image list. Supported image formats: jpg, jpeg, png, webp. Different scenarios require different input data:

- AI outfit changing scenario: Input Only 1 **model** image.
- AI product image generation scenario: manually input 1–10 images of the same product from different angles.
     */
    public void setFileInfos(SceneAigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Configuration of the output media file for a scenario-based image generation task. 
     * @return OutputConfig Configuration of the output media file for a scenario-based image generation task.
     */
    public SceneAigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Configuration of the output media file for a scenario-based image generation task.
     * @param OutputConfig Configuration of the output media file for a scenario-based image generation task.
     */
    public void setOutputConfig(SceneAigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed. 
     * @return SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     * @param SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context. This is used to pass through user request information. The value of this field will be returned in the audio and video quality revival completion callback. The maximum length is 1000 characters. 
     * @return SessionContext Source context. This is used to pass through user request information. The value of this field will be returned in the audio and video quality revival completion callback. The maximum length is 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context. This is used to pass through user request information. The value of this field will be returned in the audio and video quality revival completion callback. The maximum length is 1000 characters.
     * @param SessionContext Source context. This is used to pass through user request information. The value of this field will be returned in the audio and video quality revival completion callback. The maximum length is 1000 characters.
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

