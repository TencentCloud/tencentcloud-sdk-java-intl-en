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

public class ModifyDBInstanceSSLConfigRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Turn on or off SSL. true - turn on; false - turn off.
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * The unique connection address protected by an SSL certificate. for a primary instance, it can be set to private and public IP addresses. for a read-only instance, it can be set to the instance IP or read-only group IP. this parameter is required when enabling SSL or modifying the SSL-protected connection address. it will be ignored when disabling SSL.
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Turn on or off SSL. true - turn on; false - turn off. 
     * @return SSLEnabled Turn on or off SSL. true - turn on; false - turn off.
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set Turn on or off SSL. true - turn on; false - turn off.
     * @param SSLEnabled Turn on or off SSL. true - turn on; false - turn off.
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get The unique connection address protected by an SSL certificate. for a primary instance, it can be set to private and public IP addresses. for a read-only instance, it can be set to the instance IP or read-only group IP. this parameter is required when enabling SSL or modifying the SSL-protected connection address. it will be ignored when disabling SSL. 
     * @return ConnectAddress The unique connection address protected by an SSL certificate. for a primary instance, it can be set to private and public IP addresses. for a read-only instance, it can be set to the instance IP or read-only group IP. this parameter is required when enabling SSL or modifying the SSL-protected connection address. it will be ignored when disabling SSL.
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set The unique connection address protected by an SSL certificate. for a primary instance, it can be set to private and public IP addresses. for a read-only instance, it can be set to the instance IP or read-only group IP. this parameter is required when enabling SSL or modifying the SSL-protected connection address. it will be ignored when disabling SSL.
     * @param ConnectAddress The unique connection address protected by an SSL certificate. for a primary instance, it can be set to private and public IP addresses. for a read-only instance, it can be set to the instance IP or read-only group IP. this parameter is required when enabling SSL or modifying the SSL-protected connection address. it will be ignored when disabling SSL.
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    public ModifyDBInstanceSSLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSSLConfigRequest(ModifyDBInstanceSSLConfigRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);

    }
}

