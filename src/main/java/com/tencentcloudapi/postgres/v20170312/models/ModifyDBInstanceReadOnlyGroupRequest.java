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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceReadOnlyGroupRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * ID of the RO group to which the read-only replica belongs
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * ID of the new RO group into which the read-only replica will move
    */
    @SerializedName("NewReadOnlyGroupId")
    @Expose
    private String NewReadOnlyGroupId;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get ID of the RO group to which the read-only replica belongs 
     * @return ReadOnlyGroupId ID of the RO group to which the read-only replica belongs
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ID of the RO group to which the read-only replica belongs
     * @param ReadOnlyGroupId ID of the RO group to which the read-only replica belongs
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get ID of the new RO group into which the read-only replica will move 
     * @return NewReadOnlyGroupId ID of the new RO group into which the read-only replica will move
     */
    public String getNewReadOnlyGroupId() {
        return this.NewReadOnlyGroupId;
    }

    /**
     * Set ID of the new RO group into which the read-only replica will move
     * @param NewReadOnlyGroupId ID of the new RO group into which the read-only replica will move
     */
    public void setNewReadOnlyGroupId(String NewReadOnlyGroupId) {
        this.NewReadOnlyGroupId = NewReadOnlyGroupId;
    }

    public ModifyDBInstanceReadOnlyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceReadOnlyGroupRequest(ModifyDBInstanceReadOnlyGroupRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.NewReadOnlyGroupId != null) {
            this.NewReadOnlyGroupId = new String(source.NewReadOnlyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "NewReadOnlyGroupId", this.NewReadOnlyGroupId);

    }
}

