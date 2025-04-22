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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormQueryItem extends AbstractModel {

    /**
    * Number of calls.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CallTimes")
    @Expose
    private Long CallTimes;

    /**
    * Number of read-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SharedReadBlocks")
    @Expose
    private Long SharedReadBlocks;

    /**
    * Number of write-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SharedWriteBlocks")
    @Expose
    private Long SharedWriteBlocks;

    /**
    * Database.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Statement after masking.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
    * The statement with the longest execution time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxElapsedQuery")
    @Expose
    private String MaxElapsedQuery;

    /**
    * Total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * Client IP address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Username.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Proportion of total count.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCallTimesPercent")
    @Expose
    private Float TotalCallTimesPercent;

    /**
    * Proportion of total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCostTimePercent")
    @Expose
    private Float TotalCostTimePercent;

    /**
    * Minimum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinCostTime")
    @Expose
    private Float MinCostTime;

    /**
    * Maximum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Float MaxCostTime;

    /**
    * Time of the earliest item.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Time of the latest item.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Total consumption time of I/O reading.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadCostTime")
    @Expose
    private Float ReadCostTime;

    /**
    * Total consumption time I/O writing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WriteCostTime")
    @Expose
    private Float WriteCostTime;

    /**
     * Get Number of calls.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CallTimes Number of calls.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCallTimes() {
        return this.CallTimes;
    }

    /**
     * Set Number of calls.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CallTimes Number of calls.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCallTimes(Long CallTimes) {
        this.CallTimes = CallTimes;
    }

    /**
     * Get Number of read-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SharedReadBlocks Number of read-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSharedReadBlocks() {
        return this.SharedReadBlocks;
    }

    /**
     * Set Number of read-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SharedReadBlocks Number of read-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSharedReadBlocks(Long SharedReadBlocks) {
        this.SharedReadBlocks = SharedReadBlocks;
    }

    /**
     * Get Number of write-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SharedWriteBlocks Number of write-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSharedWriteBlocks() {
        return this.SharedWriteBlocks;
    }

    /**
     * Set Number of write-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SharedWriteBlocks Number of write-only shared memory blocks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSharedWriteBlocks(Long SharedWriteBlocks) {
        this.SharedWriteBlocks = SharedWriteBlocks;
    }

    /**
     * Get Database.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Statement after masking.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NormalQuery Statement after masking.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set Statement after masking.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NormalQuery Statement after masking.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * Get The statement with the longest execution time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxElapsedQuery The statement with the longest execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMaxElapsedQuery() {
        return this.MaxElapsedQuery;
    }

    /**
     * Set The statement with the longest execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxElapsedQuery The statement with the longest execution time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxElapsedQuery(String MaxElapsedQuery) {
        this.MaxElapsedQuery = MaxElapsedQuery;
    }

    /**
     * Get Total consumption time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CostTime Total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CostTime Total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Client IP address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIp Client IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIp Client IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Username.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Proportion of total count.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCallTimesPercent Proportion of total count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTotalCallTimesPercent() {
        return this.TotalCallTimesPercent;
    }

    /**
     * Set Proportion of total count.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCallTimesPercent Proportion of total count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCallTimesPercent(Float TotalCallTimesPercent) {
        this.TotalCallTimesPercent = TotalCallTimesPercent;
    }

    /**
     * Get Proportion of total consumption time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCostTimePercent Proportion of total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTotalCostTimePercent() {
        return this.TotalCostTimePercent;
    }

    /**
     * Set Proportion of total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCostTimePercent Proportion of total consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCostTimePercent(Float TotalCostTimePercent) {
        this.TotalCostTimePercent = TotalCostTimePercent;
    }

    /**
     * Get Minimum consumption time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinCostTime Minimum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set Minimum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinCostTime Minimum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get Maximum consumption time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxCostTime Maximum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set Maximum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxCostTime Maximum consumption time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get Time of the earliest item.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstTime Time of the earliest item.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set Time of the earliest item.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstTime Time of the earliest item.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Time of the latest item.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTime Time of the latest item.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Time of the latest item.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTime Time of the latest item.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Total consumption time of I/O reading.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReadCostTime Total consumption time of I/O reading.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getReadCostTime() {
        return this.ReadCostTime;
    }

    /**
     * Set Total consumption time of I/O reading.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReadCostTime Total consumption time of I/O reading.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReadCostTime(Float ReadCostTime) {
        this.ReadCostTime = ReadCostTime;
    }

    /**
     * Get Total consumption time I/O writing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WriteCostTime Total consumption time I/O writing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getWriteCostTime() {
        return this.WriteCostTime;
    }

    /**
     * Set Total consumption time I/O writing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WriteCostTime Total consumption time I/O writing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWriteCostTime(Float WriteCostTime) {
        this.WriteCostTime = WriteCostTime;
    }

    public NormQueryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormQueryItem(NormQueryItem source) {
        if (source.CallTimes != null) {
            this.CallTimes = new Long(source.CallTimes);
        }
        if (source.SharedReadBlocks != null) {
            this.SharedReadBlocks = new Long(source.SharedReadBlocks);
        }
        if (source.SharedWriteBlocks != null) {
            this.SharedWriteBlocks = new Long(source.SharedWriteBlocks);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.NormalQuery != null) {
            this.NormalQuery = new String(source.NormalQuery);
        }
        if (source.MaxElapsedQuery != null) {
            this.MaxElapsedQuery = new String(source.MaxElapsedQuery);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TotalCallTimesPercent != null) {
            this.TotalCallTimesPercent = new Float(source.TotalCallTimesPercent);
        }
        if (source.TotalCostTimePercent != null) {
            this.TotalCostTimePercent = new Float(source.TotalCostTimePercent);
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
        if (source.ReadCostTime != null) {
            this.ReadCostTime = new Float(source.ReadCostTime);
        }
        if (source.WriteCostTime != null) {
            this.WriteCostTime = new Float(source.WriteCostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallTimes", this.CallTimes);
        this.setParamSimple(map, prefix + "SharedReadBlocks", this.SharedReadBlocks);
        this.setParamSimple(map, prefix + "SharedWriteBlocks", this.SharedWriteBlocks);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);
        this.setParamSimple(map, prefix + "MaxElapsedQuery", this.MaxElapsedQuery);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TotalCallTimesPercent", this.TotalCallTimesPercent);
        this.setParamSimple(map, prefix + "TotalCostTimePercent", this.TotalCostTimePercent);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "ReadCostTime", this.ReadCostTime);
        this.setParamSimple(map, prefix + "WriteCostTime", this.WriteCostTime);

    }
}

