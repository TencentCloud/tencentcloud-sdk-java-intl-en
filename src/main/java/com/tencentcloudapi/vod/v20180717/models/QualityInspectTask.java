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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectTask extends AbstractModel {

    /**
    * Media quality inspection task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status, value: <li>PROCESSING: processing;</li> <li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code, an empty string indicates success, other values indicate failure. Please refer to the [Video Processing Error Code](https://intl.cloud.tencent.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) list for values.
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error information.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Media quality inpection input metadata of audio and video.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Media quality inspection task input.
    */
    @SerializedName("Input")
    @Expose
    private QualityInspectTaskInput Input;

    /**
    * Media quality inspection task generates.
    */
    @SerializedName("Output")
    @Expose
    private QualityInspectTaskOutput Output;

    /**
    * Used for deduplication, if there has been a request with the same recognition code within seven days, this request will return an error. Maximum length of 50 characters, without or with an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used for transparent transmission of user request information. Upon completion of media quality inpection, the callback will return the value of this field, with a maximum length of 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Media quality inspection task ID. 
     * @return TaskId Media quality inspection task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Media quality inspection task ID.
     * @param TaskId Media quality inspection task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status, value: <li>PROCESSING: processing;</li> <li>FINISH: Completed.</li> 
     * @return Status Task status, value: <li>PROCESSING: processing;</li> <li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, value: <li>PROCESSING: processing;</li> <li>FINISH: Completed.</li>
     * @param Status Task status, value: <li>PROCESSING: processing;</li> <li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code, an empty string indicates success, other values indicate failure. Please refer to the [Video Processing Error Code](https://intl.cloud.tencent.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) list for values. 
     * @return ErrCodeExt Error code, an empty string indicates success, other values indicate failure. Please refer to the [Video Processing Error Code](https://intl.cloud.tencent.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) list for values.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code, an empty string indicates success, other values indicate failure. Please refer to the [Video Processing Error Code](https://intl.cloud.tencent.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) list for values.
     * @param ErrCodeExt Error code, an empty string indicates success, other values indicate failure. Please refer to the [Video Processing Error Code](https://intl.cloud.tencent.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) list for values.
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error information. 
     * @return Message Error information.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error information.
     * @param Message Error information.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Media quality inpection input metadata of audio and video. 
     * @return MetaData Media quality inpection input metadata of audio and video.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Media quality inpection input metadata of audio and video.
     * @param MetaData Media quality inpection input metadata of audio and video.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Media quality inspection task input. 
     * @return Input Media quality inspection task input.
     */
    public QualityInspectTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Media quality inspection task input.
     * @param Input Media quality inspection task input.
     */
    public void setInput(QualityInspectTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Media quality inspection task generates. 
     * @return Output Media quality inspection task generates.
     */
    public QualityInspectTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Media quality inspection task generates.
     * @param Output Media quality inspection task generates.
     */
    public void setOutput(QualityInspectTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Used for deduplication, if there has been a request with the same recognition code within seven days, this request will return an error. Maximum length of 50 characters, without or with an empty string indicates no deduplication. 
     * @return SessionId Used for deduplication, if there has been a request with the same recognition code within seven days, this request will return an error. Maximum length of 50 characters, without or with an empty string indicates no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Used for deduplication, if there has been a request with the same recognition code within seven days, this request will return an error. Maximum length of 50 characters, without or with an empty string indicates no deduplication.
     * @param SessionId Used for deduplication, if there has been a request with the same recognition code within seven days, this request will return an error. Maximum length of 50 characters, without or with an empty string indicates no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used for transparent transmission of user request information. Upon completion of media quality inpection, the callback will return the value of this field, with a maximum length of 1000 characters. 
     * @return SessionContext Source context, used for transparent transmission of user request information. Upon completion of media quality inpection, the callback will return the value of this field, with a maximum length of 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used for transparent transmission of user request information. Upon completion of media quality inpection, the callback will return the value of this field, with a maximum length of 1000 characters.
     * @param SessionContext Source context, used for transparent transmission of user request information. Upon completion of media quality inpection, the callback will return the value of this field, with a maximum length of 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public QualityInspectTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTask(QualityInspectTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.Input != null) {
            this.Input = new QualityInspectTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new QualityInspectTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

