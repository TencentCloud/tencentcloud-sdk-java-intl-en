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

public class AuditProxyLogItem extends AbstractModel {

    /**
    * <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Cluster ID (dcdb/mariadb cluster identifier, same as InstanceId).</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Number of affected rows.</p>
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>Whether to autocommit. 1 means enabling, and 0 means disabling.</p>
    */
    @SerializedName("Autocommit")
    @Expose
    private String Autocommit;

    /**
    * <p>MySQL network protocol command types (such as COM_QUERY and COM_CONNECT).</p>
    */
    @SerializedName("ComType")
    @Expose
    private String ComType;

    /**
    * <p>Duration of creating a connection.</p>
    */
    @SerializedName("ConnTc")
    @Expose
    private Long ConnTc;

    /**
    * <p>Backend DB instance address (multiple entries are separated by commas).</p>
    */
    @SerializedName("DBHost")
    @Expose
    private String DBHost;

    /**
    * <p>Database name where the SQL is executed.</p>
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>Error code returned by SQL execution. 0 indicates success.</p>
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
    * <p>SQL execution time (µs).</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>Number of connections still occupied after request ends (typically 0 for non-transaction requests).</p>
    */
    @SerializedName("HoldConns")
    @Expose
    private String HoldConns;

    /**
    * <p>Client source IP.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Whether to enable global consistency read (0: no, 1: yes).</p>
    */
    @SerializedName("Mc")
    @Expose
    private String Mc;

    /**
    * <p>SQL start time (microsecond portion in microsecond precision).</p>
    */
    @SerializedName("SqlStartTimeUs")
    @Expose
    private Long SqlStartTimeUs;

    /**
    * <p>Number of connections created in the current request.</p>
    */
    @SerializedName("NewConnNum")
    @Expose
    private Long NewConnNum;

    /**
    * <p>Proxy node address.</p>
    */
    @SerializedName("ProxyHost")
    @Expose
    private String ProxyHost;

    /**
    * <p>Proxy ID.</p>
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>Query ID (used for join queries).</p>
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * <p>Number of rows returned (rows in the scanning result set).</p>
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * <p>Whether it is a query rewritten by Proxy: 0 original query, 1 rewritten query.</p>
    */
    @SerializedName("Splited")
    @Expose
    private Long Splited;

    /**
    * <p>Original executed SQL statement.</p>
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>SQL template.</p>
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * <p>SQL Template ID.</p>
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL type (for example, Select, Insert, Create, Login, Set).</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>Tables involved (separated by commas for multiple tables).</p>
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * <p>Thread ID.</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>SQL start time (millisecond-level timestamp).</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>Database username that executes the SQL.</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>HostPort of the client connection.</p>
    */
    @SerializedName("HostPort")
    @Expose
    private String HostPort;

    /**
    * <p>Proxy Node processing thread ID.</p>
    */
    @SerializedName("ProxyThread")
    @Expose
    private String ProxyThread;

    /**
    * <p>Number of backend DB hosts.</p>
    */
    @SerializedName("DbHostNum")
    @Expose
    private String DbHostNum;

    /**
    * <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>Business tag (completed post based on the business code).</p>
    */
    @SerializedName("BusinessTag")
    @Expose
    private String BusinessTag;

    /**
     * Get <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p> 
     * @return Timestamp <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     * @param Timestamp <p>Time point of SQL execution (format string, yyyy-MM-dd HH:mm:ss).</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Cluster ID (dcdb/mariadb cluster identifier, same as InstanceId).</p> 
     * @return ClusterId <p>Cluster ID (dcdb/mariadb cluster identifier, same as InstanceId).</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID (dcdb/mariadb cluster identifier, same as InstanceId).</p>
     * @param ClusterId <p>Cluster ID (dcdb/mariadb cluster identifier, same as InstanceId).</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Number of affected rows.</p> 
     * @return AffectRows <p>Number of affected rows.</p>
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>Number of affected rows.</p>
     * @param AffectRows <p>Number of affected rows.</p>
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>Whether to autocommit. 1 means enabling, and 0 means disabling.</p> 
     * @return Autocommit <p>Whether to autocommit. 1 means enabling, and 0 means disabling.</p>
     */
    public String getAutocommit() {
        return this.Autocommit;
    }

