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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentThought extends AbstractModel {

    /**
    * Session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Request ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * It corresponds to a session, session ID, used for message storage in answering. It can be generated in advance and used when saving messages.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Current request execution time, in milliseconds.
    */
    @SerializedName("Elapsed")
    @Expose
    private Long Elapsed;

    /**
    * Whether it is a workflow currently.
    */
    @SerializedName("IsWorkflow")
    @Expose
    private Boolean IsWorkflow;

    /**
    * If it is a workflow, workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Detailed thinking process.
    */
    @SerializedName("Procedures")
    @Expose
    private AgentProcedure [] Procedures;

    /**
    * TraceId.
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * File information
    */
    @SerializedName("Files")
    @Expose
    private FileInfo [] Files;

    /**
     * Get Session ID. 
     * @return SessionId Session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
     * @param SessionId Session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Request ID 
     * @return RequestId Request ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID
     * @param RequestId Request ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get It corresponds to a session, session ID, used for message storage in answering. It can be generated in advance and used when saving messages. 
     * @return RecordId It corresponds to a session, session ID, used for message storage in answering. It can be generated in advance and used when saving messages.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set It corresponds to a session, session ID, used for message storage in answering. It can be generated in advance and used when saving messages.
     * @param RecordId It corresponds to a session, session ID, used for message storage in answering. It can be generated in advance and used when saving messages.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Current request execution time, in milliseconds. 
     * @return Elapsed Current request execution time, in milliseconds.
     */
    public Long getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set Current request execution time, in milliseconds.
     * @param Elapsed Current request execution time, in milliseconds.
     */
    public void setElapsed(Long Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get Whether it is a workflow currently. 
     * @return IsWorkflow Whether it is a workflow currently.
     */
    public Boolean getIsWorkflow() {
        return this.IsWorkflow;
    }

    /**
     * Set Whether it is a workflow currently.
     * @param IsWorkflow Whether it is a workflow currently.
     */
    public void setIsWorkflow(Boolean IsWorkflow) {
        this.IsWorkflow = IsWorkflow;
    }

    /**
     * Get If it is a workflow, workflow name. 
     * @return WorkflowName If it is a workflow, workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set If it is a workflow, workflow name.
     * @param WorkflowName If it is a workflow, workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Detailed thinking process. 
     * @return Procedures Detailed thinking process.
     */
    public AgentProcedure [] getProcedures() {
        return this.Procedures;
    }

    /**
     * Set Detailed thinking process.
     * @param Procedures Detailed thinking process.
     */
    public void setProcedures(AgentProcedure [] Procedures) {
        this.Procedures = Procedures;
    }

    /**
     * Get TraceId. 
     * @return TraceId TraceId.
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set TraceId.
     * @param TraceId TraceId.
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get File information 
     * @return Files File information
     */
    public FileInfo [] getFiles() {
        return this.Files;
    }

    /**
     * Set File information
     * @param Files File information
     */
    public void setFiles(FileInfo [] Files) {
        this.Files = Files;
    }

    public AgentThought() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentThought(AgentThought source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new Long(source.Elapsed);
        }
        if (source.IsWorkflow != null) {
            this.IsWorkflow = new Boolean(source.IsWorkflow);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Procedures != null) {
            this.Procedures = new AgentProcedure[source.Procedures.length];
            for (int i = 0; i < source.Procedures.length; i++) {
                this.Procedures[i] = new AgentProcedure(source.Procedures[i]);
            }
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.Files != null) {
            this.Files = new FileInfo[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new FileInfo(source.Files[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "IsWorkflow", this.IsWorkflow);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamArrayObj(map, prefix + "Procedures.", this.Procedures);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);

    }
}

