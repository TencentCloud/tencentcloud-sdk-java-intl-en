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

public class WechatMiniProgramPublishTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code
<li>0: success;</li>
<li>Other values: failure.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * ID of published video file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * ID of the transcoding template corresponding to the published video. 0 represents the source video.
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * Status of video release on WeChat Mini Program. Valid values:
<li>Pass: successfully published;</li>
<li>Failed: failed to publish;</li>
<li>Rejected: rejected.</li>
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed. 
     * @return Status Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     * @param Status Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code
<li>0: success;</li>
<li>Other values: failure.</li> 
     * @return ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
<li>0: success;</li>
<li>Other values: failure.</li>
     * @param ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get ID of published video file. 
     * @return FileId ID of published video file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set ID of published video file.
     * @param FileId ID of published video file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get ID of the transcoding template corresponding to the published video. 0 represents the source video. 
     * @return SourceDefinition ID of the transcoding template corresponding to the published video. 0 represents the source video.
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * Set ID of the transcoding template corresponding to the published video. 0 represents the source video.
     * @param SourceDefinition ID of the transcoding template corresponding to the published video. 0 represents the source video.
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * Get Status of video release on WeChat Mini Program. Valid values:
<li>Pass: successfully published;</li>
<li>Failed: failed to publish;</li>
<li>Rejected: rejected.</li> 
     * @return PublishResult Status of video release on WeChat Mini Program. Valid values:
<li>Pass: successfully published;</li>
<li>Failed: failed to publish;</li>
<li>Rejected: rejected.</li>
     */
    public String getPublishResult() {
        return this.PublishResult;
    }

    /**
     * Set Status of video release on WeChat Mini Program. Valid values:
<li>Pass: successfully published;</li>
<li>Failed: failed to publish;</li>
<li>Rejected: rejected.</li>
     * @param PublishResult Status of video release on WeChat Mini Program. Valid values:
<li>Pass: successfully published;</li>
<li>Failed: failed to publish;</li>
<li>Rejected: rejected.</li>
     */
    public void setPublishResult(String PublishResult) {
        this.PublishResult = PublishResult;
    }

    public WechatMiniProgramPublishTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatMiniProgramPublishTask(WechatMiniProgramPublishTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SourceDefinition != null) {
            this.SourceDefinition = new Long(source.SourceDefinition);
        }
        if (source.PublishResult != null) {
            this.PublishResult = new String(source.PublishResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SourceDefinition", this.SourceDefinition);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);

    }
}

