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
    * Database region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance network access type. For example: extranet (public network), ipv6 (public network ipv6), cvm (self-built CVM), dcg (DC), vpncloud (instance accessed via VPN), cdb (cloud database), ccn (CCN), intranet (self-developed cloud migration), and vpc (VPC). Note that the specific valid values depend on the current linkage.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Instance database type. For example: mysql, redis, mongodb, postgresql, mariadb, and percona.
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * Database information. Note: If the database type is tdsqlmysql, the order of the Endpoint array should follow the following rule: proxy nodes are placed before set nodes. If SrcConnectType selects proxy access, only the proxy node needs to be filled. If set access is selected, the first set node in the array should be the shard with a shardkey range starting from 0.
    */
    @SerializedName("Info")
    @Expose
    private Endpoint [] Info;

    /**
     * Get Database region 
     * @return Region Database region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Database region
     * @param Region Database region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance network access type. For example: extranet (public network), ipv6 (public network ipv6), cvm (self-built CVM), dcg (DC), vpncloud (instance accessed via VPN), cdb (cloud database), ccn (CCN), intranet (self-developed cloud migration), and vpc (VPC). Note that the specific valid values depend on the current linkage. 
     * @return AccessType Instance network access type. For example: extranet (public network), ipv6 (public network ipv6), cvm (self-built CVM), dcg (DC), vpncloud (instance accessed via VPN), cdb (cloud database), ccn (CCN), intranet (self-developed cloud migration), and vpc (VPC). Note that the specific valid values depend on the current linkage.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Instance network access type. For example: extranet (public network), ipv6 (public network ipv6), cvm (self-built CVM), dcg (DC), vpncloud (instance accessed via VPN), cdb (cloud database), ccn (CCN), intranet (self-developed cloud migration), and vpc (VPC). Note that the specific valid values depend on the current linkage.
     * @param AccessType Instance network access type. For example: extranet (public network), ipv6 (public network ipv6), cvm (self-built CVM), dcg (DC), vpncloud (instance accessed via VPN), cdb (cloud database), ccn (CCN), intranet (self-developed cloud migration), and vpc (VPC). Note that the specific valid values depend on the current linkage.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Instance database type. For example: mysql, redis, mongodb, postgresql, mariadb, and percona. 
     * @return DatabaseType Instance database type. For example: mysql, redis, mongodb, postgresql, mariadb, and percona.
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set Instance database type. For example: mysql, redis, mongodb, postgresql, mariadb, and percona.
     * @param DatabaseType Instance database type. For example: mysql, redis, mongodb, postgresql, mariadb, and percona.
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get Database information. Note: If the database type is tdsqlmysql, the order of the Endpoint array should follow the following rule: proxy nodes are placed before set nodes. If SrcConnectType selects proxy access, only the proxy node needs to be filled. If set access is selected, the first set node in the array should be the shard with a shardkey range starting from 0. 
     * @return Info Database information. Note: If the database type is tdsqlmysql, the order of the Endpoint array should follow the following rule: proxy nodes are placed before set nodes. If SrcConnectType selects proxy access, only the proxy node needs to be filled. If set access is selected, the first set node in the array should be the shard with a shardkey range starting from 0.
     */
    public Endpoint [] getInfo() {
        return this.Info;
    }

    /**
     * Set Database information. Note: If the database type is tdsqlmysql, the order of the Endpoint array should follow the following rule: proxy nodes are placed before set nodes. If SrcConnectType selects proxy access, only the proxy node needs to be filled. If set access is selected, the first set node in the array should be the shard with a shardkey range starting from 0.
     * @param Info Database information. Note: If the database type is tdsqlmysql, the order of the Endpoint array should follow the following rule: proxy nodes are placed before set nodes. If SrcConnectType selects proxy access, only the proxy node needs to be filled. If set access is selected, the first set node in the array should be the shard with a shardkey range starting from 0.
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

