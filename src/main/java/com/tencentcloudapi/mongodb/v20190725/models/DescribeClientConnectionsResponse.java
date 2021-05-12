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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientConnectionsResponse extends AbstractModel{

    /**
    * Client connection information, including client IP and number of connections
    */
    @SerializedName("Clients")
    @Expose
    private ClientConnection [] Clients;

    /**
    * The total number of records that meet the query condition, which can be used for paginated queries.
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
     * Get Client connection information, including client IP and number of connections 
     * @return Clients Client connection information, including client IP and number of connections
     */
    public ClientConnection [] getClients() {
        return this.Clients;
    }

    /**
     * Set Client connection information, including client IP and number of connections
     * @param Clients Client connection information, including client IP and number of connections
     */
    public void setClients(ClientConnection [] Clients) {
        this.Clients = Clients;
    }

    /**
     * Get The total number of records that meet the query condition, which can be used for paginated queries. 
     * @return TotalCount The total number of records that meet the query condition, which can be used for paginated queries.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of records that meet the query condition, which can be used for paginated queries.
     * @param TotalCount The total number of records that meet the query condition, which can be used for paginated queries.
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

    public DescribeClientConnectionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientConnectionsResponse(DescribeClientConnectionsResponse source) {
        if (source.Clients != null) {
            this.Clients = new ClientConnection[source.Clients.length];
            for (int i = 0; i < source.Clients.length; i++) {
                this.Clients[i] = new ClientConnection(source.Clients[i]);
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
        this.setParamArrayObj(map, prefix + "Clients.", this.Clients);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

