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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataCheckStat extends AbstractModel {

    /**
    * Total Tables
    */
    @SerializedName("TableTotal")
    @Expose
    private Long TableTotal;

    /**
    * Total Number of Fields
    */
    @SerializedName("ColumnTotal")
    @Expose
    private Long ColumnTotal;

    /**
    * Number of Table Configuration Checks
    */
    @SerializedName("TableConfig")
    @Expose
    private Long TableConfig;

    /**
    * Number of Field Configuration Checks
    */
    @SerializedName("ColumnConfig")
    @Expose
    private Long ColumnConfig;

    /**
    * Actual Number of Table Checks
    */
    @SerializedName("TableExec")
    @Expose
    private Long TableExec;

    /**
    * Actual Number of Field Checks
    */
    @SerializedName("ColumnExec")
    @Expose
    private Long ColumnExec;

    /**
     * Get Total Tables 
     * @return TableTotal Total Tables
     */
    public Long getTableTotal() {
        return this.TableTotal;
    }

    /**
     * Set Total Tables
     * @param TableTotal Total Tables
     */
    public void setTableTotal(Long TableTotal) {
        this.TableTotal = TableTotal;
    }

    /**
     * Get Total Number of Fields 
     * @return ColumnTotal Total Number of Fields
     */
    public Long getColumnTotal() {
        return this.ColumnTotal;
    }

    /**
     * Set Total Number of Fields
     * @param ColumnTotal Total Number of Fields
     */
    public void setColumnTotal(Long ColumnTotal) {
        this.ColumnTotal = ColumnTotal;
    }

    /**
     * Get Number of Table Configuration Checks 
     * @return TableConfig Number of Table Configuration Checks
     */
    public Long getTableConfig() {
        return this.TableConfig;
    }

    /**
     * Set Number of Table Configuration Checks
     * @param TableConfig Number of Table Configuration Checks
     */
    public void setTableConfig(Long TableConfig) {
        this.TableConfig = TableConfig;
    }

    /**
     * Get Number of Field Configuration Checks 
     * @return ColumnConfig Number of Field Configuration Checks
     */
    public Long getColumnConfig() {
        return this.ColumnConfig;
    }

    /**
     * Set Number of Field Configuration Checks
     * @param ColumnConfig Number of Field Configuration Checks
     */
    public void setColumnConfig(Long ColumnConfig) {
        this.ColumnConfig = ColumnConfig;
    }

    /**
     * Get Actual Number of Table Checks 
     * @return TableExec Actual Number of Table Checks
     */
    public Long getTableExec() {
        return this.TableExec;
    }

    /**
     * Set Actual Number of Table Checks
     * @param TableExec Actual Number of Table Checks
     */
    public void setTableExec(Long TableExec) {
        this.TableExec = TableExec;
    }

    /**
     * Get Actual Number of Field Checks 
     * @return ColumnExec Actual Number of Field Checks
     */
    public Long getColumnExec() {
        return this.ColumnExec;
    }

    /**
     * Set Actual Number of Field Checks
     * @param ColumnExec Actual Number of Field Checks
     */
    public void setColumnExec(Long ColumnExec) {
        this.ColumnExec = ColumnExec;
    }

    public DataCheckStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataCheckStat(DataCheckStat source) {
        if (source.TableTotal != null) {
            this.TableTotal = new Long(source.TableTotal);
        }
        if (source.ColumnTotal != null) {
            this.ColumnTotal = new Long(source.ColumnTotal);
        }
        if (source.TableConfig != null) {
            this.TableConfig = new Long(source.TableConfig);
        }
        if (source.ColumnConfig != null) {
            this.ColumnConfig = new Long(source.ColumnConfig);
        }
        if (source.TableExec != null) {
            this.TableExec = new Long(source.TableExec);
        }
        if (source.ColumnExec != null) {
            this.ColumnExec = new Long(source.ColumnExec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableTotal", this.TableTotal);
        this.setParamSimple(map, prefix + "ColumnTotal", this.ColumnTotal);
        this.setParamSimple(map, prefix + "TableConfig", this.TableConfig);
        this.setParamSimple(map, prefix + "ColumnConfig", this.ColumnConfig);
        this.setParamSimple(map, prefix + "TableExec", this.TableExec);
        this.setParamSimple(map, prefix + "ColumnExec", this.ColumnExec);

    }
}

