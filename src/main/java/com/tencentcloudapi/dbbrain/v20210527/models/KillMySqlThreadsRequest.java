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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillMySqlThreadsRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The stage of a session killing task. Valid values: `Prepare` (preparation stage), `Commit` (commit stage).
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * List of IDs of the MySQL sessions to be killed. This parameter is used in the `Prepare` stage.
    */
    @SerializedName("Threads")
    @Expose
    private Long [] Threads;

    /**
    * Execution ID. This parameter is used in the `Commit` stage.
    */
    @SerializedName("SqlExecId")
    @Expose
    private String SqlExecId;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Whether to record the thread killing history. The default value is `true`, indicating “yes”. You can set it to `false` (“no”) to speed up the killing process.
    */
    @SerializedName("RecordHistory")
    @Expose
    private Boolean RecordHistory;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The stage of a session killing task. Valid values: `Prepare` (preparation stage), `Commit` (commit stage). 
     * @return Stage The stage of a session killing task. Valid values: `Prepare` (preparation stage), `Commit` (commit stage).
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set The stage of a session killing task. Valid values: `Prepare` (preparation stage), `Commit` (commit stage).
     * @param Stage The stage of a session killing task. Valid values: `Prepare` (preparation stage), `Commit` (commit stage).
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get List of IDs of the MySQL sessions to be killed. This parameter is used in the `Prepare` stage. 
     * @return Threads List of IDs of the MySQL sessions to be killed. This parameter is used in the `Prepare` stage.
     */
    public Long [] getThreads() {
        return this.Threads;
    }

    /**
     * Set List of IDs of the MySQL sessions to be killed. This parameter is used in the `Prepare` stage.
     * @param Threads List of IDs of the MySQL sessions to be killed. This parameter is used in the `Prepare` stage.
     */
    public void setThreads(Long [] Threads) {
        this.Threads = Threads;
    }

    /**
     * Get Execution ID. This parameter is used in the `Commit` stage. 
     * @return SqlExecId Execution ID. This parameter is used in the `Commit` stage.
     */
    public String getSqlExecId() {
        return this.SqlExecId;
    }

    /**
     * Set Execution ID. This parameter is used in the `Commit` stage.
     * @param SqlExecId Execution ID. This parameter is used in the `Commit` stage.
     */
    public void setSqlExecId(String SqlExecId) {
        this.SqlExecId = SqlExecId;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Whether to record the thread killing history. The default value is `true`, indicating “yes”. You can set it to `false` (“no”) to speed up the killing process. 
     * @return RecordHistory Whether to record the thread killing history. The default value is `true`, indicating “yes”. You can set it to `false` (“no”) to speed up the killing process.
     */
    public Boolean getRecordHistory() {
        return this.RecordHistory;
    }

    /**
     * Set Whether to record the thread killing history. The default value is `true`, indicating “yes”. You can set it to `false` (“no”) to speed up the killing process.
     * @param RecordHistory Whether to record the thread killing history. The default value is `true`, indicating “yes”. You can set it to `false` (“no”) to speed up the killing process.
     */
    public void setRecordHistory(Boolean RecordHistory) {
        this.RecordHistory = RecordHistory;
    }

    public KillMySqlThreadsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillMySqlThreadsRequest(KillMySqlThreadsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Threads != null) {
            this.Threads = new Long[source.Threads.length];
            for (int i = 0; i < source.Threads.length; i++) {
                this.Threads[i] = new Long(source.Threads[i]);
            }
        }
        if (source.SqlExecId != null) {
            this.SqlExecId = new String(source.SqlExecId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.RecordHistory != null) {
            this.RecordHistory = new Boolean(source.RecordHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamArraySimple(map, prefix + "Threads.", this.Threads);
        this.setParamSimple(map, prefix + "SqlExecId", this.SqlExecId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "RecordHistory", this.RecordHistory);

    }
}

