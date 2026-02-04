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

public class CreateTrafficMirrorRequest extends AbstractModel {

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
    * Traffic mirroring status. Valid values: RUNNING/STOPED (VPC) and RUNNING (public IP address). It is required when VPC traffic mirroring is collected.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Traffic mirroring collection direction. Valid values: EGRESS/INGRESS/ALL (VPC) and ALL (public IP address).
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
    * NAT gateway instance filtered by traffic mirroring.
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * Five tuple rule to be filtered.
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * Traffic mirroring destination address.
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget CollectorTarget;

    /**
    * Subnet ID of the sender of the traffic mirroring collection traffic.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Created traffic mirroring type. Valid values: VPC and PUBLICIP. Default value: VPC.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the list of bound tags. For example, [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get Traffic mirroring status. Valid values: RUNNING/STOPED (VPC) and RUNNING (public IP address). It is required when VPC traffic mirroring is collected. 
     * @return State Traffic mirroring status. Valid values: RUNNING/STOPED (VPC) and RUNNING (public IP address). It is required when VPC traffic mirroring is collected.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Traffic mirroring status. Valid values: RUNNING/STOPED (VPC) and RUNNING (public IP address). It is required when VPC traffic mirroring is collected.
     * @param State Traffic mirroring status. Valid values: RUNNING/STOPED (VPC) and RUNNING (public IP address). It is required when VPC traffic mirroring is collected.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Traffic mirroring collection direction. Valid values: EGRESS/INGRESS/ALL (VPC) and ALL (public IP address). 
     * @return Direction Traffic mirroring collection direction. Valid values: EGRESS/INGRESS/ALL (VPC) and ALL (public IP address).
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Traffic mirroring collection direction. Valid values: EGRESS/INGRESS/ALL (VPC) and ALL (public IP address).
     * @param Direction Traffic mirroring collection direction. Valid values: EGRESS/INGRESS/ALL (VPC) and ALL (public IP address).
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
     * Get NAT gateway instance filtered by traffic mirroring. 
     * @return NatId NAT gateway instance filtered by traffic mirroring.
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT gateway instance filtered by traffic mirroring.
     * @param NatId NAT gateway instance filtered by traffic mirroring.
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get Five tuple rule to be filtered. 
     * @return CollectorNormalFilters Five tuple rule to be filtered.
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set Five tuple rule to be filtered.
     * @param CollectorNormalFilters Five tuple rule to be filtered.
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get Traffic mirroring destination address. 
     * @return CollectorTarget Traffic mirroring destination address.
     */
    public TrafficMirrorTarget getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set Traffic mirroring destination address.
     * @param CollectorTarget Traffic mirroring destination address.
     */
    public void setCollectorTarget(TrafficMirrorTarget CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    /**
     * Get Subnet ID of the sender of the traffic mirroring collection traffic. 
     * @return SubnetId Subnet ID of the sender of the traffic mirroring collection traffic.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the sender of the traffic mirroring collection traffic.
     * @param SubnetId Subnet ID of the sender of the traffic mirroring collection traffic.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Created traffic mirroring type. Valid values: VPC and PUBLICIP. Default value: VPC. 
     * @return Type Created traffic mirroring type. Valid values: VPC and PUBLICIP. Default value: VPC.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Created traffic mirroring type. Valid values: VPC and PUBLICIP. Default value: VPC.
     * @param Type Created traffic mirroring type. Valid values: VPC and PUBLICIP. Default value: VPC.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the list of bound tags. For example, [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags Specifies the list of bound tags. For example, [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Specifies the list of bound tags. For example, [{"Key": "city", "Value": "shanghai"}].
     * @param Tags Specifies the list of bound tags. For example, [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateTrafficMirrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrafficMirrorRequest(CreateTrafficMirrorRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescribe", this.TrafficMirrorDescribe);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamObj(map, prefix + "CollectorTarget.", this.CollectorTarget);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

