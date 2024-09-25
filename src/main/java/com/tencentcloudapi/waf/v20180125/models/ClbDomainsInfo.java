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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbDomainsInfo extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Unique domain name ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Instance ID of the domain name
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the instance of the domain name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type of the domain name
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * CLB information when the CLB type is clb
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * CLB WAF traffic mode. 1: cleaning mode; 0: image mode
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * Domain name-bound CLB status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * CLB Type, either CLB or Apisix

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * CDC cluster information for the WAF of the cdc-clb-waf type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * Cloud Type: public: Public Cloud; private: Private Cloud; hybrid: Hybrid Cloud

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Unique domain name ID 
     * @return DomainId Unique domain name ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Unique domain name ID
     * @param DomainId Unique domain name ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Instance ID of the domain name 
     * @return InstanceId Instance ID of the domain name
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the domain name
     * @param InstanceId Instance ID of the domain name
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the instance of the domain name 
     * @return InstanceName Name of the instance of the domain name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Name of the instance of the domain name
     * @param InstanceName Name of the instance of the domain name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance type of the domain name 
     * @return Edition Instance type of the domain name
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Instance type of the domain name
     * @param Edition Instance type of the domain name
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address. 
     * @return IsCdn Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     * @param IsCdn Whether a layer-7 proxy service is deployed before the WAF. 0: No proxy service is deployed; 1: The proxy service is deployed. The WAF will use XFF to obtain the client IP address; 2: The proxy service is deployed. The WAF will use remote_addr to obtain the client IP address; 3: The proxy service is deployed. The WAF will use a custom header in ip_headers to obtain the client IP address.
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get CLB information when the CLB type is clb 
     * @return LoadBalancerSet CLB information when the CLB type is clb
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set CLB information when the CLB type is clb
     * @param LoadBalancerSet CLB information when the CLB type is clb
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get CLB WAF traffic mode. 1: cleaning mode; 0: image mode 
     * @return FlowMode CLB WAF traffic mode. 1: cleaning mode; 0: image mode
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set CLB WAF traffic mode. 1: cleaning mode; 0: image mode
     * @param FlowMode CLB WAF traffic mode. 1: cleaning mode; 0: image mode
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get Domain name-bound CLB status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Domain name-bound CLB status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Domain name-bound CLB status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Domain name-bound CLB status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get CLB Type, either CLB or Apisix

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlbType CLB Type, either CLB or Apisix

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set CLB Type, either CLB or Apisix

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlbType CLB Type, either CLB or Apisix

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpHeaders IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpHeaders IsCdn=3 indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get CDC cluster information for the WAF of the cdc-clb-waf type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CdcClusters CDC cluster information for the WAF of the cdc-clb-waf type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set CDC cluster information for the WAF of the cdc-clb-waf type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CdcClusters CDC cluster information for the WAF of the cdc-clb-waf type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get Cloud Type: public: Public Cloud; private: Private Cloud; hybrid: Hybrid Cloud

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudType Cloud Type: public: Public Cloud; private: Private Cloud; hybrid: Hybrid Cloud

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud Type: public: Public Cloud; private: Private Cloud; hybrid: Hybrid Cloud

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudType Cloud Type: public: Public Cloud; private: Private Cloud; hybrid: Hybrid Cloud

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Note Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Note Domain name remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    public ClbDomainsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbDomainsInfo(ClbDomainsInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancerPackageNew[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancerPackageNew(source.LoadBalancerSet[i]);
            }
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String(source.CdcClusters);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "CdcClusters", this.CdcClusters);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

