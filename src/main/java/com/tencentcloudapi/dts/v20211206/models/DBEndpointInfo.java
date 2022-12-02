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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBEndpointInfo extends AbstractModel{

    /**
    * Instance region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instances network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Database type, such as `mysql`, `redis`, `mongodb`, `postgresql`, `mariadb`, and `percona`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * Node type. Valid values: empty or `simple` (general node); `cluster` (cluster node).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Database information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Info")
    @Expose
    private DBInfo [] Info;

    /**
    * Instance service provider, such as "aliyun" and "others".
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * For MongoDB, you can define the following parameters: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
     * Get Instance region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Instance region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Instance region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instances network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessType Instances network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Instances network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessType Instances network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Database type, such as `mysql`, `redis`, `mongodb`, `postgresql`, `mariadb`, and `percona`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseType Database type, such as `mysql`, `redis`, `mongodb`, `postgresql`, `mariadb`, and `percona`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set Database type, such as `mysql`, `redis`, `mongodb`, `postgresql`, `mariadb`, and `percona`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseType Database type, such as `mysql`, `redis`, `mongodb`, `postgresql`, `mariadb`, and `percona`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get Node type. Valid values: empty or `simple` (general node); `cluster` (cluster node).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeType Node type. Valid values: empty or `simple` (general node); `cluster` (cluster node).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Valid values: empty or `simple` (general node); `cluster` (cluster node).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeType Node type. Valid values: empty or `simple` (general node); `cluster` (cluster node).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Database information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Info Database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DBInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set Database information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Info Database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInfo(DBInfo [] Info) {
        this.Info = Info;
    }

    /**
     * Get Instance service provider, such as "aliyun" and "others".
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Supplier Instance service provider, such as "aliyun" and "others".
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set Instance service provider, such as "aliyun" and "others".
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Supplier Instance service provider, such as "aliyun" and "others".
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get For MongoDB, you can define the following parameters: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraAttr For MongoDB, you can define the following parameters: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set For MongoDB, you can define the following parameters: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraAttr For MongoDB, you can define the following parameters: 	['AuthDatabase':'admin', 
'AuthFlag': "1",	'AuthMechanism':"SCRAM-SHA-1"]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    public DBEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBEndpointInfo(DBEndpointInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Info != null) {
            this.Info = new DBInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new DBInfo(source.Info[i]);
            }
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);

    }
}

