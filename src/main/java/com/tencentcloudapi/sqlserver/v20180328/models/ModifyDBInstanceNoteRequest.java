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

public class ModifyDBInstanceNoteRequest extends AbstractModel {

    /**
    * Database instance ID, in the format of mssql-njj2mtpl.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance remarks.
    */
    @SerializedName("InstanceNote")
    @Expose
    private String InstanceNote;

    /**
     * Get Database instance ID, in the format of mssql-njj2mtpl. 
     * @return InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID, in the format of mssql-njj2mtpl.
     * @param InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance remarks. 
     * @return InstanceNote Instance remarks.
     */
    public String getInstanceNote() {
        return this.InstanceNote;
    }

    /**
     * Set Instance remarks.
     * @param InstanceNote Instance remarks.
     */
    public void setInstanceNote(String InstanceNote) {
        this.InstanceNote = InstanceNote;
    }

    public ModifyDBInstanceNoteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNoteRequest(ModifyDBInstanceNoteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceNote != null) {
            this.InstanceNote = new String(source.InstanceNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceNote", this.InstanceNote);

    }
}

