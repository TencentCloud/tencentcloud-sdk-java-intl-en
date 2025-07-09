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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisItems extends AbstractModel {

    /**
    * The name of the database queried by the slow query statement
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * The name of the user who executes the slow query statement
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The slow query statement whose parameter values are abstracted
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
    * The address of the client that executes the slow query statement
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * The number of executions of the slow query statement during the specified period of time
    */
    @SerializedName("CallNum")
    @Expose
    private Long CallNum;

    /**
    * The ratio (in decimal form) of the number of executions of the slow query statement to that of all slow query statements during the specified period of time
    */
    @SerializedName("CallPercent")
    @Expose
    private Float CallPercent;

    /**
    * The total execution time of the slow query statement during the specified period of time
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * The ratio (in decimal form) of the total execution time of the slow query statement to that of all slow query statements during the specified period of time
    */
    @SerializedName("CostPercent")
    @Expose
    private Float CostPercent;

    /**
    * The shortest execution time (in ms) of the slow query statement during the specified period of time
    */
    @SerializedName("MinCostTime")
    @Expose
    private Float MinCostTime;

    /**
    * The longest execution time (in ms) of the slow query statement during the specified period of time
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Float MaxCostTime;

    /**
    * The average execution time (in ms) of the slow query statement during the specified period of time
    */
    @SerializedName("AvgCostTime")
    @Expose
    private Float AvgCostTime;

    /**
    * The timestamp when the slow query statement starts to execute for the first time during the specified period of time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * The timestamp when the slow query statement starts to execute for the last time during the specified period of time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
     * Get The name of the database queried by the slow query statement 
     * @return DatabaseName The name of the database queried by the slow query statement
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set The name of the database queried by the slow query statement
     * @param DatabaseName The name of the database queried by the slow query statement
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get The name of the user who executes the slow query statement 
     * @return UserName The name of the user who executes the slow query statement
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set The name of the user who executes the slow query statement
     * @param UserName The name of the user who executes the slow query statement
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get The slow query statement whose parameter values are abstracted 
     * @return NormalQuery The slow query statement whose parameter values are abstracted
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set The slow query statement whose parameter values are abstracted
     * @param NormalQuery The slow query statement whose parameter values are abstracted
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * Get The address of the client that executes the slow query statement 
     * @return ClientAddr The address of the client that executes the slow query statement
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set The address of the client that executes the slow query statement
     * @param ClientAddr The address of the client that executes the slow query statement
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get The number of executions of the slow query statement during the specified period of time 
     * @return CallNum The number of executions of the slow query statement during the specified period of time
     */
    public Long getCallNum() {
        return this.CallNum;
    }

    /**
     * Set The number of executions of the slow query statement during the specified period of time
     * @param CallNum The number of executions of the slow query statement during the specified period of time
     */
    public void setCallNum(Long CallNum) {
        this.CallNum = CallNum;
    }

    /**
     * Get The ratio (in decimal form) of the number of executions of the slow query statement to that of all slow query statements during the specified period of time 
     * @return CallPercent The ratio (in decimal form) of the number of executions of the slow query statement to that of all slow query statements during the specified period of time
     */
    public Float getCallPercent() {
        return this.CallPercent;
    }

    /**
     * Set The ratio (in decimal form) of the number of executions of the slow query statement to that of all slow query statements during the specified period of time
     * @param CallPercent The ratio (in decimal form) of the number of executions of the slow query statement to that of all slow query statements during the specified period of time
     */
    public void setCallPercent(Float CallPercent) {
        this.CallPercent = CallPercent;
    }

    /**
     * Get The total execution time of the slow query statement during the specified period of time 
     * @return CostTime The total execution time of the slow query statement during the specified period of time
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set The total execution time of the slow query statement during the specified period of time
     * @param CostTime The total execution time of the slow query statement during the specified period of time
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get The ratio (in decimal form) of the total execution time of the slow query statement to that of all slow query statements during the specified period of time 
     * @return CostPercent The ratio (in decimal form) of the total execution time of the slow query statement to that of all slow query statements during the specified period of time
     */
    public Float getCostPercent() {
        return this.CostPercent;
    }

    /**
     * Set The ratio (in decimal form) of the total execution time of the slow query statement to that of all slow query statements during the specified period of time
     * @param CostPercent The ratio (in decimal form) of the total execution time of the slow query statement to that of all slow query statements during the specified period of time
     */
    public void setCostPercent(Float CostPercent) {
        this.CostPercent = CostPercent;
    }

    /**
     * Get The shortest execution time (in ms) of the slow query statement during the specified period of time 
     * @return MinCostTime The shortest execution time (in ms) of the slow query statement during the specified period of time
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set The shortest execution time (in ms) of the slow query statement during the specified period of time
     * @param MinCostTime The shortest execution time (in ms) of the slow query statement during the specified period of time
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get The longest execution time (in ms) of the slow query statement during the specified period of time 
     * @return MaxCostTime The longest execution time (in ms) of the slow query statement during the specified period of time
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set The longest execution time (in ms) of the slow query statement during the specified period of time
     * @param MaxCostTime The longest execution time (in ms) of the slow query statement during the specified period of time
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get The average execution time (in ms) of the slow query statement during the specified period of time 
     * @return AvgCostTime The average execution time (in ms) of the slow query statement during the specified period of time
     */
    public Float getAvgCostTime() {
        return this.AvgCostTime;
    }

    /**
     * Set The average execution time (in ms) of the slow query statement during the specified period of time
     * @param AvgCostTime The average execution time (in ms) of the slow query statement during the specified period of time
     */
    public void setAvgCostTime(Float AvgCostTime) {
        this.AvgCostTime = AvgCostTime;
    }

    /**
     * Get The timestamp when the slow query statement starts to execute for the first time during the specified period of time 
     * @return FirstTime The timestamp when the slow query statement starts to execute for the first time during the specified period of time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set The timestamp when the slow query statement starts to execute for the first time during the specified period of time
     * @param FirstTime The timestamp when the slow query statement starts to execute for the first time during the specified period of time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get The timestamp when the slow query statement starts to execute for the last time during the specified period of time 
     * @return LastTime The timestamp when the slow query statement starts to execute for the last time during the specified period of time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set The timestamp when the slow query statement starts to execute for the last time during the specified period of time
     * @param LastTime The timestamp when the slow query statement starts to execute for the last time during the specified period of time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    public AnalysisItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisItems(AnalysisItems source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.NormalQuery != null) {
            this.NormalQuery = new String(source.NormalQuery);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.CallNum != null) {
            this.CallNum = new Long(source.CallNum);
        }
        if (source.CallPercent != null) {
            this.CallPercent = new Float(source.CallPercent);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.CostPercent != null) {
            this.CostPercent = new Float(source.CostPercent);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Float(source.MinCostTime);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Float(source.MaxCostTime);
        }
        if (source.AvgCostTime != null) {
            this.AvgCostTime = new Float(source.AvgCostTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "CallNum", this.CallNum);
        this.setParamSimple(map, prefix + "CallPercent", this.CallPercent);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CostPercent", this.CostPercent);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "AvgCostTime", this.AvgCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);

    }
}

