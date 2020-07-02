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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGameServerSessionsResponse extends AbstractModel{

    /**
    * Game server session list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessions")
    @Expose
    private GameServerSession [] GameServerSessions;

    /**
    * Pagination offset, which is used for querying the next page
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Game server session list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessions Game server session list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GameServerSession [] getGameServerSessions() {
        return this.GameServerSessions;
    }

    /**
     * Set Game server session list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessions Game server session list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessions(GameServerSession [] GameServerSessions) {
        this.GameServerSessions = GameServerSessions;
    }

    /**
     * Get Pagination offset, which is used for querying the next page
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NextToken Pagination offset, which is used for querying the next page
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Pagination offset, which is used for querying the next page
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NextToken Pagination offset, which is used for querying the next page
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GameServerSessions.", this.GameServerSessions);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

