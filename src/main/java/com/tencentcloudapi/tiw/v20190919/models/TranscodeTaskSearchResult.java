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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskSearchResult extends AbstractModel{

    /**
    * Creation time of the task.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Unique task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Current task status.
- QUEUED: Queuing for transcoding.
- PROCESSING: Transcoding in progress.
- FINISHED: Transcoding finished.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Original name of the transcoded document.
    */
    @SerializedName("OriginalFilename")
    @Expose
    private String OriginalFilename;

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Transcoding task result.
    */
    @SerializedName("Result")
    @Expose
    private TranscodeTaskResult Result;

    /**
    * Specifies whether the transcoding is static.
    */
    @SerializedName("IsStatic")
    @Expose
    private Boolean IsStatic;

    /**
     * Get Creation time of the task. 
     * @return CreateTime Creation time of the task.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the task.
     * @param CreateTime Creation time of the task.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Unique task ID. 
     * @return TaskId Unique task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique task ID.
     * @param TaskId Unique task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Current task status.
- QUEUED: Queuing for transcoding.
- PROCESSING: Transcoding in progress.
- FINISHED: Transcoding finished. 
     * @return Status Current task status.
- QUEUED: Queuing for transcoding.
- PROCESSING: Transcoding in progress.
- FINISHED: Transcoding finished.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current task status.
- QUEUED: Queuing for transcoding.
- PROCESSING: Transcoding in progress.
- FINISHED: Transcoding finished.
     * @param Status Current task status.
- QUEUED: Queuing for transcoding.
- PROCESSING: Transcoding in progress.
- FINISHED: Transcoding finished.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Original name of the transcoded document. 
     * @return OriginalFilename Original name of the transcoded document.
     */
    public String getOriginalFilename() {
        return this.OriginalFilename;
    }

    /**
     * Set Original name of the transcoded document.
     * @param OriginalFilename Original name of the transcoded document.
     */
    public void setOriginalFilename(String OriginalFilename) {
        this.OriginalFilename = OriginalFilename;
    }

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Transcoding task result. 
     * @return Result Transcoding task result.
     */
    public TranscodeTaskResult getResult() {
        return this.Result;
    }

    /**
     * Set Transcoding task result.
     * @param Result Transcoding task result.
     */
    public void setResult(TranscodeTaskResult Result) {
        this.Result = Result;
    }

    /**
     * Get Specifies whether the transcoding is static. 
     * @return IsStatic Specifies whether the transcoding is static.
     */
    public Boolean getIsStatic() {
        return this.IsStatic;
    }

    /**
     * Set Specifies whether the transcoding is static.
     * @param IsStatic Specifies whether the transcoding is static.
     */
    public void setIsStatic(Boolean IsStatic) {
        this.IsStatic = IsStatic;
    }

    public TranscodeTaskSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskSearchResult(TranscodeTaskSearchResult source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OriginalFilename != null) {
            this.OriginalFilename = new String(source.OriginalFilename);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Result != null) {
            this.Result = new TranscodeTaskResult(source.Result);
        }
        if (source.IsStatic != null) {
            this.IsStatic = new Boolean(source.IsStatic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginalFilename", this.OriginalFilename);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "IsStatic", this.IsStatic);

    }
}

