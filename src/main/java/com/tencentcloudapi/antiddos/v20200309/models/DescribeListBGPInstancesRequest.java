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

public class DescribeListBGPInstancesRequest extends AbstractModel{

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
    * Filters by IP.
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * Anti-DDoS instance ID filter. For example, `bgp-00000001`.
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * Filters by region. For example, `ap-guangzhou`.
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * Filters by name.
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * Line filter. Valid values: 1: BGP; 2: Non-BGP.
    */
    @SerializedName("FilterLine")
    @Expose
    private Long FilterLine;

    /**
    * Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * Filters by binding status. `bounding`: The instance is bound; `failed`: The binding failed.
    */
    @SerializedName("FilterBoundStatus")
    @Expose
    private String FilterBoundStatus;

    /**
    * Array of instance IDs
    */
    @SerializedName("FilterInstanceIdList")
    @Expose
    private String [] FilterInstanceIdList;

    /**
    * Enterprise edition. Values: `1` (the Convoy package included), `2` (the Convoy package not included)
    */
    @SerializedName("FilterEnterpriseFlag")
    @Expose
    private Long FilterEnterpriseFlag;

    /**
    * Whether it’s a Lighthouse edition
    */
    @SerializedName("FilterLightFlag")
    @Expose
    private Long FilterLightFlag;

    /**
    * Whether it’s a Channel edition
    */
    @SerializedName("FilterChannelFlag")
    @Expose
    private Long FilterChannelFlag;

    /**
    * Filters by tag
    */
    @SerializedName("FilterTag")
    @Expose
    private TagFilter FilterTag;

    /**
    * Filters out trial instances. Values: `1` (emergency protection instances), `2` (PLG instances)
    */
    @SerializedName("FilterTrialFlag")
    @Expose
    private Long FilterTrialFlag;

    /**
    * Filters out Convoy instances
    */
    @SerializedName("FilterConvoy")
    @Expose
    private Long FilterConvoy;

    /**
    * Whether to exclude the advanced information (such as `InstanceList[0].Usage`). Values: `true` (exclude), `false` (do not exclude). The default value is `false`.
    */
    @SerializedName("ExcludeAdvancedInfo")
    @Expose
    private Boolean ExcludeAdvancedInfo;

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
     * Get Filters by IP. 
     * @return FilterIp Filters by IP.
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set Filters by IP.
     * @param FilterIp Filters by IP.
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get Anti-DDoS instance ID filter. For example, `bgp-00000001`. 
     * @return FilterInstanceId Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     * @param FilterInstanceId Anti-DDoS instance ID filter. For example, `bgp-00000001`.
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get Filters by region. For example, `ap-guangzhou`. 
     * @return FilterRegion Filters by region. For example, `ap-guangzhou`.
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set Filters by region. For example, `ap-guangzhou`.
     * @param FilterRegion Filters by region. For example, `ap-guangzhou`.
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get Filters by name. 
     * @return FilterName Filters by name.
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set Filters by name.
     * @param FilterName Filters by name.
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get Line filter. Valid values: 1: BGP; 2: Non-BGP. 
     * @return FilterLine Line filter. Valid values: 1: BGP; 2: Non-BGP.
     */
    public Long getFilterLine() {
        return this.FilterLine;
    }

    /**
     * Set Line filter. Valid values: 1: BGP; 2: Non-BGP.
     * @param FilterLine Line filter. Valid values: 1: BGP; 2: Non-BGP.
     */
    public void setFilterLine(Long FilterLine) {
        this.FilterLine = FilterLine;
    }

    /**
     * Get Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked. 
     * @return FilterStatus Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     * @param FilterStatus Filters by instance status. `idle`: Running; `attacking`: Being attacked; `blocking`: Being blocked.
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get Filters by binding status. `bounding`: The instance is bound; `failed`: The binding failed. 
     * @return FilterBoundStatus Filters by binding status. `bounding`: The instance is bound; `failed`: The binding failed.
     */
    public String getFilterBoundStatus() {
        return this.FilterBoundStatus;
    }

