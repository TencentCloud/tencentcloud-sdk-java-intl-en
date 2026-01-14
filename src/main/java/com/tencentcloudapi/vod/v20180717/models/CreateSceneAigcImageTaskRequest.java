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
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Scenario-Based image generation parameter configuration.
    */
    @SerializedName("SceneInfo")
    @Expose
    private AigcImageSceneInfo SceneInfo;

    /**
    * Input image list. supported image formats: jpg, jpeg, png, webp. different scenarios require different input data.

- AI clothing change scenario: input only 1 model image.
- AI product image scenario: manually input 1-10 images of different angles per product.
    */
    @SerializedName("FileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] FileInfos;

    /**
    * Specifies the output media file configuration for the scenario-based image task.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SceneAigcImageOutputConfig OutputConfig;

    /**
    * An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Reserved field, used for special purpose.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Scenario-Based image generation parameter configuration. 
     * @return SceneInfo Scenario-Based image generation parameter configuration.
     */
    public AigcImageSceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set Scenario-Based image generation parameter configuration.
     * @param SceneInfo Scenario-Based image generation parameter configuration.
     */
    public void setSceneInfo(AigcImageSceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Get Input image list. supported image formats: jpg, jpeg, png, webp. different scenarios require different input data.

- AI clothing change scenario: input only 1 model image.
- AI product image scenario: manually input 1-10 images of different angles per product. 
     * @return FileInfos Input image list. supported image formats: jpg, jpeg, png, webp. different scenarios require different input data.

- AI clothing change scenario: input only 1 model image.
- AI product image scenario: manually input 1-10 images of different angles per product.
     */
    public SceneAigcImageTaskInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input image list. supported image formats: jpg, jpeg, png, webp. different scenarios require different input data.

- AI clothing change scenario: input only 1 model image.
- AI product image scenario: manually input 1-10 images of different angles per product.
     * @param FileInfos Input image list. supported image formats: jpg, jpeg, png, webp. different scenarios require different input data.

- AI clothing change scenario: input only 1 model image.
- AI product image scenario: manually input 1-10 images of different angles per product.
     */
    public void setFileInfos(SceneAigcImageTaskInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Specifies the output media file configuration for the scenario-based image task. 
     * @return OutputConfig Specifies the output media file configuration for the scenario-based image task.
     */
    public SceneAigcImageOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Specifies the output media file configuration for the scenario-based image task.
     * @param OutputConfig Specifies the output media file configuration for the scenario-based image task.
     */
    public void setOutputConfig(SceneAigcImageOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication. 
     * @return SessionId An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     * @param SessionId An identifier for deduplication. if there has been a request with the same identifier within the past 3 days, an error will be returned for the current request. the maximum length is 50 characters. leaving it blank or using an empty string indicates no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters. 
     * @return SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     * @param SessionContext Source context, used to pass through user request information. the audio and video quality revival complete callback will return the value of this field, up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0. 
     * @return TasksPriority Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     * @param TasksPriority Task priority. the higher the value, the higher the priority. the value range is from -10 to 10. if left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Reserved field, used for special purpose. 
     * @return ExtInfo Reserved field, used for special purpose.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used for special purpose.
     * @param ExtInfo Reserved field, used for special purpose.
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

