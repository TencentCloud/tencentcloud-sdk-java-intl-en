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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessDBInstancesResponse extends AbstractModel {

    /**
    * The number of query results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Query results
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceSet")
    @Expose
    private ServerlessDBInstance [] DBInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of query results 
     * @return TotalCount The number of query results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of query results
     * @param TotalCount The number of query results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Query results
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBInstanceSet Query results
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServerlessDBInstance [] getDBInstanceSet() {
        return this.DBInstanceSet;
    }

    /**
     * Set Query results
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBInstanceSet Query results
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBInstanceSet(ServerlessDBInstance [] DBInstanceSet) {
        this.DBInstanceSet = DBInstanceSet;
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

    public DescribeServerlessDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessDBInstancesResponse(DescribeServerlessDBInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DBInstanceSet != null) {
            this.DBInstanceSet = new ServerlessDBInstance[source.DBInstanceSet.length];
            for (int i = 0; i < source.DBInstanceSet.length; i++) {
                this.DBInstanceSet[i] = new ServerlessDBInstance(source.DBInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "DBInstanceSet.", this.DBInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