    /**
     * Set Filters by binding status. `bounding`: The instance is bound; `failed`: The binding failed.
     * @param FilterBoundStatus Filters by binding status. `bounding`: The instance is bound; `failed`: The binding failed.
     */
    public void setFilterBoundStatus(String FilterBoundStatus) {
        this.FilterBoundStatus = FilterBoundStatus;
    }

    /**
     * Get Array of instance IDs 
     * @return FilterInstanceIdList Array of instance IDs
     */
    public String [] getFilterInstanceIdList() {
        return this.FilterInstanceIdList;
    }

    /**
     * Set Array of instance IDs
     * @param FilterInstanceIdList Array of instance IDs
     */
    public void setFilterInstanceIdList(String [] FilterInstanceIdList) {
        this.FilterInstanceIdList = FilterInstanceIdList;
    }

    /**
     * Get Enterprise edition. Values: `1` (the Convoy package included), `2` (the Convoy package not included) 
     * @return FilterEnterpriseFlag Enterprise edition. Values: `1` (the Convoy package included), `2` (the Convoy package not included)
     */
    public Long getFilterEnterpriseFlag() {
        return this.FilterEnterpriseFlag;
    }

    /**
     * Set Enterprise edition. Values: `1` (the Convoy package included), `2` (the Convoy package not included)
     * @param FilterEnterpriseFlag Enterprise edition. Values: `1` (the Convoy package included), `2` (the Convoy package not included)
     */
    public void setFilterEnterpriseFlag(Long FilterEnterpriseFlag) {
        this.FilterEnterpriseFlag = FilterEnterpriseFlag;
    }

    /**
     * Get Whether it’s a Lighthouse edition 
     * @return FilterLightFlag Whether it’s a Lighthouse edition
     */
    public Long getFilterLightFlag() {
        return this.FilterLightFlag;
    }

    /**
     * Set Whether it’s a Lighthouse edition
     * @param FilterLightFlag Whether it’s a Lighthouse edition
     */
    public void setFilterLightFlag(Long FilterLightFlag) {
        this.FilterLightFlag = FilterLightFlag;
    }

    /**
     * Get Whether it’s a Channel edition 
     * @return FilterChannelFlag Whether it’s a Channel edition
     */
    public Long getFilterChannelFlag() {
        return this.FilterChannelFlag;
    }

    /**
     * Set Whether it’s a Channel edition
     * @param FilterChannelFlag Whether it’s a Channel edition
     */
    public void setFilterChannelFlag(Long FilterChannelFlag) {
        this.FilterChannelFlag = FilterChannelFlag;
    }

    /**
     * Get Filters by tag 
     * @return FilterTag Filters by tag
     */
    public TagFilter getFilterTag() {
        return this.FilterTag;
    }

    /**
     * Set Filters by tag
     * @param FilterTag Filters by tag
     */
    public void setFilterTag(TagFilter FilterTag) {
        this.FilterTag = FilterTag;
    }

    /**
     * Get Filters out trial instances. Values: `1` (emergency protection instances), `2` (PLG instances) 
     * @return FilterTrialFlag Filters out trial instances. Values: `1` (emergency protection instances), `2` (PLG instances)
     */
    public Long getFilterTrialFlag() {
        return this.FilterTrialFlag;
    }

    /**
     * Set Filters out trial instances. Values: `1` (emergency protection instances), `2` (PLG instances)
     * @param FilterTrialFlag Filters out trial instances. Values: `1` (emergency protection instances), `2` (PLG instances)
     */
    public void setFilterTrialFlag(Long FilterTrialFlag) {
        this.FilterTrialFlag = FilterTrialFlag;
    }

