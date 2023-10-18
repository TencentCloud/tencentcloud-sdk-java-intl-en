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

public class DescribeTablesResponse extends AbstractModel {

    /**
    * Number of tables
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Table details result list
    */
    @SerializedName("TableInfos")
    @Expose
    private TableInfoNew [] TableInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of tables 
     * @return TotalCount Number of tables
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of tables
     * @param TotalCount Number of tables
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Table details result list 
     * @return TableInfos Table details result list
     */
    public TableInfoNew [] getTableInfos() {
        return this.TableInfos;
    }

    /**
     * Set Table details result list
     * @param TableInfos Table details result list
     */
    public void setTableInfos(TableInfoNew [] TableInfos) {
        this.TableInfos = TableInfos;
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

    public DescribeTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesResponse(DescribeTablesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableInfos != null) {
            this.TableInfos = new TableInfoNew[source.TableInfos.length];
            for (int i = 0; i < source.TableInfos.length; i++) {
                this.TableInfos[i] = new TableInfoNew(source.TableInfos[i]);
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
        this.setParamArrayObj(map, prefix + "TableInfos.", this.TableInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

