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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DoHealthCheckOnMigratingTopicRequest extends AbstractModel {

    /**
    * Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Topic name. It can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.

    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Whether to ignore the current check.
    */
    @SerializedName("IgnoreCheck")
    @Expose
    private Boolean IgnoreCheck;

    /**
    * Namespace. This parameter is valid only for migration to a 4.x cluster. The namespace can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.
 
     * @return TaskId Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.

     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.

     * @param TaskId Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.

     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Topic name. It can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
 
     * @return TopicName Topic name. It can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.

     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. It can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.

     * @param TopicName Topic name. It can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.

     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Whether to ignore the current check. 
     * @return IgnoreCheck Whether to ignore the current check.
     */
    public Boolean getIgnoreCheck() {
        return this.IgnoreCheck;
    }

    /**
     * Set Whether to ignore the current check.
     * @param IgnoreCheck Whether to ignore the current check.
     */
    public void setIgnoreCheck(Boolean IgnoreCheck) {
        this.IgnoreCheck = IgnoreCheck;
    }

    /**
     * Get Namespace. This parameter is valid only for migration to a 4.x cluster. The namespace can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type. 
     * @return Namespace Namespace. This parameter is valid only for migration to a 4.x cluster. The namespace can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. This parameter is valid only for migration to a 4.x cluster. The namespace can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     * @param Namespace Namespace. This parameter is valid only for migration to a 4.x cluster. The namespace can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DoHealthCheckOnMigratingTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoHealthCheckOnMigratingTopicRequest(DoHealthCheckOnMigratingTopicRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.IgnoreCheck != null) {
            this.IgnoreCheck = new Boolean(source.IgnoreCheck);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "IgnoreCheck", this.IgnoreCheck);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

