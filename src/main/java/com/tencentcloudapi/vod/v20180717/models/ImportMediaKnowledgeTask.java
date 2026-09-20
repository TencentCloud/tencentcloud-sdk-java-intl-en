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
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Media file ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Input of the import knowledge base task.</p>
    */
    @SerializedName("Input")
    @Expose
    private ImportMediaKnowledgeTaskInput Input;

    /**
    * <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. 0 indicates success, and other values indicate failure.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Media file ID</p> 
     * @return FileId <p>Media file ID</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID</p>
     * @param FileId <p>Media file ID</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Input of the import knowledge base task.</p> 
     * @return Input <p>Input of the import knowledge base task.</p>
     */
    public ImportMediaKnowledgeTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Input of the import knowledge base task.</p>
     * @param Input <p>Input of the import knowledge base task.</p>
     */
    public void setInput(ImportMediaKnowledgeTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p> 
     * @return Status <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     * @param Status <p>Task status. Valid values: <li>PROCESSING: Processing; </li><li>FINISH: Completed.</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. 0 indicates success, and other values indicate failure.</p> 
     * @return ErrCode <p>Error code. 0 indicates success, and other values indicate failure.</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. 0 indicates success, and other values indicate failure.</p>
     * @param ErrCode <p>Error code. 0 indicates success, and other values indicate failure.</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message.</p> 
     * @return Message <p>Error message.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Error message.</p>
     * @param Message <p>Error message.</p>
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
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Input != null) {
            this.Input = new ImportMediaKnowledgeTaskInput(source.Input);
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
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

