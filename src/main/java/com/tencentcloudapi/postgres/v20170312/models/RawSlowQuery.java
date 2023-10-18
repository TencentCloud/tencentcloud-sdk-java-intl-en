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

public class RawSlowQuery extends AbstractModel {

    /**
    * Slow query statement
    */
    @SerializedName("RawQuery")
    @Expose
    private String RawQuery;

    /**
    * The database queried by the slow query statement
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * The execution time of the slow query statement
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * The client that executes the slow query statement
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * The name of the user who executes the slow query statement
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The time when the slow query statement starts to execute
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
     * Get Slow query statement 
     * @return RawQuery Slow query statement
     */
    public String getRawQuery() {
        return this.RawQuery;
    }

    /**
     * Set Slow query statement
     * @param RawQuery Slow query statement
     */
    public void setRawQuery(String RawQuery) {
        this.RawQuery = RawQuery;
    }

    /**
     * Get The database queried by the slow query statement 
     * @return DatabaseName The database queried by the slow query statement
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set The database queried by the slow query statement
     * @param DatabaseName The database queried by the slow query statement
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get The execution time of the slow query statement 
     * @return Duration The execution time of the slow query statement
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set The execution time of the slow query statement
     * @param Duration The execution time of the slow query statement
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The client that executes the slow query statement 
     * @return ClientAddr The client that executes the slow query statement
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set The client that executes the slow query statement
     * @param ClientAddr The client that executes the slow query statement
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
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
     * Get The time when the slow query statement starts to execute 
     * @return SessionStartTime The time when the slow query statement starts to execute
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set The time when the slow query statement starts to execute
     * @param SessionStartTime The time when the slow query statement starts to execute
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
    }

    public RawSlowQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSlowQuery(RawSlowQuery source) {
        if (source.RawQuery != null) {
            this.RawQuery = new String(source.RawQuery);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SessionStartTime != null) {
            this.SessionStartTime = new String(source.SessionStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RawQuery", this.RawQuery);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SessionStartTime", this.SessionStartTime);

    }
}