    /**
     * Set <p>Whether to autocommit. 1 means enabling, and 0 means disabling.</p>
     * @param Autocommit <p>Whether to autocommit. 1 means enabling, and 0 means disabling.</p>
     */
    public void setAutocommit(String Autocommit) {
        this.Autocommit = Autocommit;
    }

    /**
     * Get <p>MySQL network protocol command types (such as COM_QUERY and COM_CONNECT).</p> 
     * @return ComType <p>MySQL network protocol command types (such as COM_QUERY and COM_CONNECT).</p>
     */
    public String getComType() {
        return this.ComType;
    }

    /**
     * Set <p>MySQL network protocol command types (such as COM_QUERY and COM_CONNECT).</p>
     * @param ComType <p>MySQL network protocol command types (such as COM_QUERY and COM_CONNECT).</p>
     */
    public void setComType(String ComType) {
        this.ComType = ComType;
    }

    /**
     * Get <p>Duration of creating a connection.</p> 
     * @return ConnTc <p>Duration of creating a connection.</p>
     */
    public Long getConnTc() {
        return this.ConnTc;
    }

    /**
     * Set <p>Duration of creating a connection.</p>
     * @param ConnTc <p>Duration of creating a connection.</p>
     */
    public void setConnTc(Long ConnTc) {
        this.ConnTc = ConnTc;
    }

    /**
     * Get <p>Backend DB instance address (multiple entries are separated by commas).</p> 
     * @return DBHost <p>Backend DB instance address (multiple entries are separated by commas).</p>
     */
    public String getDBHost() {
        return this.DBHost;
    }

    /**
     * Set <p>Backend DB instance address (multiple entries are separated by commas).</p>
     * @param DBHost <p>Backend DB instance address (multiple entries are separated by commas).</p>
     */
    public void setDBHost(String DBHost) {
        this.DBHost = DBHost;
    }

    /**
     * Get <p>Database name where the SQL is executed.</p> 
     * @return DBName <p>Database name where the SQL is executed.</p>
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>Database name where the SQL is executed.</p>
     * @param DBName <p>Database name where the SQL is executed.</p>
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>Error code returned by SQL execution. 0 indicates success.</p> 
     * @return ErrCode <p>Error code returned by SQL execution. 0 indicates success.</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code returned by SQL execution. 0 indicates success.</p>
     * @param ErrCode <p>Error code returned by SQL execution. 0 indicates success.</p>
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
     * Get <p>SQL execution time (µs).</p> 
     * @return ExecTime <p>SQL execution time (µs).</p>
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>SQL execution time (µs).</p>
     * @param ExecTime <p>SQL execution time (µs).</p>
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>Number of connections still occupied after request ends (typically 0 for non-transaction requests).</p> 
     * @return HoldConns <p>Number of connections still occupied after request ends (typically 0 for non-transaction requests).</p>
     */
    public String getHoldConns() {
        return this.HoldConns;
    }

    /**
     * Set <p>Number of connections still occupied after request ends (typically 0 for non-transaction requests).</p>
     * @param HoldConns <p>Number of connections still occupied after request ends (typically 0 for non-transaction requests).</p>
     */
    public void setHoldConns(String HoldConns) {
        this.HoldConns = HoldConns;
    }

    /**
     * Get <p>Client source IP.</p> 
     * @return Host <p>Client source IP.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Client source IP.</p>
     * @param Host <p>Client source IP.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Whether to enable global consistency read (0: no, 1: yes).</p> 
     * @return Mc <p>Whether to enable global consistency read (0: no, 1: yes).</p>
     */
    public String getMc() {
        return this.Mc;
    }

    /**
     * Set <p>Whether to enable global consistency read (0: no, 1: yes).</p>
     * @param Mc <p>Whether to enable global consistency read (0: no, 1: yes).</p>
     */
    public void setMc(String Mc) {
        this.Mc = Mc;
    }

    /**
     * Get <p>SQL start time (microsecond portion in microsecond precision).</p> 
     * @return SqlStartTimeUs <p>SQL start time (microsecond portion in microsecond precision).</p>
     */
    public Long getSqlStartTimeUs() {
        return this.SqlStartTimeUs;
    }

