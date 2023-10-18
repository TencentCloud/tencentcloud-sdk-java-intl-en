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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwVpcDnsLstRequest extends AbstractModel {

    /**
    * NAT firewall instance ID
    */
    @SerializedName("NatFwInsId")
    @Expose
    private String NatFwInsId;

    /**
    * Content filtered by NAT firewall, separated with ","
    */
    @SerializedName("NatInsIdFilter")
    @Expose
    private String NatInsIdFilter;

    /**
    * Number of pages
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum entries per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get NAT firewall instance ID 
     * @return NatFwInsId NAT firewall instance ID
     */
    public String getNatFwInsId() {
        return this.NatFwInsId;
    }

    /**
     * Set NAT firewall instance ID
     * @param NatFwInsId NAT firewall instance ID
     */
    public void setNatFwInsId(String NatFwInsId) {
        this.NatFwInsId = NatFwInsId;
    }

    /**
     * Get Content filtered by NAT firewall, separated with "," 
     * @return NatInsIdFilter Content filtered by NAT firewall, separated with ","
     */
    public String getNatInsIdFilter() {
        return this.NatInsIdFilter;
    }

    /**
     * Set Content filtered by NAT firewall, separated with ","
     * @param NatInsIdFilter Content filtered by NAT firewall, separated with ","
     */
    public void setNatInsIdFilter(String NatInsIdFilter) {
        this.NatInsIdFilter = NatInsIdFilter;
    }

    /**
     * Get Number of pages 
     * @return Offset Number of pages
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Number of pages
     * @param Offset Number of pages
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum entries per page 
     * @return Limit Maximum entries per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum entries per page
     * @param Limit Maximum entries per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNatFwVpcDnsLstRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwVpcDnsLstRequest(DescribeNatFwVpcDnsLstRequest source) {
        if (source.NatFwInsId != null) {
            this.NatFwInsId = new String(source.NatFwInsId);
        }
        if (source.NatInsIdFilter != null) {
            this.NatInsIdFilter = new String(source.NatInsIdFilter);
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
        this.setParamSimple(map, prefix + "NatFwInsId", this.NatFwInsId);
        this.setParamSimple(map, prefix + "NatInsIdFilter", this.NatInsIdFilter);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

