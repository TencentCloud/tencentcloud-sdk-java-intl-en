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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsRequest extends AbstractModel {

    /**
    * Array of unique HAVIP IDs, such as `havip-9o233uri`.
    */
    @SerializedName("HaVipIds")
    @Expose
    private String [] HaVipIds;

    /**
    * Filter. `HaVipIds` and `Filters` cannot be specified at the same time.
havip-id - String - Unique HAVIP ID, such as `havip-9o233uri`.
havip-name - String - HAVIP name.
vpc-id - String - VPC ID of the HAVIP.
subnet-id - String - Subnet ID of the HAVIP.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * ECM region. If this parameter is left empty, it will indicate all regions.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get Array of unique HAVIP IDs, such as `havip-9o233uri`. 
     * @return HaVipIds Array of unique HAVIP IDs, such as `havip-9o233uri`.
     */
    public String [] getHaVipIds() {
        return this.HaVipIds;
    }

    /**
     * Set Array of unique HAVIP IDs, such as `havip-9o233uri`.
     * @param HaVipIds Array of unique HAVIP IDs, such as `havip-9o233uri`.
     */
    public void setHaVipIds(String [] HaVipIds) {
        this.HaVipIds = HaVipIds;
    }

    /**
     * Get Filter. `HaVipIds` and `Filters` cannot be specified at the same time.
havip-id - String - Unique HAVIP ID, such as `havip-9o233uri`.
havip-name - String - HAVIP name.
vpc-id - String - VPC ID of the HAVIP.
subnet-id - String - Subnet ID of the HAVIP. 
     * @return Filters Filter. `HaVipIds` and `Filters` cannot be specified at the same time.
havip-id - String - Unique HAVIP ID, such as `havip-9o233uri`.
havip-name - String - HAVIP name.
vpc-id - String - VPC ID of the HAVIP.
subnet-id - String - Subnet ID of the HAVIP.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. `HaVipIds` and `Filters` cannot be specified at the same time.
havip-id - String - Unique HAVIP ID, such as `havip-9o233uri`.
havip-name - String - HAVIP name.
vpc-id - String - VPC ID of the HAVIP.
subnet-id - String - Subnet ID of the HAVIP.
     * @param Filters Filter. `HaVipIds` and `Filters` cannot be specified at the same time.
havip-id - String - Unique HAVIP ID, such as `havip-9o233uri`.
havip-name - String - HAVIP name.
vpc-id - String - VPC ID of the HAVIP.
subnet-id - String - Subnet ID of the HAVIP.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ECM region. If this parameter is left empty, it will indicate all regions. 
     * @return EcmRegion ECM region. If this parameter is left empty, it will indicate all regions.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region. If this parameter is left empty, it will indicate all regions.
     * @param EcmRegion ECM region. If this parameter is left empty, it will indicate all regions.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public DescribeHaVipsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHaVipsRequest(DescribeHaVipsRequest source) {
        if (source.HaVipIds != null) {
            this.HaVipIds = new String[source.HaVipIds.length];
            for (int i = 0; i < source.HaVipIds.length; i++) {
                this.HaVipIds[i] = new String(source.HaVipIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HaVipIds.", this.HaVipIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

