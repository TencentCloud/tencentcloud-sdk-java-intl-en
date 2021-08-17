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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BriefDomain extends AbstractModel{

    /**
    * Domain name ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Tencent Cloud account ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Acceleration domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * CNAME address of domain name
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Acceleration service status
rejected: the domain name is rejected due to expiration/deregistration of its ICP filing
processing: deploying
online: activated
offline: disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Project ID, which can be viewed on the Tencent Cloud project management page
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Domain name service type
web: static acceleration
download: download acceleration
media: streaming VOD acceleration
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Domain name creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of domain name
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin server configuration details
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * Domain name block status
normal: normal
overdue: the domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
malicious: the acceleration service has been forcibly disabled due to detection of malicious behavior.
ddos: the acceleration service has been disabled due to large-scale DDoS attacks to the domain name
idle: no operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
unlicensed: the acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
capping: the configured upper limit for bandwidth has been reached.
readonly: the domain name has a special configuration and has been locked.
    */
    @SerializedName("Disable")
    @Expose
    private String Disable;

    /**
    * Acceleration region
mainland: acceleration in Mainland China
overseas: acceleration outside Mainland China
global: global acceleration
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Domain name lock status
normal: not locked
mainland: locked in Mainland China
overseas: locked outside Mainland China
global: locked globally
    */
    @SerializedName("Readonly")
    @Expose
    private String Readonly;

    /**
    * Product of the domain name, either `cdn` or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Domain name ID 
     * @return ResourceId Domain name ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Domain name ID
     * @param ResourceId Domain name ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Tencent Cloud account ID 
     * @return AppId Tencent Cloud account ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tencent Cloud account ID
     * @param AppId Tencent Cloud account ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Acceleration domain name 
     * @return Domain Acceleration domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Acceleration domain name
     * @param Domain Acceleration domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get CNAME address of domain name 
     * @return Cname CNAME address of domain name
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME address of domain name
     * @param Cname CNAME address of domain name
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Acceleration service status
rejected: the domain name is rejected due to expiration/deregistration of its ICP filing
processing: deploying
online: activated
offline: disabled 
     * @return Status Acceleration service status
rejected: the domain name is rejected due to expiration/deregistration of its ICP filing
processing: deploying
online: activated
offline: disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Acceleration service status
rejected: the domain name is rejected due to expiration/deregistration of its ICP filing
processing: deploying
online: activated
offline: disabled
     * @param Status Acceleration service status
rejected: the domain name is rejected due to expiration/deregistration of its ICP filing
processing: deploying
online: activated
offline: disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID, which can be viewed on the Tencent Cloud project management page 
     * @return ProjectId Project ID, which can be viewed on the Tencent Cloud project management page
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, which can be viewed on the Tencent Cloud project management page
     * @param ProjectId Project ID, which can be viewed on the Tencent Cloud project management page
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Domain name service type
web: static acceleration
download: download acceleration
media: streaming VOD acceleration 
     * @return ServiceType Domain name service type
web: static acceleration
download: download acceleration
media: streaming VOD acceleration
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Domain name service type
web: static acceleration
download: download acceleration
media: streaming VOD acceleration
     * @param ServiceType Domain name service type
web: static acceleration
download: download acceleration
media: streaming VOD acceleration
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Domain name creation time 
     * @return CreateTime Domain name creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Domain name creation time
     * @param CreateTime Domain name creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of domain name 
     * @return UpdateTime Last modified time of domain name
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of domain name
     * @param UpdateTime Last modified time of domain name
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin server configuration details 
     * @return Origin Origin server configuration details
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server configuration details
     * @param Origin Origin server configuration details
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Domain name block status
normal: normal
overdue: the domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
malicious: the acceleration service has been forcibly disabled due to detection of malicious behavior.
ddos: the acceleration service has been disabled due to large-scale DDoS attacks to the domain name
idle: no operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
unlicensed: the acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
capping: the configured upper limit for bandwidth has been reached.
readonly: the domain name has a special configuration and has been locked. 
     * @return Disable Domain name block status
normal: normal
overdue: the domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
malicious: the acceleration service has been forcibly disabled due to detection of malicious behavior.
ddos: the acceleration service has been disabled due to large-scale DDoS attacks to the domain name
idle: no operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
unlicensed: the acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
capping: the configured upper limit for bandwidth has been reached.
readonly: the domain name has a special configuration and has been locked.
     */
    public String getDisable() {
        return this.Disable;
    }

    /**
     * Set Domain name block status
normal: normal
overdue: the domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
malicious: the acceleration service has been forcibly disabled due to detection of malicious behavior.
ddos: the acceleration service has been disabled due to large-scale DDoS attacks to the domain name
idle: no operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
unlicensed: the acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
capping: the configured upper limit for bandwidth has been reached.
readonly: the domain name has a special configuration and has been locked.
     * @param Disable Domain name block status
normal: normal
overdue: the domain name has been disabled due to account arrears. The acceleration service can be resumed after the account is topped up.
malicious: the acceleration service has been forcibly disabled due to detection of malicious behavior.
ddos: the acceleration service has been disabled due to large-scale DDoS attacks to the domain name
idle: no operations or data has been detected for more than 90 days. The domain name is determined to be inactive which automatically disables the acceleration service. You can restart the service.
unlicensed: the acceleration service has been automatically disabled as the domain name has no ICP filing or its ICP filing is deregistered. Service can be resumed after an ICP filing is obtained.
capping: the configured upper limit for bandwidth has been reached.
readonly: the domain name has a special configuration and has been locked.
     */
    public void setDisable(String Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Acceleration region
mainland: acceleration in Mainland China
overseas: acceleration outside Mainland China
global: global acceleration 
     * @return Area Acceleration region
mainland: acceleration in Mainland China
overseas: acceleration outside Mainland China
global: global acceleration
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region
mainland: acceleration in Mainland China
overseas: acceleration outside Mainland China
global: global acceleration
     * @param Area Acceleration region
mainland: acceleration in Mainland China
overseas: acceleration outside Mainland China
global: global acceleration
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Domain name lock status
normal: not locked
mainland: locked in Mainland China
overseas: locked outside Mainland China
global: locked globally 
     * @return Readonly Domain name lock status
normal: not locked
mainland: locked in Mainland China
overseas: locked outside Mainland China
global: locked globally
     */
    public String getReadonly() {
        return this.Readonly;
    }

    /**
     * Set Domain name lock status
normal: not locked
mainland: locked in Mainland China
overseas: locked outside Mainland China
global: locked globally
     * @param Readonly Domain name lock status
normal: not locked
mainland: locked in Mainland China
overseas: locked outside Mainland China
global: locked globally
     */
    public void setReadonly(String Readonly) {
        this.Readonly = Readonly;
    }

    /**
     * Get Product of the domain name, either `cdn` or `ecdn`. 
     * @return Product Product of the domain name, either `cdn` or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Product of the domain name, either `cdn` or `ecdn`.
     * @param Product Product of the domain name, either `cdn` or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public BriefDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BriefDomain(BriefDomain source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.Disable != null) {
            this.Disable = new String(source.Disable);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Readonly != null) {
            this.Readonly = new String(source.Readonly);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Readonly", this.Readonly);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

