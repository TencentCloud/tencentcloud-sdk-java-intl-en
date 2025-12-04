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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountUserRequest extends AbstractModel {

    /**
    * Specifies the instance ID for the account to be deleted. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configures the name of the account to be deleted.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Configures the password corresponding to the mongouser account. mongouser is the default account of the system. Enter the password corresponding to it.
    */
    @SerializedName("MongoUserPassword")
    @Expose
    private String MongoUserPassword;

    /**
     * Get Specifies the instance ID for the account to be deleted. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
 
     * @return InstanceId Specifies the instance ID for the account to be deleted. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID for the account to be deleted. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     * @param InstanceId Specifies the instance ID for the account to be deleted. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Configures the name of the account to be deleted. 
     * @return UserName Configures the name of the account to be deleted.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Configures the name of the account to be deleted.
     * @param UserName Configures the name of the account to be deleted.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Configures the password corresponding to the mongouser account. mongouser is the default account of the system. Enter the password corresponding to it. 
     * @return MongoUserPassword Configures the password corresponding to the mongouser account. mongouser is the default account of the system. Enter the password corresponding to it.
     */
    public String getMongoUserPassword() {
        return this.MongoUserPassword;
    }

    /**
     * Set Configures the password corresponding to the mongouser account. mongouser is the default account of the system. Enter the password corresponding to it.
     * @param MongoUserPassword Configures the password corresponding to the mongouser account. mongouser is the default account of the system. Enter the password corresponding to it.
     */
    public void setMongoUserPassword(String MongoUserPassword) {
        this.MongoUserPassword = MongoUserPassword;
    }

    public DeleteAccountUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccountUserRequest(DeleteAccountUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.MongoUserPassword != null) {
            this.MongoUserPassword = new String(source.MongoUserPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "MongoUserPassword", this.MongoUserPassword);

    }
}

