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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalQueryItem extends AbstractModel {

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Number of calls
    */
    @SerializedName("Calls")
    @Expose
    private Long Calls;

    /**
    * Granularity
    */
    @SerializedName("CallsGrids")
    @Expose
    private Long [] CallsGrids;

    /**
    * Total time consumed
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * Number of affected rows
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * Minimum time consumed
    */
    @SerializedName("MinCostTime")
    @Expose
    private Float MinCostTime;

    /**
    * Maximum time consumed
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Float MaxCostTime;

    /**
    * Time of the earliest slow SQL statement
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Time of the latest slow SQL statement
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Shared memory blocks for reads
    */
    @SerializedName("SharedReadBlks")
    @Expose
    private Long SharedReadBlks;

    /**
    * Shared memory blocks for writes
    */
    @SerializedName("SharedWriteBlks")
    @Expose
    private Long SharedWriteBlks;

    /**
    * Total IO read time
    */
    @SerializedName("ReadCostTime")
    @Expose
    private Long ReadCostTime;

    /**
    * Total IO write time
    */
    @SerializedName("WriteCostTime")
    @Expose
    private Long WriteCostTime;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Slow SQL statement after desensitization
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Number of calls 
     * @return Calls Number of calls
     */
    public Long getCalls() {
        return this.Calls;
    }

    /**
     * Set Number of calls
     * @param Calls Number of calls
     */
    public void setCalls(Long Calls) {
        this.Calls = Calls;
    }

    /**
     * Get Granularity 
     * @return CallsGrids Granularity
     */
    public Long [] getCallsGrids() {
        return this.CallsGrids;
    }

    /**
     * Set Granularity
     * @param CallsGrids Granularity
     */
    public void setCallsGrids(Long [] CallsGrids) {
        this.CallsGrids = CallsGrids;
    }

    /**
     * Get Total time consumed 
     * @return CostTime Total time consumed
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Total time consumed
     * @param CostTime Total time consumed
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Number of affected rows 
     * @return Rows Number of affected rows
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set Number of affected rows
     * @param Rows Number of affected rows
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Minimum time consumed 
     * @return MinCostTime Minimum time consumed
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set Minimum time consumed
     * @param MinCostTime Minimum time consumed
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get Maximum time consumed 
     * @return MaxCostTime Maximum time consumed
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set Maximum time consumed
     * @param MaxCostTime Maximum time consumed
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get Time of the earliest slow SQL statement 
     * @return FirstTime Time of the earliest slow SQL statement
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set Time of the earliest slow SQL statement
     * @param FirstTime Time of the earliest slow SQL statement
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Time of the latest slow SQL statement 
     * @return LastTime Time of the latest slow SQL statement
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Time of the latest slow SQL statement
     * @param LastTime Time of the latest slow SQL statement
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Shared memory blocks for reads 
     * @return SharedReadBlks Shared memory blocks for reads
     */
    public Long getSharedReadBlks() {
        return this.SharedReadBlks;
    }

    /**
     * Set Shared memory blocks for reads
     * @param SharedReadBlks Shared memory blocks for reads
     */
    public void setSharedReadBlks(Long SharedReadBlks) {
        this.SharedReadBlks = SharedReadBlks;
    }

    /**
     * Get Shared memory blocks for writes 
     * @return SharedWriteBlks Shared memory blocks for writes
     */
    public Long getSharedWriteBlks() {
        return this.SharedWriteBlks;
    }

    /**
     * Set Shared memory blocks for writes
     * @param SharedWriteBlks Shared memory blocks for writes
     */
    public void setSharedWriteBlks(Long SharedWriteBlks) {
        this.SharedWriteBlks = SharedWriteBlks;
    }

    /**
     * Get Total IO read time 
     * @return ReadCostTime Total IO read time
     */
    public Long getReadCostTime() {
        return this.ReadCostTime;
    }

    /**
     * Set Total IO read time
     * @param ReadCostTime Total IO read time
     */
    public void setReadCostTime(Long ReadCostTime) {
        this.ReadCostTime = ReadCostTime;
    }

    /**
     * Get Total IO write time 
     * @return WriteCostTime Total IO write time
     */
    public Long getWriteCostTime() {
        return this.WriteCostTime;
    }

    /**
     * Set Total IO write time
     * @param WriteCostTime Total IO write time
     */
    public void setWriteCostTime(Long WriteCostTime) {
        this.WriteCostTime = WriteCostTime;
    }

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Slow SQL statement after desensitization 
     * @return NormalQuery Slow SQL statement after desensitization
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set Slow SQL statement after desensitization
     * @param NormalQuery Slow SQL statement after desensitization
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    public NormalQueryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalQueryItem(NormalQueryItem source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Calls != null) {
            this.Calls = new Long(source.Calls);
        }
        if (source.CallsGrids != null) {
            this.CallsGrids = new Long[source.CallsGrids.length];
            for (int i = 0; i < source.CallsGrids.length; i++) {
                this.CallsGrids[i] = new Long(source.CallsGrids[i]);
            }
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.Rows != null) {
            this.Rows = new Long(source.Rows);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Float(source.MinCostTime);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Float(source.MaxCostTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.SharedReadBlks != null) {
            this.SharedReadBlks = new Long(source.SharedReadBlks);
        }
        if (source.SharedWriteBlks != null) {
            this.SharedWriteBlks = new Long(source.SharedWriteBlks);
        }
        if (source.ReadCostTime != null) {
            this.ReadCostTime = new Long(source.ReadCostTime);
        }
        if (source.WriteCostTime != null) {
            this.WriteCostTime = new Long(source.WriteCostTime);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.NormalQuery != null) {
            this.NormalQuery = new String(source.NormalQuery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Calls", this.Calls);
        this.setParamArraySimple(map, prefix + "CallsGrids.", this.CallsGrids);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "SharedReadBlks", this.SharedReadBlks);
        this.setParamSimple(map, prefix + "SharedWriteBlks", this.SharedWriteBlks);
        this.setParamSimple(map, prefix + "ReadCostTime", this.ReadCostTime);
        this.setParamSimple(map, prefix + "WriteCostTime", this.WriteCostTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);

    }
}

