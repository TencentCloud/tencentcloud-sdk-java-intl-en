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

public class EditMediaTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 
    */
    @SerializedName("Input")
    @Expose
    private EditMediaTaskInput Input;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private EditMediaTaskOutput Output;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * 
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

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
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ErrCode 
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 
     * @param ErrCode 
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get  
     * @return ErrCodeExt 
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set 
     * @param ErrCodeExt 
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get  
     * @return Message 
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 
     * @param Message 
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get  
     * @return Progress 
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 
     * @param Progress 
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get  
     * @return Input 
     */
    public EditMediaTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set 
     * @param Input 
     */
    public void setInput(EditMediaTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get  
     * @return Output 
     */
    public EditMediaTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(EditMediaTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get  
     * @return ProcedureTaskId 
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set 
     * @param ProcedureTaskId 
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get  
     * @return ReviewAudioVideoTaskId 
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set 
     * @param ReviewAudioVideoTaskId 
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
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

    public EditMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaTask(EditMediaTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new EditMediaTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new EditMediaTaskOutput(source.Output);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

