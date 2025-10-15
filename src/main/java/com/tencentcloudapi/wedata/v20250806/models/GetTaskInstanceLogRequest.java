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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTaskInstanceLogRequest extends AbstractModel {

    /**
    * **Project ID**. specifies the project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **Instance unique id**.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **Instance Lifecycle Number** - Identifies a specific execution of an instance.
For example: the first run of a cyclic instance has a lifecycle number of 0. If the user reruns that instance later, the second execution will have a lifecycle number of 1;
By default, the latest execution is used.
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * **Log level** default All - Info - Debug - Warn - Error - All.
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * **Used when performing paginated log queries; has no specific business meaning.**

For the first query, the value is null.

For subsequent queries, use the value of the NextCursor field returned from the previous query.
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
     * Get **Project ID**. specifies the project ID. 
     * @return ProjectId **Project ID**. specifies the project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **Project ID**. specifies the project ID.
     * @param ProjectId **Project ID**. specifies the project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **Instance unique id**. 
     * @return InstanceKey **Instance unique id**.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set **Instance unique id**.
     * @param InstanceKey **Instance unique id**.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **Instance Lifecycle Number** - Identifies a specific execution of an instance.
For example: the first run of a cyclic instance has a lifecycle number of 0. If the user reruns that instance later, the second execution will have a lifecycle number of 1;
By default, the latest execution is used. 
     * @return LifeRoundNum **Instance Lifecycle Number** - Identifies a specific execution of an instance.
For example: the first run of a cyclic instance has a lifecycle number of 0. If the user reruns that instance later, the second execution will have a lifecycle number of 1;
By default, the latest execution is used.
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set **Instance Lifecycle Number** - Identifies a specific execution of an instance.
For example: the first run of a cyclic instance has a lifecycle number of 0. If the user reruns that instance later, the second execution will have a lifecycle number of 1;
By default, the latest execution is used.
     * @param LifeRoundNum **Instance Lifecycle Number** - Identifies a specific execution of an instance.
For example: the first run of a cyclic instance has a lifecycle number of 0. If the user reruns that instance later, the second execution will have a lifecycle number of 1;
By default, the latest execution is used.
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get **Log level** default All - Info - Debug - Warn - Error - All. 
     * @return LogLevel **Log level** default All - Info - Debug - Warn - Error - All.
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set **Log level** default All - Info - Debug - Warn - Error - All.
     * @param LogLevel **Log level** default All - Info - Debug - Warn - Error - All.
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get **Used when performing paginated log queries; has no specific business meaning.**

For the first query, the value is null.

For subsequent queries, use the value of the NextCursor field returned from the previous query. 
     * @return NextCursor **Used when performing paginated log queries; has no specific business meaning.**

For the first query, the value is null.

For subsequent queries, use the value of the NextCursor field returned from the previous query.
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set **Used when performing paginated log queries; has no specific business meaning.**

For the first query, the value is null.

For subsequent queries, use the value of the NextCursor field returned from the previous query.
     * @param NextCursor **Used when performing paginated log queries; has no specific business meaning.**

For the first query, the value is null.

For subsequent queries, use the value of the NextCursor field returned from the previous query.
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    public GetTaskInstanceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTaskInstanceLogRequest(GetTaskInstanceLogRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);

    }
}

