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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailRequest extends AbstractModel {

    /**
    * This field indicates the task ID (in the `Results` parameter) returned after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
<br>Note: the query API can query up to **20 tasks at a time**.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * This boolean field indicates whether to display all audio segments. Valid values: True (yes), False (display only audio segments that hit the moderation rule). Default value: False.
    */
    @SerializedName("ShowAllSegments")
    @Expose
    private Boolean ShowAllSegments;

    /**
     * Get This field indicates the task ID (in the `Results` parameter) returned after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
<br>Note: the query API can query up to **20 tasks at a time**. 
     * @return TaskId This field indicates the task ID (in the `Results` parameter) returned after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
<br>Note: the query API can query up to **20 tasks at a time**.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set This field indicates the task ID (in the `Results` parameter) returned after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
<br>Note: the query API can query up to **20 tasks at a time**.
     * @param TaskId This field indicates the task ID (in the `Results` parameter) returned after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
<br>Note: the query API can query up to **20 tasks at a time**.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get This boolean field indicates whether to display all audio segments. Valid values: True (yes), False (display only audio segments that hit the moderation rule). Default value: False. 
     * @return ShowAllSegments This boolean field indicates whether to display all audio segments. Valid values: True (yes), False (display only audio segments that hit the moderation rule). Default value: False.
     */
    public Boolean getShowAllSegments() {
        return this.ShowAllSegments;
    }

    /**
     * Set This boolean field indicates whether to display all audio segments. Valid values: True (yes), False (display only audio segments that hit the moderation rule). Default value: False.
     * @param ShowAllSegments This boolean field indicates whether to display all audio segments. Valid values: True (yes), False (display only audio segments that hit the moderation rule). Default value: False.
     */
    public void setShowAllSegments(Boolean ShowAllSegments) {
        this.ShowAllSegments = ShowAllSegments;
    }

    public DescribeTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailRequest(DescribeTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShowAllSegments != null) {
            this.ShowAllSegments = new Boolean(source.ShowAllSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShowAllSegments", this.ShowAllSegments);

    }
}

