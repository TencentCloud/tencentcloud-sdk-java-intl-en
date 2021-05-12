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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotsResponse extends AbstractModel{

    /**
    * The number of snapshots created in batches
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The result list of snapshots created in batches
    */
    @SerializedName("TableResults")
    @Expose
    private SnapshotResult [] TableResults;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of snapshots created in batches 
     * @return TotalCount The number of snapshots created in batches
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of snapshots created in batches
     * @param TotalCount The number of snapshots created in batches
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The result list of snapshots created in batches 
     * @return TableResults The result list of snapshots created in batches
     */
    public SnapshotResult [] getTableResults() {
        return this.TableResults;
    }

    /**
     * Set The result list of snapshots created in batches
     * @param TableResults The result list of snapshots created in batches
     */
    public void setTableResults(SnapshotResult [] TableResults) {
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

    public CreateSnapshotsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotsResponse(CreateSnapshotsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableResults != null) {
            this.TableResults = new SnapshotResult[source.TableResults.length];
            for (int i = 0; i < source.TableResults.length; i++) {
                this.TableResults[i] = new SnapshotResult(source.TableResults[i]);
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

