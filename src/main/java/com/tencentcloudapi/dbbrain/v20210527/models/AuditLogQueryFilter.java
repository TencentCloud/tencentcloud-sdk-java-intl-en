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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogQueryFilter extends AbstractModel {

    /**
    * <p>SQL type list, with values such as SELECT, INSERT, UPDATE, and DELETE.</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String [] SqlType;

    /**
    * <p>Execution duration range (ms), an array of length 2: [minimum value, maximum value].</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long [] ExecTime;

    /**
    * <p>IO waiting duration range (ms), an array with a length of 2.</p>
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long [] IoWaitTime;

    /**
    * <p>CPU duration range (ms), an array of length 2.</p>
    */
    @SerializedName("CpuTime")
    @Expose
    private Long [] CpuTime;

    /**
    * <p>Lock wait time range (ms), an array with a length of 2.</p>
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long [] LockWaitTime;

    /**
    * <p>SQL execution error code. For example, 0 indicates success.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * <p>Database name list.</p>
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * <p>Username list.</p>
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * <p>Source IP list.</p>
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * <p>List of thread IDs.</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String [] ThreadId;

    /**
    * <p>List of proxy node hosts.</p>
    */
    @SerializedName("ProxyHostList")
    @Expose
    private String [] ProxyHostList;

    /**
    * <p>Backend Set Host list.</p>
    */
    @SerializedName("SetHostList")
    @Expose
    private String [] SetHostList;

    /**
    * <p>Backend Set ID list.</p>
    */
    @SerializedName("SetIdList")
    @Expose
    private String [] SetIdList;

    /**
    * <p>Multiple SQL keyword conditions, JSON string, internally a two-dimensional array: level 1 is AND, the second level is OR. Note that the cloud API platform does not support two-dimensional arrays. Here, a string is used to carry it, and the server automatically parses it.</p>
    */
    @SerializedName("MultiSql")
    @Expose
    private String MultiSql;

    /**
    * <p>Excluded multiple SQL keyword conditions, JSON string, with the same structure as MultiSql.</p>
    */
    @SerializedName("ExcludeMultiSql")
    @Expose
    private String ExcludeMultiSql;

    /**
    * <p>SQL Template ID.</p>
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL start time, for example: 2026-10-10 11:05:06.002211</p><p>Parameter format: YYYY-MM-DD hh:mm:ss.SSSSSS</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private String SqlStartTime;

    /**
    * <p>Query ID, used for join queries (required when LogType=All).</p>
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
     * Get <p>SQL type list, with values such as SELECT, INSERT, UPDATE, and DELETE.</p> 
     * @return SqlType <p>SQL type list, with values such as SELECT, INSERT, UPDATE, and DELETE.</p>
     */
    public String [] getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL type list, with values such as SELECT, INSERT, UPDATE, and DELETE.</p>
     * @param SqlType <p>SQL type list, with values such as SELECT, INSERT, UPDATE, and DELETE.</p>
     */
    public void setSqlType(String [] SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>Execution duration range (ms), an array of length 2: [minimum value, maximum value].</p> 
     * @return ExecTime <p>Execution duration range (ms), an array of length 2: [minimum value, maximum value].</p>
     */
    public Long [] getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>Execution duration range (ms), an array of length 2: [minimum value, maximum value].</p>
     * @param ExecTime <p>Execution duration range (ms), an array of length 2: [minimum value, maximum value].</p>
     */
    public void setExecTime(Long [] ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>IO waiting duration range (ms), an array with a length of 2.</p> 
     * @return IoWaitTime <p>IO waiting duration range (ms), an array with a length of 2.</p>
     */
    public Long [] getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set <p>IO waiting duration range (ms), an array with a length of 2.</p>
     * @param IoWaitTime <p>IO waiting duration range (ms), an array with a length of 2.</p>
     */
    public void setIoWaitTime(Long [] IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get <p>CPU duration range (ms), an array of length 2.</p> 
     * @return CpuTime <p>CPU duration range (ms), an array of length 2.</p>
     */
    public Long [] getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>CPU duration range (ms), an array of length 2.</p>
     * @param CpuTime <p>CPU duration range (ms), an array of length 2.</p>
     */
    public void setCpuTime(Long [] CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>Lock wait time range (ms), an array with a length of 2.</p> 
     * @return LockWaitTime <p>Lock wait time range (ms), an array with a length of 2.</p>
     */
    public Long [] getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set <p>Lock wait time range (ms), an array with a length of 2.</p>
     * @param LockWaitTime <p>Lock wait time range (ms), an array with a length of 2.</p>
     */
    public void setLockWaitTime(Long [] LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get <p>SQL execution error code. For example, 0 indicates success.</p> 
     * @return ErrCode <p>SQL execution error code. For example, 0 indicates success.</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>SQL execution error code. For example, 0 indicates success.</p>
     * @param ErrCode <p>SQL execution error code. For example, 0 indicates success.</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message.</p> 
     * @return ErrInfo <p>Error message.</p>
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set <p>Error message.</p>
     * @param ErrInfo <p>Error message.</p>
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    /**
     * Get <p>Database name list.</p> 
     * @return DBName <p>Database name list.</p>
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>Database name list.</p>
     * @param DBName <p>Database name list.</p>
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>Username list.</p> 
     * @return User <p>Username list.</p>
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set <p>Username list.</p>
     * @param User <p>Username list.</p>
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get <p>Source IP list.</p> 
     * @return Host <p>Source IP list.</p>
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set <p>Source IP list.</p>
     * @param Host <p>Source IP list.</p>
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get <p>List of thread IDs.</p> 
     * @return ThreadId <p>List of thread IDs.</p>
     */
    public String [] getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>List of thread IDs.</p>
     * @param ThreadId <p>List of thread IDs.</p>
     */
    public void setThreadId(String [] ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>List of proxy node hosts.</p> 
     * @return ProxyHostList <p>List of proxy node hosts.</p>
     */
    public String [] getProxyHostList() {
        return this.ProxyHostList;
    }

    /**
     * Set <p>List of proxy node hosts.</p>
     * @param ProxyHostList <p>List of proxy node hosts.</p>
     */
    public void setProxyHostList(String [] ProxyHostList) {
        this.ProxyHostList = ProxyHostList;
    }

    /**
     * Get <p>Backend Set Host list.</p> 
     * @return SetHostList <p>Backend Set Host list.</p>
     */
    public String [] getSetHostList() {
        return this.SetHostList;
    }

    /**
     * Set <p>Backend Set Host list.</p>
     * @param SetHostList <p>Backend Set Host list.</p>
     */
    public void setSetHostList(String [] SetHostList) {
        this.SetHostList = SetHostList;
    }

    /**
     * Get <p>Backend Set ID list.</p> 
     * @return SetIdList <p>Backend Set ID list.</p>
     */
    public String [] getSetIdList() {
        return this.SetIdList;
    }

    /**
     * Set <p>Backend Set ID list.</p>
     * @param SetIdList <p>Backend Set ID list.</p>
     */
    public void setSetIdList(String [] SetIdList) {
        this.SetIdList = SetIdList;
    }

    /**
     * Get <p>Multiple SQL keyword conditions, JSON string, internally a two-dimensional array: level 1 is AND, the second level is OR. Note that the cloud API platform does not support two-dimensional arrays. Here, a string is used to carry it, and the server automatically parses it.</p> 
     * @return MultiSql <p>Multiple SQL keyword conditions, JSON string, internally a two-dimensional array: level 1 is AND, the second level is OR. Note that the cloud API platform does not support two-dimensional arrays. Here, a string is used to carry it, and the server automatically parses it.</p>
     */
    public String getMultiSql() {
        return this.MultiSql;
    }

    /**
     * Set <p>Multiple SQL keyword conditions, JSON string, internally a two-dimensional array: level 1 is AND, the second level is OR. Note that the cloud API platform does not support two-dimensional arrays. Here, a string is used to carry it, and the server automatically parses it.</p>
     * @param MultiSql <p>Multiple SQL keyword conditions, JSON string, internally a two-dimensional array: level 1 is AND, the second level is OR. Note that the cloud API platform does not support two-dimensional arrays. Here, a string is used to carry it, and the server automatically parses it.</p>
     */
    public void setMultiSql(String MultiSql) {
        this.MultiSql = MultiSql;
    }

    /**
     * Get <p>Excluded multiple SQL keyword conditions, JSON string, with the same structure as MultiSql.</p> 
     * @return ExcludeMultiSql <p>Excluded multiple SQL keyword conditions, JSON string, with the same structure as MultiSql.</p>
     */
    public String getExcludeMultiSql() {
        return this.ExcludeMultiSql;
    }

    /**
     * Set <p>Excluded multiple SQL keyword conditions, JSON string, with the same structure as MultiSql.</p>
     * @param ExcludeMultiSql <p>Excluded multiple SQL keyword conditions, JSON string, with the same structure as MultiSql.</p>
     */
    public void setExcludeMultiSql(String ExcludeMultiSql) {
        this.ExcludeMultiSql = ExcludeMultiSql;
    }

    /**
     * Get <p>SQL Template ID.</p> 
     * @return SqlTemplateId <p>SQL Template ID.</p>
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL Template ID.</p>
     * @param SqlTemplateId <p>SQL Template ID.</p>
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>SQL start time, for example: 2026-10-10 11:05:06.002211</p><p>Parameter format: YYYY-MM-DD hh:mm:ss.SSSSSS</p> 
     * @return SqlStartTime <p>SQL start time, for example: 2026-10-10 11:05:06.002211</p><p>Parameter format: YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     */
    public String getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL start time, for example: 2026-10-10 11:05:06.002211</p><p>Parameter format: YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     * @param SqlStartTime <p>SQL start time, for example: 2026-10-10 11:05:06.002211</p><p>Parameter format: YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     */
    public void setSqlStartTime(String SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>Query ID, used for join queries (required when LogType=All).</p> 
     * @return QueryId <p>Query ID, used for join queries (required when LogType=All).</p>
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>Query ID, used for join queries (required when LogType=All).</p>
     * @param QueryId <p>Query ID, used for join queries (required when LogType=All).</p>
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    public AuditLogQueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogQueryFilter(AuditLogQueryFilter source) {
        if (source.SqlType != null) {
            this.SqlType = new String[source.SqlType.length];
            for (int i = 0; i < source.SqlType.length; i++) {
                this.SqlType[i] = new String(source.SqlType[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long[source.ExecTime.length];
            for (int i = 0; i < source.ExecTime.length; i++) {
                this.ExecTime[i] = new Long(source.ExecTime[i]);
            }
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long[source.IoWaitTime.length];
            for (int i = 0; i < source.IoWaitTime.length; i++) {
                this.IoWaitTime[i] = new Long(source.IoWaitTime[i]);
            }
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long[source.CpuTime.length];
            for (int i = 0; i < source.CpuTime.length; i++) {
                this.CpuTime[i] = new Long(source.CpuTime[i]);
            }
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long[source.LockWaitTime.length];
            for (int i = 0; i < source.LockWaitTime.length; i++) {
                this.LockWaitTime[i] = new Long(source.LockWaitTime[i]);
            }
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String[source.ThreadId.length];
            for (int i = 0; i < source.ThreadId.length; i++) {
                this.ThreadId[i] = new String(source.ThreadId[i]);
            }
        }
        if (source.ProxyHostList != null) {
            this.ProxyHostList = new String[source.ProxyHostList.length];
            for (int i = 0; i < source.ProxyHostList.length; i++) {
                this.ProxyHostList[i] = new String(source.ProxyHostList[i]);
            }
        }
        if (source.SetHostList != null) {
            this.SetHostList = new String[source.SetHostList.length];
            for (int i = 0; i < source.SetHostList.length; i++) {
                this.SetHostList[i] = new String(source.SetHostList[i]);
            }
        }
        if (source.SetIdList != null) {
            this.SetIdList = new String[source.SetIdList.length];
            for (int i = 0; i < source.SetIdList.length; i++) {
                this.SetIdList[i] = new String(source.SetIdList[i]);
            }
        }
        if (source.MultiSql != null) {
            this.MultiSql = new String(source.MultiSql);
        }
        if (source.ExcludeMultiSql != null) {
            this.ExcludeMultiSql = new String(source.ExcludeMultiSql);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new String(source.SqlStartTime);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SqlType.", this.SqlType);
        this.setParamArraySimple(map, prefix + "ExecTime.", this.ExecTime);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "CpuTime.", this.CpuTime);
        this.setParamArraySimple(map, prefix + "LockWaitTime.", this.LockWaitTime);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "ThreadId.", this.ThreadId);
        this.setParamArraySimple(map, prefix + "ProxyHostList.", this.ProxyHostList);
        this.setParamArraySimple(map, prefix + "SetHostList.", this.SetHostList);
        this.setParamArraySimple(map, prefix + "SetIdList.", this.SetIdList);
        this.setParamSimple(map, prefix + "MultiSql", this.MultiSql);
        this.setParamSimple(map, prefix + "ExcludeMultiSql", this.ExcludeMultiSql);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);

    }
}

