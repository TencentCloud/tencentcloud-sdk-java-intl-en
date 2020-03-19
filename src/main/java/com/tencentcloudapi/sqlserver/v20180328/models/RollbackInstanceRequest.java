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

public class RollbackInstanceRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Rollback type. 0: the database rolled back overwrites the original database; 1: the database rolled back is renamed and does not overwrite the original database
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Database to be rolled back
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * Target time point for rollback
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Rollback type. 0: the database rolled back overwrites the original database; 1: the database rolled back is renamed and does not overwrite the original database 
     * @return Type Rollback type. 0: the database rolled back overwrites the original database; 1: the database rolled back is renamed and does not overwrite the original database
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Rollback type. 0: the database rolled back overwrites the original database; 1: the database rolled back is renamed and does not overwrite the original database
     * @param Type Rollback type. 0: the database rolled back overwrites the original database; 1: the database rolled back is renamed and does not overwrite the original database
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Database to be rolled back 
     * @return DBs Database to be rolled back
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set Database to be rolled back
     * @param DBs Database to be rolled back
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get Target time point for rollback 
     * @return Time Target time point for rollback
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Target time point for rollback
     * @param Time Target time point for rollback
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

