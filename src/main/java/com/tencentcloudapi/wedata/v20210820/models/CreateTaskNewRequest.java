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

public class CreateTaskNewRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 26 offline synchronization,30 Python,31 PySpark,32 DLC,33 Impala,34 Hive SQL,35 Shell,36 Spark SQL,39 Spark,40 CDW PG,92 MapReduce.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Extended Attribute
    */
    @SerializedName("TaskExt")
    @Expose
    private TaskExtInfo [] TaskExt;

    /**
    * Product Name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Specifies the task instance initialization strategy
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * The horizontal axis of the canvas coordinate
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * The vertical axis of the canvas coordinate
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * Workflow Directory ID
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * Specifies the script content, base64 encoded
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Code Template ID
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Task Name 
     * @return TaskName Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name
     * @param TaskName Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 26 offline synchronization,30 Python,31 PySpark,32 DLC,33 Impala,34 Hive SQL,35 Shell,36 Spark SQL,39 Spark,40 CDW PG,92 MapReduce. 
     * @return TaskType 26 offline synchronization,30 Python,31 PySpark,32 DLC,33 Impala,34 Hive SQL,35 Shell,36 Spark SQL,39 Spark,40 CDW PG,92 MapReduce.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 26 offline synchronization,30 Python,31 PySpark,32 DLC,33 Impala,34 Hive SQL,35 Shell,36 Spark SQL,39 Spark,40 CDW PG,92 MapReduce.
     * @param TaskType 26 offline synchronization,30 Python,31 PySpark,32 DLC,33 Impala,34 Hive SQL,35 Shell,36 Spark SQL,39 Spark,40 CDW PG,92 MapReduce.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Extended Attribute 
     * @return TaskExt Extended Attribute
     */
    public TaskExtInfo [] getTaskExt() {
        return this.TaskExt;
    }

    /**
     * Set Extended Attribute
     * @param TaskExt Extended Attribute
     */
    public void setTaskExt(TaskExtInfo [] TaskExt) {
        this.TaskExt = TaskExt;
    }

    /**
     * Get Product Name 
     * @return ProductName Product Name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product Name
     * @param ProductName Product Name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Specifies the task instance initialization strategy 
     * @return InstanceInitStrategy Specifies the task instance initialization strategy
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Specifies the task instance initialization strategy
     * @param InstanceInitStrategy Specifies the task instance initialization strategy
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get The horizontal axis of the canvas coordinate 
     * @return LeftCoordinate The horizontal axis of the canvas coordinate
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set The horizontal axis of the canvas coordinate
     * @param LeftCoordinate The horizontal axis of the canvas coordinate
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get The vertical axis of the canvas coordinate 
     * @return TopCoordinate The vertical axis of the canvas coordinate
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set The vertical axis of the canvas coordinate
     * @param TopCoordinate The vertical axis of the canvas coordinate
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get Workflow Directory ID 
     * @return TaskFolderId Workflow Directory ID
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set Workflow Directory ID
     * @param TaskFolderId Workflow Directory ID
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get Specifies the script content, base64 encoded 
     * @return Content Specifies the script content, base64 encoded
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Specifies the script content, base64 encoded
     * @param Content Specifies the script content, base64 encoded
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Code Template ID 
     * @return CodeTemplateId Code Template ID
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set Code Template ID
     * @param CodeTemplateId Code Template ID
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    public CreateTaskNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskNewRequest(CreateTaskNewRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TaskExt != null) {
            this.TaskExt = new TaskExtInfo[source.TaskExt.length];
            for (int i = 0; i < source.TaskExt.length; i++) {
                this.TaskExt[i] = new TaskExtInfo(source.TaskExt[i]);
            }
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "TaskExt.", this.TaskExt);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);

    }
}

