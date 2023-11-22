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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel {

    /**
    * List of main origin sites. When modifying the main origin site, the corresponding OriginType needs to be filled in at the same time.
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Main origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * When returning to the main origin server, the Host header will default to the accelerated domain name if it is not filled in. When the origin server type is object storage, the ServerName field is required.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * Back-to-origin protocol configuration: <li>http: Forces HTTP back-to-origin;</li> <li>follow: The protocol follows back-to-origin;</li> <li>https: Forces https back-to-origin, and https back-to-origin only supports origin. Station port 443. </li>
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * Backup source site list. When modifying the backup origin site, the corresponding OriginType needs to be filled in at the same time.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * Backup origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
    */
    @SerializedName("BackupOriginType")
    @Expose
    private String BackupOriginType;

    /**
    * Host header used when accessing the backup origin server. If it is left empty, the ServerName of primary origin server will be used by default. Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BackupServerName")
    @Expose
    private String BackupServerName;

    /**
    * Object storage back to the origin vendor. Required when the origin site type is a third-party storage origin site (third_party). Optional values u200bu200binclude the following: <li>aws_s3: AWS S3;</li> <li>ali_oss: Alibaba Cloud OSS; </li> <li>hw_obs: Huawei OBS;</li> <li>others: object storage from other manufacturers, only supports object storage compatible with AWS signature algorithm, such as Tencent Cloud COS. </li>
    */
    @SerializedName("OriginCompany")
    @Expose
    private String OriginCompany;

    /**
     * Get List of main origin sites. When modifying the main origin site, the corresponding OriginType needs to be filled in at the same time. 
     * @return Origins List of main origin sites. When modifying the main origin site, the corresponding OriginType needs to be filled in at the same time.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set List of main origin sites. When modifying the main origin site, the corresponding OriginType needs to be filled in at the same time.
     * @param Origins List of main origin sites. When modifying the main origin site, the corresponding OriginType needs to be filled in at the same time.
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Main origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li> 
     * @return OriginType Main origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Main origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     * @param OriginType Main origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get When returning to the main origin server, the Host header will default to the accelerated domain name if it is not filled in. When the origin server type is object storage, the ServerName field is required. 
     * @return ServerName When returning to the main origin server, the Host header will default to the accelerated domain name if it is not filled in. When the origin server type is object storage, the ServerName field is required.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set When returning to the main origin server, the Host header will default to the accelerated domain name if it is not filled in. When the origin server type is object storage, the ServerName field is required.
     * @param ServerName When returning to the main origin server, the Host header will default to the accelerated domain name if it is not filled in. When the origin server type is object storage, the ServerName field is required.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get Back-to-origin protocol configuration: <li>http: Forces HTTP back-to-origin;</li> <li>follow: The protocol follows back-to-origin;</li> <li>https: Forces https back-to-origin, and https back-to-origin only supports origin. Station port 443. </li> 
     * @return OriginPullProtocol Back-to-origin protocol configuration: <li>http: Forces HTTP back-to-origin;</li> <li>follow: The protocol follows back-to-origin;</li> <li>https: Forces https back-to-origin, and https back-to-origin only supports origin. Station port 443. </li>
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Back-to-origin protocol configuration: <li>http: Forces HTTP back-to-origin;</li> <li>follow: The protocol follows back-to-origin;</li> <li>https: Forces https back-to-origin, and https back-to-origin only supports origin. Station port 443. </li>
     * @param OriginPullProtocol Back-to-origin protocol configuration: <li>http: Forces HTTP back-to-origin;</li> <li>follow: The protocol follows back-to-origin;</li> <li>https: Forces https back-to-origin, and https back-to-origin only supports origin. Station port 443. </li>
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get Backup source site list. When modifying the backup origin site, the corresponding OriginType needs to be filled in at the same time. 
     * @return BackupOrigins Backup source site list. When modifying the backup origin site, the corresponding OriginType needs to be filled in at the same time.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set Backup source site list. When modifying the backup origin site, the corresponding OriginType needs to be filled in at the same time.
     * @param BackupOrigins Backup source site list. When modifying the backup origin site, the corresponding OriginType needs to be filled in at the same time.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get Backup origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li> 
     * @return BackupOriginType Backup origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set Backup origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     * @param BackupOriginType Backup origin site type, input parameters support the following types: <li>domain: domain name type;</li> <li>ip: IP list as the origin site;</li> <li>third_party: third-party storage origin site . </li>
     */
    public void setBackupOriginType(String BackupOriginType) {
        this.BackupOriginType = BackupOriginType;
    }

    /**
     * Get Host header used when accessing the backup origin server. If it is left empty, the ServerName of primary origin server will be used by default. Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BackupServerName Host header used when accessing the backup origin server. If it is left empty, the ServerName of primary origin server will be used by default. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBackupServerName() {
        return this.BackupServerName;
    }

    /**
     * Set Host header used when accessing the backup origin server. If it is left empty, the ServerName of primary origin server will be used by default. Note: This field may return null, indicating that no valid value can be obtained.
     * @param BackupServerName Host header used when accessing the backup origin server. If it is left empty, the ServerName of primary origin server will be used by default. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBackupServerName(String BackupServerName) {
        this.BackupServerName = BackupServerName;
    }

    /**
     * Get Object storage back to the origin vendor. Required when the origin site type is a third-party storage origin site (third_party). Optional values u200bu200binclude the following: <li>aws_s3: AWS S3;</li> <li>ali_oss: Alibaba Cloud OSS; </li> <li>hw_obs: Huawei OBS;</li> <li>others: object storage from other manufacturers, only supports object storage compatible with AWS signature algorithm, such as Tencent Cloud COS. </li> 
     * @return OriginCompany Object storage back to the origin vendor. Required when the origin site type is a third-party storage origin site (third_party). Optional values u200bu200binclude the following: <li>aws_s3: AWS S3;</li> <li>ali_oss: Alibaba Cloud OSS; </li> <li>hw_obs: Huawei OBS;</li> <li>others: object storage from other manufacturers, only supports object storage compatible with AWS signature algorithm, such as Tencent Cloud COS. </li>
     */
    public String getOriginCompany() {
        return this.OriginCompany;
    }

    /**
     * Set Object storage back to the origin vendor. Required when the origin site type is a third-party storage origin site (third_party). Optional values u200bu200binclude the following: <li>aws_s3: AWS S3;</li> <li>ali_oss: Alibaba Cloud OSS; </li> <li>hw_obs: Huawei OBS;</li> <li>others: object storage from other manufacturers, only supports object storage compatible with AWS signature algorithm, such as Tencent Cloud COS. </li>
     * @param OriginCompany Object storage back to the origin vendor. Required when the origin site type is a third-party storage origin site (third_party). Optional values u200bu200binclude the following: <li>aws_s3: AWS S3;</li> <li>ali_oss: Alibaba Cloud OSS; </li> <li>hw_obs: Huawei OBS;</li> <li>others: object storage from other manufacturers, only supports object storage compatible with AWS signature algorithm, such as Tencent Cloud COS. </li>
     */
    public void setOriginCompany(String OriginCompany) {
        this.OriginCompany = OriginCompany;
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
        if (source.OriginCompany != null) {
            this.OriginCompany = new String(source.OriginCompany);
        }
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
        this.setParamSimple(map, prefix + "BackupServerName", this.BackupServerName);
        this.setParamSimple(map, prefix + "OriginCompany", this.OriginCompany);

    }
}

