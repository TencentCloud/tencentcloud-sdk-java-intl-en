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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartPolicyBaseInfo extends AbstractModel {

    /**
    * User UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Catalog/Database/Table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * User AppID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get User UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Catalog/Database/Table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyType Catalog/Database/Table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Catalog/Database/Table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyType Catalog/Database/Table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Catalog name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog Catalog name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Table Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get User AppID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User AppID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User AppID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public SmartPolicyBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartPolicyBaseInfo(SmartPolicyBaseInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

