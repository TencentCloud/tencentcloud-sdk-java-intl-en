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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerAddressTypeRequest extends AbstractModel {

    /**
    * Target network type. Value:
- **Internet** (public network)
A load balancing instance is assigned a public network IP address, and the domain name (DNS) is parsed to the public network IP. It can be directly accessed via the public network and is suitable for business scenarios that provide external services.
- **Intranet** (private network)
Load balancing instances are assigned only private IP addresses, and the domain name (DNS) resolves to the private IP. Access is supported only within the private network environment of the VPC to which the load balancing instance belongs. This is suitable for internal business or scenarios with high security requirements.
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Bandwidth package ID.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Whether to only precheck this request. Parameter Value:
- **true**: Send a check request without updating the network type of the instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Availability zone and subnet mapping structure.
If the current region supports 2 or more AZs, a minimum of 2 AZs is required.
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingsItem [] ZoneMappings;

    /**
     * Get Target network type. Value:
- **Internet** (public network)
A load balancing instance is assigned a public network IP address, and the domain name (DNS) is parsed to the public network IP. It can be directly accessed via the public network and is suitable for business scenarios that provide external services.
- **Intranet** (private network)
Load balancing instances are assigned only private IP addresses, and the domain name (DNS) resolves to the private IP. Access is supported only within the private network environment of the VPC to which the load balancing instance belongs. This is suitable for internal business or scenarios with high security requirements. 
     * @return AddressType Target network type. Value:
- **Internet** (public network)
A load balancing instance is assigned a public network IP address, and the domain name (DNS) is parsed to the public network IP. It can be directly accessed via the public network and is suitable for business scenarios that provide external services.
- **Intranet** (private network)
Load balancing instances are assigned only private IP addresses, and the domain name (DNS) resolves to the private IP. Access is supported only within the private network environment of the VPC to which the load balancing instance belongs. This is suitable for internal business or scenarios with high security requirements.
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set Target network type. Value:
- **Internet** (public network)
A load balancing instance is assigned a public network IP address, and the domain name (DNS) is parsed to the public network IP. It can be directly accessed via the public network and is suitable for business scenarios that provide external services.
- **Intranet** (private network)
Load balancing instances are assigned only private IP addresses, and the domain name (DNS) resolves to the private IP. Access is supported only within the private network environment of the VPC to which the load balancing instance belongs. This is suitable for internal business or scenarios with high security requirements.
     * @param AddressType Target network type. Value:
- **Internet** (public network)
A load balancing instance is assigned a public network IP address, and the domain name (DNS) is parsed to the public network IP. It can be directly accessed via the public network and is suitable for business scenarios that provide external services.
- **Intranet** (private network)
Load balancing instances are assigned only private IP addresses, and the domain name (DNS) resolves to the private IP. Access is supported only within the private network environment of the VPC to which the load balancing instance belongs. This is suitable for internal business or scenarios with high security requirements.
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get CLB instance ID. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Bandwidth package ID. 
     * @return BandwidthPackageId Bandwidth package ID.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID.
     * @param BandwidthPackageId Bandwidth package ID.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Whether to only precheck this request. Parameter Value:
- **true**: Send a check request without updating the network type of the instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Parameter Value:
- **true**: Send a check request without updating the network type of the instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter Value:
- **true**: Send a check request without updating the network type of the instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Parameter Value:
- **true**: Send a check request without updating the network type of the instance. Check items include whether required parameters are filled in, request format, and service limits. If the check fails, return the corresponding error. If the check passes, return the error code `DryRunOperation`.
- **false** (default value): Send a normal request, return HTTP 2xx status code after check, and directly perform the operation.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Availability zone and subnet mapping structure.
If the current region supports 2 or more AZs, a minimum of 2 AZs is required. 
     * @return ZoneMappings Availability zone and subnet mapping structure.
If the current region supports 2 or more AZs, a minimum of 2 AZs is required.
     */
    public ZoneMappingsItem [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set Availability zone and subnet mapping structure.
If the current region supports 2 or more AZs, a minimum of 2 AZs is required.
     * @param ZoneMappings Availability zone and subnet mapping structure.
If the current region supports 2 or more AZs, a minimum of 2 AZs is required.
     */
    public void setZoneMappings(ZoneMappingsItem [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    public ModifyLoadBalancerAddressTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAddressTypeRequest(ModifyLoadBalancerAddressTypeRequest source) {
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingsItem[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingsItem(source.ZoneMappings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);

    }
}

