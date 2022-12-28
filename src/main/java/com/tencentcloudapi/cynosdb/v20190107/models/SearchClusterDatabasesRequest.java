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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClusterDatabasesRequest extends AbstractModel{

    /**
    * The cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Whether to search exactly
Valid values: `0` (fuzzy search), `1` (exact search). 
Default value: `0`.
    */
    @SerializedName("MatchType")
    @Expose
    private Long MatchType;

    /**
     * Get The cluster ID 
     * @return ClusterId The cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The cluster ID
     * @param ClusterId The cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Whether to search exactly
Valid values: `0` (fuzzy search), `1` (exact search). 
Default value: `0`. 
     * @return MatchType Whether to search exactly
Valid values: `0` (fuzzy search), `1` (exact search). 
Default value: `0`.
     */
    public Long getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Whether to search exactly
Valid values: `0` (fuzzy search), `1` (exact search). 
Default value: `0`.
     * @param MatchType Whether to search exactly
Valid values: `0` (fuzzy search), `1` (exact search). 
Default value: `0`.
     */
    public void setMatchType(Long MatchType) {
        this.MatchType = MatchType;
    }

    public SearchClusterDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchClusterDatabasesRequest(SearchClusterDatabasesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.MatchType != null) {
            this.MatchType = new Long(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

