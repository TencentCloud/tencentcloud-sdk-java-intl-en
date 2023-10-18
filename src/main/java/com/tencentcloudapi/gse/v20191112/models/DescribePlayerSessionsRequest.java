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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlayerSessionsRequest extends AbstractModel {

    /**
    * Game server session ID. It should contain 1 to 48 ASCII characters.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Maximum number of entries in a single query
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Player ID. It should contain 1 to 1024 ASCII characters.
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * Player session ID. It should contain 1 to 1024 ASCII characters.
    */
    @SerializedName("PlayerSessionId")
    @Expose
    private String PlayerSessionId;

    /**
    * Player session status. Valid values: RESERVED, ACTIVE, COMPLETED, TIMEDOUT
    */
    @SerializedName("PlayerSessionStatusFilter")
    @Expose
    private String PlayerSessionStatusFilter;

    /**
     * Get Game server session ID. It should contain 1 to 48 ASCII characters. 
     * @return GameServerSessionId Game server session ID. It should contain 1 to 48 ASCII characters.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID. It should contain 1 to 48 ASCII characters.
     * @param GameServerSessionId Game server session ID. It should contain 1 to 48 ASCII characters.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Maximum number of entries in a single query 
     * @return Limit Maximum number of entries in a single query
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries in a single query
     * @param Limit Maximum number of entries in a single query
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters. 
     * @return NextToken Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
     * @param NextToken Pagination offset, which is used for querying the next page. It should contain 1 to 1024 ASCII characters.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Player ID. It should contain 1 to 1024 ASCII characters. 
     * @return PlayerId Player ID. It should contain 1 to 1024 ASCII characters.
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set Player ID. It should contain 1 to 1024 ASCII characters.
     * @param PlayerId Player ID. It should contain 1 to 1024 ASCII characters.
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get Player session ID. It should contain 1 to 1024 ASCII characters. 
     * @return PlayerSessionId Player session ID. It should contain 1 to 1024 ASCII characters.
     */
    public String getPlayerSessionId() {
        return this.PlayerSessionId;
    }

    /**
     * Set Player session ID. It should contain 1 to 1024 ASCII characters.
     * @param PlayerSessionId Player session ID. It should contain 1 to 1024 ASCII characters.
     */
    public void setPlayerSessionId(String PlayerSessionId) {
        this.PlayerSessionId = PlayerSessionId;
    }

    /**
     * Get Player session status. Valid values: RESERVED, ACTIVE, COMPLETED, TIMEDOUT 
     * @return PlayerSessionStatusFilter Player session status. Valid values: RESERVED, ACTIVE, COMPLETED, TIMEDOUT
     */
    public String getPlayerSessionStatusFilter() {
        return this.PlayerSessionStatusFilter;
    }

    /**
     * Set Player session status. Valid values: RESERVED, ACTIVE, COMPLETED, TIMEDOUT
     * @param PlayerSessionStatusFilter Player session status. Valid values: RESERVED, ACTIVE, COMPLETED, TIMEDOUT
     */
    public void setPlayerSessionStatusFilter(String PlayerSessionStatusFilter) {
        this.PlayerSessionStatusFilter = PlayerSessionStatusFilter;
    }

    public DescribePlayerSessionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlayerSessionsRequest(DescribePlayerSessionsRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.PlayerSessionId != null) {
            this.PlayerSessionId = new String(source.PlayerSessionId);
        }
        if (source.PlayerSessionStatusFilter != null) {
            this.PlayerSessionStatusFilter = new String(source.PlayerSessionStatusFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerSessionId", this.PlayerSessionId);
        this.setParamSimple(map, prefix + "PlayerSessionStatusFilter", this.PlayerSessionStatusFilter);

    }
}

