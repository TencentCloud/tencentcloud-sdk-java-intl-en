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

public class ModifyDatabaseCDCRequest extends AbstractModel {

    /**
    * Array of database names
    */
    @SerializedName("DBNames")
    @Expose
    private String [] DBNames;

    /**
    * Enable or disable CDC. Valid values: `enable`, `disable`
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Array of database names 
     * @return DBNames Array of database names
     */
    public String [] getDBNames() {
        return this.DBNames;
    }

    /**
     * Set Array of database names
     * @param DBNames Array of database names
     */
    public void setDBNames(String [] DBNames) {
        this.DBNames = DBNames;
    }

    /**
     * Get Enable or disable CDC. Valid values: `enable`, `disable` 
     * @return ModifyType Enable or disable CDC. Valid values: `enable`, `disable`
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Enable or disable CDC. Valid values: `enable`, `disable`
     * @param ModifyType Enable or disable CDC. Valid values: `enable`, `disable`
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

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

    public ModifyDatabaseCDCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatabaseCDCRequest(ModifyDatabaseCDCRequest source) {
        if (source.DBNames != null) {
            this.DBNames = new String[source.DBNames.length];
            for (int i = 0; i < source.DBNames.length; i++) {
                this.DBNames[i] = new String(source.DBNames[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBNames.", this.DBNames);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

