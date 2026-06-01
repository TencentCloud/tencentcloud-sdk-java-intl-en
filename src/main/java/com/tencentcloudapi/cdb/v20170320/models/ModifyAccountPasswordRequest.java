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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPasswordRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * New password of the database account. It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (_+-&=!@#$%^*()).
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * TDSQL for MySQL accounts. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * Deprecated.
    */
    @SerializedName("SkipValidatePassword")
    @Expose
    private Boolean SkipValidatePassword;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get New password of the database account. It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (_+-&=!@#$%^*()). 
     * @return NewPassword New password of the database account. It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (_+-&=!@#$%^*()).
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set New password of the database account. It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (_+-&=!@#$%^*()).
     * @param NewPassword New password of the database account. It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (_+-&=!@#$%^*()).
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Get TDSQL for MySQL accounts. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API. 
     * @return Accounts TDSQL for MySQL accounts. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set TDSQL for MySQL accounts. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     * @param Accounts TDSQL for MySQL accounts. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Deprecated. 
     * @return SkipValidatePassword Deprecated.
     * @deprecated
     */
    @Deprecated
    public Boolean getSkipValidatePassword() {
        return this.SkipValidatePassword;
    }

    /**
     * Set Deprecated.
     * @param SkipValidatePassword Deprecated.
     * @deprecated
     */
    @Deprecated
    public void setSkipValidatePassword(Boolean SkipValidatePassword) {
        this.SkipValidatePassword = SkipValidatePassword;
    }

    public ModifyAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPasswordRequest(ModifyAccountPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewPassword != null) {
            this.NewPassword = new String(source.NewPassword);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.SkipValidatePassword != null) {
            this.SkipValidatePassword = new Boolean(source.SkipValidatePassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "SkipValidatePassword", this.SkipValidatePassword);

    }
}

