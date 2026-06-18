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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceVPortRequest extends AbstractModel {

    /**
    * Instance ID, such as tdsql3-5baee8df.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * New VPC port 3308
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Instance ID, such as tdsql3-5baee8df. 
     * @return InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as tdsql3-5baee8df.
     * @param InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get New VPC port 3308 
     * @return Vport New VPC port 3308
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set New VPC port 3308
     * @param Vport New VPC port 3308
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public ModifyDBInstanceVPortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceVPortRequest(ModifyDBInstanceVPortRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

