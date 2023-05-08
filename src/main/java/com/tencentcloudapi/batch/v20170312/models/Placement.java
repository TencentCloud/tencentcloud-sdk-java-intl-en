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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel{

    /**
    * ID of the availability zone where the instance resides. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/35071) API and obtain the ID in the returned `Zone` field.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` returned by [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1). If this is left empty, the default project is used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * IPs of the hosts to create CVMs
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * The ID of the CDH to which the instance belongs, only used as an output parameter.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
     * Get ID of the availability zone where the instance resides. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/35071) API and obtain the ID in the returned `Zone` field. 
     * @return Zone ID of the availability zone where the instance resides. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/35071) API and obtain the ID in the returned `Zone` field.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set ID of the availability zone where the instance resides. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/35071) API and obtain the ID in the returned `Zone` field.
     * @param Zone ID of the availability zone where the instance resides. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/35071) API and obtain the ID in the returned `Zone` field.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` returned by [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1). If this is left empty, the default project is used. 
     * @return ProjectId ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` returned by [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1). If this is left empty, the default project is used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` returned by [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1). If this is left empty, the default project is used.
     * @param ProjectId ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` returned by [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1). If this is left empty, the default project is used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs. 
     * @return HostIds ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     * @param HostIds ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get IPs of the hosts to create CVMs 
     * @return HostIps IPs of the hosts to create CVMs
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set IPs of the hosts to create CVMs
     * @param HostIps IPs of the hosts to create CVMs
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Get The ID of the CDH to which the instance belongs, only used as an output parameter. 
     * @return HostId The ID of the CDH to which the instance belongs, only used as an output parameter.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set The ID of the CDH to which the instance belongs, only used as an output parameter.
     * @param HostId The ID of the CDH to which the instance belongs, only used as an output parameter.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    public Placement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Placement(Placement source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "HostId", this.HostId);

    }
}

