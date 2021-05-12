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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceListRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Region code search, which is optional. If no regions are to be specified, enter an empty array. If a region is to be specified, enter a region code, such as ["gz", "sh"]
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * Line search. This field can be optionally entered only when getting the list of Anti-DDoS Advanced resources. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. Please enter an empty array when getting other products;
    */
    @SerializedName("Line")
    @Expose
    private Long [] Line;

    /**
    * Resource ID search, which is optional. If this field is not an empty array, it means to get the resource list of a specified resource;
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * Resource name search, which is optional. If this field is not an empty string, it means to search for resources by name;
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IP query list, which is optional. Resources will be queried by IP if the list is not empty.
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * Resource status search list, which is optional. Valid values: [0 (running), 1 (cleansing), 2 (blocking)]. No status search will be performed if an empty array is entered;
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Expiring resource search, which is optional. Valid values: [0 (no search), 1 (search for expiring resources)]
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * Sort by field, which is optional
    */
    @SerializedName("OderBy")
    @Expose
    private OrderBy [] OderBy;

    /**
    * Number of entries per page. A value of 0 means no pagination
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page start offset, whose value is (page number - 1) * number of entries per page
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * CNAME of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
    */
    @SerializedName("CName")
    @Expose
    private String CName;

    /**
    * Domain name of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate) 
     * @return Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     * @param Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `bgpip`: Anti-DDoS Advanced, `net`: Anti-DDoS Ultimate)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Region code search, which is optional. If no regions are to be specified, enter an empty array. If a region is to be specified, enter a region code, such as ["gz", "sh"] 
     * @return RegionList Region code search, which is optional. If no regions are to be specified, enter an empty array. If a region is to be specified, enter a region code, such as ["gz", "sh"]
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set Region code search, which is optional. If no regions are to be specified, enter an empty array. If a region is to be specified, enter a region code, such as ["gz", "sh"]
     * @param RegionList Region code search, which is optional. If no regions are to be specified, enter an empty array. If a region is to be specified, enter a region code, such as ["gz", "sh"]
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get Line search. This field can be optionally entered only when getting the list of Anti-DDoS Advanced resources. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. Please enter an empty array when getting other products; 
     * @return Line Line search. This field can be optionally entered only when getting the list of Anti-DDoS Advanced resources. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. Please enter an empty array when getting other products;
     */
    public Long [] getLine() {
        return this.Line;
    }

    /**
     * Set Line search. This field can be optionally entered only when getting the list of Anti-DDoS Advanced resources. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. Please enter an empty array when getting other products;
     * @param Line Line search. This field can be optionally entered only when getting the list of Anti-DDoS Advanced resources. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. Please enter an empty array when getting other products;
     */
    public void setLine(Long [] Line) {
        this.Line = Line;
    }

    /**
     * Get Resource ID search, which is optional. If this field is not an empty array, it means to get the resource list of a specified resource; 
     * @return IdList Resource ID search, which is optional. If this field is not an empty array, it means to get the resource list of a specified resource;
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set Resource ID search, which is optional. If this field is not an empty array, it means to get the resource list of a specified resource;
     * @param IdList Resource ID search, which is optional. If this field is not an empty array, it means to get the resource list of a specified resource;
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get Resource name search, which is optional. If this field is not an empty string, it means to search for resources by name; 
     * @return Name Resource name search, which is optional. If this field is not an empty string, it means to search for resources by name;
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource name search, which is optional. If this field is not an empty string, it means to search for resources by name;
     * @param Name Resource name search, which is optional. If this field is not an empty string, it means to search for resources by name;
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IP query list, which is optional. Resources will be queried by IP if the list is not empty. 
     * @return IpList IP query list, which is optional. Resources will be queried by IP if the list is not empty.
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP query list, which is optional. Resources will be queried by IP if the list is not empty.
     * @param IpList IP query list, which is optional. Resources will be queried by IP if the list is not empty.
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get Resource status search list, which is optional. Valid values: [0 (running), 1 (cleansing), 2 (blocking)]. No status search will be performed if an empty array is entered; 
     * @return Status Resource status search list, which is optional. Valid values: [0 (running), 1 (cleansing), 2 (blocking)]. No status search will be performed if an empty array is entered;
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Resource status search list, which is optional. Valid values: [0 (running), 1 (cleansing), 2 (blocking)]. No status search will be performed if an empty array is entered;
     * @param Status Resource status search list, which is optional. Valid values: [0 (running), 1 (cleansing), 2 (blocking)]. No status search will be performed if an empty array is entered;
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Expiring resource search, which is optional. Valid values: [0 (no search), 1 (search for expiring resources)] 
     * @return Expire Expiring resource search, which is optional. Valid values: [0 (no search), 1 (search for expiring resources)]
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set Expiring resource search, which is optional. Valid values: [0 (no search), 1 (search for expiring resources)]
     * @param Expire Expiring resource search, which is optional. Valid values: [0 (no search), 1 (search for expiring resources)]
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get Sort by field, which is optional 
     * @return OderBy Sort by field, which is optional
     */
    public OrderBy [] getOderBy() {
        return this.OderBy;
    }

    /**
     * Set Sort by field, which is optional
     * @param OderBy Sort by field, which is optional
     */
    public void setOderBy(OrderBy [] OderBy) {
        this.OderBy = OderBy;
    }

    /**
     * Get Number of entries per page. A value of 0 means no pagination 
     * @return Limit Number of entries per page. A value of 0 means no pagination
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. A value of 0 means no pagination
     * @param Limit Number of entries per page. A value of 0 means no pagination
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page start offset, whose value is (page number - 1) * number of entries per page 
     * @return Offset Page start offset, whose value is (page number - 1) * number of entries per page
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page start offset, whose value is (page number - 1) * number of entries per page
     * @param Offset Page start offset, whose value is (page number - 1) * number of entries per page
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get CNAME of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list; 
     * @return CName CNAME of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     */
    public String getCName() {
        return this.CName;
    }

    /**
     * Set CNAME of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     * @param CName CNAME of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     */
    public void setCName(String CName) {
        this.CName = CName;
    }

    /**
     * Get Domain name of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list; 
     * @return Domain Domain name of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     * @param Domain Domain name of Anti-DDoS Ultimate resource, which is optional and only valid for the Anti-DDoS Ultimate resource list;
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeResourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceListRequest(DescribeResourceListRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
        }
        if (source.Line != null) {
            this.Line = new Long[source.Line.length];
            for (int i = 0; i < source.Line.length; i++) {
                this.Line[i] = new Long(source.Line[i]);
            }
        }
        if (source.IdList != null) {
            this.IdList = new String[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new String(source.IdList[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.OderBy != null) {
            this.OderBy = new OrderBy[source.OderBy.length];
            for (int i = 0; i < source.OderBy.length; i++) {
                this.OderBy[i] = new OrderBy(source.OderBy[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CName != null) {
            this.CName = new String(source.CName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamArraySimple(map, prefix + "Line.", this.Line);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamArrayObj(map, prefix + "OderBy.", this.OderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CName", this.CName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

