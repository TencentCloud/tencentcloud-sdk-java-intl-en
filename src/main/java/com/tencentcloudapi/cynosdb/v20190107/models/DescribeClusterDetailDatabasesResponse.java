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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDetailDatabasesResponse extends AbstractModel{

    /**
    * Database information Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbInfos")
    @Expose
    private DbInfo [] DbInfos;

    /**
    * The total count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Database information Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbInfos Database information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DbInfo [] getDbInfos() {
        return this.DbInfos;
    }

    /**
     * Set Database information Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbInfos Database information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbInfos(DbInfo [] DbInfos) {
        this.DbInfos = DbInfos;
    }

    /**
     * Get The total count 
     * @return TotalCount The total count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total count
     * @param TotalCount The total count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeClusterDetailDatabasesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDetailDatabasesResponse(DescribeClusterDetailDatabasesResponse source) {
        if (source.DbInfos != null) {
            this.DbInfos = new DbInfo[source.DbInfos.length];
            for (int i = 0; i < source.DbInfos.length; i++) {
                this.DbInfos[i] = new DbInfo(source.DbInfos[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DbInfos.", this.DbInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

