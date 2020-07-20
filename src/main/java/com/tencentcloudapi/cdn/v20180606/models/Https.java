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

public class Https extends AbstractModel{

    /**
    * HTTPS configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * HTTP2 configuration switch
on: enabled
off: disabled
Enabling HTTPS acceleration for the first time will enable HTTP2 configuration by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * OCSP configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * Client certificate authentication feature
on: enabled
off: disabled
This is disabled by default. The client certificate information is needed when enabled. This is still in beta and not generally available yet.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyClient")
    @Expose
    private String VerifyClient;

    /**
    * Server certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * Client certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private ClientCert ClientCertInfo;

    /**
    * Spdy configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spdy")
    @Expose
    private String Spdy;

    /**
    * HTTPS certificate deployment status
closed: already closed
deploying: in deployment
deployed: successfully deployed
failed: deployment failed
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SslStatus")
    @Expose
    private String SslStatus;

    /**
    * 
    */
    @SerializedName("Hsts")
    @Expose
    private Hsts Hsts;

    /**
     * Get HTTPS configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch HTTPS configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set HTTPS configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch HTTPS configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get HTTP2 configuration switch
on: enabled
off: disabled
Enabling HTTPS acceleration for the first time will enable HTTP2 configuration by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Http2 HTTP2 configuration switch
on: enabled
off: disabled
Enabling HTTPS acceleration for the first time will enable HTTP2 configuration by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set HTTP2 configuration switch
on: enabled
off: disabled
Enabling HTTPS acceleration for the first time will enable HTTP2 configuration by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Http2 HTTP2 configuration switch
on: enabled
off: disabled
Enabling HTTPS acceleration for the first time will enable HTTP2 configuration by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get OCSP configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcspStapling OCSP configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set OCSP configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcspStapling OCSP configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get Client certificate authentication feature
on: enabled
off: disabled
This is disabled by default. The client certificate information is needed when enabled. This is still in beta and not generally available yet.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VerifyClient Client certificate authentication feature
on: enabled
off: disabled
This is disabled by default. The client certificate information is needed when enabled. This is still in beta and not generally available yet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyClient() {
        return this.VerifyClient;
    }

    /**
     * Set Client certificate authentication feature
on: enabled
off: disabled
This is disabled by default. The client certificate information is needed when enabled. This is still in beta and not generally available yet.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VerifyClient Client certificate authentication feature
on: enabled
off: disabled
This is disabled by default. The client certificate information is needed when enabled. This is still in beta and not generally available yet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyClient(String VerifyClient) {
        this.VerifyClient = VerifyClient;
    }

    /**
     * Get Server certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertInfo Server certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set Server certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertInfo Server certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get Client certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientCertInfo Client certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClientCert getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set Client certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientCertInfo Client certificate configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientCertInfo(ClientCert ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get Spdy configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Spdy Spdy configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSpdy() {
        return this.Spdy;
    }

    /**
     * Set Spdy configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Spdy Spdy configuration switch
on: enabled
off: disabled
This is disabled by default
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSpdy(String Spdy) {
        this.Spdy = Spdy;
    }

    /**
     * Get HTTPS certificate deployment status
closed: already closed
deploying: in deployment
deployed: successfully deployed
failed: deployment failed
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SslStatus HTTPS certificate deployment status
closed: already closed
deploying: in deployment
deployed: successfully deployed
failed: deployment failed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSslStatus() {
        return this.SslStatus;
    }

    /**
     * Set HTTPS certificate deployment status
closed: already closed
deploying: in deployment
deployed: successfully deployed
failed: deployment failed
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SslStatus HTTPS certificate deployment status
closed: already closed
deploying: in deployment
deployed: successfully deployed
failed: deployment failed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSslStatus(String SslStatus) {
        this.SslStatus = SslStatus;
    }

    /**
     * Get  
     * @return Hsts 
     */
    public Hsts getHsts() {
        return this.Hsts;
    }

    /**
     * Set 
     * @param Hsts 
     */
    public void setHsts(Hsts Hsts) {
        this.Hsts = Hsts;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "OcspStapling", this.OcspStapling);
        this.setParamSimple(map, prefix + "VerifyClient", this.VerifyClient);
        this.setParamObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamSimple(map, prefix + "Spdy", this.Spdy);
        this.setParamSimple(map, prefix + "SslStatus", this.SslStatus);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);

    }
}

