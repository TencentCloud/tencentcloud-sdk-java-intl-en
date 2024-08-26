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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseRequest extends AbstractModel {

    /**
    * Resource ID, which is the TCHouse-D resource ID used for table creation.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * Query the data source where the database is located. If it is not filled in, the internal data source (internal) will be used by default.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * The database information to be queried. If this parameter and FilterDbName are not filled in, all database information of the current data source will be queried by default.
    */
    @SerializedName("DbNames")
    @Expose
    private String [] DbNames;

    /**
    * Display the filtered database information. For example, %infor indicates database names ending with infor. This parameter only supports scenarios where CatalogName is internal.
    */
    @SerializedName("FilterDbName")
    @Expose
    private String FilterDbName;

    /**
     * Get Resource ID, which is the TCHouse-D resource ID used for table creation. 
     * @return InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Resource ID, which is the TCHouse-D resource ID used for table creation.
     * @param InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Query the data source where the database is located. If it is not filled in, the internal data source (internal) will be used by default. 
     * @return CatalogName Query the data source where the database is located. If it is not filled in, the internal data source (internal) will be used by default.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Query the data source where the database is located. If it is not filled in, the internal data source (internal) will be used by default.
     * @param CatalogName Query the data source where the database is located. If it is not filled in, the internal data source (internal) will be used by default.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get The database information to be queried. If this parameter and FilterDbName are not filled in, all database information of the current data source will be queried by default. 
     * @return DbNames The database information to be queried. If this parameter and FilterDbName are not filled in, all database information of the current data source will be queried by default.
     */
    public String [] getDbNames() {
        return this.DbNames;
    }

    /**
     * Set The database information to be queried. If this parameter and FilterDbName are not filled in, all database information of the current data source will be queried by default.
     * @param DbNames The database information to be queried. If this parameter and FilterDbName are not filled in, all database information of the current data source will be queried by default.
     */
    public void setDbNames(String [] DbNames) {
        this.DbNames = DbNames;
    }

    /**
     * Get Display the filtered database information. For example, %infor indicates database names ending with infor. This parameter only supports scenarios where CatalogName is internal. 
     * @return FilterDbName Display the filtered database information. For example, %infor indicates database names ending with infor. This parameter only supports scenarios where CatalogName is internal.
     */
    public String getFilterDbName() {
        return this.FilterDbName;
    }

    /**
     * Set Display the filtered database information. For example, %infor indicates database names ending with infor. This parameter only supports scenarios where CatalogName is internal.
     * @param FilterDbName Display the filtered database information. For example, %infor indicates database names ending with infor. This parameter only supports scenarios where CatalogName is internal.
     */
    public void setFilterDbName(String FilterDbName) {
        this.FilterDbName = FilterDbName;
    }

    public DescribeDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseRequest(DescribeDatabaseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.DbNames != null) {
            this.DbNames = new String[source.DbNames.length];
            for (int i = 0; i < source.DbNames.length; i++) {
                this.DbNames[i] = new String(source.DbNames[i]);
            }
        }
        if (source.FilterDbName != null) {
            this.FilterDbName = new String(source.FilterDbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamArraySimple(map, prefix + "DbNames.", this.DbNames);
        this.setParamSimple(map, prefix + "FilterDbName", this.FilterDbName);

    }
}

