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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogDeliveryKafkaOptionsResponse extends AbstractModel{

    /**
    * Instance list
    */
    @SerializedName("InstanceList")
    @Expose
    private CKafkaInstanceInfo [] InstanceList;

    /**
    * Region list
    */
    @SerializedName("RegionList")
    @Expose
    private RegionInfo [] RegionList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance list 
     * @return InstanceList Instance list
     */
    public CKafkaInstanceInfo [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set Instance list
     * @param InstanceList Instance list
     */
    public void setInstanceList(CKafkaInstanceInfo [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Region list 
     * @return RegionList Region list
     */
    public RegionInfo [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set Region list
     * @param RegionList Region list
     */
    public void setRegionList(RegionInfo [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecLogDeliveryKafkaOptionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogDeliveryKafkaOptionsResponse(DescribeSecLogDeliveryKafkaOptionsResponse source) {
        if (source.InstanceList != null) {
            this.InstanceList = new CKafkaInstanceInfo[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new CKafkaInstanceInfo(source.InstanceList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new RegionInfo[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new RegionInfo(source.RegionList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

