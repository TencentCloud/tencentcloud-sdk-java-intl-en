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

public class DescribeCreateTablesDDLRequest extends AbstractModel {

    /**
    * Resource ID, TCHouse-D resource ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Require the database and table for the table creation DDL.
    */
    @SerializedName("DbTablesInfos")
    @Expose
    private DbTablesInfo [] DbTablesInfos;

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
    * Whether to hide partition information
    */
    @SerializedName("IsBrief")
    @Expose
    private Boolean IsBrief;

    /**
     * Get Resource ID, TCHouse-D resource ID. 
     * @return InstanceId Resource ID, TCHouse-D resource ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Resource ID, TCHouse-D resource ID.
     * @param InstanceId Resource ID, TCHouse-D resource ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Require the database and table for the table creation DDL. 
     * @return DbTablesInfos Require the database and table for the table creation DDL.
     */
    public DbTablesInfo [] getDbTablesInfos() {
        return this.DbTablesInfos;
    }

    /**
     * Set Require the database and table for the table creation DDL.
     * @param DbTablesInfos Require the database and table for the table creation DDL.
     */
    public void setDbTablesInfos(DbTablesInfo [] DbTablesInfos) {
        this.DbTablesInfos = DbTablesInfos;
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
     * Get Whether to hide partition information 
     * @return IsBrief Whether to hide partition information
     */
    public Boolean getIsBrief() {
        return this.IsBrief;
    }

    /**
     * Set Whether to hide partition information
     * @param IsBrief Whether to hide partition information
     */
    public void setIsBrief(Boolean IsBrief) {
        this.IsBrief = IsBrief;
    }

    public DescribeCreateTablesDDLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreateTablesDDLRequest(DescribeCreateTablesDDLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbTablesInfos != null) {
            this.DbTablesInfos = new DbTablesInfo[source.DbTablesInfos.length];
            for (int i = 0; i < source.DbTablesInfos.length; i++) {
                this.DbTablesInfos[i] = new DbTablesInfo(source.DbTablesInfos[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.IsBrief != null) {
            this.IsBrief = new Boolean(source.IsBrief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DbTablesInfos.", this.DbTablesInfos);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "IsBrief", this.IsBrief);

    }
}

