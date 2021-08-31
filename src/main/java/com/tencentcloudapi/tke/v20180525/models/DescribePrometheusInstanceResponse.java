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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstanceResponse extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * COS bucket name
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * Data query address
    */
    @SerializedName("QueryAddress")
    @Expose
    private String QueryAddress;

    /**
    * The grafana related information in the instance
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Grafana")
    @Expose
    private PrometheusGrafanaInfo Grafana;

    /**
    * Custom alertmanager
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AlertManagerUrl")
    @Expose
    private String AlertManagerUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get COS bucket name 
     * @return COSBucket COS bucket name
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set COS bucket name
     * @param COSBucket COS bucket name
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get Data query address 
     * @return QueryAddress Data query address
     */
    public String getQueryAddress() {
        return this.QueryAddress;
    }

    /**
     * Set Data query address
     * @param QueryAddress Data query address
     */
    public void setQueryAddress(String QueryAddress) {
        this.QueryAddress = QueryAddress;
    }

    /**
     * Get The grafana related information in the instance
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Grafana The grafana related information in the instance
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public PrometheusGrafanaInfo getGrafana() {
        return this.Grafana;
    }

    /**
     * Set The grafana related information in the instance
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Grafana The grafana related information in the instance
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setGrafana(PrometheusGrafanaInfo Grafana) {
        this.Grafana = Grafana;
    }

    /**
     * Get Custom alertmanager
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return AlertManagerUrl Custom alertmanager
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAlertManagerUrl() {
        return this.AlertManagerUrl;
    }

    /**
     * Set Custom alertmanager
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param AlertManagerUrl Custom alertmanager
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAlertManagerUrl(String AlertManagerUrl) {
        this.AlertManagerUrl = AlertManagerUrl;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrometheusInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceResponse(DescribePrometheusInstanceResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.QueryAddress != null) {
            this.QueryAddress = new String(source.QueryAddress);
        }
        if (source.Grafana != null) {
            this.Grafana = new PrometheusGrafanaInfo(source.Grafana);
        }
        if (source.AlertManagerUrl != null) {
            this.AlertManagerUrl = new String(source.AlertManagerUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "QueryAddress", this.QueryAddress);
        this.setParamObj(map, prefix + "Grafana.", this.Grafana);
        this.setParamSimple(map, prefix + "AlertManagerUrl", this.AlertManagerUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

