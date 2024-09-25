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

public class DomainInfo extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CNAME Address
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Instance type of the domain name.
sparta-waf: SaaS WAF instance
clb-waf: CLB WAF instance
cdc-clb-waf: CLB WAF instances in the CDC environment
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Region
"Toronto": "ca"
"Guangzhou": "gz"
"Chengdu": "cd"
"Fuzhou": "fzec"
"Shenzhen": "szx"
"India": "in"
"Jinan": "jnec"
"Chongqing": "cq"
"Tianjin": "tsn"
"Northeast Europe": "ru"
"Nanjing": "nj"
"Silicon Valley, USA": "usw"
"Thailand": "th"
"Guangzhou Open": "gzopen"
"Shenzhen Finance": "szjr"
"Frankfurt": "de"
"Japan": "jp"
"Virginia": "use"
"Beijing": "bj"
"Hong Kong (China)": "hk"
"Hangzhou": "hzec"
"Beijing Finance": "bjjr"
"Shanghai Finance": "shjr"
"Taipei (China)": "tpe"
"Seoul": "kr"
"Shanghai": "sh"
"Singapore": "sg"
"Qingyuan": "qy"
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Access log switch status
0: disabled
1: enabled
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * CLB WAF usage mode
0: image mode
1: cleaning mode
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * WAF switch status
0: disabled
1: enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Rule engine protection mode
0: observation mode
1: interception mode
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Joint status of rule engine and AI engine protection modes.
1: initial status: interception for the rule engine and disabled for the AI engine
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
    * Sandbox cluster origin-pull outbound IP list
    */
    @SerializedName("CCList")
    @Expose
    private String [] CCList;

    /**
    * Production cluster origin-pull outbound IP list
    */
    @SerializedName("RsList")
    @Expose
    private String [] RsList;

    /**
    * Service port configuration
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * CLB-related configuration
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * User ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * LB listener status of the domain name protected by CLB WAF0: Operation successful.
4: The LB is being bound.
6: The LB is being unbound.
7: Failed to unbind the LB.
8: Failed to bind the LB.
10: Internal error.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * IPv6 switch status.
0: disabled
1: enabled
    */
    @SerializedName("Ipv6Status")
    @Expose
    private Long Ipv6Status;

    /**
    * Bot switch status.
0: disabled
1: disabled
2: enabled
3: enabled
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * Instance version information.
101: Small and Micro Agile Edition
102: Small and Micro Ultra-light Edition
2: Advanced Edition
3: Enterprise Edition
4: Ultimate Edition
6: Exclusive Edition
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Shipping status of CLS.
0: disabled
1: enabled
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * Shipping status of CKafka.
0: disabled
1: enabled
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * Cluster information accessed by the CDC instance domain name, which can be ignored for non-CDC instances.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * API security switch status.
0: disabled
1: enabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * Application-based CLB type. The default value is clb.
clb: layer-7 CLB
apisix: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * Security group status.
0: not display
1: non-Tencent Cloud origin server
2: Security group binding failed.
3: security groups changed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SgState")
    @Expose
    private Long SgState;

    /**
    * Detailed Explanation of Security Group Status

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SgDetail")
    @Expose
    private String SgDetail;

    /**
    * Domain name cloud environment. hybrid: hybrid cloud domain name
public: public cloud domain name
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
    * SaaS WAF origin server IP list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * SaaS WAF origin server domain name list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamDomainList")
    @Expose
    private String [] UpstreamDomainList;

    /**
    * Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SgID")
    @Expose
    private String SgID;

    /**
    * CLB WAF access status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

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
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CNAME Address 
     * @return Cname CNAME Address
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME Address
     * @param Cname CNAME Address
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Instance type of the domain name.
sparta-waf: SaaS WAF instance
clb-waf: CLB WAF instance
cdc-clb-waf: CLB WAF instances in the CDC environment 
     * @return Edition Instance type of the domain name.
sparta-waf: SaaS WAF instance
clb-waf: CLB WAF instance
cdc-clb-waf: CLB WAF instances in the CDC environment
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Instance type of the domain name.
sparta-waf: SaaS WAF instance
clb-waf: CLB WAF instance
cdc-clb-waf: CLB WAF instances in the CDC environment
     * @param Edition Instance type of the domain name.
sparta-waf: SaaS WAF instance
clb-waf: CLB WAF instance
cdc-clb-waf: CLB WAF instances in the CDC environment
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Region
"Toronto": "ca"
"Guangzhou": "gz"
"Chengdu": "cd"
"Fuzhou": "fzec"
"Shenzhen": "szx"
"India": "in"
"Jinan": "jnec"
"Chongqing": "cq"
"Tianjin": "tsn"
"Northeast Europe": "ru"
"Nanjing": "nj"
"Silicon Valley, USA": "usw"
"Thailand": "th"
"Guangzhou Open": "gzopen"
"Shenzhen Finance": "szjr"
"Frankfurt": "de"
"Japan": "jp"
"Virginia": "use"
"Beijing": "bj"
"Hong Kong (China)": "hk"
"Hangzhou": "hzec"
"Beijing Finance": "bjjr"
"Shanghai Finance": "shjr"
"Taipei (China)": "tpe"
"Seoul": "kr"
"Shanghai": "sh"
"Singapore": "sg"
"Qingyuan": "qy" 
     * @return Region Region
"Toronto": "ca"
"Guangzhou": "gz"
"Chengdu": "cd"
"Fuzhou": "fzec"
"Shenzhen": "szx"
"India": "in"
"Jinan": "jnec"
"Chongqing": "cq"
"Tianjin": "tsn"
"Northeast Europe": "ru"
"Nanjing": "nj"
"Silicon Valley, USA": "usw"
"Thailand": "th"
"Guangzhou Open": "gzopen"
"Shenzhen Finance": "szjr"
"Frankfurt": "de"
"Japan": "jp"
"Virginia": "use"
"Beijing": "bj"
"Hong Kong (China)": "hk"
"Hangzhou": "hzec"
"Beijing Finance": "bjjr"
"Shanghai Finance": "shjr"
"Taipei (China)": "tpe"
"Seoul": "kr"
"Shanghai": "sh"
"Singapore": "sg"
"Qingyuan": "qy"
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
"Toronto": "ca"
"Guangzhou": "gz"
"Chengdu": "cd"
"Fuzhou": "fzec"
"Shenzhen": "szx"
"India": "in"
"Jinan": "jnec"
"Chongqing": "cq"
"Tianjin": "tsn"
"Northeast Europe": "ru"
"Nanjing": "nj"
"Silicon Valley, USA": "usw"
"Thailand": "th"
"Guangzhou Open": "gzopen"
"Shenzhen Finance": "szjr"
"Frankfurt": "de"
"Japan": "jp"
"Virginia": "use"
"Beijing": "bj"
"Hong Kong (China)": "hk"
"Hangzhou": "hzec"
"Beijing Finance": "bjjr"
"Shanghai Finance": "shjr"
"Taipei (China)": "tpe"
"Seoul": "kr"
"Shanghai": "sh"
"Singapore": "sg"
"Qingyuan": "qy"
     * @param Region Region
"Toronto": "ca"
"Guangzhou": "gz"
"Chengdu": "cd"
"Fuzhou": "fzec"
"Shenzhen": "szx"
"India": "in"
"Jinan": "jnec"
"Chongqing": "cq"
"Tianjin": "tsn"
"Northeast Europe": "ru"
"Nanjing": "nj"
"Silicon Valley, USA": "usw"
"Thailand": "th"
"Guangzhou Open": "gzopen"
"Shenzhen Finance": "szjr"
"Frankfurt": "de"
"Japan": "jp"
"Virginia": "use"
"Beijing": "bj"
"Hong Kong (China)": "hk"
"Hangzhou": "hzec"
"Beijing Finance": "bjjr"
"Shanghai Finance": "shjr"
"Taipei (China)": "tpe"
"Seoul": "kr"
"Shanghai": "sh"
"Singapore": "sg"
"Qingyuan": "qy"
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Access log switch status
0: disabled
1: enabled 
     * @return ClsStatus Access log switch status
0: disabled
1: enabled
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set Access log switch status
0: disabled
1: enabled
     * @param ClsStatus Access log switch status
0: disabled
1: enabled
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get CLB WAF usage mode
0: image mode
1: cleaning mode 
     * @return FlowMode CLB WAF usage mode
0: image mode
1: cleaning mode
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set CLB WAF usage mode
0: image mode
1: cleaning mode
     * @param FlowMode CLB WAF usage mode
0: image mode
1: cleaning mode
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get WAF switch status
0: disabled
1: enabled 
     * @return Status WAF switch status
0: disabled
1: enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set WAF switch status
0: disabled
1: enabled
     * @param Status WAF switch status
0: disabled
1: enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Joint status of rule engine and AI engine protection modes.
1: initial status: interception for the rule engine and disabled for the AI engine
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine 
     * @return Engine Joint status of rule engine and AI engine protection modes.
1: initial status: interception for the rule engine and disabled for the AI engine
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
     * Set Joint status of rule engine and AI engine protection modes.
1: initial status: interception for the rule engine and disabled for the AI engine
10: observation for the rule engine and disabled for the AI engine
11: observation for both the rule engine and AI engine
12: observation for the rule engine and interception for the AI engine
20: interception for the rule engine and disabled for the AI engine
21: interception for the rule engine and observation for the AI engine
22: interception for both the rule engine and AI engine
     * @param Engine Joint status of rule engine and AI engine protection modes.
1: initial status: interception for the rule engine and disabled for the AI engine
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
     * Get Sandbox cluster origin-pull outbound IP list 
     * @return CCList Sandbox cluster origin-pull outbound IP list
     */
    public String [] getCCList() {
        return this.CCList;
    }

    /**
     * Set Sandbox cluster origin-pull outbound IP list
     * @param CCList Sandbox cluster origin-pull outbound IP list
     */
    public void setCCList(String [] CCList) {
        this.CCList = CCList;
    }

    /**
     * Get Production cluster origin-pull outbound IP list 
     * @return RsList Production cluster origin-pull outbound IP list
     */
    public String [] getRsList() {
        return this.RsList;
    }

    /**
     * Set Production cluster origin-pull outbound IP list
     * @param RsList Production cluster origin-pull outbound IP list
     */
    public void setRsList(String [] RsList) {
        this.RsList = RsList;
    }

    /**
     * Get Service port configuration 
     * @return Ports Service port configuration
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Service port configuration
     * @param Ports Service port configuration
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get CLB-related configuration 
     * @return LoadBalancerSet CLB-related configuration
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set CLB-related configuration
     * @param LoadBalancerSet CLB-related configuration
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get LB listener status of the domain name protected by CLB WAF0: Operation successful.
4: The LB is being bound.
6: The LB is being unbound.
7: Failed to unbind the LB.
8: Failed to bind the LB.
10: Internal error. 
     * @return State LB listener status of the domain name protected by CLB WAF0: Operation successful.
4: The LB is being bound.
6: The LB is being unbound.
7: Failed to unbind the LB.
8: Failed to bind the LB.
10: Internal error.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set LB listener status of the domain name protected by CLB WAF0: Operation successful.
4: The LB is being bound.
6: The LB is being unbound.
7: Failed to unbind the LB.
8: Failed to bind the LB.
10: Internal error.
     * @param State LB listener status of the domain name protected by CLB WAF0: Operation successful.
4: The LB is being bound.
6: The LB is being unbound.
7: Failed to unbind the LB.
8: Failed to bind the LB.
10: Internal error.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get IPv6 switch status.
0: disabled
1: enabled 
     * @return Ipv6Status IPv6 switch status.
0: disabled
1: enabled
     */
    public Long getIpv6Status() {
        return this.Ipv6Status;
    }

    /**
     * Set IPv6 switch status.
0: disabled
1: enabled
     * @param Ipv6Status IPv6 switch status.
0: disabled
1: enabled
     */
    public void setIpv6Status(Long Ipv6Status) {
        this.Ipv6Status = Ipv6Status;
    }

    /**
     * Get Bot switch status.
0: disabled
1: disabled
2: enabled
3: enabled 
     * @return BotStatus Bot switch status.
0: disabled
1: disabled
2: enabled
3: enabled
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set Bot switch status.
0: disabled
1: disabled
2: enabled
3: enabled
     * @param BotStatus Bot switch status.
0: disabled
1: disabled
2: enabled
3: enabled
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get Instance version information.
101: Small and Micro Agile Edition
102: Small and Micro Ultra-light Edition
2: Advanced Edition
3: Enterprise Edition
4: Ultimate Edition
6: Exclusive Edition 
     * @return Level Instance version information.
101: Small and Micro Agile Edition
102: Small and Micro Ultra-light Edition
2: Advanced Edition
3: Enterprise Edition
4: Ultimate Edition
6: Exclusive Edition
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Instance version information.
101: Small and Micro Agile Edition
102: Small and Micro Ultra-light Edition
2: Advanced Edition
3: Enterprise Edition
4: Ultimate Edition
6: Exclusive Edition
     * @param Level Instance version information.
101: Small and Micro Agile Edition
102: Small and Micro Ultra-light Edition
2: Advanced Edition
3: Enterprise Edition
4: Ultimate Edition
6: Exclusive Edition
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Shipping status of CLS.
0: disabled
1: enabled 
     * @return PostCLSStatus Shipping status of CLS.
0: disabled
1: enabled
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set Shipping status of CLS.
0: disabled
1: enabled
     * @param PostCLSStatus Shipping status of CLS.
0: disabled
1: enabled
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get Shipping status of CKafka.
0: disabled
1: enabled 
     * @return PostCKafkaStatus Shipping status of CKafka.
0: disabled
1: enabled
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set Shipping status of CKafka.
0: disabled
1: enabled
     * @param PostCKafkaStatus Shipping status of CKafka.
0: disabled
1: enabled
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get Cluster information accessed by the CDC instance domain name, which can be ignored for non-CDC instances.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CdcClusters Cluster information accessed by the CDC instance domain name, which can be ignored for non-CDC instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set Cluster information accessed by the CDC instance domain name, which can be ignored for non-CDC instances.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CdcClusters Cluster information accessed by the CDC instance domain name, which can be ignored for non-CDC instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get API security switch status.
0: disabled
1: enabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiStatus API security switch status.
0: disabled
1: enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set API security switch status.
0: disabled
1: enabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiStatus API security switch status.
0: disabled
1: enabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get Application-based CLB type. The default value is clb.
clb: layer-7 CLB
apisix: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlbType Application-based CLB type. The default value is clb.
clb: layer-7 CLB
apisix: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set Application-based CLB type. The default value is clb.
clb: layer-7 CLB
apisix: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlbType Application-based CLB type. The default value is clb.
clb: layer-7 CLB
apisix: APISIX gateway
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get Security group status.
0: not display
1: non-Tencent Cloud origin server
2: Security group binding failed.
3: security groups changed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SgState Security group status.
0: not display
1: non-Tencent Cloud origin server
2: Security group binding failed.
3: security groups changed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSgState() {
        return this.SgState;
    }

    /**
     * Set Security group status.
0: not display
1: non-Tencent Cloud origin server
2: Security group binding failed.
3: security groups changed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SgState Security group status.
0: not display
1: non-Tencent Cloud origin server
2: Security group binding failed.
3: security groups changed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSgState(Long SgState) {
        this.SgState = SgState;
    }

    /**
     * Get Detailed Explanation of Security Group Status

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SgDetail Detailed Explanation of Security Group Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSgDetail() {
        return this.SgDetail;
    }

    /**
     * Set Detailed Explanation of Security Group Status

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SgDetail Detailed Explanation of Security Group Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSgDetail(String SgDetail) {
        this.SgDetail = SgDetail;
    }

    /**
     * Get Domain name cloud environment. hybrid: hybrid cloud domain name
public: public cloud domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudType Domain name cloud environment. hybrid: hybrid cloud domain name
public: public cloud domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Domain name cloud environment. hybrid: hybrid cloud domain name
public: public cloud domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudType Domain name cloud environment. hybrid: hybrid cloud domain name
public: public cloud domain name
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

    /**
     * Get SaaS WAF origin server IP list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcList SaaS WAF origin server IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set SaaS WAF origin server IP list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcList SaaS WAF origin server IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get SaaS WAF origin server domain name list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamDomainList SaaS WAF origin server domain name list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUpstreamDomainList() {
        return this.UpstreamDomainList;
    }

    /**
     * Set SaaS WAF origin server domain name list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamDomainList SaaS WAF origin server domain name list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamDomainList(String [] UpstreamDomainList) {
        this.UpstreamDomainList = UpstreamDomainList;
    }

    /**
     * Get Security group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SgID Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSgID() {
        return this.SgID;
    }

    /**
     * Set Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SgID Security group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSgID(String SgID) {
        this.SgID = SgID;
    }

    /**
     * Get CLB WAF access status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessStatus CLB WAF access status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set CLB WAF access status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessStatus CLB WAF access status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.CCList != null) {
            this.CCList = new String[source.CCList.length];
            for (int i = 0; i < source.CCList.length; i++) {
                this.CCList[i] = new String(source.CCList[i]);
            }
        }
        if (source.RsList != null) {
            this.RsList = new String[source.RsList.length];
            for (int i = 0; i < source.RsList.length; i++) {
                this.RsList[i] = new String(source.RsList[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new PortInfo[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortInfo(source.Ports[i]);
            }
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancerPackageNew[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancerPackageNew(source.LoadBalancerSet[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Ipv6Status != null) {
            this.Ipv6Status = new Long(source.Ipv6Status);
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PostCLSStatus != null) {
            this.PostCLSStatus = new Long(source.PostCLSStatus);
        }
        if (source.PostCKafkaStatus != null) {
            this.PostCKafkaStatus = new Long(source.PostCKafkaStatus);
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String(source.CdcClusters);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.SgState != null) {
            this.SgState = new Long(source.SgState);
        }
        if (source.SgDetail != null) {
            this.SgDetail = new String(source.SgDetail);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.UpstreamDomainList != null) {
            this.UpstreamDomainList = new String[source.UpstreamDomainList.length];
            for (int i = 0; i < source.UpstreamDomainList.length; i++) {
                this.UpstreamDomainList[i] = new String(source.UpstreamDomainList[i]);
            }
        }
        if (source.SgID != null) {
            this.SgID = new String(source.SgID);
        }
        if (source.AccessStatus != null) {
            this.AccessStatus = new Long(source.AccessStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamArraySimple(map, prefix + "CCList.", this.CCList);
        this.setParamArraySimple(map, prefix + "RsList.", this.RsList);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Ipv6Status", this.Ipv6Status);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PostCLSStatus", this.PostCLSStatus);
        this.setParamSimple(map, prefix + "PostCKafkaStatus", this.PostCKafkaStatus);
        this.setParamSimple(map, prefix + "CdcClusters", this.CdcClusters);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamSimple(map, prefix + "SgState", this.SgState);
        this.setParamSimple(map, prefix + "SgDetail", this.SgDetail);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamArraySimple(map, prefix + "UpstreamDomainList.", this.UpstreamDomainList);
        this.setParamSimple(map, prefix + "SgID", this.SgID);
        this.setParamSimple(map, prefix + "AccessStatus", this.AccessStatus);

    }
}

