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

public class DescribeAccountPrivilegesRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Account name of the database. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Domain name of the database account. Obtain through the API [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1).
    */
    @SerializedName("Host")
    @Expose
    private String Host;

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
     * Get Account name of the database. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API. 
     * @return User Account name of the database. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Account name of the database. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     * @param User Account name of the database. Obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1) API.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Domain name of the database account. Obtain through the API [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1). 
     * @return Host Domain name of the database account. Obtain through the API [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1).
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name of the database account. Obtain through the API [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1).
     * @param Host Domain name of the database account. Obtain through the API [DescribeAccounts](https://www.tencentcloud.com/document/api/236/17499?from_cn_redirect=1).
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

