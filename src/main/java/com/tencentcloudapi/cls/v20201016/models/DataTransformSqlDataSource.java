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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTransformSqlDataSource extends AbstractModel {

    /**
    * Data source type 1: MySql; 2: Self-built MySql; 3: PostgreSQL
    */
    @SerializedName("DataSource")
    @Expose
    private Long DataSource;

    /**
    * Region of the InstanceId. For example: ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance ID.
-When DataSource is 1, it means the id of a cloud database Mysql Instance, such as cdb-zxcvbnm.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * mysql access username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Alias. For use in data processing statement.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * mysql access password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Data source type 1: MySql; 2: Self-built MySql; 3: PostgreSQL 
     * @return DataSource Data source type 1: MySql; 2: Self-built MySql; 3: PostgreSQL
     */
    public Long getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source type 1: MySql; 2: Self-built MySql; 3: PostgreSQL
     * @param DataSource Data source type 1: MySql; 2: Self-built MySql; 3: PostgreSQL
     */
    public void setDataSource(Long DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get Region of the InstanceId. For example: ap-guangzhou 
     * @return Region Region of the InstanceId. For example: ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the InstanceId. For example: ap-guangzhou
     * @param Region Region of the InstanceId. For example: ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance ID.
-When DataSource is 1, it means the id of a cloud database Mysql Instance, such as cdb-zxcvbnm.
 
     * @return InstanceId Instance ID.
-When DataSource is 1, it means the id of a cloud database Mysql Instance, such as cdb-zxcvbnm.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
-When DataSource is 1, it means the id of a cloud database Mysql Instance, such as cdb-zxcvbnm.

     * @param InstanceId Instance ID.
-When DataSource is 1, it means the id of a cloud database Mysql Instance, such as cdb-zxcvbnm.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get mysql access username 
     * @return User mysql access username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set mysql access username
     * @param User mysql access username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Alias. For use in data processing statement. 
     * @return AliasName Alias. For use in data processing statement.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Alias. For use in data processing statement.
     * @param AliasName Alias. For use in data processing statement.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get mysql access password. 
     * @return Password mysql access password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set mysql access password.
     * @param Password mysql access password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DataTransformSqlDataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformSqlDataSource(DataTransformSqlDataSource source) {
        if (source.DataSource != null) {
            this.DataSource = new Long(source.DataSource);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

