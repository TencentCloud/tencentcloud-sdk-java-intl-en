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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterEndpointsResponse extends AbstractModel {

    /**
    * CA certificate of cluster APIServer
    */
    @SerializedName("CertificationAuthority")
    @Expose
    private String CertificationAuthority;

    /**
    * Public network access address of cluster APIServer
    */
    @SerializedName("ClusterExternalEndpoint")
    @Expose
    private String ClusterExternalEndpoint;

    /**
    * Private network access address of cluster APIServer
    */
    @SerializedName("ClusterIntranetEndpoint")
    @Expose
    private String ClusterIntranetEndpoint;

    /**
    * Domain name of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterDomain")
    @Expose
    private String ClusterDomain;

    /**
    * Public network access ACL of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterExternalACL")
    @Expose
    private String [] ClusterExternalACL;

    /**
    * Public network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterExternalDomain")
    @Expose
    private String ClusterExternalDomain;

    /**
    * Private network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIntranetDomain")
    @Expose
    private String ClusterIntranetDomain;

    /**
    * Public network security group
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Subnet for Private Network Access
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterIntranetSubnetId")
    @Expose
    private String ClusterIntranetSubnetId;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CA certificate of cluster APIServer 
     * @return CertificationAuthority CA certificate of cluster APIServer
     */
    public String getCertificationAuthority() {
        return this.CertificationAuthority;
    }

    /**
     * Set CA certificate of cluster APIServer
     * @param CertificationAuthority CA certificate of cluster APIServer
     */
    public void setCertificationAuthority(String CertificationAuthority) {
        this.CertificationAuthority = CertificationAuthority;
    }

    /**
     * Get Public network access address of cluster APIServer 
     * @return ClusterExternalEndpoint Public network access address of cluster APIServer
     */
    public String getClusterExternalEndpoint() {
        return this.ClusterExternalEndpoint;
    }

    /**
     * Set Public network access address of cluster APIServer
     * @param ClusterExternalEndpoint Public network access address of cluster APIServer
     */
    public void setClusterExternalEndpoint(String ClusterExternalEndpoint) {
        this.ClusterExternalEndpoint = ClusterExternalEndpoint;
    }

    /**
     * Get Private network access address of cluster APIServer 
     * @return ClusterIntranetEndpoint Private network access address of cluster APIServer
     */
    public String getClusterIntranetEndpoint() {
        return this.ClusterIntranetEndpoint;
    }

    /**
     * Set Private network access address of cluster APIServer
     * @param ClusterIntranetEndpoint Private network access address of cluster APIServer
     */
    public void setClusterIntranetEndpoint(String ClusterIntranetEndpoint) {
        this.ClusterIntranetEndpoint = ClusterIntranetEndpoint;
    }

    /**
     * Get Domain name of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterDomain Domain name of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterDomain() {
        return this.ClusterDomain;
    }

    /**
     * Set Domain name of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterDomain Domain name of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterDomain(String ClusterDomain) {
        this.ClusterDomain = ClusterDomain;
    }

    /**
     * Get Public network access ACL of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterExternalACL Public network access ACL of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getClusterExternalACL() {
        return this.ClusterExternalACL;
    }

    /**
     * Set Public network access ACL of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterExternalACL Public network access ACL of cluster APIServer
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterExternalACL(String [] ClusterExternalACL) {
        this.ClusterExternalACL = ClusterExternalACL;
    }

    /**
     * Get Public network domain name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterExternalDomain Public network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterExternalDomain() {
        return this.ClusterExternalDomain;
    }

    /**
     * Set Public network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterExternalDomain Public network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterExternalDomain(String ClusterExternalDomain) {
        this.ClusterExternalDomain = ClusterExternalDomain;
    }

    /**
     * Get Private network domain name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterIntranetDomain Private network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterIntranetDomain() {
        return this.ClusterIntranetDomain;
    }

    /**
     * Set Private network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterIntranetDomain Private network domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterIntranetDomain(String ClusterIntranetDomain) {
        this.ClusterIntranetDomain = ClusterIntranetDomain;
    }

    /**
     * Get Public network security group
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroup Public network security group
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Public network security group
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroup Public network security group
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Subnet for Private Network Access
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ClusterIntranetSubnetId Subnet for Private Network Access
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getClusterIntranetSubnetId() {
        return this.ClusterIntranetSubnetId;
    }

    /**
     * Set Subnet for Private Network Access
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ClusterIntranetSubnetId Subnet for Private Network Access
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setClusterIntranetSubnetId(String ClusterIntranetSubnetId) {
        this.ClusterIntranetSubnetId = ClusterIntranetSubnetId;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterEndpointsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterEndpointsResponse(DescribeClusterEndpointsResponse source) {
        if (source.CertificationAuthority != null) {
            this.CertificationAuthority = new String(source.CertificationAuthority);
        }
        if (source.ClusterExternalEndpoint != null) {
            this.ClusterExternalEndpoint = new String(source.ClusterExternalEndpoint);
        }
        if (source.ClusterIntranetEndpoint != null) {
            this.ClusterIntranetEndpoint = new String(source.ClusterIntranetEndpoint);
        }
        if (source.ClusterDomain != null) {
            this.ClusterDomain = new String(source.ClusterDomain);
        }
        if (source.ClusterExternalACL != null) {
            this.ClusterExternalACL = new String[source.ClusterExternalACL.length];
            for (int i = 0; i < source.ClusterExternalACL.length; i++) {
                this.ClusterExternalACL[i] = new String(source.ClusterExternalACL[i]);
            }
        }
        if (source.ClusterExternalDomain != null) {
            this.ClusterExternalDomain = new String(source.ClusterExternalDomain);
        }
        if (source.ClusterIntranetDomain != null) {
            this.ClusterIntranetDomain = new String(source.ClusterIntranetDomain);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.ClusterIntranetSubnetId != null) {
            this.ClusterIntranetSubnetId = new String(source.ClusterIntranetSubnetId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificationAuthority", this.CertificationAuthority);
        this.setParamSimple(map, prefix + "ClusterExternalEndpoint", this.ClusterExternalEndpoint);
        this.setParamSimple(map, prefix + "ClusterIntranetEndpoint", this.ClusterIntranetEndpoint);
        this.setParamSimple(map, prefix + "ClusterDomain", this.ClusterDomain);
        this.setParamArraySimple(map, prefix + "ClusterExternalACL.", this.ClusterExternalACL);
        this.setParamSimple(map, prefix + "ClusterExternalDomain", this.ClusterExternalDomain);
        this.setParamSimple(map, prefix + "ClusterIntranetDomain", this.ClusterIntranetDomain);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ClusterIntranetSubnetId", this.ClusterIntranetSubnetId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

