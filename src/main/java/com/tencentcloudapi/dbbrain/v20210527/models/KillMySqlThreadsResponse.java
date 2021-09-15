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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillMySqlThreadsResponse extends AbstractModel{

    /**
    * The ID list of MySQL sessions that have been killed.
    */
    @SerializedName("Threads")
    @Expose
    private Long [] Threads;

    /**
    * Execution ID, which is output in the “Prepare” stage and used to specify the ID of the session to be killed in the “Commit” stage.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlExecId")
    @Expose
    private String SqlExecId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The ID list of MySQL sessions that have been killed. 
     * @return Threads The ID list of MySQL sessions that have been killed.
     */
    public Long [] getThreads() {
        return this.Threads;
    }

    /**
     * Set The ID list of MySQL sessions that have been killed.
     * @param Threads The ID list of MySQL sessions that have been killed.
     */
    public void setThreads(Long [] Threads) {
        this.Threads = Threads;
    }

    /**
     * Get Execution ID, which is output in the “Prepare” stage and used to specify the ID of the session to be killed in the “Commit” stage.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SqlExecId Execution ID, which is output in the “Prepare” stage and used to specify the ID of the session to be killed in the “Commit” stage.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSqlExecId() {
        return this.SqlExecId;
    }

    /**
     * Set Execution ID, which is output in the “Prepare” stage and used to specify the ID of the session to be killed in the “Commit” stage.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SqlExecId Execution ID, which is output in the “Prepare” stage and used to specify the ID of the session to be killed in the “Commit” stage.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSqlExecId(String SqlExecId) {
        this.SqlExecId = SqlExecId;
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

    public KillMySqlThreadsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillMySqlThreadsResponse(KillMySqlThreadsResponse source) {
        if (source.Threads != null) {
            this.Threads = new Long[source.Threads.length];
            for (int i = 0; i < source.Threads.length; i++) {
                this.Threads[i] = new Long(source.Threads[i]);
            }
        }
        if (source.SqlExecId != null) {
            this.SqlExecId = new String(source.SqlExecId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Threads.", this.Threads);
        this.setParamSimple(map, prefix + "SqlExecId", this.SqlExecId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

