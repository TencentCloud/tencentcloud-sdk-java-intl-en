/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirror extends AbstractModel {

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Traffic mirroring instance.
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * Traffic mirroring name.
    */
    @SerializedName("TrafficMirrorName")
    @Expose
    private String TrafficMirrorName;

    /**
    * Traffic mirroring description.
    */
    @SerializedName("TrafficMirrorDescribe")
    @Expose
    private String TrafficMirrorDescribe;

    /**
    * Traffic mirroring status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Traffic mirroring collection direction.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Traffic mirroring collection object.
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * NAT gateway instance ID filtered by traffic mirroring.
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * Five tuple rule filtered by traffic mirroring.
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * Traffic mirroring receiving target.
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget CollectorTarget;

    /**
    * Traffic mirroring creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Traffic mirroring type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Traffic mirroring subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Resource information of the traffic mirroring receiving target, returned when the receiving target is ENI or CLB.
    */
    @SerializedName("TargetInfo")
    @Expose
    private TrafficMirrorTargetResourceInfo [] TargetInfo;

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Traffic mirroring instance. 
     * @return TrafficMirrorId Traffic mirroring instance.
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set Traffic mirroring instance.
     * @param TrafficMirrorId Traffic mirroring instance.
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get Traffic mirroring name. 
     * @return TrafficMirrorName Traffic mirroring name.
     */
    public String getTrafficMirrorName() {
        return this.TrafficMirrorName;
    }

    /**
     * Set Traffic mirroring name.
     * @param TrafficMirrorName Traffic mirroring name.
     */
    public void setTrafficMirrorName(String TrafficMirrorName) {
        this.TrafficMirrorName = TrafficMirrorName;
    }

    /**
     * Get Traffic mirroring description. 
     * @return TrafficMirrorDescribe Traffic mirroring description.
     */
    public String getTrafficMirrorDescribe() {
        return this.TrafficMirrorDescribe;
    }

    /**
     * Set Traffic mirroring description.
     * @param TrafficMirrorDescribe Traffic mirroring description.
     */
    public void setTrafficMirrorDescribe(String TrafficMirrorDescribe) {
        this.TrafficMirrorDescribe = TrafficMirrorDescribe;
    }

    /**
     * Get Traffic mirroring status. 
     * @return State Traffic mirroring status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Traffic mirroring status.
     * @param State Traffic mirroring status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Traffic mirroring collection direction. 
     * @return Direction Traffic mirroring collection direction.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Traffic mirroring collection direction.
     * @param Direction Traffic mirroring collection direction.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Traffic mirroring collection object. 
     * @return CollectorSrcs Traffic mirroring collection object.
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set Traffic mirroring collection object.
     * @param CollectorSrcs Traffic mirroring collection object.
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get NAT gateway instance ID filtered by traffic mirroring. 
     * @return NatId NAT gateway instance ID filtered by traffic mirroring.
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT gateway instance ID filtered by traffic mirroring.
     * @param NatId NAT gateway instance ID filtered by traffic mirroring.
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get Five tuple rule filtered by traffic mirroring. 
     * @return CollectorNormalFilters Five tuple rule filtered by traffic mirroring.
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set Five tuple rule filtered by traffic mirroring.
     * @param CollectorNormalFilters Five tuple rule filtered by traffic mirroring.
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get Traffic mirroring receiving target. 
     * @return CollectorTarget Traffic mirroring receiving target.
     */
    public TrafficMirrorTarget getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set Traffic mirroring receiving target.
     * @param CollectorTarget Traffic mirroring receiving target.
     */
    public void setCollectorTarget(TrafficMirrorTarget CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    /**
     * Get Traffic mirroring creation time. 
     * @return CreateTime Traffic mirroring creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Traffic mirroring creation time.
     * @param CreateTime Traffic mirroring creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Traffic mirroring type. 
     * @return Type Traffic mirroring type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Traffic mirroring type.
     * @param Type Traffic mirroring type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Traffic mirroring subnet ID. 
     * @return SubnetId Traffic mirroring subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Traffic mirroring subnet ID.
     * @param SubnetId Traffic mirroring subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Resource information of the traffic mirroring receiving target, returned when the receiving target is ENI or CLB. 
     * @return TargetInfo Resource information of the traffic mirroring receiving target, returned when the receiving target is ENI or CLB.
     */
    public TrafficMirrorTargetResourceInfo [] getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set Resource information of the traffic mirroring receiving target, returned when the receiving target is ENI or CLB.
     * @param TargetInfo Resource information of the traffic mirroring receiving target, returned when the receiving target is ENI or CLB.
     */
    public void setTargetInfo(TrafficMirrorTargetResourceInfo [] TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    public TrafficMirror() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirror(TrafficMirror source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.TrafficMirrorName != null) {
            this.TrafficMirrorName = new String(source.TrafficMirrorName);
        }
        if (source.TrafficMirrorDescribe != null) {
            this.TrafficMirrorDescribe = new String(source.TrafficMirrorDescribe);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.CollectorSrcs != null) {
            this.CollectorSrcs = new String[source.CollectorSrcs.length];
            for (int i = 0; i < source.CollectorSrcs.length; i++) {
                this.CollectorSrcs[i] = new String(source.CollectorSrcs[i]);
            }
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.CollectorNormalFilters != null) {
            this.CollectorNormalFilters = new TrafficMirrorFilter[source.CollectorNormalFilters.length];
            for (int i = 0; i < source.CollectorNormalFilters.length; i++) {
                this.CollectorNormalFilters[i] = new TrafficMirrorFilter(source.CollectorNormalFilters[i]);
            }
        }
        if (source.CollectorTarget != null) {
            this.CollectorTarget = new TrafficMirrorTarget(source.CollectorTarget);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new TrafficMirrorTargetResourceInfo[source.TargetInfo.length];
            for (int i = 0; i < source.TargetInfo.length; i++) {
                this.TargetInfo[i] = new TrafficMirrorTargetResourceInfo(source.TargetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescribe", this.TrafficMirrorDescribe);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamObj(map, prefix + "CollectorTarget.", this.CollectorTarget);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TargetInfo.", this.TargetInfo);

    }
}

