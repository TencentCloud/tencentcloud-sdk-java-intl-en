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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateHostsRequest extends AbstractModel {

    /**
    * Instance location. This parameter is used to specify the attributes of an instance, such as its availability zone and project.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * A string used to ensure the idempotency of the request.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Configuration of prepaid instances. You can use the parameter to specify the attributes of prepaid instances, such as the subscription period and the auto-renewal plan. This parameter is required for prepaid instances.
    */
    @SerializedName("HostChargePrepaid")
    @Expose
    private ChargePrepaid HostChargePrepaid;

    /**
    * Instance billing model, only monthly or yearly subscription supported. Default value: `PREPAID'.
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * CDH instance model. Default value: `HS1`.
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * Quantity of CDH instances purchased. Default value: 1.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Tag description. You can specify the parameter to associate a tag with an instance.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get Instance location. This parameter is used to specify the attributes of an instance, such as its availability zone and project. 
     * @return Placement Instance location. This parameter is used to specify the attributes of an instance, such as its availability zone and project.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Instance location. This parameter is used to specify the attributes of an instance, such as its availability zone and project.
     * @param Placement Instance location. This parameter is used to specify the attributes of an instance, such as its availability zone and project.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get A string used to ensure the idempotency of the request. 
     * @return ClientToken A string used to ensure the idempotency of the request.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotency of the request.
     * @param ClientToken A string used to ensure the idempotency of the request.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Configuration of prepaid instances. You can use the parameter to specify the attributes of prepaid instances, such as the subscription period and the auto-renewal plan. This parameter is required for prepaid instances. 
     * @return HostChargePrepaid Configuration of prepaid instances. You can use the parameter to specify the attributes of prepaid instances, such as the subscription period and the auto-renewal plan. This parameter is required for prepaid instances.
     */
    public ChargePrepaid getHostChargePrepaid() {
        return this.HostChargePrepaid;
    }

    /**
     * Set Configuration of prepaid instances. You can use the parameter to specify the attributes of prepaid instances, such as the subscription period and the auto-renewal plan. This parameter is required for prepaid instances.
     * @param HostChargePrepaid Configuration of prepaid instances. You can use the parameter to specify the attributes of prepaid instances, such as the subscription period and the auto-renewal plan. This parameter is required for prepaid instances.
     */
    public void setHostChargePrepaid(ChargePrepaid HostChargePrepaid) {
        this.HostChargePrepaid = HostChargePrepaid;
    }

    /**
     * Get Instance billing model, only monthly or yearly subscription supported. Default value: `PREPAID'. 
     * @return HostChargeType Instance billing model, only monthly or yearly subscription supported. Default value: `PREPAID'.
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set Instance billing model, only monthly or yearly subscription supported. Default value: `PREPAID'.
     * @param HostChargeType Instance billing model, only monthly or yearly subscription supported. Default value: `PREPAID'.
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get CDH instance model. Default value: `HS1`. 
     * @return HostType CDH instance model. Default value: `HS1`.
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set CDH instance model. Default value: `HS1`.
     * @param HostType CDH instance model. Default value: `HS1`.
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get Quantity of CDH instances purchased. Default value: 1. 
     * @return HostCount Quantity of CDH instances purchased. Default value: 1.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Quantity of CDH instances purchased. Default value: 1.
     * @param HostCount Quantity of CDH instances purchased. Default value: 1.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Tag description. You can specify the parameter to associate a tag with an instance. 
     * @return TagSpecification Tag description. You can specify the parameter to associate a tag with an instance.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tag description. You can specify the parameter to associate a tag with an instance.
     * @param TagSpecification Tag description. You can specify the parameter to associate a tag with an instance.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public AllocateHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateHostsRequest(AllocateHostsRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.HostChargePrepaid != null) {
            this.HostChargePrepaid = new ChargePrepaid(source.HostChargePrepaid);
        }
        if (source.HostChargeType != null) {
            this.HostChargeType = new String(source.HostChargeType);
        }
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "HostChargePrepaid.", this.HostChargePrepaid);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

