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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSecurityResponse extends AbstractModel{

    /**
    * Cluster’s account name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Cluster’s password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Cluster’s access CA certificate
    */
    @SerializedName("CertificationAuthority")
    @Expose
    private String CertificationAuthority;

    /**
    * Cluster’s access address
    */
    @SerializedName("ClusterExternalEndpoint")
    @Expose
    private String ClusterExternalEndpoint;

    /**
    * Domain name accessed by the cluster
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Cluster’s endpoint address
    */
    @SerializedName("PgwEndpoint")
    @Expose
    private String PgwEndpoint;

    /**
    * Cluster’s access policy group
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private String [] SecurityPolicy;

    /**
    * Cluster Kubeconfig file
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Kubeconfig")
    @Expose
    private String Kubeconfig;

    /**
    * 
    */
    @SerializedName("JnsGwEndpoint")
    @Expose
    private String JnsGwEndpoint;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster’s account name 
     * @return UserName Cluster’s account name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Cluster’s account name
     * @param UserName Cluster’s account name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Cluster’s password 
     * @return Password Cluster’s password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster’s password
     * @param Password Cluster’s password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Cluster’s access CA certificate 
     * @return CertificationAuthority Cluster’s access CA certificate
     */
    public String getCertificationAuthority() {
        return this.CertificationAuthority;
    }

    /**
     * Set Cluster’s access CA certificate
     * @param CertificationAuthority Cluster’s access CA certificate
     */
    public void setCertificationAuthority(String CertificationAuthority) {
        this.CertificationAuthority = CertificationAuthority;
    }

    /**
     * Get Cluster’s access address 
     * @return ClusterExternalEndpoint Cluster’s access address
     */
    public String getClusterExternalEndpoint() {
        return this.ClusterExternalEndpoint;
    }

    /**
     * Set Cluster’s access address
     * @param ClusterExternalEndpoint Cluster’s access address
     */
    public void setClusterExternalEndpoint(String ClusterExternalEndpoint) {
        this.ClusterExternalEndpoint = ClusterExternalEndpoint;
    }

    /**
     * Get Domain name accessed by the cluster 
     * @return Domain Domain name accessed by the cluster
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name accessed by the cluster
     * @param Domain Domain name accessed by the cluster
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Cluster’s endpoint address 
     * @return PgwEndpoint Cluster’s endpoint address
     */
    public String getPgwEndpoint() {
        return this.PgwEndpoint;
    }

    /**
     * Set Cluster’s endpoint address
     * @param PgwEndpoint Cluster’s endpoint address
     */
    public void setPgwEndpoint(String PgwEndpoint) {
        this.PgwEndpoint = PgwEndpoint;
    }

    /**
     * Get Cluster’s access policy group 
     * @return SecurityPolicy Cluster’s access policy group
     */
    public String [] getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Cluster’s access policy group
     * @param SecurityPolicy Cluster’s access policy group
     */
    public void setSecurityPolicy(String [] SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get Cluster Kubeconfig file
Note: This field may return null, indicating that no valid value was found. 
     * @return Kubeconfig Cluster Kubeconfig file
Note: This field may return null, indicating that no valid value was found.
     */
    public String getKubeconfig() {
        return this.Kubeconfig;
    }

    /**
     * Set Cluster Kubeconfig file
Note: This field may return null, indicating that no valid value was found.
     * @param Kubeconfig Cluster Kubeconfig file
Note: This field may return null, indicating that no valid value was found.
     */
    public void setKubeconfig(String Kubeconfig) {
        this.Kubeconfig = Kubeconfig;
    }

    /**
     * Get  
     * @return JnsGwEndpoint 
     */
    public String getJnsGwEndpoint() {
        return this.JnsGwEndpoint;
    }

    /**
     * Set 
     * @param JnsGwEndpoint 
     */
    public void setJnsGwEndpoint(String JnsGwEndpoint) {
        this.JnsGwEndpoint = JnsGwEndpoint;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CertificationAuthority", this.CertificationAuthority);
        this.setParamSimple(map, prefix + "ClusterExternalEndpoint", this.ClusterExternalEndpoint);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PgwEndpoint", this.PgwEndpoint);
        this.setParamArraySimple(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "Kubeconfig", this.Kubeconfig);
        this.setParamSimple(map, prefix + "JnsGwEndpoint", this.JnsGwEndpoint);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

