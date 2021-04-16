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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesResponse extends AbstractModel{

    /**
    * Number of eligible instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of an instance.
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * Database name and character set
    */
    @SerializedName("DatabaseList")
    @Expose
    private DatabasesWithCharacterLists [] DatabaseList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible instances. 
     * @return TotalCount Number of eligible instances.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible instances.
     * @param TotalCount Number of eligible instances.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of an instance. 
     * @return Items Information of an instance.
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set Information of an instance.
     * @param Items Information of an instance.
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    /**
     * Get Database name and character set 
     * @return DatabaseList Database name and character set
     */
    public DatabasesWithCharacterLists [] getDatabaseList() {
        return this.DatabaseList;
    }

    /**
     * Set Database name and character set
     * @param DatabaseList Database name and character set
     */
    public void setDatabaseList(DatabasesWithCharacterLists [] DatabaseList) {
        this.DatabaseList = DatabaseList;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "DatabaseList.", this.DatabaseList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

