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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSlowQueriesRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Earliest transaction start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Latest transaction start time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Limit.</p><p>It is recommended to control the limit size. Large limits may cause truncation due to the platform's size limit for return results.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Username.</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Client host.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Database name.</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Sorting field.</p><p>Enumeration values:</p><ul><li>QueryTime: sorts by the total execution time of the SQL statements.</li><li>LockTime: sorts by the time consumed by the SQL statements waiting for locks (such as table locks or row locks).</li><li>RowsExamined: sorts by the number of rows scanned during SQL statement execution.</li><li>RowsSent: sorts by the number of result rows returned to the client for the SQL statements.</li><li>Timestamp: sorts by the timestamp when the slow query statement occurs.</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting type. Valid values: asc and desc.</p>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * <p>SQL statement.</p>
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Earliest transaction start time.</p> 
     * @return StartTime <p>Earliest transaction start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Earliest transaction start time.</p>
     * @param StartTime <p>Earliest transaction start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Latest transaction start time.</p> 
     * @return EndTime <p>Latest transaction start time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Latest transaction start time.</p>
     * @param EndTime <p>Latest transaction start time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Limit.</p><p>It is recommended to control the limit size. Large limits may cause truncation due to the platform's size limit for return results.</p> 
     * @return Limit <p>Limit.</p><p>It is recommended to control the limit size. Large limits may cause truncation due to the platform's size limit for return results.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit.</p><p>It is recommended to control the limit size. Large limits may cause truncation due to the platform's size limit for return results.</p>
     * @param Limit <p>Limit.</p><p>It is recommended to control the limit size. Large limits may cause truncation due to the platform's size limit for return results.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Username.</p> 
     * @return Username <p>Username.</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Username.</p>
     * @param Username <p>Username.</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Client host.</p> 
     * @return Host <p>Client host.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Client host.</p>
     * @param Host <p>Client host.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Database name.</p> 
     * @return Database <p>Database name.</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Database name.</p>
     * @param Database <p>Database name.</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Sorting field.</p><p>Enumeration values:</p><ul><li>QueryTime: sorts by the total execution time of the SQL statements.</li><li>LockTime: sorts by the time consumed by the SQL statements waiting for locks (such as table locks or row locks).</li><li>RowsExamined: sorts by the number of rows scanned during SQL statement execution.</li><li>RowsSent: sorts by the number of result rows returned to the client for the SQL statements.</li><li>Timestamp: sorts by the timestamp when the slow query statement occurs.</li></ul> 
     * @return OrderBy <p>Sorting field.</p><p>Enumeration values:</p><ul><li>QueryTime: sorts by the total execution time of the SQL statements.</li><li>LockTime: sorts by the time consumed by the SQL statements waiting for locks (such as table locks or row locks).</li><li>RowsExamined: sorts by the number of rows scanned during SQL statement execution.</li><li>RowsSent: sorts by the number of result rows returned to the client for the SQL statements.</li><li>Timestamp: sorts by the timestamp when the slow query statement occurs.</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field.</p><p>Enumeration values:</p><ul><li>QueryTime: sorts by the total execution time of the SQL statements.</li><li>LockTime: sorts by the time consumed by the SQL statements waiting for locks (such as table locks or row locks).</li><li>RowsExamined: sorts by the number of rows scanned during SQL statement execution.</li><li>RowsSent: sorts by the number of result rows returned to the client for the SQL statements.</li><li>Timestamp: sorts by the timestamp when the slow query statement occurs.</li></ul>
     * @param OrderBy <p>Sorting field.</p><p>Enumeration values:</p><ul><li>QueryTime: sorts by the total execution time of the SQL statements.</li><li>LockTime: sorts by the time consumed by the SQL statements waiting for locks (such as table locks or row locks).</li><li>RowsExamined: sorts by the number of rows scanned during SQL statement execution.</li><li>RowsSent: sorts by the number of result rows returned to the client for the SQL statements.</li><li>Timestamp: sorts by the timestamp when the slow query statement occurs.</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting type. Valid values: asc and desc.</p> 
     * @return OrderByType <p>Sorting type. Valid values: asc and desc.</p>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>Sorting type. Valid values: asc and desc.</p>
     * @param OrderByType <p>Sorting type. Valid values: asc and desc.</p>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>SQL statement.</p> 
     * @return SqlText <p>SQL statement.</p>
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>SQL statement.</p>
     * @param SqlText <p>SQL statement.</p>
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    public DescribeInstanceSlowQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSlowQueriesRequest(DescribeInstanceSlowQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);

    }
}

