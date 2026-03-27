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

public class ImportMediaKnowledgeTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Status. Valid values: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code; 0 indicates success, other values indicate failure
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
     * Get Task Status. Valid values: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li> 
     * @return Status Task Status. Valid values: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status. Valid values: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     * @param Status Task Status. Valid values: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code; 0 indicates success, other values indicate failure 
     * @return ErrCode Error code; 0 indicates success, other values indicate failure
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code; 0 indicates success, other values indicate failure
     * @param ErrCode Error code; 0 indicates success, other values indicate failure
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

    public ImportMediaKnowledgeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportMediaKnowledgeTask(ImportMediaKnowledgeTask source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

