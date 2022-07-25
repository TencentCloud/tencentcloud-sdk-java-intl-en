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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrometheusMultiTenantInstancePostPayModeRequest extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Data retention period in days. Valid values: 15, 30, 45.
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance tag
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * The Grafana instance to be associated
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Data retention period in days. Valid values: 15, 30, 45. 
     * @return DataRetentionTime Data retention period in days. Valid values: 15, 30, 45.
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set Data retention period in days. Valid values: 15, 30, 45.
     * @param DataRetentionTime Data retention period in days. Valid values: 15, 30, 45.
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance tag 
     * @return TagSpecification Instance tag
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Instance tag
     * @param TagSpecification Instance tag
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get The Grafana instance to be associated 
     * @return GrafanaInstanceId The Grafana instance to be associated
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set The Grafana instance to be associated
     * @param GrafanaInstanceId The Grafana instance to be associated
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    public CreatePrometheusMultiTenantInstancePostPayModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrometheusMultiTenantInstancePostPayModeRequest(CreatePrometheusMultiTenantInstancePostPayModeRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.GrafanaInstanceId != null) {
            this.GrafanaInstanceId = new String(source.GrafanaInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "GrafanaInstanceId", this.GrafanaInstanceId);

    }
}

