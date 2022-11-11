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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordListRequest extends AbstractModel{

    /**
    * The domain for which DNS records are to be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The ID of the domain for which DNS records are to be obtained. If `DomainId` is passed in, the system will omit the parameter `Domain`.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * The host header of a DNS record. If this parameter is passed in, only the DNS record corresponding to this host header will be returned.
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * The type of DNS record, such as A, CNAME, NS, AAAA, explicit URL, implicit URL, CAA, or SPF record.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * The split zone name.
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * The split zone ID. If `RecordLineId` is passed in, the system will omit the parameter `RecordLine`.
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The keyword for searching for DNS records. Host headers and record values are supported.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * The sorting field. Available values: `name`, `line`, `type`, `value`, `weight`, `mx`, and `ttl,updated_on`.
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * The sorting type. Valid values: `ASC` (ascending, default), `DESC` (descending).
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * The offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The limit. It defaults to 100 and can be up to 3,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The domain for which DNS records are to be obtained. 
     * @return Domain The domain for which DNS records are to be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain for which DNS records are to be obtained.
     * @param Domain The domain for which DNS records are to be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The ID of the domain for which DNS records are to be obtained. If `DomainId` is passed in, the system will omit the parameter `Domain`. 
     * @return DomainId The ID of the domain for which DNS records are to be obtained. If `DomainId` is passed in, the system will omit the parameter `Domain`.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The ID of the domain for which DNS records are to be obtained. If `DomainId` is passed in, the system will omit the parameter `Domain`.
     * @param DomainId The ID of the domain for which DNS records are to be obtained. If `DomainId` is passed in, the system will omit the parameter `Domain`.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get The host header of a DNS record. If this parameter is passed in, only the DNS record corresponding to this host header will be returned. 
     * @return Subdomain The host header of a DNS record. If this parameter is passed in, only the DNS record corresponding to this host header will be returned.
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set The host header of a DNS record. If this parameter is passed in, only the DNS record corresponding to this host header will be returned.
     * @param Subdomain The host header of a DNS record. If this parameter is passed in, only the DNS record corresponding to this host header will be returned.
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get The type of DNS record, such as A, CNAME, NS, AAAA, explicit URL, implicit URL, CAA, or SPF record. 
     * @return RecordType The type of DNS record, such as A, CNAME, NS, AAAA, explicit URL, implicit URL, CAA, or SPF record.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set The type of DNS record, such as A, CNAME, NS, AAAA, explicit URL, implicit URL, CAA, or SPF record.
     * @param RecordType The type of DNS record, such as A, CNAME, NS, AAAA, explicit URL, implicit URL, CAA, or SPF record.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get The split zone name. 
     * @return RecordLine The split zone name.
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set The split zone name.
     * @param RecordLine The split zone name.
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get The split zone ID. If `RecordLineId` is passed in, the system will omit the parameter `RecordLine`. 
     * @return RecordLineId The split zone ID. If `RecordLineId` is passed in, the system will omit the parameter `RecordLine`.
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set The split zone ID. If `RecordLineId` is passed in, the system will omit the parameter `RecordLine`.
     * @param RecordLineId The split zone ID. If `RecordLineId` is passed in, the system will omit the parameter `RecordLine`.
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The keyword for searching for DNS records. Host headers and record values are supported. 
     * @return Keyword The keyword for searching for DNS records. Host headers and record values are supported.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set The keyword for searching for DNS records. Host headers and record values are supported.
     * @param Keyword The keyword for searching for DNS records. Host headers and record values are supported.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get The sorting field. Available values: `name`, `line`, `type`, `value`, `weight`, `mx`, and `ttl,updated_on`. 
     * @return SortField The sorting field. Available values: `name`, `line`, `type`, `value`, `weight`, `mx`, and `ttl,updated_on`.
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set The sorting field. Available values: `name`, `line`, `type`, `value`, `weight`, `mx`, and `ttl,updated_on`.
     * @param SortField The sorting field. Available values: `name`, `line`, `type`, `value`, `weight`, `mx`, and `ttl,updated_on`.
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get The sorting type. Valid values: `ASC` (ascending, default), `DESC` (descending). 
     * @return SortType The sorting type. Valid values: `ASC` (ascending, default), `DESC` (descending).
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set The sorting type. Valid values: `ASC` (ascending, default), `DESC` (descending).
     * @param SortType The sorting type. Valid values: `ASC` (ascending, default), `DESC` (descending).
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get The offset. Default value: `0`. 
     * @return Offset The offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: `0`.
     * @param Offset The offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The limit. It defaults to 100 and can be up to 3,000. 
     * @return Limit The limit. It defaults to 100 and can be up to 3,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The limit. It defaults to 100 and can be up to 3,000.
     * @param Limit The limit. It defaults to 100 and can be up to 3,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordListRequest(DescribeRecordListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