    /**
     * Get Filters out Convoy instances 
     * @return FilterConvoy Filters out Convoy instances
     */
    public Long getFilterConvoy() {
        return this.FilterConvoy;
    }

    /**
     * Set Filters out Convoy instances
     * @param FilterConvoy Filters out Convoy instances
     */
    public void setFilterConvoy(Long FilterConvoy) {
        this.FilterConvoy = FilterConvoy;
    }

    /**
     * Get Whether to exclude the advanced information (such as `InstanceList[0].Usage`). Values: `true` (exclude), `false` (do not exclude). The default value is `false`. 
     * @return ExcludeAdvancedInfo Whether to exclude the advanced information (such as `InstanceList[0].Usage`). Values: `true` (exclude), `false` (do not exclude). The default value is `false`.
     */
    public Boolean getExcludeAdvancedInfo() {
        return this.ExcludeAdvancedInfo;
    }

    /**
     * Set Whether to exclude the advanced information (such as `InstanceList[0].Usage`). Values: `true` (exclude), `false` (do not exclude). The default value is `false`.
     * @param ExcludeAdvancedInfo Whether to exclude the advanced information (such as `InstanceList[0].Usage`). Values: `true` (exclude), `false` (do not exclude). The default value is `false`.
     */
    public void setExcludeAdvancedInfo(Boolean ExcludeAdvancedInfo) {
        this.ExcludeAdvancedInfo = ExcludeAdvancedInfo;
    }

    public DescribeListBGPInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListBGPInstancesRequest(DescribeListBGPInstancesRequest source) {
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
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterLine != null) {
            this.FilterLine = new Long(source.FilterLine);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
        }
        if (source.FilterBoundStatus != null) {
            this.FilterBoundStatus = new String(source.FilterBoundStatus);
        }
        if (source.FilterInstanceIdList != null) {
            this.FilterInstanceIdList = new String[source.FilterInstanceIdList.length];
            for (int i = 0; i < source.FilterInstanceIdList.length; i++) {
                this.FilterInstanceIdList[i] = new String(source.FilterInstanceIdList[i]);
            }
        }
        if (source.FilterEnterpriseFlag != null) {
            this.FilterEnterpriseFlag = new Long(source.FilterEnterpriseFlag);
        }
        if (source.FilterLightFlag != null) {
            this.FilterLightFlag = new Long(source.FilterLightFlag);
        }
        if (source.FilterChannelFlag != null) {
            this.FilterChannelFlag = new Long(source.FilterChannelFlag);
        }
        if (source.FilterTag != null) {
            this.FilterTag = new TagFilter(source.FilterTag);
        }
        if (source.FilterTrialFlag != null) {
            this.FilterTrialFlag = new Long(source.FilterTrialFlag);
        }
        if (source.FilterConvoy != null) {
            this.FilterConvoy = new Long(source.FilterConvoy);
        }
        if (source.ExcludeAdvancedInfo != null) {
            this.ExcludeAdvancedInfo = new Boolean(source.ExcludeAdvancedInfo);
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
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterLine", this.FilterLine);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "FilterBoundStatus", this.FilterBoundStatus);
        this.setParamArraySimple(map, prefix + "FilterInstanceIdList.", this.FilterInstanceIdList);
        this.setParamSimple(map, prefix + "FilterEnterpriseFlag", this.FilterEnterpriseFlag);
        this.setParamSimple(map, prefix + "FilterLightFlag", this.FilterLightFlag);
        this.setParamSimple(map, prefix + "FilterChannelFlag", this.FilterChannelFlag);
        this.setParamObj(map, prefix + "FilterTag.", this.FilterTag);
        this.setParamSimple(map, prefix + "FilterTrialFlag", this.FilterTrialFlag);
        this.setParamSimple(map, prefix + "FilterConvoy", this.FilterConvoy);
        this.setParamSimple(map, prefix + "ExcludeAdvancedInfo", this.ExcludeAdvancedInfo);

    }
}

