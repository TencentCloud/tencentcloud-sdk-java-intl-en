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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreDBInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Specify the target time point to roll back. The time must be in the backup retention period of the instance.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * <p>Database table information to be rolled back.</p>
    */
    @SerializedName("Databases")
    @Expose
    private RestoreDatabases [] Databases;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb/instance">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Specify the target time point to roll back. The time must be in the backup retention period of the instance.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return RestoreTime <p>Specify the target time point to roll back. The time must be in the backup retention period of the instance.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>Specify the target time point to roll back. The time must be in the backup retention period of the instance.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param RestoreTime <p>Specify the target time point to roll back. The time must be in the backup retention period of the instance.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get <p>Database table information to be rolled back.</p> 
     * @return Databases <p>Database table information to be rolled back.</p>
     */
    public RestoreDatabases [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>Database table information to be rolled back.</p>
     * @param Databases <p>Database table information to be rolled back.</p>
     */
    public void setDatabases(RestoreDatabases [] Databases) {
        this.Databases = Databases;
    }

    public RestoreDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDBInstanceRequest(RestoreDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.Databases != null) {
            this.Databases = new RestoreDatabases[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new RestoreDatabases(source.Databases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);

    }
}

