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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * Primary origin server list. The default format is ["ip1:port1", "ip2:port2"].
Weights can be configured in the origin server list. The weight format of IP origin servers is ["ip1:port1:weight1", "ip2:port2:weight2"].
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Primary origin server type. Valid values: domain (domain name origin server), ip (IP origin server).
This is required when setting `Origins`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Host header value during origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * Origin-pull protocol type. Valid values: http (forced HTTP origin-pull), follow (protocol follow), https (HTTPS origin-pull).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * Secondary origin server list.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * Secondary origin server type, which is the same as `OriginType`.
This is required when setting `BackupOrigins`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupOriginType")
    @Expose
    private String BackupOriginType;

    /**
     * Get Primary origin server list. The default format is ["ip1:port1", "ip2:port2"].
Weights can be configured in the origin server list. The weight format of IP origin servers is ["ip1:port1:weight1", "ip2:port2:weight2"]. 
     * @return Origins Primary origin server list. The default format is ["ip1:port1", "ip2:port2"].
Weights can be configured in the origin server list. The weight format of IP origin servers is ["ip1:port1:weight1", "ip2:port2:weight2"].
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Primary origin server list. The default format is ["ip1:port1", "ip2:port2"].
Weights can be configured in the origin server list. The weight format of IP origin servers is ["ip1:port1:weight1", "ip2:port2:weight2"].
     * @param Origins Primary origin server list. The default format is ["ip1:port1", "ip2:port2"].
Weights can be configured in the origin server list. The weight format of IP origin servers is ["ip1:port1:weight1", "ip2:port2:weight2"].
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Primary origin server type. Valid values: domain (domain name origin server), ip (IP origin server).
This is required when setting `Origins`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginType Primary origin server type. Valid values: domain (domain name origin server), ip (IP origin server).
This is required when setting `Origins`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Primary origin server type. Valid values: domain (domain name origin server), ip (IP origin server).
This is required when setting `Origins`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginType Primary origin server type. Valid values: domain (domain name origin server), ip (IP origin server).
This is required when setting `Origins`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Host header value during origin-pull.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServerName Host header value during origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Host header value during origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServerName Host header value during origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get Origin-pull protocol type. Valid values: http (forced HTTP origin-pull), follow (protocol follow), https (HTTPS origin-pull).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginPullProtocol Origin-pull protocol type. Valid values: http (forced HTTP origin-pull), follow (protocol follow), https (HTTPS origin-pull).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol type. Valid values: http (forced HTTP origin-pull), follow (protocol follow), https (HTTPS origin-pull).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginPullProtocol Origin-pull protocol type. Valid values: http (forced HTTP origin-pull), follow (protocol follow), https (HTTPS origin-pull).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get Secondary origin server list. 
     * @return BackupOrigins Secondary origin server list.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set Secondary origin server list.
     * @param BackupOrigins Secondary origin server list.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get Secondary origin server type, which is the same as `OriginType`.
This is required when setting `BackupOrigins`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BackupOriginType Secondary origin server type, which is the same as `OriginType`.
This is required when setting `BackupOrigins`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set Secondary origin server type, which is the same as `OriginType`.
This is required when setting `BackupOrigins`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BackupOriginType Secondary origin server type, which is the same as `OriginType`.
This is required when setting `BackupOrigins`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupOriginType(String BackupOriginType) {
        this.BackupOriginType = BackupOriginType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "BackupOriginType", this.BackupOriginType);

    }
}

