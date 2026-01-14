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

public class ProcessMediaByMPS extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * MPS media processing tasks.
    */
    @SerializedName("SubTaskSet")
    @Expose
    private MPSSubTaskResult [] SubTaskSet;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li> 
     * @return Status Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     * @param Status Task status, value: <li>PROCESSING: processing;</li><li>FINISH: completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task. 
     * @return ErrCode Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     * @param ErrCode Error code. A non-zero error code is returned when the source is abnormal. If 0 is returned, use the ErrCode of each specific task.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task. 
     * @return Message Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     * @param Message Error message. If the source is abnormal, the corresponding exception message is returned. Otherwise, use the message of each specific task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get MPS media processing tasks. 
     * @return SubTaskSet MPS media processing tasks.
     */
    public MPSSubTaskResult [] getSubTaskSet() {
        return this.SubTaskSet;
    }

    /**
     * Set MPS media processing tasks.
     * @param SubTaskSet MPS media processing tasks.
     */
    public void setSubTaskSet(MPSSubTaskResult [] SubTaskSet) {
        this.SubTaskSet = SubTaskSet;
    }

    public ProcessMediaByMPS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPS(ProcessMediaByMPS source) {
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
        if (source.SubTaskSet != null) {
            this.SubTaskSet = new MPSSubTaskResult[source.SubTaskSet.length];
            for (int i = 0; i < source.SubTaskSet.length; i++) {
                this.SubTaskSet[i] = new MPSSubTaskResult(source.SubTaskSet[i]);
            }
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
        this.setParamArrayObj(map, prefix + "SubTaskSet.", this.SubTaskSet);

    }
}

