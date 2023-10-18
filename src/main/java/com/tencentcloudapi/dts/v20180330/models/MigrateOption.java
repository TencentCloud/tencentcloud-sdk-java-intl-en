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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateOption extends AbstractModel {

    /**
    * Task operation mode. Value range: 1 (immediate execution), 2 (scheduled execution)
    */
    @SerializedName("RunMode")
    @Expose
    private Long RunMode;

    /**
    * Expected execution time in the format of yyyy-mm-dd hh:mm:ss. If runMode=2, this field is required
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * Data migration type. Value range: 1 (structural migration), 2 (full migration), 3 (full + incremental migration)
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * Migration subject. 1: entire instance; 2: specified table
    */
    @SerializedName("MigrateObject")
    @Expose
    private Long MigrateObject;

    /**
    * Parameter of spot data consistency check. 1: not configured; 2: full check; 3: spot check; 4: check inconsistent tables only; 5: no check
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Long ConsistencyType;

    /**
    * Whether to overwrite the target database with the root account of the source database. Value range: 0 (no), 1 (yes). This value should be 0 for table or structural migration
    */
    @SerializedName("IsOverrideRoot")
    @Expose
    private Long IsOverrideRoot;

    /**
    * Additional parameters for different databases, which are described in JSON format. 
The following parameters can be defined for Redis: 
{ 
	"ClientOutputBufferHardLimit":512, 	Hard capacity limit of slave buffer (MB) 
	"ClientOutputBufferSoftLimit":512, 	Soft capacity limit of slave buffer (MB) 
	"ClientOutputBufferPersistTime":60, Soft limit duration of slave buffer (s) 
	"ReplBacklogSize":512, 	Circular buffer capacity limit (MB) 
	"ReplTimeout":120, 		Replication timeout period (s) 
}
The following parameters can be defined for MongoDB: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL currently does not support configuring additional parameters.
    */
    @SerializedName("ExternParams")
    @Expose
    private String ExternParams;

    /**
    * Only used for "spot data consistency check". It is required if ConsistencyType is spot check
    */
    @SerializedName("ConsistencyParams")
    @Expose
    private ConsistencyParams ConsistencyParams;

    /**
     * Get Task operation mode. Value range: 1 (immediate execution), 2 (scheduled execution) 
     * @return RunMode Task operation mode. Value range: 1 (immediate execution), 2 (scheduled execution)
     */
    public Long getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Task operation mode. Value range: 1 (immediate execution), 2 (scheduled execution)
     * @param RunMode Task operation mode. Value range: 1 (immediate execution), 2 (scheduled execution)
     */
    public void setRunMode(Long RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Expected execution time in the format of yyyy-mm-dd hh:mm:ss. If runMode=2, this field is required 
     * @return ExpectTime Expected execution time in the format of yyyy-mm-dd hh:mm:ss. If runMode=2, this field is required
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set Expected execution time in the format of yyyy-mm-dd hh:mm:ss. If runMode=2, this field is required
     * @param ExpectTime Expected execution time in the format of yyyy-mm-dd hh:mm:ss. If runMode=2, this field is required
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get Data migration type. Value range: 1 (structural migration), 2 (full migration), 3 (full + incremental migration) 
     * @return MigrateType Data migration type. Value range: 1 (structural migration), 2 (full migration), 3 (full + incremental migration)
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set Data migration type. Value range: 1 (structural migration), 2 (full migration), 3 (full + incremental migration)
     * @param MigrateType Data migration type. Value range: 1 (structural migration), 2 (full migration), 3 (full + incremental migration)
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get Migration subject. 1: entire instance; 2: specified table 
     * @return MigrateObject Migration subject. 1: entire instance; 2: specified table
     */
    public Long getMigrateObject() {
        return this.MigrateObject;
    }

    /**
     * Set Migration subject. 1: entire instance; 2: specified table
     * @param MigrateObject Migration subject. 1: entire instance; 2: specified table
     */
    public void setMigrateObject(Long MigrateObject) {
        this.MigrateObject = MigrateObject;
    }

    /**
     * Get Parameter of spot data consistency check. 1: not configured; 2: full check; 3: spot check; 4: check inconsistent tables only; 5: no check 
     * @return ConsistencyType Parameter of spot data consistency check. 1: not configured; 2: full check; 3: spot check; 4: check inconsistent tables only; 5: no check
     */
    public Long getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set Parameter of spot data consistency check. 1: not configured; 2: full check; 3: spot check; 4: check inconsistent tables only; 5: no check
     * @param ConsistencyType Parameter of spot data consistency check. 1: not configured; 2: full check; 3: spot check; 4: check inconsistent tables only; 5: no check
     */
    public void setConsistencyType(Long ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get Whether to overwrite the target database with the root account of the source database. Value range: 0 (no), 1 (yes). This value should be 0 for table or structural migration 
     * @return IsOverrideRoot Whether to overwrite the target database with the root account of the source database. Value range: 0 (no), 1 (yes). This value should be 0 for table or structural migration
     */
    public Long getIsOverrideRoot() {
        return this.IsOverrideRoot;
    }

    /**
     * Set Whether to overwrite the target database with the root account of the source database. Value range: 0 (no), 1 (yes). This value should be 0 for table or structural migration
     * @param IsOverrideRoot Whether to overwrite the target database with the root account of the source database. Value range: 0 (no), 1 (yes). This value should be 0 for table or structural migration
     */
    public void setIsOverrideRoot(Long IsOverrideRoot) {
        this.IsOverrideRoot = IsOverrideRoot;
    }

    /**
     * Get Additional parameters for different databases, which are described in JSON format. 
The following parameters can be defined for Redis: 
{ 
	"ClientOutputBufferHardLimit":512, 	Hard capacity limit of slave buffer (MB) 
	"ClientOutputBufferSoftLimit":512, 	Soft capacity limit of slave buffer (MB) 
	"ClientOutputBufferPersistTime":60, Soft limit duration of slave buffer (s) 
	"ReplBacklogSize":512, 	Circular buffer capacity limit (MB) 
	"ReplTimeout":120, 		Replication timeout period (s) 
}
The following parameters can be defined for MongoDB: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL currently does not support configuring additional parameters. 
     * @return ExternParams Additional parameters for different databases, which are described in JSON format. 
The following parameters can be defined for Redis: 
{ 
	"ClientOutputBufferHardLimit":512, 	Hard capacity limit of slave buffer (MB) 
	"ClientOutputBufferSoftLimit":512, 	Soft capacity limit of slave buffer (MB) 
	"ClientOutputBufferPersistTime":60, Soft limit duration of slave buffer (s) 
	"ReplBacklogSize":512, 	Circular buffer capacity limit (MB) 
	"ReplTimeout":120, 		Replication timeout period (s) 
}
The following parameters can be defined for MongoDB: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL currently does not support configuring additional parameters.
     */
    public String getExternParams() {
        return this.ExternParams;
    }

    /**
     * Set Additional parameters for different databases, which are described in JSON format. 
The following parameters can be defined for Redis: 
{ 
	"ClientOutputBufferHardLimit":512, 	Hard capacity limit of slave buffer (MB) 
	"ClientOutputBufferSoftLimit":512, 	Soft capacity limit of slave buffer (MB) 
	"ClientOutputBufferPersistTime":60, Soft limit duration of slave buffer (s) 
	"ReplBacklogSize":512, 	Circular buffer capacity limit (MB) 
	"ReplTimeout":120, 		Replication timeout period (s) 
}
The following parameters can be defined for MongoDB: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL currently does not support configuring additional parameters.
     * @param ExternParams Additional parameters for different databases, which are described in JSON format. 
The following parameters can be defined for Redis: 
{ 
	"ClientOutputBufferHardLimit":512, 	Hard capacity limit of slave buffer (MB) 
	"ClientOutputBufferSoftLimit":512, 	Soft capacity limit of slave buffer (MB) 
	"ClientOutputBufferPersistTime":60, Soft limit duration of slave buffer (s) 
	"ReplBacklogSize":512, 	Circular buffer capacity limit (MB) 
	"ReplTimeout":120, 		Replication timeout period (s) 
}
The following parameters can be defined for MongoDB: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL currently does not support configuring additional parameters.
     */
    public void setExternParams(String ExternParams) {
        this.ExternParams = ExternParams;
    }

    /**
     * Get Only used for "spot data consistency check". It is required if ConsistencyType is spot check 
     * @return ConsistencyParams Only used for "spot data consistency check". It is required if ConsistencyType is spot check
     */
    public ConsistencyParams getConsistencyParams() {
        return this.ConsistencyParams;
    }

    /**
     * Set Only used for "spot data consistency check". It is required if ConsistencyType is spot check
     * @param ConsistencyParams Only used for "spot data consistency check". It is required if ConsistencyType is spot check
     */
    public void setConsistencyParams(ConsistencyParams ConsistencyParams) {
        this.ConsistencyParams = ConsistencyParams;
    }

    public MigrateOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOption(MigrateOption source) {
        if (source.RunMode != null) {
            this.RunMode = new Long(source.RunMode);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.MigrateType != null) {
            this.MigrateType = new Long(source.MigrateType);
        }
        if (source.MigrateObject != null) {
            this.MigrateObject = new Long(source.MigrateObject);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new Long(source.ConsistencyType);
        }
        if (source.IsOverrideRoot != null) {
            this.IsOverrideRoot = new Long(source.IsOverrideRoot);
        }
        if (source.ExternParams != null) {
            this.ExternParams = new String(source.ExternParams);
        }
        if (source.ConsistencyParams != null) {
            this.ConsistencyParams = new ConsistencyParams(source.ConsistencyParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "MigrateObject", this.MigrateObject);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "IsOverrideRoot", this.IsOverrideRoot);
        this.setParamSimple(map, prefix + "ExternParams", this.ExternParams);
        this.setParamObj(map, prefix + "ConsistencyParams.", this.ConsistencyParams);

    }
}

