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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResourceConfiguration extends AbstractModel {

    /**
    * VPC-related information configuration. This parameter can be used to specify the VPC ID and subnet ID.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Specifications of all node resources.
    */
    @SerializedName("AllNodeResourceSpec")
    @Expose
    private AllNodeResourceSpec AllNodeResourceSpec;

    /**
    * In single-AZ deployment, ZoneTag can be left empty. In dual-AZ deployment mode, select master for the first AZ's ZoneTag and standby for the second. In three-AZ deployment mode, select master for the first AZ's ZoneTag, standby for the second, and third-party for the third. Valid values:
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
    */
    @SerializedName("ZoneTag")
    @Expose
    private String ZoneTag;

    /**
     * Get VPC-related information configuration. This parameter can be used to specify the VPC ID and subnet ID. 
     * @return VirtualPrivateCloud VPC-related information configuration. This parameter can be used to specify the VPC ID and subnet ID.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set VPC-related information configuration. This parameter can be used to specify the VPC ID and subnet ID.
     * @param VirtualPrivateCloud VPC-related information configuration. This parameter can be used to specify the VPC ID and subnet ID.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance. 
     * @return Placement Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.
     * @param Placement Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Specifications of all node resources. 
     * @return AllNodeResourceSpec Specifications of all node resources.
     */
    public AllNodeResourceSpec getAllNodeResourceSpec() {
        return this.AllNodeResourceSpec;
    }

    /**
     * Set Specifications of all node resources.
     * @param AllNodeResourceSpec Specifications of all node resources.
     */
    public void setAllNodeResourceSpec(AllNodeResourceSpec AllNodeResourceSpec) {
        this.AllNodeResourceSpec = AllNodeResourceSpec;
    }

    /**
     * Get In single-AZ deployment, ZoneTag can be left empty. In dual-AZ deployment mode, select master for the first AZ's ZoneTag and standby for the second. In three-AZ deployment mode, select master for the first AZ's ZoneTag, standby for the second, and third-party for the third. Valid values:
  <li>master</li>
  <li>standby</li>
  <li>third-party</li> 
     * @return ZoneTag In single-AZ deployment, ZoneTag can be left empty. In dual-AZ deployment mode, select master for the first AZ's ZoneTag and standby for the second. In three-AZ deployment mode, select master for the first AZ's ZoneTag, standby for the second, and third-party for the third. Valid values:
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
     */
    public String getZoneTag() {
        return this.ZoneTag;
    }

    /**
     * Set In single-AZ deployment, ZoneTag can be left empty. In dual-AZ deployment mode, select master for the first AZ's ZoneTag and standby for the second. In three-AZ deployment mode, select master for the first AZ's ZoneTag, standby for the second, and third-party for the third. Valid values:
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
     * @param ZoneTag In single-AZ deployment, ZoneTag can be left empty. In dual-AZ deployment mode, select master for the first AZ's ZoneTag and standby for the second. In three-AZ deployment mode, select master for the first AZ's ZoneTag, standby for the second, and third-party for the third. Valid values:
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
     */
    public void setZoneTag(String ZoneTag) {
        this.ZoneTag = ZoneTag;
    }

    public ZoneResourceConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResourceConfiguration(ZoneResourceConfiguration source) {
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.AllNodeResourceSpec != null) {
            this.AllNodeResourceSpec = new AllNodeResourceSpec(source.AllNodeResourceSpec);
        }
        if (source.ZoneTag != null) {
            this.ZoneTag = new String(source.ZoneTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "AllNodeResourceSpec.", this.AllNodeResourceSpec);
        this.setParamSimple(map, prefix + "ZoneTag", this.ZoneTag);

    }
}

