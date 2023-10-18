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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainsRequest extends AbstractModel {

    /**
    * Filter by domain name status. 0: disabled, 1: enabled.
    */
    @SerializedName("DomainStatus")
    @Expose
    private Long DomainStatus;

    /**
    * Filter by domain name type. 0: push. 1: playback
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Number of entries per page. Value range: 10-100. Default value: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number to get. Value range: 1-100000. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 0: LVB, 1: LCB. Default value: 0.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * Domain name prefix.
    */
    @SerializedName("DomainPrefix")
    @Expose
    private String DomainPrefix;

    /**
    * Playback region. This parameter is valid only when `DomainType` is set to `1`.
`1`: Chinese mainland
`2`: global
`3`: outside Chinese mainland
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
     * Get Filter by domain name status. 0: disabled, 1: enabled. 
     * @return DomainStatus Filter by domain name status. 0: disabled, 1: enabled.
     */
    public Long getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set Filter by domain name status. 0: disabled, 1: enabled.
     * @param DomainStatus Filter by domain name status. 0: disabled, 1: enabled.
     */
    public void setDomainStatus(Long DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get Filter by domain name type. 0: push. 1: playback 
     * @return DomainType Filter by domain name type. 0: push. 1: playback
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Filter by domain name type. 0: push. 1: playback
     * @param DomainType Filter by domain name type. 0: push. 1: playback
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Number of entries per page. Value range: 10-100. Default value: 10. 
     * @return PageSize Number of entries per page. Value range: 10-100. Default value: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: 10-100. Default value: 10.
     * @param PageSize Number of entries per page. Value range: 10-100. Default value: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number to get. Value range: 1-100000. Default value: 1. 
     * @return PageNum Page number to get. Value range: 1-100000. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number to get. Value range: 1-100000. Default value: 1.
     * @param PageNum Page number to get. Value range: 1-100000. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 0: LVB, 1: LCB. Default value: 0. 
     * @return IsDelayLive 0: LVB, 1: LCB. Default value: 0.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 0: LVB, 1: LCB. Default value: 0.
     * @param IsDelayLive 0: LVB, 1: LCB. Default value: 0.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get Domain name prefix. 
     * @return DomainPrefix Domain name prefix.
     */
    public String getDomainPrefix() {
        return this.DomainPrefix;
    }

    /**
     * Set Domain name prefix.
     * @param DomainPrefix Domain name prefix.
     */
    public void setDomainPrefix(String DomainPrefix) {
        this.DomainPrefix = DomainPrefix;
    }

    /**
     * Get Playback region. This parameter is valid only when `DomainType` is set to `1`.
`1`: Chinese mainland
`2`: global
`3`: outside Chinese mainland 
     * @return PlayType Playback region. This parameter is valid only when `DomainType` is set to `1`.
`1`: Chinese mainland
`2`: global
`3`: outside Chinese mainland
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set Playback region. This parameter is valid only when `DomainType` is set to `1`.
`1`: Chinese mainland
`2`: global
`3`: outside Chinese mainland
     * @param PlayType Playback region. This parameter is valid only when `DomainType` is set to `1`.
`1`: Chinese mainland
`2`: global
`3`: outside Chinese mainland
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    public DescribeLiveDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainsRequest(DescribeLiveDomainsRequest source) {
        if (source.DomainStatus != null) {
            this.DomainStatus = new Long(source.DomainStatus);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.DomainPrefix != null) {
            this.DomainPrefix = new String(source.DomainPrefix);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "DomainPrefix", this.DomainPrefix);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);

    }
}

