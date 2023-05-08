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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNatFwInstanceWithDomainRequest extends AbstractModel{

    /**
    * Firewall instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Bandwidth
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Mode. 1: use existing; 0: create new
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Parameter passed for the Create New mode. Either NewModeItems or NatgwList is required.
    */
    @SerializedName("NewModeItems")
    @Expose
    private NewModeItems NewModeItems;

    /**
    * NAT gateway list for the Using Existing mode. Either NewModeItems or NatgwList is required.
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * Primary zone. The default zone is selected if it is empty.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Secondary zone. The default zone is selected if it is empty.
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * Remote disaster recovery. 1: enable; 0: disable; empty: disable by default
    */
    @SerializedName("CrossAZone")
    @Expose
    private Long CrossAZone;

    /**
    * 0: not create; 1: create
    */
    @SerializedName("IsCreateDomain")
    @Expose
    private Long IsCreateDomain;

    /**
    * Required for creating a domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP range of the firewall
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
     * Get Firewall instance name 
     * @return Name Firewall instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Firewall instance name
     * @param Name Firewall instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Bandwidth 
     * @return Width Bandwidth
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Bandwidth
     * @param Width Bandwidth
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Mode. 1: use existing; 0: create new 
     * @return Mode Mode. 1: use existing; 0: create new
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Mode. 1: use existing; 0: create new
     * @param Mode Mode. 1: use existing; 0: create new
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Parameter passed for the Create New mode. Either NewModeItems or NatgwList is required. 
     * @return NewModeItems Parameter passed for the Create New mode. Either NewModeItems or NatgwList is required.
     */
    public NewModeItems getNewModeItems() {
        return this.NewModeItems;
    }

    /**
     * Set Parameter passed for the Create New mode. Either NewModeItems or NatgwList is required.
     * @param NewModeItems Parameter passed for the Create New mode. Either NewModeItems or NatgwList is required.
     */
    public void setNewModeItems(NewModeItems NewModeItems) {
        this.NewModeItems = NewModeItems;
    }

    /**
     * Get NAT gateway list for the Using Existing mode. Either NewModeItems or NatgwList is required. 
     * @return NatGwList NAT gateway list for the Using Existing mode. Either NewModeItems or NatgwList is required.
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set NAT gateway list for the Using Existing mode. Either NewModeItems or NatgwList is required.
     * @param NatGwList NAT gateway list for the Using Existing mode. Either NewModeItems or NatgwList is required.
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get Primary zone. The default zone is selected if it is empty. 
     * @return Zone Primary zone. The default zone is selected if it is empty.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Primary zone. The default zone is selected if it is empty.
     * @param Zone Primary zone. The default zone is selected if it is empty.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Secondary zone. The default zone is selected if it is empty. 
     * @return ZoneBak Secondary zone. The default zone is selected if it is empty.
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set Secondary zone. The default zone is selected if it is empty.
     * @param ZoneBak Secondary zone. The default zone is selected if it is empty.
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get Remote disaster recovery. 1: enable; 0: disable; empty: disable by default 
     * @return CrossAZone Remote disaster recovery. 1: enable; 0: disable; empty: disable by default
     */
    public Long getCrossAZone() {
        return this.CrossAZone;
    }

    /**
     * Set Remote disaster recovery. 1: enable; 0: disable; empty: disable by default
     * @param CrossAZone Remote disaster recovery. 1: enable; 0: disable; empty: disable by default
     */
    public void setCrossAZone(Long CrossAZone) {
        this.CrossAZone = CrossAZone;
    }

    /**
     * Get 0: not create; 1: create 
     * @return IsCreateDomain 0: not create; 1: create
     */
    public Long getIsCreateDomain() {
        return this.IsCreateDomain;
    }

    /**
     * Set 0: not create; 1: create
     * @param IsCreateDomain 0: not create; 1: create
     */
    public void setIsCreateDomain(Long IsCreateDomain) {
        this.IsCreateDomain = IsCreateDomain;
    }

    /**
     * Get Required for creating a domain name 
     * @return Domain Required for creating a domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Required for creating a domain name
     * @param Domain Required for creating a domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP range of the firewall 
     * @return FwCidrInfo IP range of the firewall
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set IP range of the firewall
     * @param FwCidrInfo IP range of the firewall
     */
    public void setFwCidrInfo(FwCidrInfo FwCidrInfo) {
        this.FwCidrInfo = FwCidrInfo;
    }

    public CreateNatFwInstanceWithDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatFwInstanceWithDomainRequest(CreateNatFwInstanceWithDomainRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.NewModeItems != null) {
            this.NewModeItems = new NewModeItems(source.NewModeItems);
        }
        if (source.NatGwList != null) {
            this.NatGwList = new String[source.NatGwList.length];
            for (int i = 0; i < source.NatGwList.length; i++) {
                this.NatGwList[i] = new String(source.NatGwList[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneBak != null) {
            this.ZoneBak = new String(source.ZoneBak);
        }
        if (source.CrossAZone != null) {
            this.CrossAZone = new Long(source.CrossAZone);
        }
        if (source.IsCreateDomain != null) {
            this.IsCreateDomain = new Long(source.IsCreateDomain);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.FwCidrInfo != null) {
            this.FwCidrInfo = new FwCidrInfo(source.FwCidrInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "NewModeItems.", this.NewModeItems);
        this.setParamArraySimple(map, prefix + "NatGwList.", this.NatGwList);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneBak", this.ZoneBak);
        this.setParamSimple(map, prefix + "CrossAZone", this.CrossAZone);
        this.setParamSimple(map, prefix + "IsCreateDomain", this.IsCreateDomain);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "FwCidrInfo.", this.FwCidrInfo);

    }
}

