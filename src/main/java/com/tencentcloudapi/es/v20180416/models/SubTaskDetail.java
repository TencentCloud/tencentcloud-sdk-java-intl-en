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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskDetail extends AbstractModel{

    /**
    * Subtask name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subtask result
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Subtask error message
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Subtask type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Subtask status. 0: processing, 1: succeeded, -1: failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Name of the index for which the check for upgrade failed
    */
    @SerializedName("FailedIndices")
    @Expose
    private String [] FailedIndices;

    /**
    * Subtask end time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Subtask level. 1: warning, 2: failed
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get Subtask name 
     * @return Name Subtask name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subtask name
     * @param Name Subtask name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subtask result 
     * @return Result Subtask result
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Subtask result
     * @param Result Subtask result
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Subtask error message 
     * @return ErrMsg Subtask error message
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Subtask error message
     * @param ErrMsg Subtask error message
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Subtask type 
     * @return Type Subtask type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Subtask type
     * @param Type Subtask type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Subtask status. 0: processing, 1: succeeded, -1: failed 
     * @return Status Subtask status. 0: processing, 1: succeeded, -1: failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Subtask status. 0: processing, 1: succeeded, -1: failed
     * @param Status Subtask status. 0: processing, 1: succeeded, -1: failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Name of the index for which the check for upgrade failed 
     * @return FailedIndices Name of the index for which the check for upgrade failed
     */
    public String [] getFailedIndices() {
        return this.FailedIndices;
    }

    /**
     * Set Name of the index for which the check for upgrade failed
     * @param FailedIndices Name of the index for which the check for upgrade failed
     */
    public void setFailedIndices(String [] FailedIndices) {
        this.FailedIndices = FailedIndices;
    }

    /**
     * Get Subtask end time 
     * @return FinishTime Subtask end time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Subtask end time
     * @param FinishTime Subtask end time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Subtask level. 1: warning, 2: failed 
     * @return Level Subtask level. 1: warning, 2: failed
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Subtask level. 1: warning, 2: failed
     * @param Level Subtask level. 1: warning, 2: failed
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "FailedIndices.", this.FailedIndices);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

