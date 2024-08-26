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

public class RecoverBackUpJobRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task ID
    */
    @SerializedName("BackUpJobId")
    @Expose
    private Long BackUpJobId;

    /**
    * Number of new table replicas recovered
    */
    @SerializedName("ReplicationNum")
    @Expose
    private Long ReplicationNum;

    /**
    * Whether to retain the configuration in the source table during recovery. 1 indicates that the configurations in the source table are retained.
    */
    @SerializedName("ReserveSourceConfig")
    @Expose
    private Long ReserveSourceConfig;

    /**
    * 0: default; 1: cos recovery
    */
    @SerializedName("RecoverType")
    @Expose
    private Long RecoverType;

    /**
    * CosSourceInfo object
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private CosSourceInfo CosSourceInfo;

    /**
    * 0: default; 1: regular execution
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * YY-MM-DD Hour : Minute : Second
    */
    @SerializedName("NextTime")
    @Expose
    private String NextTime;

    /**
    * Scheduling name
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * create update
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Recovery granularity: All, Database, and Table
    */
    @SerializedName("RecoverScope")
    @Expose
    private String RecoverScope;

    /**
    * Recover database: If you back up by database, this field is required. Use commas to separate databases.
    */
    @SerializedName("RecoverDatabase")
    @Expose
    private String RecoverDatabase;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Task ID 
     * @return BackUpJobId Task ID
     */
    public Long getBackUpJobId() {
        return this.BackUpJobId;
    }

    /**
     * Set Task ID
     * @param BackUpJobId Task ID
     */
    public void setBackUpJobId(Long BackUpJobId) {
        this.BackUpJobId = BackUpJobId;
    }

    /**
     * Get Number of new table replicas recovered 
     * @return ReplicationNum Number of new table replicas recovered
     */
    public Long getReplicationNum() {
        return this.ReplicationNum;
    }

    /**
     * Set Number of new table replicas recovered
     * @param ReplicationNum Number of new table replicas recovered
     */
    public void setReplicationNum(Long ReplicationNum) {
        this.ReplicationNum = ReplicationNum;
    }

    /**
     * Get Whether to retain the configuration in the source table during recovery. 1 indicates that the configurations in the source table are retained. 
     * @return ReserveSourceConfig Whether to retain the configuration in the source table during recovery. 1 indicates that the configurations in the source table are retained.
     */
    public Long getReserveSourceConfig() {
        return this.ReserveSourceConfig;
    }

    /**
     * Set Whether to retain the configuration in the source table during recovery. 1 indicates that the configurations in the source table are retained.
     * @param ReserveSourceConfig Whether to retain the configuration in the source table during recovery. 1 indicates that the configurations in the source table are retained.
     */
    public void setReserveSourceConfig(Long ReserveSourceConfig) {
        this.ReserveSourceConfig = ReserveSourceConfig;
    }

    /**
     * Get 0: default; 1: cos recovery 
     * @return RecoverType 0: default; 1: cos recovery
     */
    public Long getRecoverType() {
        return this.RecoverType;
    }

    /**
     * Set 0: default; 1: cos recovery
     * @param RecoverType 0: default; 1: cos recovery
     */
    public void setRecoverType(Long RecoverType) {
        this.RecoverType = RecoverType;
    }

    /**
     * Get CosSourceInfo object 
     * @return CosSourceInfo CosSourceInfo object
     */
    public CosSourceInfo getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set CosSourceInfo object
     * @param CosSourceInfo CosSourceInfo object
     */
    public void setCosSourceInfo(CosSourceInfo CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    /**
     * Get 0: default; 1: regular execution 
     * @return ScheduleType 0: default; 1: regular execution
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 0: default; 1: regular execution
     * @param ScheduleType 0: default; 1: regular execution
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get YY-MM-DD Hour : Minute : Second 
     * @return NextTime YY-MM-DD Hour : Minute : Second
     */
    public String getNextTime() {
        return this.NextTime;
    }

    /**
     * Set YY-MM-DD Hour : Minute : Second
     * @param NextTime YY-MM-DD Hour : Minute : Second
     */
    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    /**
     * Get Scheduling name 
     * @return ScheduleName Scheduling name
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set Scheduling name
     * @param ScheduleName Scheduling name
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get create update 
     * @return OperationType create update
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set create update
     * @param OperationType create update
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Recovery granularity: All, Database, and Table 
     * @return RecoverScope Recovery granularity: All, Database, and Table
     */
    public String getRecoverScope() {
        return this.RecoverScope;
    }

    /**
     * Set Recovery granularity: All, Database, and Table
     * @param RecoverScope Recovery granularity: All, Database, and Table
     */
    public void setRecoverScope(String RecoverScope) {
        this.RecoverScope = RecoverScope;
    }

    /**
     * Get Recover database: If you back up by database, this field is required. Use commas to separate databases. 
     * @return RecoverDatabase Recover database: If you back up by database, this field is required. Use commas to separate databases.
     */
    public String getRecoverDatabase() {
        return this.RecoverDatabase;
    }

    /**
     * Set Recover database: If you back up by database, this field is required. Use commas to separate databases.
     * @param RecoverDatabase Recover database: If you back up by database, this field is required. Use commas to separate databases.
     */
    public void setRecoverDatabase(String RecoverDatabase) {
        this.RecoverDatabase = RecoverDatabase;
    }

    public RecoverBackUpJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecoverBackUpJobRequest(RecoverBackUpJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackUpJobId != null) {
            this.BackUpJobId = new Long(source.BackUpJobId);
        }
        if (source.ReplicationNum != null) {
            this.ReplicationNum = new Long(source.ReplicationNum);
        }
        if (source.ReserveSourceConfig != null) {
            this.ReserveSourceConfig = new Long(source.ReserveSourceConfig);
        }
        if (source.RecoverType != null) {
            this.RecoverType = new Long(source.RecoverType);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new CosSourceInfo(source.CosSourceInfo);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.NextTime != null) {
            this.NextTime = new String(source.NextTime);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.RecoverScope != null) {
            this.RecoverScope = new String(source.RecoverScope);
        }
        if (source.RecoverDatabase != null) {
            this.RecoverDatabase = new String(source.RecoverDatabase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackUpJobId", this.BackUpJobId);
        this.setParamSimple(map, prefix + "ReplicationNum", this.ReplicationNum);
        this.setParamSimple(map, prefix + "ReserveSourceConfig", this.ReserveSourceConfig);
        this.setParamSimple(map, prefix + "RecoverType", this.RecoverType);
        this.setParamObj(map, prefix + "CosSourceInfo.", this.CosSourceInfo);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "NextTime", this.NextTime);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "RecoverScope", this.RecoverScope);
        this.setParamSimple(map, prefix + "RecoverDatabase", this.RecoverDatabase);

    }
}

