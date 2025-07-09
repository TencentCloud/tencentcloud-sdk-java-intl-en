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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryTableDataRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Array of fields to be queried
    */
    @SerializedName("SelectedFields")
    @Expose
    private String [] SelectedFields;

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of records per page, which is 10 by default.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Catalog name, defaults to 'internal' if not specified.

    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table name 
     * @return Table Table name
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
     * @param Table Table name
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get InstanceId 
     * @return InstanceId InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId
     * @param InstanceId InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Array of fields to be queried 
     * @return SelectedFields Array of fields to be queried
     */
    public String [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set Array of fields to be queried
     * @param SelectedFields Array of fields to be queried
     */
    public void setSelectedFields(String [] SelectedFields) {
        this.SelectedFields = SelectedFields;
    }

    /**
     * Get Page number, which is 1 by default. 
     * @return PageNum Page number, which is 1 by default.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNum Page number, which is 1 by default.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of records per page, which is 10 by default. 
     * @return PageSize Number of records per page, which is 10 by default.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page, which is 10 by default.
     * @param PageSize Number of records per page, which is 10 by default.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Catalog name, defaults to 'internal' if not specified.
 
     * @return CatalogName Catalog name, defaults to 'internal' if not specified.

     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Catalog name, defaults to 'internal' if not specified.

     * @param CatalogName Catalog name, defaults to 'internal' if not specified.

     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public QueryTableDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTableDataRequest(QueryTableDataRequest source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SelectedFields != null) {
            this.SelectedFields = new String[source.SelectedFields.length];
            for (int i = 0; i < source.SelectedFields.length; i++) {
                this.SelectedFields[i] = new String(source.SelectedFields[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SelectedFields.", this.SelectedFields);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

