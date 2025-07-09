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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGameServerSessionDetailsResponse extends AbstractModel {

    /**
    * List of game server session details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionDetails")
    @Expose
    private GameServerSessionDetail [] GameServerSessionDetails;

    /**
    * Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
Note: this field may return `null`, indicating that no valid value is obtained.
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
     * Get List of game server session details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionDetails List of game server session details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GameServerSessionDetail [] getGameServerSessionDetails() {
        return this.GameServerSessionDetails;
    }

    /**
     * Set List of game server session details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionDetails List of game server session details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionDetails(GameServerSessionDetail [] GameServerSessionDetails) {
        this.GameServerSessionDetails = GameServerSessionDetails;
    }

    /**
     * Get Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return NextToken Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param NextToken Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
Note: this field may return `null`, indicating that no valid value is obtained.
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

    public DescribeGameServerSessionDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGameServerSessionDetailsResponse(DescribeGameServerSessionDetailsResponse source) {
        if (source.GameServerSessionDetails != null) {
            this.GameServerSessionDetails = new GameServerSessionDetail[source.GameServerSessionDetails.length];
            for (int i = 0; i < source.GameServerSessionDetails.length; i++) {
                this.GameServerSessionDetails[i] = new GameServerSessionDetail(source.GameServerSessionDetails[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GameServerSessionDetails.", this.GameServerSessionDetails);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

