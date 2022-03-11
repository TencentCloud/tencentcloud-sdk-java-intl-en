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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * Region.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Location information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * CLB instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Network type of the CLB instance. Valid values: OPEN: public network
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * List of VIPs of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * CLB instance status. Valid values:
 0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last status change time of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusTime")
    @Expose
    private String StatusTime;

    /**
    * VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * ISP of the CLB IP address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * Network attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private LoadBalancerInternetAccessible NetworkAttributes;

    /**
    * Security group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * Whether the real server opens the traffic from ELB to the internet.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
     * Get Region.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Location information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Position Location information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set Location information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Position Location information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get CLB instance ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerId CLB instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerId CLB instance ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerName CLB instance name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerName CLB instance name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Network type of the CLB instance. Valid values: OPEN: public network
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerType Network type of the CLB instance. Valid values: OPEN: public network
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the CLB instance. Valid values: OPEN: public network
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerType Network type of the CLB instance. Valid values: OPEN: public network
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get List of VIPs of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerVips List of VIPs of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set List of VIPs of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerVips List of VIPs of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get CLB instance status. Valid values:
 0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status CLB instance status. Valid values:
 0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set CLB instance status. Valid values:
 0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status CLB instance status. Valid values:
 0: creating; 1: running.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CLB instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last status change time of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusTime Last status change time of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set Last status change time of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusTime Last status change time of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get VPC ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags CLB instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ISP of the CLB IP address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VipIsp ISP of the CLB IP address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set ISP of the CLB IP address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VipIsp ISP of the CLB IP address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get Network attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkAttributes Network attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LoadBalancerInternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set Network attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkAttributes Network attribute of the CLB instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkAttributes(LoadBalancerInternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get Security group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecureGroups Security group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set Security group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecureGroups Security group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get Whether the real server opens the traffic from ELB to the internet.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerPassToTarget Whether the real server opens the traffic from ELB to the internet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether the real server opens the traffic from ELB to the internet.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerPassToTarget Whether the real server opens the traffic from ELB to the internet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Position != null) {
            this.Position = new Position(source.Position);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new String(source.StatusTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.NetworkAttributes != null) {
            this.NetworkAttributes = new LoadBalancerInternetAccessible(source.NetworkAttributes);
        }
        if (source.SecureGroups != null) {
            this.SecureGroups = new String[source.SecureGroups.length];
            for (int i = 0; i < source.SecureGroups.length; i++) {
                this.SecureGroups[i] = new String(source.SecureGroups[i]);
            }
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamArraySimple(map, prefix + "SecureGroups.", this.SecureGroups);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);

    }
}

