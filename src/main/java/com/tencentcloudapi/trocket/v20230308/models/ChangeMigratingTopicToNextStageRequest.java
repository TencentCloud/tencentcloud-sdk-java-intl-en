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

public class ChangeMigratingTopicToNextStageRequest extends AbstractModel {

    /**
    * Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.com/document/api/1493/119997?from_cn_redirect=1) or from the console.

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * List of topic names. topic name can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the api [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in data type.

    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
    * Namespace list. It is valid only for 4.x clusters and has a one-to-one relationship with TopicNameList. The list can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
    */
    @SerializedName("NamespaceList")
    @Expose
    private String [] NamespaceList;

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
     * Get List of topic names. topic name can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the api [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in data type.
 
     * @return TopicNameList List of topic names. topic name can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the api [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in data type.

     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set List of topic names. topic name can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the api [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in data type.

     * @param TopicNameList List of topic names. topic name can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the api [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in data type.

     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    /**
     * Get Namespace list. It is valid only for 4.x clusters and has a one-to-one relationship with TopicNameList. The list can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type. 
     * @return NamespaceList Namespace list. It is valid only for 4.x clusters and has a one-to-one relationship with TopicNameList. The list can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     */
    public String [] getNamespaceList() {
        return this.NamespaceList;
    }

    /**
     * Set Namespace list. It is valid only for 4.x clusters and has a one-to-one relationship with TopicNameList. The list can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     * @param NamespaceList Namespace list. It is valid only for 4.x clusters and has a one-to-one relationship with TopicNameList. The list can be obtained from [MigratingTopic](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#MigratingTopic) returned by the API [DescribeMigratingTopicList](https://www.tencentcloud.com/document/api/1493/118007?from_cn_redirect=1) in Data Type.
     */
    public void setNamespaceList(String [] NamespaceList) {
        this.NamespaceList = NamespaceList;
    }

    public ChangeMigratingTopicToNextStageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeMigratingTopicToNextStageRequest(ChangeMigratingTopicToNextStageRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
        if (source.NamespaceList != null) {
            this.NamespaceList = new String[source.NamespaceList.length];
            for (int i = 0; i < source.NamespaceList.length; i++) {
                this.NamespaceList[i] = new String(source.NamespaceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);
        this.setParamArraySimple(map, prefix + "NamespaceList.", this.NamespaceList);

    }
}

