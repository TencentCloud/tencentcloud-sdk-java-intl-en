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

public class CreateL4ProxyRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * L4 proxy instance name. Enter 1-50 characters. Allowed characters: a-z, 0-9, and -. The hyphen cannot be registered alone or used continuously, and cannot be placed at the beginning or the end. Modifications are not allowed after creation.

    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Acceleration zone of the L4 proxy instance.
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland);</li>
<li>global: global availability zone.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether IPv6 access is enabled. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * Whether to enable static IP. Default off if left empty. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("StaticIp")
    @Expose
    private String StaticIp;

    /**
    * Whether to enable network optimization in the Chinese mainland. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance. Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private String AccelerateMainland;

    /**
    * Configuration of L3/L4 DDoS protection. If this parameter is not input, the default platform protection option is used. For details, see [Exclusive DDoS Protection](https://www.tencentcloud.com/document/product/1552/95994?from_cn_redirect=1).
This field is deprecated. Please use the DDosProtectionId field to specify the associated DDoS protection configuration.
    */
    @SerializedName("DDosProtectionConfig")
    @Expose
    private DDosProtectionConfig DDosProtectionConfig;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get L4 proxy instance name. Enter 1-50 characters. Allowed characters: a-z, 0-9, and -. The hyphen cannot be registered alone or used continuously, and cannot be placed at the beginning or the end. Modifications are not allowed after creation.
 
     * @return ProxyName L4 proxy instance name. Enter 1-50 characters. Allowed characters: a-z, 0-9, and -. The hyphen cannot be registered alone or used continuously, and cannot be placed at the beginning or the end. Modifications are not allowed after creation.

     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set L4 proxy instance name. Enter 1-50 characters. Allowed characters: a-z, 0-9, and -. The hyphen cannot be registered alone or used continuously, and cannot be placed at the beginning or the end. Modifications are not allowed after creation.

     * @param ProxyName L4 proxy instance name. Enter 1-50 characters. Allowed characters: a-z, 0-9, and -. The hyphen cannot be registered alone or used continuously, and cannot be placed at the beginning or the end. Modifications are not allowed after creation.

     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Acceleration zone of the L4 proxy instance.
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland);</li>
<li>global: global availability zone.</li> 
     * @return Area Acceleration zone of the L4 proxy instance.
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland);</li>
<li>global: global availability zone.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration zone of the L4 proxy instance.
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland);</li>
<li>global: global availability zone.</li>
     * @param Area Acceleration zone of the L4 proxy instance.
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland);</li>
<li>global: global availability zone.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether IPv6 access is enabled. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Ipv6 Whether IPv6 access is enabled. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Whether IPv6 access is enabled. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Ipv6 Whether IPv6 access is enabled. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Whether to enable static IP. Default off if left empty. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return StaticIp Whether to enable static IP. Default off if left empty. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getStaticIp() {
        return this.StaticIp;
    }

    /**
     * Set Whether to enable static IP. Default off if left empty. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param StaticIp Whether to enable static IP. Default off if left empty. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance (https://www.tencentcloud.com/document/product/1552/90025?from_cn_redirect=1). Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setStaticIp(String StaticIp) {
        this.StaticIp = StaticIp;
    }

    /**
     * Get Whether to enable network optimization in the Chinese mainland. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance. Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return AccelerateMainland Whether to enable network optimization in the Chinese mainland. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance. Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Whether to enable network optimization in the Chinese mainland. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance. Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param AccelerateMainland Whether to enable network optimization in the Chinese mainland. If left empty, it is off by default. This configuration can only be enabled in certain acceleration zones and security protection configurations. For details, refer to Creating a New Layer 4 Proxy Instance. Value:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setAccelerateMainland(String AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get Configuration of L3/L4 DDoS protection. If this parameter is not input, the default platform protection option is used. For details, see [Exclusive DDoS Protection](https://www.tencentcloud.com/document/product/1552/95994?from_cn_redirect=1).
This field is deprecated. Please use the DDosProtectionId field to specify the associated DDoS protection configuration. 
     * @return DDosProtectionConfig Configuration of L3/L4 DDoS protection. If this parameter is not input, the default platform protection option is used. For details, see [Exclusive DDoS Protection](https://www.tencentcloud.com/document/product/1552/95994?from_cn_redirect=1).
This field is deprecated. Please use the DDosProtectionId field to specify the associated DDoS protection configuration.
     * @deprecated
     */
    @Deprecated
    public DDosProtectionConfig getDDosProtectionConfig() {
        return this.DDosProtectionConfig;
    }

    /**
     * Set Configuration of L3/L4 DDoS protection. If this parameter is not input, the default platform protection option is used. For details, see [Exclusive DDoS Protection](https://www.tencentcloud.com/document/product/1552/95994?from_cn_redirect=1).
This field is deprecated. Please use the DDosProtectionId field to specify the associated DDoS protection configuration.
     * @param DDosProtectionConfig Configuration of L3/L4 DDoS protection. If this parameter is not input, the default platform protection option is used. For details, see [Exclusive DDoS Protection](https://www.tencentcloud.com/document/product/1552/95994?from_cn_redirect=1).
This field is deprecated. Please use the DDosProtectionId field to specify the associated DDoS protection configuration.
     * @deprecated
     */
    @Deprecated
    public void setDDosProtectionConfig(DDosProtectionConfig DDosProtectionConfig) {
        this.DDosProtectionConfig = DDosProtectionConfig;
    }

    public CreateL4ProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateL4ProxyRequest(CreateL4ProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.StaticIp != null) {
            this.StaticIp = new String(source.StaticIp);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new String(source.AccelerateMainland);
        }
        if (source.DDosProtectionConfig != null) {
            this.DDosProtectionConfig = new DDosProtectionConfig(source.DDosProtectionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "StaticIp", this.StaticIp);
        this.setParamSimple(map, prefix + "AccelerateMainland", this.AccelerateMainland);
        this.setParamObj(map, prefix + "DDosProtectionConfig.", this.DDosProtectionConfig);

    }
}

