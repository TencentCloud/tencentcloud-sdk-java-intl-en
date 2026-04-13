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

public class ModifyPrivilege extends AbstractModel {

    /**
    * Specifies the database object and permission list to be modified.
    */
    @SerializedName("DatabasePrivilege")
    @Expose
    private DatabasePrivilege DatabasePrivilege;

    /**
    * Modifies via grantObject, revokeObject, or alterRole. grantObject represents authorization, revokeObject represents withdraw, alterRole represents modify account type.
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * This parameter is required only when ModifyType is revokeObject. when set to true, the permission will be revoked with cascading effect. default false.
    */
    @SerializedName("IsCascade")
    @Expose
    private Boolean IsCascade;

    /**
     * Get Specifies the database object and permission list to be modified. 
     * @return DatabasePrivilege Specifies the database object and permission list to be modified.
     */
    public DatabasePrivilege getDatabasePrivilege() {
        return this.DatabasePrivilege;
    }

    /**
     * Set Specifies the database object and permission list to be modified.
     * @param DatabasePrivilege Specifies the database object and permission list to be modified.
     */
    public void setDatabasePrivilege(DatabasePrivilege DatabasePrivilege) {
        this.DatabasePrivilege = DatabasePrivilege;
    }

    /**
     * Get Modifies via grantObject, revokeObject, or alterRole. grantObject represents authorization, revokeObject represents withdraw, alterRole represents modify account type. 
     * @return ModifyType Modifies via grantObject, revokeObject, or alterRole. grantObject represents authorization, revokeObject represents withdraw, alterRole represents modify account type.
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Modifies via grantObject, revokeObject, or alterRole. grantObject represents authorization, revokeObject represents withdraw, alterRole represents modify account type.
     * @param ModifyType Modifies via grantObject, revokeObject, or alterRole. grantObject represents authorization, revokeObject represents withdraw, alterRole represents modify account type.
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get This parameter is required only when ModifyType is revokeObject. when set to true, the permission will be revoked with cascading effect. default false. 
     * @return IsCascade This parameter is required only when ModifyType is revokeObject. when set to true, the permission will be revoked with cascading effect. default false.
     */
    public Boolean getIsCascade() {
        return this.IsCascade;
    }

    /**
     * Set This parameter is required only when ModifyType is revokeObject. when set to true, the permission will be revoked with cascading effect. default false.
     * @param IsCascade This parameter is required only when ModifyType is revokeObject. when set to true, the permission will be revoked with cascading effect. default false.
     */
    public void setIsCascade(Boolean IsCascade) {
        this.IsCascade = IsCascade;
    }

    public ModifyPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivilege(ModifyPrivilege source) {
        if (source.DatabasePrivilege != null) {
            this.DatabasePrivilege = new DatabasePrivilege(source.DatabasePrivilege);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.IsCascade != null) {
            this.IsCascade = new Boolean(source.IsCascade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabasePrivilege.", this.DatabasePrivilege);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "IsCascade", this.IsCascade);

    }
}

