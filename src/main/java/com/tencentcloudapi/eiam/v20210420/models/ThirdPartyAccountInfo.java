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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThirdPartyAccountInfo extends AbstractModel {

    /**
    * Third-Party account code. `2` indicates WeCom account.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountCode")
    @Expose
    private String AccountCode;

    /**
    * Username of the account.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get Third-Party account code. `2` indicates WeCom account.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccountCode Third-Party account code. `2` indicates WeCom account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountCode() {
        return this.AccountCode;
    }

    /**
     * Set Third-Party account code. `2` indicates WeCom account.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccountCode Third-Party account code. `2` indicates WeCom account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountCode(String AccountCode) {
        this.AccountCode = AccountCode;
    }

    /**
     * Get Username of the account.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccountName Username of the account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Username of the account.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccountName Username of the account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public ThirdPartyAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThirdPartyAccountInfo(ThirdPartyAccountInfo source) {
        if (source.AccountCode != null) {
            this.AccountCode = new String(source.AccountCode);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountCode", this.AccountCode);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);

    }
}

