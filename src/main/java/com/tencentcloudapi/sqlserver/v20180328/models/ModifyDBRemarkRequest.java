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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBRemarkRequest extends AbstractModel{

    /**
    * Instance ID in the format of mssql-rljoi3bf
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Array of database names and remarks, where each element contains a database name and the corresponding remarks
    */
    @SerializedName("DBRemarks")
    @Expose
    private DBRemark [] DBRemarks;

    /**
     * Get Instance ID in the format of mssql-rljoi3bf 
     * @return InstanceId Instance ID in the format of mssql-rljoi3bf
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-rljoi3bf
     * @param InstanceId Instance ID in the format of mssql-rljoi3bf
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Array of database names and remarks, where each element contains a database name and the corresponding remarks 
     * @return DBRemarks Array of database names and remarks, where each element contains a database name and the corresponding remarks
     */
    public DBRemark [] getDBRemarks() {
        return this.DBRemarks;
    }

    /**
     * Set Array of database names and remarks, where each element contains a database name and the corresponding remarks
     * @param DBRemarks Array of database names and remarks, where each element contains a database name and the corresponding remarks
     */
    public void setDBRemarks(DBRemark [] DBRemarks) {
        this.DBRemarks = DBRemarks;
    }

    public ModifyDBRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBRemarkRequest(ModifyDBRemarkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DBRemarks != null) {
            this.DBRemarks = new DBRemark[source.DBRemarks.length];
            for (int i = 0; i < source.DBRemarks.length; i++) {
                this.DBRemarks[i] = new DBRemark(source.DBRemarks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DBRemarks.", this.DBRemarks);

    }
}

