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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegeByDBRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-njj2mtpl7.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database name.
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * Database account name.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number in pagination mode. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID, in the format of mssql-njj2mtpl7. 
     * @return InstanceId Instance ID, in the format of mssql-njj2mtpl7.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-njj2mtpl7.
     * @param InstanceId Instance ID, in the format of mssql-njj2mtpl7.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database name. 
     * @return DBName Database name.
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set Database name.
     * @param DBName Database name.
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get Database account name. 
     * @return AccountName Database account name.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Database account name.
     * @param AccountName Database account name.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20. 
     * @return Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     * @param Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number in pagination mode. The default value is 0. 
     * @return Offset Page number in pagination mode. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number in pagination mode. The default value is 0.
     * @param Offset Page number in pagination mode. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAccountPrivilegeByDBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegeByDBRequest(DescribeAccountPrivilegeByDBRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

