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

public class DeleteScheduledSqlRequest extends AbstractModel {

    /**
    * Task ID, which can be obtained through [Scheduled SQL Analysis Task List](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Source log topic ID. Search the scheduled SQL analysis task list (https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1) to obtain it.
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
     * Get Task ID, which can be obtained through [Scheduled SQL Analysis Task List](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1). 
     * @return TaskId Task ID, which can be obtained through [Scheduled SQL Analysis Task List](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, which can be obtained through [Scheduled SQL Analysis Task List](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     * @param TaskId Task ID, which can be obtained through [Scheduled SQL Analysis Task List](https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1).
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Source log topic ID. Search the scheduled SQL analysis task list (https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1) to obtain it. 
     * @return SrcTopicId Source log topic ID. Search the scheduled SQL analysis task list (https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1) to obtain it.
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source log topic ID. Search the scheduled SQL analysis task list (https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1) to obtain it.
     * @param SrcTopicId Source log topic ID. Search the scheduled SQL analysis task list (https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1) to obtain it.
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    public DeleteScheduledSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScheduledSqlRequest(DeleteScheduledSqlRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);

    }
}

