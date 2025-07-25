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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateDBInstanceRequest extends AbstractModel {

    /**
    * List of instance IDs manually terminated in the format of [mssql-3l3fgqn7], which are the same as the instance IDs displayed on the TencentDB Console page
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
     * Get List of instance IDs manually terminated in the format of [mssql-3l3fgqn7], which are the same as the instance IDs displayed on the TencentDB Console page 
     * @return InstanceIdSet List of instance IDs manually terminated in the format of [mssql-3l3fgqn7], which are the same as the instance IDs displayed on the TencentDB Console page
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of instance IDs manually terminated in the format of [mssql-3l3fgqn7], which are the same as the instance IDs displayed on the TencentDB Console page
     * @param InstanceIdSet List of instance IDs manually terminated in the format of [mssql-3l3fgqn7], which are the same as the instance IDs displayed on the TencentDB Console page
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    public TerminateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateDBInstanceRequest(TerminateDBInstanceRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);

    }
}

