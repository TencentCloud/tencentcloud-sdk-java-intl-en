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

public class DeleteServerlessDBInstanceRequest extends AbstractModel{

    /**
    * Instance name. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * Instance ID. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
     * Get Instance name. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail. 
     * @return DBInstanceName Instance name. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     * @param DBInstanceName Instance name. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get Instance ID. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail. 
     * @return DBInstanceId Instance ID. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     * @param DBInstanceId Instance ID. Either instance name or instance ID (or both) must be passed in. If both are passed in, the instance ID will prevail.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    public DeleteServerlessDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServerlessDBInstanceRequest(DeleteServerlessDBInstanceRequest source) {
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);

    }
}

