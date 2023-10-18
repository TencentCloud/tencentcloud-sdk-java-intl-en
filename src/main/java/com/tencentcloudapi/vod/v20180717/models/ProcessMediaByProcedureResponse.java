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

public class ProcessMediaByProcedureResponse extends AbstractModel {

    /**
    * The task ID for the task type `Procedure`, if the task flow specified by `ProcedureName` includes one or more of `MediaProcessTask`, `AiAnalysisTask`, `AiRecognitionTask`, the task specified by this parameter will be executed.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The task ID for the task type `ReviewAudioVideo`, if the task flow specified by `ProcedureName` includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The task ID for the task type `Procedure`, if the task flow specified by `ProcedureName` includes one or more of `MediaProcessTask`, `AiAnalysisTask`, `AiRecognitionTask`, the task specified by this parameter will be executed. 
     * @return TaskId The task ID for the task type `Procedure`, if the task flow specified by `ProcedureName` includes one or more of `MediaProcessTask`, `AiAnalysisTask`, `AiRecognitionTask`, the task specified by this parameter will be executed.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID for the task type `Procedure`, if the task flow specified by `ProcedureName` includes one or more of `MediaProcessTask`, `AiAnalysisTask`, `AiRecognitionTask`, the task specified by this parameter will be executed.
     * @param TaskId The task ID for the task type `Procedure`, if the task flow specified by `ProcedureName` includes one or more of `MediaProcessTask`, `AiAnalysisTask`, `AiRecognitionTask`, the task specified by this parameter will be executed.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The task ID for the task type `ReviewAudioVideo`, if the task flow specified by `ProcedureName` includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed. 
     * @return ReviewAudioVideoTaskId The task ID for the task type `ReviewAudioVideo`, if the task flow specified by `ProcedureName` includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set The task ID for the task type `ReviewAudioVideo`, if the task flow specified by `ProcedureName` includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     * @param ReviewAudioVideoTaskId The task ID for the task type `ReviewAudioVideo`, if the task flow specified by `ProcedureName` includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ProcessMediaByProcedureResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByProcedureResponse(ProcessMediaByProcedureResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

