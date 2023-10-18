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

public class RollbackTablesResponse extends AbstractModel {

    /**
    * Number of table rollback task results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Table rollback task result list
    */
    @SerializedName("TableResults")
    @Expose
    private TableRollbackResultNew [] TableResults;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of table rollback task results 
     * @return TotalCount Number of table rollback task results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of table rollback task results
     * @param TotalCount Number of table rollback task results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Table rollback task result list 
     * @return TableResults Table rollback task result list
     */
    public TableRollbackResultNew [] getTableResults() {
        return this.TableResults;
    }

    /**
     * Set Table rollback task result list
     * @param TableResults Table rollback task result list
     */
    public void setTableResults(TableRollbackResultNew [] TableResults) {
        this.TableResults = TableResults;
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

    public RollbackTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTablesResponse(RollbackTablesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableResults != null) {
            this.TableResults = new TableRollbackResultNew[source.TableResults.length];
            for (int i = 0; i < source.TableResults.length; i++) {
                this.TableResults[i] = new TableRollbackResultNew(source.TableResults[i]);
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
        this.setParamArrayObj(map, prefix + "TableResults.", this.TableResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

