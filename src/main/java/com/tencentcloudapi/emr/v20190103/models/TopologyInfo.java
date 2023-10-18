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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyInfo extends AbstractModel {

    /**
    * AZ ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Subnet information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetInfoList")
    @Expose
    private SubnetInfo [] SubnetInfoList;

    /**
    * Node information
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeInfoList")
    @Expose
    private ShortNodeInfo [] NodeInfoList;

    /**
     * Get AZ ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ZoneId AZ ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ZoneId AZ ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Zone AZ information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Zone AZ information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Subnet information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SubnetInfoList Subnet information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SubnetInfo [] getSubnetInfoList() {
        return this.SubnetInfoList;
    }

    /**
     * Set Subnet information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SubnetInfoList Subnet information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSubnetInfoList(SubnetInfo [] SubnetInfoList) {
        this.SubnetInfoList = SubnetInfoList;
    }

    /**
     * Get Node information
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NodeInfoList Node information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ShortNodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set Node information
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NodeInfoList Node information
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNodeInfoList(ShortNodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    public TopologyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyInfo(TopologyInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetInfoList != null) {
            this.SubnetInfoList = new SubnetInfo[source.SubnetInfoList.length];
            for (int i = 0; i < source.SubnetInfoList.length; i++) {
                this.SubnetInfoList[i] = new SubnetInfo(source.SubnetInfoList[i]);
            }
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new ShortNodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new ShortNodeInfo(source.NodeInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SubnetInfoList.", this.SubnetInfoList);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);

    }
}

