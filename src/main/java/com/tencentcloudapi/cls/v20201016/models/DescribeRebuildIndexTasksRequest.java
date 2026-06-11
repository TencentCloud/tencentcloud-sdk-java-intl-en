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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRebuildIndexTasksRequest extends AbstractModel {

    /**
    * <p>Log topic ID.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Index rebuild task ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Index rebuild task status. Leave it blank to return the task list of all statuses. Multiple statuses are separated by commas.</p><p>Enumeration value:</p><ul><li>0: Reindexing task created</li><li>1: Creating reindexing resources</li><li>2: Index rebuild resource created</li><li>3: Rebuilding</li><li>4: Suspension</li><li>5: Rebuild complete</li><li>6: Rebuild successful (retrievable)</li><li>7: Rebuilding failed</li><li>8: Task cancellation</li><li>9: Metadata and index deleted</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Pagination offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of entries per page. Default value: 10. Maximum value: 20.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Log topic ID.</p> 
     * @return TopicId <p>Log topic ID.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic ID.</p>
     * @param TopicId <p>Log topic ID.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Index rebuild task ID</p> 
     * @return TaskId <p>Index rebuild task ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Index rebuild task ID</p>
     * @param TaskId <p>Index rebuild task ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Index rebuild task status. Leave it blank to return the task list of all statuses. Multiple statuses are separated by commas.</p><p>Enumeration value:</p><ul><li>0: Reindexing task created</li><li>1: Creating reindexing resources</li><li>2: Index rebuild resource created</li><li>3: Rebuilding</li><li>4: Suspension</li><li>5: Rebuild complete</li><li>6: Rebuild successful (retrievable)</li><li>7: Rebuilding failed</li><li>8: Task cancellation</li><li>9: Metadata and index deleted</li></ul> 
     * @return Status <p>Index rebuild task status. Leave it blank to return the task list of all statuses. Multiple statuses are separated by commas.</p><p>Enumeration value:</p><ul><li>0: Reindexing task created</li><li>1: Creating reindexing resources</li><li>2: Index rebuild resource created</li><li>3: Rebuilding</li><li>4: Suspension</li><li>5: Rebuild complete</li><li>6: Rebuild successful (retrievable)</li><li>7: Rebuilding failed</li><li>8: Task cancellation</li><li>9: Metadata and index deleted</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Index rebuild task status. Leave it blank to return the task list of all statuses. Multiple statuses are separated by commas.</p><p>Enumeration value:</p><ul><li>0: Reindexing task created</li><li>1: Creating reindexing resources</li><li>2: Index rebuild resource created</li><li>3: Rebuilding</li><li>4: Suspension</li><li>5: Rebuild complete</li><li>6: Rebuild successful (retrievable)</li><li>7: Rebuilding failed</li><li>8: Task cancellation</li><li>9: Metadata and index deleted</li></ul>
     * @param Status <p>Index rebuild task status. Leave it blank to return the task list of all statuses. Multiple statuses are separated by commas.</p><p>Enumeration value:</p><ul><li>0: Reindexing task created</li><li>1: Creating reindexing resources</li><li>2: Index rebuild resource created</li><li>3: Rebuilding</li><li>4: Suspension</li><li>5: Rebuild complete</li><li>6: Rebuild successful (retrievable)</li><li>7: Rebuilding failed</li><li>8: Task cancellation</li><li>9: Metadata and index deleted</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Pagination offset. Default value: 0.</p> 
     * @return Offset <p>Pagination offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset. Default value: 0.</p>
     * @param Offset <p>Pagination offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of entries per page. Default value: 10. Maximum value: 20.</p> 
     * @return Limit <p>Number of entries per page. Default value: 10. Maximum value: 20.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of entries per page. Default value: 10. Maximum value: 20.</p>
     * @param Limit <p>Number of entries per page. Default value: 10. Maximum value: 20.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRebuildIndexTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRebuildIndexTasksRequest(DescribeRebuildIndexTasksRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

