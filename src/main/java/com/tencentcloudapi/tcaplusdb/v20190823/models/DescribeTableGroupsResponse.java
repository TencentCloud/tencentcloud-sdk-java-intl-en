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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableGroupsResponse extends AbstractModel {

    /**
    * Number of table groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Table group information list
    */
    @SerializedName("TableGroups")
    @Expose
    private TableGroupInfo [] TableGroups;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of table groups 
     * @return TotalCount Number of table groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of table groups
     * @param TotalCount Number of table groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Table group information list 
     * @return TableGroups Table group information list
     */
    public TableGroupInfo [] getTableGroups() {
        return this.TableGroups;
    }

    /**
     * Set Table group information list
     * @param TableGroups Table group information list
     */
    public void setTableGroups(TableGroupInfo [] TableGroups) {
        this.TableGroups = TableGroups;
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

    public DescribeTableGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableGroupsResponse(DescribeTableGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableGroups != null) {
            this.TableGroups = new TableGroupInfo[source.TableGroups.length];
            for (int i = 0; i < source.TableGroups.length; i++) {
                this.TableGroups[i] = new TableGroupInfo(source.TableGroups[i]);
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
        this.setParamArrayObj(map, prefix + "TableGroups.", this.TableGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

