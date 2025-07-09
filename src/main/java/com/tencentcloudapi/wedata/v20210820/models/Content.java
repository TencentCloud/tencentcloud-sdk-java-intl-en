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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Content extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Diagnosis
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Diagnose")
    @Expose
    private String Diagnose;

    /**
    * Reason
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * OperationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Link
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Diagnosis
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Diagnose Diagnosis
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDiagnose() {
        return this.Diagnose;
    }

    /**
     * Set Diagnosis
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Diagnose Diagnosis
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDiagnose(String Diagnose) {
        this.Diagnose = Diagnose;
    }

    /**
     * Get Reason
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Reason Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Reason Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get OperationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Operation OperationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set OperationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Operation OperationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Link
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Url Link
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Link
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Url Link
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Content() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Content(Content source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Diagnose != null) {
            this.Diagnose = new String(source.Diagnose);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Diagnose", this.Diagnose);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