    /**
     * Set <p>SQL start time (microsecond portion in microsecond precision).</p>
     * @param SqlStartTimeUs <p>SQL start time (microsecond portion in microsecond precision).</p>
     */
    public void setSqlStartTimeUs(Long SqlStartTimeUs) {
        this.SqlStartTimeUs = SqlStartTimeUs;
    }

    /**
     * Get <p>Number of connections created in the current request.</p> 
     * @return NewConnNum <p>Number of connections created in the current request.</p>
     */
    public Long getNewConnNum() {
        return this.NewConnNum;
    }

    /**
     * Set <p>Number of connections created in the current request.</p>
     * @param NewConnNum <p>Number of connections created in the current request.</p>
     */
    public void setNewConnNum(Long NewConnNum) {
        this.NewConnNum = NewConnNum;
    }

    /**
     * Get <p>Proxy node address.</p> 
     * @return ProxyHost <p>Proxy node address.</p>
     */
    public String getProxyHost() {
        return this.ProxyHost;
    }

    /**
     * Set <p>Proxy node address.</p>
     * @param ProxyHost <p>Proxy node address.</p>
     */
    public void setProxyHost(String ProxyHost) {
        this.ProxyHost = ProxyHost;
    }

    /**
     * Get <p>Proxy ID.</p> 
     * @return ProxyId <p>Proxy ID.</p>
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>Proxy ID.</p>
     * @param ProxyId <p>Proxy ID.</p>
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>Query ID (used for join queries).</p> 
     * @return QueryId <p>Query ID (used for join queries).</p>
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>Query ID (used for join queries).</p>
     * @param QueryId <p>Query ID (used for join queries).</p>
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get <p>Number of rows returned (rows in the scanning result set).</p> 
     * @return SentRows <p>Number of rows returned (rows in the scanning result set).</p>
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set <p>Number of rows returned (rows in the scanning result set).</p>
     * @param SentRows <p>Number of rows returned (rows in the scanning result set).</p>
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get <p>Whether it is a query rewritten by Proxy: 0 original query, 1 rewritten query.</p> 
     * @return Splited <p>Whether it is a query rewritten by Proxy: 0 original query, 1 rewritten query.</p>
     */
    public Long getSplited() {
        return this.Splited;
    }

    /**
     * Set <p>Whether it is a query rewritten by Proxy: 0 original query, 1 rewritten query.</p>
     * @param Splited <p>Whether it is a query rewritten by Proxy: 0 original query, 1 rewritten query.</p>
     */
    public void setSplited(Long Splited) {
        this.Splited = Splited;
    }

    /**
     * Get <p>Original executed SQL statement.</p> 
     * @return Sql <p>Original executed SQL statement.</p>
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>Original executed SQL statement.</p>
     * @param Sql <p>Original executed SQL statement.</p>
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>SQL template.</p> 
     * @return SqlTemplate <p>SQL template.</p>
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set <p>SQL template.</p>
     * @param SqlTemplate <p>SQL template.</p>
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
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
     * Get <p>SQL type (for example, Select, Insert, Create, Login, Set).</p> 
     * @return SqlType <p>SQL type (for example, Select, Insert, Create, Login, Set).</p>
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL type (for example, Select, Insert, Create, Login, Set).</p>
     * @param SqlType <p>SQL type (for example, Select, Insert, Create, Login, Set).</p>
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>Tables involved (separated by commas for multiple tables).</p> 
     * @return Tables <p>Tables involved (separated by commas for multiple tables).</p>
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set <p>Tables involved (separated by commas for multiple tables).</p>
     * @param Tables <p>Tables involved (separated by commas for multiple tables).</p>
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>Thread ID.</p> 
     * @return ThreadId <p>Thread ID.</p>
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>Thread ID.</p>
     * @param ThreadId <p>Thread ID.</p>
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>SQL start time (millisecond-level timestamp).</p> 
     * @return SqlStartTime <p>SQL start time (millisecond-level timestamp).</p>
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL start time (millisecond-level timestamp).</p>
     * @param SqlStartTime <p>SQL start time (millisecond-level timestamp).</p>
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>Database username that executes the SQL.</p> 
     * @return User <p>Database username that executes the SQL.</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>Database username that executes the SQL.</p>
     * @param User <p>Database username that executes the SQL.</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>HostPort of the client connection.</p> 
     * @return HostPort <p>HostPort of the client connection.</p>
     */
    public String getHostPort() {
        return this.HostPort;
    }

