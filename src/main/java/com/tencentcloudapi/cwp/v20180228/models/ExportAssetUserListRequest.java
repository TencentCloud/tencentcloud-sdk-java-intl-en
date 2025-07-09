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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAssetUserListRequest extends AbstractModel {

    /**
    * Query information of a specified QUUID host
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>Name - String - whether required: no - account name</li>
<li>Uid - uint64 - whether required: no - Uid</li>
<li>Guid - uint64 - whether required: no - Guid</li>
<li>LoginTimeStart - String - whether required: no - start time, such as 2021-01-11</li>
<li>LoginTimeEnd - String - whether required: no - end time, such as 2021-01-11</li>
<li>LoginType - uint64 - whether required: no - 0 - not allowed to log in; 1 - only key-based log-in allowed; 2 - only password-based log-in allowed; 3 - both key-based and password-based log-in allowed (Linux only)</li>
<li>OsType - String - whether required: no - Windows or Linux</li>
<li>Status - uint64 - whether required: no - account status: 0 - disabled; 1 - enabled</li>
<li>Type - uint64 - whether required: no - account type: 0 - guest user; 1 - standard user; 2 - administrator user (Windows Only)</li>
<li>IsDomain - uint64 - whether required: no - whether a domain account: 0 - no; 1 - yes (Windows only)</li>
<li>IsRoot - uint64 - whether required: no - whether there is root permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSudo - uint64 - whether required: no - whether there is sudo permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSshLogin - uint64 - whether required: no - whether to use ssh log-in: 0 - no; 1 - yes (Linux only)</li>
<li>ShellLoginStatus - uint64 - whether required: no - whether to use shell log-in: 0 - no; 1 - yes (Linux only)</li>
<li>PasswordStatus - uint64 - whether required: no - password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked (Linux only)</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Optional sorting method: [FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Query information of a specified QUUID host 
     * @return Quuid Query information of a specified QUUID host
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Query information of a specified QUUID host
     * @param Quuid Query information of a specified QUUID host
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criteria
<li>Name - String - whether required: no - account name</li>
<li>Uid - uint64 - whether required: no - Uid</li>
<li>Guid - uint64 - whether required: no - Guid</li>
<li>LoginTimeStart - String - whether required: no - start time, such as 2021-01-11</li>
<li>LoginTimeEnd - String - whether required: no - end time, such as 2021-01-11</li>
<li>LoginType - uint64 - whether required: no - 0 - not allowed to log in; 1 - only key-based log-in allowed; 2 - only password-based log-in allowed; 3 - both key-based and password-based log-in allowed (Linux only)</li>
<li>OsType - String - whether required: no - Windows or Linux</li>
<li>Status - uint64 - whether required: no - account status: 0 - disabled; 1 - enabled</li>
<li>Type - uint64 - whether required: no - account type: 0 - guest user; 1 - standard user; 2 - administrator user (Windows Only)</li>
<li>IsDomain - uint64 - whether required: no - whether a domain account: 0 - no; 1 - yes (Windows only)</li>
<li>IsRoot - uint64 - whether required: no - whether there is root permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSudo - uint64 - whether required: no - whether there is sudo permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSshLogin - uint64 - whether required: no - whether to use ssh log-in: 0 - no; 1 - yes (Linux only)</li>
<li>ShellLoginStatus - uint64 - whether required: no - whether to use shell log-in: 0 - no; 1 - yes (Linux only)</li>
<li>PasswordStatus - uint64 - whether required: no - password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked (Linux only)</li> 
     * @return Filters Filter criteria
<li>Name - String - whether required: no - account name</li>
<li>Uid - uint64 - whether required: no - Uid</li>
<li>Guid - uint64 - whether required: no - Guid</li>
<li>LoginTimeStart - String - whether required: no - start time, such as 2021-01-11</li>
<li>LoginTimeEnd - String - whether required: no - end time, such as 2021-01-11</li>
<li>LoginType - uint64 - whether required: no - 0 - not allowed to log in; 1 - only key-based log-in allowed; 2 - only password-based log-in allowed; 3 - both key-based and password-based log-in allowed (Linux only)</li>
<li>OsType - String - whether required: no - Windows or Linux</li>
<li>Status - uint64 - whether required: no - account status: 0 - disabled; 1 - enabled</li>
<li>Type - uint64 - whether required: no - account type: 0 - guest user; 1 - standard user; 2 - administrator user (Windows Only)</li>
<li>IsDomain - uint64 - whether required: no - whether a domain account: 0 - no; 1 - yes (Windows only)</li>
<li>IsRoot - uint64 - whether required: no - whether there is root permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSudo - uint64 - whether required: no - whether there is sudo permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSshLogin - uint64 - whether required: no - whether to use ssh log-in: 0 - no; 1 - yes (Linux only)</li>
<li>ShellLoginStatus - uint64 - whether required: no - whether to use shell log-in: 0 - no; 1 - yes (Linux only)</li>
<li>PasswordStatus - uint64 - whether required: no - password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked (Linux only)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Name - String - whether required: no - account name</li>
<li>Uid - uint64 - whether required: no - Uid</li>
<li>Guid - uint64 - whether required: no - Guid</li>
<li>LoginTimeStart - String - whether required: no - start time, such as 2021-01-11</li>
<li>LoginTimeEnd - String - whether required: no - end time, such as 2021-01-11</li>
<li>LoginType - uint64 - whether required: no - 0 - not allowed to log in; 1 - only key-based log-in allowed; 2 - only password-based log-in allowed; 3 - both key-based and password-based log-in allowed (Linux only)</li>
<li>OsType - String - whether required: no - Windows or Linux</li>
<li>Status - uint64 - whether required: no - account status: 0 - disabled; 1 - enabled</li>
<li>Type - uint64 - whether required: no - account type: 0 - guest user; 1 - standard user; 2 - administrator user (Windows Only)</li>
<li>IsDomain - uint64 - whether required: no - whether a domain account: 0 - no; 1 - yes (Windows only)</li>
<li>IsRoot - uint64 - whether required: no - whether there is root permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSudo - uint64 - whether required: no - whether there is sudo permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSshLogin - uint64 - whether required: no - whether to use ssh log-in: 0 - no; 1 - yes (Linux only)</li>
<li>ShellLoginStatus - uint64 - whether required: no - whether to use shell log-in: 0 - no; 1 - yes (Linux only)</li>
<li>PasswordStatus - uint64 - whether required: no - password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked (Linux only)</li>
     * @param Filters Filter criteria
<li>Name - String - whether required: no - account name</li>
<li>Uid - uint64 - whether required: no - Uid</li>
<li>Guid - uint64 - whether required: no - Guid</li>
<li>LoginTimeStart - String - whether required: no - start time, such as 2021-01-11</li>
<li>LoginTimeEnd - String - whether required: no - end time, such as 2021-01-11</li>
<li>LoginType - uint64 - whether required: no - 0 - not allowed to log in; 1 - only key-based log-in allowed; 2 - only password-based log-in allowed; 3 - both key-based and password-based log-in allowed (Linux only)</li>
<li>OsType - String - whether required: no - Windows or Linux</li>
<li>Status - uint64 - whether required: no - account status: 0 - disabled; 1 - enabled</li>
<li>Type - uint64 - whether required: no - account type: 0 - guest user; 1 - standard user; 2 - administrator user (Windows Only)</li>
<li>IsDomain - uint64 - whether required: no - whether a domain account: 0 - no; 1 - yes (Windows only)</li>
<li>IsRoot - uint64 - whether required: no - whether there is root permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSudo - uint64 - whether required: no - whether there is sudo permission: 0 - no; 1 - yes (Linux only)</li>
<li>IsSshLogin - uint64 - whether required: no - whether to use ssh log-in: 0 - no; 1 - yes (Linux only)</li>
<li>ShellLoginStatus - uint64 - whether required: no - whether to use shell log-in: 0 - no; 1 - yes (Linux only)</li>
<li>PasswordStatus - uint64 - whether required: no - password status: 1 - normal; 2 - expiring soon; 3 - expired; 4 - locked (Linux only)</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: asc for ascending order or desc for descending order 
     * @return Order Sorting method: asc for ascending order or desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: asc for ascending order or desc for descending order
     * @param Order Sorting method: asc for ascending order or desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Optional sorting method: [FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays 
     * @return By Optional sorting method: [FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting method: [FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     * @param By Optional sorting method: [FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportAssetUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetUserListRequest(ExportAssetUserListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

