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

public class LoadBalancerPackageNew extends AbstractModel {

    /**
    * Listener ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listening Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Protocol

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Region
"Toronto": "ca",
"Guangzhou": "gz",
"Chengdu": "cd",
"Fuzhou": "fzec",
"Shenzhen": "szx",
"India": "in",
"Jinan": "jnec",
"Chongqing": "cq",
"Tianjin": "tsn",
"Northeast Europe": "ru",
"Nanjing": "nj",
"Silicon Valley (U.S.)": "usw",
"Thailand": "th",
"Guangzhou Open": "gzopen",
"Shenzhen Finance": "szjr",
"Frankfurt": "de",
"Japan": "jp",
"Virginia": "use",
"Beijing": "bj",
"Hong Kong (China)": "hk",
"Hangzhou": "hzec",
"Beijing Finance": "bjjr",
"Shanghai Finance": "shjr",
"Taipei (China)": "tpe",
"Seoul": "kr",
"Shanghai": "sh",
"Singapore": "sg",
"Qingyuan": "qy"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Access IP

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Access Port

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Region

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPCID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * CLB Type

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * Domain Name of CLB

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
     * Get Listener ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId Listener ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListenerId Listener ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listening Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ListenerName Listening Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listening Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ListenerName Listening Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerId CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerId CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerName CLB name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerName CLB name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Protocol

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Region
"Toronto": "ca",
"Guangzhou": "gz",
"Chengdu": "cd",
"Fuzhou": "fzec",
"Shenzhen": "szx",
"India": "in",
"Jinan": "jnec",
"Chongqing": "cq",
"Tianjin": "tsn",
"Northeast Europe": "ru",
"Nanjing": "nj",
"Silicon Valley (U.S.)": "usw",
"Thailand": "th",
"Guangzhou Open": "gzopen",
"Shenzhen Finance": "szjr",
"Frankfurt": "de",
"Japan": "jp",
"Virginia": "use",
"Beijing": "bj",
"Hong Kong (China)": "hk",
"Hangzhou": "hzec",
"Beijing Finance": "bjjr",
"Shanghai Finance": "shjr",
"Taipei (China)": "tpe",
"Seoul": "kr",
"Shanghai": "sh",
"Singapore": "sg",
"Qingyuan": "qy"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
"Toronto": "ca",
"Guangzhou": "gz",
"Chengdu": "cd",
"Fuzhou": "fzec",
"Shenzhen": "szx",
"India": "in",
"Jinan": "jnec",
"Chongqing": "cq",
"Tianjin": "tsn",
"Northeast Europe": "ru",
"Nanjing": "nj",
"Silicon Valley (U.S.)": "usw",
"Thailand": "th",
"Guangzhou Open": "gzopen",
"Shenzhen Finance": "szjr",
"Frankfurt": "de",
"Japan": "jp",
"Virginia": "use",
"Beijing": "bj",
"Hong Kong (China)": "hk",
"Hangzhou": "hzec",
"Beijing Finance": "bjjr",
"Shanghai Finance": "shjr",
"Taipei (China)": "tpe",
"Seoul": "kr",
"Shanghai": "sh",
"Singapore": "sg",
"Qingyuan": "qy"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
"Toronto": "ca",
"Guangzhou": "gz",
"Chengdu": "cd",
"Fuzhou": "fzec",
"Shenzhen": "szx",
"India": "in",
"Jinan": "jnec",
"Chongqing": "cq",
"Tianjin": "tsn",
"Northeast Europe": "ru",
"Nanjing": "nj",
"Silicon Valley (U.S.)": "usw",
"Thailand": "th",
"Guangzhou Open": "gzopen",
"Shenzhen Finance": "szjr",
"Frankfurt": "de",
"Japan": "jp",
"Virginia": "use",
"Beijing": "bj",
"Hong Kong (China)": "hk",
"Hangzhou": "hzec",
"Beijing Finance": "bjjr",
"Shanghai Finance": "shjr",
"Taipei (China)": "tpe",
"Seoul": "kr",
"Shanghai": "sh",
"Singapore": "sg",
"Qingyuan": "qy"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region
"Toronto": "ca",
"Guangzhou": "gz",
"Chengdu": "cd",
"Fuzhou": "fzec",
"Shenzhen": "szx",
"India": "in",
"Jinan": "jnec",
"Chongqing": "cq",
"Tianjin": "tsn",
"Northeast Europe": "ru",
"Nanjing": "nj",
"Silicon Valley (U.S.)": "usw",
"Thailand": "th",
"Guangzhou Open": "gzopen",
"Shenzhen Finance": "szjr",
"Frankfurt": "de",
"Japan": "jp",
"Virginia": "use",
"Beijing": "bj",
"Hong Kong (China)": "hk",
"Hangzhou": "hzec",
"Beijing Finance": "bjjr",
"Shanghai Finance": "shjr",
"Taipei (China)": "tpe",
"Seoul": "kr",
"Shanghai": "sh",
"Singapore": "sg",
"Qingyuan": "qy"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Access IP

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip Access IP

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Access IP

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip Access IP

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Access Port

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vport Access Port

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Access Port

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vport Access Port

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Region

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPCID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumericalVpcId VPCID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPCID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumericalVpcId VPCID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get CLB Type

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType CLB Type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB Type

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType CLB Type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get Domain Name of CLB

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerDomain Domain Name of CLB

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set Domain Name of CLB

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerDomain Domain Name of CLB

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    public LoadBalancerPackageNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerPackageNew(LoadBalancerPackageNew source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);

    }
}

