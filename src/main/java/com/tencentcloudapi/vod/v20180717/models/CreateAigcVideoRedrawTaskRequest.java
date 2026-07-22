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

public class CreateAigcVideoRedrawTaskRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>File information of the input video for the AIGC video conversion task. The input video duration should be less than 90 seconds, and the size should be within 2GB.</p>
    */
    @SerializedName("FileInfo")
    @Expose
    private AigcVideoRedrawTaskInputFileInfo FileInfo;

    /**
    * <p>Output media file configuration for the AIGC video conversion task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcVideoRedrawOutputConfig OutputConfig;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>Reserved field, used when special purpose.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>File information of the input video for the AIGC video conversion task. The input video duration should be less than 90 seconds, and the size should be within 2GB.</p> 
     * @return FileInfo <p>File information of the input video for the AIGC video conversion task. The input video duration should be less than 90 seconds, and the size should be within 2GB.</p>
     */
    public AigcVideoRedrawTaskInputFileInfo getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set <p>File information of the input video for the AIGC video conversion task. The input video duration should be less than 90 seconds, and the size should be within 2GB.</p>
     * @param FileInfo <p>File information of the input video for the AIGC video conversion task. The input video duration should be less than 90 seconds, and the size should be within 2GB.</p>
     */
    public void setFileInfo(AigcVideoRedrawTaskInputFileInfo FileInfo) {
        this.FileInfo = FileInfo;
    }

    /**
     * Get <p>Output media file configuration for the AIGC video conversion task.</p> 
     * @return OutputConfig <p>Output media file configuration for the AIGC video conversion task.</p>
     */
    public AigcVideoRedrawOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output media file configuration for the AIGC video conversion task.</p>
     * @param OutputConfig <p>Output media file configuration for the AIGC video conversion task.</p>
     */
    public void setOutputConfig(AigcVideoRedrawOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p> 
     * @return TasksPriority <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     * @param TasksPriority <p>Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>Reserved field, used when special purpose.</p> 
     * @return ExtInfo <p>Reserved field, used when special purpose.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used when special purpose.</p>
     * @param ExtInfo <p>Reserved field, used when special purpose.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcVideoRedrawTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcVideoRedrawTaskRequest(CreateAigcVideoRedrawTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileInfo != null) {
            this.FileInfo = new AigcVideoRedrawTaskInputFileInfo(source.FileInfo);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcVideoRedrawOutputConfig(source.OutputConfig);
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
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

