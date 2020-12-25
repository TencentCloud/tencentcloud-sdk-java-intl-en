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

public class DescribeGameServerSessionDetailsRequest extends AbstractModel{

    /**
    * Alias ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * Fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

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
    * Game server session status. Valid values: ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR
    */
    @SerializedName("StatusFilter")
    @Expose
    private String StatusFilter;

    /**
     * Get Alias ID 
     * @return AliasId Alias ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set Alias ID
     * @param AliasId Alias ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get Fleet ID 
     * @return FleetId Fleet ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Fleet ID
     * @param FleetId Fleet ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

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
     * Get Game server session status. Valid values: ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR 
     * @return StatusFilter Game server session status. Valid values: ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR
     */
    public String getStatusFilter() {
        return this.StatusFilter;
    }

    /**
     * Set Game server session status. Valid values: ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR
     * @param StatusFilter Game server session status. Valid values: ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR
     */
    public void setStatusFilter(String StatusFilter) {
        this.StatusFilter = StatusFilter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "StatusFilter", this.StatusFilter);

    }
}

