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

public class DescribeTableRequest extends AbstractModel {

    /**
    * Resource ID, which is the TCHouse-D resource ID used for table creation.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of database where the table is located
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name (Currently only internal tables are supported.)
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

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
     * Get Name of database where the table is located 
     * @return DbName Name of database where the table is located
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Name of database where the table is located
     * @param DbName Name of database where the table is located
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name (Currently only internal tables are supported.) 
     * @return TableName Table name (Currently only internal tables are supported.)
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name (Currently only internal tables are supported.)
     * @param TableName Table name (Currently only internal tables are supported.)
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
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

    public DescribeTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableRequest(DescribeTableRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);

    }
}

