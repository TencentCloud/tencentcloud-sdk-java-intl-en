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
<li>AWSS3: supports all COS origin servers using the AWS S3 protocol.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, fill in an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the access domain of the COS bucket;</li>
<li>When OriginType = AWSS3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID. As an output parameter, if an origin server group from another site is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. As an output parameter, if a load balancer from another site is referenced, the format is {load balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Origin-pull protocol configuration. This parameter is required when OriginType is IPDomain, OriginGroup, or LoadBalance. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Use HTTPS protocol;</li>
<li>follow: follow protocol.</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP origin-pull port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * HTTPS origin-pull port, value range: 1–65535. This parameter is required when OriginProtocol is https or follow.
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * Whether access to the private object storage origin server is allowed. This parameter is required when the origin server type OriginType is COS or AWSS3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Private authentication parameter. This parameter is valid only when OriginType = AWSS3 and PrivateAccess = on.
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
<li>AWSS3: supports all COS origin servers using the AWS S3 protocol.</li> 
     * @return OriginType Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports all COS origin servers using the AWS S3 protocol.</li>
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
<li>AWSS3: supports all COS origin servers using the AWS S3 protocol.</li>
     * @param OriginType Origin server type. Valid values:
<li>IPDomain: IPV4, IPV6, or domain type origin server;</li>
<li>OriginGroup: origin server group type origin server;</li>
<li>LoadBalance: load balancing. This feature is in beta test. If needed, submit a ticket;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWSS3: supports all COS origin servers using the AWS S3 protocol.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, fill in an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the access domain of the COS bucket;</li>
<li>When OriginType = AWSS3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID. As an output parameter, if an origin server group from another site is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. As an output parameter, if a load balancer from another site is referenced, the format is {load balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li> 
     * @return Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, fill in an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the access domain of the COS bucket;</li>
<li>When OriginType = AWSS3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID. As an output parameter, if an origin server group from another site is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. As an output parameter, if a load balancer from another site is referenced, the format is {load balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, fill in an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the access domain of the COS bucket;</li>
<li>When OriginType = AWSS3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID. As an output parameter, if an origin server group from another site is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. As an output parameter, if a load balancer from another site is referenced, the format is {load balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
     * @param Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IPDomain, fill in an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When OriginType = COS, specify the access domain of the COS bucket;</li>
<li>When OriginType = AWSS3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = OriginGroup, fill in the origin server group ID. As an output parameter, if an origin server group from another site is referenced, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType = LoadBalance, specify the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist. As an output parameter, if a load balancer from another site is referenced, the format is {load balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Origin-pull protocol configuration. This parameter is required when OriginType is IPDomain, OriginGroup, or LoadBalance. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Use HTTPS protocol;</li>
<li>follow: follow protocol.</li> 
     * @return OriginProtocol Origin-pull protocol configuration. This parameter is required when OriginType is IPDomain, OriginGroup, or LoadBalance. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Use HTTPS protocol;</li>
<li>follow: follow protocol.</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-pull protocol configuration. This parameter is required when OriginType is IPDomain, OriginGroup, or LoadBalance. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Use HTTPS protocol;</li>
<li>follow: follow protocol.</li>
     * @param OriginProtocol Origin-pull protocol configuration. This parameter is required when OriginType is IPDomain, OriginGroup, or LoadBalance. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Use HTTPS protocol;</li>
<li>follow: follow protocol.</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP origin-pull port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow. 
     * @return HTTPOriginPort HTTP origin-pull port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set HTTP origin-pull port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     * @param HTTPOriginPort HTTP origin-pull port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get HTTPS origin-pull port, value range: 1–65535. This parameter is required when OriginProtocol is https or follow. 
     * @return HTTPSOriginPort HTTPS origin-pull port, value range: 1–65535. This parameter is required when OriginProtocol is https or follow.
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set HTTPS origin-pull port, value range: 1–65535. This parameter is required when OriginProtocol is https or follow.
     * @param HTTPSOriginPort HTTPS origin-pull port, value range: 1–65535. This parameter is required when OriginProtocol is https or follow.
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get Whether access to the private object storage origin server is allowed. This parameter is required when the origin server type OriginType is COS or AWSS3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li> 
     * @return PrivateAccess Whether access to the private object storage origin server is allowed. This parameter is required when the origin server type OriginType is COS or AWSS3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Whether access to the private object storage origin server is allowed. This parameter is required when the origin server type OriginType is COS or AWSS3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
     * @param PrivateAccess Whether access to the private object storage origin server is allowed. This parameter is required when the origin server type OriginType is COS or AWSS3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Private authentication parameter. This parameter is valid only when OriginType = AWSS3 and PrivateAccess = on. 
     * @return PrivateParameters Private authentication parameter. This parameter is valid only when OriginType = AWSS3 and PrivateAccess = on.
     */
    public OriginPrivateParameters getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. This parameter is valid only when OriginType = AWSS3 and PrivateAccess = on.
     * @param PrivateParameters Private authentication parameter. This parameter is valid only when OriginType = AWSS3 and PrivateAccess = on.
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

