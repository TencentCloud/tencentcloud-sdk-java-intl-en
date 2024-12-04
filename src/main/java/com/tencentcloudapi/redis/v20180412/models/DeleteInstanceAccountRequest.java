/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceAccountRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sub-account name. Log in to the [Redis console](https://console.tencentcloud.com/redis) and switch to the **Account Management** page to obtain it. For details, see [Managing Account](https://www.tencentcloud.com/document/product/239/34590).
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sub-account name. Log in to the [Redis console](https://console.tencentcloud.com/redis) and switch to the **Account Management** page to obtain it. For details, see [Managing Account](https://www.tencentcloud.com/document/product/239/34590). 
     * @return AccountName Sub-account name. Log in to the [Redis console](https://console.tencentcloud.com/redis) and switch to the **Account Management** page to obtain it. For details, see [Managing Account](https://www.tencentcloud.com/document/product/239/34590).
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Sub-account name. Log in to the [Redis console](https://console.tencentcloud.com/redis) and switch to the **Account Management** page to obtain it. For details, see [Managing Account](https://www.tencentcloud.com/document/product/239/34590).
     * @param AccountName Sub-account name. Log in to the [Redis console](https://console.tencentcloud.com/redis) and switch to the **Account Management** page to obtain it. For details, see [Managing Account](https://www.tencentcloud.com/document/product/239/34590).
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public DeleteInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstanceAccountRequest(DeleteInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);

    }
}

