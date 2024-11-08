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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointInfo extends AbstractModel {

    /**
    * Endpoint ID.
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * Endpoint name.
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Endpoint service ID.
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * VIP list of the endpoint.
    */
    @SerializedName("EndPointVipSet")
    @Expose
    private String [] EndPointVipSet;

    /**
    * ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Tag key-value pair collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Endpoint ID. 
     * @return EndPointId Endpoint ID.
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID.
     * @param EndPointId Endpoint ID.
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get Endpoint name. 
     * @return EndPointName Endpoint name.
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name.
     * @param EndPointName Endpoint name.
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Endpoint service ID. 
     * @return EndPointServiceId Endpoint service ID.
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID.
     * @param EndPointServiceId Endpoint service ID.
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get VIP list of the endpoint. 
     * @return EndPointVipSet VIP list of the endpoint.
     */
    public String [] getEndPointVipSet() {
        return this.EndPointVipSet;
    }

    /**
     * Set VIP list of the endpoint.
     * @param EndPointVipSet VIP list of the endpoint.
     */
    public void setEndPointVipSet(String [] EndPointVipSet) {
        this.EndPointVipSet = EndPointVipSet;
    }

    /**
     * Get ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionCode ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionCode ap-guangzhou
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Tag key-value pair collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag key-value pair collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key-value pair collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag key-value pair collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public EndPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPointInfo(EndPointInfo source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVipSet != null) {
            this.EndPointVipSet = new String[source.EndPointVipSet.length];
            for (int i = 0; i < source.EndPointVipSet.length; i++) {
                this.EndPointVipSet[i] = new String(source.EndPointVipSet[i]);
            }
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointVipSet.", this.EndPointVipSet);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

