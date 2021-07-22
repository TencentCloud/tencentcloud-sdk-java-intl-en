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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListBGPIPInstancesRequest extends AbstractModel{

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * IP filter
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * Anti-DDoS instance ID filter. For example, you can filter the Anti-DDoS Advanced instance ID by `bgpip-00000001`.
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * Anti-DDoS Advanced line filter. Valid values:
`1`: BGP line
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
    */
    @SerializedName("FilterLine")
    @Expose
    private Long FilterLine;

    /**
    * Region filter. For example, `ap-guangzhou`.
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * Name filter
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * Whether to obtain only Anti-DDoS EIP instances. `1`: Yes; `0`: No.
    */
    @SerializedName("FilterEipType")
    @Expose
    private Long FilterEipType;

    /**
    * Anti-DDoS Advanced instance binding status filter. Valid values: `BINDING`, `BIND`, `UNBINDING`, `UNBIND`. This filter is only valid when `FilterEipType = 1`.
    */
    @SerializedName("FilterEipEipAddressStatus")
    @Expose
    private String [] FilterEipEipAddressStatus;

    /**
     * Get Starting offset of the page. Value: (number of pages – 1) * items per page. 
     * @return Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages – 1) * items per page.
     * @param Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100. 
     * @return Limit Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     * @param Limit Number of items per page. The default value is 20 when `Limit = 0`. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get IP filter 
     * @return FilterIp IP filter
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP filter
     * @param FilterIp IP filter
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get Anti-DDoS instance ID filter. For example, you can filter the Anti-DDoS Advanced instance ID by `bgpip-00000001`. 
     * @return FilterInstanceId Anti-DDoS instance ID filter. For example, you can filter the Anti-DDoS Advanced instance ID by `bgpip-00000001`.
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set Anti-DDoS instance ID filter. For example, you can filter the Anti-DDoS Advanced instance ID by `bgpip-00000001`.
     * @param FilterInstanceId Anti-DDoS instance ID filter. For example, you can filter the Anti-DDoS Advanced instance ID by `bgpip-00000001`.
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get Anti-DDoS Advanced line filter. Valid values:
`1`: BGP line
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
] 
     * @return FilterLine Anti-DDoS Advanced line filter. Valid values:
`1`: BGP line
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     */
    public Long getFilterLine() {
        return this.FilterLine;
    }

    /**
     * Set Anti-DDoS Advanced line filter. Valid values:
`1`: BGP line
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     * @param FilterLine Anti-DDoS Advanced line filter. Valid values:
`1`: BGP line
`2`: China Telecom
`3`: China Unicom
`4`: China Mobile
`99`: third-party line
]
     */
    public void setFilterLine(Long FilterLine) {
        this.FilterLine = FilterLine;
    }

    /**
     * Get Region filter. For example, `ap-guangzhou`. 
     * @return FilterRegion Region filter. For example, `ap-guangzhou`.
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set Region filter. For example, `ap-guangzhou`.
     * @param FilterRegion Region filter. For example, `ap-guangzhou`.
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get Name filter 
     * @return FilterName Name filter
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set Name filter
     * @param FilterName Name filter
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get Whether to obtain only Anti-DDoS EIP instances. `1`: Yes; `0`: No. 
     * @return FilterEipType Whether to obtain only Anti-DDoS EIP instances. `1`: Yes; `0`: No.
     */
    public Long getFilterEipType() {
        return this.FilterEipType;
    }

    /**
     * Set Whether to obtain only Anti-DDoS EIP instances. `1`: Yes; `0`: No.
     * @param FilterEipType Whether to obtain only Anti-DDoS EIP instances. `1`: Yes; `0`: No.
     */
    public void setFilterEipType(Long FilterEipType) {
        this.FilterEipType = FilterEipType;
    }

    /**
     * Get Anti-DDoS Advanced instance binding status filter. Valid values: `BINDING`, `BIND`, `UNBINDING`, `UNBIND`. This filter is only valid when `FilterEipType = 1`. 
     * @return FilterEipEipAddressStatus Anti-DDoS Advanced instance binding status filter. Valid values: `BINDING`, `BIND`, `UNBINDING`, `UNBIND`. This filter is only valid when `FilterEipType = 1`.
     */
    public String [] getFilterEipEipAddressStatus() {
        return this.FilterEipEipAddressStatus;
    }

    /**
     * Set Anti-DDoS Advanced instance binding status filter. Valid values: `BINDING`, `BIND`, `UNBINDING`, `UNBIND`. This filter is only valid when `FilterEipType = 1`.
     * @param FilterEipEipAddressStatus Anti-DDoS Advanced instance binding status filter. Valid values: `BINDING`, `BIND`, `UNBINDING`, `UNBIND`. This filter is only valid when `FilterEipType = 1`.
     */
    public void setFilterEipEipAddressStatus(String [] FilterEipEipAddressStatus) {
        this.FilterEipEipAddressStatus = FilterEipEipAddressStatus;
    }

    public DescribeListBGPIPInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListBGPIPInstancesRequest(DescribeListBGPIPInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterLine != null) {
            this.FilterLine = new Long(source.FilterLine);
        }
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterEipType != null) {
            this.FilterEipType = new Long(source.FilterEipType);
        }
        if (source.FilterEipEipAddressStatus != null) {
            this.FilterEipEipAddressStatus = new String[source.FilterEipEipAddressStatus.length];
            for (int i = 0; i < source.FilterEipEipAddressStatus.length; i++) {
                this.FilterEipEipAddressStatus[i] = new String(source.FilterEipEipAddressStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterLine", this.FilterLine);
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterEipType", this.FilterEipType);
        this.setParamArraySimple(map, prefix + "FilterEipEipAddressStatus.", this.FilterEipEipAddressStatus);

    }
}

