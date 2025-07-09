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

public class AdhocDetail extends AbstractModel {

    /**
    * Subtask record Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Script Content
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Task start time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task termination time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Current Task Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Submit Task ID
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
     * Get Subtask record Id 
     * @return Id Subtask record Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Subtask record Id
     * @param Id Subtask record Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Script Content 
     * @return ScriptContent Script Content
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script Content
     * @param ScriptContent Script Content
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Task start time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Task start time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task termination time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Task termination time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task termination time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Task termination time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Current Task Status 
     * @return Status Current Task Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Current Task Status
     * @param Status Current Task Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Submit Task ID 
     * @return RecordId Submit Task ID
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Submit Task ID
     * @param RecordId Submit Task ID
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    public AdhocDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdhocDetail(AdhocDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

