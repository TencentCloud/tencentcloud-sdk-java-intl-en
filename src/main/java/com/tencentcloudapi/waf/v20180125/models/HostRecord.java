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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostRecord extends AbstractModel {

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
    * Primary Domain, empty upon input
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * Rule engine protection mode
0: observation mode
1: interception mode
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Binding relationship between WAF and CLB
0: unbound
1: bound
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Domain name listener status of CLB WAF
0: operation successful
4: CLB instance binding in progress
6: CLB instance unbinding in progress
7: CLB instance unbinding failed
8: CLB instance binding failed
10: internal error
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * Whether a layer-7 proxy service is deployed before WAF. 0: No proxy service deployed; 1: Proxy service deployed, and WAF will use XFF to obtain the client IP address; 2: Proxy service deployed, and WAF will use remote_addr to obtain the client IP address; 3: Proxy service deployed, and WAF will use the custom header in ip_headers to obtain the client IP address.
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * List of the information on the bound CLB instance
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancer [] LoadBalancerSet;

    /**
    * Region of the CLB instance bound to the domain name. Separate multiple regions by commas.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance type of the domain name. For CLB WAF, the value is "clb-waf".
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Traffic mode of domain names protected by CLB WAF
1: cleaning mode
0: mirror mode
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * Whether to enable access logging
1: enable
0: disable
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * Protection Level, Optional Values: 100, 200, 300

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * List of CDC clusters to which the domain name needs to be delivered. Specify this parameter for CDC scenes only.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcClusters")
    @Expose
    private String [] CdcClusters;

    /**
    * Application CLB type. Default value: clb. 
clb: layer-7 CLB
tsegw: Tencent Cloud API Gateway
scf: Tencent Cloud Serverless
apisix: Other Tencent Cloud Gateway. eg: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3 required for this parameter, indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * Rule engine type
1: menshen
2: tiga
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private Long EngineType;

    /**
    * Cloud type
public: public cloud
private: private cloud
hybrid: hybrid cloud
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
     * Get Primary Domain, empty upon input 
     * @return MainDomain Primary Domain, empty upon input
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set Primary Domain, empty upon input
     * @param MainDomain Primary Domain, empty upon input
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get Rule engine protection mode
0: observation mode
1: interception mode 
     * @return Mode Rule engine protection mode
0: observation mode
1: interception mode
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Rule engine protection mode
0: observation mode
1: interception mode
     * @param Mode Rule engine protection mode
0: observation mode
1: interception mode
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Binding relationship between WAF and CLB
0: unbound
1: bound 
     * @return Status Binding relationship between WAF and CLB
0: unbound
1: bound
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Binding relationship between WAF and CLB
0: unbound
1: bound
     * @param Status Binding relationship between WAF and CLB
0: unbound
1: bound
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name listener status of CLB WAF
0: operation successful
4: CLB instance binding in progress
6: CLB instance unbinding in progress
7: CLB instance unbinding failed
8: CLB instance binding failed
10: internal error 
     * @return State Domain name listener status of CLB WAF
0: operation successful
4: CLB instance binding in progress
6: CLB instance unbinding in progress
7: CLB instance unbinding failed
8: CLB instance binding failed
10: internal error
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Domain name listener status of CLB WAF
0: operation successful
4: CLB instance binding in progress
6: CLB instance unbinding in progress
7: CLB instance unbinding failed
8: CLB instance binding failed
10: internal error
     * @param State Domain name listener status of CLB WAF
0: operation successful
4: CLB instance binding in progress
6: CLB instance unbinding in progress
7: CLB instance unbinding failed
8: CLB instance binding failed
10: internal error
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine 
     * @return Engine Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     * @param Engine Status of the rule engine and AI engine
1: initial status. Interception for the rule engine and disabled for the AI engine.
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Whether a layer-7 proxy service is deployed before WAF. 0: No proxy service deployed; 1: Proxy service deployed, and WAF will use XFF to obtain the client IP address; 2: Proxy service deployed, and WAF will use remote_addr to obtain the client IP address; 3: Proxy service deployed, and WAF will use the custom header in ip_headers to obtain the client IP address. 
     * @return IsCdn Whether a layer-7 proxy service is deployed before WAF. 0: No proxy service deployed; 1: Proxy service deployed, and WAF will use XFF to obtain the client IP address; 2: Proxy service deployed, and WAF will use remote_addr to obtain the client IP address; 3: Proxy service deployed, and WAF will use the custom header in ip_headers to obtain the client IP address.
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set Whether a layer-7 proxy service is deployed before WAF. 0: No proxy service deployed; 1: Proxy service deployed, and WAF will use XFF to obtain the client IP address; 2: Proxy service deployed, and WAF will use remote_addr to obtain the client IP address; 3: Proxy service deployed, and WAF will use the custom header in ip_headers to obtain the client IP address.
     * @param IsCdn Whether a layer-7 proxy service is deployed before WAF. 0: No proxy service deployed; 1: Proxy service deployed, and WAF will use XFF to obtain the client IP address; 2: Proxy service deployed, and WAF will use remote_addr to obtain the client IP address; 3: Proxy service deployed, and WAF will use the custom header in ip_headers to obtain the client IP address.
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get List of the information on the bound CLB instance 
     * @return LoadBalancerSet List of the information on the bound CLB instance
     */
    public LoadBalancer [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set List of the information on the bound CLB instance
     * @param LoadBalancerSet List of the information on the bound CLB instance
     */
    public void setLoadBalancerSet(LoadBalancer [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get Region of the CLB instance bound to the domain name. Separate multiple regions by commas. 
     * @return Region Region of the CLB instance bound to the domain name. Separate multiple regions by commas.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the CLB instance bound to the domain name. Separate multiple regions by commas.
     * @param Region Region of the CLB instance bound to the domain name. Separate multiple regions by commas.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance type of the domain name. For CLB WAF, the value is "clb-waf". 
     * @return Edition Instance type of the domain name. For CLB WAF, the value is "clb-waf".
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Instance type of the domain name. For CLB WAF, the value is "clb-waf".
     * @param Edition Instance type of the domain name. For CLB WAF, the value is "clb-waf".
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Traffic mode of domain names protected by CLB WAF
1: cleaning mode
0: mirror mode 
     * @return FlowMode Traffic mode of domain names protected by CLB WAF
1: cleaning mode
0: mirror mode
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set Traffic mode of domain names protected by CLB WAF
1: cleaning mode
0: mirror mode
     * @param FlowMode Traffic mode of domain names protected by CLB WAF
1: cleaning mode
0: mirror mode
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get Whether to enable access logging
1: enable
0: disable 
     * @return ClsStatus Whether to enable access logging
1: enable
0: disable
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set Whether to enable access logging
1: enable
0: disable
     * @param ClsStatus Whether to enable access logging
1: enable
0: disable
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get Protection Level, Optional Values: 100, 200, 300

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Protection Level, Optional Values: 100, 200, 300

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Protection Level, Optional Values: 100, 200, 300

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Protection Level, Optional Values: 100, 200, 300

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get List of CDC clusters to which the domain name needs to be delivered. Specify this parameter for CDC scenes only.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CdcClusters List of CDC clusters to which the domain name needs to be delivered. Specify this parameter for CDC scenes only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set List of CDC clusters to which the domain name needs to be delivered. Specify this parameter for CDC scenes only.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CdcClusters List of CDC clusters to which the domain name needs to be delivered. Specify this parameter for CDC scenes only.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCdcClusters(String [] CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get Application CLB type. Default value: clb. 
clb: layer-7 CLB
tsegw: Tencent Cloud API Gateway
scf: Tencent Cloud Serverless
apisix: Other Tencent Cloud Gateway. eg: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlbType Application CLB type. Default value: clb. 
clb: layer-7 CLB
tsegw: Tencent Cloud API Gateway
scf: Tencent Cloud Serverless
apisix: Other Tencent Cloud Gateway. eg: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set Application CLB type. Default value: clb. 
clb: layer-7 CLB
tsegw: Tencent Cloud API Gateway
scf: Tencent Cloud Serverless
apisix: Other Tencent Cloud Gateway. eg: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlbType Application CLB type. Default value: clb. 
clb: layer-7 CLB
tsegw: Tencent Cloud API Gateway
scf: Tencent Cloud Serverless
apisix: Other Tencent Cloud Gateway. eg: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3 required for this parameter, indicates custom header

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpHeaders IsCdn=3 required for this parameter, indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3 required for this parameter, indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpHeaders IsCdn=3 required for this parameter, indicates custom header

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get Rule engine type
1: menshen
2: tiga
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineType Rule engine type
1: menshen
2: tiga
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Rule engine type
1: menshen
2: tiga
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineType Rule engine type
1: menshen
2: tiga
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineType(Long EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Cloud type
public: public cloud
private: private cloud
hybrid: hybrid cloud
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudType Cloud type
public: public cloud
private: private cloud
hybrid: hybrid cloud
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud type
public: public cloud
private: private cloud
hybrid: hybrid cloud
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudType Cloud type
public: public cloud
private: private cloud
hybrid: hybrid cloud
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

    public HostRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostRecord(HostRecord source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancer[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancer(source.LoadBalancerSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String[source.CdcClusters.length];
            for (int i = 0; i < source.CdcClusters.length; i++) {
                this.CdcClusters[i] = new String(source.CdcClusters[i]);
            }
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
        if (source.EngineType != null) {
            this.EngineType = new Long(source.EngineType);
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
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "CdcClusters.", this.CdcClusters);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

