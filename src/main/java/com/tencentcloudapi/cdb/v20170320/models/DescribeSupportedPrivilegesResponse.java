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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportedPrivilegesResponse extends AbstractModel {

    /**
    * Global permissions supported by the instance
    */
    @SerializedName("GlobalSupportedPrivileges")
    @Expose
    private String [] GlobalSupportedPrivileges;

    /**
    * Database permissions supported by the instance.
    */
    @SerializedName("DatabaseSupportedPrivileges")
    @Expose
    private String [] DatabaseSupportedPrivileges;

    /**
    * Table permissions supported by the instance.
    */
    @SerializedName("TableSupportedPrivileges")
    @Expose
    private String [] TableSupportedPrivileges;

    /**
    * Column permissions supported by the instance.
    */
    @SerializedName("ColumnSupportedPrivileges")
    @Expose
    private String [] ColumnSupportedPrivileges;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Global permissions supported by the instance 
     * @return GlobalSupportedPrivileges Global permissions supported by the instance
     */
    public String [] getGlobalSupportedPrivileges() {
        return this.GlobalSupportedPrivileges;
    }

    /**
     * Set Global permissions supported by the instance
     * @param GlobalSupportedPrivileges Global permissions supported by the instance
     */
    public void setGlobalSupportedPrivileges(String [] GlobalSupportedPrivileges) {
        this.GlobalSupportedPrivileges = GlobalSupportedPrivileges;
    }

    /**
     * Get Database permissions supported by the instance. 
     * @return DatabaseSupportedPrivileges Database permissions supported by the instance.
     */
    public String [] getDatabaseSupportedPrivileges() {
        return this.DatabaseSupportedPrivileges;
    }

    /**
     * Set Database permissions supported by the instance.
     * @param DatabaseSupportedPrivileges Database permissions supported by the instance.
     */
    public void setDatabaseSupportedPrivileges(String [] DatabaseSupportedPrivileges) {
        this.DatabaseSupportedPrivileges = DatabaseSupportedPrivileges;
    }

    /**
     * Get Table permissions supported by the instance. 
     * @return TableSupportedPrivileges Table permissions supported by the instance.
     */
    public String [] getTableSupportedPrivileges() {
        return this.TableSupportedPrivileges;
    }

    /**
     * Set Table permissions supported by the instance.
     * @param TableSupportedPrivileges Table permissions supported by the instance.
     */
    public void setTableSupportedPrivileges(String [] TableSupportedPrivileges) {
        this.TableSupportedPrivileges = TableSupportedPrivileges;
    }

    /**
     * Get Column permissions supported by the instance. 
     * @return ColumnSupportedPrivileges Column permissions supported by the instance.
     */
    public String [] getColumnSupportedPrivileges() {
        return this.ColumnSupportedPrivileges;
    }

    /**
     * Set Column permissions supported by the instance.
     * @param ColumnSupportedPrivileges Column permissions supported by the instance.
     */
    public void setColumnSupportedPrivileges(String [] ColumnSupportedPrivileges) {
        this.ColumnSupportedPrivileges = ColumnSupportedPrivileges;
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

    public DescribeSupportedPrivilegesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportedPrivilegesResponse(DescribeSupportedPrivilegesResponse source) {
        if (source.GlobalSupportedPrivileges != null) {
            this.GlobalSupportedPrivileges = new String[source.GlobalSupportedPrivileges.length];
            for (int i = 0; i < source.GlobalSupportedPrivileges.length; i++) {
                this.GlobalSupportedPrivileges[i] = new String(source.GlobalSupportedPrivileges[i]);
            }
        }
        if (source.DatabaseSupportedPrivileges != null) {
            this.DatabaseSupportedPrivileges = new String[source.DatabaseSupportedPrivileges.length];
            for (int i = 0; i < source.DatabaseSupportedPrivileges.length; i++) {
                this.DatabaseSupportedPrivileges[i] = new String(source.DatabaseSupportedPrivileges[i]);
            }
        }
        if (source.TableSupportedPrivileges != null) {
            this.TableSupportedPrivileges = new String[source.TableSupportedPrivileges.length];
            for (int i = 0; i < source.TableSupportedPrivileges.length; i++) {
                this.TableSupportedPrivileges[i] = new String(source.TableSupportedPrivileges[i]);
            }
        }
        if (source.ColumnSupportedPrivileges != null) {
            this.ColumnSupportedPrivileges = new String[source.ColumnSupportedPrivileges.length];
            for (int i = 0; i < source.ColumnSupportedPrivileges.length; i++) {
                this.ColumnSupportedPrivileges[i] = new String(source.ColumnSupportedPrivileges[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GlobalSupportedPrivileges.", this.GlobalSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "DatabaseSupportedPrivileges.", this.DatabaseSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "TableSupportedPrivileges.", this.TableSupportedPrivileges);
        this.setParamArraySimple(map, prefix + "ColumnSupportedPrivileges.", this.ColumnSupportedPrivileges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

