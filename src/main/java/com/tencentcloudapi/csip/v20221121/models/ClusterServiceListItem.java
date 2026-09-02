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

public class ClusterServiceListItem extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Asset id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>selector tag.</p>
    */
    @SerializedName("SelectorLabel")
    @Expose
    private AssetTag [] SelectorLabel;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Unique service ID</p>
    */
    @SerializedName("ServiceUniqueID")
    @Expose
    private String ServiceUniqueID;

    /**
    * <p>service type</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>Cluster IP</p>
    */
    @SerializedName("ClusterIP")
    @Expose
    private String ClusterIP;

    /**
    * <p>Public network IP.</p>
    */
    @SerializedName("ExternalIP")
    @Expose
    private String [] ExternalIP;

    /**
    * <p>Port</p>
    */
    @SerializedName("Ports")
    @Expose
    private String [] Ports;

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Asset id</p> 
     * @return AssetId <p>Asset id</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset id</p>
     * @param AssetId <p>Asset id</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Name.</p> 
     * @return Name <p>Name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p>
     * @param Name <p>Name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>selector tag.</p> 
     * @return SelectorLabel <p>selector tag.</p>
     */
    public AssetTag [] getSelectorLabel() {
        return this.SelectorLabel;
    }

    /**
     * Set <p>selector tag.</p>
     * @param SelectorLabel <p>selector tag.</p>
     */
    public void setSelectorLabel(AssetTag [] SelectorLabel) {
        this.SelectorLabel = SelectorLabel;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Unique service ID</p> 
     * @return ServiceUniqueID <p>Unique service ID</p>
     */
    public String getServiceUniqueID() {
        return this.ServiceUniqueID;
    }

    /**
     * Set <p>Unique service ID</p>
     * @param ServiceUniqueID <p>Unique service ID</p>
     */
    public void setServiceUniqueID(String ServiceUniqueID) {
        this.ServiceUniqueID = ServiceUniqueID;
    }

    /**
     * Get <p>service type</p> 
     * @return ServiceType <p>service type</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>service type</p>
     * @param ServiceType <p>service type</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>Cluster IP</p> 
     * @return ClusterIP <p>Cluster IP</p>
     */
    public String getClusterIP() {
        return this.ClusterIP;
    }

    /**
     * Set <p>Cluster IP</p>
     * @param ClusterIP <p>Cluster IP</p>
     */
    public void setClusterIP(String ClusterIP) {
        this.ClusterIP = ClusterIP;
    }

    /**
     * Get <p>Public network IP.</p> 
     * @return ExternalIP <p>Public network IP.</p>
     */
    public String [] getExternalIP() {
        return this.ExternalIP;
    }

    /**
     * Set <p>Public network IP.</p>
     * @param ExternalIP <p>Public network IP.</p>
     */
    public void setExternalIP(String [] ExternalIP) {
        this.ExternalIP = ExternalIP;
    }

    /**
     * Get <p>Port</p> 
     * @return Ports <p>Port</p>
     */
    public String [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>Port</p>
     * @param Ports <p>Port</p>
     */
    public void setPorts(String [] Ports) {
        this.Ports = Ports;
    }

    public ClusterServiceListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterServiceListItem(ClusterServiceListItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SelectorLabel != null) {
            this.SelectorLabel = new AssetTag[source.SelectorLabel.length];
            for (int i = 0; i < source.SelectorLabel.length; i++) {
                this.SelectorLabel[i] = new AssetTag(source.SelectorLabel[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ServiceUniqueID != null) {
            this.ServiceUniqueID = new String(source.ServiceUniqueID);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ClusterIP != null) {
            this.ClusterIP = new String(source.ClusterIP);
        }
        if (source.ExternalIP != null) {
            this.ExternalIP = new String[source.ExternalIP.length];
            for (int i = 0; i < source.ExternalIP.length; i++) {
                this.ExternalIP[i] = new String(source.ExternalIP[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new String[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new String(source.Ports[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SelectorLabel.", this.SelectorLabel);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ServiceUniqueID", this.ServiceUniqueID);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ClusterIP", this.ClusterIP);
        this.setParamArraySimple(map, prefix + "ExternalIP.", this.ExternalIP);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);

    }
}

