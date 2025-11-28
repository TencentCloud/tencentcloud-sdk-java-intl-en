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

public class DescribeMigratingGroupStatsRequest extends AbstractModel {

    /**
    * Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.comom/document/api/1493/119997?from_cn_redirect=1) or from the console.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the consumer group name. it can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or in the console.

    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Namespace. it is valid only when migrated to 4.x clusters. the namespace can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or from the console.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.comom/document/api/1493/119997?from_cn_redirect=1) or from the console. 
     * @return TaskId Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.comom/document/api/1493/119997?from_cn_redirect=1) or from the console.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.comom/document/api/1493/119997?from_cn_redirect=1) or from the console.
     * @param TaskId Task ID. It can be obtained from [SmoothMigrationTaskItem](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SmoothMigrationTaskItem) returned by the API [DescribeSmoothMigrationTaskList](https://www.tencentcloud.comom/document/api/1493/119997?from_cn_redirect=1) or from the console.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies the consumer group name. it can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or in the console.
 
     * @return GroupName Specifies the consumer group name. it can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or in the console.

     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Specifies the consumer group name. it can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or in the console.

     * @param GroupName Specifies the consumer group name. it can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or in the console.

     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Namespace. it is valid only when migrated to 4.x clusters. the namespace can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or from the console. 
     * @return Namespace Namespace. it is valid only when migrated to 4.x clusters. the namespace can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or from the console.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. it is valid only when migrated to 4.x clusters. the namespace can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or from the console.
     * @param Namespace Namespace. it is valid only when migrated to 4.x clusters. the namespace can be obtained from [SourceClusterGroupConfig](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#SourceClusterGroupConfig) returned by the api [DescribeSourceClusterGroupList](https://www.tencentcloud.comom/document/api/1493/118006?from_cn_redirect=1) or from the console.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DescribeMigratingGroupStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigratingGroupStatsRequest(DescribeMigratingGroupStatsRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
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
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

