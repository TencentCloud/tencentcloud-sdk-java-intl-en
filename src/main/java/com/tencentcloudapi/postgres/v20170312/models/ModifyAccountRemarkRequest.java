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

public class ModifyAccountRemarkRequest extends AbstractModel {

    /**
    * Instance ID in the format of postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * New remarks corresponding to user `UserName`
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Instance ID in the format of postgres-4wdeb0zv 
     * @return DBInstanceId Instance ID in the format of postgres-4wdeb0zv
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-4wdeb0zv
     * @param DBInstanceId Instance ID in the format of postgres-4wdeb0zv
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance username 
     * @return UserName Instance username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Instance username
     * @param UserName Instance username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get New remarks corresponding to user `UserName` 
     * @return Remark New remarks corresponding to user `UserName`
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set New remarks corresponding to user `UserName`
     * @param Remark New remarks corresponding to user `UserName`
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyAccountRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountRemarkRequest(ModifyAccountRemarkRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

