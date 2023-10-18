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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivateSubscribeRequest extends AbstractModel {

    /**
    * Subscription instance ID.
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Database Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data subscription type. 0: full instance subscription, 1: data subscription, 2: structure subscription, 3: data subscription and structure subscription
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * Subscription object
    */
    @SerializedName("Objects")
    @Expose
    private SubscribeObject Objects;

    /**
    * Subnet of data subscription service, which is the subnet of the database instance by default.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Subscription service port. Default value: 7507
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Subscription instance ID. 
     * @return SubscribeId Subscription instance ID.
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription instance ID.
     * @param SubscribeId Subscription instance ID.
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Database Instance ID 
     * @return InstanceId Database Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database Instance ID
     * @param InstanceId Database Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data subscription type. 0: full instance subscription, 1: data subscription, 2: structure subscription, 3: data subscription and structure subscription 
     * @return SubscribeObjectType Data subscription type. 0: full instance subscription, 1: data subscription, 2: structure subscription, 3: data subscription and structure subscription
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set Data subscription type. 0: full instance subscription, 1: data subscription, 2: structure subscription, 3: data subscription and structure subscription
     * @param SubscribeObjectType Data subscription type. 0: full instance subscription, 1: data subscription, 2: structure subscription, 3: data subscription and structure subscription
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get Subscription object 
     * @return Objects Subscription object
     */
    public SubscribeObject getObjects() {
        return this.Objects;
    }

    /**
     * Set Subscription object
     * @param Objects Subscription object
     */
    public void setObjects(SubscribeObject Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Subnet of data subscription service, which is the subnet of the database instance by default. 
     * @return UniqSubnetId Subnet of data subscription service, which is the subnet of the database instance by default.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet of data subscription service, which is the subnet of the database instance by default.
     * @param UniqSubnetId Subnet of data subscription service, which is the subnet of the database instance by default.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Subscription service port. Default value: 7507 
     * @return Vport Subscription service port. Default value: 7507
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Subscription service port. Default value: 7507
     * @param Vport Subscription service port. Default value: 7507
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public ActivateSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateSubscribeRequest(ActivateSubscribeRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SubscribeObjectType != null) {
            this.SubscribeObjectType = new Long(source.SubscribeObjectType);
        }
        if (source.Objects != null) {
            this.Objects = new SubscribeObject(source.Objects);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

