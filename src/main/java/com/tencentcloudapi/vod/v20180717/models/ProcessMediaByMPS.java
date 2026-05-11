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
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error information. Return the corresponding exception Message in case of source error, otherwise please use each specific task Message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * MPS video processing task.
    */
    @SerializedName("SubTaskSet")
    @Expose
    private MPSSubTaskResult [] SubTaskSet;

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
     * Get Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li> 
     * @return Status Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     * @param Status Task status. Value: <li>PROCESSING: Processing;</li><li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task. 
     * @return ErrCode Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     * @param ErrCode Error code. Returns a non-zero error code for source error. For 0, please use the ErrCode of each specific task.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error information. Return the corresponding exception Message in case of source error, otherwise please use each specific task Message. 
     * @return Message Error information. Return the corresponding exception Message in case of source error, otherwise please use each specific task Message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error information. Return the corresponding exception Message in case of source error, otherwise please use each specific task Message.
     * @param Message Error information. Return the corresponding exception Message in case of source error, otherwise please use each specific task Message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get MPS video processing task. 
     * @return SubTaskSet MPS video processing task.
     */
    public MPSSubTaskResult [] getSubTaskSet() {
        return this.SubTaskSet;
    }

    /**
     * Set MPS video processing task.
     * @param SubTaskSet MPS video processing task.
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

