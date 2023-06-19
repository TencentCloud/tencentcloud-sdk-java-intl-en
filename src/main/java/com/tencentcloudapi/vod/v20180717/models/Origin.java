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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * Primary origin server list When modifying the origin server, you need to enter the corresponding OriginType. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Primary origin server type The following types are supported for input parameters: <li> domain:domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Host header used when accessing the primary origin server. If it is left empty, the acceleration domain name will be used by default.When the origin server type is object storage, the ServerName field is required.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * Origin-pull protocol configuration http: forced HTTP origin-pull follow: protocol follow origin-pull https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull. Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * Backup origin server list When modifying the backup origin server, you need to enter the corresponding BackupOriginType. Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    *  Backup origin server type, which supports the following types: <li>domain：Domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
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
    * The object storage returns to the source vendor. It is required when the source site type is a third-party storage source site (third_party). The optional values include the following:<li>aws_s3：AWS S3;</li> <li>ali_oss：Alibaba Cloud OSS;</li> <li>hw_obs：Huawei OBS;</li> <li>others：Object storage from other vendors only supports object storage compatible with the AWS signature algorithm, such as Tencent Cloud COS.</li>
    */
    @SerializedName("OriginCompany")
    @Expose
    private String OriginCompany;

    /**
     * Get Primary origin server list When modifying the origin server, you need to enter the corresponding OriginType. Note: This field may return null, indicating that no valid value was found. 
     * @return Origins Primary origin server list When modifying the origin server, you need to enter the corresponding OriginType. Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Primary origin server list When modifying the origin server, you need to enter the corresponding OriginType. Note: This field may return null, indicating that no valid value was found.
     * @param Origins Primary origin server list When modifying the origin server, you need to enter the corresponding OriginType. Note: This field may return null, indicating that no valid value was found.
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Primary origin server type The following types are supported for input parameters: <li> domain:domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li> 
     * @return OriginType Primary origin server type The following types are supported for input parameters: <li> domain:domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Primary origin server type The following types are supported for input parameters: <li> domain:domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
     * @param OriginType Primary origin server type The following types are supported for input parameters: <li> domain:domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Host header used when accessing the primary origin server. If it is left empty, the acceleration domain name will be used by default.When the origin server type is object storage, the ServerName field is required. 
     * @return ServerName Host header used when accessing the primary origin server. If it is left empty, the acceleration domain name will be used by default.When the origin server type is object storage, the ServerName field is required.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Host header used when accessing the primary origin server. If it is left empty, the acceleration domain name will be used by default.When the origin server type is object storage, the ServerName field is required.
     * @param ServerName Host header used when accessing the primary origin server. If it is left empty, the acceleration domain name will be used by default.When the origin server type is object storage, the ServerName field is required.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get Origin-pull protocol configuration http: forced HTTP origin-pull follow: protocol follow origin-pull https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull. Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginPullProtocol Origin-pull protocol configuration http: forced HTTP origin-pull follow: protocol follow origin-pull https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol configuration http: forced HTTP origin-pull follow: protocol follow origin-pull https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull. Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginPullProtocol Origin-pull protocol configuration http: forced HTTP origin-pull follow: protocol follow origin-pull https: forced HTTPS origin-pull. This only supports origin server port 443 for origin-pull. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get Backup origin server list When modifying the backup origin server, you need to enter the corresponding BackupOriginType. Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BackupOrigins Backup origin server list When modifying the backup origin server, you need to enter the corresponding BackupOriginType. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set Backup origin server list When modifying the backup origin server, you need to enter the corresponding BackupOriginType. Note: This field may return null, indicating that no valid value can be obtained.
     * @param BackupOrigins Backup origin server list When modifying the backup origin server, you need to enter the corresponding BackupOriginType. Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get  Backup origin server type, which supports the following types: <li>domain：Domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li> 
     * @return BackupOriginType  Backup origin server type, which supports the following types: <li>domain：Domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set  Backup origin server type, which supports the following types: <li>domain：Domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
     * @param BackupOriginType  Backup origin server type, which supports the following types: <li>domain：Domain；</li> <li>ip：IP address；</li> <li>third_party：third-party object storage origin.</li>
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
     * Get The object storage returns to the source vendor. It is required when the source site type is a third-party storage source site (third_party). The optional values include the following:<li>aws_s3：AWS S3;</li> <li>ali_oss：Alibaba Cloud OSS;</li> <li>hw_obs：Huawei OBS;</li> <li>others：Object storage from other vendors only supports object storage compatible with the AWS signature algorithm, such as Tencent Cloud COS.</li> 
     * @return OriginCompany The object storage returns to the source vendor. It is required when the source site type is a third-party storage source site (third_party). The optional values include the following:<li>aws_s3：AWS S3;</li> <li>ali_oss：Alibaba Cloud OSS;</li> <li>hw_obs：Huawei OBS;</li> <li>others：Object storage from other vendors only supports object storage compatible with the AWS signature algorithm, such as Tencent Cloud COS.</li>
     */
    public String getOriginCompany() {
        return this.OriginCompany;
    }

    /**
     * Set The object storage returns to the source vendor. It is required when the source site type is a third-party storage source site (third_party). The optional values include the following:<li>aws_s3：AWS S3;</li> <li>ali_oss：Alibaba Cloud OSS;</li> <li>hw_obs：Huawei OBS;</li> <li>others：Object storage from other vendors only supports object storage compatible with the AWS signature algorithm, such as Tencent Cloud COS.</li>
     * @param OriginCompany The object storage returns to the source vendor. It is required when the source site type is a third-party storage source site (third_party). The optional values include the following:<li>aws_s3：AWS S3;</li> <li>ali_oss：Alibaba Cloud OSS;</li> <li>hw_obs：Huawei OBS;</li> <li>others：Object storage from other vendors only supports object storage compatible with the AWS signature algorithm, such as Tencent Cloud COS.</li>
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

