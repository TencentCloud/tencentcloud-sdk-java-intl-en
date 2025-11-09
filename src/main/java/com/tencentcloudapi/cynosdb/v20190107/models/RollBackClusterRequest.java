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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollBackClusterRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Rollback policy. timeRollback - roll back by time point; snapRollback - roll back by backup file.
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * Backup file ID. This parameter is required when the rollback policy is rolling back by backup file.
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * Expected rollback time. This parameter is required when the rollback policy is timeRollback (roll back by time point).
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * Expected threshold (deprecated).
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * List of rollback databases.
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * List of rollback databases and tables.
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * Mode of rolling back by time point. full: normal; db: fast; table: ultra-fast (the default value is normal).
    */
    @SerializedName("RollbackMode")
    @Expose
    private String RollbackMode;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Rollback policy. timeRollback - roll back by time point; snapRollback - roll back by backup file. 
     * @return RollbackStrategy Rollback policy. timeRollback - roll back by time point; snapRollback - roll back by backup file.
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set Rollback policy. timeRollback - roll back by time point; snapRollback - roll back by backup file.
     * @param RollbackStrategy Rollback policy. timeRollback - roll back by time point; snapRollback - roll back by backup file.
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get Backup file ID. This parameter is required when the rollback policy is rolling back by backup file. 
     * @return RollbackId Backup file ID. This parameter is required when the rollback policy is rolling back by backup file.
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set Backup file ID. This parameter is required when the rollback policy is rolling back by backup file.
     * @param RollbackId Backup file ID. This parameter is required when the rollback policy is rolling back by backup file.
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get Expected rollback time. This parameter is required when the rollback policy is timeRollback (roll back by time point). 
     * @return ExpectTime Expected rollback time. This parameter is required when the rollback policy is timeRollback (roll back by time point).
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set Expected rollback time. This parameter is required when the rollback policy is timeRollback (roll back by time point).
     * @param ExpectTime Expected rollback time. This parameter is required when the rollback policy is timeRollback (roll back by time point).
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get Expected threshold (deprecated). 
     * @return ExpectTimeThresh Expected threshold (deprecated).
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set Expected threshold (deprecated).
     * @param ExpectTimeThresh Expected threshold (deprecated).
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get List of rollback databases. 
     * @return RollbackDatabases List of rollback databases.
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set List of rollback databases.
     * @param RollbackDatabases List of rollback databases.
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get List of rollback databases and tables. 
     * @return RollbackTables List of rollback databases and tables.
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set List of rollback databases and tables.
     * @param RollbackTables List of rollback databases and tables.
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get Mode of rolling back by time point. full: normal; db: fast; table: ultra-fast (the default value is normal). 
     * @return RollbackMode Mode of rolling back by time point. full: normal; db: fast; table: ultra-fast (the default value is normal).
     */
    public String getRollbackMode() {
        return this.RollbackMode;
    }

    /**
     * Set Mode of rolling back by time point. full: normal; db: fast; table: ultra-fast (the default value is normal).
     * @param RollbackMode Mode of rolling back by time point. full: normal; db: fast; table: ultra-fast (the default value is normal).
     */
    public void setRollbackMode(String RollbackMode) {
        this.RollbackMode = RollbackMode;
    }

    public RollBackClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollBackClusterRequest(RollBackClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.ExpectTimeThresh != null) {
            this.ExpectTimeThresh = new Long(source.ExpectTimeThresh);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.RollbackMode != null) {
            this.RollbackMode = new String(source.RollbackMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "ExpectTimeThresh", this.ExpectTimeThresh);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamSimple(map, prefix + "RollbackMode", this.RollbackMode);

    }
}

