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

public class DescribeDatabaseNamesRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-rljoi3bf.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account name.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get Instance ID, in the format of mssql-rljoi3bf. 
     * @return InstanceId Instance ID, in the format of mssql-rljoi3bf.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-rljoi3bf.
     * @param InstanceId Instance ID, in the format of mssql-rljoi3bf.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Account name. 
     * @return AccountName Account name.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name.
     * @param AccountName Account name.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public DescribeDatabaseNamesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseNamesRequest(DescribeDatabaseNamesRequest source) {
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