    /**
     * Set <p>HostPort of the client connection.</p>
     * @param HostPort <p>HostPort of the client connection.</p>
     */
    public void setHostPort(String HostPort) {
        this.HostPort = HostPort;
    }

    /**
     * Get <p>Proxy Node processing thread ID.</p> 
     * @return ProxyThread <p>Proxy Node processing thread ID.</p>
     */
    public String getProxyThread() {
        return this.ProxyThread;
    }

    /**
     * Set <p>Proxy Node processing thread ID.</p>
     * @param ProxyThread <p>Proxy Node processing thread ID.</p>
     */
    public void setProxyThread(String ProxyThread) {
        this.ProxyThread = ProxyThread;
    }

    /**
     * Get <p>Number of backend DB hosts.</p> 
     * @return DbHostNum <p>Number of backend DB hosts.</p>
     */
    public String getDbHostNum() {
        return this.DbHostNum;
    }

    /**
     * Set <p>Number of backend DB hosts.</p>
     * @param DbHostNum <p>Number of backend DB hosts.</p>
     */
    public void setDbHostNum(String DbHostNum) {
        this.DbHostNum = DbHostNum;
    }

    /**
     * Get <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p> 
     * @return BusinessCode <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     * @param BusinessCode <p>Business code (extracted from i/o/p and other KV in business-side SQL annotations).</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>Business tag (completed post based on the business code).</p> 
     * @return BusinessTag <p>Business tag (completed post based on the business code).</p>
     */
    public String getBusinessTag() {
        return this.BusinessTag;
    }

    /**
     * Set <p>Business tag (completed post based on the business code).</p>
     * @param BusinessTag <p>Business tag (completed post based on the business code).</p>
     */
    public void setBusinessTag(String BusinessTag) {
        this.BusinessTag = BusinessTag;
    }

    public AuditProxyLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditProxyLogItem(AuditProxyLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Autocommit != null) {
            this.Autocommit = new String(source.Autocommit);
        }
        if (source.ComType != null) {
            this.ComType = new String(source.ComType);
        }
        if (source.ConnTc != null) {
            this.ConnTc = new Long(source.ConnTc);
        }
        if (source.DBHost != null) {
            this.DBHost = new String(source.DBHost);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.HoldConns != null) {
            this.HoldConns = new String(source.HoldConns);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Mc != null) {
            this.Mc = new String(source.Mc);
        }
        if (source.SqlStartTimeUs != null) {
            this.SqlStartTimeUs = new Long(source.SqlStartTimeUs);
        }
        if (source.NewConnNum != null) {
            this.NewConnNum = new Long(source.NewConnNum);
        }
        if (source.ProxyHost != null) {
            this.ProxyHost = new String(source.ProxyHost);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.Splited != null) {
            this.Splited = new Long(source.Splited);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.HostPort != null) {
            this.HostPort = new String(source.HostPort);
        }
        if (source.ProxyThread != null) {
            this.ProxyThread = new String(source.ProxyThread);
        }
        if (source.DbHostNum != null) {
            this.DbHostNum = new String(source.DbHostNum);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessTag != null) {
            this.BusinessTag = new String(source.BusinessTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "Autocommit", this.Autocommit);
        this.setParamSimple(map, prefix + "ComType", this.ComType);
        this.setParamSimple(map, prefix + "ConnTc", this.ConnTc);
        this.setParamSimple(map, prefix + "DBHost", this.DBHost);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "HoldConns", this.HoldConns);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Mc", this.Mc);
        this.setParamSimple(map, prefix + "SqlStartTimeUs", this.SqlStartTimeUs);
        this.setParamSimple(map, prefix + "NewConnNum", this.NewConnNum);
        this.setParamSimple(map, prefix + "ProxyHost", this.ProxyHost);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "Splited", this.Splited);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "HostPort", this.HostPort);
        this.setParamSimple(map, prefix + "ProxyThread", this.ProxyThread);
        this.setParamSimple(map, prefix + "DbHostNum", this.DbHostNum);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessTag", this.BusinessTag);

    }
}

