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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableReplicaReadonlyRequest extends AbstractModel{

    /**
    * Serial ID of an instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account routing policy. If `master` or `replication` is entered, it means to route to the master or slave node; if this is left blank, it means to write into the master node and read from the slave node by default
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
     * Get Serial ID of an instance 
     * @return InstanceId Serial ID of an instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Serial ID of an instance
     * @param InstanceId Serial ID of an instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Account routing policy. If `master` or `replication` is entered, it means to route to the master or slave node; if this is left blank, it means to write into the master node and read from the slave node by default 
     * @return ReadonlyPolicy Account routing policy. If `master` or `replication` is entered, it means to route to the master or slave node; if this is left blank, it means to write into the master node and read from the slave node by default
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set Account routing policy. If `master` or `replication` is entered, it means to route to the master or slave node; if this is left blank, it means to write into the master node and read from the slave node by default
     * @param ReadonlyPolicy Account routing policy. If `master` or `replication` is entered, it means to route to the master or slave node; if this is left blank, it means to write into the master node and read from the slave node by default
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);

    }
}

