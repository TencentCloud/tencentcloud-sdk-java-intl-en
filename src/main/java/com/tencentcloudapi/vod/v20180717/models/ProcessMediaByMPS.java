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
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("SubTaskSet")
    @Expose
    private MPSSubTaskResult [] SubTaskSet;

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
     * @return SubTaskSet 
     */
    public MPSSubTaskResult [] getSubTaskSet() {
        return this.SubTaskSet;
    }

    /**
     * Set 
     * @param SubTaskSet 
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

