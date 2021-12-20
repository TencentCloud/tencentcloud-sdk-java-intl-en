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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * Master origin server list
When modifying the origin server, you need to enter the corresponding OriginType.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Primary origin server type
Input:
`domain`: domain name
`cos`: COS bucket address
`ip`: IP address
`ipv6`: a single IPv6 address
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ip_domain`: both IP addresses and domain names (only available to beta users)
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Output: 
`image`: Cloud Infinite origin
`ftp`: FTP origin (disused)
When modifying `Origins`, you need to enter the corresponding `OriginType`.
The IPv6 feature is now only available to beta users. Please submit an application to use this feature.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Host header used when accessing the master origin server. If left empty, the acceleration domain name will be used by default.
If a wildcard domain name is accessed, then the sub-domain name during the access will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * When OriginType is COS, you can specify if access to private buckets is allowed.
Note: to enable this configuration, you need to first grant CDN access to the private bucket.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPrivateAccess")
    @Expose
    private String CosPrivateAccess;

    /**
    * Origin-pull protocol configuration
http: forced HTTP origin-pull
follow: protocol follow origin-pull
https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * Backup origin server list
When modifying the backup origin server, you need to enter the corresponding BackupOriginType.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * Secondary origin type. Values:
`domain`: domain name
`ip`: IP address
When modifying `BackupOrigins`, you need to enter the corresponding `BackupOriginType`.
The following backup origin servers are only available to beta users. Submit an application if you want to become a beta user.
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupOriginType")
    @Expose
    private String BackupOriginType;

    /**
    * Host header used when accessing the backup origin server. If left empty, the ServerName of master origin server will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupServerName")
    @Expose
    private String BackupServerName;

    /**
    * 
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * Origin URL rewrite rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PathRules")
    @Expose
    private PathRule [] PathRules;

    /**
    * Path-based origin-pull configurations
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PathBasedOrigin")
    @Expose
    private PathBasedOriginRule [] PathBasedOrigin;

    /**
    * 
    */
    @SerializedName("AdvanceHttps")
    @Expose
    private AdvanceHttps AdvanceHttps;

    /**
     * Get Master origin server list
When modifying the origin server, you need to enter the corresponding OriginType.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Origins Master origin server list
When modifying the origin server, you need to enter the corresponding OriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Master origin server list
When modifying the origin server, you need to enter the corresponding OriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Origins Master origin server list
When modifying the origin server, you need to enter the corresponding OriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Primary origin server type
Input:
`domain`: domain name
`cos`: COS bucket address
`ip`: IP address
`ipv6`: a single IPv6 address
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ip_domain`: both IP addresses and domain names (only available to beta users)
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Output: 
`image`: Cloud Infinite origin
`ftp`: FTP origin (disused)
When modifying `Origins`, you need to enter the corresponding `OriginType`.
The IPv6 feature is now only available to beta users. Please submit an application to use this feature.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OriginType Primary origin server type
Input:
`domain`: domain name
`cos`: COS bucket address
`ip`: IP address
`ipv6`: a single IPv6 address
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ip_domain`: both IP addresses and domain names (only available to beta users)
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Output: 
`image`: Cloud Infinite origin
`ftp`: FTP origin (disused)
When modifying `Origins`, you need to enter the corresponding `OriginType`.
The IPv6 feature is now only available to beta users. Please submit an application to use this feature.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Primary origin server type
Input:
`domain`: domain name
`cos`: COS bucket address
`ip`: IP address
`ipv6`: a single IPv6 address
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ip_domain`: both IP addresses and domain names (only available to beta users)
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Output: 
`image`: Cloud Infinite origin
`ftp`: FTP origin (disused)
When modifying `Origins`, you need to enter the corresponding `OriginType`.
The IPv6 feature is now only available to beta users. Please submit an application to use this feature.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OriginType Primary origin server type
Input:
`domain`: domain name
`cos`: COS bucket address
`ip`: IP address
`ipv6`: a single IPv6 address
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ip_domain`: both IP addresses and domain names (only available to beta users)
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Output: 
`image`: Cloud Infinite origin
`ftp`: FTP origin (disused)
When modifying `Origins`, you need to enter the corresponding `OriginType`.
The IPv6 feature is now only available to beta users. Please submit an application to use this feature.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Host header used when accessing the master origin server. If left empty, the acceleration domain name will be used by default.
If a wildcard domain name is accessed, then the sub-domain name during the access will be used by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServerName Host header used when accessing the master origin server. If left empty, the acceleration domain name will be used by default.
If a wildcard domain name is accessed, then the sub-domain name during the access will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Host header used when accessing the master origin server. If left empty, the acceleration domain name will be used by default.
If a wildcard domain name is accessed, then the sub-domain name during the access will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServerName Host header used when accessing the master origin server. If left empty, the acceleration domain name will be used by default.
If a wildcard domain name is accessed, then the sub-domain name during the access will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get When OriginType is COS, you can specify if access to private buckets is allowed.
Note: to enable this configuration, you need to first grant CDN access to the private bucket.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CosPrivateAccess When OriginType is COS, you can specify if access to private buckets is allowed.
Note: to enable this configuration, you need to first grant CDN access to the private bucket.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCosPrivateAccess() {
        return this.CosPrivateAccess;
    }

    /**
     * Set When OriginType is COS, you can specify if access to private buckets is allowed.
Note: to enable this configuration, you need to first grant CDN access to the private bucket.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CosPrivateAccess When OriginType is COS, you can specify if access to private buckets is allowed.
Note: to enable this configuration, you need to first grant CDN access to the private bucket.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCosPrivateAccess(String CosPrivateAccess) {
        this.CosPrivateAccess = CosPrivateAccess;
    }

    /**
     * Get Origin-pull protocol configuration
http: forced HTTP origin-pull
follow: protocol follow origin-pull
https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginPullProtocol Origin-pull protocol configuration
http: forced HTTP origin-pull
follow: protocol follow origin-pull
https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol configuration
http: forced HTTP origin-pull
follow: protocol follow origin-pull
https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginPullProtocol Origin-pull protocol configuration
http: forced HTTP origin-pull
follow: protocol follow origin-pull
https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get Backup origin server list
When modifying the backup origin server, you need to enter the corresponding BackupOriginType.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BackupOrigins Backup origin server list
When modifying the backup origin server, you need to enter the corresponding BackupOriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set Backup origin server list
When modifying the backup origin server, you need to enter the corresponding BackupOriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BackupOrigins Backup origin server list
When modifying the backup origin server, you need to enter the corresponding BackupOriginType.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get Secondary origin type. Values:
`domain`: domain name
`ip`: IP address
When modifying `BackupOrigins`, you need to enter the corresponding `BackupOriginType`.
The following backup origin servers are only available to beta users. Submit an application if you want to become a beta user.
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BackupOriginType Secondary origin type. Values:
`domain`: domain name
`ip`: IP address
When modifying `BackupOrigins`, you need to enter the corresponding `BackupOriginType`.
The following backup origin servers are only available to beta users. Submit an application if you want to become a beta user.
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set Secondary origin type. Values:
`domain`: domain name
`ip`: IP address
When modifying `BackupOrigins`, you need to enter the corresponding `BackupOriginType`.
The following backup origin servers are only available to beta users. Submit an application if you want to become a beta user.
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BackupOriginType Secondary origin type. Values:
`domain`: domain name
`ip`: IP address
When modifying `BackupOrigins`, you need to enter the corresponding `BackupOriginType`.
The following backup origin servers are only available to beta users. Submit an application if you want to become a beta user.
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6`: multiple IPv4 addresses and one IPv6 address
`ipv6_domain`: multiple IPv6 addresses and one domain name
`ip_ipv6_domain`: multiple IPv4 and IPv6 addresses and one domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBackupOriginType(String BackupOriginType) {
        this.BackupOriginType = BackupOriginType;
    }

    /**
     * Get Host header used when accessing the backup origin server. If left empty, the ServerName of master origin server will be used by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BackupServerName Host header used when accessing the backup origin server. If left empty, the ServerName of master origin server will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupServerName() {
        return this.BackupServerName;
    }

    /**
     * Set Host header used when accessing the backup origin server. If left empty, the ServerName of master origin server will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BackupServerName Host header used when accessing the backup origin server. If left empty, the ServerName of master origin server will be used by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupServerName(String BackupServerName) {
        this.BackupServerName = BackupServerName;
    }

    /**
     * Get  
     * @return BasePath 
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set 
     * @param BasePath 
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get Origin URL rewrite rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PathRules Origin URL rewrite rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public PathRule [] getPathRules() {
        return this.PathRules;
    }

    /**
     * Set Origin URL rewrite rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PathRules Origin URL rewrite rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPathRules(PathRule [] PathRules) {
        this.PathRules = PathRules;
    }

    /**
     * Get Path-based origin-pull configurations
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PathBasedOrigin Path-based origin-pull configurations
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public PathBasedOriginRule [] getPathBasedOrigin() {
        return this.PathBasedOrigin;
    }

    /**
     * Set Path-based origin-pull configurations
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PathBasedOrigin Path-based origin-pull configurations
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPathBasedOrigin(PathBasedOriginRule [] PathBasedOrigin) {
        this.PathBasedOrigin = PathBasedOrigin;
    }

    /**
     * Get  
     * @return AdvanceHttps 
     */
    public AdvanceHttps getAdvanceHttps() {
        return this.AdvanceHttps;
    }

    /**
     * Set 
     * @param AdvanceHttps 
     */
    public void setAdvanceHttps(AdvanceHttps AdvanceHttps) {
        this.AdvanceHttps = AdvanceHttps;
    }

    public Origin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Origin(Origin source) {
        if (source.Origins != null) {
            this.Origins = new String[source.Origins.length];
            for (int i = 0; i < source.Origins.length; i++) {
                this.Origins[i] = new String(source.Origins[i]);
            }
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.CosPrivateAccess != null) {
            this.CosPrivateAccess = new String(source.CosPrivateAccess);
        }
        if (source.OriginPullProtocol != null) {
            this.OriginPullProtocol = new String(source.OriginPullProtocol);
        }
        if (source.BackupOrigins != null) {
            this.BackupOrigins = new String[source.BackupOrigins.length];
            for (int i = 0; i < source.BackupOrigins.length; i++) {
                this.BackupOrigins[i] = new String(source.BackupOrigins[i]);
            }
        }
        if (source.BackupOriginType != null) {
            this.BackupOriginType = new String(source.BackupOriginType);
        }
        if (source.BackupServerName != null) {
            this.BackupServerName = new String(source.BackupServerName);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.PathRules != null) {
            this.PathRules = new PathRule[source.PathRules.length];
            for (int i = 0; i < source.PathRules.length; i++) {
                this.PathRules[i] = new PathRule(source.PathRules[i]);
            }
        }
        if (source.PathBasedOrigin != null) {
            this.PathBasedOrigin = new PathBasedOriginRule[source.PathBasedOrigin.length];
            for (int i = 0; i < source.PathBasedOrigin.length; i++) {
                this.PathBasedOrigin[i] = new PathBasedOriginRule(source.PathBasedOrigin[i]);
            }
        }
        if (source.AdvanceHttps != null) {
            this.AdvanceHttps = new AdvanceHttps(source.AdvanceHttps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "CosPrivateAccess", this.CosPrivateAccess);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "BackupOriginType", this.BackupOriginType);
        this.setParamSimple(map, prefix + "BackupServerName", this.BackupServerName);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamArrayObj(map, prefix + "PathRules.", this.PathRules);
        this.setParamArrayObj(map, prefix + "PathBasedOrigin.", this.PathBasedOrigin);
        this.setParamObj(map, prefix + "AdvanceHttps.", this.AdvanceHttps);

    }
}

