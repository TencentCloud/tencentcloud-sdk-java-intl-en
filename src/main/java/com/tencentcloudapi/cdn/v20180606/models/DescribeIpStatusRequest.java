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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpStatusRequest extends AbstractModel {

    /**
    * Acceleration domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Node type.
`edge`: Edge server
`last`: Intermediate server
If this parameter is left empty, edge server information will be returned by default
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * Specifies a region to query.
`mainland`: Nodes in the Chinese mainland
`overseas`: Nodes outside the Chinese mainland
`global`: Global nodes
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether to return a value as an IP range
    */
    @SerializedName("Segment")
    @Expose
    private Boolean Segment;

    /**
    * 
    */
    @SerializedName("ShowIpv6")
    @Expose
    private Boolean ShowIpv6;

    /**
    * Whether to abbreviate the IPv6 address.
    */
    @SerializedName("AbbreviationIpv6")
    @Expose
    private Boolean AbbreviationIpv6;

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
     * Get Node type.
`edge`: Edge server
`last`: Intermediate server
If this parameter is left empty, edge server information will be returned by default 
     * @return Layer Node type.
`edge`: Edge server
`last`: Intermediate server
If this parameter is left empty, edge server information will be returned by default
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set Node type.
`edge`: Edge server
`last`: Intermediate server
If this parameter is left empty, edge server information will be returned by default
     * @param Layer Node type.
`edge`: Edge server
`last`: Intermediate server
If this parameter is left empty, edge server information will be returned by default
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Specifies a region to query.
`mainland`: Nodes in the Chinese mainland
`overseas`: Nodes outside the Chinese mainland
`global`: Global nodes 
     * @return Area Specifies a region to query.
`mainland`: Nodes in the Chinese mainland
`overseas`: Nodes outside the Chinese mainland
`global`: Global nodes
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a region to query.
`mainland`: Nodes in the Chinese mainland
`overseas`: Nodes outside the Chinese mainland
`global`: Global nodes
     * @param Area Specifies a region to query.
`mainland`: Nodes in the Chinese mainland
`overseas`: Nodes outside the Chinese mainland
`global`: Global nodes
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether to return a value as an IP range 
     * @return Segment Whether to return a value as an IP range
     */
    public Boolean getSegment() {
        return this.Segment;
    }

    /**
     * Set Whether to return a value as an IP range
     * @param Segment Whether to return a value as an IP range
     */
    public void setSegment(Boolean Segment) {
        this.Segment = Segment;
    }

    /**
     * Get  
     * @return ShowIpv6 
     */
    public Boolean getShowIpv6() {
        return this.ShowIpv6;
    }

    /**
     * Set 
     * @param ShowIpv6 
     */
    public void setShowIpv6(Boolean ShowIpv6) {
        this.ShowIpv6 = ShowIpv6;
    }

    /**
     * Get Whether to abbreviate the IPv6 address. 
     * @return AbbreviationIpv6 Whether to abbreviate the IPv6 address.
     */
    public Boolean getAbbreviationIpv6() {
        return this.AbbreviationIpv6;
    }

    /**
     * Set Whether to abbreviate the IPv6 address.
     * @param AbbreviationIpv6 Whether to abbreviate the IPv6 address.
     */
    public void setAbbreviationIpv6(Boolean AbbreviationIpv6) {
        this.AbbreviationIpv6 = AbbreviationIpv6;
    }

    public DescribeIpStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpStatusRequest(DescribeIpStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Segment != null) {
            this.Segment = new Boolean(source.Segment);
        }
        if (source.ShowIpv6 != null) {
            this.ShowIpv6 = new Boolean(source.ShowIpv6);
        }
        if (source.AbbreviationIpv6 != null) {
            this.AbbreviationIpv6 = new Boolean(source.AbbreviationIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Segment", this.Segment);
        this.setParamSimple(map, prefix + "ShowIpv6", this.ShowIpv6);
        this.setParamSimple(map, prefix + "AbbreviationIpv6", this.AbbreviationIpv6);

    }
}

