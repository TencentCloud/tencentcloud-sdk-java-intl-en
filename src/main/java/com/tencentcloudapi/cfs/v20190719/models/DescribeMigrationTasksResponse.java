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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationTasksResponse extends AbstractModel {

    /**
    * Number of migration tasks
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Migration task details
    */
    @SerializedName("MigrationTasks")
    @Expose
    private MigrationTaskInfo [] MigrationTasks;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of migration tasks 
     * @return TotalCount Number of migration tasks
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of migration tasks
     * @param TotalCount Number of migration tasks
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Migration task details 
     * @return MigrationTasks Migration task details
     */
    public MigrationTaskInfo [] getMigrationTasks() {
        return this.MigrationTasks;
    }

    /**
     * Set Migration task details
     * @param MigrationTasks Migration task details
     */
    public void setMigrationTasks(MigrationTaskInfo [] MigrationTasks) {
        this.MigrationTasks = MigrationTasks;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigrationTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationTasksResponse(DescribeMigrationTasksResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MigrationTasks != null) {
            this.MigrationTasks = new MigrationTaskInfo[source.MigrationTasks.length];
            for (int i = 0; i < source.MigrationTasks.length; i++) {
                this.MigrationTasks[i] = new MigrationTaskInfo(source.MigrationTasks[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "MigrationTasks.", this.MigrationTasks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

