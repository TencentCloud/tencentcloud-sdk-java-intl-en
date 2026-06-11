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
    * Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports ALL AWS S3-compatible COS origin servers.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, specify this parameter with an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the cos bucket access domain.</li>
<li>When OriginType = AWSS3, specify this parameter as the access domain of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID; when it is an output parameter, if the origin server group of other sites is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify this parameter as the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. When it is an output parameter, if the load balancing of other sites is referenced, the format is {LoadBalancer ID}@{ZoneID}, such as lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
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
    * The HTTP origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTP or follow.
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * The HTTPS origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTPS or follow.
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * Specifies whether access to the private object storage origin server is allowed. this parameter is required when the origin server type OriginType is COS or AWSS3. valid values:.
<Li>On: enable private authentication;</li>.
<li>off: disable private authentication.</li>.
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
     * Get Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports ALL AWS S3-compatible COS origin servers.</li> 
     * @return OriginType Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports ALL AWS S3-compatible COS origin servers.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports ALL AWS S3-compatible COS origin servers.</li>
     * @param OriginType Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports ALL AWS S3-compatible COS origin servers.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, specify this parameter with an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the cos bucket access domain.</li>
<li>When OriginType = AWSS3, specify this parameter as the access domain of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID; when it is an output parameter, if the origin server group of other sites is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify this parameter as the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. When it is an output parameter, if the load balancing of other sites is referenced, the format is {LoadBalancer ID}@{ZoneID}, such as lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li> 
     * @return Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, specify this parameter with an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the cos bucket access domain.</li>
<li>When OriginType = AWSS3, specify this parameter as the access domain of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID; when it is an output parameter, if the origin server group of other sites is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify this parameter as the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. When it is an output parameter, if the load balancing of other sites is referenced, the format is {LoadBalancer ID}@{ZoneID}, such as lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, specify this parameter with an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the cos bucket access domain.</li>
<li>When OriginType = AWSS3, specify this parameter as the access domain of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID; when it is an output parameter, if the origin server group of other sites is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify this parameter as the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. When it is an output parameter, if the load balancing of other sites is referenced, the format is {LoadBalancer ID}@{ZoneID}, such as lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
     * @param Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, specify this parameter with an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the cos bucket access domain.</li>
<li>When OriginType = AWSS3, specify this parameter as the access domain of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID; when it is an output parameter, if the origin server group of other sites is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify this parameter as the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. When it is an output parameter, if the load balancing of other sites is referenced, the format is {LoadBalancer ID}@{ZoneID}, such as lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
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
     * Get The HTTP origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTP or follow. 
     * @return HTTPOriginPort The HTTP origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTP or follow.
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set The HTTP origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTP or follow.
     * @param HTTPOriginPort The HTTP origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTP or follow.
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get The HTTPS origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTPS or follow. 
     * @return HTTPSOriginPort The HTTPS origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTPS or follow.
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set The HTTPS origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTPS or follow.
     * @param HTTPSOriginPort The HTTPS origin port, value ranges from 1 to 65535. this parameter is required when the origin-pull protocol OriginProtocol is HTTPS or follow.
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get Specifies whether access to the private object storage origin server is allowed. this parameter is required when the origin server type OriginType is COS or AWSS3. valid values:.
<Li>On: enable private authentication;</li>.
<li>off: disable private authentication.</li>. 
     * @return PrivateAccess Specifies whether access to the private object storage origin server is allowed. this parameter is required when the origin server type OriginType is COS or AWSS3. valid values:.
<Li>On: enable private authentication;</li>.
<li>off: disable private authentication.</li>.
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Specifies whether access to the private object storage origin server is allowed. this parameter is required when the origin server type OriginType is COS or AWSS3. valid values:.
<Li>On: enable private authentication;</li>.
<li>off: disable private authentication.</li>.
     * @param PrivateAccess Specifies whether access to the private object storage origin server is allowed. this parameter is required when the origin server type OriginType is COS or AWSS3. valid values:.
<Li>On: enable private authentication;</li>.
<li>off: disable private authentication.</li>.
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

