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

public class EditMediaRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * 
    */
    @SerializedName("StreamInfos")
    @Expose
    private EditMediaStreamInfo [] StreamInfos;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private EditMediaOutputConfig OutputConfig;

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
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get  
     * @return InputType 
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 
     * @param InputType 
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

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
     * @return FileInfos 
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 
     * @param FileInfos 
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get  
     * @return StreamInfos 
     */
    public EditMediaStreamInfo [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 
     * @param StreamInfos 
     */
    public void setStreamInfos(EditMediaStreamInfo [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return ProcedureName 
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set 
     * @param ProcedureName 
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public EditMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
     */
    public void setOutputConfig(EditMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
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

    public EditMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaRequest(EditMediaRequest source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new EditMediaFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new EditMediaFileInfo(source.FileInfos[i]);
            }
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new EditMediaStreamInfo[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new EditMediaStreamInfo(source.StreamInfos[i]);
            }
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ProcedureName != null) {
            this.ProcedureName = new String(source.ProcedureName);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new EditMediaOutputConfig(source.OutputConfig);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

