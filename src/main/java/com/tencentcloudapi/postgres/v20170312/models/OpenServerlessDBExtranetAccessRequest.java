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

public class OpenServerlessDBExtranetAccessRequest extends AbstractModel{

    /**
    * Unique ID of an instance
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance name
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
     * Get Unique ID of an instance 
     * @return DBInstanceId Unique ID of an instance
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Unique ID of an instance
     * @param DBInstanceId Unique ID of an instance
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance name 
     * @return DBInstanceName Instance name
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name
     * @param DBInstanceName Instance name
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);

    }
}

