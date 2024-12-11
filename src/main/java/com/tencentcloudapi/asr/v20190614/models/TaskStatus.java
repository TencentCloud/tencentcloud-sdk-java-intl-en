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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel {

    /**
    * Task ID. Note: The data type of TaskId is uint64.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task status code. 0: waiting; 1: in process; 2: success; 3: failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task status. Valid values: waiting, in process, success, and failed.
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * Recognition result.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Failure cause.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Recognition result details, including word time offsets for each sentence, which is generally used in subtitle generation scenarios. (This field is not left blank when ResTextFormat in the recording recognition request is set to 1.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResultDetail")
    @Expose
    private SentenceDetail [] ResultDetail;

    /**
    * Audio duration (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
     * Get Task ID. Note: The data type of TaskId is uint64. 
     * @return TaskId Task ID. Note: The data type of TaskId is uint64.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID. Note: The data type of TaskId is uint64.
     * @param TaskId Task ID. Note: The data type of TaskId is uint64.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status code. 0: waiting; 1: in process; 2: success; 3: failed. 
     * @return Status Task status code. 0: waiting; 1: in process; 2: success; 3: failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status code. 0: waiting; 1: in process; 2: success; 3: failed.
     * @param Status Task status code. 0: waiting; 1: in process; 2: success; 3: failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task status. Valid values: waiting, in process, success, and failed. 
     * @return StatusStr Task status. Valid values: waiting, in process, success, and failed.
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set Task status. Valid values: waiting, in process, success, and failed.
     * @param StatusStr Task status. Valid values: waiting, in process, success, and failed.
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
    }

    /**
     * Get Recognition result. 
     * @return Result Recognition result.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Recognition result.
     * @param Result Recognition result.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Failure cause. 
     * @return ErrorMsg Failure cause.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Failure cause.
     * @param ErrorMsg Failure cause.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Recognition result details, including word time offsets for each sentence, which is generally used in subtitle generation scenarios. (This field is not left blank when ResTextFormat in the recording recognition request is set to 1.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResultDetail Recognition result details, including word time offsets for each sentence, which is generally used in subtitle generation scenarios. (This field is not left blank when ResTextFormat in the recording recognition request is set to 1.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SentenceDetail [] getResultDetail() {
        return this.ResultDetail;
    }

    /**
     * Set Recognition result details, including word time offsets for each sentence, which is generally used in subtitle generation scenarios. (This field is not left blank when ResTextFormat in the recording recognition request is set to 1.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResultDetail Recognition result details, including word time offsets for each sentence, which is generally used in subtitle generation scenarios. (This field is not left blank when ResTextFormat in the recording recognition request is set to 1.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResultDetail(SentenceDetail [] ResultDetail) {
        this.ResultDetail = ResultDetail;
    }

    /**
     * Get Audio duration (seconds).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioDuration Audio duration (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set Audio duration (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioDuration Audio duration (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ResultDetail != null) {
            this.ResultDetail = new SentenceDetail[source.ResultDetail.length];
            for (int i = 0; i < source.ResultDetail.length; i++) {
                this.ResultDetail[i] = new SentenceDetail(source.ResultDetail[i]);
            }
        }
        if (source.AudioDuration != null) {
            this.AudioDuration = new Float(source.AudioDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamArrayObj(map, prefix + "ResultDetail.", this.ResultDetail);
        this.setParamSimple(map, prefix + "AudioDuration", this.AudioDuration);

    }
}

