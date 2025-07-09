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

public class AccountRemark extends AbstractModel {

    /**
    * Account name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * New remarks of account
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Account name 
     * @return UserName Account name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Account name
     * @param UserName Account name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get New remarks of account 
     * @return Remark New remarks of account
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set New remarks of account
     * @param Remark New remarks of account
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AccountRemark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountRemark(AccountRemark source) {
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
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

