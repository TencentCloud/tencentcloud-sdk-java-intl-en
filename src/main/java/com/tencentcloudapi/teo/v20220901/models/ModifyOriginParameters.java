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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOriginParameters extends AbstractModel {

    /**
    * The origin type. values:.
<Li>IPDomain: ipv4, ipv6, or domain name type origin server;</li>.
<Li>OriginGroup: origin server group type origin server;</li>.
<Li>LoadBalance: cloud load balancer (clb), this feature is in beta test. to use it, please submit a ticket or contact smart customer service;</li>.
<Li>COS: tencent cloud COS origin server;</li>.
<Li>AWSS3: all object storage origin servers that support the aws s3 protocol.</li>.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, which varies according to the value of origintype:.
<Li>When origintype = ipdomain, fill in an ipv4 address, an ipv6 address, or a domain name;</li>.
<Li>When origintype = cos, please fill in the access domain name of the cos bucket;</li>.
<Li>When origintype = awss3, fill in the access domain name of the s3 bucket;</li>.
<Li>When origintype = origingroup, fill in the origin server group id;</li>.
<Li>When origintype = loadbalance, fill in the cloud load balancer instance id. this feature is currently only available to the allowlist.</li>.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Origin-Pull protocol configuration. this parameter is required when origintype is ipdomain, origingroup, or loadbalance. valid values are:.
<Li>Http: use http protocol;</li>.
<Li>Https: use https protocol;</li>.
<Li>Follow: follow the protocol.</li>.
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * Ports for http origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is http or follow.
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * Ports for https origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is https or follow.
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * Whether access to the private object storage origin server is allowed. this parameter is valid only when the origin server type origintype is COS or awss3. valid values:.
<Li>On: enable private authentication;</li>.
<Li>Off: disable private authentication.</li> if not specified, the default value is off.
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Private authentication parameter. this parameter is valid only when origintype = awss3 and privateaccess = on.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private OriginPrivateParameters PrivateParameters;

    /**
     * Get The origin type. values:.
<Li>IPDomain: ipv4, ipv6, or domain name type origin server;</li>.
<Li>OriginGroup: origin server group type origin server;</li>.
<Li>LoadBalance: cloud load balancer (clb), this feature is in beta test. to use it, please submit a ticket or contact smart customer service;</li>.
<Li>COS: tencent cloud COS origin server;</li>.
<Li>AWSS3: all object storage origin servers that support the aws s3 protocol.</li>. 
     * @return OriginType The origin type. values:.
<Li>IPDomain: ipv4, ipv6, or domain name type origin server;</li>.
<Li>OriginGroup: origin server group type origin server;</li>.
<Li>LoadBalance: cloud load balancer (clb), this feature is in beta test. to use it, please submit a ticket or contact smart customer service;</li>.
<Li>COS: tencent cloud COS origin server;</li>.
<Li>AWSS3: all object storage origin servers that support the aws s3 protocol.</li>.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin type. values:.
<Li>IPDomain: ipv4, ipv6, or domain name type origin server;</li>.
<Li>OriginGroup: origin server group type origin server;</li>.
<Li>LoadBalance: cloud load balancer (clb), this feature is in beta test. to use it, please submit a ticket or contact smart customer service;</li>.
<Li>COS: tencent cloud COS origin server;</li>.
<Li>AWSS3: all object storage origin servers that support the aws s3 protocol.</li>.
     * @param OriginType The origin type. values:.
<Li>IPDomain: ipv4, ipv6, or domain name type origin server;</li>.
<Li>OriginGroup: origin server group type origin server;</li>.
<Li>LoadBalance: cloud load balancer (clb), this feature is in beta test. to use it, please submit a ticket or contact smart customer service;</li>.
<Li>COS: tencent cloud COS origin server;</li>.
<Li>AWSS3: all object storage origin servers that support the aws s3 protocol.</li>.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, which varies according to the value of origintype:.
<Li>When origintype = ipdomain, fill in an ipv4 address, an ipv6 address, or a domain name;</li>.
<Li>When origintype = cos, please fill in the access domain name of the cos bucket;</li>.
<Li>When origintype = awss3, fill in the access domain name of the s3 bucket;</li>.
<Li>When origintype = origingroup, fill in the origin server group id;</li>.
<Li>When origintype = loadbalance, fill in the cloud load balancer instance id. this feature is currently only available to the allowlist.</li>. 
     * @return Origin Origin server address, which varies according to the value of origintype:.
<Li>When origintype = ipdomain, fill in an ipv4 address, an ipv6 address, or a domain name;</li>.
<Li>When origintype = cos, please fill in the access domain name of the cos bucket;</li>.
<Li>When origintype = awss3, fill in the access domain name of the s3 bucket;</li>.
<Li>When origintype = origingroup, fill in the origin server group id;</li>.
<Li>When origintype = loadbalance, fill in the cloud load balancer instance id. this feature is currently only available to the allowlist.</li>.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies according to the value of origintype:.
<Li>When origintype = ipdomain, fill in an ipv4 address, an ipv6 address, or a domain name;</li>.
<Li>When origintype = cos, please fill in the access domain name of the cos bucket;</li>.
<Li>When origintype = awss3, fill in the access domain name of the s3 bucket;</li>.
<Li>When origintype = origingroup, fill in the origin server group id;</li>.
<Li>When origintype = loadbalance, fill in the cloud load balancer instance id. this feature is currently only available to the allowlist.</li>.
     * @param Origin Origin server address, which varies according to the value of origintype:.
<Li>When origintype = ipdomain, fill in an ipv4 address, an ipv6 address, or a domain name;</li>.
<Li>When origintype = cos, please fill in the access domain name of the cos bucket;</li>.
<Li>When origintype = awss3, fill in the access domain name of the s3 bucket;</li>.
<Li>When origintype = origingroup, fill in the origin server group id;</li>.
<Li>When origintype = loadbalance, fill in the cloud load balancer instance id. this feature is currently only available to the allowlist.</li>.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Origin-Pull protocol configuration. this parameter is required when origintype is ipdomain, origingroup, or loadbalance. valid values are:.
<Li>Http: use http protocol;</li>.
<Li>Https: use https protocol;</li>.
<Li>Follow: follow the protocol.</li>. 
     * @return OriginProtocol Origin-Pull protocol configuration. this parameter is required when origintype is ipdomain, origingroup, or loadbalance. valid values are:.
<Li>Http: use http protocol;</li>.
<Li>Https: use https protocol;</li>.
<Li>Follow: follow the protocol.</li>.
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-Pull protocol configuration. this parameter is required when origintype is ipdomain, origingroup, or loadbalance. valid values are:.
<Li>Http: use http protocol;</li>.
<Li>Https: use https protocol;</li>.
<Li>Follow: follow the protocol.</li>.
     * @param OriginProtocol Origin-Pull protocol configuration. this parameter is required when origintype is ipdomain, origingroup, or loadbalance. valid values are:.
<Li>Http: use http protocol;</li>.
<Li>Https: use https protocol;</li>.
<Li>Follow: follow the protocol.</li>.
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get Ports for http origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is http or follow. 
     * @return HTTPOriginPort Ports for http origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is http or follow.
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set Ports for http origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is http or follow.
     * @param HTTPOriginPort Ports for http origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is http or follow.
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get Ports for https origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is https or follow. 
     * @return HTTPSOriginPort Ports for https origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is https or follow.
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set Ports for https origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is https or follow.
     * @param HTTPSOriginPort Ports for https origin-pull requests. value range: 1-65535. this parameter takes effect only when the origin-pull protocol originprotocol is https or follow.
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get Whether access to the private object storage origin server is allowed. this parameter is valid only when the origin server type origintype is COS or awss3. valid values:.
<Li>On: enable private authentication;</li>.
<Li>Off: disable private authentication.</li> if not specified, the default value is off. 
     * @return PrivateAccess Whether access to the private object storage origin server is allowed. this parameter is valid only when the origin server type origintype is COS or awss3. valid values:.
<Li>On: enable private authentication;</li>.
<Li>Off: disable private authentication.</li> if not specified, the default value is off.
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Whether access to the private object storage origin server is allowed. this parameter is valid only when the origin server type origintype is COS or awss3. valid values:.
<Li>On: enable private authentication;</li>.
<Li>Off: disable private authentication.</li> if not specified, the default value is off.
     * @param PrivateAccess Whether access to the private object storage origin server is allowed. this parameter is valid only when the origin server type origintype is COS or awss3. valid values:.
<Li>On: enable private authentication;</li>.
<Li>Off: disable private authentication.</li> if not specified, the default value is off.
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Private authentication parameter. this parameter is valid only when origintype = awss3 and privateaccess = on.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return PrivateParameters Private authentication parameter. this parameter is valid only when origintype = awss3 and privateaccess = on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public OriginPrivateParameters getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. this parameter is valid only when origintype = awss3 and privateaccess = on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param PrivateParameters Private authentication parameter. this parameter is valid only when origintype = awss3 and privateaccess = on.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setPrivateParameters(OriginPrivateParameters PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public ModifyOriginParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginParameters(ModifyOriginParameters source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HTTPOriginPort != null) {
            this.HTTPOriginPort = new Long(source.HTTPOriginPort);
        }
        if (source.HTTPSOriginPort != null) {
            this.HTTPSOriginPort = new Long(source.HTTPSOriginPort);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new OriginPrivateParameters(source.PrivateParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HTTPOriginPort", this.HTTPOriginPort);
        this.setParamSimple(map, prefix + "HTTPSOriginPort", this.HTTPSOriginPort);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

