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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputAccount extends AbstractModel{

    /**
    * Account
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Host. Default value: `%`
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Account 
     * @return AccountName Account
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account
     * @param AccountName Account
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Host. Default value: `%` 
     * @return Host Host. Default value: `%`
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host. Default value: `%`
     * @param Host Host. Default value: `%`
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public InputAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputAccount(InputAccount source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

