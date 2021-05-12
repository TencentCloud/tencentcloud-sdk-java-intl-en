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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDBInstancesRequest extends AbstractModel{

    /**
    * Instance ID set.
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * Instance admin account username.
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * Password corresponding to instance root account username.
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Instance character set. Valid values: UTF8, LATIN1.
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
     * Get Instance ID set. 
     * @return DBInstanceIdSet Instance ID set.
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set Instance ID set.
     * @param DBInstanceIdSet Instance ID set.
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get Instance admin account username. 
     * @return AdminName Instance admin account username.
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set Instance admin account username.
     * @param AdminName Instance admin account username.
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get Password corresponding to instance root account username. 
     * @return AdminPassword Password corresponding to instance root account username.
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Password corresponding to instance root account username.
     * @param AdminPassword Password corresponding to instance root account username.
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Instance character set. Valid values: UTF8, LATIN1. 
     * @return Charset Instance character set. Valid values: UTF8, LATIN1.
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Instance character set. Valid values: UTF8, LATIN1.
     * @param Charset Instance character set. Valid values: UTF8, LATIN1.
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    public InitDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitDBInstancesRequest(InitDBInstancesRequest source) {
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
            }
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Charset", this.Charset);

    }
}

