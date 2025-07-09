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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDBEndpointInfos extends AbstractModel {

    /**
    * Region of the database
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
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
    * Database information. Note: If the data type is tdsqlmysql, the order of this Endpoint array should correspond to the set order, and the first shard (shardkey range starting from 0) must be entered first.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Info")
    @Expose
    private Endpoint [] Info;

    /**
     * Get Region of the database
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region of the database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the database
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region of the database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessType Instance network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Instance network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessType Instance network access type. Valid values: `extranet` (public network); `ipv6` (public IPv6); `cvm` (self-build on CVM); `dcg` (Direct Connect); `vpncloud` (VPN access); `cdb` (database); `ccn` (CCN); `intranet` (intranet); `vpc` (VPC). Note that the valid values are subject to the current link.
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
     * Get Database information. Note: If the data type is tdsqlmysql, the order of this Endpoint array should correspond to the set order, and the first shard (shardkey range starting from 0) must be entered first.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Info Database information. Note: If the data type is tdsqlmysql, the order of this Endpoint array should correspond to the set order, and the first shard (shardkey range starting from 0) must be entered first.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Endpoint [] getInfo() {
        return this.Info;
    }

    /**
     * Set Database information. Note: If the data type is tdsqlmysql, the order of this Endpoint array should correspond to the set order, and the first shard (shardkey range starting from 0) must be entered first.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Info Database information. Note: If the data type is tdsqlmysql, the order of this Endpoint array should correspond to the set order, and the first shard (shardkey range starting from 0) must be entered first.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInfo(Endpoint [] Info) {
        this.Info = Info;
    }

    public SyncDBEndpointInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDBEndpointInfos(SyncDBEndpointInfos source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.Info != null) {
            this.Info = new Endpoint[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new Endpoint(source.Info[i]);
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
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

