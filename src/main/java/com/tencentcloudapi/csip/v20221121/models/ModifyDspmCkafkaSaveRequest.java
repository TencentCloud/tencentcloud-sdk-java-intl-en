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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmCkafkaSaveRequest extends AbstractModel {

    /**
    * <p>Access type. Currently supported values: 1 and 7</p><p>Enumeration values:</p><ul><li>1: External TGW</li><li>2: Basic network</li><li>3: VPC network</li><li>4: idc environment - supporting network</li><li>5: SSL public network access method</li><li>6: Blackstone Environment VPC</li><li>7: cvm environment - supporting network</li></ul>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>Region of the instance</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance access information</p>
    */
    @SerializedName("RouteInfo")
    @Expose
    private RouteInfo RouteInfo;

    /**
    * <p>When integration is for a domain name, it is valid</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>It is valid when the integration is for the domain.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Topic configuration for log shipping</p>
    */
    @SerializedName("LogDeliveryInfo")
    @Expose
    private LogDeliveryInfo [] LogDeliveryInfo;

    /**
    * <p>Whether to overwrite existing configurations. false by default (not overwrite, be compatible)</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Access type. Currently supported values: 1 and 7</p><p>Enumeration values:</p><ul><li>1: External TGW</li><li>2: Basic network</li><li>3: VPC network</li><li>4: idc environment - supporting network</li><li>5: SSL public network access method</li><li>6: Blackstone Environment VPC</li><li>7: cvm environment - supporting network</li></ul> 
     * @return VipType <p>Access type. Currently supported values: 1 and 7</p><p>Enumeration values:</p><ul><li>1: External TGW</li><li>2: Basic network</li><li>3: VPC network</li><li>4: idc environment - supporting network</li><li>5: SSL public network access method</li><li>6: Blackstone Environment VPC</li><li>7: cvm environment - supporting network</li></ul>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>Access type. Currently supported values: 1 and 7</p><p>Enumeration values:</p><ul><li>1: External TGW</li><li>2: Basic network</li><li>3: VPC network</li><li>4: idc environment - supporting network</li><li>5: SSL public network access method</li><li>6: Blackstone Environment VPC</li><li>7: cvm environment - supporting network</li></ul>
     * @param VipType <p>Access type. Currently supported values: 1 and 7</p><p>Enumeration values:</p><ul><li>1: External TGW</li><li>2: Basic network</li><li>3: VPC network</li><li>4: idc environment - supporting network</li><li>5: SSL public network access method</li><li>6: Blackstone Environment VPC</li><li>7: cvm environment - supporting network</li></ul>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>Region of the instance</p> 
     * @return RegionId <p>Region of the instance</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region of the instance</p>
     * @param RegionId <p>Region of the instance</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance access information</p> 
     * @return RouteInfo <p>Instance access information</p>
     */
    public RouteInfo getRouteInfo() {
        return this.RouteInfo;
    }

    /**
     * Set <p>Instance access information</p>
     * @param RouteInfo <p>Instance access information</p>
     */
    public void setRouteInfo(RouteInfo RouteInfo) {
        this.RouteInfo = RouteInfo;
    }

    /**
     * Get <p>When integration is for a domain name, it is valid</p> 
     * @return Username <p>When integration is for a domain name, it is valid</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>When integration is for a domain name, it is valid</p>
     * @param Username <p>When integration is for a domain name, it is valid</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>It is valid when the integration is for the domain.</p> 
     * @return Password <p>It is valid when the integration is for the domain.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>It is valid when the integration is for the domain.</p>
     * @param Password <p>It is valid when the integration is for the domain.</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Topic configuration for log shipping</p> 
     * @return LogDeliveryInfo <p>Topic configuration for log shipping</p>
     */
    public LogDeliveryInfo [] getLogDeliveryInfo() {
        return this.LogDeliveryInfo;
    }

    /**
     * Set <p>Topic configuration for log shipping</p>
     * @param LogDeliveryInfo <p>Topic configuration for log shipping</p>
     */
    public void setLogDeliveryInfo(LogDeliveryInfo [] LogDeliveryInfo) {
        this.LogDeliveryInfo = LogDeliveryInfo;
    }

    /**
     * Get <p>Whether to overwrite existing configurations. false by default (not overwrite, be compatible)</p> 
     * @return IsOverwrite <p>Whether to overwrite existing configurations. false by default (not overwrite, be compatible)</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>Whether to overwrite existing configurations. false by default (not overwrite, be compatible)</p>
     * @param IsOverwrite <p>Whether to overwrite existing configurations. false by default (not overwrite, be compatible)</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyDspmCkafkaSaveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmCkafkaSaveRequest(ModifyDspmCkafkaSaveRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RouteInfo != null) {
            this.RouteInfo = new RouteInfo(source.RouteInfo);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.LogDeliveryInfo != null) {
            this.LogDeliveryInfo = new LogDeliveryInfo[source.LogDeliveryInfo.length];
            for (int i = 0; i < source.LogDeliveryInfo.length; i++) {
                this.LogDeliveryInfo[i] = new LogDeliveryInfo(source.LogDeliveryInfo[i]);
            }
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "RouteInfo.", this.RouteInfo);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "LogDeliveryInfo.", this.LogDeliveryInfo);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

