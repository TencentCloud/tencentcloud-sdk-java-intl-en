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

public class ModifyDBNameRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Old database name
    */
    @SerializedName("OldDBName")
    @Expose
    private String OldDBName;

    /**
    * New name of database
    */
    @SerializedName("NewDBName")
    @Expose
    private String NewDBName;

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
     * Get Old database name 
     * @return OldDBName Old database name
     */
    public String getOldDBName() {
        return this.OldDBName;
    }

    /**
     * Set Old database name
     * @param OldDBName Old database name
     */
    public void setOldDBName(String OldDBName) {
        this.OldDBName = OldDBName;
    }

    /**
     * Get New name of database 
     * @return NewDBName New name of database
     */
    public String getNewDBName() {
        return this.NewDBName;
    }

    /**
     * Set New name of database
     * @param NewDBName New name of database
     */
    public void setNewDBName(String NewDBName) {
        this.NewDBName = NewDBName;
    }

    public ModifyDBNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBNameRequest(ModifyDBNameRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldDBName != null) {
            this.OldDBName = new String(source.OldDBName);
        }
        if (source.NewDBName != null) {
            this.NewDBName = new String(source.NewDBName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldDBName", this.OldDBName);
        this.setParamSimple(map, prefix + "NewDBName", this.NewDBName);

    }
}

