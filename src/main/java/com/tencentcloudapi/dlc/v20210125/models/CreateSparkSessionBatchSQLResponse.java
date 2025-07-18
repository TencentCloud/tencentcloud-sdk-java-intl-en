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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkSessionBatchSQLResponse extends AbstractModel {

    /**
    * The unique identifier of a batch task.
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * Statement task list information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Statements")
    @Expose
    private StatementInformation [] Statements;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The unique identifier of a batch task. 
     * @return BatchId The unique identifier of a batch task.
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set The unique identifier of a batch task.
     * @param BatchId The unique identifier of a batch task.
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get Statement task list information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Statements Statement task list information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StatementInformation [] getStatements() {
        return this.Statements;
    }

    /**
     * Set Statement task list information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Statements Statement task list information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatements(StatementInformation [] Statements) {
        this.Statements = Statements;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateSparkSessionBatchSQLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkSessionBatchSQLResponse(CreateSparkSessionBatchSQLResponse source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Statements != null) {
            this.Statements = new StatementInformation[source.Statements.length];
            for (int i = 0; i < source.Statements.length; i++) {
                this.Statements[i] = new StatementInformation(source.Statements[i]);
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
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamArrayObj(map, prefix + "Statements.", this.Statements);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

