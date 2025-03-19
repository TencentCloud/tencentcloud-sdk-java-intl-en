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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiGatewayInstanceList extends AbstractModel {

    /**
    * The region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * API gateway instance details.	
    */
    @SerializedName("InstanceList")
    @Expose
    private ApiGatewayInstanceDetail [] InstanceList;

    /**
    * The total number of APIGATEWAY instances in this region.	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Whether to query exceptions.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get The region. 
     * @return Region The region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region.
     * @param Region The region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get API gateway instance details.	 
     * @return InstanceList API gateway instance details.	
     */
    public ApiGatewayInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set API gateway instance details.	
     * @param InstanceList API gateway instance details.	
     */
    public void setInstanceList(ApiGatewayInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get The total number of APIGATEWAY instances in this region.	 
     * @return TotalCount The total number of APIGATEWAY instances in this region.	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of APIGATEWAY instances in this region.	
     * @param TotalCount The total number of APIGATEWAY instances in this region.	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Whether to query exceptions. 
     * @return Error Whether to query exceptions.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Whether to query exceptions.
     * @param Error Whether to query exceptions.
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public ApiGatewayInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiGatewayInstanceList(ApiGatewayInstanceList source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new ApiGatewayInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new ApiGatewayInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

