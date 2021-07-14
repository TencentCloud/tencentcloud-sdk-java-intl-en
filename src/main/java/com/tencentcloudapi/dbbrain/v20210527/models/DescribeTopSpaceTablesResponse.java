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

public class DescribeTopSpaceTablesResponse extends AbstractModel{

    /**
    * List of the returned space statistics of top tables.
    */
    @SerializedName("TopSpaceTables")
    @Expose
    private TableSpaceData [] TopSpaceTables;

    /**
    * Timestamp (in seconds) of tablespace data collection points
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of the returned space statistics of top tables. 
     * @return TopSpaceTables List of the returned space statistics of top tables.
     */
    public TableSpaceData [] getTopSpaceTables() {
        return this.TopSpaceTables;
    }

    /**
     * Set List of the returned space statistics of top tables.
     * @param TopSpaceTables List of the returned space statistics of top tables.
     */
    public void setTopSpaceTables(TableSpaceData [] TopSpaceTables) {
        this.TopSpaceTables = TopSpaceTables;
    }

    /**
     * Get Timestamp (in seconds) of tablespace data collection points 
     * @return Timestamp Timestamp (in seconds) of tablespace data collection points
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp (in seconds) of tablespace data collection points
     * @param Timestamp Timestamp (in seconds) of tablespace data collection points
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
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

    public DescribeTopSpaceTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceTablesResponse(DescribeTopSpaceTablesResponse source) {
        if (source.TopSpaceTables != null) {
            this.TopSpaceTables = new TableSpaceData[source.TopSpaceTables.length];
            for (int i = 0; i < source.TopSpaceTables.length; i++) {
                this.TopSpaceTables[i] = new TableSpaceData(source.TopSpaceTables[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopSpaceTables.", this.TopSpaceTables);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

